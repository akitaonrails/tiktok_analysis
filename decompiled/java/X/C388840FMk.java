package X;

import Y.ARunnableS74S0200000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Objects;

/* JADX INFO: renamed from: X.0FMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388840FMk extends HorizontalScrollView {
    public C388840FMk(Context context) {
        super(context, null);
        setOverScrollMode(2);
    }

    public final void LIZ(C388820FMi c388820FMi) {
        if (getWidth() == 0) {
            HandlerHook.viewPostDelay(this, new ARunnableS74S0200000_5(this, c388820FMi, 40), 100L);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollX", ((c388820FMi.getLeft() + c388820FMi.getRight()) / 2) - (getWidth() / 2));
        objectAnimatorOfInt.setDuration(100);
        C786410Ut5.Pd(objectAnimatorOfInt);
    }

    public void setupScrollListenerWithApiCheck(final InterfaceC388870FMn interfaceC388870FMn) {
        Objects.requireNonNull(interfaceC388870FMn);
        setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0FMj
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                ((C388850FMl) interfaceC388870FMn).LIZ.LIZ();
            }
        });
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
