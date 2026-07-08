package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303340k1M extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1303440k1W LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLILLL;
    public final /* synthetic */ C05P0<String> LLILZ;
    public final /* synthetic */ C1690080u58 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C05P0<C09AE> LLIZ;
    public final /* synthetic */ Function2<String, Integer, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1303340k1M(C1303440k1W c1303440k1W, InterfaceC497601wk interfaceC497601wk, C05P0<EnumC994870bzp> c05p0, C05P0<String> c05p02, C1690080u58 c1690080u58, int i, C05P0<C09AE> c05p03, Function2<? super String, ? super Integer, Unit> function2) {
        super(0);
        this.LL = c1303440k1W;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
        this.LLILZIL = c1690080u58;
        this.LLILZLL = i;
        this.LLIZ = c05p03;
        this.LLIZLLLIL = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LLILLL.setValue(EnumC994870bzp.SHOW);
        if (this.LL.LIZIZ <= 0) {
            this.LLILZ.setValue("click_page_guide");
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C05TU(this.LLILZIL, this.LLILZLL, null), 3);
        }
        C1667120tU6.LJFF(this.LLILLJJLI, this.LLIZ, this.LLIZLLLIL, this.LLILLL);
        return Unit.LIZ;
    }
}
