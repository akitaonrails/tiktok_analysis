package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19329010jg implements InterfaceC580190MpF {
    public static final IMainService LIZ = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);

    @Override // X.InterfaceC580190MpF
    public boolean LIZJ() {
        return this instanceof C19329110jh;
    }

    @Override // X.C12VK
    public boolean LJII() {
        return this instanceof C19329110jh;
    }

    @Override // X.InterfaceC580190MpF
    public final void LIZ() {
        AnchorListManager.LIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(137754);
        AnchorListManager.LIZLLL(null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC580190MpF
    public final void LJIIIIZZ() {
        IMainService iMainService = LIZ;
        if (iMainService != null) {
            iMainService.trackAppsFlyerEvent("mus_af_post_video", null);
        }
    }

    @Override // X.InterfaceC580190MpF
    public final String LIZIZ(Context context) {
        return ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LIZIZ(context);
    }

    @Override // X.InterfaceC580190MpF
    public final C1402840mbq LJ(VideoPublishEditModel videoPublishEditModel) {
        return C1B46.LIZLLL(videoPublishEditModel);
    }

    @Override // X.InterfaceC580190MpF
    public final boolean LJFF(Context context) {
        return C2179771ASp.LJIIJ(context);
    }

    @Override // X.InterfaceC580190MpF
    public final void LJI(Activity activity) {
        if (activity instanceof C19EG) {
            C19EG c19eg = (C19EG) activity;
            if (LIZ.isMainActivity(c19eg) && Hox.AQ2(c19eg).KQ2("HOME")) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
                Hox.AQ2(c19eg).yQ2(bundle, "HOME");
            }
        }
    }

    @Override // X.InterfaceC580190MpF
    public final void onBackToOpenPlatform(BaseShortVideoContext baseShortVideoContext) {
        IMainService iMainService = LIZ;
        if (iMainService != null) {
            iMainService.onBackToOpenPlatform(baseShortVideoContext);
        }
    }

    @Override // X.InterfaceC580190MpF
    public final void onBackToTikTokMusic(Activity activity) {
        IMainService iMainService = LIZ;
        if (iMainService != null) {
            iMainService.onBackToTikTokMusic(activity);
        }
    }

    @Override // X.InterfaceC580190MpF
    public final void LJIIIZ(C19EG c19eg, BaseShortVideoContext baseShortVideoContext, C1B4F c1b4f) {
        LJIIJ(c19eg, baseShortVideoContext.mShootWay, C1B46.LIZLLL(baseShortVideoContext), Boolean.FALSE, c1b4f);
    }

    @Override // X.InterfaceC580190MpF
    public final void LJIIJJI(C19GS c19gs, VideoPublishEditModel videoPublishEditModel, Boolean bool, C1B4F c1b4f) {
        LJIIJ(c19gs, videoPublishEditModel.mShootWay, C1B46.LIZLLL(videoPublishEditModel), bool, c1b4f);
    }

    @Override // X.InterfaceC580190MpF
    public final void LJIIJ(Activity activity, String str, C1402840mbq c1402840mbq, Boolean bool, C1B4F c1b4f) {
        if (c1402840mbq == null) {
            return;
        }
        LIZLLL(str, c1402840mbq.mClientKey, c1402840mbq.getSdkNameForServer(), c1402840mbq.mSdkVersion, c1b4f, c1402840mbq.mShareMediaType);
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi(ICreativeSAAService.class);
        if (C1B46.LJFF(c1402840mbq)) {
            if (!bool.booleanValue()) {
                AVServiceProxyImpl.onReturnThirdPlatformFailedInner(activity, c1402840mbq, c1b4f);
            }
            if (activity != null && iCreativeSAAService != null) {
                if (C298030BmD.LIZ() && bool.booleanValue()) {
                    iCreativeSAAService.finishCurrentPage(activity);
                    return;
                } else {
                    iCreativeSAAService.finishSAAActivitySafely(activity);
                    return;
                }
            }
            return;
        }
        if (activity == null || iCreativeSAAService == null) {
            return;
        }
        if (((Boolean) C0AZW.LIZ.getValue()).booleanValue() && iCreativeSAAService.getSecondScene(activity) == null) {
            Intent intentLIZIZ = C2162308dZ.LIZIZ(activity, activity.getPackageName());
            intentLIZIZ.addFlags(67108864);
            intentLIZIZ.addFlags(268435456);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZIZ, activity);
            C2204961BRm.LJIILLIIL(activity, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmaovH3T590d/7oP2pEzROYOH+FSyDrn2Vb6FzDw==", null));
        }
        iCreativeSAAService.finishCurrentPage(activity);
    }

    @Override // X.InterfaceC580190MpF
    public final void LIZLLL(String str, String str2, String str3, String str4, C1B4F c1b4f, int i) {
        if (str != null && C1B46.LJIIJJI(str)) {
            String str5 = "system_share";
            if (!Intrinsics.LJFF("system_share", str)) {
                if (C1B46.LJIIJ(str)) {
                    str5 = "sdk";
                } else {
                    str5 = "";
                }
            }
            C2198841B3y.LIZJ(str, str5, str2, str3, str4, c1b4f, i);
        }
    }
}
