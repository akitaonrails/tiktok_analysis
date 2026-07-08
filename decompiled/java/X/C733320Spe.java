package X;

import android.animation.TimeInterpolator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Spe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733320Spe extends C09AY implements Function0<TimeInterpolator> {
    public C733320Spe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimeInterpolator invoke() {
        return new TimeInterpolator() { // from class: X.0Ga6
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - 1)) * 6.283185307179586d) / ((double) 4))) + ((double) 1));
            }
        };
    }
}
