package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424470Gkf extends FrameLayout {
    public C0HZQ LL;
    public TuxTextView LLILLJJLI;

    public final C0HZQ getConfirmUsageCheckBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eol);
            this.LL = (C0HZQ) callbackFindViewById;
        }
        return (C0HZQ) callbackFindViewById;
    }

    public final TuxTextView getMusicUsageTextViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.osm);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setConfirmUsageCheckBoxFromXml(C0HZQ c0hzq) {
        this.LL = c0hzq;
    }

    public final void setMusicUsageTextViewFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C424470Gkf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d6u, this, true);
    }
}
