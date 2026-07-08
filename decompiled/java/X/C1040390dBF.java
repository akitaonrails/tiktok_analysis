package X;

import com.ss.android.ugc.aweme.web.business.special.service.AdAutofillAIInfoApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040390dBF extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040390dBF(C238400w2 c238400w2, long j, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, long j2) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = j;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1040410dBH.LIZ.getClass();
        C1002190cBd c1002190cBd = C1040410dBH.LIZIZ;
        AdAutofillAIInfoApi.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("https://");
        sbLIZ2.append(C844470XAv.LJIIIIZZ.LIZ);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append("/api/ad/iab/autofill/v1/");
        c1023640ckE2.withParam(c1002190cBd, C2188811AlT.LIZIZ(sbLIZ));
        c1023640ckE2.withParam(C1040410dBH.LIZJ, "AI_AUTOFILL");
        c1023640ckE2.withParam(C1040410dBH.LIZLLL, Long.valueOf(this.LL.element));
        c1023640ckE2.withParam(C1040410dBH.LJ, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1040410dBH.LJFF, this.LLILLL.element);
        c1023640ckE2.withParam(C1040410dBH.LJI, this.LLILZ.element);
        c1023640ckE2.withParam(C1040410dBH.LJII, C1040110dAn.LLILZIL.LIZJ(this.LLILZIL));
        return Unit.LIZ;
    }
}
