package X;

/* JADX INFO: renamed from: X.19mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21640819mg implements InterfaceC1844880y6o {
    public final float LIZ;
    public final float LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC1844880y6o
    public final Float LIZ() {
        return Float.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC1844880y6o
    public final Boolean W5() {
        return Boolean.valueOf(this.LIZJ);
    }

    @Override // X.InterfaceC1844880y6o
    public final float getProgress() {
        float f = this.LIZ;
        float f2 = this.LIZLLL;
        return (f - f2) / (this.LJ - f2);
    }

    @Override // X.InterfaceC1844880y6o
    public final float getValue() {
        return this.LIZ;
    }

    public C21640819mg(float f, float f2, boolean z, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = z;
        this.LIZLLL = f3;
        this.LJ = f4;
    }
}
