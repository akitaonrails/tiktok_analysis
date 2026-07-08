package X;

/* JADX INFO: renamed from: X.1Axh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196391Axh extends C2196441Axm {
    public static final int $stable = 8;
    public EnumC2196421Axk LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;

    public final C2196391Axh copy(EnumC2196421Axk enumC2196421Axk, boolean z, boolean z2, int i, int i2) {
        return new C2196391Axh(enumC2196421Axk, z, z2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2196391Axh)) {
            return false;
        }
        C2196391Axh c2196391Axh = (C2196391Axh) obj;
        return this.LLIZ == c2196391Axh.LLIZ && this.LLIZLLLIL == c2196391Axh.LLIZLLLIL && this.LLJ == c2196391Axh.LLJ && this.LLJI == c2196391Axh.LLJI && this.LLJIJIL == c2196391Axh.LLJIJIL;
    }

    public int hashCode() {
        return (((((((this.LLIZ.hashCode() * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI) * 31) + this.LLJIJIL;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebviewLoadStageInfo(stage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasResourceCache=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", hasRedirect=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", hitCacheCount=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", totalCacheCount=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getHitCacheRatio() {
        int i = this.LLJIJIL;
        if (i == 0) {
            return 0;
        }
        return (this.LLJI * 100) / i;
    }

    public final boolean getHasRedirect() {
        return this.LLJ;
    }

    public final boolean getHasResourceCache() {
        return this.LLIZLLLIL;
    }

    public final int getHitCacheCount() {
        return this.LLJI;
    }

    @Override // X.C2196441Axm
    public EnumC2196421Axk getStage() {
        return this.LLIZ;
    }

    public final int getTotalCacheCount() {
        return this.LLJIJIL;
    }

    public final void setHasRedirect(boolean z) {
        this.LLJ = z;
    }

    public final void setHasResourceCache(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setHitCacheCount(int i) {
        this.LLJI = i;
    }

    @Override // X.C2196441Axm
    public void setStage(EnumC2196421Axk enumC2196421Axk) {
        this.LLIZ = enumC2196421Axk;
    }

    public final void setTotalCacheCount(int i) {
        this.LLJIJIL = i;
    }

    public C2196391Axh(EnumC2196421Axk enumC2196421Axk, boolean z, boolean z2, int i, int i2) {
        super(enumC2196421Axk, true, 0, "", 0L, 0L);
        this.LLIZ = enumC2196421Axk;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = i;
        this.LLJIJIL = i2;
    }
}
