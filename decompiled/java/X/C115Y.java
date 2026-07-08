package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.115Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C115Y extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final C1324800kZy LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final ImageView LLILZIL;
    public final FrameLayout LLILZLL;
    public final View LLIZ;
    public final TuxIconView LLIZLLLIL;

    public C115Y(View view) {
        super(view);
        this.LL = (ImageView) view.findViewById(R.id.lgl);
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.lgk);
        this.LLILLJJLI = c1324800kZy;
        this.LLILLL = (TextView) view.findViewById(R.id.zjf);
        this.LLILZ = (TextView) view.findViewById(R.id.zqd);
        this.LLILZIL = (ImageView) view.findViewById(R.id.bnt);
        this.LLILZLL = (FrameLayout) view.findViewById(R.id.lgj);
        this.LLIZ = view.findViewById(R.id.lgi);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.n3g);
        c1324800kZy.LLJILJIL = true;
        c1324800kZy.setRectFRadius(C11VU.LIZ(6.0f));
        int i = C1324800kZy.LLJILLL;
        c1324800kZy.setClipStyle(1);
    }
}
