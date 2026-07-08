package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthPipeline$proceed$1", f = "RelationAuthPipeline.kt", l = {}, m = "invokeSuspend")
public final class C448401oo extends C09AX implements Function2<InterfaceC346701Wf<? super C1071240dz0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C448401oo(InterfaceC1364105Vn<? super C448401oo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448401oo(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RelationAuthPipeline@723a.proceed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationAuthPipeline@723a.proceed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1071240dz0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C448401oo(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
