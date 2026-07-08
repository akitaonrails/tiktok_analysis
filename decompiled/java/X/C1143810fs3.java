package X;

import java.io.File;

/* JADX INFO: renamed from: X.0fs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143810fs3 {
    public static final String LIZ(String str) {
        File fileLJII = C1143780fs0.LJII("tiktok_live_interaction_normal_3", str);
        if (fileLJII != null && fileLJII.exists() && fileLJII.length() > 0) {
            return fileLJII.getAbsolutePath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktok_live_interaction_normal_3");
        sbLIZ.append('/');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
