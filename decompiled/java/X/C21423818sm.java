package X;

import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21423818sm extends AbstractC21425218t0 {
    public final List<InterfaceC21427918tR> LIZ = new ArrayList(0);
    public boolean LIZIZ;

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZIZ(TextView textView) {
        if (!this.LIZIZ && textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public void LIZLLL(C21427518tN c21427518tN) {
        c21427518tN.LIZ(C21437418uy.class, new InterfaceC21427718tP<C21437418uy>() { // from class: X.18sp
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                String str = ((C21437418uy) abstractC21430218to).LJFF;
                interfaceC21427218tK.builder().LIZJ(str);
                if (!((ArrayList) this.LIZ.LIZ).isEmpty()) {
                    int length = interfaceC21427218tK.length() - str.length();
                    Iterator it2 = ((ArrayList) this.LIZ.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC21427918tR) it2.next()).LIZ(interfaceC21427218tK, str, length);
                    }
                }
            }
        });
        c21427518tN.LIZ(C21438718vB.class, new InterfaceC21427718tP<C21438718vB>() { // from class: X.18t5
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
            }
        });
        c21427518tN.LIZ(C21438118v5.class, new InterfaceC21427718tP<C21438118v5>() { // from class: X.18t6
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
            }
        });
        c21427518tN.LIZ(C21445018wC.class, new InterfaceC21427718tP<C21445018wC>() { // from class: X.18sx
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                interfaceC21427218tK.LJJ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21437518uz.class, new InterfaceC21427718tP<C21437518uz>() { // from class: X.18st
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21437518uz c21437518uz = (C21437518uz) abstractC21430218to;
                int length = interfaceC21427218tK.length();
                C21423918sn c21423918snBuilder = interfaceC21427218tK.builder();
                c21423918snBuilder.LL.append((char) 160);
                c21423918snBuilder.LL.append(c21437518uz.LJFF);
                c21423918snBuilder.LIZ((char) 160);
                interfaceC21427218tK.LJJIIJZLJL(c21437518uz, length);
            }
        });
        c21427518tN.LIZ(C21440218vQ.class, new InterfaceC21427718tP<C21440218vQ>() { // from class: X.18t2
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21440218vQ c21440218vQ = (C21440218vQ) abstractC21430218to;
                C21423818sm.LJIIL(interfaceC21427218tK, c21440218vQ.LJIIIIZZ, c21440218vQ.LJIIIZ, c21440218vQ);
            }
        });
        c21427518tN.LIZ(C21440318vR.class, new InterfaceC21427718tP<C21440318vR>() { // from class: X.18t7
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21440318vR c21440318vR = (C21440318vR) abstractC21430218to;
                C21423818sm.LJIIL(interfaceC21427218tK, null, c21440318vR.LJFF, c21440318vR);
            }
        });
        c21427518tN.LIZ(C21436318un.class, new InterfaceC21427718tP<C21436318un>() { // from class: X.18u1
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21436318un c21436318un = (C21436318un) abstractC21430218to;
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) interfaceC21427218tK.LJJIII().LJFF).LIZ(C21436318un.class);
                if (interfaceC21446318wPLIZ == null) {
                    interfaceC21427218tK.LJJIIZ(c21436318un);
                    return;
                }
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(c21436318un);
                if (length == interfaceC21427218tK.length()) {
                    interfaceC21427218tK.builder().LIZ((char) 65532);
                }
                C21432118u7 c21432118u7LJJIII = interfaceC21427218tK.LJJIII();
                boolean z = c21436318un.LIZ instanceof C21436418uo;
                AbstractC21447018wW abstractC21447018wW = c21432118u7LJJIII.LJ;
                String str = c21436318un.LJFF;
                abstractC21447018wW.getClass();
                C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                c14s7LJIL.LIZ(AbstractC21436218um.LIZ, str);
                c14s7LJIL.LIZ(AbstractC21436218um.LIZIZ, Boolean.valueOf(z));
                c14s7LJIL.LIZ(AbstractC21436218um.LIZJ, null);
                interfaceC21427218tK.LJIJI(length, interfaceC21446318wPLIZ.LIZ(c21432118u7LJJIII, c14s7LJIL));
            }
        });
        c21427518tN.LIZ(C21437718v1.class, new InterfaceC21427718tP<AbstractC21430218to>() { // from class: X.18sy
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                interfaceC21427218tK.LJJ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21437618v0.class, new InterfaceC21427718tP<AbstractC21430218to>() { // from class: X.18sy
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                interfaceC21427218tK.LJJ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21445118wD.class, new InterfaceC21427718tP<C21445118wD>() { // from class: X.18tG
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(abstractC21430218to);
                AbstractC21439018vE abstractC21439018vE = (AbstractC21439018vE) abstractC21430218to.LIZ;
                if (abstractC21439018vE instanceof C21437618v0) {
                    C21437618v0 c21437618v0 = (C21437618v0) abstractC21439018vE;
                    int i = c21437618v0.LJI;
                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.ORDERED);
                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZJ, Integer.valueOf(i));
                    c21437618v0.LJI++;
                } else {
                    interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZ, C14S1.BULLET);
                    C14S5<Integer> c14s5 = AbstractC20267814Se.LIZIZ;
                    C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                    int i2 = 0;
                    for (AbstractC21430218to abstractC21430218toLIZJ = abstractC21430218to.LIZJ(); abstractC21430218toLIZJ != null; abstractC21430218toLIZJ = abstractC21430218toLIZJ.LIZJ()) {
                        if (abstractC21430218toLIZJ instanceof C21445118wD) {
                            i2++;
                        }
                    }
                    c14s7LJIL.LIZ(c14s5, Integer.valueOf(i2));
                }
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                if (interfaceC21427218tK.LJIJJLI(abstractC21430218to)) {
                    interfaceC21427218tK.LJIIJ();
                }
            }
        });
        c21427518tN.LIZ(C21444918wB.class, new InterfaceC21427718tP<C21444918wB>() { // from class: X.18sv
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.builder().LIZ((char) 160);
                interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
                interfaceC21427218tK.LJJ(abstractC21430218to);
            }
        });
        c21427518tN.LIZ(C21439318vH.class, new InterfaceC21427718tP<C21439318vH>() { // from class: X.18sq
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21439318vH c21439318vH = (C21439318vH) abstractC21430218to;
                interfaceC21427218tK.LJJIJIIJIL(c21439318vH);
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(c21439318vH);
                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LIZLLL, Integer.valueOf(c21439318vH.LJFF));
                interfaceC21427218tK.LJJIIJZLJL(c21439318vH, length);
                interfaceC21427218tK.LJJ(c21439318vH);
            }
        });
        c21427518tN.LIZ(C21438618vA.class, new InterfaceC21427718tP<C21438618vA>() { // from class: X.18t1
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.builder().LIZ(' ');
            }
        });
        c21427518tN.LIZ(C21438218v6.class, new InterfaceC21427718tP<C21438218v6>() { // from class: X.18tA
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                interfaceC21427218tK.LJIIJ();
            }
        });
        c21427518tN.LIZ(C21439218vG.class, new InterfaceC21427718tP<C21439218vG>() { // from class: X.18sl
            /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
            @Override // X.InterfaceC21427718tP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.InterfaceC21427218tK r6, X.AbstractC21430218to r7) {
                /*
                    r5 = this;
                    X.18to r0 = r7.LIZ
                    if (r0 == 0) goto L32
                    X.18to r1 = r0.LIZ
                    X.18vE r1 = (X.AbstractC21439018vE) r1
                    boolean r0 = r1 instanceof X.AbstractC21445918wL
                    if (r0 == 0) goto L32
                    X.18wL r1 = (X.AbstractC21445918wL) r1
                    boolean r4 = r1.LJFF
                    if (r4 != 0) goto L15
                L12:
                    r6.LJJIJIIJIL(r7)
                L15:
                    int r3 = r6.length()
                    r6.LJJIIZ(r7)
                    X.14S5<java.lang.Boolean> r2 = X.AbstractC20267814Se.LJI
                    X.14S7 r1 = r6.LJIL()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                    r1.LIZ(r2, r0)
                    r6.LJJIIJZLJL(r7, r3)
                    if (r4 != 0) goto L31
                    r6.LJJ(r7)
                L31:
                    return
                L32:
                    r4 = 0
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21423718sl.LIZ(X.18tK, X.18to):void");
            }
        });
        c21427518tN.LIZ(C21436418uo.class, new InterfaceC21427718tP<C21436418uo>() { // from class: X.18su
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                C21436418uo c21436418uo = (C21436418uo) abstractC21430218to;
                int length = interfaceC21427218tK.length();
                interfaceC21427218tK.LJJIIZ(c21436418uo);
                String str = c21436418uo.LJFF;
                interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJ, str);
                interfaceC21427218tK.LJJIIJZLJL(c21436418uo, length);
            }
        });
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJ(C21435318ud c21435318ud) {
        InterfaceC21446318wP interfaceC21446318wP = new InterfaceC21446318wP() { // from class: X.18lj
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new C445060Hcm(c21432118u7.LIZ);
            }
        };
        c21435318ud.LIZ(C21438718vB.class, new C21416818re());
        c21435318ud.LIZ(C21438118v5.class, new InterfaceC21446318wP() { // from class: X.18rb
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new C21416418ra();
            }
        });
        c21435318ud.LIZ(C21445018wC.class, new InterfaceC21446318wP() { // from class: X.18ln
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new C445240Hd4(c21432118u7.LIZ);
            }
        });
        c21435318ud.LIZ(C21437518uz.class, new InterfaceC21446318wP() { // from class: X.18ls
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new MetricAffectingSpan(c21432118u7.LIZ) { // from class: X.0Hcn
                    public final C448860Hiu LL;

                    {
                        this.LL = c448860Hiu;
                    }

                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        this.LL.LIZIZ(textPaint);
                        int iLIZ = this.LL.LJIIL;
                        if (iLIZ == 0) {
                            iLIZ = AbstractC445040Hck.LIZ(textPaint.getColor(), 25);
                        }
                        textPaint.bgColor = iLIZ;
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint textPaint) {
                        this.LL.LIZIZ(textPaint);
                    }
                };
            }
        });
        c21435318ud.LIZ(C21440218vQ.class, interfaceC21446318wP);
        c21435318ud.LIZ(C21440318vR.class, interfaceC21446318wP);
        c21435318ud.LIZ(C21445118wD.class, new C21427118tJ());
        c21435318ud.LIZ(C21439318vH.class, new InterfaceC21446318wP() { // from class: X.18lr
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new C445080Hco(c21432118u7.LIZ, AbstractC20267814Se.LIZLLL.LIZ(c14s7).intValue());
            }
        });
        c21435318ud.LIZ(C21436418uo.class, new C21424818sw());
        c21435318ud.LIZ(C21444918wB.class, new InterfaceC21446318wP() { // from class: X.18lp
            @Override // X.InterfaceC21446318wP
            public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
                return new C445250Hd5(c21432118u7.LIZ);
            }
        });
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJFF(TextView textView, Spanned spanned) {
        C445320HdC[] c445320HdCArr;
        if ((spanned instanceof Spanned) && (c445320HdCArr = (C445320HdC[]) spanned.getSpans(0, spanned.length(), C445320HdC.class)) != null) {
            TextPaint paint = textView.getPaint();
            for (C445320HdC c445320HdC : c445320HdCArr) {
                c445320HdC.LLILZ = (int) (paint.measureText(c445320HdC.LLILLJJLI) + 0.5f);
            }
        }
        if (spanned instanceof Spannable) {
            Spannable spannable = (Spannable) spanned;
            C448980Hj6[] c448980Hj6Arr = (C448980Hj6[]) spannable.getSpans(0, spannable.length(), C448980Hj6.class);
            if (c448980Hj6Arr != null) {
                for (C448980Hj6 c448980Hj6 : c448980Hj6Arr) {
                    spannable.removeSpan(c448980Hj6);
                }
            }
            C786410Ut5.o2(spannable, new C448980Hj6(textView), 0, spannable.length(), 18);
        }
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public void LJII(TextView textView, AbstractC21430218to abstractC21430218to, C21431218ty c21431218ty) {
        C448860Hiu c448860Hiu = c21431218ty.LIZ.LIZ;
        float f = c448860Hiu.LJI;
        if (f != 1.0f || c448860Hiu.LJII != 1.0f) {
            c21431218ty.LJIJI(0, new C0H13(f, c448860Hiu.LJII));
        }
    }

    public static void LJIIL(InterfaceC21427218tK interfaceC21427218tK, String str, String str2, AbstractC21430218to abstractC21430218to) {
        interfaceC21427218tK.LJJIJIIJIL(abstractC21430218to);
        int length = interfaceC21427218tK.length();
        C21423918sn c21423918snBuilder = interfaceC21427218tK.builder();
        c21423918snBuilder.LL.append((char) 160);
        c21423918snBuilder.LL.append('\n');
        c21423918snBuilder.LIZIZ(interfaceC21427218tK.LJJIII().LIZIZ.LIZ(str, str2));
        interfaceC21427218tK.LJIIJ();
        interfaceC21427218tK.builder().LIZ((char) 160);
        interfaceC21427218tK.LJIL().LIZ(AbstractC20267814Se.LJIIIZ, str);
        interfaceC21427218tK.LJJIIJZLJL(abstractC21430218to, length);
        interfaceC21427218tK.LJJ(abstractC21430218to);
    }
}
