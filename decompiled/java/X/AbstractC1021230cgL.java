package X;

import X.InterfaceC1021290cgR;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0cgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1021230cgL<DEPEND extends InterfaceC1021290cgR> implements InterfaceC1021210cgJ<DEPEND> {
    public C1012790cSj LL;

    public abstract C1021060cg4 LIZ(String str);

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1021210cgJ
    public void jJ2(int i) {
    }

    @Override // X.InterfaceC1021210cgJ
    public void RO1(AbstractC1021310cgT abstractC1021310cgT) {
        C1021060cg4 c1021060cg4LIZ;
        C1023960ckk c1023960ckk;
        String str;
        C1012790cSj c1012790cSj;
        String str2;
        String aid;
        C1021300cgS c1021300cgS;
        AwemeRawAd awemeRawAd;
        boolean z = abstractC1021310cgT instanceof C1021300cgS;
        GMTBaseModel gMTBaseModelLIZ = null;
        AwemeRawAd awemeRawAd2 = null;
        if (z) {
            c1021060cg4LIZ = LIZ(((C1021300cgS) abstractC1021310cgT).LJI);
        } else {
            c1021060cg4LIZ = null;
        }
        C1014660cVk logger = Mh().getLogger();
        boolean z2 = abstractC1021310cgT instanceof C1021350cgX;
        if (z2) {
            c1023960ckk = C1021550cgr.LIZ;
        } else if (abstractC1021310cgT instanceof C1021370cgZ) {
            c1023960ckk = C1021580cgu.LIZ;
        } else if (abstractC1021310cgT instanceof C1021340cgW) {
            c1023960ckk = C1021520cgo.LIZ;
        } else if (z) {
            c1023960ckk = C1021330cgV.LIZ;
        } else if (abstractC1021310cgT instanceof C1021380cga) {
            c1023960ckk = C1021610cgx.LIZ;
        } else if (abstractC1021310cgT instanceof C1021360cgY) {
            c1023960ckk = C1021490cgl.LIZ;
        } else {
            throw new C1954807lC();
        }
        logger.logAd(c1023960ckk, new AwS595S0100000_16((Map) abstractC1021310cgT.LIZ, (Map<String, String>) 31));
        Aweme aweme = Mh().getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AwS630S0100000_16(awemeRawAd, 2);
            C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
        C1012790cSj c1012790cSj2 = this.LL;
        if (c1012790cSj2 != null) {
            C622680Oba.LIZLLL(c1012790cSj2);
        }
        String strLIZIZ = Mh().LIZIZ();
        if (z && (c1021300cgS = (C1021300cgS) abstractC1021310cgT) != null) {
            str = c1021300cgS.LJI;
        } else {
            str = null;
        }
        if (strLIZIZ != null && str != null) {
            Mh().getContext();
            c1012790cSj = new C1012790cSj(strLIZIZ, str);
        } else {
            c1012790cSj = null;
        }
        this.LL = c1012790cSj;
        if (z2) {
            str2 = "ai_agent_avatar";
        } else if (abstractC1021310cgT instanceof C1021370cgZ) {
            str2 = "ai_agent_reminder";
        } else if (abstractC1021310cgT instanceof C1021340cgW) {
            str2 = "ai_agent_ask_chain";
        } else if (z) {
            str2 = "ai_agent_question_hints";
        } else if (abstractC1021310cgT instanceof C1021380cga) {
            str2 = "ai_agent_sponsored";
        } else if (abstractC1021310cgT instanceof C1021360cgY) {
            str2 = "ai_agent_background";
        } else {
            throw new C1954807lC();
        }
        C1025520cnG c1025520cnG = new C1025520cnG(null, "ai_agent_feed_entrance", null, str2, "draw_ad", 94, null, null, 965);
        C1012790cSj c1012790cSj3 = this.LL;
        AwemeRawAd awemeRawAdLJJIJLIJ = null;
        ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
        if (iCRouterManager != null) {
            Context context = Mh().getContext();
            Aweme aweme2 = Mh().getAweme();
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            Aweme aweme3 = Mh().getAweme();
            Aweme aweme4 = Mh().getAweme();
            if (aweme4 != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme4);
            }
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
            if (iCRouterModelTransform != null) {
                Aweme aweme5 = Mh().getAweme();
                if (aweme5 != null) {
                    awemeRawAd2 = aweme5.getAwemeRawAd();
                }
                gMTBaseModelLIZ = iCRouterModelTransform.LIZ(awemeRawAd2);
            }
            CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(new C1025880cnq(context, aid, aweme3, awemeRawAdLJJIJLIJ, gMTBaseModelLIZ), c1025520cnG, c1021060cg4LIZ, true);
            if (cRouterManagerLIZLLL != null) {
                if (c1012790cSj3 != null) {
                    cRouterManagerLIZLLL.LJ(c1012790cSj3);
                }
                cRouterManagerLIZLLL.LJI();
            }
        }
    }
}
