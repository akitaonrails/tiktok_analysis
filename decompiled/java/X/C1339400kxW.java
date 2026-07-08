package X;

import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339400kxW extends AbstractC1539010q9T {
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
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1339400kxW(int i) {
        this.$t = i;
    }

    public static final void LJJJLL$0(C1339400kxW c1339400kxW, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1324190kYz.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
            ((C1537910q7h) interfaceC1531560pxS).LJII(C1697810uHb.LJIILJJIL(new C1339200kxC(74)));
        }
    }

    public static final void LJJJLL$1(C1339400kxW c1339400kxW, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1324200kZ0.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
            ((C1537910q7h) interfaceC1531560pxS).LJII(C1697810uHb.LJIILJJIL(new C1339200kxC(75)));
        }
    }

    public static final void LJJJLL$2(C1339400kxW c1339400kxW, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1339200kxC(true, 90));
            c1537910q7h.LJII(arrayList);
        }
    }

    public static final void LJJJLL$3(C1339400kxW c1339400kxW, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0kci
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
                
                    r2 = new X.C1326520kck(null);
                 */
                @Override // com.lynx.tasm.LynxViewClient
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIILL(X.C1299240juk r12) {
                    /*
                        Method dump skipped, instruction units count: 279
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1326500kci.LJIILL(X.0juk):void");
                }
            });
        }
    }
}
