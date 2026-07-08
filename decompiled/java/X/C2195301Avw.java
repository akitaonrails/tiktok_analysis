package X;

/* JADX INFO: renamed from: X.1Avw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195301Avw extends C2196441Axm {
    public static final int $stable = 8;
    public EnumC2196421Axk LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public final C2195301Avw copy(EnumC2196421Axk enumC2196421Axk, boolean z, boolean z2) {
        return new C2195301Avw(enumC2196421Axk, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2195301Avw)) {
            return false;
        }
        C2195301Avw c2195301Avw = (C2195301Avw) obj;
        return this.LLIZ == c2195301Avw.LLIZ && this.LLIZLLLIL == c2195301Avw.LLIZLLLIL && this.LLJ == c2195301Avw.LLJ;
    }

    public int hashCode() {
        return (((this.LLIZ.hashCode() * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainFrameLoadStageInfo(stage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasMainFramePreload=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", hasMainFrameSourceCache=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMainFramePreload() {
        return this.LLIZLLLIL;
    }

    public final boolean getHasMainFrameSourceCache() {
        return this.LLJ;
    }

    @Override // X.C2196441Axm
    public EnumC2196421Axk getStage() {
        return this.LLIZ;
    }

    public final void setHasMainFramePreload(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setHasMainFrameSourceCache(boolean z) {
        this.LLJ = z;
    }

    @Override // X.C2196441Axm
    public void setStage(EnumC2196421Axk enumC2196421Axk) {
        this.LLIZ = enumC2196421Axk;
    }

    public C2195301Avw(EnumC2196421Axk enumC2196421Axk, boolean z, boolean z2) {
        super(enumC2196421Axk, true, 0, "", 0L, 0L);
        this.LLIZ = enumC2196421Axk;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
    }
}
