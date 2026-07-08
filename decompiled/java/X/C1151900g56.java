package X;

/* JADX INFO: renamed from: X.0g56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151900g56 extends AbstractC1539010q9T {
    public final int $t;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1151900g56(int i) {
        this.$t = i;
    }

    public static final void LJJJLL$0(C1151900g56 c1151900g56, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZJ("withMultiKitInitParamHandler");
        if (C1095670ecP.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJJIFFI = true;
        }
    }

    public static final void LJJJLL$1(C1151900g56 c1151900g56, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX) {
            ((C1537910q7h) interfaceC1531560pxS).LJIIIIZZ(new C1151550g4X(1));
        }
    }
}
