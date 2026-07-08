package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tikcast.api.anchor.GetHostContainerSchemaResponse;

/* JADX INFO: renamed from: X.0Te9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.SchemaConfigCacheManager$requestSchemaConfig$1", f = "SchemaConfigCacheManager.kt", l = {102, 105}, m = "invokeSuspend")
public final class C751670Te9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C751670Te9(InterfaceC1364105Vn<? super C751670Te9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751670Te9(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            LiveCenterApi liveCenterApiLIZLLL = C01QD.LIZ().LIZLLL();
            this.LL = 1;
            obj = liveCenterApiLIZLLL.getSchemaConfig(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1");
                return objLJFF;
            }
        }
        GetHostContainerSchemaResponse.Data data = (GetHostContainerSchemaResponse.Data) ((C470590Icr) obj).data;
        if (data != null) {
            str = data.liveCenterSchema;
        } else {
            str = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C751660Te8 c751660Te8 = new C751660Te8(str, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c751660Te8) == objLJFF) {
            C1C7U.LIZIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C751670Te9(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
