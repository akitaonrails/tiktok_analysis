package Y;

import X.AbstractC2126608Uu;
import X.C1C7U;
import X.C307420C3g;
import X.C313080CPa;
import X.InterfaceC313090CPb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public class ACallableS94S0101000_4 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS94S0101000_4 aCallableS94S0101000_4) throws InterruptedException {
        String str;
        C1C7U.LIZ("PopupSettingManager@65ac.requestPopupConfig$1");
        try {
            InterfaceC313090CPb interfaceC313090CPb = C313080CPa.LLILZIL;
            C313080CPa c313080CPa = (C313080CPa) aCallableS94S0101000_4.l0;
            int i = aCallableS94S0101000_4.i1;
            c313080CPa.getClass();
            if (i != 0) {
                if (i == 2) {
                    str = "3";
                } else {
                    str = "2";
                }
            } else {
                str = "1";
            }
            PopupResponse popupResponse = interfaceC313090CPb.LIZ(str).get();
            C1C7U.LIZIZ("PopupSettingManager@65ac.requestPopupConfig$1");
            return popupResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$1(ACallableS94S0101000_4 aCallableS94S0101000_4) {
        int i = aCallableS94S0101000_4.i1;
        Runnable runnable = (Runnable) aCallableS94S0101000_4.l0;
        C1C7U.LIZ("Feed0VVManager@569f.submitToThread$1L");
        C307420C3g.LIZIZ(i, "full_feed_thread_switch_cost_1");
        runnable.run();
        C1C7U.LIZIZ("Feed0VVManager@569f.submitToThread$1L");
        return null;
    }

    public ACallableS94S0101000_4(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
