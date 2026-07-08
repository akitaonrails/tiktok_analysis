package X;

import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.security.MessageDigest;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08uG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2265808uG {
    public static C1877407Wy LIZ(AbstractC1921407fo abstractC1921407fo) {
        String strLIZIZ;
        String str;
        List<FrameItem> allFrames;
        FrameItem frameItem;
        if (abstractC1921407fo instanceof C1921307fn) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mv:");
            sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LJLLJ(((C1921307fn) abstractC1921407fo).LIZ), ",", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (abstractC1921407fo instanceof C2275508vp) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("photo:");
            sbLIZ2.append(C13LP.LJJLIIIJ(C13LP.LJLLJ(((C2275508vp) abstractC1921407fo).LIZ), ",", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (abstractC1921407fo instanceof C1921207fm) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("origin:");
            C1921207fm c1921207fm = (C1921207fm) abstractC1921407fo;
            sbLIZ3.append(c1921207fm.LIZIZ);
            sbLIZ3.append(':');
            sbLIZ3.append(C13LP.LJJLIIIJ(C13LP.LJLLJ(c1921207fm.LIZ), ",", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (abstractC1921407fo instanceof C2265908uH) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("video:");
            C2265908uH c2265908uH = (C2265908uH) abstractC1921407fo;
            sbLIZ4.append(c2265908uH.LIZ);
            sbLIZ4.append(':');
            sbLIZ4.append(c2265908uH.LIZIZ);
            sbLIZ4.append(':');
            sbLIZ4.append(c2265908uH.LIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else if (abstractC1921407fo instanceof C2265708uF) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("record:");
            ExtractFramesModel extractFramesModel = ((C2265708uF) abstractC1921407fo).LIZ;
            if (extractFramesModel == null || (allFrames = extractFramesModel.getAllFrames()) == null || (frameItem = (FrameItem) C13LP.LJJLIIIJL(allFrames)) == null || (str = frameItem.path) == null) {
                str = "null";
            }
            sbLIZ5.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        } else if (abstractC1921407fo instanceof C2266008uI) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("layout:");
            C2266008uI c2266008uI = (C2266008uI) abstractC1921407fo;
            sbLIZ6.append(c2266008uI.LIZ);
            sbLIZ6.append(':');
            sbLIZ6.append(c2266008uI.LIZIZ);
            sbLIZ6.append(':');
            sbLIZ6.append(C13LP.LJJLIIIJ(c2266008uI.LJ, ",", null, null, 0, null, null, 62));
            sbLIZ6.append(':');
            sbLIZ6.append(C13LP.LJJLIIIJ(c2266008uI.LJFF, ",", null, null, 0, null, null, 62));
            sbLIZ6.append(':');
            sbLIZ6.append(c2266008uI.LJI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("unknown:");
            sbLIZ7.append(abstractC1921407fo.hashCode());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
        }
        return new C1877407Wy(C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(strLIZIZ.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(100)));
    }
}
