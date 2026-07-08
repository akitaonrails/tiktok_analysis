package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753590vjZ {
    public final Context LIZ;
    public C1753580vjY LIZIZ;
    public BPEAHandler LIZJ;
    public C1754560vl8 LIZLLL;
    public boolean LJ;
    public InterfaceC1753620vjc LJFF;
    public float LJI;
    public float LJII;
    public long LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public PDPBenefitItem LJIIJJI;
    public Function0<? extends View> LJIIJ = AFwS215S0000000_26.get$arr$(421);
    public Function0<Unit> LJIIL = AFwS215S0000000_26.get$arr$(419);
    public final AFwS215S0000000_26 LJIILIIL = AFwS215S0000000_26.get$arr$(420);
    public final ARunnableS126S0100000_26 LJIILJJIL = new ARunnableS126S0100000_26(this, 85);
    public final C1753600vja LJIILL = new C1149100g0a() { // from class: X.0vja
        @Override // X.C1149100g0a, X.InterfaceC21462418z0
        public final void LIZ() {
            this.LL.LJIILIIL.getClass();
        }

        @Override // X.C1149100g0a, X.InterfaceC21462418z0
        public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
            abstractC21463118z7.LJJII(this);
            this.LL.LJIIL.invoke();
            this.LL.LIZ(false);
            this.LL.LJ = false;
        }
    };

    public final boolean LIZIZ() {
        C1753580vjY c1753580vjY = this.LIZIZ;
        return c1753580vjY != null && true == c1753580vjY.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vja] */
    public C1753590vjZ(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(boolean z) {
        ViewGroup viewGroup;
        try {
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1392);
            if (z) {
                if (LIZIZ()) {
                    BPEAHandler bPEAHandler = this.LIZJ;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacks(this.LJIILJJIL);
                    }
                    if (this.LJ) {
                        ViewGroup viewGroup2 = this.LJIIIZ;
                        if (viewGroup2 != null && this.LIZLLL != null) {
                            C19748612Om.LIZIZ(viewGroup2);
                        }
                    } else {
                        C1753580vjY c1753580vjY = this.LIZIZ;
                        if (c1753580vjY != null) {
                            c1753580vjY.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS103S0100000_3((Object) awS570S0100000_26, 96)).start();
                        }
                    }
                }
            } else {
                if (this.LJ && (viewGroup = this.LJIIIZ) != null && this.LIZLLL != null) {
                    C19748612Om.LIZIZ(viewGroup);
                }
                awS570S0100000_26.invoke();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
