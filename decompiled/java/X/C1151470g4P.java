package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0g4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151470g4P extends ViewOutlineProvider {
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
            case 3:
                getOutline$3(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C1151470g4P(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C1151470g4P c1151470g4P, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C497740JfY.LIZIZ(8.0f));
    }

    public static final void getOutline$1(C1151470g4P c1151470g4P, View view, Outline outline) {
        int width;
        if (outline != null) {
            int height = 0;
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
            }
            outline.setRoundRect(0, 0, width, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) + height, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
    }

    public static final void getOutline$2(C1151470g4P c1151470g4P, View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int iMin = Math.min(width, height);
        int i = (width - iMin) / 2;
        int i2 = (height - iMin) / 2;
        outline.setOval(i, i2, i + iMin, iMin + i2);
    }

    public static final void getOutline$3(C1151470g4P c1151470g4P, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) C12ES.LIZJ(2.0f, C2219091BtD.LIZ()));
    }
}
