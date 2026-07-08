package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390960mIg extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final FrameLayout LLILLL;

    public C1390960mIg(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.jzg);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.k2f);
    }

    public final void I5(C1687890u1b c1687890u1b) {
        C786410Ut5.O7(this.LLILLL, c1687890u1b.LJIIIIZZ);
        int i = c1687890u1b.LIZIZ;
        if (i != 0) {
            this.LLILLJJLI.setIconRes(i);
            if (Intrinsics.LJFF(c1687890u1b.LJ, "login_3p_more_options")) {
                this.LLILLJJLI.setTintColorRes(R.attr.a1h);
                return;
            }
            return;
        }
        this.LLILLJJLI.setIconRes(c1687890u1b.LIZ);
    }
}
