package X;

import Y.ACListenerS154S0100000_19;
import Y.AObserverS230S0100000_28;
import Y.ARunnableS35S0110000_16;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908810zlv extends AbstractC1908820zlw {
    public final RelationButton LLJILJIL;
    public C1908830zlx LLJILJILJ;
    public final AObserverS230S0100000_28 LLJILLL;

    @Override // X.InterfaceC1908750zlp
    public final void LIZ() {
        NextLiveData<FollowStatus> nextLiveData;
        LiveEventObserver<FollowStatus> liveEventObserver = this.LLILZLL;
        if (liveEventObserver == null || (nextLiveData = liveEventObserver.LL) == null) {
            return;
        }
        nextLiveData.removeObserver(liveEventObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06b2 A[PHI: r7
      0x06b2: PHI (r7v2 int) = (r7v1 int), (r7v11 int) binds: [B:378:0x06ae, B:78:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908810zlv.LJIIZILJ():void");
    }

    @Override // X.AbstractC1908820zlw, X.InterfaceC1908750zlp
    public final void LJJIJIIJIL() {
        String str;
        String str2;
        String str3;
        String str4;
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        if (c1908830zlx == null || !c1908830zlx.LJIIZILJ) {
            return;
        }
        int followStatus = LJI().getFollowStatus();
        Integer numValueOf = Integer.valueOf(LJI().getFollowerStatus());
        if (followStatus == C0SY7.UNFOLLOW.getValue()) {
            int value = C0SY7.FOLLOWED.getValue();
            if (numValueOf == null || numValueOf.intValue() != value) {
                return;
            }
            SocialDataStruct socialData = LJI().getSocialData();
            String str5 = (socialData == null || !socialData.isNewFollower()) ? CardStruct.IStatusCode.DEFAULT : "1";
            Function0<InterfaceC898240ZLq> tracker = this.LLJILJIL.getTracker();
            String str6 = null;
            InterfaceC898240ZLq interfaceC898240ZLqInvoke = tracker != null ? tracker.invoke() : null;
            C1260960iv0 c1260960iv0 = interfaceC898240ZLqInvoke instanceof C1260960iv0 ? (C1260960iv0) interfaceC898240ZLqInvoke : null;
            C1072510e13 c1072510e13 = C1072510e13.LIZ;
            String uid = LJI().getUid();
            String accurateRecType = LJI().getAccurateRecType();
            str = "";
            if (accurateRecType == null) {
                accurateRecType = "";
            }
            if (c1260960iv0 == null || (str2 = c1260960iv0.LIZIZ) == null) {
                str2 = "";
            }
            if (c1260960iv0 == null || (str3 = c1260960iv0.LJFF) == null) {
                str3 = "";
            }
            if (c1260960iv0 == null || (str4 = c1260960iv0.LIZLLL) == null) {
                str4 = "";
            }
            if (c1260960iv0 != null) {
                String str7 = c1260960iv0.LJIILJJIL;
                str = str7 != null ? str7 : "";
                if (c1260960iv0 != null) {
                    str6 = c1260960iv0.LJJIIZ;
                }
            }
            c1072510e13.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("to_user_id", uid);
            c2344009Gk.LJIIIIZZ("rec_type", accurateRecType);
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("previous_page", str3);
            c2344009Gk.LJIIIIZZ("position", str);
            c2344009Gk.LJIIIIZZ("enter_method", str4);
            c2344009Gk.LJIIIIZZ("is_highlight", str5);
            c2344009Gk.LJIIIIZZ("search_id", str6);
            C20684815ws.LJIILLIIL("show_follow_back_button", c2344009Gk.LIZ);
        }
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIIIIZZ() {
        if (LJIILL()) {
            C1336205Ku.LIZ(false).getImEnsureService().LIZ();
        }
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        if (c1908830zlx == null) {
            c1908830zlx = null;
        }
        if (c1908830zlx.LJIIIIZZ != EnumC2274741E1w.CUSTOM_FRIENDS_V3_FEEDS) {
            C786410Ut5.pa(this.LLJILJIL, new ACListenerS154S0100000_19(this, 196));
        } else {
            C786410Ut5.I7(new AkS88S0100000_19(this, 6), this.LLJILJIL);
        }
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIILJJIL() {
        if (LJFF().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ("RelationButtonDelegate", new IllegalStateException("Subscribing outside of lifecycle"));
        } else {
            this.LLILZLL = RelationDataSource.INSTANCE.get().subscribe(LJFF(), this);
            LJII().LLILLL.observe(LJFF(), this.LLIZLLLIL);
            LJII().LLILZIL.observe(LJFF(), this.LLJILLL);
        }
    }

    public final boolean LJIILL() {
        if (LJI().getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
            C1908830zlx c1908830zlx = this.LLJILJILJ;
            if (c1908830zlx == null) {
                c1908830zlx = null;
            }
            if (c1908830zlx.LIZLLL && !C1336205Ku.LIZJ().LIZJ() && this.LLJIJIL) {
                return true;
            }
        }
        if (LJI().getFollowStatus() != C0SY7.FOLLOWED.getValue()) {
            return false;
        }
        C1908830zlx c1908830zlx2 = this.LLJILJILJ;
        return (c1908830zlx2 != null ? c1908830zlx2 : null).LIZLLL && this.LLJI;
    }

    public C1908810zlv(RelationButton relationButton) {
        super(relationButton);
        this.LLJILJIL = relationButton;
        this.LLJILLL = new AObserverS230S0100000_28(this, 60);
    }

    @Override // X.AbstractC1908820zlw
    public final void LIZIZ(User user) {
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        if (c1908830zlx == null) {
            c1908830zlx = null;
        }
        if (!c1908830zlx.LJJII || C1336205Ku.LIZ(false).getImMafService().LJ(user)) {
            this.LLJI = true;
        }
    }

    @Override // X.AbstractC1908820zlw
    /* JADX INFO: renamed from: LJIIIZ */
    public final void onChanged(FollowStatus followStatus) {
        LifecycleOwner lifecycleOwnerLIZIZ;
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        C1260960iv0 c1260960iv0;
        super.onChanged(followStatus);
        C1908830zlx c1908830zlx = null;
        if (!((Boolean) C1817907Ab.LIZ.getValue()).booleanValue()) {
            C1908830zlx c1908830zlx2 = this.LLJILJILJ;
            if (c1908830zlx2 == null) {
                c1908830zlx2 = null;
            }
            lifecycleOwnerLIZIZ = c1908830zlx2.LJIILL;
        } else {
            lifecycleOwnerLIZIZ = null;
        }
        RelationViewVM relationViewVMLJII = LJII();
        int followStatus2 = LJI().getFollowStatus();
        String uid = LJI().getUid();
        Function0<InterfaceC898240ZLq> tracker = this.LLJILJIL.getTracker();
        if (tracker != null) {
            interfaceC898240ZLqInvoke = tracker.invoke();
        } else {
            interfaceC898240ZLqInvoke = null;
        }
        if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
            c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
        } else {
            c1260960iv0 = null;
        }
        if (lifecycleOwnerLIZIZ == null) {
            lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LLJILJIL.getContext());
        }
        boolean z = this.LLJI;
        C1908830zlx c1908830zlx3 = this.LLJILJILJ;
        if (c1908830zlx3 != null) {
            c1908830zlx = c1908830zlx3;
        }
        EnumC1387060mCO enumC1387060mCO = c1908830zlx.LJII;
        relationViewVMLJII.getClass();
        RelationViewVM.xQ2(followStatus2, uid, c1260960iv0, lifecycleOwnerLIZIZ, false, z, enumC1387060mCO);
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIIJJI(int i) {
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        C1908830zlx c1908830zlx2 = null;
        if (c1908830zlx == null) {
            c1908830zlx = null;
        }
        Map<C0SY7, Integer> map = c1908830zlx.LJIIL;
        if (map != null) {
            C0SY7.Companion.getClass();
            Integer num = map.get(C0SY6.LIZ(i));
            if (num != null && (!C1336205Ku.LIZJ().LIZJ() || !C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIIJ(num.intValue()))) {
                this.LLJILJIL.setButtonStartIcon(num);
                C1908830zlx c1908830zlx3 = this.LLJILJILJ;
                if (c1908830zlx3 != null) {
                    c1908830zlx2 = c1908830zlx3;
                }
                Map<C0SY7, Boolean> map2 = c1908830zlx2.LJIILIIL;
                if (map2 != null && Intrinsics.LJFF(map2.get(C0SY7.FOLLOW_MUTUAL), Boolean.TRUE)) {
                    this.LLJILJIL.LJJJJJ();
                    return;
                }
                return;
            }
        }
        this.LLJILJIL.setButtonStartIcon(null);
    }

    public final void LJIILLIIL(int i) {
        C1908830zlx c1908830zlx;
        C1908830zlx c1908830zlx2;
        if (i == C0SY7.FOLLOW_REQUESTED.getValue()) {
            C1908830zlx c1908830zlx3 = this.LLJILJILJ;
            String uid = null;
            if (c1908830zlx3 == null) {
                c1908830zlx = null;
            } else {
                c1908830zlx = c1908830zlx3;
            }
            if (c1908830zlx.LJJIII) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLJILJIL);
                c1389890mGx.LJIIJ(this.LLJILJIL.getContext().getString(2131845227));
                c1389890mGx.LJIIJJI();
            } else {
                if (c1908830zlx3 == null) {
                    c1908830zlx2 = null;
                } else {
                    c1908830zlx2 = c1908830zlx3;
                }
                if (c1908830zlx2.LJIIIIZZ != EnumC2274741E1w.FEED_BIG_CARD) {
                    if (c1908830zlx3 == null) {
                        c1908830zlx3 = null;
                    }
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS35S0110000_16(this, c1908830zlx3.LJI, 3));
                }
            }
            InterfaceC896190ZDt lightInteractService = C1336205Ku.LIZ(false).getLightInteractService();
            User user = this.LLILLJJLI;
            if (user != null) {
                uid = user.getUid();
            }
            if (lightInteractService.LIZLLL(uid)) {
                C1336205Ku.LIZ(false).getImSayHiService().LIZIZ(LJI().getFollowerStatus(), LJI().getUid(), false);
            }
        }
    }

    @Override // X.AbstractC1908820zlw, X.InterfaceC1908750zlp
    public final void LLLLZIL(C1908870zm1 c1908870zm1) {
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        NextLiveData<FollowStatus> nextLiveData;
        String uid;
        String uid2;
        if (!(c1908870zm1 instanceof C1908830zlx)) {
            return;
        }
        C1908830zlx c1908830zlx = (C1908830zlx) c1908870zm1;
        C1260960iv0 c1260960iv0 = null;
        if (c1908830zlx.LJJIIJZLJL) {
            User user = this.LLILLJJLI;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = c1908830zlx.LIZJ;
            if (user2 != null) {
                uid2 = user2.getUid();
            } else {
                uid2 = null;
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                return;
            }
        }
        LiveEventObserver<FollowStatus> liveEventObserver = this.LLILZLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
        this.LLJILJILJ = c1908830zlx;
        super.LLLLZIL(c1908870zm1);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        RelationButton relationButton = this.LLJILJIL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(relationButton.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(relationButton, c19egLIZIZ);
        User user3 = this.LLILLJJLI;
        if (user3 != null) {
            RelationViewVM relationViewVMLJII = LJII();
            int followStatus = user3.getFollowStatus();
            String uid3 = user3.getUid();
            Function0<InterfaceC898240ZLq> tracker = this.LLJILJIL.getTracker();
            if (tracker != null) {
                interfaceC898240ZLqInvoke = tracker.invoke();
            } else {
                interfaceC898240ZLqInvoke = null;
            }
            if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
                c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
            }
            if (lifecycleOwnerLJIJI == null) {
                lifecycleOwnerLJIJI = C0SY5.LIZIZ(this.LLJILJIL.getContext());
            }
            boolean z = this.LLJI;
            EnumC1387060mCO enumC1387060mCO = c1908830zlx.LJII;
            relationViewVMLJII.getClass();
            RelationViewVM.xQ2(followStatus, uid3, c1260960iv0, lifecycleOwnerLJIJI, false, z, enumC1387060mCO);
        }
    }

    @Override // X.AbstractC1908820zlw, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((FollowStatus) obj);
    }

    @Override // X.AbstractC1908820zlw
    public final boolean LJIIJ(int i, Function2<? super Boolean, ? super C0XIR, Unit> function2) {
        boolean zLJIIJ = super.LJIIJ(i, function2);
        if (C0OBG.LIZ(300L, this.LLJILJIL)) {
            return false;
        }
        if (zLJIIJ) {
            C1908830zlx c1908830zlx = this.LLJILJILJ;
            if (c1908830zlx == null) {
                c1908830zlx = null;
            }
            if (c1908830zlx.LJIIIZ && LJI().getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
                C1397620mTQ c1397620mTQ = new C1397620mTQ(this.LL.getCtx());
                c1397620mTQ.LJFF(R.string.user_action_unfollow, new AwS607S0100000_28((AbstractC1908820zlw) this, 184));
                c1397620mTQ.LJII(2131834788, null);
                C1397580mTM c1397580mTM = new C1397580mTM(this.LL.getCtx());
                c1397580mTM.LJII = false;
                c1397580mTM.LIZ(2131857706);
                c1397580mTM.LJIIL = c1397620mTQ;
                new C1397510mTF(c1397580mTM).LIZLLL();
                return false;
            }
            LJIILLIIL(i);
            return true;
        }
        return zLJIIJ;
    }

    @Override // X.AbstractC1908820zlw
    public final void LJIIL(int i, Integer num) {
        int i2;
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        C1908830zlx c1908830zlx2 = null;
        if (c1908830zlx == null) {
            c1908830zlx = null;
        }
        int i3 = 2;
        switch (C2274751E1x.LIZ[c1908830zlx.LJIIIIZZ.ordinal()]) {
            case 1:
                this.LLJILJIL.setIconTintColorRes(R.attr.a1j);
                return;
            case 2:
                this.LLJILJIL.setIconTintColorRes(R.attr.a1j);
                return;
            case 3:
                C1908830zlx c1908830zlx3 = this.LLJILJILJ;
                if (c1908830zlx3 != null) {
                    c1908830zlx2 = c1908830zlx3;
                }
                if (!c1908830zlx2.LJIJJ) {
                    i3 = 1;
                }
                LJIJI(i, 0, i3);
                return;
            case 4:
            case 5:
                LJIJI(i, 0, 2);
                return;
            case 6:
                LJIJI(i, EnumC1908840zly.TT_NOW_NORMAL_UNFOLLOW.getValue(), EnumC1908840zly.TT_NOW_NORMAL_FOLLOWING.getValue());
                return;
            case 7:
                EnumC1908840zly enumC1908840zly = EnumC1908840zly.TT_NOW_FOLLOW_BACK_OVERLAY;
                LJIJI(i, enumC1908840zly.getValue(), enumC1908840zly.getValue());
                return;
            case 8:
                LJIJI(i, EnumC1908840zly.TT_NOW_POST_UNFOLLOW.getValue(), EnumC1908840zly.TT_NOW_POST_FOLLOWING.getValue());
                return;
            case BdTuring.TYPE_ECAF /* 9 */:
                this.LLJILJIL.setEllipsize(TextUtils.TruncateAt.END);
                this.LLJILJIL.setMinWidth(0);
                this.LLJILJIL.setMinHeight(0);
                RelationButton relationButton = this.LLJILJIL;
                if (i == C0SY7.FOLLOW_REQUESTED.getValue()) {
                    i2 = R.attr.a1p;
                } else {
                    i2 = R.attr.a04;
                }
                relationButton.setTextColorRes(i2);
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIJI(i, EnumC1908840zly.TT_NOW_FOLLOW_BACK_OVERLAY.getValue(), EnumC1908840zly.TT_STORY_IMMERSIVE_FEED_FOLLOWING.getValue());
                return;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIJI(i, EnumC1908840zly.TT_USER_CARD_VIDEO_COVER_UNFOLLOW.getValue(), EnumC1908840zly.TT_USER_CARD_VIDEO_COVER_FOLLOWING.getValue());
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJIJI(i, EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_UNFOLLOW.getValue(), EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_FOLLOW.getValue());
                return;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJIJI(i, EnumC1908840zly.TT_STORY_INBOX_SKYLIGHT_RELATION_UNFOLLOW.getValue(), EnumC1908840zly.TT_STORY_INBOX_SKYLIGHT_RELATION_FOLLOW.getValue());
                return;
            case 14:
                this.LLJILJIL.setIconTintColorRes(R.attr.a1i);
                LJIJI(i, EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_UNFOLLOW.getValue(), EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_FOLLOW.getValue());
                return;
            case 15:
                LJIJI(i, EnumC1908840zly.TT_STORY_INNER_FEED_RELATION_UNFOLLOW.getValue(), EnumC1908840zly.TT_STORY_INNER_FEED_RELATION_FOLLOW.getValue());
                return;
            case 16:
                LJIJI(i, 1, 1);
                return;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJIJI(i, 2, 2);
                return;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJIJI(i, 1, 1);
                return;
            case 19:
                LJIJI(i, EnumC1908840zly.TT_FEED_STACK_MAF_RELATION_UNFOLLOW.getValue(), EnumC1908840zly.TT_FEED_STACK_MAF_RELATION_FOLLOW.getValue());
                return;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LJIJI(i, EnumC1908840zly.TT_FEED_TABLET_UNFOLLOW.getValue(), EnumC1908840zly.TT_FEED_TABLET_FOLLOW.getValue());
                return;
            case 21:
                this.LLJILJIL.setButtonVariant(EnumC1908840zly.TT_SEARCH_CHILD_SENT_UNBLOCK_REQUEST.getValue());
                return;
            case 22:
                C1908830zlx c1908830zlx4 = this.LLJILJILJ;
                if (c1908830zlx4 != null) {
                    c1908830zlx2 = c1908830zlx4;
                }
                if (!c1908830zlx2.LJIJJ) {
                    i3 = 1;
                }
                LJIJI(i, 0, i3);
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void LJIJ(RelationButton relationButton, CharSequence charSequence) {
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        if (c1908830zlx != null && c1908830zlx.LJIJ) {
            if (!Intrinsics.LJFF(relationButton.getText().toString(), charSequence)) {
                relationButton.setText(charSequence);
                return;
            }
            return;
        }
        relationButton.setText(charSequence);
    }

    @Override // X.AbstractC1908820zlw, X.InterfaceC1908750zlp
    public final void LLILII(int i, AwS166S0101000_28 awS166S0101000_28) {
        C1908880zm2 c1908880zm2;
        C1908830zlx c1908830zlx = this.LLJILJILJ;
        if (c1908830zlx != null) {
            List<EnumC2274741E1w> list = C2274761E1y.LIZ;
            if (list.contains(c1908830zlx.LJIIIIZZ)) {
                C1908830zlx c1908830zlx2 = this.LLJILJILJ;
                if (c1908830zlx2 == null) {
                    c1908830zlx2 = null;
                }
                if (list.contains(c1908830zlx2.LJIIIIZZ)) {
                    int value = EnumC1908840zly.TT_NOW_NORMAL_UNFOLLOW.getValue();
                    Integer numValueOf = Integer.valueOf(R.attr.ee);
                    if (i == value) {
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ee, this.LLJILJIL.getContext().getDrawable(R.drawable.bt9));
                    } else if (i == EnumC1908840zly.TT_NOW_NORMAL_FOLLOWING.getValue()) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e8);
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ee, c384050F3z.LIZ(this.LLJILJIL.getContext()));
                    } else if (i == EnumC1908840zly.TT_NOW_FOLLOW_BACK_OVERLAY.getValue()) {
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                        c384050F3z2.LIZIZ = numValueOf;
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z2.LIZ(this.LLJILJIL.getContext()));
                    } else if (i == EnumC1908840zly.TT_NOW_POST_UNFOLLOW.getValue()) {
                        C384050F3z c384050F3z3 = new C384050F3z();
                        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                        c384050F3z3.LIZIZ = numValueOf;
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z3.LIZ(this.LLJILJIL.getContext()));
                    } else if (i == EnumC1908840zly.TT_NOW_POST_FOLLOWING.getValue()) {
                        C384050F3z c384050F3z4 = new C384050F3z();
                        c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                        c384050F3z4.LIZIZ = Integer.valueOf(R.attr.zj);
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ee, c384050F3z4.LIZ(this.LLJILJIL.getContext()));
                    } else if (i == EnumC1908840zly.TT_STORY_IMMERSIVE_FEED_FOLLOWING.getValue()) {
                        C384050F3z c384050F3z5 = new C384050F3z();
                        c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                        c384050F3z5.LIZIZ = Integer.valueOf(R.attr.zj);
                        c1908880zm2 = new C1908880zm2(1.0f, R.attr.ee, c384050F3z5.LIZ(this.LLJILJIL.getContext()));
                    } else {
                        int value2 = EnumC1908840zly.TT_USER_CARD_VIDEO_COVER_UNFOLLOW.getValue();
                        int i2 = R.attr.a1h;
                        if (i == value2) {
                            if (!C960203pA.LIZIZ(this.LLJILJIL.getContext())) {
                                i2 = R.attr.a1q;
                            }
                            C384050F3z c384050F3z6 = new C384050F3z();
                            c384050F3z6.LIZIZ = Integer.valueOf(R.attr.a07);
                            c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                            c1908880zm2 = new C1908880zm2(1.0f, i2, c384050F3z6.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_USER_CARD_VIDEO_COVER_FOLLOWING.getValue()) {
                            C384050F3z c384050F3z7 = new C384050F3z();
                            c384050F3z7.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z7.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.a1h, c384050F3z7.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_FOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill));
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z8 = new C384050F3z();
                            c384050F3z8.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z8.LIZIZ = Integer.valueOf(R.attr.a1d);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.a1i, c384050F3z8.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_FEED_SKYLIGHT_RELATION_UNFOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_person_fill));
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z9 = new C384050F3z();
                            c384050F3z9.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z9.LIZIZ = Integer.valueOf(R.attr.a1d);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.a1i, c384050F3z9.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_INBOX_SKYLIGHT_RELATION_FOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill));
                            this.LLJILJIL.setIconTintColorRes(R.attr.a1i);
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z10 = new C384050F3z();
                            c384050F3z10.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z10.LIZIZ = Integer.valueOf(R.attr.zq);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z10.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_INBOX_SKYLIGHT_RELATION_UNFOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_person_fill));
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconTintColorRes(R.attr.a1i);
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z11 = new C384050F3z();
                            c384050F3z11.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z11.LIZIZ = Integer.valueOf(R.attr.zq);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z11.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_FEED_STACK_MAF_RELATION_FOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill));
                            this.LLJILJIL.setIconTintColorRes(R.attr.a1i);
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z12 = new C384050F3z();
                            c384050F3z12.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z12.LIZIZ = Integer.valueOf(R.attr.a03);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z12.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_FEED_STACK_MAF_RELATION_UNFOLLOW.getValue()) {
                            this.LLJILJIL.setText("");
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_person_fill));
                            this.LLJILJIL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            this.LLJILJIL.setIconTintColorRes(R.attr.a1i);
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z13 = new C384050F3z();
                            c384050F3z13.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z13.LIZIZ = Integer.valueOf(R.attr.a03);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.ej, c384050F3z13.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_INNER_FEED_RELATION_UNFOLLOW.getValue()) {
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_person_fill));
                            this.LLJILJIL.setIconTintColorRes(R.attr.a0o);
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z14 = new C384050F3z();
                            c384050F3z14.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z14.LIZIZ = Integer.valueOf(R.attr.zi);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.a0o, c384050F3z14.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_FEED_TABLET_FOLLOW.getValue()) {
                            this.LLJILJIL.setMinHeight(0);
                            C384050F3z c384050F3z15 = new C384050F3z();
                            c384050F3z15.LIZIZ = Integer.valueOf(R.attr.zj);
                            c384050F3z15.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.zi, c384050F3z15.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_FEED_TABLET_UNFOLLOW.getValue()) {
                            this.LLJILJIL.setMinHeight(0);
                            C384050F3z c384050F3z16 = new C384050F3z();
                            c384050F3z16.LIZIZ = Integer.valueOf(R.attr.a04);
                            c384050F3z16.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.zi, c384050F3z16.LIZ(this.LLJILJIL.getContext()));
                        } else if (i == EnumC1908840zly.TT_STORY_INNER_FEED_RELATION_FOLLOW.getValue()) {
                            this.LLJILJIL.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill_small));
                            this.LLJILJIL.setIconTintColorRes(R.attr.ee);
                            C427690Gpr.LJ(this.LLJILJIL, C418440Gaw.LIZIZ(98));
                            C384050F3z c384050F3z17 = new C384050F3z();
                            c384050F3z17.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c384050F3z17.LIZIZ = Integer.valueOf(R.attr.a03);
                            c1908880zm2 = new C1908880zm2(1.0f, R.attr.ee, c384050F3z17.LIZ(this.LLJILJIL.getContext()));
                        } else {
                            if (i != EnumC1908840zly.TT_SEARCH_CHILD_SENT_UNBLOCK_REQUEST.getValue()) {
                                return;
                            }
                            C384050F3z c384050F3z18 = new C384050F3z();
                            c384050F3z18.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z18.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(98));
                            c1908880zm2 = new C1908880zm2(0.4f, R.attr.a1h, c384050F3z18.LIZ(this.LLJILJIL.getContext()));
                        }
                    }
                    this.LLJILJIL.setTextColorRes(c1908880zm2.LIZ);
                    this.LLJILJIL.setBackground(c1908880zm2.LIZIZ);
                    RelationButton relationButton = this.LLJILJIL;
                    float f = c1908880zm2.LIZJ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
                    relationButton.setAlpha(f);
                    return;
                }
                awS166S0101000_28.invoke();
                return;
            }
        }
        awS166S0101000_28.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0.LJIIIIZZ != X.EnumC2274741E1w.CUSTOM_FRIENDS_V3_FEEDS) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    @Override // X.AbstractC1908820zlw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(int r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908810zlv.LJIILIIL(int, java.lang.Integer, java.lang.String):void");
    }

    public final void LJIJI(int i, int i2, int i3) {
        if (i == C0SY7.UNFOLLOW.getValue()) {
            this.LLJILJIL.setButtonVariant(i2);
        } else {
            this.LLJILJIL.setButtonVariant(i3);
        }
    }

    @Override // X.AbstractC1908820zlw
    public final String LJ(int i, Integer num, String str, Map map, boolean z) {
        String strLJ;
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        C1260960iv0 c1260960iv0;
        String str2;
        EnumC1908850zlz enumC1908850zlz;
        String str3;
        C1908890zm3 c1908890zm3;
        C0SY7 c0sy7 = C0SY7.FOLLOWED;
        int i2 = 0;
        if (i == c0sy7.getValue()) {
            if (map == null || (c1908890zm3 = (C1908890zm3) map.get(c0sy7)) == null || (strLJ = c1908890zm3.LIZ) == null) {
                if (str != null) {
                    strLJ = C1336205Ku.LIZ(false).getImSayHiService().LJFF((this.LLJILJIL.getLayoutParams().width - this.LLJILJIL.getPaddingLeft()) - this.LLJILJIL.getPaddingRight(), this.LL.getCtx(), str, true, false);
                } else {
                    strLJ = this.LL.getCtx().getResources().getString(R.string.jqm);
                }
            }
        } else {
            strLJ = super.LJ(i, num, str, map, z);
        }
        Function0<InterfaceC898240ZLq> tracker = this.LLJILJIL.getTracker();
        Integer num2 = null;
        if (tracker != null) {
            interfaceC898240ZLqInvoke = tracker.invoke();
        } else {
            interfaceC898240ZLqInvoke = null;
        }
        if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
            c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
        } else {
            c1260960iv0 = null;
        }
        if (Intrinsics.LJFF(strLJ, C1383370m6R.LJIIJ(2131837236))) {
            C1908860zm0 c1908860zm0 = new C1908860zm0();
            C1908900zm4 c1908900zm4 = EnumC1908850zlz.Companion;
            String str4 = "";
            if (c1260960iv0 == null || (str2 = c1260960iv0.LJIILJJIL) == null) {
                str2 = "";
            }
            c1908900zm4.getClass();
            EnumC1908850zlz[] enumC1908850zlzArrValues = EnumC1908850zlz.values();
            int length = enumC1908850zlzArrValues.length;
            while (true) {
                if (i2 < length) {
                    enumC1908850zlz = enumC1908850zlzArrValues[i2];
                    if (Intrinsics.LJFF(enumC1908850zlz.getPosition(), str2)) {
                        break;
                    }
                    i2++;
                } else {
                    enumC1908850zlz = null;
                    break;
                }
            }
            c1908860zm0.LJJLIIIJJI = enumC1908850zlz;
            if (c1260960iv0 != null && (str3 = c1260960iv0.LIZIZ) != null) {
                str4 = str3;
            }
            c1908860zm0.LIZLLL = str4;
            if (c1260960iv0 != null) {
                num2 = c1260960iv0.LJJLIIIJ;
            }
            c1908860zm0.LJJLIIIJILLIZJL = num2;
            c1908860zm0.LJJLIIIJ = EnumC994390bz3.SHOW;
            c1908860zm0.LJIILJJIL();
        }
        return strLJ;
    }
}
