package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.CommentFeaturePreviewChannel;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.OptOutGiftGalleryChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GoLiveVoiceCallConflictCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.rank.api.RankingSwitchChannel;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0URv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772450URv implements C0UQ8 {
    public final LiveMode LIZ = LiveMode.VIDEO;
    public final InterfaceC759380Tqa[] LIZIZ;
    public final InterfaceC759380Tqa[] LIZJ;

    @Override // X.C0UQ8
    public final void LIZIZ() {
    }

    @Override // X.C0UQ8
    public final boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
        return false;
    }

    @Override // X.C0UQ8
    public final void LIZLLL(String str, String str2) {
    }

    @Override // X.C0UQ8
    public final void LJ(DataChannel dataChannel, int i) {
    }

    @Override // X.C0UQ8
    public final void LJFF(Fragment fragment) {
    }

    @Override // X.C0UQ8
    public final void LJI(Fragment fragment, Boolean bool) {
    }

    @Override // X.C0UQ8
    public final boolean LJIIIIZZ(Fragment fragment) {
        return false;
    }

    public C772450URv() {
        InterfaceC759380Tqa[] interfaceC759380TqaArr = new InterfaceC759380Tqa[10];
        interfaceC759380TqaArr[0] = new C771730UPb();
        interfaceC759380TqaArr[1] = new C501000Jko();
        interfaceC759380TqaArr[2] = new C771940UPw();
        interfaceC759380TqaArr[3] = new C772680USs();
        interfaceC759380TqaArr[4] = new C758890Tpn();
        interfaceC759380TqaArr[5] = new C758880Tpm();
        interfaceC759380TqaArr[6] = new C758900Tpo();
        interfaceC759380TqaArr[7] = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable() ? null : new C772640USo();
        interfaceC759380TqaArr[8] = new C500830JkX();
        GoLiveVoiceCallConflictCheckSetting goLiveVoiceCallConflictCheckSetting = GoLiveVoiceCallConflictCheckSetting.INSTANCE;
        interfaceC759380TqaArr[9] = goLiveVoiceCallConflictCheckSetting.enable() ? new C0USC() : null;
        this.LIZIZ = interfaceC759380TqaArr;
        InterfaceC759380Tqa[] interfaceC759380TqaArr2 = new InterfaceC759380Tqa[5];
        interfaceC759380TqaArr2[0] = new C500780JkS();
        interfaceC759380TqaArr2[1] = new C500850JkZ();
        interfaceC759380TqaArr2[2] = new C0US9();
        interfaceC759380TqaArr2[3] = goLiveVoiceCallConflictCheckSetting.enable() ? new C0USC() : null;
        interfaceC759380TqaArr2[4] = new C759550Tqr();
        this.LIZJ = interfaceC759380TqaArr2;
    }

    @Override // X.C0UQ8
    public final InterfaceC759380Tqa[] LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0UQ8
    public final C772410URr LJII(Context context, DataChannel dataChannel, WeakHandler weakHandler) {
        String strLIZ;
        int iIntValue;
        boolean zBooleanValue;
        int i;
        int i2;
        int i3;
        int i4;
        boolean zBooleanValue2;
        long j;
        long j2;
        long j3;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean z;
        int iIntValue2;
        int iIntValue3;
        int iLIZIZ;
        CommercialContentToggle commercialContentToggle;
        int i5;
        String str;
        IHostAppContext iHostAppContext;
        String str2;
        C758940Tps c758940Tps;
        Long l;
        LiveEventInfo liveEventInfo;
        if (dataChannel == null) {
            return null;
        }
        C754700Tj2.LJ((Hashtag) dataChannel.gg0(HashtagChangedChannel.class));
        C772410URr c772410URr = new C772410URr(weakHandler, this.LIZ);
        String str3 = (String) dataChannel.gg0(PreviewTitleChannel.class);
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c772410URr.LIZJ = str3;
        C754410TiZ c754410TiZ = (C754410TiZ) dataChannel.gg0(LiveCoverControllerChannel.class);
        if (c754410TiZ == null || (strLIZ = c754410TiZ.LIZ()) == null) {
            strLIZ = "";
        }
        c772410URr.LIZLLL = strLIZ;
        c772410URr.LJ = C0UQX.LJFF(c772410URr.LIZIZ);
        int i6 = 1;
        c772410URr.LJFF = 1;
        Integer num = (Integer) dataChannel.gg0(GiftFeatureChannel.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        c772410URr.LJI = iIntValue;
        Boolean bool = (Boolean) dataChannel.gg0(OptOutGiftGalleryChannel.class);
        boolean zIsLocationPermissionGranted = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c772410URr.LJJIIJ = zBooleanValue;
        if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(CommentFeaturePreviewChannel.class))) {
            i = 1;
        } else {
            i = 2;
        }
        c772410URr.LJII = i;
        C0USP c0usp = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
        if (c0usp != null) {
            i2 = c0usp.LIZ;
        } else {
            i2 = 0;
        }
        c772410URr.LJIIIZ = i2;
        C0USP c0usp2 = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
        if (c0usp2 != null) {
            i3 = c0usp2.LIZIZ;
        } else {
            i3 = 0;
        }
        c772410URr.LJIIJ = i3;
        C0USP c0usp3 = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
        if (c0usp3 != null) {
            i4 = c0usp3.LIZJ;
        } else {
            i4 = 0;
        }
        c772410URr.LJIIJJI = i4;
        dataChannel.gg0(RankingSwitchChannel.class);
        C770220UJg c770220UJg = C770220UJg.LIZ;
        c772410URr.LJIIL = C770220UJg.LIZJ(C13LE.LIZ(PreviewReplayWidget.class));
        c772410URr.LJIILIIL = (RoomDecoration) dataChannel.gg0(SelectedDonationStickerChannel.class);
        Boolean bool2 = (Boolean) dataChannel.gg0(C0UP3.class);
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        c772410URr.LJIILJJIL = zBooleanValue2;
        if (User.sSubPermission && C494680Jac.LJJI()) {
            j = 1;
        } else {
            j = 2;
        }
        c772410URr.LJIIIIZZ = j;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
        long jLongValue = 0;
        if (roomCreateInfo != null && (liveEventInfo = roomCreateInfo.mLiveEventInfo) != null) {
            j2 = liveEventInfo.id;
        } else {
            j2 = 0;
        }
        c772410URr.LJIIZILJ = j2;
        Hashtag hashtag = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class);
        if (hashtag == null || (j3 = hashtag.id) == null) {
            j3 = 0L;
        }
        c772410URr.LJIILLIIL = j3;
        GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(c772410URr.LIZIZ);
        if (gameTagFB != null && (l = gameTagFB.id) != null) {
            jLongValue = l.longValue();
        }
        c772410URr.LJIJI = jLongValue;
        Boolean bool3 = (Boolean) dataChannel.gg0(C0UQG.class);
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        c772410URr.LJIJJ = zBooleanValue3;
        Boolean bool4 = (Boolean) dataChannel.gg0(C0UQF.class);
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        c772410URr.LJIJJLI = zBooleanValue4;
        C1D47 c1d47LJFF = C1D4I.LJFF();
        if (c1d47LJFF != null) {
            c772410URr.LJJI = c1d47LJFF.LIZJ();
            c772410URr.LJJJJL = c1d47LJFF;
        }
        if (dataChannel.gg0(SelectedStreamResolutionChannel.class) != null) {
            z = true;
        } else {
            z = false;
        }
        c772410URr.LJJIFFI = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
        Integer num2 = (Integer) dataChannel.gg0(C772000UQc.class);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        c772410URr.LJJIJIL = iIntValue2;
        c772410URr.LJJIJL = (String) dataChannel.gg0(C772090UQl.class);
        Integer num3 = (Integer) dataChannel.gg0(AgeRestrictedChannel.class);
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        c772410URr.LJJII = iIntValue3;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C758920Tpq c758920Tpq = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
        if (c758920Tpq != null) {
            iLIZIZ = c758920Tpq.LIZIZ();
        } else {
            iLIZIZ = 3;
        }
        c772410URr.LJJIII = iLIZIZ;
        C758920Tpq c758920Tpq2 = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
        if (c758920Tpq2 == null || (commercialContentToggle = c758920Tpq2.LIZIZ) == null) {
            commercialContentToggle = new CommercialContentToggle();
        }
        c772410URr.LJJIIJZLJL = commercialContentToggle;
        C758920Tpq c758920Tpq3 = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
        if (c758920Tpq3 != null && (c758940Tps = c758920Tpq3.LIZ) != null && c758940Tps.LJI == 1) {
            CommercialContentToggle commercialContentToggle2 = c772410URr.LJJIIJZLJL;
            commercialContentToggle2.openCommercialContentToggle = true;
            if (!commercialContentToggle2.promoteMyself && !commercialContentToggle2.promoteThirdParty) {
                commercialContentToggle2.promoteMyself = true;
            }
        }
        c772410URr.LJJIIZ = C494680Jac.LIZJ() ? 1 : 0;
        c772410URr.LJJIIZI = C494680Jac.LJ();
        c772410URr.LJJIJ = C494680Jac.LIZLLL();
        if (C494680Jac.LIZJ() && !C494680Jac.LJFF()) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c772410URr.LJJIJIIJI = i5;
        Object objGg0 = dataChannelGlobal.gg0(C931110aKz.class);
        Boolean bool5 = Boolean.TRUE;
        if (!Intrinsics.LJFF(objGg0, bool5) || !InterfaceC1106030et7.v6.LIZIZ().booleanValue()) {
            i6 = 0;
        }
        c772410URr.LJJIJIIJIL = i6;
        StarCommentConfig starCommentConfig = (StarCommentConfig) dataChannel.gg0(C752120Tes.class);
        if (starCommentConfig == null) {
            starCommentConfig = new StarCommentConfig();
        }
        c772410URr.LJJIZ = starCommentConfig;
        C758220Toi c758220Toi = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class);
        if (c758220Toi != null) {
            int i7 = c758220Toi.LIZ;
            if (i7 == 3) {
                i7 = 0;
            }
            c772410URr.LJJJIL = i7;
        }
        C0UST c0ust = (C0UST) dataChannel.gg0(C0USR.class);
        if (c0ust == null || (str = c0ust.LIZ) == null) {
            str = "";
        }
        c772410URr.LJJJJ = str;
        C0UST c0ust2 = (C0UST) dataChannel.gg0(C0USR.class);
        if (c0ust2 != null && (str2 = c0ust2.LIZIZ) != null) {
            str4 = str2;
        }
        c772410URr.LJJJJI = str4;
        c772410URr.LJJJJJ = Intrinsics.LJFF(dataChannel.gg0(C755600TkU.class), bool5);
        if (context != null && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null) {
            zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context);
        }
        c772410URr.LJJJJJL = zIsLocationPermissionGranted;
        return c772410URr;
    }
}
