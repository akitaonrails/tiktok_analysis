package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mX2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399860mX2 {
    public static volatile C1399860mX2 LIZJ;
    public volatile ProgressDialogC1399850mX1 LIZ;
    public volatile boolean LIZIZ;

    public static C1399860mX2 LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1399860mX2.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1399860mX2();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ() {
        if (this.LIZ != null && this.LIZ.LLILZIL != null) {
            try {
                if (this.LIZ.isShowing()) {
                    ProgressDialogC1399850mX1 progressDialogC1399850mX1 = this.LIZ;
                    progressDialogC1399850mX1.dismiss();
                    C785410UrT.LIZ(progressDialogC1399850mX1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZ = null;
        this.LIZIZ = false;
    }

    public final void LIZJ(long j, long j2) {
        int iCeil;
        if (this.LIZ != null && this.LIZ.LLILZIL != null) {
            if (j > 0 && j2 > 0) {
                iCeil = (int) Math.ceil((j * 100.0f) / j2);
            } else {
                iCeil = 0;
            }
            int iMax = Math.max(0, Math.min(iCeil, 100));
            if (iMax > this.LIZ.getProgress()) {
                this.LIZ.setProgress(iMax);
            }
        }
    }
}
