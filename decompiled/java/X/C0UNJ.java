package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.broadcast.ShouldShowSafetyEducationDialogCppV2;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNJ {
    public static final C0UNJ LIZ = new C0UNJ();

    public static final void LIZ(Fragment fragment) {
        DataChannel dataChannelLJ;
        if (fragment == null || (dataChannelLJ = C475510Ikn.LJ(fragment)) == null || dataChannelLJ.gg0(C0UKX.class) != null) {
            return;
        }
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C01QD.LIZ().LIZ().getStreamInfo().LJIILIIL(C0J1R.LIZIZ(fragment)).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(dataChannelLJ, 207), new C09JN() { // from class: X.0UKS
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PreviewTryModeGoLiveHelper@27ad.fetchSDKParams$2");
                C1C7U.LIZIZ("PreviewTryModeGoLiveHelper@27ad.fetchSDKParams$2");
            }
        });
    }

    public static void LIZJ(DataChannel dataChannel) {
        C0U4R c0u4r = new C0U4R();
        c0u4r.LJII = dataChannel;
        c0u4r.LIZJ = "pm_mt_liveTryMode_livePreviewScreen_errorToast";
        c0u4r.LIZLLL = 2131842607;
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
    }

    public static final void LIZIZ(Context context, DataChannel dataChannel, C16FS c16fs) {
        boolean z;
        CppAgeVerificationInfo cppAgeVerificationInfo;
        if (context == null) {
            return;
        }
        if (C781270Ukn.LJIILJJIL().Kz() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            C766270U4b.LIZLLL(2131854502);
            return;
        }
        C0UQ6 c0uq6 = (C0UQ6) dataChannel.gg0(C0UNL.class);
        if (c0uq6 == null) {
            LIZ.getClass();
            LIZJ(dataChannel);
            return;
        }
        String str = (String) dataChannel.gg0(C0UKX.class);
        if (str == null) {
            LIZ.getClass();
            LIZJ(dataChannel);
            return;
        }
        C0UTQ c0utq = new C0UTQ();
        c0utq.LIZ = System.currentTimeMillis();
        LiveMode liveMode = LiveMode.VIDEO;
        c0utq.LIZIZ = liveMode.logStreamingType;
        c0utq.LIZJ = true;
        c0utq.LIZLLL = true;
        c0utq.LJ = C776270Ucj.LJIIL;
        int i = 0;
        c0utq.LJFF = 0;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931280aLG.class, c0utq);
        C772450URv c772450URv = new C772450URv();
        CppAgeVerificationInfo cppAgeVerificationInfo2 = (CppAgeVerificationInfo) dataChannel.gg0(CppAgeVerifyResponse.class);
        if (cppAgeVerificationInfo2 != null) {
            z = true;
        } else {
            z = false;
        }
        C0UO8.LIZ.getClass();
        if (cppAgeVerificationInfo2 != null) {
            if (cppAgeVerificationInfo2.ageVerifyStatus == 1) {
                i = cppAgeVerificationInfo2.ageVerifyProcessStatus;
            } else {
                i = -1;
            }
        }
        Boolean bool = (Boolean) dataChannel.gg0(ShouldShowSafetyEducationDialogCppV2.class);
        if (z) {
            cppAgeVerificationInfo = (CppAgeVerificationInfo) dataChannel.gg0(CppAgeVerifyResponse.class);
        } else {
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
            if (roomCreateInfo != null) {
                cppAgeVerificationInfo = roomCreateInfo.cppAgeVerificationInfo;
            } else {
                cppAgeVerificationInfo = null;
            }
        }
        dataChannelGlobal.JQ2(C931290aLH.class, new C0UNK(Boolean.valueOf(z), Integer.valueOf(i), cppAgeVerificationInfo));
        c0uq6.LIZ(Integer.valueOf(i), bool, c772450URv, c16fs, liveMode, true, new C0UNI(c0uq6, c772450URv, context, dataChannel, str), AFwS199S0000000_12.get$arr$(370));
    }
}
