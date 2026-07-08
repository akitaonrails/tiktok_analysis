package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.04J9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J9 extends ViewOutlineProvider {
    public final int $t;
    public float f0;

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

    public C04J9(float f, int i) {
        this.$t = i;
        this.f0 = f;
    }

    public static final void getOutline$0(C04J9 c04j9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c04j9.f0);
    }

    public static final void getOutline$1(C04J9 c04j9, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c04j9.f0);
    }
}
