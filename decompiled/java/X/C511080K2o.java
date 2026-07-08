package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import wh6.AbS499S0200000_7;

/* JADX INFO: renamed from: X.0K2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511080K2o extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final C417410GYh LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final C0K3W LLIZLLLIL;
    public final View LLJ;

    public C511080K2o(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TextView) view.findViewById(R.id.eaf);
        this.LLILZ = (TextView) view.findViewById(R.id.ecd);
        C417410GYh c417410GYh = (C417410GYh) view.findViewById(R.id.e_j);
        this.LLILZIL = c417410GYh;
        this.LLILZLL = (TextView) view.findViewById(R.id.ea_);
        this.LLIZ = (TextView) view.findViewById(R.id.eaa);
        this.LLIZLLLIL = (C0K3W) view.findViewById(R.id.bqd);
        this.LLJ = view.findViewById(R.id.m4j);
        c417410GYh.getHierarchy().LJIJI(0);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K3J c0k3j;
        C511370K3r c511370K3r;
        int i;
        if ((abstractC511160K2w instanceof C0K3J) && (c0k3j = (C0K3J) abstractC511160K2w) != null && (interfaceC2753014t instanceof C511370K3r) && (c511370K3r = (C511370K3r) interfaceC2753014t) != null) {
            SpaceCommentItem spaceCommentItem = c0k3j.LIZ;
            C0K3V.T5(spaceCommentItem, this.LLILLL);
            this.LLILZ.setText(C0K7S.LIZ(spaceCommentItem.userInfo));
            C511410K3v.LIZ(this.LLILZIL, spaceCommentItem.userInfo, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            if (c511370K3r.LLILZIL) {
                L5(this.LLILZ, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.xQ2());
                L5(this.LLILZIL, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.xQ2());
            } else {
                N5(this.LLILZ, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.xQ2());
                N5(this.LLILZIL, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.xQ2());
            }
            C786410Ut5.I7(new AbS499S0200000_7(c0k3j, this, 14), this.LL);
            this.LLILZ.requestLayout();
            View view = this.LLJ;
            if (spaceCommentItem.anchorLiked) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
            if (spaceCommentItem.anchorCommented) {
                this.LLILZLL.setText("·");
                C786410Ut5.LLIL(this.LLILZLL, 0);
                C786410Ut5.LLIL(this.LLIZ, 0);
            } else {
                C786410Ut5.LLIL(this.LLILZLL, 8);
                C786410Ut5.LLIL(this.LLIZ, 8);
            }
            if (!spaceCommentItem.anchorCommented) {
                C0K3V.S5(this.LLIZLLLIL, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
            } else {
                C786410Ut5.R0(this.LLIZLLLIL, 8);
            }
        }
    }
}
