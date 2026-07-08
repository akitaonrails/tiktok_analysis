package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0dun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068630dun implements Serializable {
    public static final int $stable = 0;
    public final int iframeInjectFailTimes;
    public final long iframePrepareFailedScriptDuration;
    public final long iframeScriptFailedLoadDuration;
    public final long iframeSecurityFailedDecisionDuration;
    public final long iframeTotalFailedDuration;
    public final long iframeTtnetFailedRequestDuration;

    public C1068630dun(int i, long j, long j2, long j3, long j4, long j5) {
        this.iframeInjectFailTimes = i;
        this.iframeTotalFailedDuration = j;
        this.iframeTtnetFailedRequestDuration = j2;
        this.iframeSecurityFailedDecisionDuration = j3;
        this.iframeScriptFailedLoadDuration = j4;
        this.iframePrepareFailedScriptDuration = j5;
    }
}
