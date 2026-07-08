package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionAdjustIconStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionGoalStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionPageStyleABSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePreviewUseEventSchemaSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AwS26S0000100_7;
import qo2.w;
import webcast.data.LiveGoLivePageContainer;

/* JADX INFO: renamed from: X.0Trs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760180Trs {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL() {
        return PreviewRevisionPageStyleABSetting.INSTANCE.pageStyle();
    }

    public static boolean LJ() {
        return PreviewRevisionAdjustIconStyleABSetting.INSTANCE.isMatch();
    }

    public static boolean LJFF() {
        return PreviewRevisionPageStyleABSetting.INSTANCE.isMatch() || PreviewRevisionGoalStyleABSetting.INSTANCE.isMatch() || LJ();
    }

    public static boolean LJI() {
        return AnchorPreviewUniformStyleABSetting.INSTANCE.enable();
    }

    public static boolean LJII() {
        return PreviewRevisionPageStyleABSetting.INSTANCE.isMatch() || PreviewRevisionGoalStyleABSetting.INSTANCE.isMatch();
    }

    public static String LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C200100pr.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "voice_live";
                        }
                        return null;
                    }
                    return "third_party";
                }
                return "share_screen";
            }
            return "video_live";
        }
        return null;
    }

    public static LiveGoLivePageContainer LIZIZ(DataChannel dataChannel, Map map) {
        LiveMode liveMode;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        return LIZJ(map, liveMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static webcast.data.LiveGoLivePageContainer LIZJ(java.util.Map r3, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4) {
        /*
            if (r4 == 0) goto L41
            int[] r1 = X.C200100pr.LIZ
            int r0 = r4.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L37
            r0 = 2
            if (r2 == r0) goto L2e
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 != r0) goto L41
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r0)
        L1e:
            boolean r0 = r1 instanceof webcast.data.LiveGoLivePageContainer
            if (r0 == 0) goto L44
            webcast.data.LiveGoLivePageContainer r1 = (webcast.data.LiveGoLivePageContainer) r1
            return r1
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r0)
            goto L1e
        L2e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r0)
            goto L1e
        L37:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r0)
            goto L1e
        L41:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L1e
        L44:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760180Trs.LIZJ(java.util.Map, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):webcast.data.LiveGoLivePageContainer");
    }

    public static void LJIIIIZZ(long j, Context context) {
        long id;
        Integer numValueOf;
        if (context == null) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (LivePreviewUseEventSchemaSetting.INSTANCE.getValue()) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, LiveEventPageLynxUrl.INSTANCE.getLiveEventDialogSchema(), new AwS26S0000100_7(j, 4));
                    return;
                }
                String value = LiveEventDetailSetting.INSTANCE.getValue();
                if (value == null || value.length() <= 0 || 1 == 0) {
                    return;
                }
                Uri.Builder builderAppendQueryParameter = UriProtector.parse(value).buildUpon().appendQueryParameter("height", String.valueOf(((double) C497740JfY.LJIILLIIL()) * 0.7d)).appendQueryParameter("event_id", String.valueOf(j));
                User userLIZIZ = C0KXJ.LIZIZ();
                if (userLIZIZ != null) {
                    id = userLIZIZ.getId();
                } else {
                    id = 0;
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("user_id", String.valueOf(id));
                IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
                if (iHostAppContextLJIIJJI != null) {
                    numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
                } else {
                    numValueOf = null;
                }
                C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(builderAppendQueryParameter2.appendQueryParameter("aid", String.valueOf(numValueOf)).appendQueryParameter("live_event_enter_from", "live_preview_page").build().toString());
                EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
                c760370TsBLIZJ.LJIJI(8, enumC760350Ts9);
                c760370TsBLIZJ.LJIIIZ((int) C497740JfY.LJJI((int) (((double) C497740JfY.LJIILLIIL()) * 0.7d)), enumC760350Ts9);
                c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), enumC760350Ts9);
                c760370TsBLIZJ.LJIIIIZZ("bottom");
                c760370TsBLIZJ.LJ(-1);
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZJ.LIZ().toString(), null);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LIZLLL(2131843092);
    }

    public static void LJIIIZ(DataChannel dataChannel, String str) {
        LiveMode liveMode;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "component_name");
        c474500IjALIZ.LJJII(LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(DataChannel dataChannel, Map map) {
        LiveMode liveMode;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(DataChannel dataChannel, String str) {
        LiveMode liveMode;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "component_name");
        c474500IjALIZ.LJJII(LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(DataChannel dataChannel, Map map) {
        LiveMode liveMode;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }
}
