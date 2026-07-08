package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1532320pyg<Input, Output> implements InterfaceC1532520pz0<C1532530pz1, C1532340pyi> {
    public final Class<Input> LIZ;
    public final Class<Output> LIZIZ;

    public boolean LIZJ(C1532300pye c1532300pye) {
        return true;
    }

    @Override // X.InterfaceC1532520pz0
    public boolean LJFF() {
        return true;
    }

    public int LJI() {
        return 4;
    }

    public abstract void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1);

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getName());
        sbLIZ.append(", ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", returnType: ");
        sbLIZ.append(this.LIZIZ.getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1532320pyg(Class<Input> cls, Class<Output> cls2) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }

    @Override // X.InterfaceC1532520pz0
    public final void LJ(Function1 function1, Object obj) {
        C1532530pz1 c1532530pz1 = (C1532530pz1) obj;
        C1532340pyi c1532340pyi = c1532530pz1.LIZLLL;
        AbstractC1532350pyj<?> abstractC1532350pyj = c1532340pyi.LIZ;
        if ((abstractC1532350pyj instanceof AbstractC1532350pyj) && abstractC1532350pyj != null) {
            LJII(c1532530pz1.LIZ, c1532530pz1.LIZIZ, c1532530pz1.LIZJ, abstractC1532350pyj, c1532340pyi, function1);
        } else {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "ResourceProcessor", "process", "resource ref is null", null, null, 48);
            function1.invoke(new C1532340pyi(null, c1532530pz1.LIZLLL.LIZIZ));
        }
    }
}
