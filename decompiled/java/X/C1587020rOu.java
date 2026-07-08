package X;

import Y.AfS193S0100000_24;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587020rOu extends BaseRedDotImpl implements InterfaceC1586360rNq, InterfaceC586170Myt {
    public C1587060rOy LLILZIL;
    public IBottomFriendsTabAvatarAbility LLJ;
    public int LLJI;
    public final C11NJ LLILZLL = new C11NJ();
    public final C1587050rOx LLIZ = new C1587050rOx();
    public C1582080rGw LLIZLLLIL = new C1582080rGw();
    public boolean LLJIJIL = true;

    @Override // X.InterfaceC1586780rOW
    public final void LIZJ() {
        LJJIJIIJIL("click unlogin", null);
    }

    public static IBottomTabLayoutAbility LJJIIZI() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            return C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null));
        }
        return null;
    }

    public static final IFriendsTabLayoutAbility LJJIL() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            return C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final ArrayList<Integer> LIZ() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        List<ISocialTabProtocol> listSV1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null && (listSV1 = iSocial2TabProtocolAbilityLJI.sV1()) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSV1, 10));
            Iterator<ISocialTabProtocol> it2 = listSV1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getTag());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Integer.valueOf(LJIL((String) it3.next())));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LIZLLL() {
        return this.LLIZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJII() {
        for (SingleTabCounter singleTabCounter : this.LLIZ.LIZIZ) {
            singleTabCounter.setNumberCount(0);
            singleTabCounter.setShowGuideRedDot(false);
        }
        if (C296600Bju.LIZ()) {
            C1586680rOM.LIZ.getClass();
            C1586680rOM.LIZ("FRIENDS_TAB");
        }
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final ArrayList<Integer> LJIIIZ() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        List<ISocialTabProtocol> listSV1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        ArrayList arrayList2 = null;
        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null && (listSV1 = iSocial2TabProtocolAbilityLJI.sV1()) != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(listSV1, 10));
            Iterator<ISocialTabProtocol> it2 = listSV1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getTag());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Integer.valueOf(C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType((String) it3.next())));
            }
        }
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZIZ() && arrayList2 != null && !arrayList2.contains("REPOST_FEED")) {
            arrayList.add(Integer.valueOf(C1595430rcT.LIZIZ.LIZJ().getSocial2TabFeedType("REPOST_FEED")));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final CopyOnWriteArrayList<SingleTabCounter> LJIJJ() {
        return this.LLIZ.LIZJ;
    }

    public final IBottomFriendsTabAvatarAbility LJJIJ() {
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJJI = this.LLJ;
        if (iBottomFriendsTabAvatarAbilityLJIIJJI == null) {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            iBottomFriendsTabAvatarAbilityLJIIJJI = c19egLIZIZ != null ? C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null)) : null;
            this.LLJ = iBottomFriendsTabAvatarAbilityLJIIJJI;
        }
        return iBottomFriendsTabAvatarAbilityLJIIJJI;
    }

    public final String LJJIJIIJI() {
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        boolean z = repostFeedConfigLIZ != null && (repostFeedConfigLIZ.bottomReminder & 2) == 2 && this.LLIZ.LJII("REPOST_FEED") > 0;
        boolean z2 = this.LLIZ.LJII("FRIENDS_FEED") > 0;
        return z ? z2 ? "repost_and_friends" : "repost" : z2 ? "friends" : "";
    }

    public final void LJJIJL() {
        boolean z;
        String str;
        boolean z2 = true;
        boolean z3 = this.LLILZIL != null && C1587060rOy.LIZLLL();
        C1587060rOy c1587060rOy = this.LLILZIL;
        boolean z4 = c1587060rOy != null && c1587060rOy.LJ();
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ = LJJIJ();
        if (iBottomFriendsTabAvatarAbilityLJJIJ == null || !iBottomFriendsTabAvatarAbilityLJJIJ.isShowing()) {
            z = false;
            str = z3 ? "red_dot" : z4 ? "number_dot" : "";
        } else {
            z = true;
            str = "head_number";
        }
        if (!z3 && !z4 && !z) {
            z2 = false;
        }
        C1587060rOy c1587060rOy2 = this.LLILZIL;
        this.LLIZLLLIL = new C1582080rGw(z2, str, c1587060rOy2 != null ? c1587060rOy2.getDotCount() : 0);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJIII() {
        super.LJJIII();
        this.LLIZ.LIZLLL = null;
    }

    public final List<ISocialTabProtocol> LJJJ() {
        String strNk0;
        List<ISocialTabProtocol> arrayList;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLJJIL = LJJIL();
        if (iFriendsTabLayoutAbilityLJJIL == null || (strNk0 = iFriendsTabLayoutAbilityLJJIL.nk0()) == null) {
            strNk0 = "";
        }
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null || (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) == null || (arrayList = iSocial2TabProtocolAbilityLJI.b9()) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : arrayList) {
            if (!Intrinsics.LJFF(iSocialTabProtocol.getTag(), strNk0)) {
                arrayList2.add(iSocialTabProtocol);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1587230rPF getSocialTabNoticeData() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility r0 = r9.LJJIJ()
            r3 = 0
            if (r0 == 0) goto L5d
            X.0rPD r7 = r0.pm0()
        Lb:
            X.0rOx r0 = r9.LLIZ
            int r4 = r0.LIZ()
            X.0rPF r2 = new X.0rPF
            if (r7 == 0) goto L3f
            java.lang.String r3 = "head_number"
        L17:
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r0 = r9.LLILLJJLI
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$FriendsFeedRedDotResponse r0 = r0.getFriendsFeedResponse()
            if (r0 == 0) goto L3d
            int r5 = r0.getRedDotCount()
        L25:
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r0 = r9.LLILLJJLI
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$FriendsFeedRedDotResponse r0 = r0.getFriendsFeedResponse()
            if (r0 == 0) goto L35
            java.lang.String r6 = r0.getFakeCountReason()
            if (r6 != 0) goto L37
        L35:
            java.lang.String r6 = ""
        L37:
            r8 = 96
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L3d:
            r5 = r4
            goto L25
        L3f:
            X.0rOy r0 = r9.LLILZIL
            if (r0 == 0) goto L4d
            boolean r1 = X.C1587060rOy.LIZLLL()
            r0 = 1
            if (r1 != r0) goto L4d
        L4a:
            java.lang.String r3 = "red_dot"
            goto L17
        L4d:
            if (r4 <= 0) goto L17
            X.1EK7 r0 = X.C1EK7.LIZ
            r0.getClass()
            boolean r0 = X.C1EK7.LIZ()
            if (r0 != 0) goto L4a
            java.lang.String r3 = "number_dot"
            goto L17
        L5d:
            r7 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587020rOu.getSocialTabNoticeData():X.0rPF");
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final C1582080rGw LJIIIIZZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1586780rOW
    public final InterfaceC1584860rLQ LJIILJJIL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJI(boolean z) {
        this.LLILZIL = new C1587060rOy("FRIENDS_TAB");
        super.LJI(z);
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            C343710Ddh.LIZ(c19egLIZIZ).wQ2(this);
        }
        LJJIZ(null);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJIILL(String str) {
        this.LLIZ.LJ();
        LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp) {
        boolean zHv0;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJJIIZI = LJJIIZI();
        boolean zTF0 = false;
        if (iBottomTabLayoutAbilityLJJIIZI != null) {
            zHv0 = iBottomTabLayoutAbilityLJJIIZI.hv0();
        } else {
            zHv0 = false;
        }
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
            zTF0 = iSocial2TabProtocolAbilityLJI.tF0();
        }
        if (C1589640rT8.LIZIZ.C2()) {
            return new Pair<>(Boolean.TRUE, null);
        }
        if (zHv0) {
            C1583300rIu.LIZ.getClass();
            if (!C1583300rIu.LIZIZ() && zTF0) {
                return new Pair<>(Boolean.TRUE, "in_tab");
            }
            return new Pair<>(Boolean.FALSE, null);
        }
        C312040CLa.LIZ.getClass();
        if (C312040CLa.LIZIZ()) {
            LJJIZ(enumC1586970rOp);
            return new Pair<>(Boolean.TRUE, "no_following_or_friend");
        }
        return super.LJIJ(enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final int LJIJI(String str) {
        return this.LLIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJIFFI(boolean z) {
        super.LJJIFFI(z);
        C1582120rH0.LIZ();
    }

    public final void LJJIZ(EnumC1586970rOp enumC1586970rOp) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryToShowGuideRedDot,soucre:");
        sbLIZ.append(enumC1586970rOp);
        C2188811AlT.LIZIZ(sbLIZ);
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.E2()) {
            return;
        }
        if (!C1586580rOC.LIZIZ(false) && !FriendsTabTopExperiment.LIZIZ()) {
            return;
        }
        if (!c1589640rT8.W2()) {
            C1583300rIu.LIZ.getClass();
            RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
            if ((repostFeedConfigLIZ == null || (repostFeedConfigLIZ.bottomReminder & 1) != 1) && enumC1586970rOp != EnumC1586970rOp.COLD_START && enumC1586970rOp != EnumC1586970rOp.LOGIN_SUCCESS && enumC1586970rOp != EnumC1586970rOp.SWITCH_ACCOUNT && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
        }
        this.LLILZLL.LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0rPK
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Boolean> c09aj) {
                C1C7U.LIZ("BottomMultiTabRedDotImpl@2239.tryToShowGuideRedDot$1");
                C1587220rPE.LIZ.getClass();
                c09aj.onNext(Boolean.valueOf(C1587220rPE.LIZIZ.getBoolean("has_shown_guide_dot", false)));
                c09aj.onComplete();
                C1C7U.LIZIZ("BottomMultiTabRedDotImpl@2239.tryToShowGuideRedDot$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(this, 32)));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1584770rLH
    public final void LIZIZ(String str, String str2) {
        SingleTabCounter next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("top multi tab change from ");
        sbLIZ.append(str);
        sbLIZ.append(" to ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLJJIL = LJJIL();
        if (iFriendsTabLayoutAbilityLJJIL != null) {
            iFriendsTabLayoutAbilityLJJIL.YI2(str2);
        }
        Iterator<SingleTabCounter> it2 = this.LLIZ.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.tag, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter = next;
        if (singleTabCounter != null) {
            singleTabCounter.setNumberCount(0);
            singleTabCounter.setShowGuideRedDot(false);
        }
        if (C296600Bju.LIZ()) {
            C1586680rOM.LIZ.getClass();
            C1586680rOM.LIZ(str2);
        }
        LJJIJIIJIL("onTopTabChanged", null);
        if (Intrinsics.LJFF(str2, "FRIENDS_FEED")) {
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LJ();
        }
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJ(Aweme aweme, List list) {
        Object next;
        Object next2;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1587090rP1) next).LIZ, "FRIENDS_FEED")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1587090rP1 c1587090rP1 = (C1587090rP1) next;
        if (c1587090rP1 != null) {
            LJJIIZ(aweme);
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ = LJJIJ();
            if (iBottomFriendsTabAvatarAbilityLJJIJ != null) {
                iBottomFriendsTabAvatarAbilityLJJIJ.ZD1(aweme);
            }
            C1587050rOx.LIZJ(this.LLIZ, "FRIENDS_FEED", BaseRedDotImpl.LJJI(c1587090rP1.LIZIZ, this.LLIZ.LJII("FRIENDS_FEED"), c1587090rP1.LIZJ));
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(((C1587090rP1) next2).LIZ, "REPOST_FEED")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C1587090rP1 c1587090rP12 = (C1587090rP1) next2;
        if (c1587090rP12 != null) {
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ2 = LJJIJ();
            if (iBottomFriendsTabAvatarAbilityLJJIJ2 != null) {
                iBottomFriendsTabAvatarAbilityLJJIJ2.ZD1(aweme);
            }
            C1587050rOx.LIZJ(this.LLIZ, "REPOST_FEED", c1587090rP12.LIZIZ);
        }
        for (ISocialTabProtocol iSocialTabProtocol : (ArrayList) LJJJ()) {
            iSocialTabProtocol.ZA1(this.LLIZ.LJII(iSocialTabProtocol.getTag()), false);
        }
        LJJIJIIJIL("onFriendsFeedRedDotMinus", null);
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJFF(Throwable th, EnumC1586970rOp enumC1586970rOp) {
        C1587050rOx c1587050rOx = this.LLIZ;
        synchronized (c1587050rOx) {
            IBottomTabLayoutAbility iBottomTabLayoutAbilityLIZIZ = c1587050rOx.LIZIZ();
            if ((iBottomTabLayoutAbilityLIZIZ == null || iBottomTabLayoutAbilityLIZIZ.dL() == null) && c1587050rOx.LIZIZ.isEmpty()) {
                for (ISocialTabProtocol iSocialTabProtocol : C1587050rOx.LIZLLL()) {
                    c1587050rOx.LIZIZ.add(new SingleTabCounter(iSocialTabProtocol.getTag(), 0, c1587050rOx.LJI(iSocialTabProtocol.getTag())));
                }
                c1587050rOx.LJ();
            }
        }
        this.LLIZLLLIL = new C1582080rGw();
        BaseRedDotImpl.LJJIIJ(null, enumC1586970rOp);
        LJJIJLIJ(null, enumC1586970rOp);
        LJJIJIIJIL("onError", enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        ArrayList<ContentMetadata> contentMetadataList;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        this.LLILLJJLI = newContentResponse;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = newContentResponse.getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            contentMetadataList = friendsFeedResponse.getContentMetadataList();
        } else {
            contentMetadataList = null;
        }
        LJJ(contentMetadataList);
        C1587050rOx c1587050rOx = this.LLIZ;
        synchronized (c1587050rOx) {
            c1587050rOx.LIZIZ.clear();
            String strLJFF = c1587050rOx.LJFF();
            List listLIZLLL = C1587050rOx.LIZLLL();
            ArrayList<ISocialTabProtocol> arrayList = new ArrayList();
            for (Object obj : listLIZLLL) {
                ISocialTabProtocol iSocialTabProtocol = (ISocialTabProtocol) obj;
                C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                if (c19egLIZIZ != null) {
                    iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null));
                } else {
                    iSocial2TabProtocolAbilityLJI = null;
                }
                if (iSocial2TabProtocolAbilityLJI == null || !iSocial2TabProtocolAbilityLJI.tF0()) {
                    IBottomTabLayoutAbility iBottomTabLayoutAbilityLIZIZ = c1587050rOx.LIZIZ();
                    if (iBottomTabLayoutAbilityLIZIZ == null || !iBottomTabLayoutAbilityLIZIZ.hv0() || !Intrinsics.LJFF(iSocialTabProtocol.getTag(), strLJFF)) {
                        arrayList.add(obj);
                    }
                } else {
                    IBottomTabLayoutAbility iBottomTabLayoutAbilityLIZIZ2 = c1587050rOx.LIZIZ();
                    if (iBottomTabLayoutAbilityLIZIZ2 != null && !iBottomTabLayoutAbilityLIZIZ2.hv0()) {
                        arrayList.add(obj);
                    }
                }
            }
            for (ISocialTabProtocol iSocialTabProtocol2 : arrayList) {
                c1587050rOx.LIZIZ.add(new SingleTabCounter(iSocialTabProtocol2.getTag(), newContentResponse.tabCount(iSocialTabProtocol2.getTag()), c1587050rOx.LJI(iSocialTabProtocol2.getTag())));
            }
        }
        BaseRedDotImpl.LJJIIJ(newContentResponse, enumC1586970rOp);
        LJJIJLIJ(newContentResponse, enumC1586970rOp);
        LJJIJIIJIL("onSuccess", enumC1586970rOp);
        super.LJIIJ(newContentResponse, enumC1586970rOp);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e5 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587020rOu.LJIIL(java.lang.String, java.lang.String):void");
    }

    public final void LJJIJIIJIL(String str, EnumC1586970rOp enumC1586970rOp) {
        C2252408s6.LJII(new AwS139S1200000_24(this, str, enumC1586970rOp, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r6, X.EnumC1586970rOp r7) {
        /*
            r5 = this;
            X.0rT8 r0 = X.C1589640rT8.LIZIZ
            boolean r0 = r0.W2()
            if (r0 == 0) goto L9
            return
        L9:
            X.0rOp r0 = X.EnumC1586970rOp.SWITCH_ACCOUNT
            r1 = 1
            if (r7 != r0) goto L17
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility r0 = r5.LJJIJ()
            if (r0 == 0) goto L17
            r0.BB(r1)
        L17:
            X.0CLE r0 = X.C0CLE.LIZ
            r0.getClass()
            boolean r1 = X.C0CLE.LIZ()
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility r0 = LJJIIZI()
            if (r0 == 0) goto L7c
            boolean r0 = r0.hv0()
        L2a:
            X.0rOF r4 = X.EnumC1586610rOF.FRIENDS_FEED
            if (r1 == 0) goto L79
            if (r0 != 0) goto L79
            r0 = 0
            if (r6 == 0) goto L7a
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$FriendsFeedRedDotResponse r1 = r6.getFriendsFeedResponse()
            if (r1 == 0) goto L7a
            java.util.ArrayList r1 = r1.getAvatarList()
            if (r1 == 0) goto L7a
            java.lang.Object r3 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r3 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r3
            if (r3 != 0) goto L70
        L47:
            X.0rIu r1 = X.C1583300rIu.LIZ
            r1.getClass()
            com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig r1 = X.C1583300rIu.LIZ()
            if (r1 == 0) goto L70
            int r1 = r1.bottomReminder
            r2 = 4
            r1 = r1 & 4
            if (r1 != r2) goto L70
            X.0rOF r4 = X.EnumC1586610rOF.REPOST_FEED
            if (r6 == 0) goto L70
            com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$RepostFeedRedDotResponse r1 = r6.getRepostFeedResponse()
            if (r1 == 0) goto L70
            java.util.ArrayList r1 = r1.getAvatarList()
            if (r1 == 0) goto L6f
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r0
        L6f:
            r3 = r0
        L70:
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility r0 = r5.LJJIJ()
            if (r0 == 0) goto L79
            r0.Cs1(r3, r4)
        L79:
            return
        L7a:
            r3 = r0
            goto L47
        L7c:
            r0 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587020rOu.LJJIJLIJ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse, X.0rOp):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r4 = true;
     */
    @Override // X.InterfaceC1586780rOW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeRedDotByUid(java.lang.String r9, X.EnumC1392960mLu r10) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587020rOu.removeRedDotByUid(java.lang.String, X.0mLu):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.13BV] */
    public final void LJJIJIL(String str, int i, EnumC1586970rOp enumC1586970rOp) {
        int redDotCount;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        int iIntValue;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        C1587060rOy c1587060rOy;
        Object arrayList;
        int size;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3;
        ArrayList<FriendsUserNewContent> avatarList;
        List<FriendsUserNewContent> listSubList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse4;
        ArrayList<FriendsUserNewContent> avatarList2;
        Integer num;
        int redDotCount2;
        Object arrayList2;
        int size2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse5;
        ArrayList<FriendsUserNewContent> avatarList3;
        List<FriendsUserNewContent> listSubList2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse6;
        ArrayList<FriendsUserNewContent> avatarList4;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse7;
        String fakeCountReason2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse8;
        C1587060rOy c1587060rOy2;
        if (this.LLILZIL != null && C1587060rOy.LIZLLL() && (c1587060rOy2 = this.LLILZIL) != null) {
            c1587060rOy2.LIZJ();
        }
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
        Fragment fragmentFg1 = null;
        if (C296370BjX.LIZ()) {
            C19EG c19egLIZIZ = stateOwner.LIZIZ();
            if (c19egLIZIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("showNumberRedDot ");
                sbLIZ2.append(i);
                sbLIZ2.append("，lastRedDotCount:");
                sbLIZ2.append(this.LLJI);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (this.LLJI != i) {
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
                    IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ = LJJIJ();
                    String strLJJIJIIJI = LJJIJIIJI();
                    c1587170rP9.getClass();
                    C1587170rP9.LJIIL(i, redDotCount2, i, iBottomFriendsTabAvatarAbilityLJJIJ, enumC1586970rOp, strBQ2, str2, strLJJIJIIJI);
                    IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL2 = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
                    if (iFriendsTabLayoutAbilityLIZLLL2 != null) {
                        fragmentFg1 = iFriendsTabLayoutAbilityLIZLLL2.fg1("FRIENDS_FEED");
                    }
                    if (i > 0 && fragmentFg1 == null && !C1587080rP0.LIZ(enumC1586970rOp) && !C1587080rP0.LIZIZ(str)) {
                        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
                        if (c1595430rcT.LIZIZ().enableTabAvatar()) {
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
                        } else {
                            arrayList2 = C13BV.INSTANCE;
                        }
                        C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NUMBER_DOT_CHANGE.getScene(), C08JS.LIZLLL(arrayList2), C1586540rO8.LIZ(enumC1586970rOp));
                    }
                    this.LLJI = i;
                }
                if (C1589640rT8.LIZIZ.W2()) {
                    C1587060rOy c1587060rOy3 = this.LLILZIL;
                    if (c1587060rOy3 != null) {
                        c1587060rOy3.LIZIZ();
                    }
                    C1587060rOy c1587060rOy4 = this.LLILZIL;
                    if (c1587060rOy4 != null) {
                        c1587060rOy4.LIZ(0);
                        return;
                    }
                    return;
                }
                C1EK7.LIZ.getClass();
                if (C1EK7.LIZ()) {
                    C1587060rOy c1587060rOy5 = this.LLILZIL;
                    if (c1587060rOy5 != null) {
                        c1587060rOy5.LJFF();
                    }
                    C1587060rOy c1587060rOy6 = this.LLILZIL;
                    if (c1587060rOy6 != null) {
                        c1587060rOy6.LIZ(0);
                    }
                    this.LLILZ = true;
                    return;
                }
                C1587060rOy c1587060rOy7 = this.LLILZIL;
                if (c1587060rOy7 == null) {
                    return;
                }
                c1587060rOy7.LIZ(i);
                return;
            }
            return;
        }
        C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
        if (c19egLIZIZ2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("showNumberRedDot ");
            sbLIZ3.append(i);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1587060rOy c1587060rOy8 = this.LLILZIL;
            if (c1587060rOy8 == null || c1587060rOy8.getDotCount() != i) {
                C1587170rP9 c1587170rP92 = C1587170rP9.LIZ;
                String strBQ22 = Hox.LLJILJIL.LIZ(c19egLIZIZ2).BQ2();
                NewContentResponse newContentResponse3 = this.LLILLJJLI;
                if (newContentResponse3 != null && (friendsFeedResponse2 = newContentResponse3.getFriendsFeedResponse()) != null) {
                    redDotCount = friendsFeedResponse2.getRedDotCount();
                } else {
                    redDotCount = 0;
                }
                NewContentResponse newContentResponse4 = this.LLILLJJLI;
                if (newContentResponse4 != null && (friendsFeedResponse = newContentResponse4.getFriendsFeedResponse()) != null && (fakeCountReason = friendsFeedResponse.getFakeCountReason()) != null) {
                    str2 = fakeCountReason;
                }
                IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ2 = LJJIJ();
                String strLJJIJIIJI2 = LJJIJIIJI();
                c1587170rP92.getClass();
                C1587170rP9.LJIIL(i, redDotCount, i, iBottomFriendsTabAvatarAbilityLJJIJ2, enumC1586970rOp, strBQ22, str2, strLJJIJIIJI2);
            }
            C1587060rOy c1587060rOy9 = this.LLILZIL;
            if (c1587060rOy9 != null && (num = (Integer) ((LinkedHashMap) c1587060rOy9.LIZIZ).get("FRIENDS_FEED")) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue != this.LLIZ.LJII("FRIENDS_FEED") && (((iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ2, null))) == null || iFriendsTabLayoutAbilityLIZLLL.fg1("FRIENDS_FEED") == null) && (c1587060rOy = this.LLILZIL) != null && c1587060rOy.getDotCount() > 0)) {
                C1595430rcT c1595430rcT2 = C1595430rcT.LIZIZ;
                if (c1595430rcT2.LIZIZ().enableTabAvatar()) {
                    NewContentResponse latestResponse3 = c1595430rcT2.LIZIZ().getLatestResponse();
                    if (latestResponse3 != null && (friendsFeedResponse4 = latestResponse3.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse4.getAvatarList()) != null) {
                        size = avatarList2.size();
                    } else {
                        size = 0;
                    }
                    int iLIZ2 = C18000073e.LIZ();
                    if (iLIZ2 <= size) {
                        size = iLIZ2;
                    }
                    NewContentResponse latestResponse4 = c1595430rcT2.LIZIZ().getLatestResponse();
                    if (latestResponse4 != null && (friendsFeedResponse3 = latestResponse4.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse3.getAvatarList()) != null && (listSubList = avatarList.subList(0, size)) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                        Iterator<FriendsUserNewContent> it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next().getItemId());
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NUMBER_DOT_CHANGE.getScene(), C08JS.LIZLLL(arrayList), C1586540rO8.LIZ(enumC1586970rOp));
            }
            C1EK7.LIZ.getClass();
            if (C1EK7.LIZ()) {
                C1587060rOy c1587060rOy10 = this.LLILZIL;
                if (c1587060rOy10 != null) {
                    c1587060rOy10.LJFF();
                }
                C1587060rOy c1587060rOy11 = this.LLILZIL;
                if (c1587060rOy11 != null) {
                    c1587060rOy11.LIZ(0);
                }
                this.LLILZ = true;
                return;
            }
            C1587060rOy c1587060rOy12 = this.LLILZIL;
            if (c1587060rOy12 != null) {
                c1587060rOy12.LIZ(i);
            }
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        UserNewContent userNewContent;
        C1587210rPD c1587210rPDPm0;
        if (z && i == 3) {
            LJII();
            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ = LJJIJ();
            if (iBottomFriendsTabAvatarAbilityLJJIJ != null && (c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJJIJ.pm0()) != null) {
                userNewContent = c1587210rPDPm0.LIZIZ;
            } else {
                userNewContent = null;
            }
            c1587170rP9.getClass();
            C087Q.LIZ(new AwS139S1200000_24(userNewContent, "replaced", (UserNewContent) null, 6));
        }
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        boolean z3;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        if (Intrinsics.LJFF(str, "FRIENDS_TAB")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on friends bottom 2 tab selected, isOnMain = ");
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                z3 = true;
            } else {
                z3 = false;
            }
            sbLIZ.append(z3);
            C2188811AlT.LIZIZ(sbLIZ);
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LJ();
            if (str2 == null) {
                str2 = "";
            }
            LJIIL(str2, str3);
            this.LLJI = 0;
            IBottomTabLayoutAbility iBottomTabLayoutAbilityLJJIIZI = LJJIIZI();
            if (iBottomTabLayoutAbilityLJJIIZI != null && iBottomTabLayoutAbilityLJJIIZI.dL() != null) {
                if (C0C0K.LIZ() && Intrinsics.LJFF(str3, "click_bottom")) {
                    this.LLIZ.LJIIIIZZ();
                    LJJIJIIJIL("switch to 2 tab not first time opt", null);
                } else if (C0C0K.LIZ() && Intrinsics.LJFF(str3, "publish_landing")) {
                    this.LLIZ.LJIIIIZZ();
                    LJJIJIIJIL("switch to 2 tab not first time opt - publish landing", null);
                    C1584890rLT.LIZ.getClass();
                    C1584890rLT.LIZIZ("FRIENDS_FEED");
                } else {
                    this.LLIZ.LJIIIIZZ();
                    LJJIJIIJIL("switch to 2 tab not first time", null);
                }
            } else {
                this.LLIZ.LJIIIIZZ();
                LJJIJIIJIL("switch to 2 tab with null fragment", null);
            }
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null && iSocial2TabProtocolAbilityLJI.tF0()) {
                this.LLIZ.LJIIIIZZ();
            }
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIJ = LJJIJ();
            if (iBottomFriendsTabAvatarAbilityLJJIJ != null) {
                iBottomFriendsTabAvatarAbilityLJJIJ.onTabChanged(str);
            }
        }
    }
}
