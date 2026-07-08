package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01ML, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DataGate$select$1", f = "DataGate.kt", l = {}, m = "invokeSuspend")
public final class C01ML extends C09AX implements InterfaceC1631630sYr<Object, Object, Object, InterfaceC1364105Vn<? super C443120HZe<Object, Object, Object>>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C01ML(InterfaceC1364105Vn<? super C01ML> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataGate@5bb5.select$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = new C443120HZe(this.LL, this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("DataGate@5bb5.select$1");
        return c443120HZe;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, InterfaceC1364105Vn<? super C443120HZe<Object, Object, Object>> interfaceC1364105Vn) {
        C01ML c01ml = new C01ML(interfaceC1364105Vn);
        c01ml.LL = obj;
        c01ml.LLILLJJLI = obj2;
        c01ml.LLILLL = obj3;
        return c01ml.invokeSuspend(Unit.LIZ);
    }
}
