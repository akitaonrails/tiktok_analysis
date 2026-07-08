package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAICustomInfo;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONException;

/* JADX INFO: renamed from: X.14St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20269314St implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final Aweme LL;
    public final TakoAICustomInfo LLILLJJLI;

    public C20269314St(Aweme aweme, TakoAICustomInfo takoAICustomInfo) {
        this.LL = aweme;
        this.LLILLJJLI = takoAICustomInfo;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) throws JSONException {
        String aid;
        TakoAICustomInfo takoAICustomInfo;
        String imprId;
        List<TakoAITemplates> list;
        TakoAITemplates takoAITemplates;
        Integer num;
        List<TakoAITemplates> list2;
        TakoAITemplates takoAITemplates2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        Activity activityLIZ;
        TakoAITemplates takoAITemplates3;
        Integer num2;
        LogPbBean logPbBean;
        VideoItemParams videoItemParams2 = videoItemParams;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Aweme aweme = this.LL;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme aweme2 = this.LL;
        Integer numValueOf = null;
        if (aweme2 != null) {
            numValueOf = Integer.valueOf(aweme2.getAwemeType());
        }
        String strValueOf = String.valueOf(numValueOf);
        Aweme aweme3 = this.LL;
        if ((aweme3 != null && (logPbBean = aweme3.getLogPbBean()) != null && (imprId = logPbBean.getImprId()) != null) || ((takoAICustomInfo = this.LLILLJJLI) != null && (imprId = takoAICustomInfo.imprId) != null)) {
            str = imprId;
        }
        c1862330yYx.mobTikbotEntranceClick("homepage_hot_tikbot", "bottom_button_generate", aid, strValueOf, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        TakoAICustomInfo takoAICustomInfo2 = this.LLILLJJLI;
        AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(this, videoItemParams2, 63);
        int iIntValue = 1;
        if (takoAICustomInfo2 != null && (list = takoAICustomInfo2.aiTemplates) != null && (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) != null && (num = takoAITemplates.imgCnt) != null && num.intValue() > 0 && (list2 = takoAICustomInfo2.aiTemplates) != null && (takoAITemplates2 = (TakoAITemplates) C13LP.LJJJLL(list2)) != null && !takoAITemplates2.LIZIZ() && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null && (activityLIZ = C1388190mED.LIZ(contextLJIIIIZZ)) != null) {
            List<TakoAITemplates> list3 = takoAICustomInfo2.aiTemplates;
            if (list3 != null && (takoAITemplates3 = (TakoAITemplates) C13LP.LJJJLL(list3)) != null && (num2 = takoAITemplates3.imgCnt) != null) {
                iIntValue = num2.intValue();
            }
            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(awS396S0200000_30, 550);
            C1561230qjJ.LIZ.getClass();
            if (C1561230qjJ.LIZ()) {
                C14TF.LIZIZ.LJJJLZIJ(iIntValue, activityLIZ, null, null, awS606S0100000_27, false, false);
            } else {
                C14TF.LIZIZ.LJJLI(iIntValue, activityLIZ, awS606S0100000_27);
            }
        } else {
            awS396S0200000_30.invoke(null);
        }
        return new C1387205bq(null);
    }
}
