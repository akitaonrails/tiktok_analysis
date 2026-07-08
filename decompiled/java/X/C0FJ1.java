package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.Objects;

/* JADX INFO: renamed from: X.0FJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FJ1 extends HorizontalScrollView {
    public static final /* synthetic */ int LL = 0;

    public final void LIZ(View view) {
        if (getWidth() == 0) {
            C786410Ut5.x3(view.getViewTreeObserver(), new C0FX1(this, view, 0));
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }

    public void setupScrollListenerWithApiCheck(final C0FJ2 c0fj2) {
        Objects.requireNonNull(c0fj2);
        super.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0FJ0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                ((C387950FIz) c0fj2).LIZ.LIZ();
            }
        });
    }

    public C0FJ1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
