package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.service.AiChatFeatureServiceImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.1EP7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EP7 extends C09AY implements Function0<C21300718Xl> {
    public final /* synthetic */ AiChatFeatureServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EP7(AiChatFeatureServiceImpl aiChatFeatureServiceImpl) {
        super(0);
        this.LL = aiChatFeatureServiceImpl;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.18Xl] */
    @Override // kotlin.jvm.functions.Function0
    public final C21300718Xl invoke() {
        if (!((Boolean) C287700BPk.LIZ.getValue()).booleanValue()) {
            return null;
        }
        final boolean zIsFeatureEnabled = this.LL.LIZIZ().isFeatureEnabled();
        final boolean zLIZJ = this.LL.LIZIZ().LIZJ();
        return new InterfaceC21300818Xm(zIsFeatureEnabled, zLIZJ) { // from class: X.18Xl
            public final boolean LIZ;
            public final boolean LIZIZ;
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(331));

            public final InterfaceC21300818Xm LJIIJ() {
                return (InterfaceC21300818Xm) this.LIZJ.getValue();
            }

            @Override // X.InterfaceC21300818Xm
            public final boolean LIZ(String str) {
                return LJIIJ().LIZ(str);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJI(VideoPublishContainerScene videoPublishContainerScene) {
                if (!this.LIZ) {
                    return;
                }
                LJIIJ().LJI(videoPublishContainerScene);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJII(Context context) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LJII(context);
            }

            @Override // X.InterfaceC21300818Xm
            public final boolean LJIIIIZZ(String str) {
                return LJIIJ().LJIIIIZZ(str);
            }

            {
                this.LIZ = zIsFeatureEnabled;
                this.LIZIZ = zLIZJ;
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZIZ(Context context, String str) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LIZIZ(context, str);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJIIIZ(Context context, AIChatGenConsumptionModel aIChatGenConsumptionModel) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LJIIIZ(context, aIChatGenConsumptionModel);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZLLL(Context context, OnActivityResultCallback onActivityResultCallback, AIChatPageConfig aIChatPageConfig) {
                if (!this.LIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LIZLLL(context, onActivityResultCallback, aIChatPageConfig);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJFF(C19EG c19eg, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode, String str) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(c19eg);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LJFF(c19eg, aIChatGenConsumptionModel, aIChatGenNode, str);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LIZJ(Context context, AIChatGenModel aIChatGenModel, AIChatGenNode aIChatGenNode, String str, String str2) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LIZJ(context, aIChatGenModel, aIChatGenNode, str, str2);
            }

            @Override // X.InterfaceC21300818Xm
            public final void LJ(Context context, String str, String str2, String str3, String str4, String str5) {
                if (!this.LIZIZ) {
                    Activity activityLIZ = C0FNT.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131831482);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                LJIIJ().LJ(context, str, str2, str3, str4, str5);
            }
        };
    }
}
