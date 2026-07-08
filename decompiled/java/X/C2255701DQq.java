package X;

/* JADX INFO: renamed from: X.1DQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255701DQq {
    public final float LIZ;
    public final InterfaceC1690500u5o LIZIZ;
    public final float LIZJ;

    public final C2255711DQr LIZ(float f) {
        double dLIZIZ = LIZIZ(f);
        double d = C2237521Chq.LIZ;
        double d2 = d - 1.0d;
        return new C2255711DQr(f, (float) (((double) (this.LIZ * this.LIZJ)) * Math.exp((d / d2) * dLIZIZ)), (long) (Math.exp(dLIZIZ / d2) * 1000.0d));
    }

    public final double LIZIZ(float f) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.LIZ * this.LIZJ)));
    }

    public C2255701DQq(float f, InterfaceC1690500u5o interfaceC1690500u5o) {
        this.LIZ = f;
        this.LIZIZ = interfaceC1690500u5o;
        float density = interfaceC1690500u5o.getDensity();
        float f2 = C2237521Chq.LIZ;
        this.LIZJ = density * 386.0878f * 160.0f * 0.84f;
    }
}
