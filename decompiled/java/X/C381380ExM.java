package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ExM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCombineEffectTask$execute$1", f = "TemplateCombineEffectTask.kt", l = {82}, m = "invokeSuspend")
public final class C381380ExM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C381370ExL LLILLJJLI;
    public final /* synthetic */ C0FQS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381380ExM(C381370ExL c381370ExL, C0FQS c0fqs, InterfaceC1364105Vn<? super C381380ExM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c381370ExL;
        this.LLILLL = c0fqs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381380ExM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateCombineEffectTask@4869.execute$1");
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
            C381370ExL c381370ExL = this.LLILLJJLI;
            C0FQS c0fqs = this.LLILLL;
            List<C381340ExI> list = c0fqs.LJIL;
            this.LL = 1;
            if (c381370ExL.LJJIJ(c0fqs, list, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateCombineEffectTask@4869.execute$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCombineEffectTask@4869.execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
