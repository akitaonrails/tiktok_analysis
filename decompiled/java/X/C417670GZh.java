package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417670GZh extends FrameLayout {
    public final C427660Gpo LL;

    public final C427660Gpo getAvatarView() {
        return this.LL;
    }

    public final void setStrokeWidth(int i) {
        setPadding(i, i, i, i);
    }

    public C417670GZh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipToOutline(true);
        setOutlineProvider(new C0ID9(17));
        C427660Gpo c427660Gpo = new C427660Gpo(context, null, 6, 0);
        this.LL = c427660Gpo;
        addView(c427660Gpo, new FrameLayout.LayoutParams(-2, -2));
    }
}
