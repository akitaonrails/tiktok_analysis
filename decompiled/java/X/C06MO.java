package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06MO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MO extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    public final TuxTextView getTvAmountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z9h);
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

    public C06MO(Context context) {
        super(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dvu, this, true);
    }

    public final void setTvAmountFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void LIZ(String str, String str2) {
        TuxTextView tvTitleFromXml = getTvTitleFromXml();
        if (tvTitleFromXml != null) {
            tvTitleFromXml.setText(str);
        }
        if (C123100dR.LIZ(str2) && str2 != null) {
            C337180DJs.LIZJ(getTvAmountFromXml());
            getTvAmountFromXml().setText(str2);
        } else {
            C337180DJs.LIZ(getTvAmountFromXml());
        }
    }
}
