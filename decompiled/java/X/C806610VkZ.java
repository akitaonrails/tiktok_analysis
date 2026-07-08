package X;

/* JADX INFO: renamed from: X.0VkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806610VkZ extends AbstractC806620Vka {
    public int LIZJ;
    public boolean LIZLLL;

    public C806610VkZ() {
        super(EnumC587020N0q.SKYLIGHT_CACHE.getEventName());
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
}
