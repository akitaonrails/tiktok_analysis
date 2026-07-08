package Y;

import X.C1253770ijP;
import X.C1253930ijf;
import X.C1259870itF;
import X.C1C7U;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public class ACallableS5S1101100_19 implements Callable {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

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

    public static final Object call$0(ACallableS5S1101100_19 aCallableS5S1101100_19) {
        C1C7U.LIZ("AwemePagerAssem@c9ce.stopTabStayTime$1");
        C1253770ijP c1253770ijP = new C1253770ijP();
        c1253770ijP.LIZLLL = aCallableS5S1101100_19.s0;
        c1253770ijP.LJJLIIIJ = String.valueOf(aCallableS5S1101100_19.j3);
        c1253770ijP.LJIIZILJ = ((AwemePagerAssem) aCallableS5S1101100_19.l1).zq(aCallableS5S1101100_19.i2);
        c1253770ijP.LJIILJJIL();
        Context context = ((AwemePagerAssem) aCallableS5S1101100_19.l1).getContext();
        String strZq = ((AwemePagerAssem) aCallableS5S1101100_19.l1).zq(aCallableS5S1101100_19.i2);
        if (strZq == null) {
            strZq = "";
        }
        C1253930ijf.LJIJJLI(aCallableS5S1101100_19.i2, aCallableS5S1101100_19.j3, context, strZq);
        C1C7U.LIZIZ("AwemePagerAssem@c9ce.stopTabStayTime$1");
        return null;
    }

    public static final Object call$1(ACallableS5S1101100_19 aCallableS5S1101100_19) {
        String strLIZ;
        int i;
        int i2;
        I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2 = (I18nAbsProfileFragmentV2) aCallableS5S1101100_19.l1;
        String str = aCallableS5S1101100_19.s0;
        long j = aCallableS5S1101100_19.j3;
        int i3 = aCallableS5S1101100_19.i2;
        i18nAbsProfileFragmentV2.getClass();
        C1C7U.LIZ("I18nAbsProfileFragmentV2@c918.stopTabStayTime$1L");
        C1253770ijP c1253770ijP = new C1253770ijP();
        c1253770ijP.LIZLLL = str;
        c1253770ijP.LJJLIIIJ = String.valueOf(j);
        String strLIZ2 = "";
        if (i3 != i18nAbsProfileFragmentV2.LLIZ || (i2 = i18nAbsProfileFragmentV2.LLIZLLLIL) != 24) {
            strLIZ = "";
        } else {
            try {
                strLIZ = C1259870itF.LIZ(i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZ = "";
            }
        }
        c1253770ijP.LJIIZILJ = strLIZ;
        c1253770ijP.LJIILJJIL();
        Context context = i18nAbsProfileFragmentV2.getContext();
        if (i3 == i18nAbsProfileFragmentV2.LLIZ && (i = i18nAbsProfileFragmentV2.LLIZLLLIL) == 24) {
            try {
                strLIZ2 = C1259870itF.LIZ(i);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1253930ijf.LJIJJLI(i3, j, context, strLIZ2);
        C1C7U.LIZIZ("I18nAbsProfileFragmentV2@c918.stopTabStayTime$1L");
        return null;
    }

    public ACallableS5S1101100_19(Object obj, String str, long j, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.j3 = j;
        this.i2 = i;
    }
}
