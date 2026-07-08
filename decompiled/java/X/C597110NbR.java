package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$_coldStartUpdateFlow$1", f = "GroupSearchContentUpdateEngine.kt", l = {103}, m = "invokeSuspend")
public final class C597110NbR extends C09AX implements Function2<InterfaceC346701Wf<? super C597130NbT>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C597110NbR(InterfaceC1364105Vn<? super C597110NbR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597110NbR c597110NbR = new C597110NbR(interfaceC1364105Vn);
        c597110NbR.LLILLJJLI = obj;
        return c597110NbR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9._coldStartUpdateFlow$1");
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
            C597130NbT c597130NbT = new C597130NbT(EnumC597140NbU.LLILLL, C13BV.INSTANCE);
            this.LL = 1;
            if (interfaceC346701Wf.emit(c597130NbT, this) == objLJFF) {
                C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9._coldStartUpdateFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9._coldStartUpdateFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C597130NbT> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
