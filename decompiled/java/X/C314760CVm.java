package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.InboxUnreadCountMonitor$tryInitCheckTask$1", f = "InboxUnreadCountMonitor.kt", l = {95}, m = "invokeSuspend")
public final class C314760CVm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C314760CVm(InterfaceC1364105Vn<? super C314760CVm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314760CVm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxUnreadCountMonitor@26e4.tryInitCheckTask$1");
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
            AnonymousClass0956 anonymousClass0956 = C0ZAG.LJ;
            if (anonymousClass0956 != null) {
                this.LL = 1;
                if (C23118094a.LIZLLL(anonymousClass0956, this) == objLJFF) {
                    C1C7U.LIZIZ("InboxUnreadCountMonitor@26e4.tryInitCheckTask$1");
                    return objLJFF;
                }
            }
        }
        C0ZAG.LIZ.getClass();
        C0ZAG.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0ZB2(null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxUnreadCountMonitor@26e4.tryInitCheckTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C314760CVm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
