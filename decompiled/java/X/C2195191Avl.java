package X;

/* JADX INFO: renamed from: X.1Avl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195191Avl extends C2196441Axm {
    public static final int $stable = 8;
    public EnumC2196421Axk LLIZ;
    public boolean LLIZLLLIL;

    public final C2195191Avl copy(EnumC2196421Axk enumC2196421Axk, boolean z) {
        return new C2195191Avl(enumC2196421Axk, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2195191Avl)) {
            return false;
        }
        C2195191Avl c2195191Avl = (C2195191Avl) obj;
        return this.LLIZ == c2195191Avl.LLIZ && this.LLIZLLLIL == c2195191Avl.LLIZLLLIL;
    }

    public int hashCode() {
        return (this.LLIZ.hashCode() * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetaLoadStageInfo(stage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasMetaCache=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMetaCache() {
        return this.LLIZLLLIL;
    }

    @Override // X.C2196441Axm
    public EnumC2196421Axk getStage() {
        return this.LLIZ;
    }

    public final void setHasMetaCache(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.C2196441Axm
    public void setStage(EnumC2196421Axk enumC2196421Axk) {
        this.LLIZ = enumC2196421Axk;
    }

    public C2195191Avl(EnumC2196421Axk enumC2196421Axk, boolean z) {
        super(enumC2196421Axk, true, 0, "", 0L, 0L);
        this.LLIZ = enumC2196421Axk;
        this.LLIZLLLIL = z;
    }
}
