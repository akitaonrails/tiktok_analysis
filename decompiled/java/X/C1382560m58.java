package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.download.event.newet.DownloadEndEvent;

/* JADX INFO: renamed from: X.0m58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382560m58 {
    public String LIZ;
    public long LIZIZ;

    public static void LIZ(int i, int i2, long j, long j2, String str, boolean z) throws IllegalAccessException, InstantiationException {
        int i3;
        GScope gScope = GScope.LL;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        Integer numValueOf = Integer.valueOf(i2);
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        C1380850m2N.LIZIZ(gScope, null, null, lValueOf, lValueOf2, numValueOf, Integer.valueOf(i3), null, String.valueOf(i), str, 67);
        C1380850m2N.LIZ(DownloadEndEvent.class);
    }
}
