package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.Response;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870860YEi {
    public final C871030YEz LIZ;
    public final C0YEM LIZIZ;

    public final void LIZ() {
        Iterator<InterfaceC864610Xvv> it2 = iterator();
        while (it2.hasNext()) {
            it2.next().LIZ().clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0YIO] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0YEs] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0YEz] */
    public C870860YEi(final C0YEM c0yem) {
        C0YF2 c0yf2;
        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config:");
        sbLIZ.append(c0yem.LJIIIZ().LJJIJIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "RequestManagerFactory", strLIZIZ, 4);
        ?? r3 = new ArrayList<InterfaceC864610Xvv>() { // from class: X.0YEz
            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final boolean add(Object obj) {
                if (obj == null) {
                    return false;
                }
                return super.add(obj);
            }
        };
        final ?? r1 = new C0YIM(c0yem) { // from class: X.0YIO
            public C0YIN LLJ;

            @Override // X.C0YIM
            public final String LJIIIIZZ() {
                return "IM-REQUEST-QUEUE-S";
            }

            public final synchronized void LJIJJ() {
                if (this.LLILZ.isEmpty()) {
                    C868780Y6i c868780Y6iLIZLLL2 = this.LLIZLLLIL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(LJII());
                    sbLIZ2.append("sendNextRequest, mQueue empty");
                    c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                if (this.LLJ != null) {
                    C868780Y6i c868780Y6iLIZLLL3 = this.LLIZLLLIL.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(LJII());
                    sbLIZ3.append("sendNextRequest, has waitingItem");
                    c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                C0YIN c0yinPeek = this.LLILZ.peek();
                if (c0yinPeek != null) {
                    if (c0yinPeek.LLJJI <= 0) {
                        c0yinPeek.LLJJI = SystemClock.uptimeMillis();
                    }
                    this.LLJ = c0yinPeek;
                    LJIILLIIL(c0yinPeek);
                    return;
                }
                C868780Y6i c868780Y6iLIZLLL4 = this.LLIZLLLIL.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(LJII());
                sbLIZ4.append("sendNextRequest, peeked item null");
                c868780Y6iLIZLLL4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
            }

            @Override // X.C0YIM
            public final void LJFF() {
                super.LJFF();
                this.LLJ = null;
            }

            @Override // X.C0YIM
            public final void LJIIJ(C0YIN c0yin) {
                if (c0yin == this.LLJ) {
                    this.LLJ = null;
                    LJIJJ();
                }
            }

            @Override // X.C0YIM
            public final void LJIIJJI(C0YIN c0yin) {
                C0YIN c0yinPeek;
                if (!this.LLILZ.contains(c0yin)) {
                    this.LLILZ.add(c0yin);
                    SystemClock.uptimeMillis();
                }
                if (!this.LLILZ.isEmpty() && (c0yinPeek = this.LLILZ.peek()) != null && c0yinPeek.LL == c0yin.LL) {
                    LJIJJ();
                }
            }

            @Override // X.C0YIM
            public final void LJIIL(C0YIN c0yin) {
                super.LJIIL(c0yin);
                if (c0yin == this.LLJ) {
                    LJIJI(c0yin);
                }
            }

            @Override // X.C0YIM
            public final void LJIILIIL(C0YIN c0yin) {
                super.LJIILIIL(c0yin);
                this.LLJ = null;
                LJIJJ();
            }

            public final void LJIJI(C0YIN c0yin) {
                if (this.LLILZ.contains(c0yin)) {
                    LJIIZILJ(103, c0yin);
                    LJIIZILJ(105, c0yin);
                    this.LLILZ.remove(c0yin);
                }
                this.LLJ = null;
                LJIJJ();
            }
        };
        r3.add(new C0YF2(r1) { // from class: X.0YEn
            @Override // X.InterfaceC864610Xvv
            public final boolean LIZIZ(C0YIN c0yin) {
                Integer numValueOf = Integer.valueOf(c0yin.LJI());
                if (numValueOf != null && numValueOf.intValue() == C0YMR.SEND_MESSAGE.getValue()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC864610Xvv
            public final boolean LIZJ(Response response) {
                Integer num = response.cmd;
                if (num != null && num.intValue() == C0YMR.SEND_MESSAGE.getValue()) {
                    return true;
                }
                return false;
            }
        });
        if (((HashSet) c0yem.LJIIIZ().LJJIJIL.LIZ).isEmpty()) {
            c0yf2 = null;
        } else {
            C0YF5 c0yf5 = new C0YF5(c0yem);
            c0yem.LJIIIZ().LJJIJIL.getClass();
            c0yem.LJIIIZ().LJJIJIL.getClass();
            final C0YEM c0yem2 = c0yf5.LIZ;
            final ?? r12 = new C0YIQ(c0yem2) { // from class: X.0YEs
                @Override // X.C0YIQ, X.C0YIM
                public final String LJII() {
                    return "ParallelCoreRequestManager";
                }

                @Override // X.C0YIQ, X.C0YIM
                public final String LJIIIIZZ() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("IM-REQUEST-QUEUE-P");
                    sbLIZ2.append("-Core");
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
            };
            c0yf2 = new C0YF2(r12) { // from class: X.0YEl
                @Override // X.InterfaceC864610Xvv
                public final boolean LIZIZ(C0YIN c0yin) {
                    return LIZLLL(Integer.valueOf(c0yin.LJI()));
                }

                @Override // X.InterfaceC864610Xvv
                public final boolean LIZJ(Response response) {
                    return LIZLLL(response.cmd);
                }

                public final boolean LIZLLL(Integer num) {
                    if (num == null) {
                        return false;
                    }
                    return ((HashSet) c0yem.LJIIIZ().LJJIJIL.LIZ).contains(num);
                }
            };
        }
        r3.add(c0yf2);
        final C0YIQ c0yiq = new C0YIQ(c0yem);
        r3.add(new C0YF2(c0yiq) { // from class: X.0YEv
            @Override // X.InterfaceC864610Xvv
            public final boolean LIZIZ(C0YIN c0yin) {
                return true;
            }

            @Override // X.InterfaceC864610Xvv
            public final boolean LIZJ(Response response) {
                return true;
            }
        });
        this.LIZ = r3;
        this.LIZIZ = c0yem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Response response, C1164204gy c1164204gy) {
        C1164204gy c1164204gy2 = c1164204gy;
        if (response == null) {
            this.LIZIZ.LIZLLL().LJIILL("receive response is null!");
            return;
        }
        if (c1164204gy == null) {
            c1164204gy2 = new Object() { // from class: X.04gy
                public final Map<Integer, Long> LIZ = new ConcurrentHashMap(20);

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TraceStruct{innerStorage=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append('}');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            };
        }
        for (InterfaceC864610Xvv interfaceC864610Xvv : this.LIZ) {
            if (interfaceC864610Xvv.LIZJ(response)) {
                interfaceC864610Xvv.LIZ().LIZ(response, c1164204gy2);
                return;
            }
        }
    }
}
