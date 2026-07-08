package X;

import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BA6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BA6 {
    public static String LIZ(Resources resources) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(resources.getType()));
        sbLIZ.append(LIZJ(resources.getId(), resources.getVersion()));
        sbLIZ.append(".zip");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C2112608Pk.LJII(C2213981Bky.LIZIZ.getApplicationContext()));
        sbLIZ2.append("/im_resources/");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(str);
        sbLIZ.append("/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(long j, String str) {
        String strReplace;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_");
        if (str == null) {
            strReplace = "";
        } else {
            strReplace = str.replace(e3.d, "_");
        }
        sbLIZ.append(strReplace);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
