package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiportrait.AiPortraitContentDataSource", f = "AiPortraitContentDataSource.kt", l = {86}, m = "paginate")
public final class C535150Kyn extends AbstractC23140094w {
    public Object LL;
    public Function0 LLILLJJLI;
    public Function2 LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C535140Kym LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535150Kyn(C535140Kym c535140Kym, InterfaceC1364105Vn<? super C535150Kyn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c535140Kym;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiPortraitContentDataSource@8386.paginate$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZLLLIL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("AiPortraitContentDataSource@8386.paginate$1");
        return objLIZJ;
    }
}
