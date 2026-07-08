package X;

/* JADX INFO: renamed from: X.0pZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516420pZ2 implements InterfaceC1690500u5o {
    public final float LL;
    public final float LLILLJJLI;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1516420pZ2)) {
            return false;
        }
        C1516420pZ2 c1516420pZ2 = (C1516420pZ2) obj;
        return Float.compare(this.LL, c1516420pZ2.LL) == 0 && Float.compare(this.LLILLJJLI, c1516420pZ2.LLILLJJLI) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DensityImpl(density=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fontScale=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LL) * 31) + Float.floatToIntBits(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    public C1516420pZ2(float f, float f2) {
        this.LL = f;
        this.LLILLJJLI = f2;
    }
}
