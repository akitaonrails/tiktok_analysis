package X;

import Y.AUListenerS224S0200000_17;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0ehD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098650ehD {
    public static final void LIZ(C20632315oP c20632315oP, int i, InterfaceC1098670ehF interfaceC1098670ehF) {
        int height = c20632315oP.getHeight();
        if (i == height) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS224S0200000_17(c20632315oP, interfaceC1098670ehF, 0));
        valueAnimatorOfInt.addListener(interfaceC1098670ehF);
        valueAnimatorOfInt.start();
    }
}
