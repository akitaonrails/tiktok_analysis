package X;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.191T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C191T<VIEW_TYPE extends View, ANIMATION_VALUE_TYPE> extends C191C {
    public final C191W<VIEW_TYPE, ANIMATION_VALUE_TYPE> LLILZIL;
    public final TypeEvaluator<ANIMATION_VALUE_TYPE> LLILZLL;
    public final C191V<VIEW_TYPE, ANIMATION_VALUE_TYPE> LLIZ;
    public final TimeInterpolator LLIZLLLIL;
    public Pair<? extends ANIMATION_VALUE_TYPE, ? extends ANIMATION_VALUE_TYPE> LLJ;

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        Pair<? extends ANIMATION_VALUE_TYPE, ? extends ANIMATION_VALUE_TYPE> pair = this.LLJ;
        if (pair == null) {
            return;
        }
        this.LLIZ.LIZIZ(this.LLILLL, this.LLILZLL.evaluate(1.0f, pair.getFirst(), pair.getSecond()));
        this.LLIZ.LIZ(this.LLILLL);
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        Pair<? extends ANIMATION_VALUE_TYPE, ? extends ANIMATION_VALUE_TYPE> pair = this.LLJ;
        if (pair == null) {
            return C191E.LIZJ;
        }
        final ANIMATION_VALUE_TYPE first = pair.getFirst();
        final ANIMATION_VALUE_TYPE second = pair.getSecond();
        return new C191E(this) { // from class: X.191U
            public final /* synthetic */ C191T<VIEW_TYPE, ANIMATION_VALUE_TYPE> LJ;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C191E
            public final void LIZIZ(float f) {
                C191T<VIEW_TYPE, ANIMATION_VALUE_TYPE> c191t = this.LJ;
                TimeInterpolator timeInterpolator = c191t.LLIZLLLIL;
                ANIMATION_VALUE_TYPE animation_value_type = first;
                ANIMATION_VALUE_TYPE animation_value_type2 = second;
                if (timeInterpolator != null) {
                    f = timeInterpolator.getInterpolation(f);
                }
                c191t.LLIZ.LIZIZ(c191t.LLILLL, (ANIMATION_VALUE_TYPE) c191t.LLILZLL.evaluate(f, animation_value_type, animation_value_type2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.LJ = this;
            }
        };
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        ANIMATION_VALUE_TYPE animation_value_typeLIZ = this.LLILZIL.LIZ(view3, view);
        ANIMATION_VALUE_TYPE animation_value_typeLIZ2 = this.LLILZIL.LIZ(view3, view2);
        if (animation_value_typeLIZ != null && animation_value_typeLIZ2 != null) {
            this.LLJ = new Pair<>(animation_value_typeLIZ, animation_value_typeLIZ2);
        } else {
            this.LLJ = null;
        }
    }

    public C191T(C191S c191s, C19727712Gl c19727712Gl, C214702190q c214702190q, TimeInterpolator timeInterpolator) {
        this.LLILZIL = c191s;
        this.LLILZLL = c19727712Gl;
        this.LLIZ = c214702190q;
        this.LLIZLLLIL = timeInterpolator;
    }
}
