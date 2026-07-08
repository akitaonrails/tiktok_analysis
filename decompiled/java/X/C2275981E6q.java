package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275981E6q extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ AnoleComponentModel LL;
    public final /* synthetic */ C1015290cWl LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AwemeRawAd LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275981E6q(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, int i, String str, String str2, AwemeRawAd awemeRawAd) {
        super(1);
        this.LL = anoleComponentModel;
        this.LLILLJJLI = c1015290cWl;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = awemeRawAd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2275911E6j.LIZ.getClass();
        c1023640ckE2.withParam(C2275911E6j.LIZJ, Long.valueOf(this.LL.getID()));
        c1023640ckE2.withParam(C2275911E6j.LIZLLL, this.LL.type);
        c1023640ckE2.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ(this.LL));
        c1023640ckE2.withParam(C2275911E6j.LJI, Integer.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C2275911E6j.LJIJI, this.LLILZ);
        c1023640ckE2.withParam(C2275911E6j.LJJIZ, this.LLILZIL);
        C1002190cBd c1002190cBd = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = this.LLILZLL;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = this.LL.type;
        c1015400cWw.getClass();
        c1023640ckE2.withParam(c1002190cBd, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE2.withParam(C2275911E6j.LJJJ, this.LL.containerType);
        return Unit.LIZ;
    }
}
