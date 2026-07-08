package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2237308pf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2241008qG c2241008qG = new C2241008qG();
                if (str == null) {
                    str = "null";
                }
                c2241008qG.LIZ.put("errorDesc", str);
                c2241008qG.LIZ.put("action", str2);
                C794240VDq.LIZJ("aweme_change_user_profile", c2241008qG.LJ());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
