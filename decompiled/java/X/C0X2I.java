package X;

import com.bytedance.ttnet.cronet.AbsCronetDependAdapter;

/* JADX INFO: renamed from: X.0X2I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2I implements Runnable {
    public static boolean LLILLL;
    public final String LL;
    public final Object LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TTNetOptLancet$ServerConfigUpdatedLancetRunnable@1dc.run");
        try {
            LLILLL = true;
            Object obj = this.LLILLJJLI;
            String str = this.LL;
            boolean z = C788100Uvo.LIZ;
            if (obj instanceof AbsCronetDependAdapter) {
                ((AbsCronetDependAdapter) obj).onServerConfigUpdated(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTNetOptLancet$ServerConfigUpdatedLancetRunnable@1dc.run");
    }

    public C0X2I(Object obj, String str) {
        this.LLILLJJLI = obj;
        this.LL = str;
    }
}
