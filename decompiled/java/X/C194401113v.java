package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.113v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194401113v extends C11BJ {
    @Override // X.C11BJ
    public final C11BM LJFF() {
        C786410Ut5.Sd(R.layout.i5u, C786410Ut5.ne(getContext()), this);
        int i = R.id.cm_;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.cm_, this);
        if (tuxIconView != null) {
            i = R.id.cma;
            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.cma, this);
            if (tuxIconView2 != null) {
                i = R.id.hcj;
                C0I7D c0i7d = (C0I7D) C1616006Uk.LIZ(R.id.hcj, this);
                if (c0i7d != null) {
                    i = R.id.skv;
                    View viewLIZ = C1616006Uk.LIZ(R.id.skv, this);
                    if (viewLIZ != null) {
                        i = R.id.w41;
                        View viewLIZ2 = C1616006Uk.LIZ(R.id.w41, this);
                        if (viewLIZ2 != null) {
                            i = R.id.w42;
                            View viewLIZ3 = C1616006Uk.LIZ(R.id.w42, this);
                            if (viewLIZ3 != null) {
                                return new C11BM(viewLIZ, viewLIZ3, viewLIZ2, tuxIconView, tuxIconView2, c0i7d);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public C194401113v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
