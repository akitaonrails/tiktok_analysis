package X;

import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.touchpoint.api.model.IncentivePreload;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.IncentivePreloadViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895300zQ8 extends AbstractC1895130zPr {
    public static final C1895300zQ8 LL = new C1895300zQ8();
    public static boolean LLILLJJLI;
    public static boolean LLILLL;
    public static IncentivePreload LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;

    public static void LJIIJ() {
        Boolean bool;
        if (!LLILZIL || LLILZ == null) {
            return;
        }
        try {
            LL.getClass();
            if (!LLILLJJLI) {
                C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
                boolean zBooleanValue = false;
                boolean zLIZJ = c1893370zN1 != null ? c1893370zN1.LIZJ() : false;
                IncentivePreload incentivePreload = LLILZ;
                if (incentivePreload != null && (bool = incentivePreload.enablePreload) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                if (zLIZJ && zBooleanValue) {
                    C1541950qED.LIZJ.LJIJ();
                    LLILLJJLI = true;
                }
            }
            LJIIJJI();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIIJJI() {
        Boolean bool;
        if (LLILLL) {
            return;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        C1893370zN1 c1893370zN1 = (C1893370zN1) c1619720sFe.LIZ(1003);
        boolean zBooleanValue = false;
        boolean zLIZLLL = c1893370zN1 != null ? c1893370zN1.LIZLLL() : false;
        IncentivePreload incentivePreload = LLILZ;
        if (incentivePreload != null && (bool = incentivePreload.enablePreload) != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (zLIZLLL && zBooleanValue) {
            LLILLL = true;
            C1893370zN1 c1893370zN12 = (C1893370zN1) c1619720sFe.LIZ(1003);
            C1064620doK c1064620doK = new C1064620doK(c1893370zN12 != null ? c1893370zN12.LJIIZILJ() : true, true);
            if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(c1064620doK, 90));
            } else {
                C1893590zNN.LIZ = System.currentTimeMillis();
                C1064720doU.LIZJ(c1064620doK);
            }
        }
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(IncentivePreloadViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895350zQD(), null, null, null).getValue();
    }

    public final void init() {
        if (LLILZLL) {
            return;
        }
        LLILZLL = true;
        LJIIIZ().vQ2(new C2217381BqS() { // from class: X.0zQA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new C1895310zQ9());
        LJIIIZ().vQ2(new C2217381BqS() { // from class: X.0zQC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1895330zQB());
    }
}
