package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.0w4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766600w4Y implements InterfaceC1766650w4d {
    public static final C1766600w4Y LIZ = new C1766600w4Y();
    public static final ArrayMap<String, C1766610w4Z> LIZIZ = new ArrayMap<>();

    public static C1766610w4Z LJIIIIZZ(String str) {
        ArrayMap<String, C1766610w4Z> arrayMap = LIZIZ;
        C1766610w4Z c1766610w4Z = arrayMap.get(str);
        if (c1766610w4Z == null) {
            C1766610w4Z c1766610w4Z2 = new C1766610w4Z(null);
            arrayMap.put(str, c1766610w4Z2);
            return c1766610w4Z2;
        }
        return c1766610w4Z;
    }

    @Override // X.InterfaceC1766650w4d
    public final boolean LIZ(String str) {
        C1766610w4Z c1766610w4Z;
        if (str == null || (c1766610w4Z = LIZIZ.get(str)) == null || !c1766610w4Z.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1766650w4d
    public final boolean LIZJ(String str) {
        C1766610w4Z c1766610w4Z;
        if (str == null || (c1766610w4Z = LIZIZ.get(str)) == null || !c1766610w4Z.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1766650w4d
    public final void LIZLLL(String str) {
        ArrayMap<String, C1766610w4Z> arrayMap;
        C1766610w4Z c1766610w4Z;
        SoftReference<C0N0Y> softReference;
        C0N0Y c0n0y;
        if (str != null && (c1766610w4Z = (arrayMap = LIZIZ).get(str)) != null) {
            if (!c1766610w4Z.LIZIZ) {
                LIZ.getClass();
                C1766610w4Z c1766610w4Z2 = arrayMap.get(str);
                if (c1766610w4Z2 != null && (softReference = c1766610w4Z2.LIZ) != null && (c0n0y = softReference.get()) != null) {
                    c0n0y.release();
                }
                arrayMap.remove(str);
                return;
            }
            c1766610w4Z.LJ = true;
        }
    }

    @Override // X.InterfaceC1766650w4d
    public final void LJ(String str) {
        if (str == null) {
            return;
        }
        LJIIIIZZ(str).LIZLLL = false;
    }

    @Override // X.InterfaceC1766650w4d
    public final C0N0Y LJFF(String str) {
        C0N0Y c0n0y = null;
        if (str == null || LIZJ(str)) {
            return null;
        }
        C1766610w4Z c1766610w4ZLJIIIIZZ = LJIIIIZZ(str);
        SoftReference<C0N0Y> softReference = c1766610w4ZLJIIIIZZ.LIZ;
        if (softReference != null) {
            c0n0y = softReference.get();
        }
        if (c1766610w4ZLJIIIIZZ.LIZJ) {
            if (c0n0y == null) {
                EcomLynxVideoPlayerSettings.LIZ.getClass();
                C0N0Y c0n0yLIZIZ = EcomLynxVideoPlayerSettings.LIZIZ();
                c1766610w4ZLJIIIIZZ.LIZ = new SoftReference<>(c0n0yLIZIZ);
                return c0n0yLIZIZ;
            }
            return c0n0y;
        }
        if (c0n0y != null) {
            c0n0y.release();
        }
        EcomLynxVideoPlayerSettings.LIZ.getClass();
        C0N0Y c0n0yLIZIZ2 = EcomLynxVideoPlayerSettings.LIZIZ();
        c1766610w4ZLJIIIIZZ.LIZ = new SoftReference<>(c0n0yLIZIZ2);
        return c0n0yLIZIZ2;
    }

    @Override // X.InterfaceC1766650w4d
    public final boolean LJI(String str) {
        C1766610w4Z c1766610w4Z;
        if (str == null || (c1766610w4Z = LIZIZ.get(str)) == null || !c1766610w4Z.LIZLLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1766650w4d
    public final C0N0Y LJII(String str) {
        C1766610w4Z c1766610w4Z;
        SoftReference<C0N0Y> softReference;
        if (str == null || LIZJ(str) || (c1766610w4Z = LIZIZ.get(str)) == null || (softReference = c1766610w4Z.LIZ) == null) {
            return null;
        }
        return softReference.get();
    }

    public static void LJIIIZ(String str, boolean z) {
        if (str == null) {
            return;
        }
        C1766610w4Z c1766610w4ZLJIIIIZZ = LJIIIIZZ(str);
        c1766610w4ZLJIIIIZZ.LIZIZ = z;
        if (z && c1766610w4ZLJIIIIZZ.LIZJ) {
            c1766610w4ZLJIIIIZZ.LIZLLL = true;
        }
    }

    @Override // X.InterfaceC1766650w4d
    public final void LIZIZ(String str, boolean z) {
        if (str == null) {
            return;
        }
        LJIIIIZZ(str).LIZJ = z;
    }
}
