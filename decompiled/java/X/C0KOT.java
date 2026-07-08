package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubPaymentGpHelperUrlSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0KOT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KOT extends C0KOW {
    public static final String LIZ = LiveSubPaymentGpHelperUrlSetting.INSTANCE.getValue();
    public static final int LIZIZ = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Ah0();

    @Override // X.C0KOW
    public final void LIZJ(C0KOS c0kos) {
        String strLJIJI;
        Context context = c0kos.LIZ;
        if (context == null) {
            C766270U4b.LIZLLL(2131851936);
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        int i = c0kos.LIZJ;
        int i2 = c0kos.LIZLLL;
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
                                    LIZ(c0kos, strLJIJI2, strLJIJI, "", new C516670KOb());
                                } else {
                                    LIZ(c0kos, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131836594), "", new C516670KOb());
                                }
                            } else {
                                LIZ(c0kos, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131836586), "", new C516670KOb());
                            }
                        } else {
                            LIZ(c0kos, C497740JfY.LJIJI(2131836593), C497740JfY.LJIJI(2131855021), "", new C516670KOb());
                        }
                    } else {
                        LIZ(c0kos, C497740JfY.LJIJI(2131851586), C497740JfY.LJIJI(2131836595), C497740JfY.LJIJI(2131836587), new C2198751B3p(this, context));
                    }
                    break;
                case 204:
                case 205:
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843199));
                    break;
                case 206:
                    if (C500260Jjc.LJJIIZ(c0kos.LJIIIIZZ)) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c0kos.LIZ, UriProtector.parse(c0kos.LJIIIIZZ));
                    } else {
                        C500260Jjc.LJJLIIIJJIZ(new C0KOY(null, 2131843724));
                    }
                    break;
                default:
                    C500260Jjc.LJJLIIIJJIZ(new C0KOY(null, 2131843092));
                    break;
            }
            return;
        }
        C500260Jjc.LJJLIIIJJIZ(new C0KOY(null, 2131844619));
    }

    @Override // X.C0KOW
    public final boolean LIZLLL(C0KOS c0kos) {
        if (c0kos.LIZIZ == 1) {
            return true;
        }
        return false;
    }
}
