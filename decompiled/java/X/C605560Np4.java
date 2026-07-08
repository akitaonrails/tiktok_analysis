package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Np4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler$submit$1$job$1$cancelMonitor$1", f = "TaskScheduler.kt", l = {112}, m = "invokeSuspend")
public final class C605560Np4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<Boolean> LLILLJJLI;
    public final /* synthetic */ C605550Np3 LLILLL;
    public final /* synthetic */ AbstractC605390Non LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605560Np4(InterfaceC346201Wa<Boolean> interfaceC346201Wa, C605550Np3 c605550Np3, AbstractC605390Non abstractC605390Non, InterfaceC1364105Vn<? super C605560Np4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c605550Np3;
        this.LLILZ = abstractC605390Non;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605560Np4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC605580Np6 value;
        C1C7U.LIZ("TaskScheduler@5940.submit$1$job$1$cancelMonitor$1");
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
            C638950P4j c638950P4j = new C638950P4j(this.LLILLJJLI, 4);
            this.LL = 1;
            if (C09IC.LJIIZILJ(c638950P4j, this) == objLJFF) {
                C1C7U.LIZIZ("TaskScheduler@5940.submit$1$job$1$cancelMonitor$1");
                return objLJFF;
            }
        }
        C605550Np3 c605550Np3 = this.LLILLL;
        String str = this.LLILZ.LIZ;
        InterfaceC332260D0u<EnumC605580Np6> interfaceC332260D0u = c605550Np3.LJI.get(str);
        if (interfaceC332260D0u != null && (value = interfaceC332260D0u.getValue()) != null) {
            if (value.isTerminal()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BBArch [Scheduler] cancel ignored (already ");
                sbLIZ.append(value.name());
                sbLIZ.append("): ");
                sbLIZ.append(str);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                c605550Np3.LJ(str, EnumC605580Np6.CANCELLED, null);
                C09AE c09ae = c605550Np3.LJII.get(str);
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BBArch [Scheduler] cancelled: ");
                sbLIZ2.append(str);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskScheduler@5940.submit$1$job$1$cancelMonitor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
