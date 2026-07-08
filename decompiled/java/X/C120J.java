package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.120J, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120J extends C214906198m {
    public final ARunnableS129S0100000_29 LL = new ARunnableS129S0100000_29(this, 242);
    public final RemoteImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public C120J(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.e9t, C786410Ut5.ne(context), null);
        this.LLILZ = viewSd;
        setContentView(viewSd);
        this.LLILLJJLI = (RemoteImageView) viewSd.findViewById(R.id.loy);
        this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.tv_popup_title);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.ik);
        setBackgroundDrawable(new ColorDrawable(0));
        viewSd.measure(0, 0);
    }
}
