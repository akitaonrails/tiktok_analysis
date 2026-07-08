package X;

import android.util.SparseArray;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0YH4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YH4 implements C0YHC {
    public static final SparseArray<WeakReference<C0YH4>> LIZLLL = new SparseArray<>();
    public final C0YEM LIZ;
    public final C0YDA LIZIZ;
    public final C0YH7 LIZJ;

    @Override // X.C0YHC
    public final synchronized void logout() {
        this.LIZ.logout();
    }

    @Override // X.C0YHC
    public final InterfaceC872640YLe LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.C0YHC
    public final InterfaceC866310Xyf LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C0YHC
    public final C0YOZ LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC863730XuV
    public final C870830YEf LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // X.C0YHC
    public final InterfaceC876290YZf LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.C0YHC
    public final long getUid() {
        return this.LIZ.getUid();
    }

    @Override // X.InterfaceC863730XuV
    public final boolean isLogin() {
        return this.LIZ.isLogin();
    }

    @Override // X.C0YHC
    public final synchronized InterfaceC789170UxX LJI(C870830YEf c870830YEf) {
        return this.LIZ.LJI(c870830YEf);
    }

    public C0YH4(int i, InterfaceC870750YDx interfaceC870750YDx, C871040YFa c871040YFa) {
        if (c871040YFa.LIZ.LIZ.invoke().enableSessionScope) {
            C0YEC c0yec = new C0YEC(i, new C0YET(i, interfaceC870750YDx, c871040YFa));
            this.LIZ = c0yec;
            this.LIZJ = new C0YH2(c0yec);
        } else {
            C0YF0 c0yf0 = new C0YF0();
            C0YEE c0yee = new C0YEE(i, c0yf0, new C0YF4(i, interfaceC870750YDx, c0yf0, c871040YFa));
            this.LIZ = c0yee;
            this.LIZJ = new C0YH5(c0yee);
        }
        this.LIZIZ = this.LIZ.LJIJI();
    }

    public static synchronized C0YH4 LIZJ(int i, InterfaceC870750YDx interfaceC870750YDx, C871040YFa c871040YFa) {
        C0YH4 c0yh4;
        SparseArray<WeakReference<C0YH4>> sparseArray = LIZLLL;
        WeakReference<C0YH4> weakReference = sparseArray.get(i);
        if (weakReference != null && (c0yh4 = weakReference.get()) != null) {
            return c0yh4;
        }
        C0YH4 c0yh42 = new C0YH4(i, interfaceC870750YDx, c871040YFa);
        sparseArray.put(i, new WeakReference<>(c0yh42));
        return c0yh42;
    }
}
