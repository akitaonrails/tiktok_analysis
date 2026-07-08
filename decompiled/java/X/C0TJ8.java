package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0TJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJ8 {
    public HashSet<String> LIZ;
    public volatile HashSet<String> LIZIZ;
    public volatile List<String> LIZJ;

    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            if (C086I.LIZIZ(null)) {
                this.LIZIZ.clear();
            } else {
                this.LIZIZ.removeAll(null);
            }
        }
        C1238740iLA.LIZJ("follow_feed").LJFF("to_report_feed_ids", "");
    }

    public final String LIZLLL() {
        if (C086I.LIZIZ(this.LIZJ)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public final String LJ() {
        if (C086I.LIZIZ(this.LIZIZ)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public C0TJ8() {
        String strLIZIZ = C1238740iLA.LIZJ("follow_feed").LIZIZ("to_report_feed_ids", "");
        if (strLIZIZ == null || strLIZIZ.isEmpty()) {
            return;
        }
        String[] strArrSplit = strLIZIZ.split(",");
        for (String str : strArrSplit) {
            LIZ(str);
        }
    }

    public static C0TJ8 LIZJ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0T5E.LIZ;
        C0TJ8 c0tj8 = (C0TJ8) concurrentHashMap.get(str);
        if (c0tj8 == null) {
            C0TJ8 c0tj82 = new C0TJ8();
            concurrentHashMap.put(str, c0tj82);
            return c0tj82;
        }
        return c0tj8;
    }

    public final void LIZ(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.LIZ == null) {
                this.LIZ = new HashSet<>();
            }
            if (this.LIZIZ == null) {
                this.LIZIZ = new HashSet<>();
            }
            if (!this.LIZ.contains(str)) {
                this.LIZIZ.add(str);
                this.LIZ.add(str);
            }
        }
    }
}
