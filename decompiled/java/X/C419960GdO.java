package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419960GdO extends FrameLayout {
    public LinearLayout LL;
    public RemoteImageView LLILLJJLI;
    public TuxTextView LLILLL;

    public C419960GdO(Context context) {
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.dqu, C786410Ut5.ne(context), this);
        if (viewSd != null) {
            this.LL = (LinearLayout) viewSd.findViewById(R.id.tqy);
            this.LLILLJJLI = (RemoteImageView) viewSd.findViewById(R.id.lkw);
            this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.zhs);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iLJ = (int) ((((double) C11VU.LJ(getContext())) * 0.6d) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58))));
        if (size > iLJ) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iLJ, Integer.MIN_VALUE), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
