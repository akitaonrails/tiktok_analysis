package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.preload.IMImagePreloader$preloadImage$1", f = "IMImagePreloader.kt", l = {139}, m = "invokeSuspend")
public final class C1336640kt4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1336630kt3 LLILLJJLI;
    public final /* synthetic */ C048000Fi LLILLL;
    public final /* synthetic */ InterfaceC1320200kSY<Void> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336640kt4(C1336630kt3 c1336630kt3, C048000Fi c048000Fi, InterfaceC1320200kSY<Void> interfaceC1320200kSY, InterfaceC1364105Vn<? super C1336640kt4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1336630kt3;
        this.LLILLL = c048000Fi;
        this.LLILZ = interfaceC1320200kSY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336640kt4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMImagePreloader@b523.preloadImage$1");
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
            long j = this.LLILLJJLI.LIZ.LIZIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMImagePreloader@b523.preloadImage$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZJ.containsKey(this.LLILLL.LIZ)) {
            this.LLILZ.close();
            this.LLILLJJLI.LJJIIJ(this.LLILLL.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImagePreloader@b523.preloadImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
