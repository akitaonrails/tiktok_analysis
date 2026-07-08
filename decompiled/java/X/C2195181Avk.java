package X;

/* JADX INFO: renamed from: X.1Avk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195181Avk extends C2196441Axm {
    public static final int $stable = 8;
    public EnumC2196421Axk LLIZ;
    public boolean LLIZLLLIL;

    public final C2195181Avk copy(EnumC2196421Axk enumC2196421Axk, boolean z) {
        return new C2195181Avk(enumC2196421Axk, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2195181Avk)) {
            return false;
        }
        C2195181Avk c2195181Avk = (C2195181Avk) obj;
        return this.LLIZ == c2195181Avk.LLIZ && this.LLIZLLLIL == c2195181Avk.LLIZLLLIL;
    }

    public int hashCode() {
        return (this.LLIZ.hashCode() * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchemaHandlerStageInfo(stage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", needLogin=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getNeedLogin() {
        return this.LLIZLLLIL;
    }

    @Override // X.C2196441Axm
    public EnumC2196421Axk getStage() {
        return this.LLIZ;
    }

    public final void setNeedLogin(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.C2196441Axm
    public void setStage(EnumC2196421Axk enumC2196421Axk) {
        this.LLIZ = enumC2196421Axk;
    }

    public C2195181Avk(EnumC2196421Axk enumC2196421Axk, boolean z) {
        super(enumC2196421Axk, true, 0, "", 0L, 0L);
        this.LLIZ = enumC2196421Axk;
        this.LLIZLLLIL = z;
    }
}
