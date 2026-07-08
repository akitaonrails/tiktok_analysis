package androidx.work;

import X.AbstractC795160VHe;
import X.C054G;
import X.C0PEM;
import X.C0VG9;
import X.C134N;
import X.C1DFH;
import X.C1DFK;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C788790Uwv;
import X.C804990Vhx;
import X.C805000Vhy;
import X.C805010Vhz;
import X.InterfaceC1364105Vn;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    public final C1DFK LLILZLL;
    public final C134N<AbstractC795160VHe> LLIZ;
    public final C1DFH LLIZLLLIL;

    public abstract Object LJII(InterfaceC1364105Vn<? super AbstractC795160VHe> interfaceC1364105Vn);

    @Override // androidx.work.ListenableWorker
    public final void LIZLLL() {
        this.LLIZ.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<AbstractC795160VHe> LJFF() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLIZLLLIL.plus(this.LLILZLL)), null, null, new C804990Vhx(this, null), 3);
        return this.LLIZ;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<C788790Uwv> LIZ() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        C054G c054gLIZ = C2296808zG.LIZ(this.LLIZLLLIL.plus(c1dfkLIZ));
        C805010Vhz c805010Vhz = new C805010Vhz(c1dfkLIZ);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C805000Vhy(c805010Vhz, this, null), 3);
        return c805010Vhz;
    }

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LLILZLL = C23118094a.LIZ();
        C134N<AbstractC795160VHe> c134n = new C134N<>();
        this.LLIZ = c134n;
        c134n.LJIIJJI(new ARunnableS113S0100000_13(this, 11), ((C0VG9) this.LLILLJJLI.LIZLLL).LIZ);
        this.LLIZLLLIL = C0PEM.LIZ;
    }
}
