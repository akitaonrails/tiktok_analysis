package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.webcontainer.hybrid.PnShybridKitBuilder$triggerPreload$1", f = "PnShybridKitBuilder.kt", l = {}, m = "invokeSuspend")
public final class C1594506Md extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1594706Mf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594506Md(C1594706Mf c1594706Mf, InterfaceC1364105Vn<? super C1594506Md> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1594706Mf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1594506Md(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        SparkContext sparkContext;
        C1C7U.LIZ("PnShybridKitBuilder@5ad8.triggerPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (sparkContext = this.LL.LIZ) != null) {
            C1541950qED.LIZJ.getClass();
            new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PnShybridKitBuilder@5ad8.triggerPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
