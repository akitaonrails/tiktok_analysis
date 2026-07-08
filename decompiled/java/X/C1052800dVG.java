package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052800dVG extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1035880d3y LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052800dVG(String str, boolean z, String str2, String str3, long j, C1035880d3y c1035880d3y, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = j;
        this.LLILZLL = c1035880d3y;
        this.LLIZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        String webUrl;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1E1Y.LIZ.getClass();
        c1023640ckE2.withParam(C1E1Y.LJFF, this.LL);
        C1002190cBd c1002190cBd = C1E1Y.LJ;
        if (this.LLILLJJLI) {
            str = "success";
        } else {
            str = "fail";
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        c1023640ckE2.withParam(C1E1Y.LIZLLL, this.LLILLL);
        c1023640ckE2.withParam(C1E1Y.LIZIZ, this.LLILZ);
        c1023640ckE2.withParam(C1E1Y.LIZJ, Long.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C1E1Y.LJJIIZ, this.LLILZLL.getCurrentUrl());
        C1002190cBd c1002190cBd2 = C1E1Y.LJJIJL;
        AwemeRawAd awemeRawAd = this.LLILZLL.getAwemeRawAd();
        if (awemeRawAd != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, webUrl);
        c1023640ckE2.withParam(C1E1Y.LJJJJ, this.LLIZ);
        return Unit.LIZ;
    }
}
