package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U9P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9P extends C0U9G {
    public ViewStub LLJJIII;
    public C0U9O LLJJIJI;

    public final void P5() {
        View viewLJLLLL;
        if (this.LLJJIII == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.vth);
            this.LLJJIII = viewStub;
            this.LLJJIJI = (viewStub == null || (viewLJLLLL = C786410Ut5.LJLLLL(viewStub)) == null) ? null : (C0U9O) viewLJLLLL.findViewById(R.id.vtg);
        }
    }

    public C0U9P(View view) {
        super(view);
    }
}
