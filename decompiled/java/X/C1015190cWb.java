package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.PlayableData;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015190cWb extends AbstractC1015210cWd {
    public long LLILLL = -1;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        AwemeRawAd awemeRawAd;
        boolean z;
        C1013990cUf c1013990cUf;
        Aweme aweme;
        String aid;
        PlayableData playableData;
        Integer num;
        PlayableData playableData2;
        String str;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        SparkContext.Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null) {
            C1035880d3y c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class);
            if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null) {
                awemeRawAd = (AwemeRawAd) c1537480q70LIZIZ.LJFF(AwemeRawAd.class);
            }
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd != null && (playableData2 = awemeRawAd.getPlayableData()) != null && (str = playableData2.playableUrl) != null && C123100dR.LIZ(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C2382909Vj.LIZ(completionBlock, 0, "no playable ad", null, 4);
            return;
        }
        if (awemeRawAd != null && (playableData = awemeRawAd.getPlayableData()) != null && (num = playableData.disableWebConvert) != null && num.intValue() == 1) {
            C2382909Vj.LIZ(completionBlock, 0, "advertiser btn is disable", null, 4);
            return;
        }
        if (c1537480q70LIZIZ != null && (c1013990cUf = (C1013990cUf) c1537480q70LIZIZ.LJFF(C1013990cUf.class)) != null && c1013990cUf.LIZ) {
            if (C1017180cZo.LJIILL(awemeRawAd) && !Intrinsics.LJFF(c1013990cUf.LIZJ, Boolean.TRUE)) {
                C2382909Vj.LIZ(completionBlock, 0, "no in clear mode", null, 4);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLILLL < 1000) {
                C2382909Vj.LIZ(completionBlock, 0, "call too frequent", null, 4);
                return;
            }
            this.LLILLL = jCurrentTimeMillis;
            C1035880d3y c1035880d3y2 = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class);
            if ((c1035880d3y2 == null || (aid = c1035880d3y2.getAwemeId()) == null) && ((aweme = (Aweme) c1537480q70LIZIZ.LJFF(Aweme.class)) == null || (aid = aweme.getAid()) == null)) {
                aid = "";
            }
            C1440005kM.LIZ(new C991890bv1(aid, new C1005320cGg(1, C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 90), new Pair(EnumC1005330cGh.REFER.getRName(), "playable_download_button"), new Pair(EnumC1005330cGh.TAG.getRName(), "playable_ad"), new Pair(EnumC1005330cGh.REPORT_CLICK.getRName(), Boolean.TRUE)))));
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, C13LE.LIZ(InterfaceC1015230cWf.class)), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "no viewable", null, 4);
    }
}
