package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354570lLz extends FrameLayout {
    public TuxIconView LL;
    public C427870Gq9 LLILLJJLI;
    public FrameLayout LLILLL;
    public LinearLayout LLILZ;
    public FrameLayout LLILZIL;
    public C1390410mHn LLILZLL;
    public SmartImageView LLIZ;
    public TuxIconView LLIZLLLIL;
    public C1354620lM4 LLJ;

    public final TuxIconView getCancelButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.db1);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getCoverVideoViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5r);
            this.LLIZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C1390410mHn getDualBallLoadingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gb3);
            this.LLILZLL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final TuxIconView getErrorViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hc6);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C427870Gq9 getIvAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l9h);
            this.LLILLJJLI = (C427870Gq9) callbackFindViewById;
        }
        return (C427870Gq9) callbackFindViewById;
    }

    public final FrameLayout getQuickPublishFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sne);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getStatusViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w28);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getStoryNormalQuickPostFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w9i);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1354620lM4 getParams() {
        return this.LLJ;
    }

    public C1354570lLz(Context context) {
        super(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setCancelButtonFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setCancelClickLogic(Function0<Unit> function0) {
        C786410Ut5.a9(getCancelButtonFromXml(), new ACListenerS155S0100000_21(function0, 184));
    }

    public final void setCoverVideoViewFromXml(SmartImageView smartImageView) {
        this.LLIZ = smartImageView;
    }

    public final void setDualBallLoadingFromXml(C1390410mHn c1390410mHn) {
        this.LLILZLL = c1390410mHn;
    }

    public final void setErrorViewFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setIvAvatarFromXml(C427870Gq9 c427870Gq9) {
        this.LLILLJJLI = c427870Gq9;
    }

    public final void setParams(C1354620lM4 c1354620lM4) {
        this.LLJ = c1354620lM4;
    }

    public final void setQuickPublishFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setStatusViewFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setStoryNormalQuickPostFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }
}
