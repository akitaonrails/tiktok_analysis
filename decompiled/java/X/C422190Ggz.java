package X;

import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS216S0200000_6;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Ggz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422190Ggz {
    public View LIZ;
    public View LIZIZ;
    public RecyclerView LIZJ;
    public final ValueAnimator LIZLLL;
    public final C01GW LJ;
    public boolean LJFF;

    public C422190Ggz() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimator.addListener(new ALAdapterS3S0100000_6(this, 66));
        this.LIZLLL = valueAnimator;
        this.LJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1602));
    }

    public final void LIZ(RecyclerView recyclerView, View view, View view2) {
        float f;
        long j;
        int i;
        if (recyclerView == null) {
            return;
        }
        if (view2 != null) {
            if (view == null) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setImportantForAccessibility(i);
        }
        this.LIZJ = recyclerView;
        this.LIZ = this.LIZIZ;
        this.LIZIZ = view;
        ValueAnimator valueAnimator = this.LIZLLL;
        if (valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        if (!this.LJFF) {
            this.LJFF = true;
            recyclerView.addItemDecoration((C0DXR) this.LJ.getValue());
        }
        float f2 = 0.15f;
        if (view == null) {
            f = 0.15f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        float f3 = 1;
        valueAnimator.setFloatValues(f3 - f, f3 - f2);
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new AUListenerS216S0200000_6(this, recyclerView, 30));
        if (view != null) {
            j = 200;
        } else {
            j = 0;
        }
        valueAnimator.setStartDelay(j);
        valueAnimator.start();
    }
}
