package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05NX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NX extends AbstractC1622390sJx implements InterfaceC1625550sP3 {
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(null);
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJIJJLI() {
        this.LLILLL.setValue(C05NV.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJ() {
        this.LLILLL.setValue(C05NV.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLJJLI.setValue(null);
        this.LLILLL.setValue(C05NV.LIZ);
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJIIIIZZ(Effect effect) {
        C05NO c05no = new C05NO(0);
        if (effect == null) {
            return;
        }
        LJJIIJ(effect, c05no);
    }

    @Override // X.InterfaceC1625550sP3
    public final void onSuccess(Effect effect) {
        C05NV c05nv = C05NV.LIZ;
        if (effect == null) {
            return;
        }
        LJJIIJ(effect, c05nv);
    }

    public C05NX(InterfaceC497601wk interfaceC497601wk, InterfaceC346201Wa interfaceC346201Wa) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C05NV.LIZ);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05NW(interfaceC346201Wa, this, null), 3);
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJII(int i, Effect effect) {
        C05NO c05no = new C05NO(i);
        if (effect == null) {
            return;
        }
        LJJIIJ(effect, c05no);
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJIILLIIL(Effect effect, ExceptionResult exceptionResult) {
        C05NU c05nu = C05NU.LIZ;
        if (effect == null) {
            return;
        }
        LJJIIJ(effect, c05nu);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        this.LLILLL.setValue(C05NV.LIZ);
    }

    public final void LJJIIJ(Effect effect, C05NT c05nt) {
        String resourceId;
        Effect effect2 = (Effect) this.LLILLJJLI.getValue();
        if (effect2 != null) {
            resourceId = effect2.getResourceId();
        } else {
            resourceId = null;
        }
        if (Intrinsics.LJFF(resourceId, effect.getResourceId())) {
            C05NT c05nt2 = (C05NT) this.LLILLL.getValue();
            C2252321DDq c2252321DDq = this.LLILLL;
            if ((c05nt2 instanceof C05NO) && (c05nt instanceof C05NO)) {
                c05nt = new C05NO(Math.max(((C05NO) c05nt).LIZ, ((C05NO) c05nt2).LIZ));
            }
            c2252321DDq.setValue(c05nt);
        }
    }
}
