package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0N7R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7R implements Runnable {
    public final Aweme LL;
    public final String LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FeedLandPageClickUploadExp$LandPageLoadedCallback@da0a.run");
        try {
            C844470XAv.LIZ.getClass();
            C1019030ccn.LJJIII(C844470XAv.LIZ(), this.LL, null, this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedLandPageClickUploadExp$LandPageLoadedCallback@da0a.run");
    }

    public C0N7R(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
    }
}
