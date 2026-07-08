package X;

/* JADX INFO: renamed from: X.12Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774312Yj implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C19774312Yj c19774312Yj) {
    }

    public static final void onCanceled$1(C19774312Yj c19774312Yj) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    public C19774312Yj(InterfaceC19772112Xn interfaceC19772112Xn, int i) {
        this.$t = i;
        this.l0 = interfaceC19772112Xn;
    }

    public static final void LIZ$0(C19774312Yj c19774312Yj, C0HWO... c0hwoArr) {
        C19771812Xk.LIZ(c0hwoArr, (InterfaceC19772112Xn) c19774312Yj.l0);
    }

    public static final void LIZ$1(C19774312Yj c19774312Yj, C0HWO... c0hwoArr) {
        C19771812Xk.LIZ(c0hwoArr, (InterfaceC19772112Xn) c19774312Yj.l0);
    }
}
