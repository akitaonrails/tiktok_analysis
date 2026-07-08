package X;

import Y.ARunnableS53S0300000_20;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.ui.image.FlattenUIImage;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1319960kSA<T, INFO> implements InterfaceC1320280kSg {
    public final C1316690kMt LIZ;
    public final Executor LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public boolean LJFF;
    public volatile InterfaceC1320200kSY<T> LJI;
    public T LJII;
    public Drawable LJIIIIZZ;
    public boolean LJIIIZ = true;
    public InterfaceC1320650kTH<INFO> LJIIJ;
    public InterfaceC1320140kSS LJIIJJI;
    public WeakReference<FlattenUIImage> LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public Object LJIILL;

    public abstract Drawable LIZJ(T t);

    public abstract InterfaceC1320200kSY<T> LJ();

    public abstract InterfaceC1330440kj4 LJI(Object obj);

    public abstract void LJIIJ(Drawable drawable);

    public abstract void LJIIL(T t);

    public final InterfaceC1320650kTH<INFO> LIZLLL() {
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH = this.LJIIJ;
        return interfaceC1320650kTH == null ? C1320700kTM.LIZ : interfaceC1320650kTH;
    }

    public final void LJIIJJI() {
        boolean z = this.LIZLLL;
        this.LIZLLL = false;
        this.LJ = false;
        InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJI;
        this.LJI = null;
        C1289620jfE.LIZLLL(new ARunnableS53S0300000_20(interfaceC1320200kSY, this.LJII, this, 8));
        if (z) {
            LIZLLL().LIZIZ(this.LJIILJJIL);
        }
    }

    public String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZ("isAttached", this.LIZJ);
        c1320100kSOLIZIZ.LIZ("isRequestSubmitted", this.LIZLLL);
        c1320100kSOLIZIZ.LIZ("hasFetchFailed", this.LJ);
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(LJFF(this.LJII)), "fetchedImage");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.InterfaceC1320280kSg
    public final void release() {
        LJIIJJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(InterfaceC1320650kTH<? super INFO> interfaceC1320650kTH) {
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH2 = this.LJIIJ;
        if (interfaceC1320650kTH2 instanceof C1319990kSD) {
            ((C1320680kTK) interfaceC1320650kTH2).LJIIJJI(interfaceC1320650kTH);
            return;
        }
        if (interfaceC1320650kTH2 != null) {
            C1320680kTK<INFO> c1320680kTK = new C1320680kTK<INFO>() { // from class: X.0kSD
            };
            c1320680kTK.LJIIJJI(interfaceC1320650kTH2);
            c1320680kTK.LJIIJJI(interfaceC1320650kTH);
            this.LJIIJ = c1320680kTK;
            return;
        }
        this.LJIIJ = interfaceC1320650kTH;
    }

    public int LJFF(T t) {
        return System.identityHashCode(t);
    }

    public final void LJIILIIL(InterfaceC1316360kMM interfaceC1316360kMM) {
        if (this.LIZLLL) {
            this.LIZ.LIZ.remove(this);
            LJIIJJI();
        }
        if (this.LJIIJJI != null) {
            this.LJIIJJI = null;
        }
        if (interfaceC1316360kMM != null) {
            C1322350kW1.LIZIZ(interfaceC1316360kMM instanceof InterfaceC1320140kSS);
            this.LJIIJJI = (InterfaceC1320140kSS) interfaceC1316360kMM;
        }
    }

    public AbstractC1319960kSA(C1316690kMt c1316690kMt, C0WPZ c0wpz) {
        this.LIZ = c1316690kMt;
        this.LIZIZ = c0wpz;
        LJII(null, null);
    }

    public final boolean LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY, T t) {
        FlattenUIImage flattenUIImage;
        WeakReference<FlattenUIImage> weakReference = this.LJIIL;
        if (weakReference != null && (flattenUIImage = weakReference.get()) != null && !TextUtils.equals(flattenUIImage.getSource(), this.LJIILIIL)) {
            if (t != null) {
                LJIIL(t);
            }
            if (interfaceC1320200kSY != null) {
                interfaceC1320200kSY.close();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image check failed curUrl = ");
            sbLIZ.append(flattenUIImage.getSource());
            sbLIZ.append(" preUrl = ");
            sbLIZ.append(this.LJIILIIL);
            LynxLog.i("LynxImage", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        return true;
    }

    public final void LJII(Object obj, String str) {
        C1316690kMt c1316690kMt;
        if (!this.LJIIIZ && (c1316690kMt = this.LIZ) != null) {
            c1316690kMt.LIZ.remove(this);
        }
        this.LIZJ = false;
        LJIIJJI();
        this.LJFF = false;
        this.LJIIJ = null;
        if (this.LJIIJJI != null) {
            this.LJIIJJI = null;
        }
        this.LJIILJJIL = str;
        this.LJIILL = obj;
    }

    public final boolean LJIIIIZZ(String str, InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        if (interfaceC1320200kSY == null && this.LJI == null) {
            return true;
        }
        if (str.equals(this.LJIILJJIL) && interfaceC1320200kSY == this.LJI && this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(String str, InterfaceC1320200kSY<T> interfaceC1320200kSY, Throwable th, boolean z) {
        Drawable drawable;
        if (!LJIIIIZZ(str, interfaceC1320200kSY)) {
            interfaceC1320200kSY.close();
            return;
        }
        if (!LIZIZ(interfaceC1320200kSY, null)) {
            return;
        }
        if (z) {
            this.LJI = null;
            this.LJ = true;
            InterfaceC1320140kSS interfaceC1320140kSS = this.LJIIJJI;
            if (interfaceC1320140kSS != null) {
                if (this.LJFF && (drawable = this.LJIIIIZZ) != null) {
                    interfaceC1320140kSS.LJFF(drawable, 1.0f, true);
                } else {
                    interfaceC1320140kSS.LIZJ();
                }
            }
            LIZLLL().LIZLLL(this.LJIILJJIL, th);
            return;
        }
        LIZLLL().LIZ(this.LJIILJJIL, th);
    }
}
