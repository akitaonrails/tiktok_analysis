package X;

import tikcast.linkmic.common.MgTraceInfo;

/* JADX INFO: renamed from: X.01IF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IF {
    public static final MgTraceInfo LIZ(C334801Rq c334801Rq) {
        long jLongValue;
        if (c334801Rq == null) {
            return null;
        }
        MgTraceInfo mgTraceInfo = new MgTraceInfo();
        String str = c334801Rq.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mgTraceInfo.entranceFrom = str;
        Long l = c334801Rq.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        mgTraceInfo.entranceFromPlaybookId = jLongValue;
        String str3 = c334801Rq.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        mgTraceInfo.trafficSource = str2;
        return mgTraceInfo;
    }
}
