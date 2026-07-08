package X;

import java.util.HashMap;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20106913lr implements InterfaceC19601711mZ {
    public final HashMap<Integer, InterfaceC386201em> LIZ = new HashMap<>();
    public final C01GW LIZIZ;

    @Override // X.InterfaceC19601711mZ
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZ() {
        this.LIZ.clear();
        C786410Ut5.v2().removeFrameCallback((ChoreographerFrameCallbackC20107013ls) this.LIZIZ.getValue());
    }

    public C20106913lr(InterfaceC386401eo interfaceC386401eo) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS431S0200000_30(this, interfaceC386401eo, 111));
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZIZ(InterfaceC386201em interfaceC386201em) {
        this.LIZ.remove(Integer.valueOf(interfaceC386201em.hashCode()));
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZLLL(InterfaceC386201em interfaceC386201em) {
        C786410Ut5.v2().postFrameCallback((ChoreographerFrameCallbackC20107013ls) this.LIZIZ.getValue());
        if (!this.LIZ.containsKey(Integer.valueOf(interfaceC386201em.hashCode()))) {
            this.LIZ.put(Integer.valueOf(interfaceC386201em.hashCode()), interfaceC386201em);
        }
    }
}
