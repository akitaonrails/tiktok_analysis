package X;

/* JADX INFO: renamed from: X.0VkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806600VkY extends AbstractC806620Vka {
    public int LIZJ;
    public boolean LIZLLL;

    public C806600VkY() {
        super(EnumC587020N0q.FEED_CACHE.getEventName());
    }

    @Override // X.AbstractC806620Vka
    public final void LIZIZ() {
        LIZ(Integer.valueOf(this.LIZJ));
    }

    @Override // X.AbstractC806620Vka
    public final void LIZJ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        super.LIZJ();
    }

    public final void LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitCache = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = i;
    }
}
