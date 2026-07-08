package X;

import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksOrderer;

/* JADX INFO: renamed from: X.1AHW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHW {
    public final long LIZ;
    public final ViewerPicksOrderer LIZIZ;
    public final GiftPick LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C1AHW() {
        this(0L, null, 0 == true ? 1 : 0, 63);
    }

    public /* synthetic */ C1AHW(long j, ViewerPicksOrderer viewerPicksOrderer, GiftPick giftPick, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : viewerPicksOrderer, (i & 4) == 0 ? giftPick : null, false, false, false);
    }

    public C1AHW(long j, ViewerPicksOrderer viewerPicksOrderer, GiftPick giftPick, boolean z, boolean z2, boolean z3) {
        this.LIZ = j;
        this.LIZIZ = viewerPicksOrderer;
        this.LIZJ = giftPick;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
