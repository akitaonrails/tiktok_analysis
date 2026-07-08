package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ACy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175701ACy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1ACD LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175701ACy(int i, long j, C2344009Gk c2344009Gk, C1ACD c1acd, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = c1acd;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZJ(-1, "guest_cnt");
        this.LL.LJFF("multi_layout_key", "empty");
        C1AC8 c1ac8 = C1AC8.LIZ;
        String str = this.LLILLJJLI;
        C2344009Gk c2344009Gk = this.LL;
        C1ACD c1acd = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        String str4 = this.LLILZLL;
        long j = this.LLIZ;
        int i = this.LLIZLLLIL;
        c1ac8.getClass();
        C1AC8.LJIIJ(i, j, c2344009Gk, c1acd, str, str2, str3, str4);
        return Unit.LIZ;
    }
}
