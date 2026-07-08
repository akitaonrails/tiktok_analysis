package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0OHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DataGate$select$$inlined$combine$1$3", f = "DataGate.kt", l = {238}, m = "invokeSuspend")
public final class C616910OHp extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C616900OHo<Object, Object, Object, Object>>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C616910OHp(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C616900OHo<Object, Object, Object, Object>> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C616910OHp c616910OHp = new C616910OHp(interfaceC1364105Vn);
        c616910OHp.LLILLJJLI = interfaceC346701Wf;
        c616910OHp.LLILLL = objArr;
        return c616910OHp.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataGate@5bb5.select$$inlined$combine$1$3");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            C616900OHo c616900OHo = new C616900OHo(objArr[0], objArr[1], objArr[2], objArr[3]);
            this.LL = 1;
            if (interfaceC346701Wf.emit(c616900OHo, this) == objLJFF) {
                C1C7U.LIZIZ("DataGate@5bb5.select$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DataGate@5bb5.select$$inlined$combine$1$3");
        return unit;
    }
}
