package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthPipeline$proceed$2", f = "RelationAuthPipeline.kt", l = {43}, m = "invokeSuspend")
public final class C1071230dyz extends C09AX implements Function2<InterfaceC346701Wf<? super C1071240dz0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1071200dyw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071230dyz(C1071200dyw c1071200dyw, InterfaceC1364105Vn<? super C1071230dyz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1071200dyw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071230dyz c1071230dyz = new C1071230dyz(this.LLILLL, interfaceC1364105Vn);
        c1071230dyz.LLILLJJLI = obj;
        return c1071230dyz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RelationAuthPipeline@723a.proceed$2");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C1071240dz0 c1071240dz0LIZ = C1071240dz0.LIZ(this.LLILLL.LIZ.LIZIZ, EnumC1070220dxM.END);
            this.LL = 1;
            if (interfaceC346701Wf.emit(c1071240dz0LIZ, this) == objLJFF) {
                C1C7U.LIZIZ("RelationAuthPipeline@723a.proceed$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationAuthPipeline@723a.proceed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1071240dz0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
