package X;

import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;

/* JADX INFO: renamed from: X.0IqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478950IqL {
    public static final boolean LIZ() {
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            C478590Ipl c478590Ipl = C478590Ipl.LIZ;
            return C478590Ipl.LJII != 0 && C478590Ipl.LJFF() > 0 && System.currentTimeMillis() - C478590Ipl.LJII > ((long) C478590Ipl.LJFF()) * 1000;
        }
        C478920IqI c478920IqI = C478920IqI.LIZ;
        if (C478920IqI.LIZJ == 0) {
            c478920IqI.getClass();
            return !r9.isArchOpt();
        }
        c478920IqI.getClass();
        if (C478920IqI.LJI() <= 0) {
            C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Card feed data expiration check - No timeout period set, data considered expired");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - C478920IqI.LIZJ;
        boolean z = jCurrentTimeMillis > ((long) C478920IqI.LJI()) * 1000;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager Card feed data expiration check - Elapsed time: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" ms, Expired: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
