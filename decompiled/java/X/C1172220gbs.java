package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172220gbs extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C427760Gpy LLILLL;
    public final View LLILZ;
    public final TuxSkeletonLayout LLILZIL;
    public final TuxIconView LLILZLL;

    public C1172220gbs(View view) {
        super(view);
        this.LL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.zhb);
        this.LLILLL = (C427760Gpy) view.findViewById(R.id.yzt);
        this.LLILZ = view.findViewById(R.id.j4k);
        this.LLILZIL = (TuxSkeletonLayout) view.findViewById(R.id.vev);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.k14);
    }
}
