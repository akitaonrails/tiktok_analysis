package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19937312zb {
    public final Map<AnonymousClass1301, Boolean> LIZ = new ConcurrentHashMap();
    public int LIZIZ = 0;
    public final Stack<C19938812zq> LIZJ = new Stack<>();
    public final Map<AnonymousClass1301, C19938812zq> LIZLLL = new HashMap();

    public final C19938812zq LIZ(AnonymousClass1301 anonymousClass1301) {
        C19938812zq c19938812zqPop;
        boolean z;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        C19938812zq c19938812zq = new C19938812zq(anonymousClass1301, i);
        this.LIZJ.push(c19938812zq);
        ((HashMap) this.LIZLLL).put(anonymousClass1301, c19938812zq);
        for (C19939112zt c19939112zt : anonymousClass1301.LJIJJ()) {
            if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                C19938812zq c19938812zq2 = (C19938812zq) ((HashMap) this.LIZLLL).get(c19939112zt.LJIJJLI());
                if (c19938812zq2 == null) {
                    c19938812zq.LIZJ = Math.min(c19938812zq.LIZJ, LIZ(c19939112zt.LJIJJLI()).LIZJ);
                } else if (c19938812zq2.LIZLLL == null) {
                    c19938812zq.LIZJ = Math.min(c19938812zq.LIZJ, c19938812zq2.LIZJ);
                }
            }
        }
        if (c19938812zq.LIZIZ == c19938812zq.LIZJ) {
            C19938912zr c19938912zr = new C19938912zr();
            do {
                c19938812zqPop = this.LIZJ.pop();
                c19938812zqPop.LIZLLL = c19938912zr;
                ((ArrayList) c19938912zr.LIZ).add(c19938812zqPop.LIZ);
            } while (c19938812zqPop != c19938812zq);
            Iterator it2 = ((ArrayList) c19938912zr.LIZ).iterator();
            loop2: while (true) {
                if (it2.hasNext()) {
                    AnonymousClass1301 anonymousClass13012 = (AnonymousClass1301) it2.next();
                    z = true;
                    if (!anonymousClass13012.LLILLJJLI.getExtensionRangeList().isEmpty()) {
                        break;
                    }
                    for (C19939112zt c19939112zt2 : anonymousClass13012.LJIJJ()) {
                        if (c19939112zt2.LJJIJ()) {
                            break loop2;
                        }
                        if (c19939112zt2.LJIJJ() == EnumC19937812zg.MESSAGE) {
                            C19938912zr c19938912zr2 = ((C19938812zq) ((HashMap) this.LIZLLL).get(c19939112zt2.LJIJJLI())).LIZLLL;
                            if (c19938912zr2 != c19938912zr && c19938912zr2.LIZIZ) {
                                break loop2;
                            }
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            }
            c19938912zr.LIZIZ = z;
            Iterator it3 = ((ArrayList) c19938912zr.LIZ).iterator();
            while (it3.hasNext()) {
                ((ConcurrentHashMap) this.LIZ).put(it3.next(), Boolean.valueOf(c19938912zr.LIZIZ));
            }
        }
        return c19938812zq;
    }
}
