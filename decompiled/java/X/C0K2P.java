package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K2P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2P extends C0K3V {
    public final View LL;
    public final View LLILLJJLI;

    public C0K2P(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = view.findViewById(R.id.fzz);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K2M c0k2m;
        if ((abstractC511160K2w instanceof C0K2M) && (c0k2m = (C0K2M) abstractC511160K2w) != null) {
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            layoutParams.height = c0k2m.LIZ;
            C786410Ut5.W5(this.LLILLJJLI, layoutParams);
            this.LLILLJJLI.requestLayout();
        }
    }
}
