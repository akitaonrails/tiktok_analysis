package X;

import Y.ARunnableS104S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518070KTl implements InterfaceC516080KLu {
    public static final C518070KTl LIZ = new C518070KTl();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC516080KLu
    public final void LIZLLL(EnumC1782240wTm enumC1782240wTm, Context context) {
    }

    @Override // X.InterfaceC516080KLu
    public final void triggerInAppMessages(Activity activity, String str) {
    }

    public static C518080KTm LJFF() {
        C518080KTm c518080KTm = new C518080KTm();
        c518080KTm.LIZ = 0;
        c518080KTm.LIZIZ = 9901001;
        c518080KTm.LIZJ = 9901001;
        String strLJII = LJII(null);
        c518080KTm.LJFF = strLJII;
        c518080KTm.LIZLLL = "9901001";
        c518080KTm.LJ = strLJII;
        c518080KTm.LJIIIIZZ = 9901001;
        c518080KTm.LJIIIZ = c518080KTm.LJFF;
        c518080KTm.LJII = C0KPI.FAILED;
        return c518080KTm;
    }

    public static C0KQW LJI(C518070KTl c518070KTl) {
        c518070KTl.getClass();
        return new C0KQW(EnumC1792020wjY.INTEGRATION_ERROR, LJII(null));
    }

    public static String LJII(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("subscription_iap_not_available(9901001): ");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "subscription_iap_not_available(9901001)";
    }

    public static void LJIIIIZZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS104S0100000_4(function0, 74));
        }
    }

    @Override // X.InterfaceC516080KLu
    public final void LJ(C0KL0 c0kl0) {
        LJIIIIZZ(new AwS551S0100000_7(c0kl0, LJFF(), 635));
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZ(C1617170sBX c1617170sBX, InterfaceC1791300wiO interfaceC1791300wiO) {
        LJIIIIZZ(new AwS408S0200000_7(interfaceC1791300wiO, new C518150KTt(false, new HashMap(), LJI(this)), 48));
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZJ(InterfaceC518100KTo interfaceC518100KTo, C1789940wgC c1789940wgC) {
        List<String> list = c1789940wgC.LIZJ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (String str : list) {
            linkedHashMap.put(str, new C517630KRt(C0KM0.PRE_CHECK_FAILURE, LJI(LIZ), C13BV.INSTANCE, str, "", null, LJII(null), 32));
        }
        LJIIIIZZ(new AwS408S0200000_7(interfaceC518100KTo, (InterfaceC518100KTo) linkedHashMap, (Map<String, C517630KRt>) 49));
    }

    @Override // X.InterfaceC516080KLu
    public final void LIZIZ(Activity activity, C1789970wgF c1789970wgF, InterfaceC518120KTq interfaceC518120KTq) {
        LJIIIIZZ(new AwS408S0200000_7(interfaceC518120KTq, new C0KPG(C0KPI.FAILED, null, null, LJI(this), LJFF(), 6), 47));
    }
}
