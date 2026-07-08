package X;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.util.Property;

/* JADX INFO: renamed from: X.191N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191N<T, F> {
    public final T LIZ;
    public final Property<T, F> LIZIZ;
    public final TypeEvaluator<F> LIZJ;
    public final F LIZLLL;
    public final F LJ;
    public final TimeInterpolator LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C191N(Object obj, Property property, TypeEvaluator typeEvaluator, Object obj2, Object obj3, InterpolatorC448120Hhi interpolatorC448120Hhi) {
        this.LIZ = obj;
        this.LIZJ = typeEvaluator;
        this.LIZIZ = property;
        this.LIZLLL = obj2;
        this.LJ = obj3;
        this.LJFF = interpolatorC448120Hhi;
    }
}
