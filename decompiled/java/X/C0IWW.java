package X;

import Y.AObjectS382S0100000_7;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import qo2.w;

/* JADX INFO: renamed from: X.0IWW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IWW implements IHostLongPressCallback {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onDislikePressed() {
        if (!C0IXW.LIZLLL(this.LIZ.LLJIJIL)) {
            C784440Upu.LIZ().LIZIZ(new C0IK8(this.LIZ.LLJILJIL.getId(), C0IK6.DISLIKE));
            C766270U4b.LIZLLL(2131842709);
            return;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(this.LIZ.LLJIJIL);
        AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LIZ;
        if (absAudienceInteractionFragment.LLJILJIL == null || absAudienceInteractionFragment.getContext() == null || adLiveEnterRoomConfigLJII == null || adLiveEnterRoomConfigLJII.aid == null) {
            return;
        }
        ((IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class)).yR0(this.LIZ.getContext(), adLiveEnterRoomConfigLJII, new AObjectS382S0100000_7(this, 8));
    }

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onReportPressed() {
        if (C0IXW.LIZLLL(this.LIZ.LLJIJIL)) {
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(this.LIZ.LLJIJIL);
            AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LIZ;
            if (absAudienceInteractionFragment.LLJILJIL == null || absAudienceInteractionFragment.getContext() == null || adLiveEnterRoomConfigLJII == null || adLiveEnterRoomConfigLJII.aid == null) {
                return;
            }
            ((IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class)).iQ2(this.LIZ.getContext(), adLiveEnterRoomConfigLJII, this.LIZ.LLJILJIL.getOwner().getId());
            return;
        }
        AbsAudienceInteractionFragment absAudienceInteractionFragment2 = this.LIZ;
        if (absAudienceInteractionFragment2.LLJILJIL == null || absAudienceInteractionFragment2.getContext() == null) {
            return;
        }
        UserService.getInstance().user().getCurrentUser();
        long id = this.LIZ.LLJILJIL.getId();
        long id2 = this.LIZ.LLJILJIL.getOwner().getId();
        long id3 = this.LIZ.LLJILJIL.getOwner().getId();
        String secUid = this.LIZ.LLJILJIL.getOwner().getSecUid();
        w.LIZ.getClass();
        C759930TrT c759930TrT = new C759930TrT(id, id2, id3, secUid, "long_press", w.LJIIIZ(), w.LJIIL(), w.LIZLLL(), "report_anchor", w.LJIJI(), C0IXW.LIZIZ(null, this.LIZ.LLJIJIL, "user_live_duration"));
        c759930TrT.LJJIIJ = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).fJ2(this.LIZ.getContext(), c759930TrT);
    }

    public C0IWW(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }
}
