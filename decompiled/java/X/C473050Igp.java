package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Igp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473050Igp {
    public static volatile C473050Igp LJFF;
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>();

    public static C473050Igp LIZIZ() {
        if (LJFF == null) {
            synchronized (C473050Igp.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C473050Igp();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final void LIZ() {
        if (this.LIZ) {
            this.LIZIZ++;
            LIZLLL();
        }
    }

    public final boolean LIZJ() {
        if (this.LIZ) {
            return this.LIZIZ != 0 || this.LIZJ;
        }
        return false;
    }

    public final void LIZLLL() {
        if (this.LIZIZ != 0 || this.LIZJ) {
            this.LIZLLL.postValue(Boolean.FALSE);
        } else {
            this.LIZLLL.postValue(Boolean.TRUE);
        }
    }

    public final void LJ() {
        if (this.LIZ) {
            int i = this.LIZIZ - 1;
            this.LIZIZ = i;
            if (i < 0) {
                this.LIZIZ = 0;
            }
            if (this.LIZIZ == 0) {
                LIZLLL();
            }
        }
    }

    public final void LJI() {
        if (this.LIZ) {
            this.LIZ = false;
            this.LIZIZ = 0;
            this.LIZJ = false;
        }
    }

    public final void LJFF(boolean z) {
        if (!this.LIZ) {
            return;
        }
        this.LIZJ = z;
        this.LJ.postValue(Boolean.valueOf(z));
        LIZLLL();
    }
}
