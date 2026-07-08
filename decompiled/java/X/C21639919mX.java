package X;

import Y.AAListenerS343S0100000_33;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21639919mX implements InterfaceC21647119nh {
    public final View LIZ;
    public final InterfaceC19745512Nh LIZIZ;
    public final List<C19746412Nq> LIZJ;
    public final List<C21616519il> LIZLLL;
    public final Map<String, C21640619me> LJ;
    public final Map<String, InterfaceC21641019mi> LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public ValueAnimator LJIIJ;
    public final ArgbEvaluator LJIIJJI;
    public final C19746312Np LJIIL;

    @Override // X.InterfaceC21647119nh
    public final void cancel() {
        this.LJIIIIZZ = true;
        if (this.LJII) {
            Iterator it2 = ((LinkedHashMap) this.LJ).entrySet().iterator();
            while (it2.hasNext()) {
                C21640619me c21640619me = (C21640619me) ((Map.Entry) it2.next()).getValue();
                c21640619me.getClass();
                c21640619me.LIZ.LIZLLL();
            }
            return;
        }
        ValueAnimator valueAnimator = this.LJIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C21640619me c21640619me2 = (C21640619me) ((LinkedHashMap) this.LJ).get(this.LJIIIZ);
        if (c21640619me2 != null) {
            c21640619me2.LIZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC21647119nh
    public final boolean isPaused() {
        return false;
    }

    public float LJFF() {
        InterfaceC19745512Nh interfaceC19745512Nh = this.LIZIZ;
        if (interfaceC19745512Nh instanceof C08LP) {
            throw null;
        }
        if (interfaceC19745512Nh instanceof C0HU6) {
            return ((C0HU6) interfaceC19745512Nh).LIZIZ.LIZ;
        }
        if (interfaceC19745512Nh instanceof C1776900wLA) {
            throw new IllegalArgumentException("BezierParam not support in SpringMotion");
        }
        if (interfaceC19745512Nh instanceof C621560OZm) {
            throw new IllegalArgumentException("PopParam not support in SpringMotion");
        }
        throw new C1954807lC();
    }

    public float LJII() {
        InterfaceC19745512Nh interfaceC19745512Nh = this.LIZIZ;
        if (interfaceC19745512Nh instanceof C08LP) {
            throw null;
        }
        if (interfaceC19745512Nh instanceof C0HU6) {
            return ((C0HU6) interfaceC19745512Nh).LIZ.LIZ;
        }
        if (interfaceC19745512Nh instanceof C1776900wLA) {
            throw new IllegalArgumentException("BezierParam not support in SpringMotion");
        }
        if (interfaceC19745512Nh instanceof C621560OZm) {
            throw new IllegalArgumentException("PopParam not support in SpringMotion");
        }
        throw new C1954807lC();
    }

    public final void LJIIJ() {
        Iterator it2 = ((LinkedHashMap) this.LJ).entrySet().iterator();
        while (it2.hasNext()) {
            C21640619me c21640619me = (C21640619me) ((Map.Entry) it2.next()).getValue();
            Function0<Unit> function0 = c21640619me.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
            c21640619me.LIZ.LJIIIZ();
        }
    }

    @Override // X.InterfaceC21647119nh
    public final void end() {
        Iterator it2 = ((LinkedHashMap) this.LJ).entrySet().iterator();
        while (it2.hasNext()) {
            C21616519il c21616519il = ((C21640619me) ((Map.Entry) it2.next()).getValue()).LIZ;
            if (!c21616519il.LJFF) {
                c21616519il.LJIIIZ();
            }
            if (c21616519il.LJJ.LIZIZ > 0.0d) {
                c21616519il.LJIIIIZZ();
            }
        }
    }

    public float LJI() {
        return LJFF() / (2 * ((float) Math.sqrt(LJII())));
    }

    @Override // X.InterfaceC21647119nh
    public final C19746312Np LIZIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC21647119nh
    public final void LIZJ(long j) {
        this.LJI = j;
    }

    @Override // X.InterfaceC21647119nh
    public final void start(boolean z) {
        if (z) {
            long j = this.LJI;
            this.LJII = true;
            this.LJIIIIZZ = false;
            if (j <= 0) {
                LJIIJ();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.addListener(new AAListenerS343S0100000_33(this, 22));
            valueAnimatorOfFloat.start();
            return;
        }
        this.LJII = false;
        this.LJIIIIZZ = false;
        LJIIIIZZ(0, C13LP.LLIIII(((LinkedHashMap) this.LJ).entrySet()));
    }

    @Override // X.InterfaceC21647119nh
    public final void LIZ(long j, String str) {
        C21640619me c21640619me = (C21640619me) ((LinkedHashMap) this.LJ).get(str);
        if (c21640619me != null) {
            c21640619me.LIZIZ = j;
        }
    }

    @Override // X.InterfaceC21647119nh
    public final void LIZLLL(String str, final InterfaceC21641019mi interfaceC21641019mi) {
        this.LJFF.put(str, interfaceC21641019mi);
        final C21640619me c21640619me = (C21640619me) ((LinkedHashMap) this.LJ).get(str);
        if (c21640619me != null) {
            c21640619me.LIZ.LIZJ(new InterfaceC20731416Am() { // from class: X.19md
                @Override // X.InterfaceC20731416Am
                public final void LIZ(float f, float f2) {
                    InterfaceC21641019mi interfaceC21641019mi2 = interfaceC21641019mi;
                    if (interfaceC21641019mi2 != null) {
                        C21640619me c21640619me2 = c21640619me;
                        interfaceC21641019mi2.LIZIZ(new C21640819mg(f, f2, this.LJIIIIZZ, c21640619me2.LJ, c21640619me2.LJFF));
                    }
                }
            });
            c21640619me.LIZ.LIZIZ(new InterfaceC1427630nFp() { // from class: X.19mc
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    InterfaceC21641019mi interfaceC21641019mi2 = interfaceC21641019mi;
                    if (interfaceC21641019mi2 != null) {
                        C21640619me c21640619me2 = c21640619me;
                        interfaceC21641019mi2.LIZ(new C21640819mg(f, f2, this.LJIIIIZZ, c21640619me2.LJ, c21640619me2.LJFF));
                    }
                }
            });
        }
    }

    public final C21616519il LJ(AbstractC21615419ia abstractC21615419ia, float f) {
        C21616519il c21616519il = new C21616519il(this.LIZ, abstractC21615419ia, f);
        C21581419d6 c21581419d6 = new C21581419d6(f);
        c21581419d6.LIZIZ(LJII());
        c21581419d6.LIZ(LJI());
        c21616519il.LJJ = c21581419d6;
        return c21616519il;
    }

    public final void LJIIIIZZ(final int i, final List<? extends Map.Entry<String, C21640619me>> list) {
        if (i >= list.size()) {
            return;
        }
        C21640619me c21640619me = (C21640619me) ((Map.Entry) ListProtector.get(list, i)).getValue();
        if (c21640619me.LIZIZ <= 0) {
            LJIIIZ(i, list);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(c21640619me.LIZIZ);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.19mf
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C21639919mX c21639919mX = this.LL;
                c21639919mX.LJIIJ = null;
                c21639919mX.LJIIIZ(i, list);
            }
        });
        this.LJIIJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void LJIIIZ(final int i, final List<? extends Map.Entry<String, C21640619me>> list) {
        if (!this.LJIIIIZZ) {
            Map.Entry entry = (Map.Entry) ListProtector.get(list, i);
            String str = (String) entry.getKey();
            C21640619me c21640619me = (C21640619me) entry.getValue();
            Function0<Unit> function0 = c21640619me.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
            C21616519il c21616519il = c21640619me.LIZ;
            c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.19ma
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    C21639919mX c21639919mX = this.LIZ;
                    c21639919mX.getClass();
                    if (!c21639919mX.LJIIIIZZ) {
                        c21639919mX.LJIIIIZZ(i + 1, list);
                    }
                }
            });
            c21616519il.LJIIIZ();
            this.LJIIIZ = str;
        }
    }

    public C21639919mX(View view, InterfaceC19745512Nh interfaceC19745512Nh, List<C19746412Nq> list) {
        float f;
        float f2;
        C21616519il c21616519ilLJ;
        AwS434S0200000_33 awS434S0200000_33;
        this.LIZ = view;
        this.LIZIZ = interfaceC19745512Nh;
        this.LIZJ = list;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJ = linkedHashMap;
        this.LJFF = new LinkedHashMap();
        this.LJII = true;
        this.LJIIJJI = new ArgbEvaluator();
        this.LJIIL = new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), (long) (((double) ((70000 / LJII()) + 250)) * (((double) ((LJFF() / LJII()) * 2)) + 0.5d))), list);
        if (!list.isEmpty()) {
            arrayList.clear();
            linkedHashMap.clear();
            for (C19746412Nq c19746412Nq : list) {
                List<C21616519il> list2 = this.LIZLLL;
                InterfaceC21640319mb interfaceC21640319mb = c19746412Nq.LIZIZ;
                if (interfaceC21640319mb instanceof C0HUY) {
                    C0HUY c0huy = (C0HUY) interfaceC21640319mb;
                    f = c0huy.LIZ;
                    f2 = c0huy.LIZIZ;
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 187);
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIJJ, c0huy.LIZIZ);
                } else if (interfaceC21640319mb instanceof C19745612Ni) {
                    final C19745612Ni c19745612Ni = (C19745612Ni) interfaceC21640319mb;
                    String str = c19746412Nq.LIZ;
                    final C817403Hg c817403Hg = new C817403Hg();
                    c21616519ilLJ = new C21616519il(this.LIZ, new AbstractC20731716Ap<View>() { // from class: X.19mW
                        @Override // X.AbstractC20731716Ap
                        public final float LIZ(View view2) {
                            return c817403Hg.element;
                        }

                        @Override // X.AbstractC20731716Ap
                        public final void LIZIZ(float f3, Object obj) {
                            c817403Hg.element = f3;
                            int iIntValue = ((Integer) this.LJIIJJI.evaluate(f3, Integer.valueOf(c19745612Ni.LIZ), Integer.valueOf(c19745612Ni.LIZIZ))).intValue();
                            Function1<? super Integer, Unit> function1 = c19745612Ni.LJ;
                            if (function1 != null) {
                                function1.invoke(Integer.valueOf(iIntValue));
                            }
                        }
                    });
                    C21581419d6 c21581419d6 = new C21581419d6(1.0f);
                    c21581419d6.LIZIZ(LJII());
                    c21581419d6.LIZ(LJI());
                    c21616519ilLJ.LJJ = c21581419d6;
                    Float f3 = c19745612Ni.LIZLLL;
                    if (f3 != null) {
                        float fFloatValue = f3.floatValue();
                        if (fFloatValue > 0.0f) {
                            c21616519ilLJ.LJIIIZ = fFloatValue;
                        } else {
                            throw new IllegalArgumentException("Minimum visible change must be positive.");
                        }
                    }
                    final C21640619me c21640619me = new C21640619me(c21616519ilLJ, null, c19745612Ni.LIZ, c19745612Ni.LIZIZ, 126);
                    c21640619me.LIZJ = new AwS577S0100000_33(c21616519ilLJ, 4217);
                    new AwS432S0200000_31(c21616519ilLJ, c817403Hg, 140);
                    c21616519ilLJ.LIZJ(new InterfaceC20731416Am() { // from class: X.19mh
                        @Override // X.InterfaceC20731416Am
                        public final void LIZ(float f4, float f5) {
                            c21640619me.getClass();
                            c21640619me.getClass();
                        }
                    });
                    this.LJ.put(str, c21640619me);
                    awS434S0200000_33 = null;
                    f = 0.0f;
                    f2 = 0.0f;
                } else if (interfaceC21640319mb instanceof C1880107Xz) {
                    C1880107Xz c1880107Xz = (C1880107Xz) interfaceC21640319mb;
                    f = c1880107Xz.LIZ;
                    f2 = c1880107Xz.LIZIZ;
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 188);
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIIZILJ, c1880107Xz.LIZIZ);
                } else if (interfaceC21640319mb instanceof C1880007Xy) {
                    interfaceC21640319mb.getClass();
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 178);
                    f = 0.0f;
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIJ, 0.0f);
                    f2 = 0.0f;
                } else if (interfaceC21640319mb instanceof C07Y0) {
                    C07Y0 c07y0 = (C07Y0) interfaceC21640319mb;
                    f = c07y0.LIZ;
                    f2 = c07y0.LIZIZ;
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 179);
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIJI, c07y0.LIZIZ);
                } else if (interfaceC21640319mb instanceof C0HIW) {
                    C0HIW c0hiw = (C0HIW) interfaceC21640319mb;
                    f = c0hiw.LIZ;
                    f2 = c0hiw.LIZIZ;
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 180);
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIILL, c0hiw.LIZIZ);
                } else if (interfaceC21640319mb instanceof C0HIX) {
                    C0HIX c0hix = (C0HIX) interfaceC21640319mb;
                    f = c0hix.LIZ;
                    f2 = c0hix.LIZIZ;
                    awS434S0200000_33 = new AwS434S0200000_33(this, interfaceC21640319mb, 181);
                    c21616519ilLJ = LJ(AbstractC21616419ik.LJIILLIIL, c0hix.LIZIZ);
                } else {
                    if (interfaceC21640319mb instanceof C1891607b0) {
                        interfaceC21640319mb.getClass();
                        f2 = 0;
                        c21616519ilLJ = LJ(AbstractC21616419ik.LJIJJLI, f2);
                        awS434S0200000_33 = new AwS434S0200000_33(c21616519ilLJ, interfaceC21640319mb, 182);
                    } else if (interfaceC21640319mb instanceof C1892707bB) {
                        interfaceC21640319mb.getClass();
                        f2 = 0;
                        c21616519ilLJ = LJ(AbstractC21616419ik.LJIL, f2);
                        awS434S0200000_33 = new AwS434S0200000_33(c21616519ilLJ, interfaceC21640319mb, 183);
                    } else if (interfaceC21640319mb instanceof C082N) {
                        C082N c082n = (C082N) interfaceC21640319mb;
                        f = c082n.LIZ;
                        f2 = c082n.LIZIZ;
                        c21616519ilLJ = LJ(AbstractC21616419ik.LJIIL, f2);
                        awS434S0200000_33 = new AwS434S0200000_33(c21616519ilLJ, interfaceC21640319mb, 184);
                    } else if (interfaceC21640319mb instanceof C0HV5) {
                        C0HV5 c0hv5 = (C0HV5) interfaceC21640319mb;
                        f = c0hv5.LIZ;
                        f2 = c0hv5.LIZIZ;
                        c21616519ilLJ = LJ(AbstractC21616419ik.LJIILIIL, f2);
                        awS434S0200000_33 = new AwS434S0200000_33(c21616519ilLJ, interfaceC21640319mb, 185);
                    } else if (interfaceC21640319mb instanceof C1160040gIE) {
                        C1160040gIE c1160040gIE = (C1160040gIE) interfaceC21640319mb;
                        f = c1160040gIE.LIZ;
                        f2 = c1160040gIE.LIZIZ;
                        c21616519ilLJ = LJ(AbstractC21616419ik.LJIILJJIL, f2);
                        awS434S0200000_33 = new AwS434S0200000_33(c21616519ilLJ, interfaceC21640319mb, 186);
                    } else {
                        throw new C1954807lC();
                    }
                    f = f2;
                }
                if (!(interfaceC21640319mb instanceof C19745612Ni)) {
                    this.LJ.put(c19746412Nq.LIZ, new C21640619me(c21616519ilLJ, awS434S0200000_33, f, f2, 122));
                }
                ((ArrayList) list2).add(c21616519ilLJ);
                InterfaceC21641019mi interfaceC21641019mi = (InterfaceC21641019mi) ((LinkedHashMap) this.LJFF).get(c19746412Nq.LIZ);
                if (interfaceC21641019mi != null) {
                    LIZLLL(c19746412Nq.LIZ, interfaceC21641019mi);
                }
            }
        }
    }
}
