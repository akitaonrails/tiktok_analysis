package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.backstrace.EcSearchBackNode;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0QUG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUG implements InterfaceC668770QLb {
    public static boolean LIZJ;
    public static final C0QUG LIZ = new C0QUG();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(357));

    public static Map LJ() {
        return (Map) LIZLLL.getValue();
    }

    public static String LIZLLL() {
        String strLJII;
        C0QUF c0quf = (C0QUF) LJ().get(String.valueOf(LIZIZ.get()));
        return (c0quf == null || (strLJII = c0quf.LJII()) == null) ? "" : strLJII;
    }

    @Override // X.InterfaceC668770QLb
    public final void LIZIZ(boolean z) {
        LIZJ = z;
    }

    @Override // X.InterfaceC668770QLb
    public final boolean LIZJ(InterfaceC669060QMe interfaceC669060QMe) {
        InterfaceC669060QMe interfaceC669060QMe2 = null;
        if (interfaceC669060QMe instanceof C0QUK) {
            interfaceC669060QMe2 = interfaceC669060QMe;
        }
        boolean zLIZJ = false;
        if (interfaceC669060QMe2 != null) {
            C0QUK c0quk = (C0QUK) interfaceC669060QMe;
            C0QUF c0quf = (C0QUF) LJ().get(c0quk.f1());
            if (c0quf != null) {
                zLIZJ = c0quf.LIZJ(c0quk);
                C0QUF c0quf2 = (C0QUF) LJ().get(c0quk.f1());
                if (c0quf2 != null && c0quf2.size() == 0) {
                    LJ().remove(c0quk.f1());
                    LIZIZ.decrementAndGet();
                }
            }
        }
        return zLIZJ;
    }

    @Override // X.InterfaceC668770QLb
    public final EcSearchBackNode LIZ(boolean z, C0QUI c0qui) {
        int iIncrementAndGet;
        if (z) {
            iIncrementAndGet = LIZIZ.incrementAndGet();
        } else {
            iIncrementAndGet = LIZIZ.get();
        }
        String strValueOf = String.valueOf(iIncrementAndGet);
        EcSearchBackNode ecSearchBackNode = new EcSearchBackNode(c0qui, strValueOf, AFwS241S0000000_10.get$arr$(392));
        C0QUF c0quh = (C0QUF) LJ().get(strValueOf);
        if (c0quh == null) {
            c0quh = new C0QUH();
            LJ().put(strValueOf, c0quh);
        }
        c0quh.LJI(ecSearchBackNode);
        return ecSearchBackNode;
    }
}
