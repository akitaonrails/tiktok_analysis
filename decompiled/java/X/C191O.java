package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.191O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191O implements TypeEvaluator<Rect> {
    public final Rect LIZ;

    public C191O() {
    }

    public C191O(Rect rect) {
        this.LIZ = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) ((rect2.left - r4) * f));
        int i2 = rect.top + ((int) ((rect2.top - r3) * f));
        int i3 = rect.right + ((int) ((rect2.right - r2) * f));
        int i4 = rect.bottom + ((int) ((rect2.bottom - r1) * f));
        Rect rect3 = this.LIZ;
        if (rect3 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.LIZ;
    }
}
