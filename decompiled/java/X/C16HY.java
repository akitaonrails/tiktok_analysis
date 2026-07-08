package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.16HY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HY implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$2(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$3(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    public C16HY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
        C16AR c16ar = (C16AR) c16hy.l0;
        if (c16ar.LJIILL) {
            Iterator<C21647019ng> it2 = c16ar.LIZIZ().iterator();
            while (it2.hasNext()) {
                it2.next().LJI(true);
            }
            return;
        }
        c16ar.LJIILJJIL = C16AU.NO_ACTION;
    }

    public static final void LIZ$1(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C16AR) c16hy.l0).dismiss();
    }

    public static final void LIZ$2(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C16AR) c16hy.l0).dismiss();
    }

    public static final void LIZ$3(C16HY c16hy, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((C16AZ) c16hy.l0).dismiss();
    }
}
