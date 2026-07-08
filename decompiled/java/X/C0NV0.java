package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0NV0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NV0 implements InterfaceC1381005aq {
    public final Function1<Float, Unit> LIZ;
    public final C0NV1 LIZIZ = new InterfaceC1380505al() { // from class: X.0NV1
        @Override // X.InterfaceC1380505al
        public final void LIZ(float f) {
            this.LIZ.LIZ.invoke(Float.valueOf(f));
        }
    };
    public final C594890NUx LIZJ = new C594890NUx();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NV1] */
    public C0NV0(AwS581S0100000_2 awS581S0100000_2) {
        this.LIZ = awS581S0100000_2;
    }

    @Override // X.InterfaceC1381005aq
    public final Object LIZ(EnumC1384205bM enumC1384205bM, C1380405ak c1380405ak, C1394305cz c1394305cz) {
        Object objLJ = C2296808zG.LJ(new C594910NUz(this, enumC1384205bM, c1380405ak, null), c1394305cz);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
