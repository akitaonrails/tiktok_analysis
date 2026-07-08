package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;

/* JADX INFO: renamed from: X.1AmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189491AmZ extends ViewOutlineProvider {
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
            case 2:
                getOutline$2(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C2189491AmZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C2189491AmZ c2189491AmZ, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((float[]) c2189491AmZ.l0)[0]);
        }
    }

    public static final void getOutline$1(C2189491AmZ c2189491AmZ, View view, Outline outline) {
        if (view != null) {
            float fLIZJ = C12ES.LIZJ(8.0f, ((PdpBulletBottomSheetFragment) c2189491AmZ.l0).getContext());
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) fLIZJ), fLIZJ);
            }
        }
    }

    public static final void getOutline$2(C2189491AmZ c2189491AmZ, View view, Outline outline) {
        if (((Float) c2189491AmZ.l0) != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Float) c2189491AmZ.l0).floatValue());
        }
    }
}
