package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskExecutor$executeTask$result$1", f = "TaskExecutor.kt", l = {73}, m = "invokeSuspend")
public final class C1409060mls extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC20178613xQ>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1420120n3i LLILLJJLI;
    public final /* synthetic */ Map<String, AbstractC20178613xQ> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1409060mls(AbstractC1420120n3i abstractC1420120n3i, Map<String, ? extends AbstractC20178613xQ> map, InterfaceC1364105Vn<? super C1409060mls> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1420120n3i;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409060mls(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExecutor@b82a.executeTask$result$1");
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
            AbstractC1420120n3i abstractC1420120n3i = this.LLILLJJLI;
            Map<String, AbstractC20178613xQ> map = this.LLILLL;
            this.LL = 1;
            obj = abstractC1420120n3i.LIZIZ(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskExecutor@b82a.executeTask$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskExecutor@b82a.executeTask$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC20178613xQ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
