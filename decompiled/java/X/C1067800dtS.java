package X;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067800dtS extends AbstractC1067810dtT {
    public View LIZ;
    public ProgressBar LIZIZ;

    @Override // X.InterfaceC1542250qEh
    public final void LIZ(boolean z) {
        int i;
        View view = this.LIZ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC1542250qEh
    public final View LIZIZ(Context context) {
        ProgressBar progressBar = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.eat, null, false);
        this.LIZ = viewTd;
        if (viewTd != null) {
            progressBar = (ProgressBar) viewTd.findViewById(R.id.ruo);
        }
        this.LIZIZ = progressBar;
        View view = this.LIZ;
        if (view == null) {
            return new View(context);
        }
        return view;
    }

    @Override // X.InterfaceC1542250qEh
    public final void setProgress(int i) {
        ProgressBar progressBar = this.LIZIZ;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }
}
