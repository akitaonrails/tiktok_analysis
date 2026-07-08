package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.09hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2439709hD implements TypeEvaluator<Rect> {
    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        return new Rect(rect3.left + ((int) ((rect4.left - r4) * f)), rect3.top + ((int) ((rect4.top - r3) * f)), rect3.right + ((int) ((rect4.right - r2) * f)), rect3.bottom + ((int) ((rect4.bottom - r1) * f)));
    }
}
