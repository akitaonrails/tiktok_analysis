package X;

import X.AbstractC795370VHz;
import X.C0VIL;
import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VIL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VIL<B extends C0VIL<?, ?>, W extends AbstractC795370VHz> {
    public boolean LIZ;
    public UUID LIZIZ;
    public C0VIG LIZJ;
    public final Set<String> LIZLLL;

    public abstract W LIZIZ();

    public abstract B LIZJ();

    public final W LIZ() {
        W w = (W) LIZIZ();
        C0VIK c0vik = this.LIZJ.LJIIIZ;
        boolean z = true;
        if ((Build.VERSION.SDK_INT < 24 || ((HashSet) c0vik.LJII.LIZ).size() <= 0) && !c0vik.LIZLLL && !c0vik.LIZIZ && !c0vik.LIZJ) {
            z = false;
        }
        if (this.LIZJ.LJIILLIIL && z) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.LIZIZ = UUID.randomUUID();
        C0VIG c0vig = new C0VIG(this.LIZJ);
        this.LIZJ = c0vig;
        c0vig.LIZ = this.LIZIZ.toString();
        return w;
    }

    public C0VIL(Class<? extends ListenableWorker> cls) {
        HashSet hashSet = new HashSet();
        this.LIZLLL = hashSet;
        this.LIZIZ = UUID.randomUUID();
        this.LIZJ = new C0VIG(this.LIZIZ.toString(), cls.getName());
        hashSet.add(cls.getName());
        LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B LJ(C795380VIa c795380VIa) {
        this.LIZJ.LJ = c795380VIa;
        LIZJ();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B LIZLLL(long j, TimeUnit timeUnit) {
        this.LIZJ.LJI = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.LIZJ.LJI) {
            LIZJ();
            return this;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
}
