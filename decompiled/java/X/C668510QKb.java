package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0QKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C668510QKb {
    public final C15O7 LIZ;
    public C0X9S<C1515820pY4<SearchSugResponse>> LIZIZ;
    public SearchSugResponse LIZJ;
    public final CountDownLatch LIZLLL = new CountDownLatch(1);
    public boolean LJ = false;
    public volatile AtomicBoolean LJFF = new AtomicBoolean(false);

    public final SearchSugResponse LIZ() {
        if (!this.LIZLLL.await(15L, TimeUnit.SECONDS)) {
            this.LJ = true;
        }
        return this.LIZJ;
    }

    public C668510QKb(C0X9S c0x9s) {
        this.LIZIZ = c0x9s;
    }

    public final boolean LIZIZ(SearchSugResponse searchSugResponse) {
        boolean zCompareAndSet = this.LJFF.compareAndSet(false, true);
        if (zCompareAndSet) {
            this.LIZJ = searchSugResponse;
            this.LIZLLL.countDown();
            if (((Number) C284280BCg.LIZ.getValue()).intValue() >= 1) {
                this.LIZIZ = null;
            }
        }
        return zCompareAndSet;
    }

    public C668510QKb(C15O7 c15o7) {
        this.LIZ = c15o7;
    }
}
