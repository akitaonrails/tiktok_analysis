package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZB2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.InboxUnreadCountMonitor$tryReportEvent$1", f = "InboxUnreadCountMonitor.kt", l = {100}, m = "invokeSuspend")
public final class C0ZB2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0ZB2(InterfaceC1364105Vn<? super C0ZB2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZB2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair<Pair<FilterTabType, Set<EnumC880480YgQ>>, List<C890610Ywl>> pairLLJLL;
        C1C7U.LIZ("InboxUnreadCountMonitor@26e4.tryReportEvent$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("InboxUnreadCountMonitor@26e4.tryReportEvent$1");
                return objLJFF;
            }
        }
        synchronized (C0ZAG.LIZ) {
            if (C0BMK.LIZ() && !C0ZAG.LIZIZ && C0ZAG.LIZJ && C0ZAG.LIZLLL) {
                int i2 = C2187451AjH.LIZ;
                C0ZA8 c0za8 = C0ZAG.LJFF;
                if (c0za8 != null && (pairLLJLL = c0za8.LLJLL()) != null) {
                    C0ZAG.LIZ(pairLLJLL);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("calcUnreadCountCheckResult end, errorEventList.size = ");
                    CopyOnWriteArrayList<C0ZB4> copyOnWriteArrayList = C0ZAG.LJI;
                    sbLIZ.append(copyOnWriteArrayList.size());
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!copyOnWriteArrayList.isEmpty()) {
                        C0ZAG.LIZIZ = true;
                        for (C0ZB4 c0zb4 : copyOnWriteArrayList) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZJ(c0zb4.LIZ, "error_filter_group");
                            c2344009Gk.LIZJ(c0zb4.LIZIZ, "show_type");
                            c2344009Gk.LIZJ(c0zb4.LIZJ, "tab_unread_count");
                            c2344009Gk.LIZJ(c0zb4.LIZLLL, "cell_unread_count");
                            c2344009Gk.LJ(c0zb4.LJ, "entrance_id");
                            c2344009Gk.LJFF("entrance_key", c0zb4.LJFF);
                            c2344009Gk.LJ(c0zb4.LJI, "isDM");
                            c2344009Gk.LJ(c0zb4.LJII, "isCreator");
                            c2344009Gk.LJFF("filter_group_type", c0zb4.LJIIIIZZ);
                            C20684815ws.LJIILLIIL("inbox_unread_count_error", c2344009Gk.LIZ);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxUnreadCountMonitor@26e4.tryReportEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ZB2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
