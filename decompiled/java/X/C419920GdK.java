package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419920GdK extends FrameLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public ImageView LLILLL;

    public final ImageView getAdArrowImgIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a73);
            this.LLILLL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final TuxTextView getAdNickNameTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a6p);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getAdOwnerLlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a6q);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setAdArrowImgIvFromXml(ImageView imageView) {
        this.LLILLL = imageView;
    }

    public final void setAdNickNameTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setAdOwnerLlFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C419920GdK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.azq, this, true);
    }
}
