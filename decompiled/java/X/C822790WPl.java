package X;

import com.ss.android.ugc.aweme.frequency.model.DetectBehavior;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822790WPl extends C09AY implements Function1<OutreachFlowReportItem, Boolean> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ List<DetectBehavior> LLILLL;
    public final /* synthetic */ Map<String, Integer> LLILZ;
    public final /* synthetic */ Map<String, Integer> LLILZIL;
    public final /* synthetic */ C822810WPn LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ Function1<Map<String, Integer>, Boolean> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C822790WPl(List list, long j, List list2, Map map, Map map2, C822810WPn c822810WPn, C013C c013c, AwS222S0300000_13 awS222S0300000_13) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = list2;
        this.LLILZ = map;
        this.LLILZIL = map2;
        this.LLILZLL = c822810WPn;
        this.LLIZ = c013c;
        this.LLIZLLLIL = awS222S0300000_13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(OutreachFlowReportItem outreachFlowReportItem) {
        String str;
        OutreachFlowReportItem outreachFlowReportItem2 = outreachFlowReportItem;
        List<String> list = this.LL;
        OutreachInfo outreachInfo = outreachFlowReportItem2.outreachInfo;
        DetectBehavior detectBehavior = null;
        if (outreachInfo != null) {
            str = outreachInfo.outreachKey;
        } else {
            str = null;
        }
        if (!C13LP.LJJJJ(str, list)) {
            return Boolean.TRUE;
        }
        if (C818420W8q.LIZ(outreachFlowReportItem2.showReportInfo) > this.LLILLJJLI) {
            Iterator<DetectBehavior> it2 = this.LLILLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DetectBehavior next = it2.next();
                if (next.detect(outreachFlowReportItem2.clickReportInfo)) {
                    detectBehavior = next;
                    break;
                }
            }
            DetectBehavior detectBehavior2 = detectBehavior;
            if (detectBehavior2 != null) {
                if (Intrinsics.LJFF(detectBehavior2.mode, "total")) {
                    C051W.LIZ(this.LLILZ, detectBehavior2.type, 1, C823770WTf.LL);
                } else if (Intrinsics.LJFF(detectBehavior2.mode, "continue")) {
                    C051W.LIZ(this.LLILZIL, detectBehavior2.type, 1, C823780WTg.LL);
                }
            } else {
                this.LLILZIL.clear();
            }
            InterfaceC822750WPh interfaceC822750WPh = this.LLILZLL.LIZLLL;
            if (interfaceC822750WPh != null && interfaceC822750WPh.getLogger() != null) {
                new AwS246S0300000_2(this.LLILZLL, (C822810WPn) this.LLILZ, this.LLILZIL, (Map<String, Integer>) 31);
            }
            this.LLIZ.element = this.LLIZLLLIL.invoke(this.LLILZIL).booleanValue();
            return Boolean.valueOf(!this.LLIZ.element);
        }
        return Boolean.FALSE;
    }
}
