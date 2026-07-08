package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.186K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186K extends ConstraintLayout {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;

    public final View getBrandBgCoverFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.civ);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final C427660Gpo getBrandLogoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cjc);
            this.LL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getBrandNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cje);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eux);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setBrandBgCoverFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setBrandLogoFromXml(C427660Gpo c427660Gpo) {
        this.LL = c427660Gpo;
    }

    public final void setBrandNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setContentContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public C186K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C186K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1701430uNR.LIZ(context, R.layout.bxt, this, true);
    }
}
