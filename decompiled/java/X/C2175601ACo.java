package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1ACo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175601ACo extends C09AY implements Function2<Integer, String, Unit> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1ACD LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175601ACo(int i, long j, C2344009Gk c2344009Gk, C1ACD c1acd, String str, String str2, String str3, String str4) {
        super(2);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = c1acd;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        this.LL.LIZJ(num.intValue(), "guest_cnt");
        this.LL.LJFF("multi_layout_key", str);
        C1AC8 c1ac8 = C1AC8.LIZ;
        String str2 = this.LLILLJJLI;
        C2344009Gk c2344009Gk = this.LL;
        C1ACD c1acd = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        long j = this.LLIZ;
        int i = this.LLIZLLLIL;
        c1ac8.getClass();
        C1AC8.LJIIJ(i, j, c2344009Gk, c1acd, str2, str3, str4, str5);
        return Unit.LIZ;
    }
}
