package X;

import X.AbstractC21616419ik;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21616419ik<T extends AbstractC21616419ik<T>> implements InterfaceC21617619iw {
    public static final C21615919if LJIIL = new AbstractC21615419ia() { // from class: X.19if
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getTranslationX();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.Jc((View) obj, f);
        }
    };
    public static final C21616019ig LJIILIIL = new AbstractC21615419ia() { // from class: X.19ig
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getTranslationY();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.ed((View) obj, f);
        }
    };
    public static final C21617319it LJIILJJIL = new AbstractC21615419ia() { // from class: X.19it
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return C14K9.LJIIJJI(view);
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C14K9.LJIL((View) obj, f);
        }
    };
    public static final C21616319ij LJIILL = new AbstractC21615419ia() { // from class: X.19ij
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getScaleX();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.Ob((View) obj, f);
        }
    };
    public static final C21616919ip LJIILLIIL = new AbstractC21615419ia() { // from class: X.19ip
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getScaleY();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.pc((View) obj, f);
        }
    };
    public static final C21616119ih LJIIZILJ = new AbstractC21615419ia() { // from class: X.19ih
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getRotation();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.Ab((View) obj, f);
        }
    };
    public static final C21615519ib LJIJ = new AbstractC21615419ia() { // from class: X.19ib
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getRotationX();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.Hb((View) obj, f);
        }
    };
    public static final C21615619ic LJIJI = new AbstractC21615419ia() { // from class: X.19ic
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getRotationY();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.Ib((View) obj, f);
        }
    };
    public static final C21616219ii LJIJJ = new AbstractC21615419ia() { // from class: X.19ii
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getAlpha();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            C786410Ut5.T4((View) obj, f);
        }
    };
    public static final C21615719id LJIJJLI = new AbstractC21615419ia() { // from class: X.19id
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getScrollX();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            ((View) obj).setScrollX((int) f);
        }
    };
    public static final C21615819ie LJIL = new AbstractC21615419ia() { // from class: X.19ie
        @Override // X.AbstractC20731716Ap
        public final float LIZ(View view) {
            return view.getScrollY();
        }

        @Override // X.AbstractC20731716Ap
        public final void LIZIZ(float f, Object obj) {
            ((View) obj).setScrollY((int) f);
        }
    };
    public float LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL;
    public final AbstractC20731716Ap LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public long LJIIIIZZ;
    public float LJIIIZ;
    public final ArrayList<InterfaceC1427630nFp> LJIIJ;
    public final ArrayList<InterfaceC20731416Am> LJIIJJI;

    public final void LIZLLL() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.LJFF) {
            LJ(true);
        }
    }

    public AbstractC21616419ik(final C1582560rHi c1582560rHi) {
        this.LIZIZ = Float.MAX_VALUE;
        this.LJI = Float.MAX_VALUE;
        this.LJII = -3.4028235E38f;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = new ArrayList<>();
        this.LIZLLL = null;
        this.LJ = new AbstractC20731716Ap() { // from class: X.19is
            @Override // X.AbstractC20731716Ap
            public final float LIZ(Object obj) {
                return c1582560rHi.LIZ;
            }

            @Override // X.AbstractC20731716Ap
            public final void LIZIZ(float f, Object obj) {
                c1582560rHi.LIZ = f;
            }
        };
        this.LJIIIZ = 1.0f;
    }

    @Override // X.InterfaceC21617619iw
    public final boolean LIZ(long j) {
        long j2 = this.LJIIIIZZ;
        if (j2 == 0) {
            this.LJIIIIZZ = j;
            LJFF(this.LIZIZ);
            return false;
        }
        long j3 = j - j2;
        this.LJIIIIZZ = j;
        C21616519il c21616519il = (C21616519il) this;
        boolean z = true;
        if (c21616519il.LJJIFFI) {
            float f = c21616519il.LJJI;
            if (f != Float.MAX_VALUE) {
                c21616519il.LJJ.LJIIIIZZ = f;
                c21616519il.LJJI = Float.MAX_VALUE;
            }
            c21616519il.LIZIZ = (float) c21616519il.LJJ.LJIIIIZZ;
            c21616519il.LIZ = 0.0f;
            c21616519il.LJJIFFI = false;
        } else {
            if (c21616519il.LJJI != Float.MAX_VALUE) {
                long j4 = j3 / 2;
                C21581519d7 c21581519d7LIZJ = c21616519il.LJJ.LIZJ(c21616519il.LIZIZ, c21616519il.LIZ, j4);
                C21581419d6 c21581419d6 = c21616519il.LJJ;
                c21581419d6.LJIIIIZZ = c21616519il.LJJI;
                c21616519il.LJJI = Float.MAX_VALUE;
                C21581519d7 c21581519d7LIZJ2 = c21581419d6.LIZJ(c21581519d7LIZJ.LIZ, c21581519d7LIZJ.LIZIZ, j4);
                c21616519il.LIZIZ = c21581519d7LIZJ2.LIZ;
                c21616519il.LIZ = c21581519d7LIZJ2.LIZIZ;
            } else {
                C21581519d7 c21581519d7LIZJ3 = c21616519il.LJJ.LIZJ(c21616519il.LIZIZ, c21616519il.LIZ, j3);
                c21616519il.LIZIZ = c21581519d7LIZJ3.LIZ;
                c21616519il.LIZ = c21581519d7LIZJ3.LIZIZ;
            }
            float fMax = Math.max(c21616519il.LIZIZ, c21616519il.LJII);
            c21616519il.LIZIZ = fMax;
            c21616519il.LIZIZ = Math.min(fMax, c21616519il.LJI);
            float f2 = c21616519il.LIZ;
            C21581419d6 c21581419d62 = c21616519il.LJJ;
            c21581419d62.getClass();
            if (Math.abs(f2) < c21581419d62.LJ && Math.abs(r10 - ((float) c21581419d62.LJIIIIZZ)) < c21581419d62.LIZLLL) {
                c21616519il.LIZIZ = (float) c21616519il.LJJ.LJIIIIZZ;
                c21616519il.LIZ = 0.0f;
            } else {
                z = false;
            }
        }
        float fMin = Math.min(this.LIZIZ, this.LJI);
        this.LIZIZ = fMin;
        float fMax2 = Math.max(fMin, this.LJII);
        this.LIZIZ = fMax2;
        LJFF(fMax2);
        if (z) {
            LJ(false);
        }
        return z;
    }

    public final void LIZIZ(InterfaceC1427630nFp interfaceC1427630nFp) {
        if (!this.LJIIJ.contains(interfaceC1427630nFp)) {
            this.LJIIJ.add(interfaceC1427630nFp);
        }
    }

    public final void LIZJ(InterfaceC20731416Am interfaceC20731416Am) {
        if (!this.LJFF) {
            if (!this.LJIIJJI.contains(interfaceC20731416Am)) {
                this.LJIIJJI.add(interfaceC20731416Am);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void LJ(boolean z) {
        this.LJFF = false;
        ThreadLocal<C21616719in> threadLocal = C21616719in.LJI;
        if (threadLocal.get() == null) {
            threadLocal.set(new C21616719in());
        }
        C21616719in c21616719in = threadLocal.get();
        c21616719in.LIZ.remove(this);
        int iIndexOf = c21616719in.LIZIZ.indexOf(this);
        if (iIndexOf >= 0) {
            ListProtector.set(c21616719in.LIZIZ, iIndexOf, null);
            c21616719in.LJFF = true;
        }
        this.LJIIIIZZ = 0L;
        this.LIZJ = false;
        for (int i = 0; i < this.LJIIJ.size(); i++) {
            if (ListProtector.get(this.LJIIJ, i) != null) {
                ((InterfaceC1427630nFp) ListProtector.get(this.LJIIJ, i)).LIZ(this, z, this.LIZIZ, this.LIZ);
            }
        }
        ArrayList<InterfaceC1427630nFp> arrayList = this.LJIIJ;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (ListProtector.get(arrayList, size) == null) {
                    ListProtector.remove(arrayList, size);
                }
            } else {
                return;
            }
        }
    }

    public final void LJFF(float f) {
        this.LJ.LIZIZ(f, this.LIZLLL);
        for (int i = 0; i < this.LJIIJJI.size(); i++) {
            if (ListProtector.get(this.LJIIJJI, i) != null) {
                ((InterfaceC20731416Am) ListProtector.get(this.LJIIJJI, i)).LIZ(this.LIZIZ, this.LIZ);
            }
        }
        ArrayList<InterfaceC20731416Am> arrayList = this.LJIIJJI;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (ListProtector.get(arrayList, size) == null) {
                    ListProtector.remove(arrayList, size);
                }
            } else {
                return;
            }
        }
    }

    public final void LJI(float f) {
        this.LIZIZ = f;
        this.LIZJ = true;
    }

    public <K> AbstractC21616419ik(K k, AbstractC20731716Ap<K> abstractC20731716Ap) {
        this.LIZIZ = Float.MAX_VALUE;
        this.LJI = Float.MAX_VALUE;
        this.LJII = -3.4028235E38f;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = new ArrayList<>();
        this.LIZLLL = k;
        this.LJ = abstractC20731716Ap;
        if (abstractC20731716Ap != LJIIZILJ && abstractC20731716Ap != LJIJ && abstractC20731716Ap != LJIJI) {
            if (abstractC20731716Ap == LJIJJ) {
                this.LJIIIZ = 0.00390625f;
                return;
            } else if (abstractC20731716Ap != LJIILL && abstractC20731716Ap != LJIILLIIL) {
                this.LJIIIZ = 1.0f;
                return;
            } else {
                this.LJIIIZ = 0.00390625f;
                return;
            }
        }
        this.LJIIIZ = 0.1f;
    }
}
