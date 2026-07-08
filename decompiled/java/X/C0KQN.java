package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPaymentGpHelperUrlSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQN extends C0KQI {
    public static final String LIZ = LivePcsPaymentGpHelperUrlSetting.INSTANCE.getValue();
    public static final int LIZIZ = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Ah0();

    @Override // X.C0KQI
    public final void LIZJ(C0KQK c0kqk) {
        String strLJIJI;
        Context context = c0kqk.LIZ;
        if (context == null) {
            C766270U4b.LIZLLL(2131851936);
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        int i = c0kqk.LIZJ;
        int i2 = c0kqk.LIZLLL;
        if (i != -202 && i != 208) {
            switch (i) {
                case 203:
                    if (i2 != 3) {
                        if (i2 != 2032) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    String strLJIJI2 = C497740JfY.LJIJI(2131851586);
                                    if (C1796440wqg.LIZIZ()) {
                                        strLJIJI = C497740JfY.LJIJI(2131844617);
                                    } else {
                                        strLJIJI = C497740JfY.LJIJI(2131844618);
                                    }
                                    LIZ(c0kqk, strLJIJI2, strLJIJI, "", new C0KQU());
                                } else {
                                    LIZ(c0kqk, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131836594), "", new C0KQU());
                                }
                            } else {
                                LIZ(c0kqk, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131836586), "", new C0KQU());
                            }
                        } else {
                            LIZ(c0kqk, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131855021), "", new C0KQU());
                        }
                    } else {
                        LIZ(c0kqk, C497740JfY.LJIJI(2131851586), C497740JfY.LJIJI(2131836595), C497740JfY.LJIJI(2131836587), new C2198771B3r(this, context));
                    }
                    break;
                case 204:
                case 205:
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855772));
                    break;
                case 206:
                    C0KQI.LJI(null, 2131843724);
                    break;
                default:
                    C0KQI.LJI(null, 2131843092);
                    break;
            }
            return;
        }
        C0KQI.LJI(null, 2131844619);
    }

    @Override // X.C0KQI
    public final boolean LIZLLL(C0KQK c0kqk) {
        if (c0kqk.LIZIZ == 2) {
            return true;
        }
        return false;
    }
}
