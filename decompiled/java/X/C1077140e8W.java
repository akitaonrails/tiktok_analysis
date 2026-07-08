package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0e8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077140e8W extends ViewOutlineProvider {
    public final int $t;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C1077140e8W(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C1077140e8W c1077140e8W, View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
    }

    public static final void getOutline$1(C1077140e8W c1077140e8W, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C341940Daq.LIZ(5.0d));
        }
    }
}
