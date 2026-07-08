package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: renamed from: X.19il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21616519il extends AbstractC21616419ik<C21616519il> {
    public C21581419d6 LJJ;
    public float LJJI;
    public boolean LJJIFFI;

    public final void LJIIIIZZ() {
        if (this.LJJ.LIZIZ <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.LJFF) {
            this.LJJIFFI = true;
        }
    }

    public final void LJIIIZ() {
        C21581419d6 c21581419d6 = this.LJJ;
        if (c21581419d6 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) c21581419d6.LJIIIIZZ;
        if (d > this.LJI) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.LJII) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.LJIIIZ * 0.75f);
        c21581419d6.LIZLLL = dAbs;
        c21581419d6.LJ = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        if (!this.LIZJ) {
            this.LIZIZ = this.LJ.LIZ(this.LIZLLL);
        }
        float f = this.LIZIZ;
        if (f > this.LJI || f < this.LJII) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<C21616719in> threadLocal = C21616719in.LJI;
        if (threadLocal.get() == null) {
            threadLocal.set(new C21616719in());
        }
        C21616719in c21616719in = threadLocal.get();
        if (c21616719in.LIZIZ.size() == 0) {
            if (c21616719in.LIZLLL == null) {
                c21616719in.LIZLLL = new C21616819io(c21616719in.LIZJ);
            }
            C21616819io c21616819io = c21616719in.LIZLLL;
            c21616819io.LIZIZ.postFrameCallback(c21616819io.LIZJ);
        }
        if (c21616719in.LIZIZ.contains(this)) {
            return;
        }
        c21616719in.LIZIZ.add(this);
    }

    public C21616519il(C1582560rHi c1582560rHi) {
        super(c1582560rHi);
        this.LJJI = Float.MAX_VALUE;
    }

    public final void LJII(float f) {
        if (this.LJFF) {
            this.LJJI = f;
            return;
        }
        if (this.LJJ == null) {
            this.LJJ = new C21581419d6(f);
        }
        this.LJJ.LJIIIIZZ = f;
        LJIIIZ();
    }

    public <K> C21616519il(K k, AbstractC20731716Ap<K> abstractC20731716Ap) {
        super(k, abstractC20731716Ap);
        this.LJJI = Float.MAX_VALUE;
    }

    public <K> C21616519il(K k, AbstractC20731716Ap<K> abstractC20731716Ap, float f) {
        super(k, abstractC20731716Ap);
        this.LJJI = Float.MAX_VALUE;
        this.LJJ = new C21581419d6(f);
    }
}
