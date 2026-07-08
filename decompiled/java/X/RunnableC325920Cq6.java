package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0Cq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC325920Cq6 implements Runnable {
    public final /* synthetic */ List<Aweme> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    public RunnableC325920Cq6(List list, boolean z, boolean z2, String str, String str2, boolean z3) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ColdCachePreloadProcessor@a0a7.dealMedias$3");
        try {
            C1483340ohg.LIZIZ(this.LLILZ, "", this.LLILZIL, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdCachePreloadProcessor@a0a7.dealMedias$3");
    }
}
