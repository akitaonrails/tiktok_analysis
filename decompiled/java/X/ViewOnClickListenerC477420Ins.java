package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;

/* JADX INFO: renamed from: X.0Ins, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC477420Ins extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final C0IPB LL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaAutoReplyListActivity baAutoReplyListActivity = this.LL.LL;
        if (baAutoReplyListActivity != null) {
            int adapterPosition = getAdapterPosition();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(baAutoReplyListActivity, "//setting/ba/auto_reply");
            smartRouteBuildRoute.withParam("mid", ((C475600Ikw) ListProtector.get(baAutoReplyListActivity.LLILZLL, adapterPosition)).LIZ);
            smartRouteBuildRoute.withParam("enterFrom", "business_auto_reply");
            smartRouteBuildRoute.open();
        }
    }

    public ViewOnClickListenerC477420Ins(C0IPB c0ipb, View view) {
        super(view);
        this.LL = c0ipb;
        C786410Ut5.I7(this, view);
    }
}
