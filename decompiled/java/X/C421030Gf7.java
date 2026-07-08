package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421030Gf7 extends RecyclerView.ViewHolder {
    public final TuxIconView LL;

    public C421030Gf7(View view) {
        super(view);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ado);
        this.LL = tuxIconView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        tuxIconView.setBackground(c384050F3z.LIZ(view.getContext()));
    }
}
