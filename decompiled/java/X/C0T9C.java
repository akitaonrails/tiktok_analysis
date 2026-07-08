package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0T9C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T9C extends FrameLayout {
    public View LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;

    public final View getBottomLineViewFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.cas);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getLayoutStickerUrlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m7t);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTextStickerUrlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xke);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBottomLineViewFromXml(View view) {
        this.LL = view;
    }

    public final void setLayoutStickerUrlFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setTextStickerUrlFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public C0T9C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.azw, this, true);
    }
}
