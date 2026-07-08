package X;

/* JADX INFO: renamed from: X.0e8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077160e8Y extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1077160e8Y c1077160e8Y) {
        ((C1035340d36) c1077160e8Y.l0).LJ(false);
        c1077160e8Y.LJ();
    }

    public static final void LIZIZ$1(C1077160e8Y c1077160e8Y) {
        if (!((C1024570clj) c1077160e8Y.l0).LIZIZ()) {
            ((C1024570clj) c1077160e8Y.l0).LIZJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077160e8Y(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
