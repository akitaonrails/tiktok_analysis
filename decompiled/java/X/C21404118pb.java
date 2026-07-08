package X;

/* JADX INFO: renamed from: X.18pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21404118pb implements InterfaceC21404018pa<C21404118pb> {
    public final int LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;

    @Override // X.InterfaceC21404018pa
    public final C21404118pb getResult() {
        return this;
    }

    public C21404118pb(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC21404018pa
    public final boolean LIZ(CharSequence charSequence, int i, int i2, C21403818pY c21403818pY) {
        int i3 = this.LIZ;
        if (i <= i3 && i3 < i2) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            return false;
        }
        if (i2 > i3) {
            return false;
        }
        return true;
    }
}
