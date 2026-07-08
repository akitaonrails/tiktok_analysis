package X;

import android.view.View;
import android.view.ViewStub;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: X.1DTY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DTY {
    public ViewDataBinding LIZ;
    public View LIZIZ;
    public C2256371DTf LIZJ;

    public C1DTY(ViewStub viewStub) {
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.1DTX
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                C1DTY c1dty = this.LIZ;
                c1dty.LIZIZ = view;
                c1dty.LIZ = C1842040y2E.LIZ.LIZIZ(c1dty.LIZJ.LLJI, view, viewStub2.getLayoutResource());
                this.LIZ.getClass();
                LJII();
                LIZLLL();
            }
        });
    }
}
