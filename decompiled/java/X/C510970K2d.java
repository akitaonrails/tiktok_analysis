package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0K2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510970K2d extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;

    public C510970K2d(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rfd);
        this.LLILZ = (TextView) view.findViewById(R.id.rgf);
        this.LLILZIL = (TextView) view.findViewById(R.id.rm0);
        this.LLILZLL = view.findViewById(R.id.rfj);
        this.LLIZ = view.findViewById(R.id.rfk);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511150K2v c511150K2v;
        List<SpacePollOption> list;
        Boolean boolValueOf = null;
        if ((abstractC511160K2w instanceof C511150K2v) && (c511150K2v = (C511150K2v) abstractC511160K2w) != null) {
            SpacePost spacePost = c511150K2v.LIZ;
            this.LLILZIL.setText(C2215121Bmo.LIZ(spacePost.activeTimeSec * 1000));
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, spacePost, 46), this.LL);
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
                C786410Ut5.LJLLLLLL(0, this.LLILZLL);
                C786410Ut5.LJLLLLLL(0, this.LLIZ);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLILZLL);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
            }
            String str = "";
            if (spacePost.previewMode) {
                C0K0R.LIZ(this.LLILZ);
            } else {
                TextView textView = this.LLILZ;
                String strLIZLLL = C511520K4g.LIZLLL((int) j);
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                textView.setText(C786410Ut5.j4(strLIZLLL, Arrays.copyOf(new Object[]{C511410K3v.LIZIZ(j)}, 1)));
            }
            TextView textView2 = this.LLILLL;
            String strLJII = C511520K4g.LJII(2131839558);
            if (strLJII == null) {
                strLJII = "";
            }
            String str2 = spacePost.text;
            if (str2 != null) {
                str = str2;
            }
            C0K3V.R5(textView2, "ttlive_sub_space_ic_poll.png", strLJII, str, 101, 103);
        }
    }
}
