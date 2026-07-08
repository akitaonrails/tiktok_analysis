package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XFS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.OneTapLoginTokenApi$Companion$getCachedTokenInfoHelper$1$3", f = "OneTapLoginTokenApi.kt", l = {}, m = "invokeSuspend")
public final class C0XFS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<C0XFZ, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFS(boolean z, String str, boolean z2, long j, Function1<? super C0XFZ, Unit> function1, String str2, InterfaceC1364105Vn<? super C0XFS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = j;
        this.LLILZIL = function1;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneTapLoginTokenApi$Companion@5ea4.getCachedTokenInfoHelper$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        C0XFN c0xfn = C0XFN.TIMEOUT_ERROR;
        C0XFT.LIZIZ(z, 0, str, z2, jCurrentTimeMillis, c0xfn.getErrorCode(), "timeout querying content resolver", null);
        this.LLILZIL.invoke(new C845560XFa(c0xfn, 0, null, this.LLILZLL, this.LLILLJJLI, null, 38));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneTapLoginTokenApi$Companion@5ea4.getCachedTokenInfoHelper$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
