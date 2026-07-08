package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Te8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.SchemaConfigCacheManager$requestSchemaConfig$1$1", f = "SchemaConfigCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C751660Te8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751660Te8(String str, InterfaceC1364105Vn<? super C751660Te8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751660Te8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str != null && str.length() != 0) {
            String str2 = this.LL;
            C741920T8k.LIZ = str2;
            InterfaceC772190UQv.n4.LIZLLL(str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SchemaConfigCacheManager@14ca.requestSchemaConfig$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
