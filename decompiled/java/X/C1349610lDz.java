package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.HolidayModel;

/* JADX INFO: renamed from: X.0lDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349610lDz {
    public static void LIZ() {
        String str;
        C0O50.LIZ.getClass();
        if (C0O50.LIZIZ) {
            return;
        }
        C722700SWm.LIZ.getClass();
        HolidayModel holidayModelLIZ = C722700SWm.LIZ();
        if (holidayModelLIZ != null) {
            C0O50.LIZ();
            if (C123100dR.LIZ(holidayModelLIZ.backgroundUrl) && (str = holidayModelLIZ.backgroundUrl) != null) {
                try {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LIZLLL("comment_holiday_helper");
                    c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0lHK
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            C0O52.LIZIZ = bitmap;
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            String string;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("preload backgorund failed");
                            if (th != null) {
                                string = th.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ.append(string);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C0O50.LIZ.getClass();
        C0O50.LIZIZ = true;
    }
}
