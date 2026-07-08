package X;

import com.bytedance.ttnet.cronet.AbsCronetDependAdapter;

/* JADX INFO: renamed from: X.0owx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1492810owx implements Runnable {
    public static boolean LLIZLLLIL;
    public final Object LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TTNetOptLancet$StoreIdcChangedLancetRunnable@982b.run");
        try {
            LLIZLLLIL = true;
            Object obj = this.LL;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLIZ;
            String str5 = this.LLILZIL;
            String str6 = this.LLILZLL;
            boolean z = C788100Uvo.LIZ;
            if (obj instanceof AbsCronetDependAdapter) {
                ((AbsCronetDependAdapter) obj).onStoreIdcChanged(str, str2, str3, str4, str5, str6);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTNetOptLancet$StoreIdcChangedLancetRunnable@982b.run");
    }

    public RunnableC1492810owx(Object obj, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL = obj;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str4;
    }
}
