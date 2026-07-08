package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.text.a0;
import webcast.api.sub.HomePageInfo;
import webcast.api.sub.SpaceTip;

/* JADX INFO: renamed from: X.0K2V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2V extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TuxTextView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final C0K2W LLIZLLLIL;

    public C0K2V(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TextView) view.findViewById(R.id.vrp);
        this.LLILZ = (TextView) view.findViewById(R.id.vrn);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.vrw);
        this.LLILZLL = view.findViewById(R.id.uiq);
        View viewFindViewById = view.findViewById(R.id.o61);
        this.LLIZ = viewFindViewById;
        this.LLIZLLLIL = new C0K2W(viewFindViewById);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C511370K3r c511370K3r;
        long j;
        List<User> list;
        User user;
        SpaceTip spaceTip;
        String str;
        String strLJII;
        User user2;
        String nickName;
        if ((interfaceC2753014t instanceof C511370K3r) && (c511370K3r = (C511370K3r) interfaceC2753014t) != null) {
            HomePageInfo homePageInfo = c511370K3r.LLILZLL;
            String str2 = "";
            if (homePageInfo != null && (user2 = homePageInfo.anchorInfo) != null && (nickName = user2.getNickName()) != null) {
                TextView textView = this.LLILLL;
                String strLJII2 = C511520K4g.LJII(2131839611);
                if (strLJII2 == null) {
                    strLJII2 = "";
                }
                textView.setText(C786410Ut5.j4(strLJII2, Arrays.copyOf(new Object[]{nickName}, 1)));
            }
            HomePageInfo homePageInfo2 = c511370K3r.LLILZLL;
            if (homePageInfo2 != null) {
                j = homePageInfo2.memberCount;
            } else {
                j = 0;
            }
            this.LLILZ.setText(C511520K4g.LJ(2131755468, (int) j, C511410K3v.LIZIZ(j)));
            HomePageInfo homePageInfo3 = c511370K3r.LLILZLL;
            if (homePageInfo3 != null && (spaceTip = homePageInfo3.tip) != null && (str = spaceTip.text) != null && !a0.LJJJIL(str) && this.LLILLJJLI.AQ2() && !c511370K3r.LLJILLL) {
                SpaceTip spaceTip2 = homePageInfo3.tip;
                if (spaceTip2 != null) {
                    C786410Ut5.LLLLZLL(this.LLILZIL, 0);
                    SpannableStringBuilder spannableStringBuilderLIZ = C510740K1g.LIZ(spaceTip2.text, 61, AFwS237S0000000_7.get$arr$(312));
                    int i = spaceTip2.spaceTipJumpType;
                    if (i == 2 || i == 3 || i == 4) {
                        spannableStringBuilderLIZ.append((CharSequence) " ");
                        int length = spannableStringBuilderLIZ.length();
                        if (spaceTip2.spaceTipJumpType == 4) {
                            strLJII = C511520K4g.LJII(2131839622);
                        } else {
                            strLJII = C511520K4g.LJII(2131839623);
                        }
                        spannableStringBuilderLIZ.append((CharSequence) strLJII);
                        int length2 = spannableStringBuilderLIZ.length();
                        if (spaceTip2.spaceTipJumpType == 3) {
                            SpaceTopicInfo spaceTopicInfo = new SpaceTopicInfo();
                            SpaceTopicCategory spaceTopicCategory = new SpaceTopicCategory();
                            spaceTopicCategory.topicCategoryId = -1211L;
                            String strLJII3 = C511520K4g.LJII(2131839558);
                            if (strLJII3 != null) {
                                str2 = strLJII3;
                            }
                            spaceTopicCategory.topicCategoryText = str2;
                            spaceTopicInfo.spaceTopicCategory = spaceTopicCategory;
                            spaceTip2.topicInfo = spaceTopicInfo;
                        }
                        spannableStringBuilderLIZ.append((CharSequence) " ");
                        C510740K1g.LIZLLL(spannableStringBuilderLIZ, length, length2, 62, false, 33);
                        C510740K1g.LIZJ(spannableStringBuilderLIZ, new ForegroundColorSpan(C426930God.LIZIZ(R.attr.a1j, this.LLILZIL)), length, length2, 33);
                        C510740K1g.LIZJ(spannableStringBuilderLIZ, new C521520Kco(spaceTip2, this, 6), length, length2, 33);
                        TuxTextView tuxTextView = this.LLILZIL;
                        tuxTextView.LLJJ = true;
                        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    this.LLILZIL.setText(spannableStringBuilderLIZ);
                }
            } else {
                C786410Ut5.LLLLZLL(this.LLILZIL, 8);
            }
            C0K2W c0k2w = this.LLIZLLLIL;
            HomePageInfo homePageInfo4 = c511370K3r.LLILZLL;
            if (homePageInfo4 != null) {
                list = homePageInfo4.memberList;
            } else {
                list = null;
            }
            int i2 = 0;
            for (C417410GYh c417410GYh : c0k2w.LJ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C417410GYh c417410GYh2 = c417410GYh;
                    if (list != null && list.size() > i2) {
                        if (list != null) {
                            user = (User) ListProtector.get(list, i2);
                        } else {
                            user = null;
                        }
                        C786410Ut5.S0(c417410GYh2, 0);
                        if (i2 < c0k2w.LJFF.size()) {
                            C786410Ut5.LJLLLLLL(0, (View) ListProtector.get(c0k2w.LJFF, i2));
                        }
                        C511410K3v.LIZ(c417410GYh2, user, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                    } else {
                        C786410Ut5.S0(c417410GYh2, 8);
                        if (i2 < c0k2w.LJFF.size()) {
                            C786410Ut5.LJLLLLLL(8, (View) ListProtector.get(c0k2w.LJFF, i2));
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            C786410Ut5.x3(this.LL.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(this, c511370K3r, 5));
        }
    }
}
