package Y;

import X.C15O7;
import X.C1C7U;
import X.C616460OFw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS2S0002000_9 implements Callable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f272i0;
    public int i1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS2S0002000_9 aCallableS2S0002000_9) {
        C1C7U.LIZ("StickerCollectModel@1c33.requestListInfo$1");
        C15O7<StickerList> c15o7LJI = C616460OFw.LIZ.LJI(aCallableS2S0002000_9.f272i0, aCallableS2S0002000_9.i1);
        try {
            c15o7LJI.LJIJJLI();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c15o7LJI.LJIILL()) {
            try {
                throw c15o7LJI.LJIIJJI();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        StickerList stickerListLJIIL = c15o7LJI.LJIIL();
        C1C7U.LIZIZ("StickerCollectModel@1c33.requestListInfo$1");
        return stickerListLJIIL;
    }

    public static final Object call$1(ACallableS2S0002000_9 aCallableS2S0002000_9) {
        C1C7U.LIZ("CommentCollectedModel@73b1.queryList$1");
        C15O7<CollectedCommentList> c15o7LJII = C616460OFw.LIZ.LJII(aCallableS2S0002000_9.f272i0, aCallableS2S0002000_9.i1);
        try {
            c15o7LJII.LJIJJLI();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c15o7LJII.LJIILL()) {
            try {
                throw c15o7LJII.LJIIJJI();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        CollectedCommentList collectedCommentListLJIIL = c15o7LJII.LJIIL();
        C1C7U.LIZIZ("CommentCollectedModel@73b1.queryList$1");
        return collectedCommentListLJIIL;
    }

    public ACallableS2S0002000_9(int i, int i2) {
        this.$t = i2;
        this.f272i0 = i;
        this.i1 = 30;
    }

    public ACallableS2S0002000_9(int i, int i2, int i3) {
        this.$t = i3;
        this.f272i0 = i;
        this.i1 = i2;
    }
}
