package X;

import android.os.Bundle;
import android.os.Looper;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1587040rOw extends BaseRedDotImpl implements InterfaceC1586360rNq, InterfaceC586170Myt {
    public C1587060rOy LLILZIL;
    public int LLIZ;
    public IBottomFriendsTabAvatarAbility LLJ;
    public int LLJI;
    public final C1587050rOx LLILZLL = new C1587050rOx();
    public C1582080rGw LLIZLLLIL = new C1582080rGw();

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJII() {
        this.LLIZ = 0;
    }

    @Override // X.InterfaceC1586780rOW
    public final void LIZJ() {
        LJJIJ(this, "click unlogin");
    }

    public final IBottomFriendsTabAvatarAbility LJJIIZI() {
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJJI = this.LLJ;
        if (iBottomFriendsTabAvatarAbilityLJIIJJI == null) {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            iBottomFriendsTabAvatarAbilityLJIIJJI = c19egLIZIZ != null ? C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null)) : null;
            this.LLJ = iBottomFriendsTabAvatarAbilityLJIIJJI;
        }
        return iBottomFriendsTabAvatarAbilityLJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJIII() {
        super.LJJIII();
        this.LLILZLL.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final C1587230rPF getSocialTabNoticeData() {
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI();
        String str = null;
        C1587210rPD c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJJIIZI != null ? iBottomFriendsTabAvatarAbilityLJJIIZI.pm0() : null;
        int i = this.LLIZ;
        if (c1587210rPDPm0 != null) {
            str = "head_number";
        } else if (i > 0) {
            str = "number_dot";
        } else if (this.LLILZIL != null && C1587060rOy.LIZLLL()) {
            str = "red_dot";
        }
        int i2 = this.LLIZ;
        NewContentResponse newContentResponse = this.LLILLJJLI;
        int redDotCount = (newContentResponse == null || (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) == null) ? this.LLIZ : friendsFeedResponse2.getRedDotCount();
        NewContentResponse newContentResponse2 = this.LLILLJJLI;
        if (newContentResponse2 == null || (friendsFeedResponse = newContentResponse2.getFriendsFeedResponse()) == null || (fakeCountReason = friendsFeedResponse.getFakeCountReason()) == null) {
            fakeCountReason = "";
        }
        return new C1587230rPF(str, i2, redDotCount, fakeCountReason, c1587210rPDPm0, 96);
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
        boolean z2 = true;
        if (((Number) C278360Ava.LIZ.getValue()).intValue() != 1) {
            z2 = false;
        }
        if (z2) {
            this.LLJ = null;
        }
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            C343710Ddh.LIZ(c19egLIZIZ).wQ2(this);
        }
        LJJIJIL(null);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final Pair<Boolean, String> LJIJ(EnumC1586970rOp enumC1586970rOp) {
        boolean zRu = C1599640rjG.LIZIZ.Ru();
        if (C1589640rT8.LIZIZ.C2()) {
            return new Pair<>(Boolean.TRUE, null);
        }
        if (zRu) {
            return new Pair<>(Boolean.TRUE, "in_tab");
        }
        C312040CLa.LIZ.getClass();
        if (C312040CLa.LIZIZ()) {
            LJJIJIL(enumC1586970rOp);
            return new Pair<>(Boolean.TRUE, "no_following_or_friend");
        }
        return super.LJIJ(enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final int LJIJI(String str) {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LJJIFFI(boolean z) {
        super.LJJIFFI(z);
        C1582120rH0.LIZ();
    }

    public final void LJJIJIL(EnumC1586970rOp enumC1586970rOp) {
        C1587060rOy c1587060rOy;
        String str;
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.E2()) {
            return;
        }
        if (!c1589640rT8.W2() && enumC1586970rOp != EnumC1586970rOp.COLD_START && enumC1586970rOp != EnumC1586970rOp.LOGIN_SUCCESS && enumC1586970rOp != EnumC1586970rOp.SWITCH_ACCOUNT && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C1587220rPE.LIZ.getClass();
        boolean z = C1587220rPE.LIZIZ.getBoolean("has_shown_guide_dot", false);
        if (!C1599640rjG.LIZIZ.Ru() && !z && (c1587060rOy = this.LLILZIL) != null && c1587060rOy.getDotCount() == 0) {
            C1587060rOy c1587060rOy2 = this.LLILZIL;
            if (c1587060rOy2 != null) {
                c1587060rOy2.LIZ = "friends";
                c1587060rOy2.LJFF();
            }
            LJJIIJZLJL();
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ != null) {
                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                String strBQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).BQ2();
                c1400330mXn.getClass();
                String strLJIIJ = C1400330mXn.LJIIJ(c19egLIZIZ, strBQ2, null);
                C1587060rOy c1587060rOy3 = this.LLILZIL;
                if (c1587060rOy3 != null) {
                    str = c1587060rOy3.LIZ;
                } else {
                    str = null;
                }
                c1587170rP9.getClass();
                C1587170rP9.LJIIIIZZ(strLJIIJ, str);
            }
        }
    }

    public static void LJJIJ(AbstractC1587040rOw abstractC1587040rOw, String str) {
        abstractC1587040rOw.getClass();
        C2252408s6.LJII(new AwS139S1200000_24(abstractC1587040rOw, str, (EnumC1586970rOp) null, 8));
    }

    public static final void LJJIJIIJI(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        Integer numValueOf;
        EnumC1587000rOs enumC1587000rOs;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<FriendsUserNewContent> avatarList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadWithInsert, source = ");
        FriendsUserNewContent friendsUserNewContent = null;
        if (enumC1586970rOp != null) {
            numValueOf = Integer.valueOf(enumC1586970rOp.getType());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair<Boolean, Boolean> pairLIZJ = C1587080rP0.LIZJ(enumC1586970rOp);
        boolean zBooleanValue = pairLIZJ.getFirst().booleanValue();
        boolean zBooleanValue2 = pairLIZJ.getSecond().booleanValue();
        if (zBooleanValue && zBooleanValue2) {
            if (newContentResponse != null && (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null) {
                friendsUserNewContent = (FriendsUserNewContent) C13LP.LJJJLL(avatarList);
            }
            if (enumC1586970rOp == EnumC1586970rOp.COLD_START) {
                enumC1587000rOs = EnumC1587000rOs.COLD_START;
            } else if (enumC1586970rOp == EnumC1586970rOp.NON_PERSONALIZED_CHANGED) {
                enumC1587000rOs = EnumC1587000rOs.NON_PERSONALIZED_FEED_CHANGE;
            } else {
                enumC1587000rOs = EnumC1587000rOs.HOMEPAGE_RECREATE;
            }
            C1599640rjG.LIZIZ.dv(friendsUserNewContent, enumC1587000rOs, enumC1586970rOp);
        }
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJ(Aweme aweme, List list) {
        String str;
        Object next;
        String str2;
        C1587210rPD c1587210rPDPm0;
        UserNewContent userNewContent;
        FriendsRedDotUser user;
        C1587210rPD c1587210rPDPm02;
        UserNewContent userNewContent2;
        FriendsRedDotUser user2;
        Iterator it2 = list.iterator();
        while (true) {
            str = null;
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
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI != null && (c1587210rPDPm02 = iBottomFriendsTabAvatarAbilityLJJIIZI.pm0()) != null && (userNewContent2 = c1587210rPDPm02.LIZIZ) != null && (user2 = userNewContent2.getUser()) != null) {
                str2 = user2.uid;
            } else {
                str2 = null;
            }
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI2 = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI2 != null) {
                iBottomFriendsTabAvatarAbilityLJJIIZI2.ZD1(aweme);
            }
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI3 = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI3 != null && (c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJJIIZI3.pm0()) != null && (userNewContent = c1587210rPDPm0.LIZIZ) != null && (user = userNewContent.getUser()) != null) {
                str = user.uid;
            }
            if (!Intrinsics.LJFF(str2, str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("avatar removed, oldUid=");
                sbLIZ.append(str2);
                sbLIZ.append(", newUid=");
                sbLIZ.append(str);
                C0W17.LIZJ("Bottom-V2", C2188811AlT.LIZIZ(sbLIZ));
                if (C296450Bjf.LIZ() || C296390BjZ.LIZ()) {
                    C1599640rjG.LIZIZ.Qu();
                }
            }
            this.LLIZ = BaseRedDotImpl.LJJI(c1587090rP1.LIZIZ, this.LLIZ, c1587090rP1.LIZJ);
        }
        LJJIJ(this, "onFriendsFeedRedDotMinus");
    }

    @Override // X.InterfaceC1586780rOW
    public final void LJFF(Throwable th, EnumC1586970rOp enumC1586970rOp) {
        this.LLIZLLLIL = new C1582080rGw();
        LJJIJIIJI(null, enumC1586970rOp);
        LJJIJIIJIL(null, enumC1586970rOp);
        C2252408s6.LJII(new AwS139S1200000_24(this, "onError", enumC1586970rOp, 8));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJIIJ(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        ArrayList<ContentMetadata> contentMetadataList;
        int newContentCountForDisplay;
        this.LLILLJJLI = newContentResponse;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = newContentResponse.getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            contentMetadataList = friendsFeedResponse.getContentMetadataList();
        } else {
            contentMetadataList = null;
        }
        LJJ(contentMetadataList);
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse();
        if (friendsFeedResponse2 != null) {
            newContentCountForDisplay = friendsFeedResponse2.getNewContentCountForDisplay();
        } else {
            newContentCountForDisplay = 0;
        }
        this.LLIZ = newContentCountForDisplay;
        LJJIJIIJI(newContentResponse, enumC1586970rOp);
        LJJIJIIJIL(newContentResponse, enumC1586970rOp);
        C2252408s6.LJII(new AwS139S1200000_24(this, "onSuccess", enumC1586970rOp, 8));
        super.LJIIJ(newContentResponse, enumC1586970rOp);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public void LJIIL(String str, String str2) {
        int dotCount;
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        boolean z4;
        int dotCount2;
        boolean z5;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        UserNewContent userNewContent;
        C1587210rPD c1587210rPDPm0;
        String str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideRedDotWhenEnteringFriendsTab enterMethod:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        C1400330mXn c1400330mXn = C1400330mXn.LIZ;
        int redDotCount = 0;
        if (str2 != null) {
            str2.length();
        }
        c1400330mXn.getClass();
        C1587060rOy c1587060rOy = this.LLILZIL;
        if (c1587060rOy != null) {
            dotCount = c1587060rOy.getDotCount();
        } else {
            dotCount = 0;
        }
        C1589640rT8.LIZIZ.c3(dotCount);
        if (this.LLILZIL != null && C1587060rOy.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        C1587060rOy c1587060rOy2 = this.LLILZIL;
        if (c1587060rOy2 != null && c1587060rOy2.LJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI();
        if (iBottomFriendsTabAvatarAbilityLJJIIZI != null && iBottomFriendsTabAvatarAbilityLJJIIZI.isShowing()) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str5 = "";
        if (z3) {
            str3 = "head_number";
        } else if (z) {
            str3 = "red_dot";
        } else if (!z2) {
            str3 = "";
        } else {
            str3 = "number_dot";
        }
        if (!z && !z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        C1587060rOy c1587060rOy3 = this.LLILZIL;
        if (c1587060rOy3 != null) {
            dotCount2 = c1587060rOy3.getDotCount();
        } else {
            dotCount2 = 0;
        }
        this.LLIZLLLIL = new C1582080rGw(z4, str3, dotCount2);
        if (this.LLIZ > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C1EK7.LIZ.getClass();
        boolean zLIZ = C1EK7.LIZ();
        if (dotCount > 0 || (z5 && zLIZ)) {
            this.LLJI = 0;
            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
            String strLJIIJ = C1400330mXn.LJIIJ(c19egLIZIZ, str, null);
            NewContentResponse newContentResponse = this.LLILLJJLI;
            if (newContentResponse != null && (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) != null) {
                redDotCount = friendsFeedResponse2.getRedDotCount();
            }
            NewContentResponse newContentResponse2 = this.LLILLJJLI;
            if (newContentResponse2 != null && (friendsFeedResponse = newContentResponse2.getFriendsFeedResponse()) != null && (fakeCountReason = friendsFeedResponse.getFakeCountReason()) != null) {
                str5 = fakeCountReason;
            }
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI2 = LJJIIZI();
            c1587170rP9.getClass();
            C1587170rP9.LJIIJJI(strLJIIJ, dotCount, dotCount, redDotCount, str5, iBottomFriendsTabAvatarAbilityLJJIIZI2, "friends");
        } else if (this.LLILZIL != null && C1587060rOy.LIZLLL()) {
            C1587170rP9 c1587170rP92 = C1587170rP9.LIZ;
            String strLJIIJ2 = C1400330mXn.LJIIJ(c19egLIZIZ, str, null);
            C1587060rOy c1587060rOy4 = this.LLILZIL;
            if (c1587060rOy4 != null) {
                str4 = c1587060rOy4.LIZ;
            } else {
                str4 = null;
            }
            c1587170rP92.getClass();
            C1587170rP9.LJII(strLJIIJ2, str4);
        }
        C1587170rP9 c1587170rP93 = C1587170rP9.LIZ;
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI3 = LJJIIZI();
        if (iBottomFriendsTabAvatarAbilityLJJIIZI3 != null && (c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJJIIZI3.pm0()) != null) {
            userNewContent = c1587210rPDPm0.LIZIZ;
        } else {
            userNewContent = null;
        }
        c1587170rP93.getClass();
        C087Q.LIZ(new AwS139S1200000_24(userNewContent, "click", (UserNewContent) null, 6));
        super.LJIIL(str, str2);
    }

    public final void LJJIJIIJIL(NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp) {
        UserNewContent userNewContent;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<FriendsUserNewContent> avatarList;
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI;
        if (C1589640rT8.LIZIZ.W2()) {
            return;
        }
        if (enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT && (iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI()) != null) {
            iBottomFriendsTabAvatarAbilityLJJIIZI.BB(true);
        }
        boolean zEnableTabAvatar = C1595430rcT.LIZIZ.LIZIZ().enableTabAvatar();
        boolean zRu = C1599640rjG.LIZIZ.Ru();
        if (zEnableTabAvatar && !zRu) {
            if (newContentResponse != null && (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null) {
                userNewContent = (UserNewContent) C13LP.LJJJLL(avatarList);
            } else {
                userNewContent = null;
            }
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI2 = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI2 != null) {
                iBottomFriendsTabAvatarAbilityLJJIIZI2.Cs1(userNewContent, EnumC1586610rOF.FRIENDS_WATER_FALL);
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1587040rOw.removeRedDotByUid(java.lang.String, X.0mLu):void");
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        UserNewContent userNewContent;
        C1587210rPD c1587210rPDPm0;
        if (z && i == 3) {
            this.LLIZ = 0;
            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI != null && (c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJJIIZI.pm0()) != null) {
                userNewContent = c1587210rPDPm0.LIZIZ;
            } else {
                userNewContent = null;
            }
            c1587170rP9.getClass();
            C087Q.LIZ(new AwS139S1200000_24(userNewContent, "replaced", (UserNewContent) null, 6));
        }
    }

    public void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        boolean z3;
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
            LJJIJ(this, "friends tab 3.0");
            this.LLIZ = 0;
            this.LLILZLL.LJIIIIZZ();
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = LJJIIZI();
            if (iBottomFriendsTabAvatarAbilityLJJIIZI != null) {
                iBottomFriendsTabAvatarAbilityLJJIIZI.onTabChanged(str);
            }
        }
    }
}
