package X;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.0Wpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835430Wpx<E> extends AbstractC1322040kVW<E> {
    public final /* synthetic */ C835410Wpv<E> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C835430Wpx(C835410Wpv c835410Wpv) {
        super(c835410Wpv.LLILLL);
        this.LLILZ = c835410Wpv;
    }

    @Override // X.AbstractC1322040kVW
    public final E LIZ(int i) {
        return (E) this.LLILZ.LLILLJJLI[i];
    }

    @Override // X.AbstractC1322040kVW
    public final void LIZIZ(int i) {
        this.LLILZ.LIZJ(i);
    }
}
