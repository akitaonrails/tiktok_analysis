package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249151D1l extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLILLJJLI = "video";
    public final /* synthetic */ String LLILZIL = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249151D1l(Aweme aweme, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.LL = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = l;
        this.LLJI = str6;
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
        c1023640ckE2.withParam(C2249131D1j.LJIJ, this.LLIZLLLIL);
        c1023640ckE2.withParam(C2249131D1j.LJIJJ, this.LLJ);
        c1023640ckE2.withParam(C2249131D1j.LJIIZILJ, this.LLJI);
        return Unit.LIZ;
    }
}
