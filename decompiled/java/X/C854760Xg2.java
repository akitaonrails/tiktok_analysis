package X;

/* JADX INFO: renamed from: X.0Xg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854760Xg2 implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C854760Xg2 c854760Xg2) {
    }

    public static final void LIZIZ$1(C854760Xg2 c854760Xg2) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
        }
    }

    public static final void LIZ$0(C854760Xg2 c854760Xg2) {
        C0XVU c0xvu = (C0XVU) c854760Xg2.l0;
        c0xvu.LJII.LIZIZ(c0xvu.LJFF, true, true, c0xvu.LJI);
    }

    public static final void LIZ$1(C854760Xg2 c854760Xg2) {
        C0XVU c0xvu = (C0XVU) c854760Xg2.l0;
        c0xvu.LJII.LIZIZ(c0xvu.LJFF, true, true, null);
    }

    public static final void LIZ$2(C854760Xg2 c854760Xg2) {
        ((C0XW2) c854760Xg2.l0).LIZ();
    }

    public static final void LIZIZ$2(C854760Xg2 c854760Xg2) {
        ((C0XW2) c854760Xg2.l0).LIZIZ();
    }

    public C854760Xg2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
