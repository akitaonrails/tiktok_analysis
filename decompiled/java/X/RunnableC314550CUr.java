package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0CUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC314550CUr implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public RunnableC314550CUr(int i, Aweme aweme, String str) {
        this.LL = i;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RedDotAwemeReadAvoidPerf@e697.realOnAwemeRead$reportRunnable$1");
        try {
            C1595430rcT.LIZIZ.LIZIZ().onAwemeRead(this.LL, this.LLILLJJLI, this.LLILLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RedDotAwemeReadAvoidPerf@e697.realOnAwemeRead$reportRunnable$1");
    }
}
