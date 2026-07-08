package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275951E6n extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ AnoleComponentModel LL;
    public final /* synthetic */ C1015290cWl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ AwemeRawAd LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275951E6n(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, String str, String str2, String str3, boolean z, Long l, String str4, long j, String str5, AwemeRawAd awemeRawAd) {
        super(1);
        this.LL = anoleComponentModel;
        this.LLILLJJLI = c1015290cWl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = l;
        this.LLIZLLLIL = str4;
        this.LLJ = j;
        this.LLJI = str5;
        this.LLJIJIL = awemeRawAd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        Long lValueOf;
        String str;
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2275911E6j.LIZ.getClass();
        c1023640ckE2.withParam(C2275911E6j.LIZJ, Long.valueOf(this.LL.getID()));
        c1023640ckE2.withParam(C2275911E6j.LIZLLL, this.LL.type);
        c1023640ckE2.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ(this.LL));
        c1023640ckE2.withParam(C2275911E6j.LJIJI, this.LLILLL);
        c1023640ckE2.withParam(C2275911E6j.LJJIZ, this.LLILZ);
        C1002190cBd c1002190cBd = C2275911E6j.LJIJJ;
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015450cX1.getClass();
        Long lValueOf2 = null;
        if (C1015450cX1.LJIIIZ(anoleComponentModel) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C2275911E6j.LJIJJLI;
        if (C1015450cX1.LIZJ(this.LL) != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf2);
        c1023640ckE2.withParam(C2275911E6j.LJJ, this.LLILZIL);
        C1002190cBd c1002190cBd3 = C2275911E6j.LJIIJ;
        if (this.LLILZLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd3, str);
        c1023640ckE2.withParam(C2275911E6j.LJJIIJZLJL, this.LLIZ);
        c1023640ckE2.withParam(C2275911E6j.LJJIIZI, this.LLIZLLLIL);
        c1023640ckE2.withParam(C2275911E6j.LJJIJ, this.LL.prerenderFailedStrategy);
        c1023640ckE2.withParam(C2275911E6j.LJJIJIIJI, Long.valueOf(this.LLJ));
        c1023640ckE2.withParam(C2275911E6j.LJIILL, this.LLJI);
        C1002190cBd c1002190cBd4 = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = this.LLJIJIL;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str2 = this.LL.type;
        c1015400cWw.getClass();
        c1023640ckE2.withParam(c1002190cBd4, C1015400cWw.LIZ(string, str2).isFallBackRendering);
        c1023640ckE2.withParam(C2275911E6j.LJJJ, this.LL.containerType);
        return Unit.LIZ;
    }
}
