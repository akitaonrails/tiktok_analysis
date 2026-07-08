package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DSQ extends FrameLayout {
    public C418880Gbe LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C418880Gbe c418880Gbe = this.LL;
        if (c418880Gbe != null) {
            c418880Gbe.LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C418880Gbe c418880Gbe = this.LL;
        if (c418880Gbe != null) {
            c418880Gbe.LIZJ();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C418880Gbe c418880Gbe = this.LL;
        if (c418880Gbe == null) {
            return;
        }
        C786410Ut5.LLLLIILLL(c418880Gbe, i);
    }

    public C0DSQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C418880Gbe c418880Gbe = new C418880Gbe(context, null);
        this.LL = c418880Gbe;
        c418880Gbe.setId(R.id.g3w);
        int iLIZIZ = (int) C497740JfY.LIZIZ(36.0f);
        addView(this.LL, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ, 17));
        int visibility = getVisibility();
        int visibility2 = getVisibility();
        setVisibility(visibility);
        C1602160rnK.LIZIZ(visibility2, visibility, this);
    }
}
