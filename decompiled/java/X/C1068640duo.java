package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0duo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068640duo implements Serializable {
    public static final int $stable = 0;
    public final int iframeInjectSuccessTimes;
    public final long iframePrepareSuccessScriptDuration;
    public final long iframeScriptSuccessLoadDuration;
    public final long iframeSecuritySuccessDecisionDuration;
    public final long iframeTotalSuccessDuration;
    public final long iframeTtnetSuccessRequestDuration;

    public C1068640duo(int i, long j, long j2, long j3, long j4, long j5) {
        this.iframeInjectSuccessTimes = i;
        this.iframeTotalSuccessDuration = j;
        this.iframeTtnetSuccessRequestDuration = j2;
        this.iframeSecuritySuccessDecisionDuration = j3;
        this.iframeScriptSuccessLoadDuration = j4;
        this.iframePrepareSuccessScriptDuration = j5;
    }
}
