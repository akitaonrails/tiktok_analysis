package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.08gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.AIGCArchUnifiedTaskObserver$getRefCount$2", f = "AIGCArchUnifiedTaskObserver.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C2180808gY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2180908gZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180808gY(InterfaceC2180908gZ interfaceC2180908gZ, InterfaceC1364105Vn<? super C2180808gY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2180908gZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2180808gY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchUnifiedTaskObserver@6bb9.getRefCount$2");
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
            InterfaceC2180908gZ interfaceC2180908gZ = this.LLILLJJLI;
            this.LL = 1;
            if (interfaceC2180908gZ.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("AIGCArchUnifiedTaskObserver@6bb9.getRefCount$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCArchUnifiedTaskObserver@6bb9.getRefCount$2");
        return unit;
    }
}
