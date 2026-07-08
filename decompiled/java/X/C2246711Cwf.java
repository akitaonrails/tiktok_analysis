package X;

/* JADX INFO: renamed from: X.1Cwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246711Cwf {
    public C2246721Cwg LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Cwg] */
    public C2246711Cwf(final InterfaceC2246731Cwh interfaceC2246731Cwh) {
        this.LIZ = new InterfaceC1142480fpu() { // from class: X.1Cwg
            @Override // X.InterfaceC1142480fpu
            public final void LJII() {
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    interfaceC2246731Cwh2.LJII();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void onStart() {
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    interfaceC2246731Cwh2.onStart();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void onStop() {
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    interfaceC2246731Cwh2.onStop();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZ(C1141460foG c1141460foG) {
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    interfaceC2246731Cwh2.onEnd();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZJ(C1141050fnb c1141050fnb) {
                boolean z;
                int i;
                String str;
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    if (c1141050fnb != null) {
                        z = true;
                        i = c1141050fnb.LIZ;
                        str = c1141050fnb.LIZIZ;
                    } else {
                        z = false;
                        i = -1;
                        str = null;
                    }
                    interfaceC2246731Cwh2.LIZ(i, str, z);
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZIZ(float f, float f2, float f3, float f4) {
                InterfaceC2246731Cwh interfaceC2246731Cwh2 = interfaceC2246731Cwh;
                if (interfaceC2246731Cwh2 != null) {
                    interfaceC2246731Cwh2.LIZIZ(f, f2, f3, f4);
                }
            }
        };
    }
}
