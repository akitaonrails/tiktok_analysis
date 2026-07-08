package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0eOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1087110eOb extends C19MX {
    @Override // X.C19MX, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyLayoutFeatures();
    }

    @Override // X.C19MX
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // X.C19MX
    public final void updatePostLayout(ConstraintLayout constraintLayout) {
        C19ME c19me = (C19ME) getLayoutParams();
        c19me.widget.setWidth(0);
        c19me.widget.setHeight(0);
    }

    public C1087110eOb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
