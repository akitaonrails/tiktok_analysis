package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0IQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466230IQb implements C0IKO, Observer<Boolean> {
    public static volatile C466230IQb LLJJJIL;
    public boolean LL;
    public C0IOL LLILLJJLI;
    public boolean LLILLL;
    public C11JF LLILZ;
    public boolean LLILZIL;
    public ViewGroup LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public View LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public DataChannel LLJILJILJ;
    public EnterRoomConfig LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public C466290IQh LLJJIII;
    public int LLJJIJI;
    public LiveRoomFragment LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C21601619gM LLJJJ;

    public final void LJIIJ() {
        this.LLJILJILJ = null;
        if (this.LL) {
            this.LLJJIJIIJIL = null;
            this.LLILZIL = false;
            this.LLJJIJIL = false;
            this.LLJJJ = null;
            this.LLJILJIL = false;
            this.LLJIJIL = null;
            this.LLJI = null;
            this.LLJJIJI = 0;
            this.LL = false;
            this.LLIZLLLIL = false;
            this.LLJILLL = null;
            this.LLILZLL = null;
            LIZ();
            this.LLJJIII = null;
            C473050Igp.LIZIZ().LIZLLL.removeObserver(this);
            this.LLILLL = false;
            this.LLJJI = false;
            this.LLIZ = false;
            this.LLJ = false;
            C0IOL c0iol = this.LLILLJJLI;
            if (c0iol != null) {
                ((HashSet) c0iol.LL).remove(this);
                this.LLILLJJLI = null;
            }
            C11JF c11jf = this.LLILZ;
            if (c11jf != null) {
                c11jf.dispose();
                this.LLILZ = null;
            }
        }
    }

    public static C466230IQb LIZJ() {
        if (LLJJJIL == null) {
            synchronized (C466230IQb.class) {
                try {
                    if (LLJJJIL == null) {
                        LLJJJIL = new C466230IQb();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJJJIL;
    }

    public final void LIZ() {
        C465540INk c465540INk = C465540INk.LIZ;
        ValueAnimator valueAnimator = C465540INk.LJII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = C465540INk.LJI;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C465540INk.LJII = null;
        C465540INk.LJI = null;
        C466260IQe.LIZ.getClass();
        ValueAnimator valueAnimator3 = C466260IQe.LIZIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = C466260IQe.LIZJ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        C466310IQj c466310IQj = C466260IQe.LIZLLL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        C466260IQe.LIZLLL = null;
        C466260IQe.LIZIZ = null;
        C466260IQe.LIZJ = null;
        this.LLJI = null;
    }

    @Override // X.C0IKO
    public final void LIZIZ() {
        if (this.LL) {
            LJII();
        }
    }

    public final boolean LJ() {
        if (this.LLJILJILJ == null) {
            return false;
        }
        boolean z = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ;
        Boolean bool = Boolean.TRUE;
        return bool.equals(Boolean.valueOf(C473050Igp.LIZIZ().LIZJ() || bool.equals(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class)) || ((Boolean) this.LLJILJILJ.gg0(UserProfileShowingChannel.class)).booleanValue() || bool.equals(this.LLJILJILJ.gg0(GiftDialogVisibilityChannel.class)) || bool.equals(this.LLJILJILJ.gg0(FastGiftClickChannel.class)) || bool.equals(this.LLJILJILJ.gg0(KeyboardStatusChannel.class)) || z || bool.equals(this.LLJILJILJ.gg0(ReChargeDialogOnShow.class)) || bool.equals(this.LLJILJILJ.gg0(SubscribeWebOnShow.class)) || bool.equals(this.LLJILJILJ.gg0(RankListDialogVisibilityChannel.class)) || bool.equals(this.LLJILJILJ.gg0(OnlineAudienceRankListDialogVisibilityChannel.class)) || bool.equals(this.LLJILJILJ.gg0(MultiGuestVisibleChannel.class)) || bool.equals(this.LLJILJILJ.gg0(PollVisibleChannel.class)) || bool.equals(this.LLJILJILJ.gg0(ToolBarShareVisibleChannel.class)) || bool.equals(this.LLJILJILJ.gg0(MvpDialogVisibleChannel.class)))) || bool.equals(this.LLJILJILJ.gg0(GoLiveCardShowing.class));
    }

    public final void LJIIIIZZ() {
        C0IOL c0iol;
        Context contextLJII;
        C1305440k4k c1305440k4kLIZIZ;
        if (LJI() || this.LLJJIJIIJIL == null || this.LLJJIJIL || this.LLIZLLLIL || this.LLIZ || this.LLJJI || !this.LLILLL || (c0iol = this.LLILLJJLI) == null || c0iol.size() < 2 || LJ()) {
            return;
        }
        InterfaceC466370IQp currentFragment = this.LLJJIJIIJIL.getCurrentFragment();
        InterfaceC466370IQp interfaceC466370IQpZR = this.LLJJIJIIJIL.ZR();
        if (currentFragment == null || interfaceC466370IQpZR == null || currentFragment.Ei() != 0 || !(currentFragment instanceof LivePlayFragment) || !(interfaceC466370IQpZR instanceof LivePlayFragment) || (contextLJII = C497740JfY.LJII()) == null || (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) == null) {
            return;
        }
        boolean z = true;
        this.LLJJIJIL = true;
        long jLJI = c1305440k4kLIZIZ.LJI("live.mt.slide_up_guide.last_show", -1L);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C465540INk c465540INk = C465540INk.LIZ;
        int iLJFF = c1305440k4kLIZIZ.LJFF(C465540INk.LJ(currentUserId), -1);
        if (iLJFF == -1) {
            if (jLJI == -1) {
                c1305440k4kLIZIZ.LJIIIIZZ(0, C465540INk.LJ(currentUserId));
                this.LLIZ = c465540INk.LJII((LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR, c1305440k4kLIZIZ, currentUserId);
            } else {
                long jLJI2 = c1305440k4kLIZIZ.LJI("live.mt.slide_up_guide.total_show", 0L);
                if (jLJI2 == 1) {
                    c1305440k4kLIZIZ.LJIIIIZZ(Long.valueOf(jLJI), C465540INk.LIZJ(currentUserId));
                    c1305440k4kLIZIZ.LJIIIIZZ(1, C465540INk.LIZ(currentUserId));
                    c1305440k4kLIZIZ.LJIIIIZZ(0, C465540INk.LJ(currentUserId));
                    this.LLIZ = c465540INk.LJII((LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR, c1305440k4kLIZIZ, currentUserId);
                } else if (jLJI2 == 0) {
                    c1305440k4kLIZIZ.LJIIIIZZ(0, C465540INk.LIZ(currentUserId));
                    c1305440k4kLIZIZ.LJIIIIZZ(0, C465540INk.LJ(currentUserId));
                    this.LLIZ = c465540INk.LJII((LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR, c1305440k4kLIZIZ, currentUserId);
                }
            }
        } else if (iLJFF == 0) {
            this.LLIZ = c465540INk.LJII((LivePlayFragment) currentFragment, (LivePlayFragment) interfaceC466370IQpZR, c1305440k4kLIZIZ, currentUserId);
        }
        if (C0IJ5.LIZ(this.LLJILLL, this.LLJIJIL)) {
            boolean z2 = this.LLIZ;
            LivePlayFragment livePlayFragment = (LivePlayFragment) currentFragment;
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) interfaceC466370IQpZR;
            C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.LLZL;
            if (c20337914i1.LIZIZ().booleanValue()) {
                if (!z2) {
                    C465540INk.LJI(c465540INk, livePlayFragment, livePlayFragment2, true);
                }
                c20337914i1.LJFF(Boolean.FALSE);
            } else {
                z = z2;
            }
            this.LLIZ = z;
        }
    }

    public final void LJIIJJI() {
        Context contextLJII;
        C1305440k4k c1305440k4kLIZIZ;
        if (!this.LL || (contextLJII = C497740JfY.LJII()) == null || (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) == null) {
            return;
        }
        c1305440k4kLIZIZ.LJIIIIZZ(Boolean.FALSE, LIZLLL());
    }

    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live.mt.slide_up_guide.need_show.");
        sbLIZ.append(this.LLJJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C466230IQb.LJI():boolean");
    }

    public final void LJII() {
        if (LJI() || this.LLILZIL) {
            return;
        }
        int i = this.LLJJIJI;
        if (i == 0) {
            LJIIIZ();
        } else if (i > 0) {
            LJIIIIZZ();
        }
    }

    public final void LJIIIZ() {
        Context contextLJII;
        C1305440k4k c1305440k4kLIZIZ;
        C0IOL c0iol;
        if (LJI() || (contextLJII = C497740JfY.LJII()) == null || (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) == null || this.LLJJI || C473050Igp.LIZIZ().LIZJ() || !this.LLILLL || (c0iol = this.LLILLJJLI) == null || c0iol.size() < 2 || Boolean.TRUE.equals(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class)) || this.LLJJIII == null) {
            return;
        }
        ViewGroup viewGroup = this.LLILZLL;
        if (c1305440k4kLIZIZ.LJ(LIZJ().LIZLLL())) {
            C466270IQf.i0(viewGroup);
            this.LLIZ = true;
            LJIIJJI();
        }
    }

    public final void LJFF(Object obj) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams = null;
        if (Boolean.TRUE.equals(obj)) {
            C466260IQe c466260IQe = C466260IQe.LIZ;
            View view = this.LLJI;
            c466260IQe.getClass();
            C466310IQj c466310IQj = C466260IQe.LIZLLL;
            if (c466310IQj != null && c466310IQj.LIZIZ()) {
                c466310IQj.LIZJ();
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.setMargins(marginLayoutParams2.getMarginStart(), marginLayoutParams2.topMargin, marginLayoutParams2.getMarginEnd(), ((Number) C466260IQe.LJ.getValue()).intValue());
                    if (view != null) {
                        C786410Ut5.W5(view, marginLayoutParams2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C466260IQe c466260IQe2 = C466260IQe.LIZ;
        View view2 = this.LLJI;
        c466260IQe2.getClass();
        C466310IQj c466310IQj2 = C466260IQe.LIZLLL;
        if (c466310IQj2 == null) {
            return;
        }
        synchronized (c466310IQj2) {
            z = c466310IQj2.LLIZ;
        }
        if (!z) {
            return;
        }
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
        c466310IQj2.LIZLLL();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (this.LL && bool2 != null && bool2.booleanValue()) {
            try {
                LJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
