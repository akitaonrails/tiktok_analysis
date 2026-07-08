package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XFL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.TokenBlobReader$onFailure$2", f = "TokenBlobReader.kt", l = {}, m = "invokeSuspend")
public final class C0XFL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C0XFZ, Unit> LL;
    public final /* synthetic */ C0XFN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFL(Function1<? super C0XFZ, Unit> function1, C0XFN c0xfn, String str, String str2, long j, InterfaceC1364105Vn<? super C0XFL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c0xfn;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TokenBlobReader@9e9f.onFailure$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(new C845560XFa(this.LLILLJJLI, 0, null, this.LLILLL, this.LLILZ, C2097908Jt.LIZJ(new Pair("read_from", "BlobStore")), 6));
        C0XFI.LIZJ(-1, this.LLILZIL, this.LLILLJJLI.getErrorCode(), this.LLILZ, this.LLILLJJLI.getErrorMsg());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TokenBlobReader@9e9f.onFailure$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
