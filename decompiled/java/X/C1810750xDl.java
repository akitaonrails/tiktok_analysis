package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810750xDl extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public boolean LLILZIL;

    public C1810750xDl(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.tv_ranking_notice_title);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_ranking_notice_body);
        this.LLILLL = (C16F5) view.findViewById(R.id.tv_ranking_notice_btn);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.lst);
    }

    public final void I5(boolean z) {
        C20441214yg.LIZIZ("Creator League Ranking And Tiles", "RankingNoticeViewHolder#changeNoticeItemVisibility");
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(0.0f);
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(0.0f);
                marginLayoutParams.setMargins(0, 0, 0, 0);
                C786410Ut5.W5(view, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        C786410Ut5.LJLLLLLL(0, this.itemView);
        View view2 = this.itemView;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -2;
            marginLayoutParams2.setMargins((int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(0.0f), (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(18.0f));
            C786410Ut5.W5(view2, marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
    }
}
