package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502410Jn5 extends C502700JnY {
    public final View LL;
    public final View LLILLJJLI;

    public C502410Jn5(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = view.findViewById(R.id.fzz);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C502400Jn4 c502400Jn4;
        if ((abstractC503810JpL instanceof C502400Jn4) && (c502400Jn4 = (C502400Jn4) abstractC503810JpL) != null) {
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            layoutParams.height = c502400Jn4.LIZ;
            C786410Ut5.W5(this.LLILLJJLI, layoutParams);
            this.LLILLJJLI.requestLayout();
        }
    }
}
