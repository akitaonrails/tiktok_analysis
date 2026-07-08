package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XFK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.TokenBlobReader$onSuccess$2", f = "TokenBlobReader.kt", l = {}, m = "invokeSuspend")
public final class C0XFK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C0XFZ, Unit> LL;
    public final /* synthetic */ C0XFZ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C0XFN LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFK(Function1<? super C0XFZ, Unit> function1, C0XFZ c0xfz, int i, String str, long j, C0XFN c0xfn, InterfaceC1364105Vn<? super C0XFK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c0xfz;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = c0xfn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TokenBlobReader@9e9f.onSuccess$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        C0XFI.LIZJ(this.LLILLL, this.LLILZIL, this.LLILZLL.getErrorCode(), this.LLILZ, this.LLILZLL.getErrorMsg());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TokenBlobReader@9e9f.onSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
