package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HC9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HC9 extends ConstraintLayout {
    public C1390410mHn LL;

    public final C1390410mHn getDualBallLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gb5);
            this.LL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDualBallLoadingViewFromXml().LIZJ();
    }

    public final void setDualBallLoadingViewFromXml(C1390410mHn c1390410mHn) {
        this.LL = c1390410mHn;
    }

    public C0HC9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0HC9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.a_c, this);
    }
}
