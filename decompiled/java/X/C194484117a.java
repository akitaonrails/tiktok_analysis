package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.117a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194484117a extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final ImageView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TextView LLILZ;
    public final LinearLayout LLILZIL;
    public final ImageView LLILZLL;
    public final Context LLIZ;

    public C194484117a(Context context, View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.jgq);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.jgn);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.k10);
        this.LLILZ = (TextView) view.findViewById(R.id.f729jgp);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.eu1);
        this.LLILZLL = (ImageView) view.findViewById(R.id.kgp);
        this.LLIZ = context;
    }
}
