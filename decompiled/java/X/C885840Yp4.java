package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMConvLoadAnalytics$reportPerfEvent$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C885840Yp4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885840Yp4(C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C885840Yp4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885840Yp4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJIILJJIL;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        String strValueOf;
        long j6;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        C1C7U.LIZ("IMConvLoadAnalytics@9541.reportPerfEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            iLJIILJJIL = abstractC883730YlfLJ.LJIILJJIL();
        } else {
            iLJIILJJIL = 0;
        }
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        Pair[] pairArr = new Pair[15];
        c885830Yp3.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) C885830Yp3.LLILLJJLI;
        Long l = (Long) linkedHashMap.get("refresh_end");
        long jLongValue7 = 0;
        if (l != null) {
            long jLongValue8 = l.longValue();
            Long l2 = (Long) linkedHashMap.get("refresh_start");
            if (l2 != null) {
                jLongValue6 = l2.longValue();
            } else {
                jLongValue6 = 0;
            }
            j = jLongValue8 - jLongValue6;
        } else {
            j = 0;
        }
        pairArr[0] = new Pair("refresh_duration", String.valueOf(j));
        Long l3 = (Long) linkedHashMap.get("received_dm_data");
        if (l3 != null) {
            long jLongValue9 = l3.longValue();
            Long l4 = (Long) linkedHashMap.get("click_inbox_tab_first_time");
            if (l4 != null) {
                jLongValue5 = l4.longValue();
            } else {
                jLongValue5 = 0;
            }
            j2 = jLongValue9 - jLongValue5;
        } else {
            j2 = 0;
        }
        pairArr[1] = new Pair("receive_data_duration", String.valueOf(j2));
        Long l5 = (Long) linkedHashMap.get("submit_data");
        if (l5 != null) {
            long jLongValue10 = l5.longValue();
            Long l6 = (Long) linkedHashMap.get("click_inbox_tab_first_time");
            if (l6 != null) {
                jLongValue4 = l6.longValue();
            } else {
                jLongValue4 = 0;
            }
            j3 = jLongValue10 - jLongValue4;
        } else {
            j3 = 0;
        }
        pairArr[2] = new Pair("submit_data_duration", String.valueOf(j3));
        Long l7 = (Long) linkedHashMap.get("first_dm_item_attach");
        if (l7 != null) {
            long jLongValue11 = l7.longValue();
            Long l8 = (Long) linkedHashMap.get("click_inbox_tab_first_time");
            if (l8 != null) {
                jLongValue3 = l8.longValue();
            } else {
                jLongValue3 = 0;
            }
            j4 = jLongValue11 - jLongValue3;
        } else {
            j4 = 0;
        }
        pairArr[3] = new Pair("first_item_attach_duration", String.valueOf(j4));
        Long l9 = (Long) linkedHashMap.get("first_item_show");
        if (l9 != null) {
            long jLongValue12 = l9.longValue();
            Long l10 = (Long) linkedHashMap.get("click_inbox_tab_first_time");
            if (l10 != null) {
                jLongValue2 = l10.longValue();
            } else {
                jLongValue2 = 0;
            }
            j5 = jLongValue12 - jLongValue2;
        } else {
            j5 = 0;
        }
        pairArr[4] = new Pair("first_item_show_duration", String.valueOf(j5));
        if (C885830Yp3.LIZIZ("fast_load")) {
            strValueOf = String.valueOf(C885830Yp3.LLJ);
        } else {
            strValueOf = "-1";
        }
        pairArr[5] = new Pair("fast_load_conv_size", strValueOf);
        pairArr[6] = new Pair("total_conv_size", String.valueOf(C885830Yp3.LLJI));
        Long l11 = (Long) linkedHashMap.get("on_node_show");
        if (l11 != null) {
            long jLongValue13 = l11.longValue();
            Long l12 = (Long) linkedHashMap.get("click_inbox_tab_first_time");
            if (l12 != null) {
                jLongValue = l12.longValue();
            } else {
                jLongValue = 0;
            }
            j6 = jLongValue13 - jLongValue;
        } else {
            j6 = 0;
        }
        pairArr[7] = new Pair("inbox_show_duration", String.valueOf(j6));
        pairArr[8] = new Pair("has_conv_cache_inbox_first_click", String.valueOf(false));
        Long l13 = (Long) linkedHashMap.get("received_notice_data");
        if (l13 != null) {
            long jLongValue14 = l13.longValue();
            Long l14 = (Long) linkedHashMap.get("received_dm_data");
            if (l14 != null) {
                jLongValue7 = l14.longValue();
            }
            jLongValue7 = jLongValue14 - jLongValue7;
        }
        pairArr[9] = new Pair("interval_between_notice_and_dm_data", String.valueOf(jLongValue7));
        pairArr[10] = new Pair("interval_snapshot_conversation", this.LL.element);
        pairArr[11] = new Pair("is_first_attach_snapshot", C885830Yp3.LLJJI);
        pairArr[12] = new Pair("account_type", C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        pairArr[13] = new Pair("unread_cnt", String.valueOf(C885830Yp3.LLJJIII));
        pairArr[14] = new Pair("cur_page_unread_cnt", String.valueOf(iLJIILJJIL));
        C885830Yp3.LJFF(c885830Yp3, "im_conv_list_perf", C2097608Jq.LJIIIIZZ(pairArr), null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMConvLoadAnalytics@9541.reportPerfEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
