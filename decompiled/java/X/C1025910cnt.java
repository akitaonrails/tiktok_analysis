package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025910cnt extends FrameLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public InterfaceC1025990co1 LLILZ;
    public String LLILZIL;

    public final TuxIconView getPopUpWebCloseAllFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhh);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhw);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhx);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getDefTitle() {
        return this.LLILZIL;
    }

    public final InterfaceC1025990co1 getTitleBarListener() {
        return this.LLILZ;
    }

    public final void setDefTitle(String str) {
        this.LLILZIL = str;
    }

    public final void setPopUpWebCloseAllFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setPopUpWebSubtitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setPopUpWebTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setSubTitle(String str) {
        getPopUpWebSubtitleFromXml().setText(str);
    }

    public final void setTitleBarListener(InterfaceC1025990co1 interfaceC1025990co1) {
        this.LLILZ = interfaceC1025990co1;
    }

    public C1025910cnt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i9u, this, true);
    }
}
