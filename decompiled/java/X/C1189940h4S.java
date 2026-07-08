package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;
import com.ss.android.ugc.aweme.poi.detail.ai.model.AiSummaryModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0h4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189940h4S extends AbstractC1180290got<AiSummaryModel> {
    public PoiAiSummaryListSharedVM LLILZ;
    public final Map<String, PoiReviewsApi.PoiReviewModel> LLILZIL = new LinkedHashMap();

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        this.LL = null;
        EventBus.LIZLLL().LJJI(this);
        ((LinkedHashMap) this.LLILZIL).clear();
    }

    @Override // X.AbstractC1180290got
    public final String LJJIIJ() {
        return "poi_ai_summary";
    }

    @Override // X.AbstractC1180290got
    public final Class<?> LJJIFFI() {
        return AiSummaryModel.class;
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIJJLI(InterfaceC1181010gq3 interfaceC1181010gq3) {
        this.LL = interfaceC1181010gq3;
        EventBus.LIZLLL().LJIJJ(this);
        LJJIJIIJIL("click_ai_sub_summary_video", new InterfaceC1180270gor() { // from class: X.0gpX
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01c2 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:9:0x002a, B:11:0x002e, B:13:0x0033, B:15:0x0037, B:17:0x003d, B:18:0x0093, B:20:0x0099, B:22:0x00a8, B:24:0x00ac, B:26:0x00b6, B:31:0x00d9, B:34:0x00e0, B:36:0x00e4, B:40:0x00eb, B:42:0x00ef, B:45:0x00fa, B:47:0x00fe, B:50:0x0109, B:52:0x010d, B:55:0x0118, B:57:0x012d, B:58:0x0141, B:60:0x0145, B:62:0x014b, B:64:0x0151, B:66:0x0157, B:67:0x0159, B:68:0x0175, B:70:0x0185, B:72:0x018b, B:77:0x01b4, B:83:0x01dc, B:30:0x00ce, B:78:0x01c2, B:80:0x01c6, B:82:0x01cc, B:28:0x00bc), top: B:88:0x002a, inners: #1 }] */
            @Override // X.InterfaceC1180270gor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onEvent(X.AbstractC1186480gys r25) {
                /*
                    Method dump skipped, instruction units count: 493
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1180690gpX.onEvent(X.0gys):void");
            }
        });
        LJJIJIIJIL("click_ai_sub_summary_review", new InterfaceC1180270gor() { // from class: X.0h3R
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x018f A[PHI: r11
              0x018f: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String), (r11v6 java.lang.String) binds: [B:86:0x018b, B:64:0x010e, B:66:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0193 A[PHI: r11 r12
              0x0193: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v5 java.lang.String) binds: [B:89:0x0190, B:69:0x0118] A[DONT_GENERATE, DONT_INLINE]
              0x0193: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:89:0x0190, B:69:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1180270gor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onEvent(X.AbstractC1186480gys r21) {
                /*
                    Method dump skipped, instruction units count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1189310h3R.onEvent(X.0gys):void");
            }
        });
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void handleLikeEvent(C1190040h4c c1190040h4c) {
        String str = c1190040h4c.LIZ;
        if (str == null || c1190040h4c.LIZJ == null) {
            return;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) ((LinkedHashMap) this.LLILZIL).get(str);
        if (poiReviewModel == null) {
            this.LLILZIL.put(c1190040h4c.LIZ, c1190040h4c.LIZJ);
            poiReviewModel = c1190040h4c.LIZJ;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = poiReviewModel;
        this.LLILZIL.put(c1190040h4c.LIZ, poiReviewModel2.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, c1190040h4c.LIZJ.getStatistics(), c1190040h4c.LIZJ.getUserStatus(), poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
    }

    @Override // X.AbstractC1180290got
    public final void LJJIIZI(Object obj, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBizDataChanged: ");
        sbLIZ.append(obj);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PoiAiSummaryPlugin", C2188811AlT.LIZIZ(sbLIZ));
    }
}
