package X;

/* JADX INFO: renamed from: X.14dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308814dK implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
            case 3:
                dispose$3(this);
                break;
        }
    }

    public static final void dispose$0(C20308814dK c20308814dK) {
        ((C20041613bK) c20308814dK.l0).LIZ.invoke();
    }

    public static final void dispose$1(C20308814dK c20308814dK) {
        ((InterfaceC20041313bH) c20308814dK.l0).LJI();
    }

    public static final void dispose$2(C20308814dK c20308814dK) {
        ((C20044113bj) c20308814dK.l0).LIZLLL = null;
    }

    public static final void dispose$3(C20308814dK c20308814dK) {
        ((C20043613be) c20308814dK.l0).LIZLLL = null;
    }

    public C20308814dK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
