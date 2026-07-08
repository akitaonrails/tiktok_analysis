package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0iwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1262130iwt extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;

    public final TuxIconView getInfoIconView() {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void setInfoIconView(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public AbstractC1262130iwt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
