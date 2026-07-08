package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinLiveRoomCard;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21700719wL implements C0OT0 {
    public static final /* synthetic */ int LJJIJIIJIL = 0;
    public final BulletinCommonAbility LIZ;
    public final BulletinAutoPlayViewModel LIZIZ;
    public final Function0<BulletinMediaViewModel> LIZJ;
    public final View LIZLLL;
    public final RemoteImageView LJ;
    public final TuxTextView LJFF;
    public final TuxTextView LJI;
    public final TuxTextView LJII;
    public final View LJIIIIZZ;
    public final FrameLayout LJIIIZ;
    public final View LJIIJ;
    public final TuxTextView LJIIJJI;
    public final View LJIIL;
    public final View LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public C1ACD LJIILLIIL;
    public InterfaceC420801kM LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public Pair<Long, Boolean> LJJI;
    public long LJJIFFI;
    public long LJJII;
    public boolean LJJIII;
    public long LJJIIJ;
    public LiveRoomStruct LJJIIJZLJL;
    public C0OON LJJIIZ;
    public int LJJIIZI;
    public final C21700419wI LJJIJ;
    public WeakReference<C2229308oN> LJJIJIIJI;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LJFF() {
        long j = this.LJJIIJ;
        if (j > 0 && System.currentTimeMillis() - this.LJJIFFI >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            this.LJJIFFI = System.currentTimeMillis();
            InterfaceC420801kM interfaceC420801kM = this.LJIIZILJ;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LJIIZILJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJI("search", null, j, new InterfaceC472850IgV() { // from class: X.19wM
                @Override // X.InterfaceC472850IgV
                public final void onFailed() {
                }

                @Override // X.InterfaceC472850IgV
                public final void LIZ(FilterInfoData filterInfoData, boolean z) {
                    if (!z) {
                        C21700719wL c21700719wL = this.LIZ;
                        c21700719wL.LJIJJLI = true;
                        c21700719wL.LJIJ("liveEnd");
                        this.LIZ.LJIIZILJ();
                    }
                    BulletinAutoPlayViewModel bulletinAutoPlayViewModel = this.LIZ.LIZIZ;
                    if (bulletinAutoPlayViewModel != null) {
                        bulletinAutoPlayViewModel.withState(new AwS97S0110000_9(bulletinAutoPlayViewModel, true ^ z, 9));
                    }
                }
            });
        }
    }

    public final String LJI() {
        C0OLV c0olvHh2;
        if (this.LJIJJ) {
            return "live_detail";
        }
        BulletinCommonAbility bulletinCommonAbility = this.LIZ;
        return !Intrinsics.LJFF((bulletinCommonAbility == null || (c0olvHh2 = bulletinCommonAbility.Hh2()) == null) ? null : c0olvHh2.LLILLJJLI, "others_homepage") ? "message" : "others_homepage";
    }

    public final String LJIIJ() {
        C0OLV c0olvHh2;
        if (this.LJIJJ) {
            return "bb_profile";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        BulletinCommonAbility bulletinCommonAbility = this.LIZ;
        sbLIZ.append((bulletinCommonAbility == null || (c0olvHh2 = bulletinCommonAbility.Hh2()) == null) ? null : c0olvHh2.LLILLJJLI);
        sbLIZ.append("_bb_card");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIL() {
        User user;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", LJI());
        c2344009Gk.LJIIIIZZ("enter_method", LJIIJ());
        LiveRoomStruct liveRoomStruct = this.LJJIIJZLJL;
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf((liveRoomStruct == null || (user = liveRoomStruct.owner) == null) ? null : user.getUid()));
        c2344009Gk.LIZLLL(this.LJJIIJ, "room_id");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        LiveRoomStruct liveRoomStruct2 = this.LJJIIJZLJL;
        c2344009Gk.LJIIIIZZ("request_id", String.valueOf(liveRoomStruct2 != null ? liveRoomStruct2.getRequestId() : null));
        C20684815ws.LJIILLIIL("livesdk_live_show", c2344009Gk.LIZ);
    }

    public final boolean LJIILL() {
        Pair<Long, Boolean> pair;
        if (this.LJIJ || this.LJIJI || this.LJIJJ || this.LJIJJLI || this.LJJIIZI != 0) {
            return false;
        }
        Pair<Long, Boolean> pair2 = this.LJJI;
        return ((pair2 != null && pair2.getFirst().longValue() == this.LJJIIJ && (pair = this.LJJI) != null && pair.getSecond().booleanValue()) || this.LJJ || this.LJIL) ? false : true;
    }

    public final void LJIIZILJ() {
        C0DTR.LIZIZ(this.LJFF);
        C0DTR.LIZIZ(this.LJII);
        C12ES.LJIILL(0, this.LJI);
        C12ES.LJIILL(0, this.LJ);
        C12ES.LJIILL(0, this.LJIIL);
        LIZLLL(this.LJJIIJZLJL);
    }

    public static void LJIILLIIL(C21700719wL c21700719wL) {
        Integer numLIZJ;
        Context context = c21700719wL.LJIIIIZZ.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
            c21700719wL.LJIIIIZZ.setBackgroundColor(numLIZJ.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.LJIILIIL
            X.C0DTR.LIZIZ(r0)
            r1 = 0
            if (r6 == 0) goto L38
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r6.roomCover
            if (r4 != 0) goto L14
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.owner
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r0.getAvatarLarger()
        L14:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r6.blurredCover
            if (r3 == 0) goto L29
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r5.LJ
            Y.ARunnableS85S0200000_16 r1 = new Y.ARunnableS85S0200000_16
            r0 = 37
            r1.<init>(r5, r3, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            return
        L25:
            r4 = r1
            if (r6 == 0) goto L29
            goto L14
        L29:
            if (r4 == 0) goto L38
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r5.LJ
            Y.ARunnableS85S0200000_16 r1 = new Y.ARunnableS85S0200000_16
            r0 = 38
            r1.<init>(r5, r4, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            return
        L38:
            LJIILLIIL(r5)
            android.view.View r1 = r5.LJIILIIL
            r0 = 0
            X.C12ES.LJIILL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21700719wL.LIZLLL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):void");
    }

    public final void LJIJ(String str) {
        C2229308oN c2229308oN;
        String uid;
        String requestId;
        InterfaceC20318714ev interfaceC20318714evB4;
        long j;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        User user;
        if (this.LJJIII) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.LJJII;
            long j3 = jCurrentTimeMillis - j2;
            if (j2 > 0 && j3 > 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", LJI());
                c2344009Gk.LJIIIIZZ("enter_method", LJIIJ());
                LiveRoomStruct liveRoomStruct = this.LJJIIJZLJL;
                if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(uid));
                c2344009Gk.LIZLLL(this.LJJIIJ, "room_id");
                c2344009Gk.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct2 = this.LJJIIJZLJL;
                if (liveRoomStruct2 != null) {
                    requestId = liveRoomStruct2.getRequestId();
                } else {
                    requestId = null;
                }
                c2344009Gk.LJIIIIZZ("request_id", String.valueOf(requestId));
                c2344009Gk.LIZLLL(j3, "duration");
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC20318714evB4 = iLiveOuterService.B4()) != null) {
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(interfaceC20318714evB4.LIZJ(bool, "live_sdk_feed_preview_add_multi_guest_params"), bool)) {
                        LiveRoomStruct liveRoomStruct3 = this.LJJIIJZLJL;
                        if (liveRoomStruct3 != null && (multiLiveUserSettings = liveRoomStruct3.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                            j = multiGuestLayoutInfo.guestCnt;
                        } else {
                            j = 0;
                        }
                        c2344009Gk.LIZJ((int) j, "guest_cnt");
                    }
                }
                C20684815ws.LJIILLIIL("livesdk_live_window_duration_v2", c2344009Gk.LIZ);
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopLive: reason = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LJIILLIIL(this);
        C12ES.LJIILL(0, this.LJ);
        C1ACD c1acd = this.LJIILLIIL;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
        C1ACD c1acd2 = this.LJIILLIIL;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
        this.LJIILLIIL = null;
        this.LJJIII = false;
        this.LJJII = 0L;
        WeakReference<C2229308oN> weakReference = this.LJJIJIIJI;
        if (weakReference != null && (c2229308oN = weakReference.get()) != null) {
            c2229308oN.LIZIZ(this.LJJIJ);
        }
        this.LJJIJIIJI = null;
    }

    @C14EU
    public final void onEvent(C0IHI c0ihi) {
        long j = c0ihi.LIZ;
        long j2 = this.LJJIIJ;
        if (j == j2) {
            this.LJJI = new Pair<>(Long.valueOf(j2), Boolean.TRUE);
            LJIJ("kickOut");
        }
    }

    public final void LJIILJJIL(C0OON c0oon, int i) {
        long j;
        LiveRoomStruct liveRoomStruct;
        boolean zIsLive;
        boolean zIsFinished;
        boolean zBooleanValue;
        boolean zIsAccuratePrivateAccount;
        int i2;
        Object c098200Yq;
        LiveRoomStruct liveRoomStruct2;
        User user;
        LiveRoomStruct liveRoomStruct3;
        LiveEventInfo liveEventInfo;
        Boolean boolIsPaidEvent;
        this.LJJIIZ = c0oon;
        BulletinLiveRoomCard bulletinLiveRoomCard = c0oon.LLJI;
        long jLongValue = 0;
        if (bulletinLiveRoomCard != null) {
            j = bulletinLiveRoomCard.roomId;
        } else {
            j = 0;
        }
        this.LJJIIJ = j;
        String strLJI = null;
        if (bulletinLiveRoomCard != null) {
            liveRoomStruct = bulletinLiveRoomCard.roomStruct;
        } else {
            liveRoomStruct = null;
        }
        this.LJJIIJZLJL = liveRoomStruct;
        BulletinCommonAbility bulletinCommonAbility = this.LIZ;
        if (bulletinCommonAbility != null) {
            zIsLive = bulletinCommonAbility.isLive();
        } else {
            zIsLive = false;
        }
        this.LJIJJ = zIsLive;
        BulletinLiveRoomCard bulletinLiveRoomCard2 = c0oon.LLJI;
        if (bulletinLiveRoomCard2 != null) {
            zIsFinished = bulletinLiveRoomCard2.isFinished();
        } else {
            zIsFinished = false;
        }
        this.LJIJJLI = zIsFinished;
        BulletinLiveRoomCard bulletinLiveRoomCard3 = c0oon.LLJI;
        if (bulletinLiveRoomCard3 != null && (liveRoomStruct3 = bulletinLiveRoomCard3.roomStruct) != null && (liveEventInfo = liveRoomStruct3.liveEventInfo) != null && (boolIsPaidEvent = liveEventInfo.isPaidEvent()) != null) {
            zBooleanValue = boolIsPaidEvent.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LJIL = zBooleanValue;
        BulletinLiveRoomCard bulletinLiveRoomCard4 = c0oon.LLJI;
        if (bulletinLiveRoomCard4 != null && (liveRoomStruct2 = bulletinLiveRoomCard4.roomStruct) != null && (user = liveRoomStruct2.owner) != null) {
            zIsAccuratePrivateAccount = user.isAccuratePrivateAccount();
        } else {
            zIsAccuratePrivateAccount = false;
        }
        this.LJJ = zIsAccuratePrivateAccount;
        this.LJJIIZI = i;
        LiveRoomStruct liveRoomStruct4 = this.LJJIIJZLJL;
        if (liveRoomStruct4 != null && liveRoomStruct4.ownerUserId <= 0) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(liveRoomStruct4.owner.getUid());
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            }
            liveRoomStruct4.ownerUserId = jLongValue;
        }
        C0DTR.LIZIZ(this.LJIIJ);
        switch (this.LJJIIZI) {
            case 4003110:
                strLJI = C20642515q3.LJI(2131842395);
                break;
            case 4003157:
                strLJI = C20642515q3.LJI(2131851047);
                break;
            case 4003160:
                strLJI = C20642515q3.LJI(2131840715);
                break;
            case 4003175:
            case 4003176:
                strLJI = C20642515q3.LJI(2131846521);
                break;
            case 4003182:
                strLJI = C20642515q3.LJI(2131832518);
                break;
            case 4003185:
            case 4003186:
                strLJI = C20642515q3.LJI(2131832516);
                break;
        }
        if (C123100dR.LIZ(strLJI)) {
            this.LJIJI = true;
            C0DTR.LIZIZ(this.LJFF);
            C0DTR.LIZIZ(this.LJII);
            C0DTR.LIZIZ(this.LJI);
            C0DTR.LIZIZ(this.LJIILIIL);
            C12ES.LJIILL(4, this.LJ);
            C0DTR.LIZIZ(this.LJIIL);
            C12ES.LJIILL(0, this.LJIIJ);
            this.LJIIJJI.setText(strLJI);
        } else if (this.LJIJJLI) {
            LJIIZILJ();
        } else {
            C12ES.LJIILL(0, this.LJFF);
            C0DTR.LIZIZ(this.LJII);
            C0DTR.LIZIZ(this.LJI);
            C12ES.LJIILL(0, this.LJ);
            C12ES.LJIILL(0, this.LJIIL);
            LIZLLL(this.LJJIIJZLJL);
            LiveRoomStruct liveRoomStruct5 = this.LJJIIJZLJL;
            if (liveRoomStruct5 != null && (i2 = liveRoomStruct5.user_count) > 0) {
                try {
                    this.LJII.setText(C20642515q3.LJ(2131755805, i2, C1843500y4a.LIZIZ(i2)));
                    C12ES.LJIILL(0, this.LJII);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                C0DTR.LIZIZ(this.LJII);
            }
            C12ES.LJIIZILJ(-1, -1, this.LJIIIZ);
        }
        C622680Oba.LIZJ(this);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.19wI] */
    public C21700719wL(ViewStub viewStub, BulletinCommonAbility bulletinCommonAbility, BulletinAutoPlayViewModel bulletinAutoPlayViewModel, Function0<BulletinMediaViewModel> function0) {
        this.LIZ = bulletinCommonAbility;
        this.LIZIZ = bulletinAutoPlayViewModel;
        this.LIZJ = function0;
        viewStub.setLayoutResource(R.layout.a6l);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LIZLLL = viewLJLLLL;
        this.LJ = (RemoteImageView) viewLJLLLL.findViewById(R.id.kgf);
        this.LJFF = (TuxTextView) viewLJLLLL.findViewById(R.id.zvj);
        this.LJI = (TuxTextView) viewLJLLLL.findViewById(R.id.zuv);
        this.LJII = (TuxTextView) viewLJLLLL.findViewById(R.id.z_4);
        this.LJIIIIZZ = viewLJLLLL.findViewById(R.id.bwt);
        this.LJIIIZ = (FrameLayout) viewLJLLLL.findViewById(R.id.i8u);
        this.LJIIJ = viewLJLLLL.findViewById(R.id.akm);
        this.LJIIJJI = (TuxTextView) viewLJLLLL.findViewById(R.id.akw);
        this.LJIIL = viewLJLLLL.findViewById(R.id.f4t);
        this.LJIILIIL = viewLJLLLL.findViewById(R.id.jv9);
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(573));
        this.LJIILL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(572));
        this.LJJIIZI = -1;
        this.LJJIJ = new InterfaceC2229408oO() { // from class: X.19wI
            public final EnumC2229208oM LIZ = EnumC2229208oM.LIVE_PREVIEW;

            @Override // X.InterfaceC2229408oO
            public final void LIZIZ() {
                C0OPX.LJII("BBLiveRoomContentWidget: LIVE_PREVIEW lost focus -> stop");
                this.LIZIZ.LJIJ("focus_lost");
            }

            @Override // X.InterfaceC2229408oO
            public final EnumC2229208oM LIZ() {
                return this.LIZ;
            }
        };
    }
}
