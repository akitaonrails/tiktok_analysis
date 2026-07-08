package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345530Dgd extends FrameLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public final int LLILZIL;

    public final LinearLayout getTipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyc);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getTipIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyd);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTipTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xye);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTipTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyf);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final int getLayout() {
        return this.LLILZIL;
    }

    public C345530Dgd(Context context) {
        super(context, null, 0);
        this.LLILZIL = R.layout.cpo;
        C786410Ut5.LJLLJ(getContext(), R.layout.cpo, this);
    }

    public final void setTipContainerFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setTipIvFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setTipTitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTipTvFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void LIZ(String str, String str2, EnumC345550Dgf enumC345550Dgf) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        getTipIvFromXml().setIconRes(R.raw.icon_info_circle);
        getTipTitleTvFromXml().setText(str);
        getTipTvFromXml().setText(str2);
        ViewGroup.LayoutParams layoutParams = getTipContainerFromXml().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        int i = C345540Dge.LIZ[enumC345550Dgf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    marginLayoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                }
            } else {
                marginLayoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 2);
            }
        } else {
            marginLayoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        C786410Ut5.d6(getTipContainerFromXml(), marginLayoutParams);
    }
}
