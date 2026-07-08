package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.tools.IStickerPropDetailService;
import com.ss.android.ugc.aweme.tools.detail.IStickerReuseSvcService;
import kotlin.jvm.internal.AwS54S0500000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394160mNq {
    public final IStickerReuseSvcService LIZ;
    public final C1394130mNn LIZIZ;
    public final C1394180mNs LIZJ;
    public final C01GW LIZLLL;

    public C1394160mNq() {
        this(0);
    }

    public C1394160mNq(int i) {
        IStickerReuseSvcService iStickerReuseSvcService = (IStickerReuseSvcService) ServiceManager.get().getService(IStickerReuseSvcService.class);
        C1394130mNn c1394130mNn = new C1394130mNn();
        C1394180mNs c1394180mNs = new C1394180mNs();
        this.LIZ = iStickerReuseSvcService;
        this.LIZIZ = c1394130mNn;
        this.LIZJ = c1394180mNs;
        this.LIZLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1315));
    }

    public static void LIZ(Aweme aweme, InterfaceC1392640mLO interfaceC1392640mLO, SmartRoute smartRoute) {
        String strCf;
        Activity activityLIZIZ;
        if (interfaceC1392640mLO == null || (strCf = interfaceC1392640mLO.Cf()) == null) {
            strCf = "";
        }
        FlexibleComponentAbility flexibleComponentAbility = null;
        if (interfaceC1392640mLO != null) {
            activityLIZIZ = interfaceC1392640mLO.LIZIZ();
            InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
            if (interfaceC665370Q7zK0 != null) {
                flexibleComponentAbility = (FlexibleComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zK0, FlexibleComponentAbility.class, null);
            }
        } else {
            activityLIZIZ = null;
        }
        LIZIZ(aweme, strCf, "feed_component", activityLIZIZ, flexibleComponentAbility, smartRoute, false);
    }

    public static void LIZIZ(Aweme aweme, String str, String str2, Activity activity, FlexibleComponentAbility flexibleComponentAbility, SmartRoute smartRoute, boolean z) {
        Intent intentBuildIntent;
        IStickerPropDetailService iStickerPropDetailService;
        Class<? extends Fragment> clsLIZ;
        if (C0T1L.LIZ().effectPageEnable && aweme != null && (!aweme.isAd()) && Intrinsics.LJFF(str, "homepage_hot") && (intentBuildIntent = smartRoute.buildIntent()) != null) {
            try {
                Bundle extras = intentBuildIntent.getExtras();
                if (extras != null && activity != null && (iStickerPropDetailService = (IStickerPropDetailService) PluggableExtentionKt.pluggableSpi$default(IStickerPropDetailService.class, false, false, false, 14, null)) != null && (clsLIZ = iStickerPropDetailService.LIZ()) != null && flexibleComponentAbility != null) {
                    C1398470mUn c1398470mUn = new C1398470mUn("effect", clsLIZ, extras);
                    c1398470mUn.LJ = new C21698919w3(null, null, null, null, str2, "anchor_effect", "anchor");
                    if (z) {
                        C21659619pi c21659619pi = new C21659619pi();
                        c21659619pi.LJII = EnumC1396040mQs.SEVEN;
                        c21659619pi.LJIIIZ = Boolean.TRUE;
                        c1398470mUn.LIZLLL = c21659619pi.LIZ();
                    }
                    flexibleComponentAbility.jC2(c1398470mUn);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        smartRoute.open();
    }

    public final void LIZJ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, Music music, AVMusic aVMusic, AnchorCommonStruct anchorCommonStruct2, String str, String str2, InterfaceC1052240dUM interfaceC1052240dUM, String str3) {
        this.LIZJ.LIZ(aweme, anchorCommonStruct, context, music, aVMusic, str2, str, anchorCommonStruct2, ((Boolean) this.LIZLLL.getValue()).booleanValue(), str3, new AwS54S0500000_21(this, aweme, anchorCommonStruct, context, interfaceC1052240dUM, 6));
    }
}
