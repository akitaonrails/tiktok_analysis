package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popup.dynamic.spark.FeedPopupSparkManager$loadInternal$1$1", f = "FeedPopupSparkManager.kt", l = {237}, m = "invokeSuspend")
public final class C1303550k1h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20644815qQ LLILLJJLI;
    public final /* synthetic */ InterfaceC20646115qd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303550k1h(C20644815qQ c20644815qQ, InterfaceC20646115qd interfaceC20646115qd, InterfaceC1364105Vn<? super C1303550k1h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20644815qQ;
        this.LLILLL = interfaceC20646115qd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303550k1h(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedPopupSparkManager@3661.loadInternal$1$1");
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
            long j = this.LLILLJJLI.LIZ.triggerTimeout;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FeedPopupSparkManager@3661.loadInternal$1$1");
                return objLJFF;
            }
        }
        C20644815qQ.LIZ(this.LLILLJJLI, this.LLILLL, "spark_time_out", true, 16);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedPopupSparkManager@3661.loadInternal$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
