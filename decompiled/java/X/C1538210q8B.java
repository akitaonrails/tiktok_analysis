package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0q8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538210q8B {
    public final C1537480q70 LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ;
    public final StringBuffer LIZJ;
    public final StringBuffer LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;

    public final void LIZ(String str) {
        StringBuffer stringBuffer = this.LIZLLL;
        stringBuffer.append(str);
        stringBuffer.append("  ");
        this.LJFF = true;
        C1532960pzi.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, new Runnable() { // from class: X.0q8C
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CodeCacheInfo@293d.recordMissingCacheId$1");
                try {
                    if (this.LL.LJFF) {
                        this.LL.LJFF = false;
                        C1538210q8B c1538210q8B = this.LL;
                        C1530570pvr.LJ(c1538210q8B.LIZ, "opt_lynx_code_cache_missing_id", c1538210q8B.LIZLLL.toString());
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CodeCacheInfo@293d.recordMissingCacheId$1");
            }
        });
    }

    public C1538210q8B(C1537480q70 c1537480q70, boolean z) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        this.LIZ = c1537480q70;
        if (z) {
            concurrentHashMap = null;
        } else {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        this.LIZIZ = concurrentHashMap;
        this.LIZJ = new StringBuffer();
        this.LIZLLL = new StringBuffer();
    }
}
