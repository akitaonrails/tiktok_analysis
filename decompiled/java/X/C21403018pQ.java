package X;

import android.os.Build;
import androidx.emoji2.text.e;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.18pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21403018pQ extends C21404418pe {
    public volatile C21403318pT LIZIZ;
    public volatile C21403618pW LIZJ;

    public final void LIZ() {
        if (C1841607Je.LIZ != 1) {
            try {
                this.LIZ.LJFF.LIZ(new AbstractC20139013r2() { // from class: X.18pP
                    @Override // X.AbstractC20139013r2
                    public final void LIZ(Throwable th) {
                        this.LIZ.LIZ.LJI(th);
                    }

                    @Override // X.AbstractC20139013r2
                    public final void LIZIZ(C21403618pW c21403618pW) {
                        Set<int[]> setLIZ;
                        C21403018pQ c21403018pQ = this.LIZ;
                        c21403018pQ.LIZJ = c21403618pW;
                        C21403618pW c21403618pW2 = c21403018pQ.LIZJ;
                        e eVar = c21403018pQ.LIZ;
                        C21404318pd c21404318pd = eVar.LJI;
                        C14IP c14ip = eVar.LJIIIIZZ;
                        if (Build.VERSION.SDK_INT >= 34) {
                            setLIZ = C1959807m0.LIZ();
                        } else {
                            setLIZ = C1959807m0.LIZ();
                        }
                        c21403018pQ.LIZIZ = new C21403318pT(c21403618pW2, c21404318pd, c14ip, setLIZ);
                        c21403018pQ.LIZ.LJII();
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.LJI(th);
            }
        }
    }

    public C21403018pQ(e eVar) {
        super(eVar);
    }
}
