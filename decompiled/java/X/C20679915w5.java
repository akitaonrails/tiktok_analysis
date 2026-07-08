package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15w5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20679915w5 implements Serializable {
    public static final C20680415wA Companion = new Object() { // from class: X.15wA
    };
    public static final C20679915w5 instance = new C20679915w5(new LinkedHashMap());
    public final Map<C20646415qg, OutreachFlowReportItem> LL;

    public C20679915w5() {
        this(new LinkedHashMap());
    }

    public final Map<C20646415qg, OutreachFlowReportItem> getCache() {
        return this.LL;
    }

    public C20679915w5(Map<C20646415qg, OutreachFlowReportItem> map) {
        this.LL = map;
    }

    public final OutreachFlowReportItem getOrCreateRecord(C20646415qg c20646415qg) {
        OutreachFlowReportItem outreachFlowReportItem = this.LL.get(c20646415qg);
        if (outreachFlowReportItem != null) {
            return outreachFlowReportItem;
        }
        OutreachFlowReportItem outreachFlowReportItem2 = new OutreachFlowReportItem(null, null, null, null, null, new ArrayList());
        this.LL.put(c20646415qg, outreachFlowReportItem2);
        return outreachFlowReportItem2;
    }

    public final OutreachFlowReportItem getRecord(C20646415qg c20646415qg) {
        return this.LL.get(c20646415qg);
    }

    public final boolean removeRecord(C20646415qg c20646415qg) {
        if (c20646415qg == null || !this.LL.containsKey(c20646415qg)) {
            return false;
        }
        this.LL.remove(c20646415qg);
        return true;
    }
}
