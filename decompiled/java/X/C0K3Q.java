package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import wh6.AbS324S0300000_7;
import wh6.AbS499S0200000_7;

/* JADX INFO: renamed from: X.0K3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3Q extends C0K3V {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final TextView LLILLL;
    public final TuxIconView LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final C417410GYh LLIZLLLIL;
    public final TextView LLJ;
    public final C0K3W LLJI;
    public final View LLJIJIL;
    public final TextView LLJILJIL;
    public final View LLJILJILJ;
    public final TextView LLJILLL;
    public final TextView LLJJ;

    public final void U5(SpaceCommentItem spaceCommentItem) {
        int i;
        int i2;
        int i3;
        View view = this.LLJILJILJ;
        if (spaceCommentItem.anchorLiked) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        boolean z = spaceCommentItem.userLiked;
        long j = spaceCommentItem.likeCount;
        if (j > 0) {
            this.LLIZ.setText(C511410K3v.LIZIZ(j));
            C786410Ut5.LLIL(this.LLIZ, 0);
        } else {
            this.LLIZ.setText(CardStruct.IStatusCode.DEFAULT);
            C786410Ut5.LLIL(this.LLIZ, 8);
        }
        TuxIconView tuxIconView = this.LLILZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        Context context = this.LL.getContext();
        if (z) {
            i2 = R.attr.f9d;
        } else {
            i2 = R.attr.f9c;
        }
        c419910GdJ.LIZ = C426930God.LIZLLL(i2, context);
        if (z) {
            i3 = R.attr.f_9;
        } else {
            i3 = R.attr.f_i;
        }
        c419910GdJ.LJ = Integer.valueOf(i3);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public C0K3Q(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (TextView) view.findViewById(R.id.ea4);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.f755mn3);
        this.LLILZIL = (TextView) view.findViewById(R.id.frg);
        this.LLILZLL = (TextView) view.findViewById(R.id.ee7);
        this.LLIZ = (TextView) view.findViewById(R.id.mnh);
        this.LLIZLLLIL = (C417410GYh) view.findViewById(R.id.e_j);
        this.LLJ = (TextView) view.findViewById(R.id.ecd);
        this.LLJI = (C0K3W) view.findViewById(R.id.bqd);
        this.LLJIJIL = view.findViewById(R.id.t7t);
        this.LLJILJIL = (TextView) view.findViewById(R.id.t80);
        this.LLJILJILJ = view.findViewById(R.id.m4j);
        this.LLJILLL = (TextView) view.findViewById(R.id.ea_);
        this.LLJJ = (TextView) view.findViewById(R.id.eaa);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K3J c0k3j;
        User user;
        User user2;
        User user3;
        if (abstractC511160K2w instanceof C0K3J) {
            c0k3j = (C0K3J) abstractC511160K2w;
        } else {
            c0k3j = null;
        }
        if (!(interfaceC2753014t instanceof C0K3S) || interfaceC2753014t == null || c0k3j == null) {
            return;
        }
        SpaceCommentItem spaceCommentItem = c0k3j.LIZ;
        C0K3V.T5(spaceCommentItem, this.LLILLL);
        this.LLJ.setText(C0K7S.LIZ(spaceCommentItem.userInfo));
        this.LLJ.requestLayout();
        U5(spaceCommentItem);
        SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyToReplyInfo;
        if (spaceCommentItem2 != null) {
            user = spaceCommentItem2.userInfo;
        } else {
            user = null;
        }
        if (user == null) {
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
            C786410Ut5.LLIL(this.LLJILJIL, 8);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LLJIJIL);
            C786410Ut5.LLIL(this.LLJILJIL, 0);
            SpaceCommentItem spaceCommentItem3 = spaceCommentItem.replyToReplyInfo;
            if (spaceCommentItem3 != null) {
                user2 = spaceCommentItem3.userInfo;
            } else {
                user2 = null;
            }
            this.LLJILJIL.setText(C0K7S.LIZ(user2));
            TextView textView = this.LLJILJIL;
            SpaceCommentItem spaceCommentItem4 = spaceCommentItem.replyToReplyInfo;
            if (spaceCommentItem4 != null) {
                user3 = spaceCommentItem4.userInfo;
            } else {
                user3 = null;
            }
            N5(textView, user3, c0k3j.LIZIZ, this.LLILLJJLI.yQ2());
        }
        this.LLILZLL.setText(C2215121Bmo.LIZ(spaceCommentItem.createTimeSec * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        this.LLILZLL.requestLayout();
        C786410Ut5.I7(new AbS324S0300000_7(this, spaceCommentItem, c0k3j, 8), this.LLILZ);
        this.LL.setOnLongClickListener(new ViewOnLongClickListenerC521660Kd2(this, c0k3j, 2));
        this.LLILLL.setOnLongClickListener(new ViewOnLongClickListenerC521660Kd2(this, c0k3j, 3));
        C786410Ut5.I7(new AbS499S0200000_7(this, c0k3j, 7), this.LLILLL);
        C786410Ut5.I7(new AbS499S0200000_7(this, c0k3j, 8), this.LLILZIL);
        C511410K3v.LIZ(this.LLIZLLLIL, spaceCommentItem.userInfo, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        if (((C0K3S) interfaceC2753014t).LLJILJIL) {
            L5(this.LLJ, spaceCommentItem.userInfo, c0k3j.LIZIZ, null);
            L5(this.LLIZLLLIL, spaceCommentItem.userInfo, c0k3j.LIZIZ, null);
        } else {
            N5(this.LLJ, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.yQ2());
            N5(this.LLIZLLLIL, spaceCommentItem.userInfo, c0k3j.LIZIZ, this.LLILLJJLI.yQ2());
        }
        if (spaceCommentItem.anchorCommented) {
            this.LLJILLL.setText("·");
            C786410Ut5.LLIL(this.LLJILLL, 0);
            C786410Ut5.LLIL(this.LLJJ, 0);
        } else {
            C786410Ut5.LLIL(this.LLJILLL, 8);
            C786410Ut5.LLIL(this.LLJJ, 8);
        }
        if (!spaceCommentItem.anchorCommented) {
            C0K3V.S5(this.LLJI, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
        } else {
            C786410Ut5.R0(this.LLJI, 8);
        }
    }
}
