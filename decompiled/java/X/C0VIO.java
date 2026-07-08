package X;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: renamed from: X.0VIO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIO extends C0VIL<C0VIO, C0VIR> {
    @Override // X.C0VIL
    public final C0VIL LIZJ() {
        return this;
    }

    @Override // X.C0VIL
    public final AbstractC795370VHz LIZIZ() {
        if (this.LIZ && this.LIZJ.LJIIIZ.LIZJ) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new AbstractC795370VHz(this) { // from class: X.0VIR
            {
                super(this.LIZIZ, this.LIZJ, this.LIZLLL);
            }
        };
    }

    public C0VIO(Class<? extends ListenableWorker> cls) {
        super(cls);
        this.LIZJ.LIZLLL = OverwritingInputMerger.class.getName();
    }
}
