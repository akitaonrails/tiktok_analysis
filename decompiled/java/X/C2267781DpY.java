package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267781DpY extends AbstractC998040c4w<AbstractC986700bme, AbstractC2267831Dpd> {
    public final View LIZLLL;
    public final View LJ;

    public final int LJ() {
        return Intrinsics.LJFF(this.LIZIZ, C2267841Dpe.LIZ) ? 8 : 0;
    }

    @Override // X.AbstractC998040c4w
    public final void LIZIZ(AbstractC2267831Dpd abstractC2267831Dpd, AbstractC2267831Dpd abstractC2267831Dpd2) {
        Object c098200Yq;
        try {
            if (abstractC2267831Dpd2 instanceof C2267841Dpe) {
                C786410Ut5.LJLLLLLL(8, this.LIZLLL);
                C786410Ut5.LJLLLLLL(8, this.LJ);
            } else if (abstractC2267831Dpd2 instanceof C2267861Dpg) {
                C786410Ut5.LJLLLLLL(0, this.LIZLLL);
                C786410Ut5.LJLLLLLL(8, this.LJ);
            } else if (abstractC2267831Dpd2 instanceof C2267851Dpf) {
                C786410Ut5.LJLLLLLL(8, this.LIZLLL);
                C786410Ut5.LJLLLLLL(0, this.LJ);
            } else {
                throw new C1954807lC();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("AnchorInfoVisibilityController", "set visibility failed", thM5exceptionOrNullimpl);
        }
    }

    public C2267781DpY(View view, View view2, final AwS559S0100000_15 awS559S0100000_15) {
        super(C2267861Dpg.LIZ, new InterfaceC998030c4v<AbstractC986700bme, AbstractC2267831Dpd>(awS559S0100000_15) { // from class: X.1Dpa
            public final Function0<Long> LIZ;
            public AbstractC986700bme LIZIZ = C986710bmf.LIZIZ;

            @Override // X.InterfaceC998030c4v
            public final /* bridge */ /* synthetic */ AbstractC986700bme getState() {
                return this.LIZIZ;
            }

            {
                this.LIZ = awS559S0100000_15;
            }

            @Override // X.InterfaceC998030c4v
            public final boolean LIZ(AbstractC986700bme abstractC986700bme) {
                return C998020c4u.LIZ(this, abstractC986700bme);
            }

            @Override // X.InterfaceC998030c4v
            public final void LIZIZ(AbstractC986700bme abstractC986700bme) {
                this.LIZIZ = abstractC986700bme;
            }

            @Override // X.InterfaceC998030c4v
            public final AbstractC2267831Dpd apply(AbstractC2267831Dpd abstractC2267831Dpd) {
                if (!(abstractC2267831Dpd instanceof C2267841Dpe)) {
                    if (this.LIZIZ instanceof C986690bmd) {
                        if (this.LIZ.invoke().longValue() != ((C986690bmd) this.LIZIZ).LIZIZ) {
                            return C2267841Dpe.LIZ;
                        }
                        return C2267851Dpf.LIZ;
                    }
                    return C2267861Dpg.LIZ;
                }
                return abstractC2267831Dpd;
            }
        });
        this.LIZLLL = view;
        this.LJ = view2;
    }
}
