package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0Deg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344320Deg extends FrameLayout {
    public View LL;
    public RemoteImageView LLILLJJLI;
    public TuxTextView LLILLL;

    public C344320Deg(Context context) {
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.dqy, C786410Ut5.ne(context), this);
        this.LL = viewSd.findViewById(R.id.nfg);
        this.LLILLJJLI = (RemoteImageView) viewSd.findViewById(R.id.lkw);
        this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.zhs);
    }

    public final void setActionListener(View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(onClickListener);
    }
}
