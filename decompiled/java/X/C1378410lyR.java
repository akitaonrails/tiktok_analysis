package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378410lyR extends C09AY implements Function1<C1378400lyQ, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378410lyR(C19EG c19eg, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, Map<String, String> map, Long l, boolean z3, boolean z4) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = map;
        this.LLJI = l;
        this.LLJIJIL = z3;
        this.LLJILJIL = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378400lyQ c1378400lyQ) {
        C1378400lyQ c1378400lyQ2 = c1378400lyQ;
        c1378400lyQ2.LIZ = this.LL;
        c1378400lyQ2.LIZIZ = this.LLILLJJLI;
        c1378400lyQ2.LIZJ = this.LLILLL;
        c1378400lyQ2.LIZLLL = this.LLILZ;
        c1378400lyQ2.LJ = this.LLILZIL;
        c1378400lyQ2.LJI = this.LLILZLL;
        c1378400lyQ2.LJII = this.LLIZ;
        c1378400lyQ2.LJIIIIZZ = this.LLIZLLLIL;
        c1378400lyQ2.LJFF = this.LLJ;
        c1378400lyQ2.LJIIJJI = this.LLJI;
        c1378400lyQ2.LJIIL = this.LLJIJIL;
        c1378400lyQ2.LJIIJ = this.LLJILJIL;
        return Unit.LIZ;
    }
}
