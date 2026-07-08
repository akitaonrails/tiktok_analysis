package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Yp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMConvLoadAnalytics$notifyBindForPosition$1$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C885870Yp7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C885870Yp7(InterfaceC1364105Vn<? super C885870Yp7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885870Yp7(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        Integer num;
        C1C7U.LIZ("IMConvLoadAnalytics@9541.notifyBindForPosition$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        synchronized (c885830Yp3) {
            C885830Yp3.LJ(c885830Yp3, "report_aligned_perf_event", null, 6);
            Map<Integer, Integer> value = C1336205Ku.LIZ(false).getImInitializeService().LIZJ().getValue();
            if (value != null && (num = value.get(0)) != null && num.intValue() == 3) {
                z = false;
            } else {
                z = true;
            }
            Pair[] pairArr = new Pair[3];
            Map<String, Long> map = C885830Yp3.LLILLJJLI;
            Long l = (Long) ((LinkedHashMap) map).get("report_aligned_perf_event");
            long jLongValue = 0;
            if (l != null) {
                long jLongValue2 = l.longValue();
                Long l2 = (Long) ((LinkedHashMap) map).get("click_inbox_tab_first_time");
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                jLongValue = jLongValue2 - jLongValue;
            }
            pairArr[0] = new Pair("duration", String.valueOf(jLongValue));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[1] = new Pair("is_first_login", str);
            pairArr[2] = new Pair("cold_launch_landing", "");
            C885830Yp3.LJFF(c885830Yp3, "im_inbox_interactive_time", C2097608Jq.LJIIIIZZ(pairArr), null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMConvLoadAnalytics@9541.notifyBindForPosition$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C885870Yp7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
