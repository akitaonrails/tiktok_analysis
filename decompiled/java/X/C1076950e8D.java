package X;

import Y.AsS43S0100000_16;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0e8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076950e8D {
    public final View LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public AsS43S0100000_16 LIZJ;
    public ViewTreeObserverOnGlobalLayoutListenerC1077390e8v LIZLLL;
    public ViewTreeObserverOnScrollChangedListenerC1076970e8F LJ;
    public ViewTreeObserverOnWindowFocusChangeListenerC1076960e8E LJFF;
    public final Rect LJI = new Rect();

    public final void LIZ() {
        if (!this.LIZ.isAttachedToWindow() || this.LIZ.getWidth() <= 0 || this.LIZ.getHeight() <= 0) {
            this.LIZIZ.invoke(Boolean.FALSE);
            return;
        }
        if (this.LIZ.getVisibility() != 0) {
            this.LIZIZ.invoke(Boolean.FALSE);
            return;
        }
        if (!this.LIZ.hasWindowFocus()) {
            this.LIZIZ.invoke(Boolean.FALSE);
            return;
        }
        if (!this.LIZ.getGlobalVisibleRect(this.LJI) || this.LJI.isEmpty()) {
            this.LIZIZ.invoke(Boolean.FALSE);
            return;
        }
        int width = this.LIZ.getWidth() * this.LIZ.getHeight();
        this.LIZIZ.invoke(Boolean.valueOf((width > 0 ? ((float) (this.LJI.width() * this.LJI.height())) / ((float) width) : 0.0f) >= 0.98f));
    }

    public static ViewGroup LIZIZ(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup instanceof RecyclerView) {
                return viewGroup;
            }
            if (viewGroup instanceof ScrollView) {
                return viewGroup;
            }
            if (viewGroup instanceof HorizontalScrollView) {
                return viewGroup;
            }
            if (viewGroup instanceof C21578619ce) {
                return viewGroup;
            }
            parent = viewGroup.getParent();
        }
        return null;
    }

    public C1076950e8D(View view, AwS595S0100000_16 awS595S0100000_16) {
        this.LIZ = view;
        this.LIZIZ = awS595S0100000_16;
    }
}
