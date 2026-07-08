package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0m2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380730m2B extends LinearLayout {
    public Context LL;
    public TuxTextView LLILLJJLI;
    public C427870Gq9 LLILLL;
    public String LLILZ;
    public UrlModel LLILZIL;
    public InterfaceC1380740m2C LLILZLL;

    public final Drawable getDefaultDrawable() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        return c419910GdJ.LIZ(getContext());
    }

    public final C427870Gq9 getLiveShareUserIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n61);
            this.LLILLL = (C427870Gq9) callbackFindViewById;
        }
        return (C427870Gq9) callbackFindViewById;
    }

    public final TuxTextView getLiveShareUserNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n62);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Context getMContext() {
        return this.LL;
    }

    public C1380730m2B(Context context) {
        super(context);
        this.LL = context;
        C786410Ut5.LJLLJ(context, R.layout.f8m, this);
    }

    public final void setLiveShareUserIconFromXml(C427870Gq9 c427870Gq9) {
        this.LLILLL = c427870Gq9;
    }

    public final void setLiveShareUserNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setMContext(Context context) {
        this.LL = context;
    }
}
