package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0K38, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K38 extends C0K3V {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final TuxIconView LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;

    public C0K38(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rj9);
        this.LLILZ = (TextView) view.findViewById(R.id.rgf);
        this.LLILZIL = (TextView) view.findViewById(R.id.rfj);
        this.LLILZLL = view.findViewById(R.id.rfk);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.f755mn3);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.mnh);
        this.LLJ = (TextView) view.findViewById(R.id.rjc);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511150K2v c511150K2v;
        C0K3S c0k3s;
        List<SpacePollOption> list;
        Boolean boolValueOf = null;
        if ((abstractC511160K2w instanceof C511150K2v) && (c511150K2v = (C511150K2v) abstractC511160K2w) != null && (interfaceC2753014t instanceof C0K3S) && (c0k3s = (C0K3S) interfaceC2753014t) != null) {
            SpacePost spacePost = c511150K2v.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(spacePost.text);
            sbLIZ.append('\"');
            this.LLILLL.setText(C2188811AlT.LIZIZ(sbLIZ));
            TextView textView = this.LLJ;
            String strLJII = C511520K4g.LJII(2131839629);
            String str = "";
            if (strLJII == null) {
                strLJII = "";
            }
            textView.setText(C786410Ut5.j4(strLJII, Arrays.copyOf(new Object[]{C0K7S.LIZ(c0k3s.LLJI)}, 1)));
            U5(spacePost.likeCount, spacePost.userLiked);
            C786410Ut5.I7(new AbS324S0300000_7(spacePost, this, c511150K2v, 7), this.LLIZ);
            SpacePoll spacePoll = spacePost.pollInfo;
            long j = 0;
            if (spacePoll != null && (list = spacePoll.optionList) != null) {
                Iterator<SpacePollOption> it2 = list.iterator();
                while (it2.hasNext()) {
                    j += it2.next().votes;
                }
            }
            SpacePoll spacePoll2 = spacePost.pollInfo;
            if (spacePoll2 != null) {
                boolValueOf = Boolean.valueOf(spacePoll2.isEnd);
            }
            if (C0K51.LJI(boolValueOf)) {
                C786410Ut5.LLIL(this.LLILZIL, 0);
                C786410Ut5.LJLLLLLL(0, this.LLILZLL);
            } else {
                C786410Ut5.LLIL(this.LLILZIL, 8);
                C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            }
            TextView textView2 = this.LLILZ;
            String strLIZLLL = C511520K4g.LIZLLL((int) j);
            if (strLIZLLL != null) {
                str = strLIZLLL;
            }
            textView2.setText(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C511410K3v.LIZIZ(j)}, 1)));
        }
    }

    public final void U5(long j, boolean z) {
        int i;
        int i2;
        if (j > 0) {
            this.LLIZLLLIL.setText(C511410K3v.LIZIZ(j));
            C786410Ut5.LLIL(this.LLIZLLLIL, 0);
        } else {
            C786410Ut5.LLIL(this.LLIZLLLIL, 8);
        }
        this.LLIZLLLIL.requestLayout();
        TuxIconView tuxIconView = this.LLIZ;
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
            i2 = R.attr.f_i;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
