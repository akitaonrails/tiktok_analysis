package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249141D1k extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function1<C1023640ckE, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2249141D1k(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, Function1<? super C1023640ckE, Unit> function1) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        c1023640ckE2.withContext(this.LL);
        C2249131D1j.LIZ.getClass();
        c1023640ckE2.withParam(C2249131D1j.LJIIIIZZ, this.LLILLJJLI);
        c1023640ckE2.withParam(C2249131D1j.LJ, this.LLILLL);
        c1023640ckE2.withParam(C2249131D1j.LJIIJ, this.LLILZ);
        c1023640ckE2.withParam(C2249131D1j.LJIIIZ, this.LLILZIL);
        c1023640ckE2.withParam(C2249131D1j.LJIIL, this.LLILZLL);
        c1023640ckE2.withParam(C2249131D1j.LJIILJJIL, this.LLIZ);
        this.LLIZLLLIL.invoke(c1023640ckE2);
        return Unit.LIZ;
    }
}
