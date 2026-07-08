package X;

import com.ss.android.ugc.aweme.settings.AnoleVideoPreloadModel;

/* JADX INFO: renamed from: X.08rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2249308rb {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C2249308rb() {
        C01GW c01gw = C2249408rc.LIZIZ;
        boolean z = ((AnoleVideoPreloadModel) c01gw.getValue()).enableAutoClean;
        long jIntValue = ((AnoleVideoPreloadModel) c01gw.getValue()).maxCacheSize != null ? r0.intValue() : 209715200L;
        Long l = ((AnoleVideoPreloadModel) c01gw.getValue()).fileTTL;
        long jLongValue = l != null ? l.longValue() : 1296000000L;
        this.LIZ = z;
        this.LIZIZ = jIntValue;
        this.LIZJ = jLongValue;
    }
}
