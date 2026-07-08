package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DK9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DK9 extends RecyclerView.ViewHolder {
    public static final float LLILLJJLI = C418440Gaw.LIZIZ(10);
    public final TuxIconView LL;

    public C0DK9(View view) {
        super(view);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ado);
        this.LL = tuxIconView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(LLILLJJLI);
        tuxIconView.setBackground(c384050F3z.LIZ(view.getContext()));
    }
}
