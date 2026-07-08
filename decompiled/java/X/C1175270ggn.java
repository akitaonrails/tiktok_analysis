package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ggn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175270ggn extends FrameLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    public C1175270ggn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean getRemoveBottomInsets() {
        return this.LLILLJJLI;
    }

    public final boolean getRemoveLeftInsets() {
        return this.LLILLL;
    }

    public final boolean getRemoveRightInsets() {
        return this.LLILZ;
    }

    public final boolean getRemoveTopInsets() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        if (this.LL && rect != null) {
            rect.top = 0;
        }
        if (this.LLILLJJLI && rect != null) {
            rect.bottom = 0;
        }
        if (this.LLILLL && rect != null) {
            rect.left = 0;
        }
        if (this.LLILZ && rect != null) {
            rect.right = 0;
        }
        return super.fitSystemWindows(rect);
    }

    public final void setRemoveBottomInsets(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setRemoveLeftInsets(boolean z) {
        this.LLILLL = z;
    }

    public final void setRemoveRightInsets(boolean z) {
        this.LLILZ = z;
    }

    public final void setRemoveTopInsets(boolean z) {
        this.LL = z;
    }

    public C1175270ggn(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
