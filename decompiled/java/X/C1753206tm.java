package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.mob.IMBusinessQuickReplyAnalyticsDelegate$reportQuickReplyPanelPerf$1", f = "IMBusinessQuickReplyAnalyticsDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1753206tm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ C1753306tn LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753206tm(Long l, C1753306tn c1753306tn, boolean z, Integer num, String str, InterfaceC1364105Vn<? super C1753206tm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l;
        this.LLILLJJLI = c1753306tn;
        this.LLILLL = z;
        this.LLILZ = num;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1753206tm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessQuickReplyAnalyticsDelegate@f133.reportQuickReplyPanelPerf$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = this.LL;
        C1753306tn c1753306tn = this.LLILLJJLI;
        boolean z = this.LLILLL;
        Integer num = this.LLILZ;
        String str = this.LLILZIL;
        linkedHashMap.put("total_duration", String.valueOf(l));
        linkedHashMap.put("hit_cache", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(c1753306tn.LIZ))));
        linkedHashMap.put("has_data", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(z))));
        if (num != null) {
            linkedHashMap.put("error_code", num.toString());
        }
        if (str != null) {
            linkedHashMap.put("log_id", str);
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_b2c_quick_reply_perf", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessQuickReplyAnalyticsDelegate@f133.reportQuickReplyPanelPerf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
