package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594920NVa<T> {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final Function1<? super T, Boolean> LIZ;
    public Function1<? super Float, Float> LIZIZ;
    public Function0<Float> LIZJ;
    public InterfaceC1677030tk5<Float> LIZLLL;
    public InterfaceC1677940tlY<Float> LJ;
    public final C594890NUx LJFF;
    public final C05P0 LJI;
    public final C05P0 LJII;
    public final C13YZ LJIIIIZZ;
    public final C05ZL LJIIIZ;
    public final C05ZL LJIIJ;
    public final C05P0 LJIIJJI;
    public final C05P0 LJIIL;
    public final C0NVW LJIILIIL;

    public final InterfaceC594940NVc<T> LIZIZ() {
        return (InterfaceC594940NVc) this.LJIIL.getValue();
    }

    public final T LIZJ() {
        return (T) this.LJI.getValue();
    }

    public final float LIZLLL() {
        return this.LJIIIZ.LIZIZ();
    }

    public final T LJ() {
        return (T) this.LJIIIIZZ.getValue();
    }

    public final boolean LJFF() {
        return (this.LIZIZ == null || this.LIZJ == null || this.LIZLLL == null || this.LJ == null) ? false : true;
    }

    public final float LJII() {
        if (!(!Float.isNaN(LIZLLL()))) {
            C1691080u6k.LIZJ("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return LIZLLL();
    }

    public C594920NVa(T t) {
        this.LIZ = AFwS240S0000000_9.get$arr$(833);
        this.LJFF = new C594890NUx();
        this.LJI = C20028913Yh.LJI(t);
        this.LJII = C20028913Yh.LJI(t);
        this.LJIIIIZZ = C20028913Yh.LJ(new AwS553S0100000_9(this, 1719));
        this.LJIIIZ = C1691250u71.LIZ(Float.NaN);
        C20028913Yh.LIZLLL(C595410NWx.LIZ, new AwS553S0100000_9(this, 1718));
        this.LJIIJ = C1691250u71.LIZ(0.0f);
        this.LJIIJJI = C20028913Yh.LJI(null);
        this.LJIIL = C20028913Yh.LJI(new C594950NVd(C13BV.INSTANCE, new float[0]));
        this.LJIILIIL = new C0NVW(this);
    }

    public final float LJI(float f) {
        float fLIZLLL;
        if (Float.isNaN(LIZLLL())) {
            fLIZLLL = 0.0f;
        } else {
            fLIZLLL = LIZLLL();
        }
        return C13LZ.LIZLLL(fLIZLLL + f, LIZIZ().LIZIZ(), LIZIZ().LJ());
    }

    public final void LJIIIIZZ(T t) {
        ((C13FE) this.LJI).setValue(t);
    }

    @InterfaceC1294060jmO
    public C594920NVa(Function1 function1, C0NWC c0nwc) {
        this(c0nwc);
        this.LIZ = function1;
    }

    @InterfaceC1294060jmO
    public final Object LJIIIZ(float f, AbstractC23140094w abstractC23140094w) {
        if (!LJFF()) {
            C1691080u6k.LIZ("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T tLIZJ = LIZJ();
        InterfaceC594940NVc<T> interfaceC594940NVcLIZIZ = LIZIZ();
        float fLJII = LJII();
        Function1<? super Float, Float> function1 = this.LIZIZ;
        Function0<Float> function0 = null;
        if (function1 == null) {
            function1 = null;
        }
        Function0<Float> function02 = this.LIZJ;
        if (function02 != null) {
            function0 = function02;
        }
        Object objLIZJ = C1677950tlZ.LIZJ(interfaceC594940NVcLIZIZ, fLJII, f, function1, function0);
        if (this.LIZ.invoke(objLIZJ).booleanValue()) {
            return C1677950tlZ.LJII(this, objLIZJ, f, abstractC23140094w);
        }
        return C1677950tlZ.LJII(this, tLIZJ, f, abstractC23140094w);
    }

    public final void LJIIJ(InterfaceC594940NVc<T> interfaceC594940NVc, T t) {
        if (!Intrinsics.LJFF(LIZIZ(), interfaceC594940NVc)) {
            ((C13FE) this.LJIIL).setValue(interfaceC594940NVc);
            C594890NUx c594890NUx = this.LJFF;
            if (c594890NUx.LIZIZ.LJFF(null)) {
                try {
                    C0NVW c0nvw = this.LJIILIIL;
                    float fLIZLLL = LIZIZ().LIZLLL(t);
                    if (!Float.isNaN(fLIZLLL)) {
                        c0nvw.LIZ(fLIZLLL, 0.0f);
                        ((C13FE) this.LJIIJJI).setValue(null);
                    }
                    LJIIIIZZ(t);
                    ((C13FE) this.LJII).setValue(t);
                    c594890NUx.LIZIZ.LIZIZ(null);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c594890NUx.LIZIZ.LIZIZ(null);
                    throw th;
                }
            }
            ((C13FE) this.LJIIJJI).setValue(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(T r8, X.EnumC1384205bM r9, X.InterfaceC1631630sYr<? super X.C0NVR, ? super X.InterfaceC594940NVc<T>, ? super T, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C0NVZ
            if (r0 == 0) goto L23
            r6 = r11
            X.0NVZ r6 = (X.C0NVZ) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L2f
            X.0NVa r0 = r6.LL
            goto L29
        L23:
            X.0NVZ r6 = new X.0NVZ
            r6.<init>(r7, r11)
            goto L12
        L29:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L2d
            goto L88
        L2d:
            r1 = move-exception
            goto L60
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r1)
            X.0NVc r0 = r7.LIZIZ()
            boolean r0 = r0.LIZJ(r8)
            if (r0 == 0) goto L6e
            X.0NUx r2 = r7.LJFF     // Catch: java.lang.Throwable -> L5e
            X.0NVT r1 = new X.0NVT     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r7, r8, r10, r4)     // Catch: java.lang.Throwable -> L5e
            r6.LL = r7     // Catch: java.lang.Throwable -> L5e
            r6.LLILZ = r3     // Catch: java.lang.Throwable -> L5e
            r2.getClass()     // Catch: java.lang.Throwable -> L5e
            X.0NUw r0 = new X.0NUw     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r9, r2, r1, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = X.C2296808zG.LJ(r0, r6)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r5) goto L87
            return r5
        L5e:
            r1 = move-exception
            r0 = r7
        L60:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r1 = move-exception
            goto L60
        L66:
            X.05P0 r0 = r0.LJIIJJI
            X.13FE r0 = (X.C13FE) r0
            r0.setValue(r4)
            throw r1
        L6e:
            kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r0 = r7.LIZ
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8f
            X.05P0 r0 = r7.LJII
            X.13FE r0 = (X.C13FE) r0
            r0.setValue(r8)
            r7.LJIIIIZZ(r8)
            goto L8f
        L87:
            r0 = r7
        L88:
            X.05P0 r0 = r0.LJIIJJI
            X.13FE r0 = (X.C13FE) r0
            r0.setValue(r4)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594920NVa.LIZ(java.lang.Object, X.05bM, X.0sYr, X.05Vn):java.lang.Object");
    }
}
