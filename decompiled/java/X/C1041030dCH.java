package X;

import android.webkit.WebBackForwardList;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041030dCH extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C1040740dBo LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ C238400w2 LLILZIL;
    public final /* synthetic */ WebBackForwardList LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ JSONObject LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041030dCH(C1040740dBo c1040740dBo, C238400w2 c238400w2, C238400w2 c238400w22, C238400w2 c238400w23, C238400w2 c238400w24, WebBackForwardList webBackForwardList, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str, JSONObject jSONObject) {
        super(1);
        this.LL = c1040740dBo;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c238400w22;
        this.LLILZ = c238400w23;
        this.LLILZIL = c238400w24;
        this.LLILZLL = webBackForwardList;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = str;
        this.LLJI = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1023640ckE c1023640ckE) {
        int size;
        List<LogItem> listLIZ;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2274351E0j.LIZ.getClass();
        c1023640ckE2.withParam(C2274351E0j.LJJIL, Long.valueOf(this.LL.LLILLL));
        c1023640ckE2.withParam(C2274351E0j.LJJJJLL, Long.valueOf(this.LL.LLILZIL));
        c1023640ckE2.withParam(C2274351E0j.LJJJLIIL, this.LL.LLJI);
        c1023640ckE2.withParam(C2274351E0j.LJJJJJL, this.LL.LLJI);
        c1023640ckE2.withParam(C2274351E0j.LJIJJ, Long.valueOf(this.LLILLJJLI.element));
        c1023640ckE2.withParam(C2274351E0j.LJJIJL, Long.valueOf(this.LLILLL.element));
        c1023640ckE2.withParam(C2274351E0j.LJJI, Long.valueOf(this.LLILZ.element));
        c1023640ckE2.withParam(C2274351E0j.LJJIZ, Long.valueOf(this.LLILZIL.element));
        c1023640ckE2.withParam(C2274351E0j.LJIIJJI, Long.valueOf(this.LL.LLJJIII));
        C1002190cBd c1002190cBd = C2274351E0j.LJIILL;
        WebBackForwardList webBackForwardList = this.LLILZLL;
        if (webBackForwardList != null) {
            size = webBackForwardList.getSize();
        } else {
            size = -1;
        }
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(size));
        c1023640ckE2.withParam(C2274351E0j.LJJJJZ, this.LLIZ.element);
        c1023640ckE2.withParam(C2274351E0j.LJJL, this.LLIZLLLIL.element);
        c1023640ckE2.withParam(C2274351E0j.LJII, Long.valueOf(this.LL.LLJJIJIL));
        c1023640ckE2.withParam(C2274351E0j.LJIIIIZZ, "iab");
        c1023640ckE2.withParam(C2274351E0j.LJJJI, this.LLJ);
        C1002190cBd c1002190cBd2 = C2274351E0j.LJJIIJZLJL;
        float currentOffset = this.LL.LL.getCurrentOffset();
        C844470XAv.LIZ.getClass();
        c1023640ckE2.withParam(c1002190cBd2, Double.valueOf(currentOffset / C12ES.LJIIIIZZ(C844470XAv.LIZ())));
        c1023640ckE2.withParam(C2274351E0j.LJIL, Long.valueOf(this.LL.LL.getWebLoadStatusModel().loadingStatus));
        c1023640ckE2.withParam(C2274351E0j.LJIIIZ, Long.valueOf(this.LL.LL.getAllClickCount()));
        c1023640ckE2.withParam(C2274351E0j.LJIILLIIL, Long.valueOf(this.LL.LL.getAllScrollCount()));
        C1002190cBd c1002190cBd3 = C2274351E0j.LJJII;
        Gson gson = C7740030o.LIZ().getGson();
        C1039460d9k c1039460d9k = this.LL.LLJJL;
        if (c1039460d9k != null) {
            listLIZ = c1039460d9k.LIZ();
        } else {
            listLIZ = null;
        }
        c1023640ckE2.withParam(c1002190cBd3, GsonProtectorUtils.toJson(gson, listLIZ));
        c1023640ckE2.withParam(C2274351E0j.LJLJJL, C786410Ut5.J3(this.LLJI));
        return Unit.LIZ;
    }
}
