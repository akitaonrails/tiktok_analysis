package X;

import Y.AObserverS226S0100000_24;
import Y.AfS193S0100000_24;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587030rOv extends BaseRedDotImpl {
    public final C1587070rOz LLILZIL = new C1587070rOz();
    public final C11NJ LLILZLL = new C11NJ();
    public final SingleTabCounter LLIZ = new SingleTabCounter("FRIENDS_FEED", 0, false);
    public SingleTabCounter LLIZLLLIL = new SingleTabCounter("FRIENDS_FEED", 0, false);
    public int LLJ;

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final ArrayList<Integer> LIZ() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(LJIL("FRIENDS_FEED")));
        return arrayList;
    }

    @Override // X.InterfaceC1586780rOW
    public final void LIZJ() {
        LJJIJIIJI("click unlogin", 0, null);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LIZLLL() {
        return new CopyOnWriteArrayList<>(C1697810uHb.LJ(this.LLIZ));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final ArrayList<Integer> LJIIIZ() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType("FRIENDS_FEED")));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LJIJJ() {
        return new CopyOnWriteArrayList<>(C1697810uHb.LJ(this.LLIZLLLIL));
    }

    public final void LJJIJ() {
        C2252408s6.LJII(new AwS568S0100000_24(this, 1754));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final C1587230rPF getSocialTabNoticeData() {
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        SingleTabCounter singleTabCounter = this.LLIZ;
        int i = singleTabCounter.numberCount;
        String str = i > 0 ? "number_dot" : singleTabCounter.showGuideRedDot ? "red_dot" : null;
        NewContentResponse newContentResponse = this.LLILLJJLI;
        int redDotCount = (newContentResponse == null || (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) == null) ? this.LLIZ.numberCount : friendsFeedResponse2.getRedDotCount();
        NewContentResponse newContentResponse2 = this.LLILLJJLI;
        if (newContentResponse2 == null || (friendsFeedResponse = newContentResponse2.getFriendsFeedResponse()) == null || (fakeCountReason = friendsFeedResponse.getFakeCountReason()) == null) {
            fakeCountReason = "";
        }
        return new C1587230rPF(str, i, redDotCount, fakeCountReason, null, 112);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJII() {
        super.LJJII();
        StateOwner stateOwner = StateOwner.LL;
        LifecycleOwner lifecycleOwnerLIZJ = stateOwner.LIZJ();
        if (lifecycleOwnerLIZJ != null) {
            stateOwner.getClass();
            StateOwner.LLJILJIL.observe(lifecycleOwnerLIZJ, new AObserverS226S0100000_24(this, 25));
        }
    }

    @Override // X.InterfaceC1586780rOW
    public final InterfaceC1584860rLQ LJIILJJIL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJI(boolean z) {
        super.LJI(z);
        LJJIJIIJIL(null);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp) {
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.C2()) {
            return new Pair<>(Boolean.TRUE, null);
        }
        if (c1589640rT8.l2()) {
            return new Pair<>(Boolean.TRUE, "in_tab");
        }
        C312040CLa.LIZ.getClass();
        if (C312040CLa.LIZIZ()) {
            LJJIJIIJIL(enumC1586970rOp);
            return new Pair<>(Boolean.TRUE, "no_following_or_friend");
        }
        return super.LJIJ(enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJIFFI(boolean z) {
        super.LJJIFFI(z);
        C1582120rH0.LIZ();
    }

    public final void LJJIJIIJIL(EnumC1586970rOp enumC1586970rOp) {
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.E2()) {
            return;
        }
        if (!C1586580rOC.LIZIZ(false) && !FriendsTabTopExperiment.LIZIZ()) {
            return;
        }
        if (!c1589640rT8.W2() && enumC1586970rOp != EnumC1586970rOp.COLD_START && enumC1586970rOp != EnumC1586970rOp.LOGIN_SUCCESS && enumC1586970rOp != EnumC1586970rOp.SWITCH_ACCOUNT && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        this.LLILZLL.LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0rPL
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Boolean> c09aj) {
                C1C7U.LIZ("TopRedDotImpl@4619.tryToShowGuideRedDot$1");
                C1587220rPE.LIZ.getClass();
                c09aj.onNext(Boolean.valueOf(C1587220rPE.LIZIZ.getBoolean("has_shown_guide_dot", false)));
                c09aj.onComplete();
                C1C7U.LIZIZ("TopRedDotImpl@4619.tryToShowGuideRedDot$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(this, 42)));
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJ(Aweme aweme, List list) {
        boolean zLJI = MethodIDManager.LJI(71864);
        C2252408s6.LJII(new AwS268S0300000_24(list, (List<C1587090rP1>) this, (C1587030rOv) aweme, (Aweme) 17));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJFF(Throwable th, EnumC1586970rOp enumC1586970rOp) {
        LJJIJIIJIL(enumC1586970rOp);
        BaseRedDotImpl.LJJIIJ(null, enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        ArrayList<ContentMetadata> contentMetadataList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = newContentResponse.getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            contentMetadataList = friendsFeedResponse.getContentMetadataList();
        } else {
            contentMetadataList = null;
        }
        LJJ(contentMetadataList);
        this.LLILLJJLI = newContentResponse;
        C2252408s6.LJII(new AwS268S0300000_24(this, newContentResponse, enumC1586970rOp, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.lang.String r41, java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587030rOv.LJIIL(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r4 = true;
     */
    @Override // X.InterfaceC1586780rOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeRedDotByUid(java.lang.String r9, X.EnumC1392960mLu r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587030rOv.removeRedDotByUid(java.lang.String, X.0mLu):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public final void LJJIJIIJI(String str, int i, EnumC1586970rOp enumC1586970rOp) {
        int redDotCount;
        int size;
        Object arrayList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<FriendsUserNewContent> avatarList;
        List<FriendsUserNewContent> listSubList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        ArrayList<FriendsUserNewContent> avatarList2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3;
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse4;
        int redDotCount2;
        int size2;
        Object arrayList2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse5;
        ArrayList<FriendsUserNewContent> avatarList3;
        List<FriendsUserNewContent> listSubList2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse6;
        ArrayList<FriendsUserNewContent> avatarList4;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse7;
        String fakeCountReason2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse8;
        StateOwner stateOwner = StateOwner.LL;
        stateOwner.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("numberDotUpdate to ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService != null) {
            iFriendsTabDebugService.LJFF();
        }
        String str2 = "";
        if (C296370BjX.LIZ()) {
            if (!C1589640rT8.LIZIZ.C2()) {
                if (i > 0) {
                    if (this.LLILZIL.LIZLLL()) {
                        this.LLILZIL.LIZJ();
                    }
                    this.LLIZ.setNumberCount(i);
                    if (this.LLILZIL.LIZLLL()) {
                        this.LLILZIL.LIZJ();
                    }
                    C19EG c19egLIZIZ = stateOwner.LIZIZ();
                    if (c19egLIZIZ != null) {
                        if (this.LLJ != i) {
                            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                            String strBQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).BQ2();
                            NewContentResponse newContentResponse = this.LLILLJJLI;
                            if (newContentResponse != null && (friendsFeedResponse8 = newContentResponse.getFriendsFeedResponse()) != null) {
                                redDotCount2 = friendsFeedResponse8.getRedDotCount();
                            } else {
                                redDotCount2 = 0;
                            }
                            NewContentResponse newContentResponse2 = this.LLILLJJLI;
                            if (newContentResponse2 != null && (friendsFeedResponse7 = newContentResponse2.getFriendsFeedResponse()) != null && (fakeCountReason2 = friendsFeedResponse7.getFakeCountReason()) != null) {
                                str2 = fakeCountReason2;
                            }
                            c1587170rP9.getClass();
                            C1587170rP9.LJIIL(i, redDotCount2, i, null, enumC1586970rOp, strBQ2, str2, "friends");
                            IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
                            if ((iFriendsTabLayoutAbilityLIZLLL == null || iFriendsTabLayoutAbilityLIZLLL.fg1("FRIENDS_FEED") == null) && !C1587080rP0.LIZ(enumC1586970rOp) && !C1587080rP0.LIZIZ(str)) {
                                C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
                                NewContentResponse latestResponse = c1595430rcT.LIZIZ().getLatestResponse();
                                if (latestResponse != null && (friendsFeedResponse6 = latestResponse.getFriendsFeedResponse()) != null && (avatarList4 = friendsFeedResponse6.getAvatarList()) != null) {
                                    size2 = avatarList4.size();
                                } else {
                                    size2 = 0;
                                }
                                int iLIZ = C18000073e.LIZ();
                                if (iLIZ <= size2) {
                                    size2 = iLIZ;
                                }
                                NewContentResponse latestResponse2 = c1595430rcT.LIZIZ().getLatestResponse();
                                if (latestResponse2 != null && (friendsFeedResponse5 = latestResponse2.getFriendsFeedResponse()) != null && (avatarList3 = friendsFeedResponse5.getAvatarList()) != null && (listSubList2 = avatarList3.subList(0, size2)) != null) {
                                    arrayList2 = new ArrayList(C15438062q.LJIJJ(listSubList2, 10));
                                    Iterator<FriendsUserNewContent> it2 = listSubList2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(it2.next().getItemId());
                                    }
                                } else {
                                    arrayList2 = C13BV.INSTANCE;
                                }
                                C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NUMBER_DOT_CHANGE.getScene(), C08JS.LIZLLL(arrayList2), C1586540rO8.LIZ(enumC1586970rOp));
                            }
                        }
                        this.LLJ = i;
                        if (C1589640rT8.LIZIZ.W2()) {
                            this.LLILZIL.LIZJ();
                            this.LLILZIL.LIZ(0);
                            return;
                        }
                        C1EK7.LIZ.getClass();
                        if (C1EK7.LIZ()) {
                            this.LLIZ.setShowGuideRedDot(true);
                            this.LLILZ = true;
                            this.LLILZIL.LJI();
                            this.LLILZIL.LIZ(0);
                            return;
                        }
                        this.LLILZIL.LIZ(i);
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(str, "click unlogin")) {
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ = C04R9.LIZ();
                    if (redDotServiceLIZ != null) {
                        redDotServiceLIZ.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                    this.LLILZIL.LIZJ();
                    return;
                }
                if (this.LLILZIL.LIZIZ != 0) {
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ2 = C04R9.LIZ();
                    if (redDotServiceLIZ2 != null) {
                        redDotServiceLIZ2.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                }
                LJJIJIIJIL(enumC1586970rOp);
                return;
            }
            LJJIJ();
            return;
        }
        if (i > 0) {
            if (this.LLILZIL.LIZLLL()) {
                this.LLILZIL.LIZJ();
            }
            this.LLIZ.setNumberCount(i);
            if (this.LLILZIL.LIZLLL()) {
                this.LLILZIL.LIZJ();
            }
            C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
            if (c19egLIZIZ2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("showNumberRedDot ");
                sbLIZ2.append(i);
                sbLIZ2.append(' ');
                sbLIZ2.append(enumC1586970rOp);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (this.LLILZIL.LIZIZ != i) {
                    C1587170rP9 c1587170rP92 = C1587170rP9.LIZ;
                    String strBQ22 = Hox.LLJILJIL.LIZ(c19egLIZIZ2).BQ2();
                    NewContentResponse newContentResponse3 = this.LLILLJJLI;
                    if (newContentResponse3 != null && (friendsFeedResponse4 = newContentResponse3.getFriendsFeedResponse()) != null) {
                        redDotCount = friendsFeedResponse4.getRedDotCount();
                    } else {
                        redDotCount = 0;
                    }
                    NewContentResponse newContentResponse4 = this.LLILLJJLI;
                    if (newContentResponse4 != null && (friendsFeedResponse3 = newContentResponse4.getFriendsFeedResponse()) != null && (fakeCountReason = friendsFeedResponse3.getFakeCountReason()) != null) {
                        str2 = fakeCountReason;
                    }
                    c1587170rP92.getClass();
                    C1587170rP9.LJIIL(i, redDotCount, i, null, enumC1586970rOp, strBQ22, str2, "friends");
                    IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL2 = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ2, null));
                    if ((iFriendsTabLayoutAbilityLIZLLL2 == null || iFriendsTabLayoutAbilityLIZLLL2.fg1("FRIENDS_FEED") == null) && this.LLILZIL.LIZIZ > 0) {
                        C1595430rcT c1595430rcT2 = C1595430rcT.LIZIZ;
                        NewContentResponse latestResponse3 = c1595430rcT2.LIZIZ().getLatestResponse();
                        if (latestResponse3 != null && (friendsFeedResponse2 = latestResponse3.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse2.getAvatarList()) != null) {
                            size = avatarList2.size();
                        } else {
                            size = 0;
                        }
                        int iLIZ2 = C18000073e.LIZ();
                        if (iLIZ2 <= size) {
                            size = iLIZ2;
                        }
                        NewContentResponse latestResponse4 = c1595430rcT2.LIZIZ().getLatestResponse();
                        if (latestResponse4 != null && (friendsFeedResponse = latestResponse4.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && (listSubList = avatarList.subList(0, size)) != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                            Iterator<FriendsUserNewContent> it3 = listSubList.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next().getItemId());
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NUMBER_DOT_CHANGE.getScene(), C08JS.LIZLLL(arrayList), C1586540rO8.LIZ(enumC1586970rOp));
                    }
                }
                C1EK7.LIZ.getClass();
                if (C1EK7.LIZ()) {
                    this.LLILZIL.LJI();
                    this.LLIZ.setShowGuideRedDot(true);
                    this.LLILZIL.LIZ(0);
                    this.LLILZ = true;
                    return;
                }
                this.LLILZIL.LIZ(i);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "click unlogin")) {
            RedDotService.LIZ.getClass();
            RedDotService redDotServiceLIZ3 = C04R9.LIZ();
            if (redDotServiceLIZ3 != null) {
                redDotServiceLIZ3.LJI(EnumC1584360rKc.FRIENDS, null);
            }
            this.LLILZIL.LIZJ();
            return;
        }
        LJJIJ();
    }
}
