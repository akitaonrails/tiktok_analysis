package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388500mEi {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(MediaModel mediaModel) {
        String strLJFF;
        if (C2471909mP.LJJIIZI(mediaModel.LJFF())) {
            strLJFF = C09N5.LIZ(C0CHQ.LIZ, UriProtector.parse(mediaModel.LJFF()));
        } else {
            strLJFF = mediaModel.LJFF();
        }
        if (C570490MZb.LJ(strLJFF)) {
            return strLJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append(File.separator);
        sbLIZ.append(mediaModel.relativePath);
        sbLIZ.append(mediaModel.fileName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C570490MZb.LJ(strLIZIZ)) {
            return strLIZIZ;
        }
        String str = mediaModel.relativePath;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void LIZIZ(MediaModel mediaModel) {
        String strValueOf;
        if (Math.max(mediaModel.width, mediaModel.height) <= C342380DbY.LIZ().uploadPhotoMaxEdge) {
            return;
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AI_CHAT, String.valueOf(C461720I8s.LIZJ()), true).getPath();
        String strLIZ = LIZ(mediaModel);
        if (strLIZ.length() > 0) {
            strValueOf = C08HM.LIZJ(strLIZ);
        } else {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append(strValueOf);
        sbLIZ.append(".jpg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair pairLIZ = C2473209mc.LIZ(C0CHQ.LIZ, strLIZ, strLIZIZ, C342380DbY.LIZ().uploadPhotoMaxEdge, new C2473609mg(C342380DbY.LIZ().uploadPhotoMaxEdge));
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        mediaModel.LJIILL(strLIZIZ);
        mediaModel.width = iIntValue;
        mediaModel.height = iIntValue2;
        mediaModel.fileSize = C2286708xd.LJIIL(strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Resize from ");
        sbLIZ2.append(strLIZ);
        sbLIZ2.append(" to ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", new resolution: ");
        sbLIZ2.append(mediaModel.width);
        sbLIZ2.append(" x ");
        sbLIZ2.append(mediaModel.height);
        sbLIZ2.append(", file size: ");
        sbLIZ2.append(mediaModel.fileSize);
        C21290818Tq.LIZ("AiChatMediaModelHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
