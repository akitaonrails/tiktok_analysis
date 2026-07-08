package X;

import android.view.View;

/* JADX INFO: renamed from: X.0MQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568200MQg implements C15D7 {
    @Override // X.C15D7
    public final void LIZ(View view, float f) {
        float f2;
        float f3;
        float f4 = 1.0f;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f2 = f + 1.0f;
        } else {
            f2 = 1.0f - f;
        }
        float f5 = (f2 * 0.100000024f) + 0.9f;
        if (f5 == 0.0f || Float.isNaN(f5) || Float.isInfinite(f5)) {
            f5 = 1.0f;
        }
        C786410Ut5.Ob(view, f5);
        C786410Ut5.pc(view, f5);
        if (f < 0.0f) {
            f3 = f + 1.0f;
        } else {
            f3 = 1.0f - f;
        }
        float f6 = 0.5f + (f3 * 0.5f);
        if (f6 != 0.0f && !Float.isNaN(f6) && !Float.isInfinite(f6)) {
            f4 = f6;
        }
        C786410Ut5.T4(view, f4);
    }
}
