package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378420lyS extends C09AY implements Function1<C1378400lyQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378420lyS(String str, String str2, String str3, String str4, String str5, Map map, boolean z, boolean z2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378400lyQ c1378400lyQ) {
        C1378400lyQ c1378400lyQ2 = c1378400lyQ;
        c1378400lyQ2.LIZIZ = this.LL;
        c1378400lyQ2.LIZJ = this.LLILLJJLI;
        c1378400lyQ2.LIZLLL = this.LLILLL;
        c1378400lyQ2.LJ = this.LLILZ;
        c1378400lyQ2.LJI = this.LLILZIL;
        c1378400lyQ2.LJII = this.LLILZLL;
        c1378400lyQ2.LJIIIIZZ = this.LLIZ;
        c1378400lyQ2.LJFF = this.LLIZLLLIL;
        return Unit.LIZ;
    }
}
