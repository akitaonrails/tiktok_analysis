package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340060DUu extends RecyclerView.ViewHolder {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;

    public C340060DUu(View view) {
        super(view);
        this.LL = (TuxIconView) view.findViewById(R.id.f_6);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.f_7);
    }

    public final void I5(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LL;
            tuxIconView.setTintColorRes(R.attr.zi);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            this.LLILLJJLI.setTextColorRes(R.attr.zi);
            return;
        }
        TuxIconView tuxIconView2 = this.LL;
        tuxIconView2.setTintColorRes(R.attr.zl);
        tuxIconView2.setBackground(null);
        this.LLILLJJLI.setTextColorRes(R.attr.zl);
    }
}
