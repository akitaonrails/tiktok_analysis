package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0LAP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAP extends FrameLayout {
    public C418880Gbe LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;

    public final TuxIconView getIcErrorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jvc);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvNoticeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zzk);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C418880Gbe getVLoadingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v_loading);
            this.LL = (C418880Gbe) callbackFindViewById;
        }
        return (C418880Gbe) callbackFindViewById;
    }

    public final void setIcErrorFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setTvNoticeFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setVLoadingFromXml(C418880Gbe c418880Gbe) {
        this.LL = c418880Gbe;
    }

    public C0LAP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.iap, this);
    }
}
