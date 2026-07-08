package X;

import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import Y.AkS477S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestAllPanelFloatNickNameMinWidthSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevertFollowButton;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixNicknameFollowStatusReInitSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SocialGameUserSpotExtra;

/* JADX INFO: renamed from: X.0aZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940120aZW extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public User LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public View LLJILJILJ;
    public C1126540fQC LLJILLL;
    public C20743416Fc LLJJ;
    public C20743416Fc LLJJI;
    public final C01GW LLJJIII;
    public InterfaceC940910aan LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    private final String getFollowBtnAnimationFileName() {
        return "ttlive_user_info_follow_complete_1.webp";
    }

    public final void LJIJ() {
        SocialGameUserSpotExtra socialGameUserSpotExtra;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hto, this, true);
        if (viewTd != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 298), viewTd);
        }
        this.LLJJI = (C20743416Fc) findViewById(R.id.zto);
        MultiGuestSpotExtra multiGuestExtra = getWindow().getMultiGuestExtra();
        if (multiGuestExtra == null || (socialGameUserSpotExtra = multiGuestExtra.socialGameUser) == null || !socialGameUserSpotExtra.isEnlarged) {
            C20743416Fc c20743416Fc = this.LLJJI;
            if (c20743416Fc != null) {
                C439101nJ.LJI(c20743416Fc);
            }
        } else {
            C20743416Fc c20743416Fc2 = this.LLJJI;
            if (c20743416Fc2 != null) {
                C12ES.LJIILL(0, c20743416Fc2);
            }
        }
        if (!LJII() || viewTd == null) {
            return;
        }
        viewTd.setBackgroundResource(R.drawable.ea_);
    }

    public final void LJIJI() {
        String str;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<C2262071DgL>> c11pq;
        C11PQ<List<C2262071DgL>> c11pq2;
        C11PQ<Integer> c11pq3;
        Integer numLJLZ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.htp, this, true);
        if (getWindow().LLJIJIL) {
            viewTd.setBackground(null);
        }
        this.LLJJ = (C20743416Fc) findViewById(R.id.p94);
        C938220aWS c938220aWS = this.LLJ.get();
        LJIIZILJ((c938220aWS == null || (c11pq3 = c938220aWS.LLJI) == null || (numLJLZ = c11pq3.LJLZ()) == null) ? 0 : numLJLZ.intValue());
        this.LLJILJILJ = findViewById(R.id.ied);
        this.LLJILLL = (C1126540fQC) findViewById(R.id.ife);
        C940110aZV followStatusController = getFollowStatusController();
        if (followStatusController != null) {
            followStatusController.LIZJ();
        } else {
            LJIIJJI();
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null) {
            if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
                C938220aWS c938220aWS2 = this.LLJ.get();
                if (c938220aWS2 != null) {
                    LJIILJJIL();
                    C938230aWT c938230aWTLIZJ2 = c938220aWS2.LIZJ(str, false, false);
                    if (c938230aWTLIZJ2 != null && (c11pq2 = c938230aWTLIZJ2.LJ) != null) {
                        getCompositeDisposable().LIZ(new C11IW(C948810anX.LIZ(c11pq2.LJJIFFI(), c938220aWS2.LLJI.LJJIFFI()).LJJJJZI(new AkS477S0100000_15(this, 15))).LJIILL().LJIIZILJ());
                    }
                }
            } else {
                C938220aWS c938220aWS3 = this.LLJ.get();
                if (c938220aWS3 != null && (c938230aWTLIZJ = c938220aWS3.LIZJ(str, false, false)) != null && (c11pq = c938230aWTLIZJ.LJ) != null) {
                    getCompositeDisposable().LIZ(new C11IW(c11pq.LJJII(new InterfaceC1627390sS1() { // from class: X.0aZY
                        @Override // X.InterfaceC1627390sS1
                        public final boolean test(Object obj, Object obj2) {
                            String nickName;
                            User user;
                            User user2;
                            List list = (List) obj2;
                            C2262071DgL c2262071DgL = (C2262071DgL) C13LP.LJJJLL((List) obj);
                            String nickName2 = null;
                            if (c2262071DgL != null && (user2 = c2262071DgL.LIZ) != null) {
                                nickName = user2.getNickName();
                            } else {
                                nickName = null;
                            }
                            C2262071DgL c2262071DgL2 = (C2262071DgL) C13LP.LJJJLL(list);
                            if (c2262071DgL2 != null && (user = c2262071DgL2.LIZ) != null) {
                                nickName2 = user.getNickName();
                            }
                            return Intrinsics.LJFF(nickName, nickName2);
                        }
                    }).LJJIJIIJIL(new AfS184S0100000_15(this, 244))).LJIILL().LJIIZILJ());
                }
            }
        }
        if (LJII()) {
            viewTd.setBackgroundResource(R.drawable.ea_);
        }
    }

    private final C940110aZV getFollowStatusController() {
        return (C940110aZV) this.LLJJIJIIJIL.getValue();
    }

    public final void LJIILJJIL() {
        Long lValueOf;
        User user = this.LLJI;
        if (user == null || (lValueOf = Long.valueOf(user.getId())) == null) {
            return;
        }
        lValueOf.longValue();
        if (getFollowStatusController() == null) {
            if (lValueOf.longValue() == UserService.getInstance().user().getCurrentUserId() || getWindow().LLJIJIL) {
                LJIIJJI();
                return;
            } else {
                getCompositeDisposable().LIZ(new C11IW(C742890TCd.LIZ(lValueOf.longValue()).LJJIJIIJIL(new AfS184S0100000_15(this, 243))).LJIILL().LJIIZILJ());
                return;
            }
        }
        if (this.LLJILJIL != lValueOf.longValue()) {
            C940110aZV followStatusController = getFollowStatusController();
            if (followStatusController != null) {
                long jLongValue = -1;
                if (followStatusController.LIZJ == -1) {
                    Long lLIZ = followStatusController.LIZ.LIZ();
                    if (lLIZ != null) {
                        long jLongValue2 = lLIZ.longValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("initByCache，uid=");
                        sbLIZ.append(jLongValue2);
                        sbLIZ.append(" followStatus:");
                        LinkedHashMap linkedHashMap = (LinkedHashMap) C940110aZV.LJ;
                        sbLIZ.append(linkedHashMap.get(Long.valueOf(jLongValue2)));
                        C20441214yg.LIZIZ("MultiGuestV3GuestMaskControllerV2", C2188811AlT.LIZIZ(sbLIZ));
                        Long l = (Long) linkedHashMap.get(Long.valueOf(jLongValue2));
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                    }
                    followStatusController.LIZJ = jLongValue;
                }
            }
            C940110aZV followStatusController2 = getFollowStatusController();
            if (followStatusController2 != null) {
                followStatusController2.LJ(null, "isTriggerUpdateFollowStatus");
            }
            this.LLJILJIL = lValueOf.longValue();
        }
    }

    public final void LJIILLIIL() {
        C11PQ<Integer> c11pq;
        Integer numLJLZ;
        C20743416Fc c20743416Fc = this.LLJJ;
        ViewGroup.LayoutParams layoutParams = c20743416Fc != null ? c20743416Fc.getLayoutParams() : null;
        C19ME c19me = layoutParams instanceof C19ME ? (C19ME) layoutParams : null;
        if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
            C938220aWS c938220aWS = this.LLJ.get();
            if (c938220aWS != null && (c11pq = c938220aWS.LLJI) != null && (numLJLZ = c11pq.LJLZ()) != null) {
                if (numLJLZ.intValue() == 0) {
                    if (c19me != null) {
                        c19me.matchConstraintMinWidth = C439101nJ.LIZ(18);
                    }
                } else if (numLJLZ.intValue() == 1 && c19me != null) {
                    c19me.matchConstraintMinWidth = 0;
                }
            }
            C20743416Fc c20743416Fc2 = this.LLJJ;
            if (c20743416Fc2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743416Fc2);
                c20743416Fc2.setLayoutParams(c19me);
            }
        }
    }

    @Override // X.AbstractC939840aZ4
    public int getElementWidth() {
        C20743416Fc c20743416Fc = this.LLJJ;
        if (c20743416Fc != null) {
            return c20743416Fc.getWidth();
        }
        return 0;
    }

    public final InterfaceC946970akZ getLetsDanceService() {
        return (InterfaceC946970akZ) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(0, C439101nJ.LIZ(MultiGuestAllPanelFloatNickNameMinWidthSetting.INSTANCE.value()), 1);
    }

    public final void LJIIJ() {
        C1126540fQC followButton;
        C1126540fQC followButton2;
        C1126540fQC followButton3;
        C1126540fQC followButton4 = getFollowButton();
        if (followButton4 != null && followButton4.LJI() && (followButton3 = getFollowButton()) != null) {
            followButton3.LIZLLL();
        }
        C1126540fQC followButton5 = getFollowButton();
        if (followButton5 == null || followButton5.LJI() || (followButton = getFollowButton()) == null || followButton.getVisibility() != 0 || (followButton2 = getFollowButton()) == null) {
            return;
        }
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = followButton2;
        c1143920fsE.LJFF = true;
        c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1");
        c1143920fsE.LIZJ = getFollowBtnAnimationFileName();
        c1143920fsE.LJ = new C987290bnb(this, 5);
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }

    public final void LJIIJJI() {
        C1126540fQC followButton = getFollowButton();
        if (followButton != null) {
            C439101nJ.LJI(followButton);
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C439101nJ.LJI(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 != null) {
                followButtonDelegate2.setEnabled(false);
            }
        }
    }

    public final void LJIIL() {
        C940110aZV followStatusController = getFollowStatusController();
        if (followStatusController == null) {
            LJIIJJI();
            return;
        }
        Boolean boolLIZIZ = followStatusController.LIZIZ();
        if (boolLIZIZ != null) {
            if (boolLIZIZ.booleanValue()) {
                LJIIJJI();
            } else {
                LJIILL();
            }
        }
    }

    public final void LJIILL() {
        User user;
        User user2;
        User.EnigmaInfo enigmaInfo;
        if (MultiGuestRevertFollowButton.enable() || !((user = this.LLJI) == null || (enigmaInfo = user.enigmaInfo) == null || !enigmaInfo.isEnigmaMaskOn)) {
            C1126540fQC followButton = getFollowButton();
            if (followButton != null) {
                C439101nJ.LJI(followButton);
            }
            View followButtonDelegate = getFollowButtonDelegate();
            if (followButtonDelegate != null) {
                C439101nJ.LJI(followButtonDelegate);
            }
            View followButtonDelegate2 = getFollowButtonDelegate();
            if (followButtonDelegate2 != null) {
                followButtonDelegate2.setEnabled(false);
                return;
            }
            return;
        }
        C1126540fQC followButton2 = getFollowButton();
        if (followButton2 != null) {
            if (!C500260Jjc.LJJJJIZL(followButton2) && (user2 = this.LLJI) != null) {
                C0JGT.LIZJ(user2.getId());
            }
            setFollowBtnImage(followButton2);
            C12ES.LJIILL(0, followButton2);
            View followButtonDelegate3 = getFollowButtonDelegate();
            if (followButtonDelegate3 != null) {
                C12ES.LJIILL(0, followButtonDelegate3);
            }
            View followButtonDelegate4 = getFollowButtonDelegate();
            if (followButtonDelegate4 != null) {
                followButtonDelegate4.setEnabled(true);
            }
            View followButtonDelegate5 = getFollowButtonDelegate();
            if (followButtonDelegate5 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 297), followButtonDelegate5);
            }
        }
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htn);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C947420alI c947420alILJII;
        C949050anv c949050anvLJIIJ;
        super.onAttachedToWindow();
        if (!MultiGuestSocialGameLetsDanceSetting.config().participantLetsDanceEnabled) {
            LJIJI();
            return;
        }
        C947590alZ c947590alZ = null;
        if (!getWindow().LLJIJIL && getWindow().LLJILJIL && getWindow().getLinkMicId() != null) {
            InterfaceC940910aan interfaceC940910aan = this.LLJJIJI;
            if (interfaceC940910aan != null) {
                interfaceC940910aan.unsubscribe();
            }
            InterfaceC946970akZ letsDanceService = getLetsDanceService();
            if (letsDanceService != null) {
                String linkMicId = getWindow().getLinkMicId();
                if (linkMicId == null) {
                    linkMicId = "";
                }
                c949050anvLJIIJ = letsDanceService.LJIIJ(linkMicId, new AwS664S0100000_15(this, 20));
            } else {
                c949050anvLJIIJ = null;
            }
            this.LLJJIJI = c949050anvLJIIJ;
        }
        if (!getWindow().LLJIJIL && getWindow().LLJILJIL) {
            InterfaceC946970akZ letsDanceService2 = getLetsDanceService();
            if (letsDanceService2 != null && (c947420alILJII = letsDanceService2.LJII()) != null) {
                c947590alZ = c947420alILJII.LJIIIIZZ.get(getWindow().getLinkMicId());
            }
            if (LJIILIIL(c947590alZ)) {
                LJIJ();
                return;
            }
        }
        LJIJI();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C940110aZV followStatusController = getFollowStatusController();
        if (followStatusController != null) {
            followStatusController.LIZLLL();
        }
        InterfaceC940910aan interfaceC940910aan = this.LLJJIJI;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
    }

    private final View getFollowButtonDelegate() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.NICKNAME;
    }

    public final C1126540fQC getFollowButton() {
        return this.LLJILLL;
    }

    public static final boolean LJIILIIL(C947590alZ c947590alZ) {
        if (c947590alZ != null) {
            EnumC942260acy enumC942260acy = c947590alZ.LIZJ;
            if (enumC942260acy == EnumC942260acy.READY || enumC942260acy == EnumC942260acy.JOINED) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void setFollowBtnImage(C1126540fQC c1126540fQC) {
        c1126540fQC.setActualImageResource(R.drawable.f0q);
    }

    public final void LJIIZILJ(int i) {
        C20743416Fc c20743416Fc;
        LJIILLIIL();
        if (C917910Zzh.LIZ(C930540aK4.LIZJ()) && i == 1) {
            C20743416Fc c20743416Fc2 = this.LLJJ;
            if (c20743416Fc2 != null) {
                c20743416Fc2.LJJJI(R.style.a9n);
            }
            C20743416Fc c20743416Fc3 = this.LLJJ;
            if (c20743416Fc3 != null) {
                c20743416Fc3.setTextSize(10.0f);
                return;
            }
            return;
        }
        if (C917910Zzh.LIZ(C930540aK4.LIZJ()) && i == 0 && (c20743416Fc = this.LLJJ) != null) {
            c20743416Fc.LJJJI(R.style.a9k);
        }
        int iWidth = getWindow().getShapeDescriptor().LIZ.width();
        LJIILLIIL();
        if (iWidth >= ((int) C497740JfY.LIZIZ(64.0f))) {
            if (LJII()) {
                C20743416Fc c20743416Fc4 = this.LLJJ;
                if (c20743416Fc4 != null) {
                    c20743416Fc4.setTextSize(10.0f);
                    return;
                }
                return;
            }
            C20743416Fc c20743416Fc5 = this.LLJJ;
            if (c20743416Fc5 == null) {
                return;
            }
            c20743416Fc5.setTextSize(11.0f);
            return;
        }
        C20743416Fc c20743416Fc6 = this.LLJJ;
        if (c20743416Fc6 == null) {
            return;
        }
        c20743416Fc6.setTextSize(9.0f);
    }

    public final void LJIJJ(List<C2262071DgL> list) {
        C940110aZV followStatusController;
        Boolean boolLIZIZ;
        User user;
        if (!list.isEmpty()) {
            C12ES.LJIILL(0, this);
            C2262071DgL c2262071DgL = (C2262071DgL) C13LP.LJJJJZI(list);
            if (c2262071DgL != null) {
                user = c2262071DgL.LIZ;
            } else {
                user = null;
            }
            this.LLJI = user;
            C20743416Fc c20743416Fc = this.LLJJ;
            if (c20743416Fc != null) {
                c20743416Fc.setText(C0KVU.LIZ(user));
            }
            LJIILJJIL();
        } else {
            C439101nJ.LJI(this);
        }
        if (BugFixNicknameFollowStatusReInitSetting.INSTANCE.isEnable() && (followStatusController = getFollowStatusController()) != null && (boolLIZIZ = followStatusController.LIZIZ()) != null) {
            if (boolLIZIZ.booleanValue()) {
                LJIIJJI();
            } else {
                LJIILL();
            }
        }
    }

    public final void LJIIIZ(long j, User user) {
        C940110aZV followStatusController = getFollowStatusController();
        if (followStatusController != null) {
            followStatusController.LIZ(j, user);
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099420eiS c1099420eiS = new C1099420eiS();
        c1099420eiS.LIZIZ(user.getId());
        c1099420eiS.LJ(j);
        c1099420eiS.getClass();
        interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00z2
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NicknameBizViewElement@2bb5.follow$1");
                C784440Upu.LIZ().LIZIZ(new C257100z3((FollowPair) obj));
                C1C7U.LIZIZ("NicknameBizViewElement@2bb5.follow$1");
            }
        }, new C09JN() { // from class: X.00ak
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NicknameBizViewElement@2bb5.follow$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C501470JlZ) {
                    C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                } else {
                    C766270U4b.LIZLLL(2131853482);
                }
                C1C7U.LIZIZ("NicknameBizViewElement@2bb5.follow$2");
            }
        });
    }

    public C940120aZW(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, InterfaceC920220a3Q interfaceC920220a3Q) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        this.LLJIJIL = true;
        this.LLJILJIL = -1L;
        this.LLJJIII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(469));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS416S0200000_15(c957020b0m, this, 121));
    }
}
