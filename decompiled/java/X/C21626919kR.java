package X;

/* JADX INFO: renamed from: X.19kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21626919kR {
    public static final C21626719kP LIZ;
    public static final C21626719kP LIZIZ;
    public static final C21626719kP LIZJ;
    public static final C21626719kP LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19kP] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.19kP] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19kP] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.19kP] */
    static {
        final InterfaceC21627219kU interfaceC21627219kU = null;
        final boolean z = false;
        LIZ = new AbstractC21626619kO(interfaceC21627219kU, z) { // from class: X.19kP
            public final boolean LIZIZ;

            @Override // X.AbstractC21626619kO
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = z;
            }
        };
        final boolean z2 = true;
        LIZIZ = new AbstractC21626619kO(interfaceC21627219kU, z2) { // from class: X.19kP
            public final boolean LIZIZ;

            @Override // X.AbstractC21626619kO
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = z2;
            }
        };
        final C21627119kT c21627119kT = new InterfaceC21627219kU() { // from class: X.19kT
            /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
            @Override // X.InterfaceC21627219kU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZ(int r5, java.lang.CharSequence r6) {
                /*
                    r4 = this;
                    r3 = 2
                    r2 = 0
                    r0 = 2
                L3:
                    if (r2 >= r5) goto L21
                    if (r0 != r3) goto L21
                    char r0 = r6.charAt(r2)
                    byte r1 = java.lang.Character.getDirectionality(r0)
                    r0 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r0) goto L1d
                    if (r1 == r3) goto L1d
                    switch(r1) {
                        case 14: goto L1f;
                        case 15: goto L1f;
                        case 16: goto L1d;
                        case 17: goto L1d;
                        default: goto L19;
                    }
                L19:
                    r0 = 2
                L1a:
                    int r2 = r2 + 1
                    goto L3
                L1d:
                    r0 = 0
                    goto L1a
                L1f:
                    r0 = 1
                    goto L1a
                L21:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21627119kT.LIZ(int, java.lang.CharSequence):int");
            }
        };
        LIZJ = new AbstractC21626619kO(c21627119kT, z) { // from class: X.19kP
            public final boolean LIZIZ;

            @Override // X.AbstractC21626619kO
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = z;
            }
        };
        LIZLLL = new AbstractC21626619kO(c21627119kT, z2) { // from class: X.19kP
            public final boolean LIZIZ;

            @Override // X.AbstractC21626619kO
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = z2;
            }
        };
        final C21627019kS c21627019kS = new InterfaceC21627219kU() { // from class: X.19kS
            @Override // X.InterfaceC21627219kU
            public final int LIZ(int i, CharSequence charSequence) {
                boolean z3 = false;
                for (int i2 = 0; i2 < i; i2++) {
                    byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                    if (directionality != 0) {
                        if (directionality == 1 || directionality == 2) {
                            return 0;
                        }
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    return 1;
                }
                return 2;
            }
        };
        new AbstractC21626619kO(c21627019kS, z) { // from class: X.19kP
            public final boolean LIZIZ;

            @Override // X.AbstractC21626619kO
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = z;
            }
        };
    }
}
