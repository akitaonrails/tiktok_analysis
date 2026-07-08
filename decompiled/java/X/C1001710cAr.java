package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001710cAr extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1035880d3y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001710cAr(boolean z, String str, String str2, C1035880d3y c1035880d3y) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1035880d3y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String strLIZIZ;
        String str;
        String creativeIdStr;
        AwemeRawAd awemeRawAd;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        c1023640ckE2.withParam(C1042690dEx.LJJJJI, "prefetchHTMLRedirect");
        C1002190cBd c1002190cBd = C1042690dEx.LJJJJJL;
        if (this.LL) {
            strLIZIZ = "success";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail-");
            sbLIZ.append(this.LLILLJJLI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c1023640ckE2.withParam(c1002190cBd, strLIZIZ);
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJLI;
        if (this.LL) {
            str = this.LLILLJJLI;
        } else {
            str = "";
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        c1023640ckE2.withParam(C1042690dEx.LJJJZ, "intercept");
        c1023640ckE2.withParam(C1042690dEx.LJJL, this.LLILLL);
        C1002190cBd c1002190cBd3 = C1042690dEx.LJJJLL;
        C1035880d3y c1035880d3y = this.LLILZ;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        c1023640ckE2.withParam(c1002190cBd3, creativeIdStr);
        return Unit.LIZ;
    }
}
