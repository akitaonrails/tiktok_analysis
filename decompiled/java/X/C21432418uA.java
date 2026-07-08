package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21432418uA extends AbstractC21446218wO {
    public final TextView.BufferType LIZ;
    public final C21433218uI LIZIZ;
    public final AbstractC21448918wp LIZJ;
    public final List<InterfaceC21434318uT> LIZLLL;
    public final boolean LJ;

    @Override // X.AbstractC21446218wO
    public final Spanned LIZ(String str) {
        C21426418tC c21426418tCLIZJ = LIZJ(null, LIZIZ(str));
        if (TextUtils.isEmpty(c21426418tCLIZJ) && this.LJ && !TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(str);
        }
        return c21426418tCLIZJ;
    }

    public final AbstractC21430218to LIZIZ(String str) {
        Iterator<InterfaceC21434318uT> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str);
        }
        C21433218uI c21433218uI = this.LIZIZ;
        c21433218uI.getClass();
        if (str != null) {
            C21440618vU c21440618vU = new C21440618vU(c21433218uI.LIZ, c21433218uI.LIZJ, c21433218uI.LIZIZ);
            int i = 0;
            loop1: while (true) {
                int length = str.length();
                for (int i2 = i; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '\n' || cCharAt == '\r') {
                        if (i2 == -1) {
                            break;
                        }
                        c21440618vU.LJIIIIZZ(str.substring(i, i2));
                        i = i2 + 1;
                        if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                            i = i2 + 2;
                        }
                    }
                }
                break loop1;
            }
            if (str.length() > 0 && (i == 0 || i < str.length())) {
                c21440618vU.LJIIIIZZ(str.substring(i));
            }
            c21440618vU.LJFF(c21440618vU.LJIILIIL);
            InterfaceC21429918tl interfaceC21429918tlLIZ = c21440618vU.LJIIIZ.LIZ(new C21444018w2(c21440618vU.LJIIJ, c21440618vU.LJIIL));
            Iterator<InterfaceC21443518vx> it3 = c21440618vU.LJIILJJIL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZLLL(interfaceC21429918tlLIZ);
            }
            C21439118vF c21439118vF = c21440618vU.LJIIJJI.LIZ;
            Iterator it4 = ((ArrayList) c21433218uI.LIZLLL).iterator();
            while (it4.hasNext()) {
                ((InterfaceC21447418wa) it4.next()).LIZ(c21439118vF);
            }
            return c21439118vF;
        }
        throw new NullPointerException("input must not be null");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.14S6] */
    public final C21426418tC LIZJ(TextView textView, AbstractC21430218to abstractC21430218to) {
        Iterator<InterfaceC21434318uT> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ();
        }
        C21436818us c21436818us = (C21436818us) this.LIZJ;
        InterfaceC21429118td interfaceC21429118td = c21436818us.LIZ;
        C21432118u7 c21432118u7 = c21436818us.LIZIZ;
        ?? r4 = new C14S7() { // from class: X.14S6
            public final Map<C14S5, Object> LIZ = new HashMap(3);

            @Override // X.C14S7
            public final <T> T LIZJ(C14S5<T> c14s5) {
                return (T) ((HashMap) this.LIZ).get(c14s5);
            }

            @Override // X.C14S7
            public final <T> void LIZ(C14S5<T> c14s5, T t) {
                if (t == null) {
                    ((HashMap) this.LIZ).remove(c14s5);
                } else {
                    ((HashMap) this.LIZ).put(c14s5, t);
                }
            }

            @Override // X.C14S7
            public final <T> T LIZIZ(C14S5<T> c14s5, T t) {
                T t2 = (T) ((HashMap) this.LIZ).get(c14s5);
                if (t2 != null) {
                    return t2;
                }
                return t;
            }
        };
        C21427518tN c21427518tN = (C21427518tN) interfaceC21429118td;
        InterfaceC21437018uu c21426018t8 = c21427518tN.LIZIZ;
        if (c21426018t8 == null) {
            c21426018t8 = new C21426018t8();
        }
        C21431218ty c21431218ty = new C21431218ty(c21432118u7, r4, new C21423918sn(), Collections.unmodifiableMap(c21427518tN.LIZ), c21426018t8);
        abstractC21430218to.LIZ(c21431218ty);
        Iterator<InterfaceC21434318uT> it3 = this.LIZLLL.iterator();
        while (it3.hasNext()) {
            it3.next().LJII(textView, abstractC21430218to, c21431218ty);
        }
        return c21431218ty.LIZJ.LJIIIIZZ();
    }

    public final void LIZLLL(TextView textView, Spanned spanned) {
        Iterator<InterfaceC21434318uT> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(textView, spanned);
        }
        textView.setText(spanned, this.LIZ);
        Iterator<InterfaceC21434318uT> it3 = this.LIZLLL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(textView);
        }
    }

    public C21432418uA(TextView.BufferType bufferType, C21433218uI c21433218uI, C21436818us c21436818us, List list, boolean z) {
        this.LIZ = bufferType;
        this.LIZIZ = c21433218uI;
        this.LIZJ = c21436818us;
        this.LIZLLL = list;
        this.LJ = z;
    }
}
