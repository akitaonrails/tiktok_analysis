package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K1O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1O extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final View LLILLJJLI;
    public final TuxTag LLILLL;
    public final ImageView LLILZ;
    public final View LLILZIL;
    public final TuxIconView LLILZLL;

    public C0K1O(View view) {
        super(view);
        this.LL = (ImageView) view.findViewById(R.id.video_cover_1);
        this.LLILLJJLI = view.findViewById(R.id.pwl);
        this.LLILLL = (TuxTag) view.findViewById(R.id.q_r);
        this.LLILZ = (ImageView) view.findViewById(R.id.nox);
        this.LLILZIL = view.findViewById(R.id.c96);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.wla);
    }
}
