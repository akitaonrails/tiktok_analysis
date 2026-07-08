package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.player.sdk.util.OrderlyHandler;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;

/* JADX INFO: renamed from: X.0obp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479710obp {
    public final PlayerMainHandler LIZ;
    public final OrderlyHandler LIZIZ;

    public C1479710obp(Looper looper) {
        if (C1474810oTv.LJLJLJ()) {
            this.LIZIZ = C1479940ocC.LIZ;
        } else {
            this.LIZ = new PlayerMainHandler(looper);
        }
    }

    public final void LIZ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        OrderlyHandler orderlyHandler = this.LIZIZ;
        if (orderlyHandler != null) {
            orderlyHandler.LJ(runnable);
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, runnable);
        }
    }
}
