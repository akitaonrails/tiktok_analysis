package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510960K2c extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public C510960K2c(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rj9);
        this.LLILZ = (TextView) view.findViewById(R.id.rm0);
        this.LLILZIL = view.findViewById(R.id.jwc);
        this.LLILZLL = view.findViewById(R.id.m4n);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511130K2t c511130K2t;
        String str;
        int i;
        if ((abstractC511160K2w instanceof C511130K2t) && (c511130K2t = (C511130K2t) abstractC511160K2w) != null) {
            SpacePost spacePost = c511130K2t.LIZ;
            this.LLILZ.setText(C2215121Bmo.LIZ(spacePost.activeTimeSec * 1000));
            C786410Ut5.I7(new ACListenerS111S0200000_7(spacePost, this, 48), this.LL);
            SpacePost spacePost2 = c511130K2t.LIZ;
            TextView textView = this.LLILLL;
            SpaceTopicCategory spaceTopicCategory = spacePost2.category;
            if (spaceTopicCategory == null || (str = spaceTopicCategory.topicCategoryText) == null) {
                str = "";
            }
            C0K3V.R5(textView, "ttlive_sub_space_ic_chat.png", str, spacePost2.text, 101, 103);
            if (this.LLILLJJLI.AQ2()) {
                View view = this.LLILZIL;
                int i2 = 0;
                if (spacePost.isPinned) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
                View view2 = this.LLILZLL;
                if (!spacePost.isPinned) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view2);
            }
        }
    }
}
