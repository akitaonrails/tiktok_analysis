package X;

/* JADX INFO: renamed from: X.0nmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448010nmh {
    public EnumC1448040nmk LIZ = EnumC1448040nmk.LL;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZJ() {
        if (this.LIZ != EnumC1448040nmk.LLILLJJLI) {
            C201955140j.LIZIZ("BackgroundDurationTracker", "onStop: No state change (not FOREGROUND).");
            return;
        }
        this.LIZIZ = System.currentTimeMillis();
        this.LIZ = EnumC1448040nmk.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStop: Enter background. lastBackgroundStart=");
        sbLIZ.append(this.LIZIZ);
        C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final long LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastBackgroundDuration: ");
        sbLIZ.append(this.LIZJ);
        C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZJ;
    }

    public final void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOrdinal = this.LIZ.ordinal();
        if (iOrdinal == 0) {
            this.LIZJ = 0L;
            this.LIZIZ = 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStart: Initialized. now=");
            sbLIZ.append(jCurrentTimeMillis);
            C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ = EnumC1448040nmk.LLILLJJLI;
            return;
        }
        if (iOrdinal != 2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStart: No state change (already FOREGROUND). now=");
            sbLIZ2.append(jCurrentTimeMillis);
            C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        long j = this.LIZIZ;
        if (j != 0) {
            this.LIZJ = jCurrentTimeMillis - j;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onStart: Returned from background. lastBackgroundStart=");
            sbLIZ3.append(this.LIZIZ);
            sbLIZ3.append(", now=");
            sbLIZ3.append(jCurrentTimeMillis);
            sbLIZ3.append(", lastBackgroundDuration=");
            sbLIZ3.append(this.LIZJ);
            C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZIZ = 0L;
        }
        this.LIZ = EnumC1448040nmk.LLILLJJLI;
    }
}
