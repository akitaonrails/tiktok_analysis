package X;

import Y.ACListenerS143S0100000_8;
import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21641619mo extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C417370GYd LLILLL;
    public C418740GbQ LLILZ;
    public LinearLayout LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    private final C418740GbQ getCloseImage() {
        return (C418740GbQ) this.LLJ.getValue();
    }

    private final C417370GYd getIconImage() {
        return (C417370GYd) this.LLIZLLLIL.getValue();
    }

    private final LinearLayout getNoticeRoot() {
        return (LinearLayout) this.LLJI.getValue();
    }

    private final TuxTextView getTitleContext() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final TuxTextView getTitleText() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    public final C418740GbQ getCloseImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2e);
            this.LLILZ = (C418740GbQ) callbackFindViewById;
        }
        return (C418740GbQ) callbackFindViewById;
    }

    public final C417370GYd getIconImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k14);
            this.LLILLL = (C417370GYd) callbackFindViewById;
        }
        return (C417370GYd) callbackFindViewById;
    }

    public final LinearLayout getNoticeRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pd3);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zf0);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setCloseImageFromXml(C418740GbQ c418740GbQ) {
        this.LLILZ = c418740GbQ;
    }

    public final void setContentClickListener(Function0<Unit> function0) {
        C786410Ut5.h9(getTitleContext(), new ACListenerS167S0100000_33(function0, 63));
    }

    public final void setIconImage(Drawable drawable) {
        getIconImage().setImageDrawable(drawable);
    }

    public final void setIconImageFromXml(C417370GYd c417370GYd) {
        this.LLILLL = c417370GYd;
    }

    public final void setNoticeRootFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setOnCloseClickListener(Function0<Unit> function0) {
        C786410Ut5.Ua(getCloseImage(), new ACListenerS143S0100000_8(function0, 78));
    }

    public final void setTitleContent(CharSequence charSequence) {
        getTitleContext().setText(charSequence);
    }

    public final void setTitleText(CharSequence charSequence) {
        getTitleText().setText(charSequence);
    }

    public final void setTvContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C21641619mo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3185));
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3184));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3182));
        this.LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3181));
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3183));
        C786410Ut5.LJLLJ(context, R.layout.d6y, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeView);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeView_iconImage);
        if (drawable != null) {
            getIconImage().setImageDrawable(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeView_closeImage);
        if (drawable2 != null) {
            getCloseImage().setImageDrawable(drawable2);
        }
        getTitleText().setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeView_titleText));
        getTitleContext().setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeView_titleContent));
        getTitleContext().setTextColor(C446980Hfs.LIZ(getContext(), R.color.da));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.NoticeView_noticeBackgroundColor, C446980Hfs.LIZ(getContext(), R.color.ao));
        typedArrayObtainStyledAttributes.recycle();
        C2275681E5m.LIZ(color, C366700EZg.LIZIZ(4.0d, context), C446980Hfs.LIZ(getContext(), R.color.d1), C366700EZg.LIZIZ(12.0d, context), 0, 2, this);
        C786410Ut5.R7(getNoticeRoot(), new View.OnClickListener() { // from class: X.19mq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
