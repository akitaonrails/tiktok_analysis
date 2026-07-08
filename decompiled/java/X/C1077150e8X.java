package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleTopviewCTAData;

/* JADX INFO: renamed from: X.0e8X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077150e8X extends ViewOutlineProvider {
    public final int $t;
    public Object l0;

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

    public C1077150e8X(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C1077150e8X c1077150e8X, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, C418440Gaw.LIZIZ(Integer.valueOf(((AnoleTopviewCTAData) c1077150e8X.l0).getButtonRadius())));
        }
    }

    public static final void getOutline$1(C1077150e8X c1077150e8X, View view, Outline outline) {
        int cornerRadius;
        int width;
        int height;
        if (((C1003420cDc) c1077150e8X.l0).LLJLL.getCornerRadius() > 0) {
            cornerRadius = ((C1003420cDc) c1077150e8X.l0).LLJLL.getCornerRadius();
        } else {
            cornerRadius = 200;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(cornerRadius));
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            outline.setRoundRect(0, 0, width, height, fLIZIZ);
        }
    }
}
