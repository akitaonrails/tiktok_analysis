package X;

import com.bytedance.im.core.proto.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetch$2", f = "DefaultRemoteFetcher.kt", l = {}, m = "invokeSuspend")
public final class C864730Xw7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YI6 LLILLJJLI;
    public final /* synthetic */ C0YCX LLILLL;
    public final /* synthetic */ C05XL<Response> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864730Xw7(C0YI6 c0yi6, C0YCX c0ycx, C05XL<Response> c05xl, InterfaceC1364105Vn<? super C864730Xw7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yi6;
        this.LLILLL = c0ycx;
        this.LLILZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C864730Xw7 c864730Xw7 = new C864730Xw7(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c864730Xw7.LL = obj;
        return c864730Xw7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetch$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C864740Xw8(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetch$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
