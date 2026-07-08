package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Us9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785830Us9 extends ViewOutlineProvider {
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
            case 2:
                getOutline$2(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C785830Us9(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C785830Us9 c785830Us9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) * 0.057f);
    }

    public static final void getOutline$1(C785830Us9 c785830Us9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C497740JfY.LIZIZ(14));
    }

    public static final void getOutline$2(C785830Us9 c785830Us9, View view, Outline outline) {
        int i = C781930Ulr.LLJLIL;
        Rect rect = new Rect(0, 0, C781930Ulr.LLJLIL, C781930Ulr.LLJLILLLLZIIL);
        if (outline != null) {
            outline.setRoundRect(rect, (int) C497740JfY.LIZIZ(14.0f));
        }
    }
}
