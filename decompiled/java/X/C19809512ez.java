package X;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcz;

/* JADX INFO: renamed from: X.12ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19809512ez extends AbstractC19810512f9 {
    public zzcz LIZJ;
    public boolean LIZLLL;
    public final C19805712eN LJ;
    public final C19805612eM LJFF;
    public final C19812312fR LJI;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return false;
    }

    public final void LJIILLIIL() {
        LJ();
        if (this.LIZJ == null) {
            this.LIZJ = new zzcz(Looper.getMainLooper());
        }
    }

    public C19809512ez(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZLLL = true;
        this.LJ = new C19805712eN(this);
        this.LJFF = new C19805612eM(this);
        this.LJI = new C19812312fR(this);
    }
}
