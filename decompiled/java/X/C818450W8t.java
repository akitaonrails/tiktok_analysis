package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0W8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818450W8t extends C09AY implements Function1<OutreachFlowReportItem, Boolean> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Map<String, Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C818450W8t(Map map, List list, long j) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(OutreachFlowReportItem outreachFlowReportItem) {
        String str;
        OutreachFlowReportItem outreachFlowReportItem2 = outreachFlowReportItem;
        List<String> list = this.LL;
        OutreachInfo outreachInfo = outreachFlowReportItem2.outreachInfo;
        if (outreachInfo != null) {
            str = outreachInfo.outreachKey;
        } else {
            str = null;
        }
        if (!C13LP.LJJJJ(str, list)) {
            return Boolean.TRUE;
        }
        if (C818420W8q.LIZ(outreachFlowReportItem2.showReportInfo) > this.LLILLJJLI) {
            C051W.LIZ(this.LLILLL, "exposure", 1, C823790WTh.LL);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
