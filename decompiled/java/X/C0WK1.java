package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WK1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK1 implements C0WKG {
    public final Handler LIZ;
    public final Context LIZIZ;
    public C0WK3 LIZJ;
    public boolean LIZLLL;
    public C0WK2 LJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0WK2] */
    @Override // X.C0WKG
    public final void LIZ() {
        try {
            boolean zLIZJ = C0WFY.LIZIZ(this.LIZIZ).LIZJ();
            Logger.debug();
            if (zLIZJ != this.LIZLLL) {
                this.LIZLLL = zLIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        final Handler handler = this.LIZ;
        this.LJ = new ContentObserver(handler) { // from class: X.0WK2
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                C0WK3 c0wk3;
                Logger.debug();
                C0WK1 c0wk1 = this.LIZ;
                c0wk1.getClass();
                try {
                    boolean z2 = c0wk1.LIZLLL;
                    try {
                        boolean zLIZJ2 = C0WFY.LIZIZ(c0wk1.LIZIZ).LIZJ();
                        Logger.debug();
                        if (zLIZJ2 != c0wk1.LIZLLL) {
                            c0wk1.LIZLLL = zLIZJ2;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    boolean z3 = c0wk1.LIZLLL;
                    if (z2 != z3 && (c0wk3 = c0wk1.LIZJ) != null) {
                        ((C0WKC) c0wk3).LJ(z3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        try {
            this.LIZIZ.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.LIZ(this.LIZIZ, "frontier_enabled", "boolean"), true, this.LJ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C0WKG
    public final boolean isEnable() {
        return this.LIZLLL;
    }

    @Override // X.C0WKG
    public final void LIZIZ(C0WK3 c0wk3) {
        this.LIZJ = c0wk3;
    }

    public C0WK1(Context context, WeakHandler weakHandler) {
        this.LIZ = weakHandler;
        this.LIZIZ = context;
    }
}
