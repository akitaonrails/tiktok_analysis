package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13Yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20028913Yh {
    public static final C19968013Aw<InterfaceC20028613Ye> LIZJ() {
        C13YU<C19968013Aw<InterfaceC20028613Ye>> c13yu = C13YY.LIZIZ;
        C19968013Aw<InterfaceC20028613Ye> c19968013AwLIZ = c13yu.LIZ();
        if (c19968013AwLIZ != null) {
            return c19968013AwLIZ;
        }
        C19968013Aw<InterfaceC20028613Ye> c19968013Aw = new C19968013Aw<>(new InterfaceC20028613Ye[0]);
        c13yu.LIZIZ(c19968013Aw);
        return c19968013Aw;
    }

    public static final void LJIIJ() {
    }

    public static final C13YZ LJ(Function0 function0) {
        return new C13YZ(null, function0);
    }

    public static C05P0 LJI(Object obj) {
        return new ParcelableSnapshotMutableState(obj, C595410NWx.LIZ);
    }

    public static final C095D LJIIIZ(Function0 function0) {
        return new C095D(new C20029413Ym(function0, null));
    }

    public static final C13YZ LIZLLL(C13FF c13ff, Function0 function0) {
        return new C13YZ(c13ff, function0);
    }

    public static final <T> C05P0<T> LJFF(T t, C13FF<T> c13ff) {
        return new ParcelableSnapshotMutableState(t, c13ff);
    }

    public static final C05P0 LJIIIIZZ(Object obj, InterfaceC1680500tpg interfaceC1680500tpg) {
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = LJI(obj);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        c05p0.setValue(obj);
        return c05p0;
    }

    public static final C05P0 LIZIZ(C05YD c05yd, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        return LIZ(c05yd, c05yd.getValue(), C23271099x.INSTANCE, interfaceC1680500tpg, (i & 14) | ((i << 3) & 896), 0);
    }

    public static final C05P0 LJII(Object obj, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg) {
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = LJI(obj);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        Unit unit = Unit.LIZ;
        boolean zLJII = interfaceC1680500tpg.LJII(function2);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == c1680520tpi) {
            objLJJ2 = new C345910DhF(function2, c05p0, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C1680540tpk.LJFF(unit, (Function2) objLJJ2, interfaceC1680500tpg);
        return c05p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C05P0 LIZ(X.InterfaceC346201Wa r6, java.lang.Object r7, kotlin.coroutines.CoroutineContext r8, X.InterfaceC1680500tpg r9, int r10, int r11) {
        /*
            r0 = r11 & 2
            if (r0 == 0) goto L6
            X.099x r8 = X.C23271099x.INSTANCE
        L6:
            boolean r1 = r9.LJII(r8)
            boolean r0 = r9.LJII(r6)
            r1 = r1 | r0
            java.lang.Object r5 = r9.LJJ()
            r4 = 0
            if (r1 != 0) goto L1f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r5 != r0) goto L27
        L1f:
            X.0DhL r5 = new X.0DhL
            r5.<init>(r8, r6, r4)
            r9.LJJIJIIJI(r5)
        L27:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r3 = r9.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r2 = X.C1680510tph.LIZIZ
            if (r3 != r2) goto L3d
            X.05P0 r3 = LJI(r7)
            r9.LJJIJIIJI(r3)
        L3d:
            X.05P0 r3 = (X.C05P0) r3
            boolean r1 = r9.LJII(r5)
            java.lang.Object r0 = r9.LJJ()
            if (r1 != 0) goto L4b
            if (r0 != r2) goto L53
        L4b:
            X.0DhG r0 = new X.0DhG
            r0.<init>(r5, r3, r4)
            r9.LJJIJIIJI(r0)
        L53:
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            X.C1680540tpk.LJ(r6, r8, r0, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20028913Yh.LIZ(X.01Wa, java.lang.Object, kotlin.coroutines.CoroutineContext, X.0tpg, int, int):X.05P0");
    }
}
