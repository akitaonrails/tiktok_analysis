package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373360lqI extends C09AY implements Function1<C1373350lqH, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ List<String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373360lqI(String str, List<String> list, String str2, List<String> list2, String str3, List<String> list3, String str4, List<String> list4, String str5, List<String> list5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = str2;
        this.LLILZ = list2;
        this.LLILZIL = str3;
        this.LLILZLL = list3;
        this.LLIZ = str4;
        this.LLIZLLLIL = list4;
        this.LLJ = str5;
        this.LLJI = list5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1373350lqH c1373350lqH) {
        C1373350lqH c1373350lqH2 = c1373350lqH;
        String str = this.LL;
        List<String> list = this.LLILLJJLI;
        c1373350lqH2.getClass();
        c1373350lqH2.LIZ = new C1373370lqJ(str, list);
        c1373350lqH2.LIZIZ = new C1373370lqJ(this.LLILLL, this.LLILZ);
        c1373350lqH2.LIZJ(this.LLILZIL, this.LLILZLL);
        c1373350lqH2.LIZIZ(this.LLIZ, this.LLIZLLLIL);
        c1373350lqH2.LIZ(this.LLJ, this.LLJI);
        return Unit.LIZ;
    }
}
