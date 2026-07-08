package X;

/* JADX INFO: renamed from: X.1BW2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BW2 extends AbstractC1541650qDj<C1ET2> {
    public final C1BW3 LLIZ = new C1ET3() { // from class: X.1BW3
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJJJ(int i, int i2, boolean z, boolean z2) {
            if (z || z2) {
                getExtendable().requestDisallowInterceptTouchEvent(false);
            }
            super.LJJJJ(i, i2, z, z2);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LIZLLL("onOverScrolled", this.LLIZ);
    }
}
