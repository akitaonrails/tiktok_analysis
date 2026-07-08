package X;

import Y.ARunnableS120S0100000_20;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.core.JSProxy;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298340jtI extends AbstractC1298500jtY implements InterfaceC1298350jtJ {
    public final ArrayList<C1298220jt6> LJIJJLI;
    public final WeakReference<s> LJIL;
    public final WeakReference<JSProxy> LJJ;
    public boolean LJJI;

    @Override // X.AbstractC1298500jtY
    public final void LJIIIIZZ() {
        if (!this.LJFF) {
            LynxLog.e("Lynx.IntersectionObserver", "Lynx intersectionObserverHandler failed since rootView not draw");
        } else if (LJFF() == null) {
            LynxLog.e("Lynx.IntersectionObserver", "Lynx intersectionObserverHandler failed since rootView is null");
        } else {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 221));
        }
    }

    public final s LJIIL() {
        return this.LJIL.get();
    }

    public final C1298220jt6 LJIILIIL(int i) {
        for (C1298220jt6 c1298220jt6 : this.LJIJJLI) {
            if (c1298220jt6.LIZ == i) {
                return c1298220jt6;
            }
        }
        return null;
    }

    public C1298340jtI(s sVar, JSProxy jSProxy) {
        super("Lynx.IntersectionObserver");
        TraceEvent.LIZIZ("LynxIntersectionObserverManager initialized");
        this.LJIL = new WeakReference<>(sVar);
        this.LIZ = new WeakReference<>(sVar.LLJILJILJ);
        this.LJJ = new WeakReference<>(jSProxy);
        this.LJIJJLI = new ArrayList<>();
        this.LJJI = false;
        TraceEvent.LJII("LynxIntersectionObserverManager initialized");
    }

    @Override // X.InterfaceC1298350jtJ
    public final void LIZ(EnumC1298360jtK enumC1298360jtK, C1298730jtv c1298730jtv) {
        if (this.LJIJJLI.size() == 0) {
            return;
        }
        if (enumC1298360jtK != EnumC1298360jtK.kLynxEventTypeLayoutEvent) {
            if (enumC1298360jtK == EnumC1298360jtK.kLynxEventTypeCustomEvent) {
                String str = c1298730jtv.LIZIZ;
                if (!"scroll".equals(str) && !"scrolltoupper".equals(str) && !"scrolltolower".equals(str)) {
                    return;
                }
            } else {
                return;
            }
        }
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 221));
    }
}
