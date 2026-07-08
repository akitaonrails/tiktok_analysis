package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import p5a.a;

/* JADX INFO: renamed from: X.0iKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class ViewOnClickListenerC1238510iKn extends LinearLayout implements View.OnClickListener {
    public final Context LL;
    public final AttributeSet LLILLJJLI;
    public final int LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public TuxIconView LLIZLLLIL;
    public ImageView LLJ;
    public TuxTextView LLJI;
    public InterfaceC1238520iKo LLJIJIL;

    public final C197039127h getIvButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.laj);
            this.LLIZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxIconView getIvCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lc0);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getIvContextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ld2);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ImageView getIvIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lkw);
            this.LLJ = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final TuxTextView getIvTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lxz);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getNoticeBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pco);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getTitleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y0w);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TextView getContextTextView() {
        return getIvContextFromXml();
    }

    public final TextView getTitleTextView() {
        return getIvTitleFromXml();
    }

    public final AttributeSet getAttrs() {
        return this.LLILLJJLI;
    }

    public final int getDefStyleAttr() {
        return this.LLILLL;
    }

    public final InterfaceC1238520iKo getMClickListener() {
        return this.LLJIJIL;
    }

    public final Context getMContext() {
        return this.LL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        InterfaceC1238520iKo interfaceC1238520iKo;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        int id = getIvButtonFromXml().getId();
        if (numValueOf != null && numValueOf.intValue() == id) {
            InterfaceC1238520iKo interfaceC1238520iKo2 = this.LLJIJIL;
            if (interfaceC1238520iKo2 != null) {
                interfaceC1238520iKo2.LIZIZ();
                return;
            }
            return;
        }
        int id2 = getIvCloseFromXml().getId();
        if (numValueOf != null && numValueOf.intValue() == id2) {
            InterfaceC1238520iKo interfaceC1238520iKo3 = this.LLJIJIL;
            if (interfaceC1238520iKo3 == null) {
                return;
            }
            interfaceC1238520iKo3.LIZ();
            return;
        }
        int id3 = getIvContextFromXml().getId();
        if (numValueOf != null && numValueOf.intValue() == id3) {
            InterfaceC1238520iKo interfaceC1238520iKo4 = this.LLJIJIL;
            if (interfaceC1238520iKo4 == null) {
                return;
            }
            interfaceC1238520iKo4.LIZJ();
            return;
        }
        int id4 = getIvTitleFromXml().getId();
        if (numValueOf == null || numValueOf.intValue() != id4 || (interfaceC1238520iKo = this.LLJIJIL) == null) {
            return;
        }
        interfaceC1238520iKo.LIZJ();
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        getIvButtonFromXml().setBackground(drawable);
    }

    public final void setButtonTextColor(int i) {
        getIvButtonFromXml().setTextColor(i);
    }

    public final void setContextText(String str) {
        getIvContextFromXml().setText(str);
    }

    public final void setIconImage(Drawable drawable) {
        getIvIconFromXml().setImageDrawable(drawable);
    }

    public final void setItemText(String str) {
        getIvButtonFromXml().setText(str);
    }

    public final void setIvButtonFromXml(C197039127h c197039127h) {
        this.LLIZ = c197039127h;
    }

    public final void setIvCloseFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setIvContextFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setIvIconFromXml(ImageView imageView) {
        this.LLJ = imageView;
    }

    public final void setIvTitleFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setMClickListener(InterfaceC1238520iKo interfaceC1238520iKo) {
        this.LLJIJIL = interfaceC1238520iKo;
    }

    public final void setNoticeBgFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setOnInternalClickListener(InterfaceC1238520iKo interfaceC1238520iKo) {
        this.LLJIJIL = interfaceC1238520iKo;
    }

    public final void setTitleContainerFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setTitleText(int i) {
        getIvTitleFromXml().setText(getContext().getResources().getText(i));
    }

    public final void setTitleTextColor(int i) {
        getIvTitleFromXml().setTextColor(i);
    }

    public final void setTitleText(String str) {
        getIvTitleFromXml().setText(str);
    }

    public ViewOnClickListenerC1238510iKn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = context;
        this.LLILLJJLI = attributeSet;
        this.LLILLL = 0;
        LinearLayout.inflate(context, R.layout.efr, this);
        C786410Ut5.U8(getIvButtonFromXml(), this);
        C786410Ut5.a9(getIvCloseFromXml(), this);
        C786410Ut5.h9(getIvContextFromXml(), this);
        C786410Ut5.h9(getIvTitleFromXml(), this);
        getIvButtonFromXml().setOnTouchListener(new a(0.5f, 150L));
        getIvCloseFromXml().setOnTouchListener(new a(0.5f, 150L));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeButtonView);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeButtonView_bv_iconImage);
        if (drawable != null) {
            getIvIconFromXml().setImageDrawable(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeButtonView_bv_closeImage);
        if (drawable2 != null) {
            getIvCloseFromXml().setImageDrawable(drawable2);
        }
        getIvTitleFromXml().setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeButtonView_bv_titleText));
        getIvContextFromXml().setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeButtonView_bv_contentText));
        getIvButtonFromXml().setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeButtonView_bv_itemText));
        typedArrayObtainStyledAttributes.recycle();
    }
}
