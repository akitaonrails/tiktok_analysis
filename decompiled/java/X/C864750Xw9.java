package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetchByHttp$resultItem$1", f = "DefaultRemoteFetcher.kt", l = {369}, m = "invokeSuspend")
public final class C864750Xw9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C864760XwA>, Object> {
    public int LL;
    public final /* synthetic */ C0YI6 LLILLJJLI;
    public final /* synthetic */ C0YCX LLILLL;
    public final /* synthetic */ C0YIS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864750Xw9(C0YI6 c0yi6, C0YCX c0ycx, C0YIS c0yis, InterfaceC1364105Vn<? super C864750Xw9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yi6;
        this.LLILLL = c0ycx;
        this.LLILZ = c0yis;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864750Xw9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C0Y8K {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetchByHttp$resultItem$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0YI6 c0yi6 = this.LLILLJJLI;
            C0YCX c0ycx = this.LLILLL;
            C0YIS c0yis = this.LLILZ;
            this.LL = 1;
            obj = c0yi6.LIZLLL(c0ycx, c0yis, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetchByHttp$resultItem$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetchByHttp$resultItem$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C864760XwA> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
