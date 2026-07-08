package X;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21370518kB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(TuxIconView tuxIconView, TextView textView) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        View.OnLayoutChangeListener onLayoutChangeListener2;
        Object tag = tuxIconView.getTag(R.id.dkl);
        if ((tag instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener2 = (View.OnLayoutChangeListener) tag) != null) {
            textView.removeOnLayoutChangeListener(onLayoutChangeListener2);
        }
        Object tag2 = tuxIconView.getTag(R.id.dkm);
        if ((tag2 instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) tag2) != null) {
            tuxIconView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        tuxIconView.setTag(R.id.dkl, null);
        tuxIconView.setTag(R.id.dkm, null);
    }

    public static void LIZ(final TextView textView, final TuxIconView tuxIconView, final View view, final int i, final int i2) {
        LIZIZ(tuxIconView, textView);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.18kE
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                C21370518kB.LIZJ(textView, tuxIconView, view, i, i2);
            }
        };
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        tuxIconView.addOnLayoutChangeListener(onLayoutChangeListener);
        tuxIconView.setTag(R.id.dkl, onLayoutChangeListener);
        tuxIconView.setTag(R.id.dkm, onLayoutChangeListener);
        if (textView.isLaidOut() && !textView.isLayoutRequested()) {
            LIZJ(textView, tuxIconView, view, i, i2);
        } else {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.18kC
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    view2.removeOnLayoutChangeListener(this);
                    C21370518kB.LIZJ(textView, tuxIconView, view, i, i2);
                }
            });
        }
        if (tuxIconView.isLaidOut() && !tuxIconView.isLayoutRequested()) {
            LIZJ(textView, tuxIconView, view, i, i2);
        } else {
            tuxIconView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.18kD
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    view2.removeOnLayoutChangeListener(this);
                    C21370518kB.LIZJ(textView, tuxIconView, view, i, i2);
                }
            });
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(textView, new Runnable() { // from class: X.0Uv3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HeaderTrailingIconAnchor@9ba0.anchor$3");
                try {
                    C21370518kB.LIZJ(textView, tuxIconView, view, i, i2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HeaderTrailingIconAnchor@9ba0.anchor$3");
            }
        });
    }

    public static void LIZJ(TextView textView, View view, View view2, int i, int i2) {
        int maxLines;
        float fMin;
        Layout layout = textView.getLayout();
        if (layout != null && textView.getWidth() > 0 && textView.getHeight() > 0) {
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                if (textView.getMaxLines() > 0) {
                    maxLines = textView.getMaxLines();
                } else {
                    maxLines = Integer.MAX_VALUE;
                }
                int lineCount = layout.getLineCount() - 1;
                int i3 = maxLines - 1;
                if (lineCount > i3) {
                    lineCount = i3;
                }
                if (lineCount < 0) {
                    return;
                }
                int lineBottom = layout.getLineBottom(lineCount);
                if (lineCount < layout.getLineCount() && layout.getEllipsisCount(lineCount) > 0) {
                    fMin = textView.getWidth();
                } else {
                    fMin = Math.min(textView.getWidth(), textView.getTotalPaddingLeft() + layout.getLineRight(lineCount) + i2 + i);
                }
                float totalPaddingTop = textView.getTotalPaddingTop() + lineBottom;
                int left = 0;
                int top = 0;
                View view3 = textView;
                while (view3 != view2 && (view3.getParent() instanceof View)) {
                    left += view3.getLeft();
                    top += view3.getTop();
                    view3 = (View) view3.getParent();
                }
                if (view3 != view2) {
                    return;
                }
                float width = ((left + fMin) - view.getWidth()) - view.getLeft();
                float height = ((top + totalPaddingTop) - view.getHeight()) - view.getTop();
                if (view.getTranslationX() != width) {
                    C786410Ut5.Jc(view, width);
                }
                if (view.getTranslationY() != height) {
                    C786410Ut5.ed(view, height);
                    return;
                }
                return;
            }
            view.requestLayout();
        }
    }
}
