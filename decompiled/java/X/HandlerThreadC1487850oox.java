package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class HandlerThreadC1487850oox extends HandlerThreadC1487770oop {
    public final /* synthetic */ C1487820oou LLILLL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            super.onLooperPrepared();
            this.LLILLL.LIZ.offer(this);
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC1487850oox(C1487820oou c1487820oou, String str, int i) {
        super(str, i);
        this.LLILLL = c1487820oou;
    }
}
