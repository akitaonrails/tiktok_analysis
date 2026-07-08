package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290650jgt implements InterfaceC1290730jh1<Bitmap> {
    public final /* synthetic */ C1290800jh8 LIZ;
    public final /* synthetic */ AtomicInteger LIZIZ;
    public final /* synthetic */ C1291600jiQ LIZJ;
    public final /* synthetic */ InterfaceC1290680jgw LIZLLL;

    @Override // X.InterfaceC1290730jh1
    public final void onFailed() {
        this.LIZJ.LJIIL = false;
        this.LIZLLL.LIZ("");
    }

    @Override // X.InterfaceC1290730jh1
    public final void onSuccess(Bitmap bitmap) {
        this.LIZ.LJI = bitmap;
        if (this.LIZIZ.decrementAndGet() == 0) {
            C1291600jiQ c1291600jiQ = this.LIZJ;
            c1291600jiQ.LJIIL = true;
            this.LIZLLL.LIZIZ(c1291600jiQ);
        }
    }

    public C1290650jgt(C1290800jh8 c1290800jh8, AtomicInteger atomicInteger, C1291600jiQ c1291600jiQ, InterfaceC1290680jgw interfaceC1290680jgw) {
        this.LIZ = c1290800jh8;
        this.LIZIZ = atomicInteger;
        this.LIZJ = c1291600jiQ;
        this.LIZLLL = interfaceC1290680jgw;
    }
}
