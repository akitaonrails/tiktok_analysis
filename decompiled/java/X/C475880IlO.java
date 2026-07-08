package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475880IlO extends RecyclerView.ViewHolder {
    public final int LL;
    public final ImageView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final LiveIconView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final /* synthetic */ C475870IlN LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475880IlO(C475870IlN c475870IlN, View view, int i) {
        super(view);
        this.LLIZLLLIL = c475870IlN;
        this.LL = i;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.l9w);
        this.LLILLL = (TextView) view.findViewById(R.id.z_s);
        this.LLILZ = (TextView) view.findViewById(R.id.z_t);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.loo);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal;
        c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.ezs, liveIconView.getContext()));
        liveIconView.setIcon(c419910GdJ.LIZ(liveIconView.getContext()));
        liveIconView.setIconTint(C497740JfY.LIZLLL(R.attr.ezs, liveIconView.getContext()));
        this.LLILZIL = liveIconView;
        this.LLILZLL = view.findViewById(R.id.tn3);
        this.LLIZ = view.findViewById(R.id.tn2);
    }
}
