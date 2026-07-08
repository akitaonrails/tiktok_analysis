package X;

/* JADX INFO: renamed from: X.1DQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255691DQp implements InterfaceC1677930tlX {
    public final C2255701DQq LIZ;

    @Override // X.InterfaceC1677930tlX
    public final float LIZ() {
        return 0.0f;
    }

    public C2255691DQp(InterfaceC1690500u5o interfaceC1690500u5o) {
        this.LIZ = new C2255701DQq(C1677920tlW.LIZ, interfaceC1690500u5o);
    }

    @Override // X.InterfaceC1677930tlX
    public final long LJ(float f) {
        return ((long) (Math.exp(this.LIZ.LIZIZ(f) / (((double) C2237521Chq.LIZ) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // X.InterfaceC1677930tlX
    public final float LIZIZ(float f, float f2) {
        C2255701DQq c2255701DQq = this.LIZ;
        double dLIZIZ = c2255701DQq.LIZIZ(f2);
        double d = C2237521Chq.LIZ;
        return f + (((float) (((double) (c2255701DQq.LIZ * c2255701DQq.LIZJ)) * Math.exp((d / (d - 1.0d)) * dLIZIZ))) * Math.signum(f2));
    }

    @Override // X.InterfaceC1677930tlX
    public final float LIZJ(float f, long j) {
        float f2;
        long j2 = j / 1000000;
        C2255711DQr c2255711DQrLIZ = this.LIZ.LIZ(f);
        long j3 = c2255711DQrLIZ.LIZJ;
        if (j3 > 0) {
            f2 = j2 / j3;
        } else {
            f2 = 1.0f;
        }
        return (((C2255661DQm.LIZ(f2).LIZIZ * Math.signum(c2255711DQrLIZ.LIZ)) * c2255711DQrLIZ.LIZIZ) / c2255711DQrLIZ.LIZJ) * 1000.0f;
    }

    @Override // X.InterfaceC1677930tlX
    public final float LIZLLL(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        C2255711DQr c2255711DQrLIZ = this.LIZ.LIZ(f2);
        long j3 = c2255711DQrLIZ.LIZJ;
        if (j3 > 0) {
            f3 = j2 / j3;
        } else {
            f3 = 1.0f;
        }
        return f + (c2255711DQrLIZ.LIZIZ * Math.signum(c2255711DQrLIZ.LIZ) * C2255661DQm.LIZ(f3).LIZ);
    }
}
