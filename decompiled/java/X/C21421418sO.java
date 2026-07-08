package X;

import android.text.Spanned;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21421418sO extends AbstractC21425218t0 {
    public final C21408418qI LIZ;
    public final C21408618qK LIZIZ;
    public final boolean LIZJ;
    public final C21423118sf LIZLLL = new C21423118sf(this);

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZIZ(TextView textView) {
        C11G2[] c11g2ArrLIZ = C111A.LIZ(textView);
        if (c11g2ArrLIZ != null && c11g2ArrLIZ.length > 0) {
            if (textView.getTag(R.id.o0u) == null) {
                C12YF c12yf = new C12YF(textView, 0);
                textView.addOnAttachStateChangeListener(c12yf);
                textView.setTag(R.id.o0u, c12yf);
            }
            C19351310nH c19351310nH = new C19351310nH(textView);
            for (C11G2 c11g2 : c11g2ArrLIZ) {
                c11g2.LL = c19351310nH;
            }
        }
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZJ(C21433918uP c21433918uP) {
        Set<InterfaceC21449318wt> setSingleton = Collections.singleton(new C21426118t9());
        if (setSingleton != null) {
            for (InterfaceC21449318wt interfaceC21449318wt : setSingleton) {
                if (interfaceC21449318wt instanceof InterfaceC21428018tS) {
                    ((InterfaceC21428018tS) interfaceC21449318wt).LIZ(c21433918uP);
                }
            }
            return;
        }
        throw new NullPointerException("extensions must not be null");
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZLLL(C21427518tN c21427518tN) {
        final C21423118sf c21423118sf = this.LIZLLL;
        c21423118sf.getClass();
        c21427518tN.LIZ(C21428718tZ.class, new InterfaceC21427718tP() { // from class: X.18sL
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21423118sf c21423118sf2 = c21423118sf;
                ((ArrayList) c21423118sf2.LIZ).clear();
                ((ArrayList) c21423118sf2.LIZIZ).clear();
                c21423118sf2.LIZJ = false;
                c21423118sf2.LIZLLL = 0;
                interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                C21423118sf c21423118sf3 = c21423118sf;
                c21423118sf3.getClass();
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                C21408918qN c21408918qN = new C21408918qN(0.0f);
                List listLLIIII = C13LP.LLIIII(c21423118sf3.LIZIZ);
                List<C21408718qL> list = c21423118sf3.LIZIZ;
                C21421418sO c21421418sO = c21423118sf3.LJ;
                for (C21408718qL c21408718qL : (ArrayList) list) {
                    int length2 = interfaceC21427218tK.length();
                    if (c21421418sO.LIZ.LJIILLIIL == 1) {
                        for (C21408518qJ c21408518qJ : c21408718qL.LIZIZ) {
                            int length3 = interfaceC21427218tK.length();
                            C21423918sn c21423918snBuilder = interfaceC21427218tK.builder();
                            c21423918snBuilder.LL.append(u.LJJIFFI(c21408518qJ.LIZIZ.toString(), "\n", " ", false));
                            c21423918snBuilder.LIZJ(" ");
                            c21408518qJ.LIZJ = length3;
                            c21408518qJ.LIZLLL = interfaceC21427218tK.length() - 1;
                        }
                    } else {
                        interfaceC21427218tK.builder().LIZJ("|");
                        for (C21408518qJ c21408518qJ2 : c21408718qL.LIZIZ) {
                            int length4 = interfaceC21427218tK.length();
                            C21423918sn c21423918snBuilder2 = interfaceC21427218tK.builder();
                            c21423918snBuilder2.LL.append(" ");
                            c21423918snBuilder2.LL.append(u.LJJIFFI(c21408518qJ2.LIZIZ.toString(), "\n", " ", false));
                            c21423918snBuilder2.LIZJ(" |");
                            c21408518qJ2.LIZJ = length4;
                            c21408518qJ2.LIZLLL = interfaceC21427218tK.length() - 1;
                        }
                    }
                    if (interfaceC21427218tK.LJIJJLI(abstractC21430218to)) {
                        interfaceC21427218tK.LJIIJ();
                    }
                    interfaceC21427218tK.LJIJI(length2, new C21408318qH(c21421418sO.LIZ, c21421418sO.LIZIZ, listLLIIII, c21408718qL, c21408918qN, c21421418sO.LIZJ));
                }
                interfaceC21427218tK.LJIJI(length, c21408918qN);
                interfaceC21427218tK.LJIJI(length, new Object() { // from class: X.0oqp
                });
                interfaceC21427218tK.LJJ(abstractC21430218to);
                C21423118sf c21423118sf4 = c21423118sf;
                ((ArrayList) c21423118sf4.LIZ).clear();
                ((ArrayList) c21423118sf4.LIZIZ).clear();
                c21423118sf4.LIZJ = false;
                c21423118sf4.LIZLLL = 0;
            }
        });
        c21427518tN.LIZ(C21428118tT.class, new InterfaceC21427718tP() { // from class: X.18si
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21428418tW.class, new InterfaceC21427718tP() { // from class: X.18sj
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21428618tY.class, new InterfaceC21427718tP() { // from class: X.18sN
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21423118sf c21423118sf2 = c21423118sf;
                c21423118sf2.getClass();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                ((ArrayList) c21423118sf2.LIZIZ).add(new C21408718qL(c21423118sf2.LIZLLL, c21423118sf2.LIZJ, C13LP.LLIIII(c21423118sf2.LIZ)));
                c21423118sf2.LIZLLL++;
                ((ArrayList) c21423118sf2.LIZ).clear();
            }
        });
        c21427518tN.LIZ(C21428518tX.class, new InterfaceC21427718tP() { // from class: X.18sh
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                c21423118sf.LIZJ = true;
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                c21423118sf.LIZJ = false;
            }
        });
        c21427518tN.LIZ(C21428218tU.class, new InterfaceC21427718tP() { // from class: X.18sP
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // X.InterfaceC21427718tP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.InterfaceC21427218tK r6, X.AbstractC21430218to r7) {
                /*
                    r5 = this;
                    X.18tU r7 = (X.C21428218tU) r7
                    int r4 = r6.length()
                    r6.LJJIIZ(r7)
                    X.18sf r0 = r1
                    java.util.List<X.18qJ> r3 = r0.LIZ
                    X.18qJ r2 = new X.18qJ
                    X.18th r0 = r7.LJFF
                    if (r0 == 0) goto L21
                    int[] r1 = X.C21429418tg.LIZ
                    int r0 = r0.ordinal()
                    r0 = r1[r0]
                    r1 = 1
                    if (r0 == r1) goto L22
                    r1 = 2
                    if (r0 == r1) goto L22
                L21:
                    r1 = 0
                L22:
                    X.18sn r0 = r6.builder()
                    X.18tC r0 = r0.LJFF(r4)
                    r2.<init>(r1, r0)
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    r3.add(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21421518sP.LIZ(X.18tK, X.18to):void");
            }
        });
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJFF(TextView textView, Spanned spanned) {
        C11G2[] c11g2ArrLIZ = C111A.LIZ(textView);
        if (c11g2ArrLIZ != null && c11g2ArrLIZ.length > 0) {
            for (C11G2 c11g2 : c11g2ArrLIZ) {
                c11g2.LL = null;
            }
        }
    }

    public C21421418sO(C21408418qI c21408418qI, C21408618qK c21408618qK, boolean z) {
        this.LIZ = c21408418qI;
        this.LIZIZ = c21408618qK;
        this.LIZJ = z;
    }
}
