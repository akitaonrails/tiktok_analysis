package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216200hko extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxTextView LLILZ;

    public final void I5() {
        FrameLayout frameLayout;
        Context context = this.itemView.getContext();
        if (context == null || (frameLayout = this.LLILLL) == null) {
            return;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        frameLayout.setBackground(c384050F3z.LIZ(context));
    }

    public C1216200hko(View view) {
        super(view);
        this.LL = (SmartImageView) view.findViewById(R.id.vd3);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.z1m);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.i87);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.zp1);
    }
}
