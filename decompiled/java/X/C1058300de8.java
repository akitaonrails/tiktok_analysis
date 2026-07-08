package X;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0de8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058300de8 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1042410dEV LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058300de8(String str, String str2, String str3, C1042410dEV c1042410dEV, String str4, String str5, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c1042410dEV;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2274561E1e.LIZ.getClass();
        c1023640ckE2.withParam(C2274561E1e.LJIIL, this.LL);
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2274561E1e.LJIIJJI, this.LLILLL);
        c1023640ckE2.withParam(C2274561E1e.LJIIIZ, this.LLILZ.LJ);
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJ, this.LLILZIL);
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJJI, Long.valueOf(this.LLILZ.LJI));
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJILLIZJL, Long.valueOf(this.LLILZ.LJIIJ));
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJJIZ, this.LLILZ.LJIIIIZZ);
        c1023640ckE2.withParam(C2274561E1e.LJJIJIL, this.LLILZ.LIZJ);
        c1023640ckE2.withParam(C2274561E1e.LJ, this.LLILZLL.toUpperCase(Locale.ROOT));
        c1023640ckE2.withParam(C2274561E1e.LJFF, "native");
        c1023640ckE2.withParam(C2274561E1e.LIZJ, Long.valueOf(this.LLIZ));
        c1023640ckE2.withParam(C2274561E1e.LIZLLL, Boolean.valueOf(this.LLILZ.LJFF.isLoadFinish()));
        Boolean bool = this.LLILZ.LJIIIZ;
        if (bool != null) {
            c1023640ckE2.withParam(C2274561E1e.LIZIZ, bool);
        }
        return Unit.LIZ;
    }
}
