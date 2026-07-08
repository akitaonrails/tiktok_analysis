package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.1Axm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2196441Axm implements Serializable {
    public static final int $stable = 8;
    public EnumC2196421Axk LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public long LLILZLL;

    public final long getDuration() {
        long j = this.LLILZLL - this.LLILZIL;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public final long getEndTime() {
        return this.LLILZLL;
    }

    public final int getErrorCode() {
        return this.LLILLL;
    }

    public final String getErrorReason() {
        return this.LLILZ;
    }

    public EnumC2196421Axk getStage() {
        return this.LL;
    }

    public final long getStartTime() {
        return this.LLILZIL;
    }

    public final boolean isSuccess() {
        return this.LLILLJJLI;
    }

    public final long getDurationIntervalFromUserFlow(long j) {
        long j2 = this.LLILZIL - j;
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    public final long getTotalDurationFromUserFlow(long j) {
        long j2 = this.LLILZLL - j;
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    public final void setEndTime(long j) {
        this.LLILZLL = j;
    }

    public final void setErrorCode(int i) {
        this.LLILLL = i;
    }

    public final void setErrorReason(String str) {
        this.LLILZ = str;
    }

    public void setStage(EnumC2196421Axk enumC2196421Axk) {
        this.LL = enumC2196421Axk;
    }

    public final void setStartTime(long j) {
        this.LLILZIL = j;
    }

    public final void setSuccess(boolean z) {
        this.LLILLJJLI = z;
    }

    public C2196441Axm(EnumC2196421Axk enumC2196421Axk, boolean z, int i, String str, long j, long j2) {
        this.LL = enumC2196421Axk;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }
}
