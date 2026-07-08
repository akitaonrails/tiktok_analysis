package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.IAIInfoPanelService;
import com.ss.android.ugc.aweme.aigc.aiinfopanel.AIInfoPanelFragment;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.C2PAExtraData;
import com.ss.android.ugc.aweme.feed.model.C2PAInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ModerationAigcInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SPX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPX implements InterfaceC698070RZt {
    public final String LIZ;
    public final Context LIZIZ;
    public final C19EG LIZJ;

    @Override // X.InterfaceC698070RZt
    public final Integer LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC698070RZt
    public final String LLLII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC698070RZt
    public final View.OnClickListener LIZ(final VideoItemParams videoItemParams) {
        final C720800SPe c720800SPeLIZIZ = ((IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class)).LIZIZ(videoItemParams.getAweme());
        if (c720800SPeLIZIZ != null) {
            c720800SPeLIZIZ.LIZ = videoItemParams.mEventType;
        }
        return new AbstractViewOnClickListenerC1637610siV() { // from class: X.0SPc
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                Integer numValueOf;
                String str;
                String str2;
                String str3;
                String str4;
                Integer num;
                Integer num2;
                String str5;
                String str6;
                String str7 = "";
                Integer num3 = null;
                if (C0SD6.LIZ()) {
                    C2PAInfo c2paInfo = videoItemParams.getAweme().getC2paInfo();
                    int i = 0;
                    if (c2paInfo != null && (str5 = c2paInfo.c2paExtraData) != null && C123100dR.LIZ(str5)) {
                        VideoItemParams videoItemParams2 = videoItemParams;
                        try {
                            C1227904rF c1227904rF = C1227904rF.LIZ;
                            C2PAInfo c2paInfo2 = videoItemParams2.getAweme().getC2paInfo();
                            if (c2paInfo2 != null) {
                                str6 = c2paInfo2.c2paExtraData;
                            } else {
                                str6 = null;
                            }
                            c1227904rF.getClass();
                            C2PAExtraData c2PAExtraData = (C2PAExtraData) C1227904rF.LIZIZ(str6, C2PAExtraData.class);
                            if (c2PAExtraData != null) {
                                i = c2PAExtraData.aigcPercentageType;
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    AIInfoPanelFragment aIInfoPanelFragmentLIZ = ((IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class)).LIZ();
                    int aIGCLabelType = videoItemParams.getAweme().aigcInfo.getAIGCLabelType();
                    boolean zLJFF = Intrinsics.LJFF(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), AwemeExtKt.getAuthorUid(videoItemParams.getAweme()));
                    C2PAInfo c2paInfo3 = videoItemParams.getAweme().getC2paInfo();
                    C720800SPe c720800SPe = c720800SPeLIZIZ;
                    ModerationAigcInfo moderationAigcInfo = videoItemParams.getAweme().getModerationAigcInfo();
                    String aid = videoItemParams.getAweme().getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    C0SRP c0srp = new C0SRP(aIGCLabelType, i, zLJFF, c2paInfo3, c720800SPe, moderationAigcInfo, aid);
                    C19EG c19eg = this.LIZJ;
                    if (c19eg != null) {
                        aIInfoPanelFragmentLIZ.UR(c19eg, c0srp);
                    }
                } else {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZIZ, "aweme://webview");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://www.tiktok.com/tns-inapp/pages/ai-generated-content?hide_nav_bar=1&enter_from=");
                    sbLIZ.append(videoItemParams.mEventType);
                    smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
                    smartRouteBuildRoute.withParam("use_spark", true);
                    smartRouteBuildRoute.open();
                }
                Map<String, String> c2PAMobParamFromAweme = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().parseC2PAMobParamFromAweme(videoItemParams.getAweme());
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", videoItemParams.mEventType);
                c2344009Gk.LJII(c2PAMobParamFromAweme);
                AIGCInfo aIGCInfo = videoItemParams.getAweme().aigcInfo;
                if (aIGCInfo != null) {
                    numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "aigc_label_type");
                C720800SPe c720800SPe2 = c720800SPeLIZIZ;
                if (c720800SPe2 != null) {
                    str = c720800SPe2.LIZIZ;
                } else {
                    str = null;
                }
                c2344009Gk.LJIIIIZZ("group_id", str);
                C720800SPe c720800SPe3 = c720800SPeLIZIZ;
                if (c720800SPe3 != null) {
                    str2 = c720800SPe3.LIZJ;
                } else {
                    str2 = null;
                }
                c2344009Gk.LJIIIIZZ("user_id", str2);
                C720800SPe c720800SPe4 = c720800SPeLIZIZ;
                if (c720800SPe4 != null) {
                    str3 = c720800SPe4.LIZLLL;
                } else {
                    str3 = null;
                }
                c2344009Gk.LJIIIIZZ("country_code", str3);
                if (C0SD6.LIZ()) {
                    C720800SPe c720800SPe5 = c720800SPeLIZIZ;
                    if (c720800SPe5 != null) {
                        str7 = c720800SPe5.LJI;
                    } else {
                        str7 = null;
                    }
                }
                c2344009Gk.LJIIIIZZ("aigc_creation_channel", str7);
                if (C0SD5.LIZLLL(videoItemParams.getAweme())) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("is_creator_overlabel", str4);
                c2344009Gk.LIZJ(C0SD6.LIZ() ? 1 : 0, "show_info_panel");
                C720800SPe c720800SPe6 = c720800SPeLIZIZ;
                if (c720800SPe6 != null) {
                    num = c720800SPe6.LJII;
                } else {
                    num = null;
                }
                c2344009Gk.LJ(num, "moderation_aigc_label_type");
                C720800SPe c720800SPe7 = c720800SPeLIZIZ;
                if (c720800SPe7 != null) {
                    num2 = c720800SPe7.LJIIIIZZ;
                } else {
                    num2 = null;
                }
                c2344009Gk.LJ(num2, "fingerprint_id");
                C720800SPe c720800SPe8 = c720800SPeLIZIZ;
                if (c720800SPe8 != null) {
                    num3 = c720800SPe8.LJIIIZ;
                }
                c2344009Gk.LJ(num3, "invisible_watermark");
                C20684815ws.LJIILLIIL("click_creator_label_aigc", c2344009Gk.LIZ);
            }
        };
    }

    @Override // X.InterfaceC698070RZt
    public final String LIZJ(VideoItemParams videoItemParams) {
        return C0SD5.LIZ(this.LIZIZ, videoItemParams.getAweme());
    }

    public C0SPX(Context context, C19EG c19eg, String str) {
        this.LIZ = str;
        this.LIZIZ = context;
        this.LIZJ = c19eg;
    }
}
