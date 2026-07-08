package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.038T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038T extends FrameLayout {
    public TuxTextView LL;

    public final TuxTextView getTextStickerUrlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xke);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setTextStickerUrlFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C038T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.azs, this, true);
    }
}
