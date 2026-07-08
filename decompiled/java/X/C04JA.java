package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;

/* JADX INFO: renamed from: X.04JA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JA extends ViewOutlineProvider {
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

    public C04JA(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C04JA c04ja, View view, Outline outline) {
        if (view != null && outline != null) {
            int width = view.getWidth();
            float height = view.getHeight();
            float f = C958103op.LIZIZ;
            outline.setRoundRect(0, 0, width, (int) (height + f), f);
        }
    }

    public static final void getOutline$1(C04JA c04ja, View view, Outline outline) {
        int width = view.getWidth();
        float height = view.getHeight();
        String str = SeaSkuPanelFragment._pnsPageId;
        float f = SeaSkuPanelFragment.LLJLLIL;
        outline.setRoundRect(0, 0, width, (int) (height + f), f);
    }

    public static final void getOutline$2(C04JA c04ja, View view, Outline outline) {
        if (view != null && outline != null) {
            int width = view.getWidth();
            float height = view.getHeight();
            float f = C958103op.LIZIZ;
            outline.setRoundRect(0, 0, width, (int) (height + f), f);
        }
    }
}
