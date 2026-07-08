package X;

import com.bytedance.im.core.proto.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetch$2$1", f = "DefaultRemoteFetcher.kt", l = {199}, m = "invokeSuspend")
public final class C864740Xw8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0YI6 LLILLJJLI;
    public final /* synthetic */ C0YCX LLILLL;
    public final /* synthetic */ C05XL<Response> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864740Xw8(C0YI6 c0yi6, C0YCX c0ycx, C05XL<Response> c05xl, InterfaceC1364105Vn<? super C864740Xw8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yi6;
        this.LLILLL = c0ycx;
        this.LLILZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864740Xw8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetch$2$1");
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
            this.LLILLJJLI.LLILLL.LJ(this.LLILLL, "ws retry fail");
            C0YI6 c0yi6 = this.LLILLJJLI;
            C0YCX c0ycx = this.LLILLL;
            this.LL = 1;
            obj = c0yi6.LIZ(c0ycx, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetch$2$1");
                return objLJFF;
            }
        }
        if (this.LLILZ.LJIIZILJ(((C864760XwA) obj).LIZ)) {
            this.LLILLL.LJII = false;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetch$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
