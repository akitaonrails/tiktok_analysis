package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275931E6l extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ AnoleComponentModel LL;
    public final /* synthetic */ C1015290cWl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ AwemeRawAd LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275931E6l(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, Integer num3, String str7, String str8, AwemeRawAd awemeRawAd) {
        super(1);
        this.LL = anoleComponentModel;
        this.LLILLJJLI = c1015290cWl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = num;
        this.LLIZ = num2;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = num3;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = awemeRawAd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        Long lValueOf;
        Long lValueOf2;
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2275911E6j.LIZ.getClass();
        c1023640ckE2.withParam(C2275911E6j.LIZJ, Long.valueOf(this.LL.getID()));
        c1023640ckE2.withParam(C2275911E6j.LIZLLL, this.LL.type);
        c1023640ckE2.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ(this.LL));
        c1023640ckE2.withParam(C2275911E6j.LJIIJ, this.LLILLL);
        c1023640ckE2.withParam(C2275911E6j.LJIIIZ, this.LLILZ);
        c1023640ckE2.withParam(C2275911E6j.LJIIJJI, this.LLILZIL);
        C1002190cBd c1002190cBd = C2275911E6j.LJIIL;
        Long lValueOf3 = null;
        if (this.LLILZLL != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE2.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C2275911E6j.LJIILIIL;
        if (this.LLIZ != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        } else {
            lValueOf2 = null;
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf2);
        c1023640ckE2.withParam(C2275911E6j.LJIILJJIL, this.LLIZLLLIL);
        c1023640ckE2.withParam(C2275911E6j.LJIILL, this.LLJ);
        c1023640ckE2.withParam(C2275911E6j.LJIILLIIL, this.LLJI);
        C1002190cBd c1002190cBd3 = C2275911E6j.LJIIZILJ;
        if (this.LLJIJIL != null) {
            lValueOf3 = Long.valueOf(r0.intValue());
        }
        c1023640ckE2.withParam(c1002190cBd3, lValueOf3);
        c1023640ckE2.withParam(C2275911E6j.LJIJI, this.LLJILJIL);
        c1023640ckE2.withParam(C2275911E6j.LJJIZ, this.LLJILJILJ);
        C1002190cBd c1002190cBd4 = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = this.LLJILLL;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = this.LL.type;
        c1015400cWw.getClass();
        c1023640ckE2.withParam(c1002190cBd4, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE2.withParam(C2275911E6j.LJJJ, this.LL.containerType);
        return Unit.LIZ;
    }
}
