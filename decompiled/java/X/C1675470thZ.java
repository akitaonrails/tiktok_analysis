package X;

import com.ss.android.ugc.aweme.model.PurchaseOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0thZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675470thZ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1322480kWE<PurchaseOption> LL;
    public final /* synthetic */ C19871212ow<String, String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ PurchaseOption LLILZ;
    public final /* synthetic */ C1614390s73 LLILZIL;
    public final /* synthetic */ Function1<PurchaseOption, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1675470thZ(C1322480kWE<PurchaseOption> c1322480kWE, C19871212ow<String, String> c19871212ow, boolean z, PurchaseOption purchaseOption, C1614390s73 c1614390s73, Function1<? super PurchaseOption, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Integer num, int i) {
        super(2);
        this.LL = c1322480kWE;
        this.LLILLJJLI = c19871212ow;
        this.LLILLL = z;
        this.LLILZ = purchaseOption;
        this.LLILZIL = c1614390s73;
        this.LLILZLL = function1;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = num;
        this.LLJI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1675460thY.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1));
        return Unit.LIZ;
    }
}
