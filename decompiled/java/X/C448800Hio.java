package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.io.File;

/* JADX INFO: renamed from: X.0Hio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448800Hio {
    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AIGCPictureHandler.pathService$delegate.getValue().LJ);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append("AIGC");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2286708xd.LJIIIIZZ(strLIZIZ, false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
