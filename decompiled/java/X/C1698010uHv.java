package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0uHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698010uHv extends ViewOutlineProvider {
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

    public C1698010uHv(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C1698010uHv c1698010uHv, View view, Outline outline) {
        Outline outline2;
        if ((view instanceof C1696660uFk) && (outline2 = ((C1696660uFk) view).LLILZIL) != null) {
            outline.set(outline2);
        }
    }

    public static final void getOutline$1(C1698010uHv c1698010uHv, View view, Outline outline) {
        outline.set(((C1697150uGX) view).LLILZIL.LIZIZ());
    }

    public static final void getOutline$2(C1698010uHv c1698010uHv, View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }

    public static final void getOutline$3(C1698010uHv c1698010uHv, View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
