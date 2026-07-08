package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.LegacyTaskBridgeInterceptor$intercept$3", f = "LegacyTaskBridgeInterceptor.kt", l = {45}, m = "invokeSuspend")
public final class C345320DgI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C345340DgK LLILLJJLI;
    public final /* synthetic */ C525700KjY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345320DgI(C345340DgK c345340DgK, C525700KjY c525700KjY, InterfaceC1364105Vn<? super C345320DgI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c345340DgK;
        this.LLILLL = c525700KjY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345320DgI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LegacyTaskBridgeInterceptor@278c.intercept$3");
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
            C345340DgK c345340DgK = this.LLILLJJLI;
            InterfaceC345200Dg6 interfaceC345200Dg6 = c345340DgK.LL;
            C1DRG c1drg = c345340DgK.LLILLL;
            Intent intent = this.LLILLL.LJ;
            this.LL = 1;
            if (interfaceC345200Dg6.LIZJ(c1drg, intent, this) == objLJFF) {
                C1C7U.LIZIZ("LegacyTaskBridgeInterceptor@278c.intercept$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyTaskBridgeInterceptor@278c.intercept$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
