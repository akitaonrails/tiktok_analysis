package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723640uxG implements InterfaceC736910SvR<InterfaceC1722860uw0> {
    public static final C01GW<InterfaceC332260D0u<AbstractC1623806Xk<C1722950uw9>>> LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(315));
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(316));
    public final C1723650uxH LLILLJJLI = new InterfaceC1722860uw0() { // from class: X.0uxH
        @Override // X.InterfaceC1722860uw0
        public final boolean LJJJJLI() {
            return !((Keva) this.LL.LL.getValue()).getBoolean("KEY_WELCOME_PAGE_DID_SHOW", false);
        }

        @Override // X.InterfaceC1722860uw0
        public final void LLLLLL() {
            ((Keva) this.LL.LL.getValue()).storeBoolean("KEY_WELCOME_PAGE_DID_SHOW", true);
        }

        @Override // X.InterfaceC1722860uw0
        public final boolean LJLJJL(String str) {
            if (!C123100dR.LIZ(str)) {
                return true;
            }
            return !((Keva) this.LL.LL.getValue()).getStringSet("KEY_NOTI_CARDS_DID_SHOW", new LinkedHashSet()).contains(str);
        }

        @Override // X.InterfaceC1722860uw0
        public final void g(String str) {
            if (str != null) {
                C1723640uxG c1723640uxG = this.LL;
                Set<String> stringSet = ((Keva) c1723640uxG.LL.getValue()).getStringSet("KEY_NOTI_CARDS_DID_SHOW", new LinkedHashSet());
                stringSet.add(str);
                ((Keva) c1723640uxG.LL.getValue()).storeStringSet("KEY_NOTI_CARDS_DID_SHOW", stringSet);
            }
        }

        @Override // X.InterfaceC1722860uw0
        public final Object LLIIIZ(AbstractC1623806Xk<C1722950uw9> abstractC1623806Xk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            Object objEmit = C1723640uxG.LLILLL.getValue().emit(abstractC1623806Xk, interfaceC1364105Vn);
            if (objEmit == C099R.LJFF()) {
                return objEmit;
            }
            return Unit.LIZ;
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
