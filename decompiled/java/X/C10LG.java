package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.upvote.service.IRepostListVMService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS65S0310000_28;

/* JADX INFO: renamed from: X.10LG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LG extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public PerformanceUserCardViewModel LLJJJJ;
    public C1261860iwS LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    private final C427590Gph getAvatarView() {
        return (C427590Gph) this.LLILZIL.getValue();
    }

    private final TuxTextView getBioView() {
        return (TuxTextView) this.LLJ.getValue();
    }

    private final C20626615nU getBioViewSkeleton() {
        return (C20626615nU) this.LLJI.getValue();
    }

    private final C426250GnX getBottomVideoArea() {
        return (C426250GnX) this.LLJJIJI.getValue();
    }

    private final C20627315nb getBottomVideoSkeleton() {
        return (C20627315nb) this.LLJJIJIIJIL.getValue();
    }

    private final boolean getEnableStoryRing() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    private final LinearLayout getInfoArea() {
        return (LinearLayout) this.LLJJJIL.getValue();
    }

    private final LinearLayout getMiddleArea() {
        return (LinearLayout) this.LLJJJ.getValue();
    }

    private final C20626615nU getNickNameSkeleton() {
        return (C20626615nU) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getNickNameView() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final C20626615nU getPostCntSkeleton() {
        return (C20626615nU) this.LLJILJIL.getValue();
    }

    private final TuxTextView getPostCntView() {
        return (TuxTextView) this.LLJIJIL.getValue();
    }

    private final RelationButton getRelationButton() {
        return (RelationButton) this.LLJJ.getValue();
    }

    private final RelationLabelTextView getRelationLabel() {
        return (RelationLabelTextView) this.LLJILJILJ.getValue();
    }

    private final C20626615nU getRelationLabelSkeleton() {
        return (C20626615nU) this.LLJILLL.getValue();
    }

    private final TuxSkeletonLayout getRootView() {
        return (TuxSkeletonLayout) this.LLJJIJIL.getValue();
    }

    private final InterfaceC1398730mVD getSocPubAvatarEntry() {
        return (InterfaceC1398730mVD) this.LLJJJJLIIL.getValue();
    }

    private final int getUiStyleGroup() {
        return ((Number) this.LL.getValue()).intValue();
    }

    private final C20627315nb getVideoCoverSkeleton() {
        return (C20627315nb) this.LLJJIII.getValue();
    }

    public final C1609500rzA getSocPubAvatarFrameLayout() {
        return (C1609500rzA) this.LLILZLL.getValue();
    }

    public final C1385130m9H getVideoCover() {
        return (C1385130m9H) this.LLJJI.getValue();
    }

    public final void LIZJ() {
        int uiStyleGroup = getUiStyleGroup();
        if (uiStyleGroup == 2) {
            C1385130m9H videoCover = getVideoCover();
            int visibility = videoCover.getVisibility();
            videoCover.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, videoCover);
        } else if (uiStyleGroup == 4) {
            C426250GnX bottomVideoArea = getBottomVideoArea();
            int visibility2 = bottomVideoArea.getVisibility();
            bottomVideoArea.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, bottomVideoArea);
        }
        C786410Ut5.bb(this, new View.OnClickListener() { // from class: X.10LP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public final C1261860iwS getCurrentUser() {
        return this.LLJJJJJIL;
    }

    public C10LG(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(547));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(548));
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1045));
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1044));
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 749));
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 745));
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 757));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 756));
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 750));
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 751));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 759));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 758));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 743));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 744));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 742));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 746));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 747));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 752));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 753));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1719));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 755));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 754));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS425S0200000_24(this, context, 64));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dud, this, true);
    }

    public static boolean LIZIZ(User user) {
        List<Integer> canMessageFollowStatusList;
        if (user == null || (canMessageFollowStatusList = user.getCanMessageFollowStatusList()) == null || !(!canMessageFollowStatusList.isEmpty()) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        return true;
    }

    private final void setupRelationButton(C1261860iwS c1261860iwS) {
        String strLJIIJ;
        String strLJIIJ2;
        C1908830zlx c1908830zlxLIZ;
        C2271391DvN.LIZ(getRelationButton(), (C1A5L) C2271381DvM.LLIZLLLIL.getValue());
        if (getUiStyleGroup() == 1) {
            C1387050mCN c1387050mCN = new C1387050mCN(c1261860iwS);
            c1387050mCN.LJIIJJI = C946803n0.LIZ(this);
            c1387050mCN.LIZIZ = false;
            c1387050mCN.LJIIJ = true;
            c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_FEED_STACK_CARD;
            c1387050mCN.LJJI = true;
            c1908830zlxLIZ = c1387050mCN.LIZ();
        } else {
            C1387050mCN c1387050mCN2 = new C1387050mCN(c1261860iwS);
            c1387050mCN2.LJIIJJI = C946803n0.LIZ(this);
            c1387050mCN2.LIZIZ = false;
            c1387050mCN2.LJIIJ = true;
            c1387050mCN2.LJ = EnumC1387060mCO.MESSAGE;
            c1387050mCN2.LJIJJ = LIZIZ(c1261860iwS);
            c1387050mCN2.LJJ = true;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair(C0SY7.UNFOLLOW, new C1908890zm3(C1383370m6R.LJIIJ(R.string.jp2), null));
            pairArr[1] = new Pair(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED, new C1908890zm3(C1383370m6R.LJIIJ(R.string.jp2), null));
            C0SY7 c0sy7 = C0SY7.FOLLOWED;
            if (LIZIZ(c1261860iwS)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(R.string.jrk);
            }
            pairArr[2] = new Pair(c0sy7, new C1908890zm3(strLJIIJ, null));
            C0SY7 c0sy72 = C0SY7.FOLLOW_MUTUAL;
            if (LIZIZ(c1261860iwS)) {
                strLJIIJ2 = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ2 = C1383370m6R.LJIIJ(R.string.jrk);
            }
            pairArr[3] = new Pair(c0sy72, new C1908890zm3(strLJIIJ2, null));
            c1387050mCN2.LJII.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            c1387050mCN2.LJJI = true;
            c1908830zlxLIZ = c1387050mCN2.LIZ();
        }
        getRelationButton().setFollowClickListener(new AwS642S0100000_28(this, 70));
        C786410Ut5.t0(getRelationButton(), 0);
        getRelationButton().LLLLZIL(c1908830zlxLIZ);
        getRelationButton().setTracker(new AwS572S0100000_28(this, 748));
    }

    private final void setupSingleVideoCover(C1261860iwS c1261860iwS) {
        MatchedFriendStruct matchedFriendStruct;
        List<? extends Aweme> list;
        Aweme aweme;
        List<? extends Aweme> list2;
        List<? extends Aweme> list3;
        C1385130m9H videoCover = getVideoCover();
        int visibility = videoCover.getVisibility();
        videoCover.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, videoCover);
        MatchedFriendStruct matchedFriendStruct2 = c1261860iwS.getMatchedFriendStruct();
        if ((matchedFriendStruct2 == null || (list3 = matchedFriendStruct2.awemeList) == null || (aweme = (Aweme) C13LP.LJJJLL(list3)) == null) && ((matchedFriendStruct = c1261860iwS.getMatchedFriendStruct()) == null || (list = matchedFriendStruct.repostAwemeList) == null || (aweme = (Aweme) C13LP.LJJJLL(list)) == null)) {
            return;
        }
        C1378990lzN.LIZIZ(getVideoCover(), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        C1378990lzN.LIZIZ(getVideoCoverSkeleton(), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        boolean z = true;
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(this, (C19EG) null);
        if (lifecycleOwnerFindSAFExpLifecycleOwner == null) {
            lifecycleOwnerFindSAFExpLifecycleOwner = C0SY5.LIZIZ(getContext());
        }
        C427690Gpr.LJI(getVideoCover(), null);
        C1385130m9H videoCover2 = getVideoCover();
        int visibility2 = videoCover2.getVisibility();
        videoCover2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, videoCover2);
        getVideoCover().n0();
        MatchedFriendStruct matchedFriendStruct3 = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct3 != null && (list2 = matchedFriendStruct3.awemeList) != null && !list2.isEmpty()) {
            z = false;
            if (C10LJ.LIZIZ(aweme)) {
                getVideoCover().i0();
            } else {
                getVideoCover().j0(c1261860iwS.getPostCount());
            }
        } else {
            getVideoCover().l0();
        }
        if (lifecycleOwnerFindSAFExpLifecycleOwner != null) {
            if (z) {
                IRepostListVMService iRepostListVMService = (IRepostListVMService) PluggableExtentionKt.pluggableSpi$default(IRepostListVMService.class, false, false, false, 14, null);
                if (iRepostListVMService != null) {
                    iRepostListVMService.LIZ(lifecycleOwnerFindSAFExpLifecycleOwner, c1261860iwS, "big_card", c1261860iwS.getUid(), null);
                }
            } else {
                C338480DOs.LIZIZ(lifecycleOwnerFindSAFExpLifecycleOwner, c1261860iwS, EnumC1262370ixH.FEED_REC_USER_BIG_CARD);
            }
        }
        getVideoCover().e0(aweme, new AwS65S0310000_28(this, z, aweme, c1261860iwS, 1));
    }

    public final void setLoading(boolean z) {
        getRootView().setLoading(z);
        if (getUiStyleGroup() != 2 && z) {
            C786410Ut5.t0(getRelationButton(), 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1261860iwS r24, com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel r25) {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10LG.LIZ(X.0iwS, com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel):void");
    }
}
