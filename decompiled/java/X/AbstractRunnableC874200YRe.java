package X;

import X.AbstractC874240YRi;
import X.AbstractRunnableC874200YRe;

/* JADX INFO: renamed from: X.0YRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractRunnableC874200YRe<TASK extends AbstractRunnableC874200YRe<TASK, PARAMS, RESULT>, PARAMS extends AbstractC874240YRi<TASK>, RESULT> implements Runnable {
    public final PARAMS LL;
    public C0YRZ LLILLJJLI;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BaseUploadTask@e3e1.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseUploadTask@e3e1.run");
    }

    public AbstractRunnableC874200YRe(PARAMS params) {
        this.LL = params;
    }
}
