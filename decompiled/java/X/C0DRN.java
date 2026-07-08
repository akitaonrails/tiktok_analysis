package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DRN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRN extends FrameLayout {
    public final C1390410mHn LL;

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, i);
        }
        if (i == 0) {
            C1390410mHn c1390410mHn2 = this.LL;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZJ();
                return;
            }
            return;
        }
        C1390410mHn c1390410mHn3 = this.LL;
        if (c1390410mHn3 == null) {
            return;
        }
        c1390410mHn3.LIZLLL();
    }

    public C0DRN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LL = c1390410mHn;
        addView(c1390410mHn, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 17));
    }
}
