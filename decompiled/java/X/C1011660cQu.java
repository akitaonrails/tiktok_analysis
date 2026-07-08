package X;

import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAppModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterDeeplinkModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdComponentDataModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0cQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011660cQu {
    public static final SearchAdComponentDataModel LIZ(AbstractC1014240cV4 abstractC1014240cV4) {
        Object c098200Yq;
        try {
            Gson gson = C7740030o.LIZ().getGson();
            c098200Yq = (SearchAdComponentDataModel) gson.LJII(gson.LJIILL(abstractC1014240cV4.LL.data), SearchAdComponentDataModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            abstractC1014240cV4.LJIILL();
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            abstractC1014240cV4.LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convert SearchAdComponentDataModel failed  ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new SearchAdComponentDataModel("learn More", "", 10, false, 2.5f, 0, CardStruct.IStatusCode.DEFAULT, "");
        }
        return (SearchAdComponentDataModel) c098200Yq;
    }

    public static final void LIZLLL(View view, final float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0cEz
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                int width;
                int height;
                if (outline != null) {
                    if (view2 != null) {
                        width = view2.getWidth();
                        height = view2.getHeight();
                    } else {
                        width = 0;
                        height = 0;
                    }
                    outline.setRoundRect(0, 0, width, height, f);
                }
            }
        });
    }

    public static void LJ(TextView textView, TextView textView2) {
        boolean z;
        int lineHeight;
        int lineHeight2;
        Interpolator interpolatorLJIILIIL = C1619980sG4.LJIILIIL();
        Integer numValueOf = Integer.valueOf(textView.getHeight());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lineHeight = numValueOf.intValue();
        } else {
            lineHeight = textView.getLineHeight();
        }
        Integer numValueOf2 = Integer.valueOf(textView2.getHeight());
        if (numValueOf2.intValue() > 0) {
            lineHeight2 = numValueOf2.intValue();
        } else {
            lineHeight2 = textView2.getLineHeight();
        }
        float fMax = Math.max(lineHeight, lineHeight2);
        textView2.clearAnimation();
        C786410Ut5.cd(fMax, textView2);
        C786410Ut5.S4(0.0f, textView2);
        C786410Ut5.LLIL(textView2, 0);
        textView.animate().translationY(-fMax).alpha(0.0f).setDuration(800L).setInterpolator(interpolatorLJIILIIL).withEndAction(new ARunnableS105S0100000_5(textView, 128)).start();
        textView2.animate().translationY(0.0f).alpha(1.0f).setDuration(800L).setInterpolator(interpolatorLJIILIIL).start();
    }

    public static final boolean LIZIZ(Context context, C1009340cNA c1009340cNA, JumpData jumpData, String str, String str2, CRouterCoreModel cRouterCoreModel) {
        String str3;
        Object obj;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        CRouterCoreModel cRouterCoreModelLIZLLL = cRouterCoreModel;
        if (context == null) {
            return false;
        }
        final AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(604);
        GMTBaseModel gMTBaseModelLIZ = null;
        AwemeRawAd awemeRawAd3 = null;
        ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
        if (iCRouterManager != null) {
            if (c1009340cNA == null || (str3 = c1009340cNA.LIZ) == null) {
                str3 = "";
            }
            if (c1009340cNA != null) {
                obj = c1009340cNA.LIZJ;
                awemeRawAd = c1009340cNA.LIZLLL;
            } else {
                obj = null;
                awemeRawAd = null;
            }
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
            if (iCRouterModelTransform != null) {
                if (c1009340cNA != null) {
                    awemeRawAd3 = c1009340cNA.LIZLLL;
                }
                gMTBaseModelLIZ = iCRouterModelTransform.LIZ(awemeRawAd3);
            }
            C1025880cnq c1025880cnq = new C1025880cnq(context, str3, obj, awemeRawAd, gMTBaseModelLIZ);
            C1025520cnG c1025520cnG = new C1025520cnG(null, "general_search_outflow", null, str, "result_ad", 2, null, str2, 709);
            if (cRouterCoreModelLIZLLL == null) {
                if (c1009340cNA != null) {
                    awemeRawAd2 = c1009340cNA.LIZLLL;
                } else {
                    awemeRawAd2 = null;
                }
                ICRouterAdapterService iCRouterAdapterService = (ICRouterAdapterService) PluggableExtentionKt.pluggableSpi$default(ICRouterAdapterService.class, false, false, false, 14, null);
                if (iCRouterAdapterService != null && (cRouterCoreModelLIZLLL = iCRouterAdapterService.LIZLLL(awemeRawAd2)) != null) {
                    if (jumpData != null) {
                        CRouterDeeplinkModel deeplinkModel = cRouterCoreModelLIZLLL.getDeeplinkModel();
                        if (deeplinkModel != null) {
                            deeplinkModel.setUrl(jumpData.getOpenUrl());
                        }
                        CRouterWebModel webModel = cRouterCoreModelLIZLLL.getWebModel();
                        if (webModel != null) {
                            webModel.setUrl(jumpData.getWebUrl());
                        }
                        CRouterWebModel webModel2 = cRouterCoreModelLIZLLL.getWebModel();
                        if (webModel2 != null) {
                            webModel2.setTitle(jumpData.getWebTitle());
                        }
                        CRouterAppModel appModel = cRouterCoreModelLIZLLL.getAppModel();
                        if (appModel != null) {
                            appModel.setAppID(jumpData.getPackageName());
                        }
                    }
                } else {
                    cRouterCoreModelLIZLLL = null;
                }
            }
            C1025660cnU c1025660cnU = new C1025660cnU();
            c1025660cnU.LIZJ = new InterfaceC1025850cnn() { // from class: X.0cQv
                @Override // X.InterfaceC1025850cnn
                public final void LIZ() {
                    aFwS252S0000000_16.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC1025850cnn
                public final void LIZIZ() {
                    aFwS252S0000000_16.invoke(Boolean.TRUE);
                }
            };
            C1025660cnU c1025660cnU2 = new C1025660cnU();
            c1025660cnU2.LIZJ = new InterfaceC1025850cnn() { // from class: X.0cQw
                @Override // X.InterfaceC1025850cnn
                public final void LIZ() {
                    aFwS252S0000000_16.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC1025850cnn
                public final void LIZIZ() {
                    aFwS252S0000000_16.invoke(Boolean.TRUE);
                }
            };
            CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4(cRouterCoreModelLIZLLL, new C1025430cn7(c1025660cnU2, c1025660cnU, null, null, 124), 4), true);
            if (cRouterManagerLIZLLL != null) {
                cRouterManagerLIZLLL.LJI();
                return true;
            }
            return true;
        }
        return true;
    }
}
