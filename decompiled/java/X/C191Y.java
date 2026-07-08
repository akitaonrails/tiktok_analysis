package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.191Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191Y extends C191C {
    public static final C214714191c LLIZ = new TypeEvaluator<Float>() { // from class: X.191c
        @Override // android.animation.TypeEvaluator
        public final Float evaluate(float f, Float f2, Float f3) {
            Float f4 = f2;
            return Float.valueOf(f4.floatValue() + (f * (f3.floatValue() - f4.floatValue())));
        }
    };
    public C214715191d LLILZIL;
    public C214715191d LLILZLL;

    public static C214715191d LJI(View view) {
        if (!(view instanceof C1322100kVc) || view.getVisibility() != 0) {
            return null;
        }
        C1322090kVb c1322090kVb = (C1322090kVb) view;
        if (!(c1322090kVb.getHierarchy() instanceof C1331070kk5)) {
            return null;
        }
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI = ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIJJI();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        if (rect.isEmpty()) {
            return null;
        }
        return new C214715191d(rect, interfaceC1320380kSqLJIIJJI);
    }

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        if (this.LLILZLL == null) {
            return;
        }
        View view = this.LLILLL;
        if (!(view instanceof C1322100kVc)) {
            return;
        }
        C1322090kVb c1322090kVb = (C1322090kVb) view;
        if (c1322090kVb.getHierarchy() instanceof C1331070kk5) {
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIZILJ(this.LLILZLL.LIZIZ);
        }
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        boolean z2;
        if (this.LLILZIL != null && this.LLILZLL != null) {
            View view = this.LLILLL;
            if (!(view instanceof C1322100kVc)) {
                return C191E.LIZJ;
            }
            C1322090kVb c1322090kVb = (C1322090kVb) view;
            if (!(c1322090kVb.getHierarchy() instanceof C1331070kk5)) {
                return C191E.LIZJ;
            }
            C1331070kk5 c1331070kk5 = (C1331070kk5) c1322090kVb.getHierarchy();
            boolean zEquals = this.LLILZIL.LIZ.equals(this.LLILZLL.LIZ);
            C214715191d c214715191d = this.LLILZIL;
            InterfaceC1320380kSq interfaceC1320380kSq = c214715191d.LIZIZ;
            C214715191d c214715191d2 = this.LLILZLL;
            InterfaceC1320380kSq interfaceC1320380kSq2 = c214715191d2.LIZIZ;
            if (interfaceC1320380kSq == interfaceC1320380kSq2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (zEquals && z2) {
                return C191E.LIZJ;
            }
            final C0SV7 c0sv7 = new C0SV7(interfaceC1320380kSq, interfaceC1320380kSq2, c214715191d.LIZ, c214715191d2.LIZ, null, null);
            c1331070kk5.LJIIZILJ(c0sv7);
            final Class<Float> cls = Float.class;
            return new C191M(new C191N(c1322090kVb, new Property<C1322100kVc, Float>(cls) { // from class: X.191a
                @Override // android.util.Property
                public final Float get(C1322100kVc c1322100kVc) {
                    return Float.valueOf(c0sv7.LJIL);
                }

                @Override // android.util.Property
                public final void set(C1322100kVc c1322100kVc, Float f) {
                    c0sv7.LJIL = f.floatValue();
                    c1322100kVc.invalidate();
                }
            }, LLIZ, Float.valueOf(0.0f), Float.valueOf(1.0f), null));
        }
        return C191E.LIZJ;
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        this.LLILZIL = LJI(view);
        this.LLILZLL = LJI(view2);
    }
}
