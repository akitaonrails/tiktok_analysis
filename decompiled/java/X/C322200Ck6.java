package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ck6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskDeduplicationManager$waitForActiveRequest$2", f = "TaskDeduplicationManager.kt", l = {220}, m = "invokeSuspend")
public final class C322200Ck6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC20178613xQ>, Object> {
    public int LL;
    public final /* synthetic */ C20180513xj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322200Ck6(C20180513xj c20180513xj, InterfaceC1364105Vn<? super C322200Ck6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20180513xj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322200Ck6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskDeduplicationManager@cfac.waitForActiveRequest$2");
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
            C05XL<AbstractC20178613xQ> c05xl = this.LLILLJJLI.LIZ;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskDeduplicationManager@cfac.waitForActiveRequest$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskDeduplicationManager@cfac.waitForActiveRequest$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC20178613xQ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
