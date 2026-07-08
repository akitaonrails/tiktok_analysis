package X;

import Y.ACListenerS89S0300000_25;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import u4.q0;

/* JADX INFO: renamed from: X.0sqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642700sqi extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final String LLILLJJLI;

    public C1642700sqi(C1642710sqj c1642710sqj, FrameLayout frameLayout) {
        super(frameLayout);
        this.LL = (TextView) frameLayout.getChildAt(0);
        this.LLILLJJLI = c1642710sqj.LLILLL.getContext().getResources().getString(2131823349);
        C786410Ut5.O7(frameLayout, new ACListenerS89S0300000_25(this, c1642710sqj, c1642710sqj.LLILLL, 0));
        q0.LJIJ(frameLayout, new C1698450uId(this, 1));
    }
}
