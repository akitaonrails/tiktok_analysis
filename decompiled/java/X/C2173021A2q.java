package X;

/* JADX INFO: renamed from: X.1A2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173021A2q implements InterfaceC1891370zJn {
    public final AbstractC21673619ry LL;

    public C2173021A2q(AbstractC21673619ry abstractC21673619ry) {
        this.LL = abstractC21673619ry;
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        this.LL.notifyItemRangeInserted(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        this.LL.notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        this.LL.notifyItemRangeRemoved(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        this.LL.notifyItemRangeChanged(i, i2, obj);
    }
}
