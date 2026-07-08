package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.cct.IOpenCCTUtils;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.commercialize.utils.crouter.CRouterMainService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0coi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026420coi {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final GMTBaseModel LIZJ;

    public C1026420coi(Context context, Aweme aweme, GMTBaseModel gMTBaseModel) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = gMTBaseModel;
    }

    public static C1026680cp8 LIZ(C1026420coi c1026420coi, int i, String str) {
        String webUrl;
        AwemeRawAd awemeRawAd;
        GMTBaseModel gMTBaseModel = c1026420coi.LIZJ;
        AwemeRawAd awemeRawAd2 = null;
        if (gMTBaseModel == null) {
            return null;
        }
        boolean z = false;
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if (iOpenCCTUtils != null) {
            Aweme aweme = c1026420coi.LIZIZ;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                webUrl = awemeRawAd.getWebUrl();
            } else {
                webUrl = null;
            }
            if (iOpenCCTUtils.LIZ(webUrl)) {
                z = true;
            }
        }
        Context context = c1026420coi.LIZ;
        Aweme aweme2 = c1026420coi.LIZIZ;
        if (aweme2 != null) {
            awemeRawAd2 = aweme2.getAwemeRawAd();
        }
        return C1026430coj.LIZ(gMTBaseModel, LIZIZ(i, "", str), LIZJ(context, aweme2, awemeRawAd2, c1026420coi.LIZJ), z);
    }

    public static C1025520cnG LIZIZ(int i, String str, String str2) {
        String str3;
        if (i != 2) {
            if (i != 64) {
                if (i != 69) {
                    if (i != 1000) {
                        if (i != 39) {
                            if (i != 40) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("transformClickFromToRouterScene() this scene's clickFrom = ");
                                sbLIZ.append(i);
                                sbLIZ.append(" is wrong,please check!!!");
                                C2188811AlT.LIZIZ(sbLIZ);
                                str3 = "";
                            } else {
                                str3 = "fyp_slide";
                            }
                        } else {
                            str3 = "fyp_name";
                        }
                    } else {
                        str3 = "all_jsb";
                    }
                } else {
                    str3 = "fyp_organic_anchor";
                }
            } else {
                str3 = "fyp_avatar";
            }
        } else {
            str3 = "fyp_cta";
        }
        return new C1025520cnG(null, str3, null, str2, str, i, null, null, 965);
    }

    public static C1026810cpL LIZLLL(C1026420coi c1026420coi, int i, String str) {
        AwemeRawAd awemeRawAd;
        GMTBaseModel gMTBaseModel = c1026420coi.LIZJ;
        if (gMTBaseModel == null) {
            return null;
        }
        Context context = c1026420coi.LIZ;
        Aweme aweme = c1026420coi.LIZIZ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1025880cnq c1025880cnqLIZJ = LIZJ(context, aweme, awemeRawAd, c1026420coi.LIZJ);
        C1025520cnG c1025520cnGLIZIZ = LIZIZ(i, "", str);
        ICRouterMainDelegate iCRouterMainDelegateLJJIIZ = CRouterMainService.LJJIIZ();
        C1026910cpV c1026910cpV = new C1026910cpV(iCRouterMainDelegateLJJIIZ.LJJI(), iCRouterMainDelegateLJJIIZ.LJIJJ(), iCRouterMainDelegateLJJIIZ.LJJIIJ());
        if (gMTBaseModel.getWebUrl() == null) {
            return null;
        }
        return new C1026810cpL(c1025880cnqLIZJ, c1025520cnGLIZIZ, c1026910cpV, gMTBaseModel.getWebUrl(), gMTBaseModel.getShouldWebUrlJumpThirdApp());
    }

    public static C1025880cnq LIZJ(Context context, Aweme aweme, AwemeRawAd awemeRawAd, GMTBaseModel gMTBaseModel) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        return new C1025880cnq(context, aid, aweme, awemeRawAd, gMTBaseModel);
    }
}
