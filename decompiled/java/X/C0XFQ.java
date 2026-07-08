package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.OneTapLoginTokenApi$Companion$getCachedTokenInfoHelper$1$4", f = "OneTapLoginTokenApi.kt", l = {}, m = "invokeSuspend")
public final class C0XFQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<C0XFZ, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFQ(boolean z, String str, boolean z2, long j, Function1<? super C0XFZ, Unit> function1, String str2, Boolean bool, InterfaceC1364105Vn<? super C0XFQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = j;
        this.LLILZIL = function1;
        this.LLILZLL = str2;
        this.LLIZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneTapLoginTokenApi$Companion@5ea4.getCachedTokenInfoHelper$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        C0XFN c0xfn = C0XFN.INTERNAL_ERROR;
        C0XFT.LIZIZ(z, 0, str, z2, jCurrentTimeMillis, c0xfn.getErrorCode(), "error querying content resolver", null);
        this.LLILZIL.invoke(new C845560XFa(c0xfn, 0, null, this.LLILZLL, this.LLILLJJLI, C2097608Jq.LJIIIIZZ(new Pair("has_tt_login", this.LLIZ), new Pair("tt_launch_ahead", null), new Pair("is_redirected_back_from_tiktok", Boolean.valueOf(this.LLILLL)), new Pair("m_device_id", null)), 6));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneTapLoginTokenApi$Companion@5ea4.getCachedTokenInfoHelper$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
