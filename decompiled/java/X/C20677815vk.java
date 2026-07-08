package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20677815vk implements Serializable {
    public static final C20677915vl Companion = new Object() { // from class: X.15vl
    };
    public static final C20677815vk instance = new C20677815vk(new ConcurrentHashMap());
    public final ConcurrentHashMap<String, OutreachFlowReportItem> LL;

    public C20677815vk() {
        this(new ConcurrentHashMap());
    }

    public final void clearRecords() {
        this.LL.clear();
    }

    public final Map<String, OutreachFlowReportItem> getCacheRecords() {
        return C2097608Jq.LJIIZILJ(this.LL);
    }

    public C20677815vk(ConcurrentHashMap<String, OutreachFlowReportItem> concurrentHashMap) {
        this.LL = concurrentHashMap;
    }

    public final OutreachFlowReportItem getOrCreateRecord(String str) {
        OutreachFlowReportItem outreachFlowReportItem = this.LL.get(str);
        if (outreachFlowReportItem != null) {
            return outreachFlowReportItem;
        }
        OutreachFlowReportItem outreachFlowReportItem2 = new OutreachFlowReportItem(null, null, null, null, null, new ArrayList());
        this.LL.put(str, outreachFlowReportItem2);
        return outreachFlowReportItem2;
    }

    public final boolean removeRecord(String str) {
        if (str == null || !this.LL.containsKey(str)) {
            return false;
        }
        this.LL.remove(str);
        return true;
    }

    public final void putRecord(String str, OutreachFlowReportItem outreachFlowReportItem) {
        this.LL.put(str, outreachFlowReportItem);
    }
}
