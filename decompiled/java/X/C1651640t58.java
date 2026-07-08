package X;

import Y.ACListenerS89S0300000_25;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0t58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651640t58 extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final TuxIconView LLILLJJLI;
    public final TextView LLILLL;
    public final TuxIconView LLILZ;

    public C1651640t58(C1651660t5A c1651660t5A, View view) {
        super(view);
        this.LL = (SmartImageView) view.findViewById(R.id.lkw);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.lul);
        this.LLILLL = (TextView) view.findViewById(R.id.zq4);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.lul);
        C786410Ut5.I7(new ACListenerS89S0300000_25(this, c1651660t5A, view, 1), view);
    }
}
