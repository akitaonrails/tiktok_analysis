package X;

import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import wh6.AbS324S0300000_7;
import wh6.AbS499S0200000_7;

/* JADX INFO: renamed from: X.0K3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511340K3o extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TuxIconView LLILLL;
    public final C417410GYh LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;

    public C511340K3o(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TuxIconView) view.findViewById(R.id.f755mn3);
        this.LLILZ = (C417410GYh) view.findViewById(R.id.a14);
        this.LLILZIL = (TextView) view.findViewById(R.id.a12);
        this.LLILZLL = (TextView) view.findViewById(R.id.mnz);
        this.LLIZ = (TextView) view.findViewById(R.id.ebw);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511120K2s c511120K2s;
        C511370K3r c511370K3r;
        String strLJII;
        if ((abstractC511160K2w instanceof C511120K2s) && (c511120K2s = (C511120K2s) abstractC511160K2w) != null && (interfaceC2753014t instanceof C511370K3r) && (c511370K3r = (C511370K3r) interfaceC2753014t) != null) {
            SpacePost spacePost = c511120K2s.LIZ;
            C786410Ut5.I7(new ACListenerS111S0200000_7(spacePost, this, 47), this.LL);
            V5(spacePost.likeCount, spacePost.userLiked);
            TextView textView = this.LLIZ;
            long j = spacePost.commentCount;
            if (j > 0) {
                strLJII = C511410K3v.LIZIZ(j);
            } else {
                strLJII = C511520K4g.LJII(2131839614);
            }
            textView.setText(strLJII);
            C786410Ut5.I7(new AbS324S0300000_7(spacePost, this, c511120K2s, 13), this.LLILZLL);
            C786410Ut5.I7(new AbS324S0300000_7(spacePost, this, c511120K2s, 14), this.LLILLL);
            if (c511370K3r.LLJILLL) {
                C0K0R.LIZ(this.LLILZ);
                C0K0R.LIZ(this.LLILZIL);
            } else {
                C0K0R.LIZJ(this.LLILZ);
                C0K0R.LIZJ(this.LLILZIL);
                C511410K3v.LIZ(this.LLILZ, c511370K3r.LLILLJJLI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                C786410Ut5.I7(new AbS499S0200000_7(spacePost, this, 15), this.LLILZIL);
            }
        }
    }

    public final void U5(SpacePost spacePost, C511120K2s c511120K2s) {
        if (spacePost.userLiked) {
            V5(spacePost.likeCount - 1, false);
            this.LLILLJJLI.CQ2(spacePost.postId, 1, c511120K2s.LIZ);
        } else {
            V5(spacePost.likeCount + 1, true);
            this.LLILLJJLI.CQ2(spacePost.postId, 0, c511120K2s.LIZ);
        }
    }

    public final void V5(long j, boolean z) {
        String strLJII;
        int i;
        int i2;
        TextView textView = this.LLILZLL;
        if (j > 0) {
            strLJII = C511410K3v.LIZIZ(j);
        } else {
            strLJII = C511520K4g.LJII(2131839617);
        }
        textView.setText(strLJII);
        this.LLIZ.requestLayout();
        this.LLILZLL.requestLayout();
        TuxIconView tuxIconView = this.LLILLL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        Context context = this.LL.getContext();
        if (z) {
            i = R.attr.f9d;
        } else {
            i = R.attr.f9c;
        }
        c419910GdJ.LIZ = C426930God.LIZLLL(i, context);
        if (z) {
            i2 = R.attr.f_9;
        } else {
            i2 = R.attr.a1k;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
