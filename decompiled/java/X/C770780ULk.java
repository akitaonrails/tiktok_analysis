package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveStudioTipsClickEvent;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideLastShowLimit;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideShowMaxTimesSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.OpenLsNotifyInfo;

/* JADX INFO: renamed from: X.0ULk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770780ULk implements InterfaceC1141530foN {
    public static DataChannel LLILLJJLI;
    public static SparkContext LLILZIL;
    public static boolean LLILZLL;
    public static final C770780ULk LL = new C770780ULk();
    public static final int LLILLL = LiveStudioGuideShowMaxTimesSetting.INSTANCE.value();
    public static final int LLILZ = LiveStudioGuideLastShowLimit.INSTANCE.value();

    public static boolean LIZ(DataChannel dataChannel) {
        boolean z;
        boolean z2;
        CreateInfoResponse.ResponseData responseDataI92;
        OpenLsNotifyInfo openLsNotifyInfo;
        if (dataChannel == null) {
            return false;
        }
        if (Intrinsics.LJFF(dataChannel.gg0(C750210Tbn.class), Boolean.TRUE)) {
            dataChannel.SX0(C750210Tbn.class, Boolean.FALSE);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lLIZIZ = InterfaceC772390URp.f127J.LIZIZ();
        Boolean boolLIZIZ = InterfaceC772390URp.K.LIZIZ();
        long jLongValue = jCurrentTimeMillis - lLIZIZ.longValue();
        SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
        int i = (int) (jLongValue / 86400000);
        Integer numLIZIZ = InterfaceC772390URp.I.LIZIZ();
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService != null && (responseDataI92 = iGameService.I92()) != null && (openLsNotifyInfo = responseDataI92.openLsNotify) != null && openLsNotifyInfo.openLsNotifyWindow) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel.gg0(LiveModeChannel.class) == LiveMode.SCREEN_RECORD) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!boolLIZIZ.booleanValue() || !z2 || !z || numLIZIZ.intValue() >= LLILLL || i < LLILZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "js_event_ls_guide_name")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null && C1871910yoP.LIZIZ(interfaceC1107590evd, "js_param_ls_guide_not_pop", false)) {
                InterfaceC772390URp.K.LJFF(Boolean.FALSE);
                return;
            }
            DataChannel dataChannel = LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.FQ2(PreviewLiveStudioTipsClickEvent.class);
            }
            SparkContext sparkContext = LLILZIL;
            if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
            LLILZLL = false;
            C1548820qPI.LJIIIIZZ("js_event_ls_guide_name", this);
            LLILLJJLI = null;
            LLILZIL = null;
        }
    }

    public final synchronized void LIZJ(DataChannel dataChannel, Context context) {
        if (!LLILZLL && LIZ(dataChannel)) {
            LIZIZ(dataChannel, context, "live_start");
        }
    }

    public final void LIZIZ(DataChannel dataChannel, Context context, String str) {
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(LiveStudioGuideLynxUrlSetting.INSTANCE.getLynxUrl()).buildUpon().appendQueryParameter("enter_from", str);
        C770600UKs.LIZ(builderAppendQueryParameter);
        Uri uriBuild = builderAppendQueryParameter.build();
        if (!TextUtils.isEmpty(uriBuild.toString())) {
            SparkContext sparkContextYC1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, uriBuild.toString(), null);
            LLILZIL = sparkContextYC1;
            if (sparkContextYC1 != null) {
                sparkContextYC1.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0ULl
                    @Override // X.AbstractC1542100qES
                    public final void LJLL(SparkContext sparkContext) {
                        C770780ULk c770780ULk = C770780ULk.LL;
                        C770780ULk.LLILZLL = false;
                        C1548820qPI.LJIIIIZZ("js_event_ls_guide_name", c770780ULk);
                        C770780ULk.LLILLJJLI = null;
                        C770780ULk.LLILZIL = null;
                    }
                });
            }
            LLILZLL = true;
            C20337914i1<Integer> c20337914i1 = InterfaceC772390URp.I;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            InterfaceC772390URp.f127J.LJFF(Long.valueOf(System.currentTimeMillis()));
            LLILLJJLI = dataChannel;
            C1548820qPI.LIZLLL("js_event_ls_guide_name", this);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_native_guidepage_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(str, "enter_from");
            c474500IjALIZ.LIZ();
        }
    }
}
