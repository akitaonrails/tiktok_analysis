package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0cNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1009850cNz extends C1036760d5O implements InterfaceC1003820cEG {
    public Aweme LLJJI;

    public final Aweme getAweme() {
        return this.LLJJI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!((Boolean) C0A9R.LIZ.getValue()).booleanValue()) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setAweme(Aweme aweme) {
        this.LLJJI = aweme;
    }

    public C1009850cNz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
