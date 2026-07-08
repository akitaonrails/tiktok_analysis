package X;

import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620870sHV implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public static final void run$0(C1620870sHV c1620870sHV) {
        try {
            ((Function0) c1620870sHV.l0).invoke();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$1(C1620870sHV c1620870sHV) {
        DialogC1389620mGW dialogC1389620mGW;
        PaidContentVideoPanel paidContentVideoPanel = (PaidContentVideoPanel) c1620870sHV.l0;
        paidContentVideoPanel.T2 = false;
        WeakReference<DialogC1389620mGW> weakReference = paidContentVideoPanel.f409p2;
        if (weakReference != null && (dialogC1389620mGW = weakReference.get()) != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    public static final void run$2(C1620870sHV c1620870sHV) {
        if (((EnumC1586970rOp) c1620870sHV.l0) == EnumC1586970rOp.COLD_START && C296340BjU.LIZ()) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new Runnable() { // from class: X.0rOO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RedDotRepository@a90a.request$requestTask$1$3$1");
                    try {
                        RedDotPolling.LL.LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RedDotRepository@a90a.request$requestTask$1$3$1");
                }
            });
        }
    }

    public static final void run$3(C1620870sHV c1620870sHV) {
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1400330mXn c1400330mXn = C1400330mXn.LIZ;
        C19EG c19eg = (C19EG) c1620870sHV.l0;
        String strBQ2 = Hox.LLJILJIL.LIZ(c19eg).BQ2();
        c1400330mXn.getClass();
        String strLJIIJ = C1400330mXn.LJIIJ(c19eg, strBQ2, null);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIIZZ(strLJIIJ, "friends");
    }

    public C1620870sHV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
