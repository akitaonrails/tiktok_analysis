package X;

import Y.ACListenerS92S0300000_28;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20731616Ao extends RecyclerView.ViewHolder {
    public final C21616519il LL;
    public C1261860iwS LLILLJJLI;

    public C20731616Ao(View view, RecSwipeViewModel recSwipeViewModel) {
        super(view);
        C21616519il c21616519il = new C21616519il(this.itemView, AbstractC21616419ik.LJIIL);
        C21581419d6 c21581419d6 = new C21581419d6();
        c21581419d6.LJIIIIZZ = 0.0f;
        c21581419d6.LIZ(0.5f);
        c21581419d6.LIZIZ(200.0f);
        c21616519il.LJJ = c21581419d6;
        this.LL = c21616519il;
        view.setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(recSwipeViewModel, 1));
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.bzz), new ACListenerS92S0300000_28(view, recSwipeViewModel, this, 7));
        view.findViewById(R.id.bzz).setTag(R.id.ekt, Boolean.TRUE);
    }
}
