package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1136640fgU {
    public static void LIZ(final AssetsModel assetsModel, final C1135280feI c1135280feI, final String str, final Map map) {
        if (c1135280feI == null) {
            return;
        }
        if (Intrinsics.LJFF("_anchor", str)) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LJ) {
                return;
            }
        }
        C1138350fjF.LIZ(new Runnable() { // from class: X.0fgI
            public final /* synthetic */ boolean LLILZIL = true;

            public final void LIZ() {
                boolean zLJII = C1138640fji.LJII(null, Long.valueOf(c1135280feI.LJFF));
                C1137480fhq c1137480fhq = C1137480fhq.LIZ;
                AssetsModel assetsModel2 = assetsModel;
                c1137480fhq.getClass();
                boolean zLIZ = C1137480fhq.LIZ(assetsModel2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gift_render_msg_receive");
                sbLIZ.append(str);
                C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZIL ? 1 : 0), "use_sdk");
                c474500IjALIZ.LJJII(Long.valueOf(c1135280feI.LJFF), "asset_id");
                c474500IjALIZ.LJJII(Long.valueOf(c1135280feI.LJIIL), "gift_id");
                c474500IjALIZ.LJJII(Long.valueOf(c1135280feI.LJ), "msg_id");
                c474500IjALIZ.LJJII(c1135280feI.LJIILL, "log_id");
                AssetsModel assetsModel3 = assetsModel;
                c474500IjALIZ.LJJII(Integer.valueOf(assetsModel3 != null ? assetsModel3.resourceType : 0), "res_type");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135280feI.LJIILJJIL ? 1 : 0), "is_local");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135280feI.LJIILJJIL ? 1 : 0), "is_own_send");
                c474500IjALIZ.LJJIIZI(c1135280feI.LJIIZILJ);
                c474500IjALIZ.LJJII(Integer.valueOf(zLJII ? 1 : 0), "resource_downloaded");
                c474500IjALIZ.LJJII(Integer.valueOf(zLIZ ? 1 : 0), "gecko_resource_downloaded");
                C1136940fgy.LIZ.getClass();
                c474500IjALIZ.LJJII(Integer.valueOf(C1136140ffg.LIZ()), "is_anchor");
                c474500IjALIZ.LJJIFFI(Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), "device_score");
                c474500IjALIZ.LJJII(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL(), "overload_score");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseLiveGiftVideoPlayerMonitor@3d81.onReceiveEffectPlayEventInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseLiveGiftVideoPlayerMonitor@3d81.onReceiveEffectPlayEventInternal$1");
            }
        });
    }
}
