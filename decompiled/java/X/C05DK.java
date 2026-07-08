package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$executeGeneration$3", f = "TextImageForwardResolver.kt", l = {}, m = "invokeSuspend")
public final class C05DK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C572410Mch, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C572380Mce LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05DK(Function1<? super C572410Mch, Unit> function1, String str, C572380Mce c572380Mce, String str2, String str3, InterfaceC1364105Vn<? super C05DK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = str;
        this.LLILLL = c572380Mce;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextImageForwardResolver@7aa9.executeGeneration$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<C572410Mch, Unit> function1 = this.LL;
        String str = this.LLILLJJLI;
        C572380Mce c572380Mce = this.LLILLL;
        function1.invoke(new C572410Mch(str, c572380Mce.LIZIZ, c572380Mce.LIZJ, this.LLILZ, this.LLILZIL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextImageForwardResolver@7aa9.executeGeneration$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
