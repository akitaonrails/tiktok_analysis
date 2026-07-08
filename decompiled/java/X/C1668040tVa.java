package X;

/* JADX INFO: renamed from: X.0tVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668040tVa {
    public static final C1296870jqv LIZIZ;
    public static final C1296870jqv LIZJ;
    public static final C1296870jqv LIZLLL;
    public static final C1296870jqv LJ;
    public static final C1296870jqv LJFF;
    public static final C1296870jqv LJI;
    public static final C1296870jqv LJII;
    public static final C1296870jqv LJIIIIZZ;
    public static final C1296870jqv LJIIIZ;
    public static final /* synthetic */ C1668040tVa LIZ = new C1668040tVa();
    public static final C1296880jqw LJIIJ = new C1296880jqw(-1.0f);
    public static final C1296880jqw LJIIJJI = new C1296880jqw(0.0f);
    public static final C1296880jqw LJIIL = new C1296880jqw(1.0f);
    public static final C1296860jqu LJIILIIL = new C1296860jqu(-1.0f);
    public static final C1296860jqu LJIILJJIL = new C1296860jqu(0.0f);
    public static final C1296860jqu LJIILL = new C1296860jqu(1.0f);

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0jqv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0jqv] */
    static {
        final float f = -1.0f;
        LIZIZ = new InterfaceC1668050tVb(f, f) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f;
                this.LIZJ = f;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f2;
                float f3 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f2 = this.LIZIZ;
                } else {
                    f2 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f3 * (f2 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        final float f2 = 0.0f;
        LIZJ = new InterfaceC1668050tVb(f2, f) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f2;
                this.LIZJ = f;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f3 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f3 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        final float f3 = 1.0f;
        LIZLLL = new InterfaceC1668050tVb(f3, f) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f3;
                this.LIZJ = f;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJ = new InterfaceC1668050tVb(f, f2) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f;
                this.LIZJ = f2;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJFF = new InterfaceC1668050tVb(f2, f2) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f2;
                this.LIZJ = f2;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJI = new InterfaceC1668050tVb(f3, f2) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f3;
                this.LIZJ = f2;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJII = new InterfaceC1668050tVb(f, f3) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f;
                this.LIZJ = f3;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJIIIIZZ = new InterfaceC1668050tVb(f2, f3) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f2;
                this.LIZJ = f3;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
        LJIIIZ = new InterfaceC1668050tVb(f3, f3) { // from class: X.0jqv
            public final float LIZIZ;
            public final float LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296870jqv)) {
                    return false;
                }
                C1296870jqv c1296870jqv = (C1296870jqv) obj;
                return Float.compare(this.LIZIZ, c1296870jqv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296870jqv.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f3;
                this.LIZJ = f3;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                float f22;
                float f32 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f4 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                if (enumC1671200tag == EnumC1671200tag.Ltr) {
                    f22 = this.LIZIZ;
                } else {
                    f22 = (-1) * this.LIZIZ;
                }
                float f5 = 1;
                return (((long) Math.round(f32 * (f22 + f5))) << 32) | (((long) Math.round(f4 * (f5 + this.LIZJ))) & 4294967295L);
            }
        };
    }
}
