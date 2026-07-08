package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Joe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503380Joe extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final View LLIZ;

    public C503380Joe(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rfd);
        this.LLILZ = (C16F5) view.findViewById(R.id.rgf);
        this.LLILZIL = (C16F5) view.findViewById(R.id.rm0);
        this.LLILZLL = (C16F5) view.findViewById(R.id.rfj);
        this.LLIZ = view.findViewById(R.id.rfk);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C503010Jo3 c503010Jo3;
        int i;
        List<SpacePollOption> list;
        Boolean boolValueOf = null;
        if ((abstractC503810JpL instanceof C503010Jo3) && (c503010Jo3 = (C503010Jo3) abstractC503810JpL) != null) {
            final SpacePost spacePost = c503010Jo3.LIZ;
            this.LLILZIL.setText(C2215111Bmn.LIZ(spacePost.activeTimeSec * 1000));
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Joh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.LLILLJJLI.AQ2(spacePost);
                }
            }, this.LL);
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
            if (C176600m4.LIZIZ(boolValueOf)) {
                C786410Ut5.LLJJJJ(this.LLILZLL, 0);
                C786410Ut5.LJLLLLLL(0, this.LLIZ);
            } else {
                C786410Ut5.LLJJJJ(this.LLILZLL, 8);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
            }
            if (spacePost.previewMode) {
                C500260Jjc.LJIILIIL(this.LLILZ);
            } else {
                this.LLILZ.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755605, (int) j), Arrays.copyOf(new Object[]{C474270Iin.LIZIZ(j)}, 1)));
            }
            C16F5 c16f5 = this.LLILLL;
            if (this.LLILLJJLI.DQ2()) {
                i = 2131856636;
            } else {
                i = 2131856514;
            }
            C502700JnY.P5(c16f5, "ttlive_sub_space_ic_poll.png", C497740JfY.LJIJI(i), spacePost.text);
        }
    }
}
