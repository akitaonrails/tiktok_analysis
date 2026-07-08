package X;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552930LmN implements InterfaceC551900Lki<Serializable> {
    public final Serializable LIZ;
    public final /* synthetic */ C552890LmJ<InterfaceC551900Lki<Object>, Serializable, Object, Object> LIZIZ;
    public final /* synthetic */ Function1<Object, Unit> LIZJ;

    @Override // X.InterfaceC551900Lki
    public final void LIZJ(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1) {
    }

    @Override // X.InterfaceC551900Lki
    public final Serializable getConfig() {
        return this.LIZ;
    }

    @Override // X.InterfaceC551900Lki
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC551900Lki
    public final Object LIZIZ(AbstractC23140094w abstractC23140094w) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC551900Lki
    public final void log(String str) {
        C201955140j.LIZLLL(C0LX3.LIZIZ, this.LIZIZ.LIZLLL.getNodeName(), str);
    }

    public C552930LmN(C552890LmJ<InterfaceC551900Lki<Object>, Serializable, Object, Object> c552890LmJ, Function1<Object, Unit> function1) {
        this.LIZIZ = c552890LmJ;
        this.LIZJ = function1;
        this.LIZ = c552890LmJ.LIZIZ;
    }

    @Override // X.InterfaceC551900Lki
    public final void LIZLLL(int i, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZJ.invoke(new C555530LqZ(i, j, interfaceC1406105et));
    }
}
