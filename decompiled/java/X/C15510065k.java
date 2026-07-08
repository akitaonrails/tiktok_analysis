package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActivityStatusCompensationExternalDataSourceImpl$updateActivityStatusInner$1", f = "ActivityStatusCompensationExternalDataSourceImpl.kt", l = {169}, m = "invokeSuspend")
public final class C15510065k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15511065l LLILLJJLI;
    public final /* synthetic */ List<C0NXK> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15510065k(C15511065l c15511065l, List<C0NXK> list, InterfaceC1364105Vn<? super C15510065k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15511065l;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15510065k(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.updateActivityStatusInner$1");
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
            C05YC<List<C0NXK>> c05yc = this.LLILLJJLI.LLILZ;
            List<C0NXK> list = this.LLILLL;
            this.LL = 1;
            if (c05yc.emit(list, this) == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.updateActivityStatusInner$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.updateActivityStatusInner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
