package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503390Jof extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final LiveIconView LLILZIL;
    public final C16F5 LLILZLL;

    public C503390Jof(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rj9);
        this.LLILZ = (C16F5) view.findViewById(R.id.rm0);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.jwc);
        this.LLILZLL = (C16F5) view.findViewById(R.id.m4n);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C502910Jnt c502910Jnt;
        String str;
        int i;
        if ((abstractC503810JpL instanceof C502910Jnt) && (c502910Jnt = (C502910Jnt) abstractC503810JpL) != null) {
            final SpacePost spacePost = c502910Jnt.LIZ;
            this.LLILZ.setText(C2215111Bmn.LIZ(spacePost.activeTimeSec * 1000));
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpacePost spacePost2 = spacePost;
                    if (spacePost2.previewMode) {
                        return;
                    }
                    this.LLILLJJLI.AQ2(spacePost2);
                }
            }, this.LL);
            SpacePost spacePost2 = c502910Jnt.LIZ;
            C16F5 c16f5 = this.LLILLL;
            SpaceTopicCategory spaceTopicCategory = spacePost2.category;
            if (spaceTopicCategory == null || (str = spaceTopicCategory.topicCategoryText) == null) {
                str = "";
            }
            C502700JnY.P5(c16f5, "ttlive_sub_space_ic_chat.png", str, spacePost2.text);
            if (this.LLILLJJLI.zQ2()) {
                LiveIconView liveIconView = this.LLILZIL;
                int i2 = 0;
                if (spacePost.isPinned) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, liveIconView);
                C16F5 c16f52 = this.LLILZLL;
                if (!spacePost.isPinned) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, c16f52);
            }
        }
    }
}
