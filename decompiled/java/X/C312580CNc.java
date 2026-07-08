package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312580CNc {
    public static boolean LIZ(String str, boolean z) {
        int i;
        if (C311010CHb.LIZ()) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "direct_shoot");
        boolean zLIZ = C0CHQ.LIZ().getAccountService().LIZ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || z || !zLJFF || zLIZ || C522290Ke3.LIZIZ || (i = C522290Ke3.LIZJ) <= 10) {
            return false;
        }
        if (((Boolean) C286750BLt.LIZ.getValue()).booleanValue()) {
            if (C523640KgE.LIZIZ || !C523640KgE.LIZ) {
                return false;
            }
            return true;
        }
        if (!((Boolean) C0ARD.LIZ.getValue()).booleanValue()) {
            return false;
        }
        Keva keva = C312590CNd.LIZIZ.getValue().LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ten_min_plus_video_displayed_base_key_");
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return !keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }
}
