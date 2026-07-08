package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ZF extends FrameLayout {
    public View LL;
    public C424560Gko LLILLJJLI;
    public C19RV LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;

    public final C19RV getAvatarContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bi2);
            this.LLILLL = (C19RV) callbackFindViewById;
        }
        return (C19RV) callbackFindViewById;
    }

    public final C424560Gko getAvatarIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.biz);
            this.LLILLJJLI = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final TuxTextView getDescriptionTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fpi);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getSlotLayoutFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vl8);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public final View getSpaceViewFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vry);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3j);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C06ZF(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.pe, C786410Ut5.ne(context), this);
    }

    public final void setAvatarContainerFromXml(C19RV c19rv) {
        this.LLILLL = c19rv;
    }

    public final void setAvatarIvFromXml(C424560Gko c424560Gko) {
        this.LLILLJJLI = c424560Gko;
    }

    public final void setDescriptionTvFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setSlotLayoutFromXml(View view) {
        this.LL = view;
    }

    public final void setSpaceViewFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void setTitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }
}
