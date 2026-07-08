package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZB3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.InboxUnreadCountMonitorV2$tryReportEvent$1", f = "InboxUnreadCountMonitorV2.kt", l = {64}, m = "invokeSuspend")
public final class C0ZB3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZB3(String str, boolean z, InterfaceC1364105Vn<? super C0ZB3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZB3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        boolean z;
        Pair<Pair<FilterTabType, Set<EnumC880480YgQ>>, List<C890610Ywl>> pairLLJLL;
        boolean z2;
        int i;
        int iIntValue;
        Integer num;
        int iIntValue2;
        int i2;
        int iIntValue3;
        int iIntValue4;
        C1C7U.LIZ("InboxUnreadCountMonitorV2@f32b.tryReportEvent$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C01GW c01gw = C0AP5.LIZ;
            if (C08A4.LIZIZ(Long.valueOf(((Number) c01gw.getValue()).longValue()))) {
                jLongValue = ((Number) c01gw.getValue()).longValue();
            } else {
                jLongValue = 1500;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("InboxUnreadCountMonitorV2@f32b.tryReportEvent$1");
                return objLJFF;
            }
        }
        C0ZAH c0zah = C0ZAH.LIZ;
        String str = this.LLILLJJLI;
        boolean z3 = this.LLILLL;
        synchronized (c0zah) {
            if (((Number) C279960AyA.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i4 = C2187451AjH.LIZ;
                C0ZA8 c0za8 = C0ZAH.LIZJ;
                if (c0za8 != null && (pairLLJLL = c0za8.LLJLL()) != null) {
                    Pair pairLIZ = C0ZAH.LIZ(pairLLJLL);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("calcUnreadCountCheckResult end, errorEventList.size = ");
                    sbLIZ.append(((List) pairLIZ.getSecond()).size());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C0ZB5 c0zb5 = (C0ZB5) pairLIZ.getFirst();
                    if (c0zb5 != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        Integer num2 = c0zb5.LIZIZ;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        c2344009Gk.LIZJ(iIntValue2, "is_identical");
                        if (z3) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c2344009Gk.LIZJ(i2, "is_cold_start");
                        c2344009Gk.LJFF("refresh_type", str);
                        Integer num3 = c0zb5.LIZJ;
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        c2344009Gk.LIZJ(iIntValue3, "diff_type");
                        Integer num4 = c0zb5.LIZLLL;
                        if (num4 != null) {
                            iIntValue4 = num4.intValue();
                        } else {
                            iIntValue4 = 0;
                        }
                        c2344009Gk.LIZJ(iIntValue4, "show_type");
                        c2344009Gk.LIZJ(c0zb5.LJ, "tab_unread_count");
                        c2344009Gk.LIZJ(c0zb5.LJFF, "cell_unread_count");
                        C20684815ws.LJIILLIIL("inbox_unread_count_identical_v2", c2344009Gk.LIZ);
                    }
                    if (((Number) C0AP4.LIZ.getValue()).intValue() != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        for (C0ZB5 c0zb52 : (Iterable) pairLIZ.getSecond()) {
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJ(c0zb52.LIZ, "error_filter_group");
                            if (z3) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            c2344009Gk2.LIZJ(i, "is_cold_start");
                            c2344009Gk2.LJFF("refresh_type", str);
                            C0ZB5 c0zb53 = (C0ZB5) pairLIZ.getFirst();
                            if (c0zb53 != null && (num = c0zb53.LIZLLL) != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            c2344009Gk2.LIZJ(iIntValue, "show_type");
                            c2344009Gk2.LJ(c0zb52.LIZJ, "diff_type");
                            c2344009Gk2.LIZJ(c0zb52.LJ, "tab_unread_count");
                            c2344009Gk2.LIZJ(c0zb52.LJFF, "cell_unread_count");
                            c2344009Gk2.LJ(c0zb52.LJI, "entrance_id");
                            c2344009Gk2.LJFF("entrance_key", c0zb52.LJII);
                            C20684815ws.LJIILLIIL("inbox_unread_count_identical_v2_detail", c2344009Gk2.LIZ);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxUnreadCountMonitorV2@f32b.tryReportEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
