package X;

import X.AbstractC1320720kTO;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1320710kTN<T, INFO> implements InterfaceC1320850kTb, InterfaceC1320280kSg, InterfaceC1336190ksL {
    public static final Map<String, Object> LJJ = C19871212ow.of("component_tag", "drawee");
    public static final Map<String, Object> LJJI = C19871212ow.of("origin", "memory_bitmap", "origin_sub", "shortcut");
    public static final Class<?> LJJIFFI = AbstractC1320710kTN.class;
    public boolean LIZ = true;
    public final C1320840kTa LIZIZ;
    public final C1320560kT8 LIZJ;
    public final Executor LIZLLL;
    public C1320900kTg LJ;
    public C1320780kTU LJFF;
    public InterfaceC1320650kTH<INFO> LJI;
    public InterfaceC1320140kSS LJII;
    public Drawable LJIIIIZZ;
    public String LJIIIZ;
    public Object LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public String LJIILLIIL;
    public InterfaceC1320200kSY<T> LJIIZILJ;
    public T LJIJ;
    public Drawable LJIJI;
    public boolean LJIJJ;
    public C1325710kbR LJIJJLI;
    public C1322050kVX LJIL;

    public abstract Drawable LJFF(T t);

    public T LJI() {
        return null;
    }

    public abstract InterfaceC1320200kSY<T> LJIIIIZZ();

    public abstract InterfaceC1330440kj4 LJIIJ(Object obj);

    public void LJIIZILJ(Object obj, String str) {
    }

    public abstract void LJIJI(Drawable drawable);

    public abstract void LJIJJLI(T t);

    @Override // X.InterfaceC1320850kTb
    public final Animatable LIZ() {
        Object obj = this.LJIJI;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    public final InterfaceC1320650kTH<INFO> LJII() {
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH = this.LJI;
        return interfaceC1320650kTH == null ? C1320700kTM.LIZ : interfaceC1320650kTH;
    }

    public final Uri LJIIJJI() {
        C1325710kbR c1325710kbR = this.LJIJJLI;
        if (c1325710kbR != null) {
            return c1325710kbR.LIZIZ;
        }
        return null;
    }

    public final void LJIJJ() {
        boolean z = this.LJIIL;
        this.LJIIL = false;
        this.LJIILIIL = false;
        InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJIIZILJ;
        if (interfaceC1320200kSY != null) {
            interfaceC1320200kSY.close();
            this.LJIIZILJ = null;
        }
        Drawable drawable = this.LJIJI;
        if (drawable != null) {
            LJIJI(drawable);
        }
        if (this.LJIILLIIL != null) {
            this.LJIILLIIL = null;
        }
        this.LJIJI = null;
        T t = this.LJIJ;
        if (t != null) {
            LJIILL(t, "release");
            LJIJJLI(this.LJIJ);
            this.LJIJ = null;
        }
        if (z) {
            InterfaceC1320650kTH<INFO> interfaceC1320650kTHLJII = LJII();
            if (interfaceC1320650kTHLJII instanceof C1320700kTM) {
                ((C1320700kTM) interfaceC1320650kTHLJII).LJIIJ(this.LJIIIZ, this.LJIJJLI);
            }
            interfaceC1320650kTHLJII.LIZIZ(this.LJIIIZ);
        }
    }

    public final boolean LJJ() {
        C1320900kTg c1320900kTg;
        return this.LJIILIIL && (c1320900kTg = this.LJ) != null && c1320900kTg.LIZ && c1320900kTg.LIZJ < c1320900kTg.LIZIZ;
    }

    @Override // X.InterfaceC1320280kSg
    public final void release() {
        this.LIZIZ.LIZ(EnumC1320760kTS.ON_RELEASE_CONTROLLER);
        C1320900kTg c1320900kTg = this.LJ;
        if (c1320900kTg != null) {
            c1320900kTg.LIZJ = 0;
        }
        C1320780kTU c1320780kTU = this.LJFF;
        if (c1320780kTU != null) {
            c1320780kTU.LIZJ = false;
            c1320780kTU.LIZLLL = false;
        }
        InterfaceC1320140kSS interfaceC1320140kSS = this.LJII;
        if (interfaceC1320140kSS != null) {
            interfaceC1320140kSS.reset();
        }
        LJIJJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJI() {
        C1325710kbR c1325710kbR;
        C1323050kX9 c1323050kX9;
        C1336010ks3.LIZIZ();
        Object objLJI = LJI();
        AbstractC1327750kej abstractC1327750kej = ((objLJI instanceof C1323050kX9) && (c1323050kX9 = (C1323050kX9) objLJI) != null && (c1323050kX9.get() instanceof AbstractC1327750kej)) ? (AbstractC1327750kej) c1323050kX9.get() : null;
        boolean z = abstractC1327750kej != null ? abstractC1327750kej.isThumbCache : false;
        if (objLJI != null && !z) {
            C1336010ks3.LIZIZ();
            this.LJIIZILJ = null;
            this.LJIIL = true;
            this.LJIILIIL = false;
            this.LIZIZ.LIZ(EnumC1320760kTS.ON_SUBMIT_CACHE_HIT);
            LJII().LJFF(this.LJIIJ, this.LJIIIZ);
            LJIIZILJ(objLJI, this.LJIIIZ);
            LJIJ(this.LJIIIZ, this.LJIIZILJ, objLJI, 1.0f, true, true, true);
            C1336010ks3.LIZIZ();
            C1336010ks3.LIZIZ();
            return;
        }
        this.LIZIZ.LIZ(EnumC1320760kTS.ON_DATASOURCE_SUBMIT);
        LJII().LJFF(this.LJIIJ, this.LJIIIZ);
        this.LJII.LJ(0.0f, true);
        this.LJIIL = true;
        this.LJIILIIL = false;
        this.LJIIZILJ = LJIIIIZZ();
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(LJJIFFI, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, Integer.valueOf(System.identityHashCode(this.LJIIZILJ)));
        }
        final String str = this.LJIIIZ;
        final boolean zLIZIZ = this.LJIIZILJ.LIZIZ();
        C0HWE<T> c0hwe = new C0HWE<T>() { // from class: X.0kTP
            @Override // X.C0HWE, X.InterfaceC589510NAf
            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                boolean zLIZ = abstractC1321260kUG.LIZ();
                float progress = abstractC1321260kUG.getProgress();
                AbstractC1320710kTN abstractC1320710kTN = this.LIZJ;
                if (!abstractC1320710kTN.LJIILIIL(str, abstractC1321260kUG)) {
                    abstractC1320710kTN.LJIILJJIL("ignore_old_datasource @ onProgress", null);
                    abstractC1321260kUG.close();
                } else {
                    if (zLIZ) {
                        return;
                    }
                    abstractC1320710kTN.LJII.LJ(progress, false);
                }
            }

            @Override // X.C0HWE, X.InterfaceC589510NAf
            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                C720190SMv.LIZIZ(this.LIZJ.LJIIJJI());
            }

            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
                C720190SMv.LIZIZ(this.LIZJ.LJIIJJI());
                this.LIZJ.LJIILLIIL(str, interfaceC1320200kSY, interfaceC1320200kSY.LIZLLL(), true);
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
                boolean zLIZIZ2;
                boolean zLIZ = interfaceC1320200kSY.LIZ();
                boolean zLJ = interfaceC1320200kSY.LJ();
                float progress = interfaceC1320200kSY.getProgress();
                T result = interfaceC1320200kSY.getResult();
                if (result != null) {
                    C720190SMv.LIZIZ(this.LIZJ.LJIIJJI());
                    AbstractC1320710kTN abstractC1320710kTN = this.LIZJ;
                    String str2 = str;
                    if (true ^ C1320920kTi.LIZ) {
                        zLIZIZ2 = interfaceC1320200kSY.LIZIZ();
                    } else {
                        zLIZIZ2 = zLIZIZ;
                    }
                    abstractC1320710kTN.LJIJ(str2, interfaceC1320200kSY, result, progress, zLIZ, zLIZIZ2, zLJ);
                    return;
                }
                if (!zLIZ) {
                    return;
                }
                C720190SMv.LIZIZ(this.LIZJ.LJIIJJI());
                this.LIZJ.LJIILLIIL(str, interfaceC1320200kSY, new NullPointerException(), true);
            }
        };
        if (this.LJIJJLI == null) {
            InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJIIZILJ;
            if (interfaceC1320200kSY instanceof C1320930kTj) {
                InterfaceC1320070kSL<InterfaceC1320200kSY<T>> interfaceC1320070kSLLJIILL = ((C1320930kTj) interfaceC1320200kSY).LJIILL();
                if (interfaceC1320070kSLLJIILL instanceof AbstractC1320720kTO.c) {
                    Object objLIZ = ((AbstractC1320720kTO.c) interfaceC1320070kSLLJIILL).LIZ();
                    if (this.LJIJJLI == null && objLIZ != null) {
                        C1325710kbR c1325710kbR2 = (C1325710kbR) objLIZ;
                        this.LJIJJLI = c1325710kbR2;
                        c1325710kbR2.LJJ = this.LJIL;
                    }
                }
            }
        }
        this.LJIIZILJ.LIZJ(c0hwe, this.LIZLLL);
        if ((C720190SMv.LIZIZ || ((c1325710kbR = this.LJIJJLI) != null && c1325710kbR.LJJJI)) && LJIIJJI() != null) {
            Uri uriLJIIJJI = LJIIJJI();
            WeakReference weakReference = new WeakReference(this);
            synchronized (C720190SMv.class) {
                if (uriLJIIJJI != null) {
                    ((HashMap) C720190SMv.LIZ).put(uriLJIIJJI.toString(), weakReference);
                }
            }
        }
        C1336010ks3.LIZIZ();
    }

    @Override // X.InterfaceC1320850kTb
    public final void onAttach() {
        C1336010ks3.LIZIZ();
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(LJJIFFI, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, this.LJIIL ? "request already submitted" : "request needs submit");
        }
        this.LIZIZ.LIZ(EnumC1320760kTS.ON_ATTACH_CONTROLLER);
        this.LJII.getClass();
        this.LIZJ.LIZ(this);
        this.LJIIJJI = true;
        if (!this.LJIIL) {
            LJJI();
        }
        C1336010ks3.LIZIZ();
    }

    @Override // X.InterfaceC1320850kTb
    public final void onDetach() {
        C1336010ks3.LIZIZ();
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIIL(LJJIFFI, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ);
        }
        this.LIZIZ.LIZ(EnumC1320760kTS.ON_DETACH_CONTROLLER);
        this.LJIIJJI = false;
        this.LIZJ.LIZJ(this);
        C1336010ks3.LIZIZ();
    }

    public String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZ("isAttached", this.LJIIJJI);
        c1320100kSOLIZIZ.LIZ("isRequestSubmitted", this.LJIIL);
        c1320100kSOLIZIZ.LIZ("hasFetchFailed", this.LJIILIIL);
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(LJIIIZ(this.LJIJ)), "fetchedImage");
        c1320100kSOLIZIZ.LIZIZ(this.LIZIZ.toString(), "events");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.InterfaceC1320850kTb
    public final InterfaceC1320140kSS LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1320850kTb
    public void LIZJ(InterfaceC1316360kMM interfaceC1316360kMM) {
        EnumC1320760kTS enumC1320760kTS;
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(LJJIFFI, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, interfaceC1316360kMM);
        }
        C1320840kTa c1320840kTa = this.LIZIZ;
        if (interfaceC1316360kMM != null) {
            enumC1320760kTS = EnumC1320760kTS.ON_SET_HIERARCHY;
        } else {
            enumC1320760kTS = EnumC1320760kTS.ON_CLEAR_HIERARCHY;
        }
        c1320840kTa.LIZ(enumC1320760kTS);
        if (this.LJIIL) {
            this.LIZJ.LIZ(this);
            release();
        }
        InterfaceC1320140kSS interfaceC1320140kSS = this.LJII;
        if (interfaceC1320140kSS != null) {
            interfaceC1320140kSS.LIZLLL(null);
            this.LJII = null;
        }
        if (interfaceC1316360kMM != null) {
            C1322350kW1.LIZIZ(interfaceC1316360kMM instanceof InterfaceC1320140kSS);
            InterfaceC1320140kSS interfaceC1320140kSS2 = (InterfaceC1320140kSS) interfaceC1316360kMM;
            this.LJII = interfaceC1320140kSS2;
            interfaceC1320140kSS2.LIZLLL(this.LJIIIIZZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(InterfaceC1320650kTH<? super INFO> interfaceC1320650kTH) {
        interfaceC1320650kTH.getClass();
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH2 = this.LJI;
        if (interfaceC1320650kTH2 instanceof C1320000kSE) {
            ((C1320680kTK) interfaceC1320650kTH2).LJIIJJI(interfaceC1320650kTH);
            return;
        }
        if (interfaceC1320650kTH2 != null) {
            C1336010ks3.LIZIZ();
            C1320680kTK<INFO> c1320680kTK = new C1320680kTK<INFO>() { // from class: X.0kSE
                public static final /* synthetic */ int LIZJ = 0;
            };
            c1320680kTK.LJIIJJI(interfaceC1320650kTH2);
            c1320680kTK.LJIIJJI(interfaceC1320650kTH);
            C1336010ks3.LIZIZ();
            this.LJI = c1320680kTK;
            return;
        }
        this.LJI = interfaceC1320650kTH;
    }

    public int LJIIIZ(T t) {
        return System.identityHashCode(t);
    }

    public final void LJIL(C1320700kTM c1320700kTM) {
        c1320700kTM.getClass();
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH = this.LJI;
        if (interfaceC1320650kTH instanceof C1320000kSE) {
            C1320680kTK c1320680kTK = (C1320680kTK) interfaceC1320650kTH;
            synchronized (c1320680kTK) {
                int iIndexOf = ((ArrayList) c1320680kTK.LIZIZ).indexOf(c1320700kTM);
                if (iIndexOf != -1) {
                    ((ArrayList) c1320680kTK.LIZIZ).set(iIndexOf, null);
                }
            }
            return;
        }
        if (interfaceC1320650kTH == c1320700kTM) {
            this.LJI = null;
        }
    }

    @Override // X.InterfaceC1320850kTb
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC1320710kTN abstractC1320710kTN;
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(LJJIFFI, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, motionEvent);
        }
        C1320780kTU c1320780kTU = this.LJFF;
        if (c1320780kTU == null) {
            return false;
        }
        if (!c1320780kTU.LIZJ && !LJJ()) {
            return false;
        }
        C1320780kTU c1320780kTU2 = this.LJFF;
        c1320780kTU2.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        c1320780kTU2.LIZJ = false;
                        c1320780kTU2.LIZLLL = false;
                    }
                } else if (Math.abs(motionEvent.getX() - c1320780kTU2.LJFF) > c1320780kTU2.LIZIZ || Math.abs(motionEvent.getY() - c1320780kTU2.LJI) > c1320780kTU2.LIZIZ) {
                    c1320780kTU2.LIZLLL = false;
                    return true;
                }
                return true;
            }
            c1320780kTU2.LIZJ = false;
            if (Math.abs(motionEvent.getX() - c1320780kTU2.LJFF) > c1320780kTU2.LIZIZ || Math.abs(motionEvent.getY() - c1320780kTU2.LJI) > c1320780kTU2.LIZIZ) {
                c1320780kTU2.LIZLLL = false;
            }
            if (c1320780kTU2.LIZLLL && motionEvent.getEventTime() - c1320780kTU2.LJ <= ViewConfiguration.getLongPressTimeout() && (abstractC1320710kTN = c1320780kTU2.LIZ) != null) {
                if (C1328570kg3.LJIIJ(2)) {
                    C1328570kg3.LJIIL(LJJIFFI, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(abstractC1320710kTN)), abstractC1320710kTN.LJIIIZ);
                }
                if (abstractC1320710kTN.LJJ()) {
                    abstractC1320710kTN.LJ.LIZJ++;
                    abstractC1320710kTN.LJII.reset();
                    abstractC1320710kTN.LJJI();
                }
            }
            c1320780kTU2.LIZLLL = false;
            return true;
        }
        c1320780kTU2.LIZJ = true;
        c1320780kTU2.LIZLLL = true;
        c1320780kTU2.LJ = motionEvent.getEventTime();
        c1320780kTU2.LJFF = motionEvent.getX();
        c1320780kTU2.LJI = motionEvent.getY();
        return true;
    }

    public AbstractC1320710kTN(C1320560kT8 c1320560kT8, Executor executor) {
        C1320840kTa c1320840kTa;
        if (C1320840kTa.LIZJ) {
            c1320840kTa = new C1320840kTa();
        } else {
            c1320840kTa = C1320840kTa.LIZIZ;
        }
        this.LIZIZ = c1320840kTa;
        this.LJIJJ = true;
        this.LIZJ = c1320560kT8;
        this.LIZLLL = executor;
        LJIIL(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1336190ksL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r13, X.C1318160kPG r14) {
        /*
            r12 = this;
            boolean r0 = r12.LIZ
            if (r0 != 0) goto L5
            return
        L5:
            long r4 = android.os.SystemClock.uptimeMillis()
            X.09hT r6 = new X.09hT
            r6.<init>()
            r9 = 50
            if (r14 != 0) goto L61
            r8 = 50
        L14:
            if (r14 != 0) goto L59
            r7 = 1065353216(0x3f800000, float:1.0)
        L18:
            r11 = 1
        L19:
            r10 = r13
            android.graphics.Bitmap r3 = r6.LIZ(r7, r8, r9, r10, r11)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AbstractDraweeController, onBlurHashReady2: currentThread is = "
            r2.append(r0)
            java.lang.Thread r0 = X.C786410Ut5.u3()
            r2.append(r0)
            java.lang.String r0 = ", decode blurhash cost time is "
            r2.append(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r4
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "blurhash"
            X.C1328570kg3.LIZIZ(r0, r1)
            if (r3 == 0) goto L58
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r3)
            X.0kSS r1 = r12.LJII
            boolean r0 = r1 instanceof X.C1331070kk5
            if (r0 == 0) goto L58
            X.0kk5 r1 = (X.C1331070kk5) r1
            X.0kSl r0 = X.InterfaceC1320380kSq.LIZ
            r1.LJJIFFI(r2, r0)
        L58:
            return
        L59:
            float r7 = r14.LIZJ
            boolean r0 = r14.LIZLLL
            if (r0 != 0) goto L18
            r11 = 0
            goto L19
        L61:
            int r8 = r14.LIZ
            int r9 = r14.LIZIZ
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1320710kTN.LIZIZ(java.lang.String, X.0kPG):void");
    }

    public final synchronized void LJIIL(Object obj, String str) {
        C1320560kT8 c1320560kT8;
        C1336010ks3.LIZIZ();
        this.LIZIZ.LIZ(EnumC1320760kTS.ON_INIT_CONTROLLER);
        if (!this.LJIJJ && (c1320560kT8 = this.LIZJ) != null) {
            c1320560kT8.LIZ(this);
        }
        this.LJIIJJI = false;
        LJIJJ();
        this.LJIILJJIL = false;
        C1320900kTg c1320900kTg = this.LJ;
        if (c1320900kTg != null) {
            c1320900kTg.LIZ = false;
            c1320900kTg.LIZIZ = 4;
            c1320900kTg.LIZJ = 0;
        }
        C1320780kTU c1320780kTU = this.LJFF;
        if (c1320780kTU != null) {
            c1320780kTU.LIZ = null;
            c1320780kTU.LIZJ = false;
            c1320780kTU.LIZLLL = false;
            c1320780kTU.LIZ = this;
        }
        InterfaceC1320650kTH<INFO> interfaceC1320650kTH = this.LJI;
        if (interfaceC1320650kTH instanceof C1320000kSE) {
            ((C1320000kSE) interfaceC1320650kTH).LJIIL();
        } else {
            this.LJI = null;
        }
        InterfaceC1320140kSS interfaceC1320140kSS = this.LJII;
        if (interfaceC1320140kSS != null) {
            if (!this.LJIILL) {
                interfaceC1320140kSS.reset();
            }
            this.LJII.LIZLLL(null);
            this.LJII = null;
        }
        this.LJIIIIZZ = null;
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(LJJIFFI, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, str);
        }
        this.LJIIIZ = str;
        this.LJIIJ = obj;
        C1336010ks3.LIZIZ();
    }

    public final boolean LJIILIIL(String str, InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        if (interfaceC1320200kSY == null && this.LJIIZILJ == null) {
            return true;
        }
        if (str.equals(this.LJIIIZ) && interfaceC1320200kSY == this.LJIIZILJ && this.LJIIL) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL(String str, Throwable th) {
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILJJIL(LJJIFFI, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIZ, str, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(Object obj, String str) {
        String simpleName;
        if (C1328570kg3.LJIIJ(2)) {
            Class<?> cls = LJJIFFI;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = this.LJIIIZ;
            objArr[2] = str;
            if (obj != 0) {
                simpleName = obj.getClass().getSimpleName();
            } else {
                simpleName = "<null>";
            }
            objArr[3] = simpleName;
            objArr[4] = Integer.valueOf(LJIIIZ(obj));
            if (C1328570kg3.LIZ.LIZIZ(2)) {
                C1328570kg3.LIZ.v(cls.getSimpleName(), C786410Ut5.k4(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final void LJIILLIIL(String str, InterfaceC1320200kSY<T> interfaceC1320200kSY, Throwable th, boolean z) {
        EnumC1320760kTS enumC1320760kTS;
        Drawable drawable;
        C1336010ks3.LIZIZ();
        if (!LJIILIIL(str, interfaceC1320200kSY)) {
            LJIILJJIL("ignore_old_datasource @ onFailure", th);
            interfaceC1320200kSY.close();
            C1336010ks3.LIZIZ();
            return;
        }
        C1320840kTa c1320840kTa = this.LIZIZ;
        if (z) {
            enumC1320760kTS = EnumC1320760kTS.ON_DATASOURCE_FAILURE;
        } else {
            enumC1320760kTS = EnumC1320760kTS.ON_DATASOURCE_FAILURE_INT;
        }
        c1320840kTa.LIZ(enumC1320760kTS);
        if (z) {
            LJIILJJIL("final_failed @ onFailure", th);
            this.LJIIZILJ = null;
            this.LJIILIIL = true;
            if (this.LJIILJJIL && (drawable = this.LJIJI) != null) {
                this.LJII.LJFF(drawable, 1.0f, true);
            } else if (LJJ()) {
                this.LJII.LIZ();
            } else {
                this.LJII.LIZJ();
            }
            InterfaceC1320650kTH<INFO> interfaceC1320650kTHLJII = LJII();
            if (interfaceC1320650kTHLJII instanceof C1320700kTM) {
                ((C1320700kTM) interfaceC1320650kTHLJII).LJII(this.LJIIIZ, this.LJIJJLI, th);
            }
            interfaceC1320650kTHLJII.LIZLLL(this.LJIIIZ, th);
        } else {
            LJIILJJIL("intermediate_failed @ onFailure", th);
            LJII().LIZ(this.LJIIIZ, th);
        }
        C1336010ks3.LIZIZ();
    }

    public final void LJIJ(String str, InterfaceC1320200kSY<T> interfaceC1320200kSY, T t, float f, boolean z, boolean z2, boolean z3) {
        EnumC1320760kTS enumC1320760kTS;
        try {
            C1336010ks3.LIZIZ();
            if (!LJIILIIL(str, interfaceC1320200kSY)) {
                LJIILL(t, "ignore_old_datasource @ onNewResult");
                LJIJJLI(t);
                interfaceC1320200kSY.close();
                C1336010ks3.LIZIZ();
                return;
            }
            C1320840kTa c1320840kTa = this.LIZIZ;
            if (z) {
                enumC1320760kTS = EnumC1320760kTS.ON_DATASOURCE_RESULT;
            } else {
                enumC1320760kTS = EnumC1320760kTS.ON_DATASOURCE_RESULT_INT;
            }
            c1320840kTa.LIZ(enumC1320760kTS);
            try {
                Drawable drawableLJFF = LJFF(t);
                T t2 = this.LJIJ;
                Drawable drawable = this.LJIJI;
                this.LJIJ = t;
                this.LJIJI = drawableLJFF;
                HashMap map = new HashMap();
                map.put("drawableWidth", Integer.valueOf(drawableLJFF.getIntrinsicWidth()));
                map.put("drawableHeight", Integer.valueOf(drawableLJFF.getIntrinsicHeight()));
                map.put("scene_tag", this.LJIIJ);
                try {
                    if (z) {
                        LJIILL(t, "set_final_result @ onNewResult");
                        this.LJIIZILJ = null;
                        this.LJII.LJFF(drawableLJFF, 1.0f, z2);
                        InterfaceC1320650kTH<INFO> interfaceC1320650kTHLJII = LJII();
                        if (interfaceC1320650kTHLJII instanceof C1320700kTM) {
                            ((C1320700kTM) interfaceC1320650kTHLJII).LJIIIIZZ(str, LJIIJ(t), LIZ(), this.LJIJJLI, map);
                        }
                        interfaceC1320650kTHLJII.LJ(str, LJIIJ(t), LIZ());
                    } else if (z3) {
                        LJIILL(t, "set_temporary_result @ onNewResult");
                        this.LJII.LJFF(drawableLJFF, 1.0f, z2);
                        LJII().LJ(str, LJIIJ(t), LIZ());
                    } else {
                        LJIILL(t, "set_intermediate_result @ onNewResult");
                        this.LJII.LJFF(drawableLJFF, f, z2);
                        LJII().LIZJ(LJIIJ(t), str);
                        if (LJII() instanceof C1320700kTM) {
                            ((C1320700kTM) LJII()).LJIIIZ(str, LJIIJ(t), LIZ());
                        }
                    }
                    if (drawable != null && drawable != drawableLJFF) {
                        LJIJI(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        LJIILL(t2, "release_previous_result @ onNewResult");
                        LJIJJLI(t2);
                    }
                    C1336010ks3.LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (drawable != null && drawable != drawableLJFF) {
                        LJIJI(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        LJIILL(t2, "release_previous_result @ onNewResult");
                        LJIJJLI(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILL(t, "drawable_failed @ onNewResult");
                LJIJJLI(t);
                LJIILLIIL(str, interfaceC1320200kSY, e, z);
                C1336010ks3.LIZIZ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1336010ks3.LIZIZ();
            throw th2;
        }
    }
}
