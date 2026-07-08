package X;

import com.bytedance.android.livesdk.api.revenue.strategy.guide.TriggerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01JQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JQ extends C09AY implements InterfaceC1631620sYq<Long, List<? extends String>, String, Unit> {
    public final /* synthetic */ C01JP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JQ(C01JP c01jp) {
        super(3);
        this.LL = c01jp;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, List<? extends String> list, String str) {
        long jLongValue;
        long jLongValue2 = l.longValue();
        List<? extends String> list2 = list;
        String str2 = str;
        C01JP c01jp = this.LL;
        if (c01jp.LJ) {
            C20441214yg.LJIIIZ("ScaleTriggerManager", "dispatchResult blocked: isAnchor=true, skip large_scale trigger request");
        } else {
            C206400qs c206400qs = TriggerApi.LIZ;
            long j = c01jp.LIZIZ;
            Function0<Long> function0 = c01jp.LIZLLL;
            if (function0 != null) {
                jLongValue = function0.invoke().longValue();
            } else {
                jLongValue = 0;
            }
            String strLIZ = C203600qQ.LIZ();
            c206400qs.getClass();
            C206400qs.LIZIZ(j, list2, "client_large_scale_trigger", jLongValue, strLIZ, str2, "guide_tech", null, null);
        }
        this.LL.LIZ(jLongValue2);
        return Unit.LIZ;
    }
}
