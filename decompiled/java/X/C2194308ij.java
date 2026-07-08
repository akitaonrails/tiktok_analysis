package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler$handleResponse$1$1", f = "ECAPIInterceptorNetworkHandler.kt", l = {169}, m = "invokeSuspend")
public final class C2194308ij extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0XM9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ byte[] LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ List<C080U> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194308ij(C0XM9 c0xm9, String str, String str2, byte[] bArr, Object obj, List<C080U> list, InterfaceC1364105Vn<? super C2194308ij> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0xm9;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = bArr;
        this.LLILZLL = obj;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194308ij(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAPIInterceptorNetworkHandler@853.handleResponse$1$1");
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
            C1507430pKX c1507430pKX = C1507430pKX.LIZ;
            C0XM9 c0xm9 = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            byte[] bArr = this.LLILZIL;
            Object obj2 = this.LLILZLL;
            List<C080U> list = this.LLIZ;
            this.LL = 1;
            if (c1507430pKX.LIZ(c0xm9, str, str2, bArr, obj2, list, this) == objLJFF) {
                C1C7U.LIZIZ("ECAPIInterceptorNetworkHandler@853.handleResponse$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAPIInterceptorNetworkHandler@853.handleResponse$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
