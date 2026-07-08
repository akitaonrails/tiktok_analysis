package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.lang.ref.SoftReference;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0w4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766660w4e implements InterfaceC1766650w4d {
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C1766660w4e LIZ = new C1766660w4e();
    public static boolean LIZIZ = true;
    public static final ArrayMap<String, SoftReference<C0N0Y>> LIZJ = new ArrayMap<>();
    public static boolean LJFF = true;

    @Override // X.InterfaceC1766650w4d
    public final boolean LIZ(String str) {
        return LIZIZ;
    }

    @Override // X.InterfaceC1766650w4d
    public final boolean LIZJ(String str) {
        return LIZLLL;
    }

    @Override // X.InterfaceC1766650w4d
    public final void LIZLLL(String str) {
        C0N0Y c0n0y;
        if (str != null && !a0.LJJJIL(str) && !LIZLLL) {
            ArrayMap<String, SoftReference<C0N0Y>> arrayMap = LIZJ;
            if (arrayMap.containsKey(str)) {
                SoftReference<C0N0Y> softReference = arrayMap.get(str);
                if (softReference != null && (c0n0y = softReference.get()) != null) {
                    c0n0y.release();
                }
                arrayMap.remove(str);
            }
        }
    }

    @Override // X.InterfaceC1766650w4d
    public final void LJ(String str) {
        LJ = false;
    }

    @Override // X.InterfaceC1766650w4d
    public final C0N0Y LJFF(String str) {
        boolean z;
        SoftReference<C0N0Y> softReference;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || LIZLLL) {
            return null;
        }
        if (!LIZIZ) {
            LIZLLL(str);
            ArrayMap<String, SoftReference<C0N0Y>> arrayMap = LIZJ;
            EcomLynxVideoPlayerSettings.LIZ.getClass();
            arrayMap.put(str, new SoftReference<>(EcomLynxVideoPlayerSettings.LIZIZ()));
        } else {
            ArrayMap<String, SoftReference<C0N0Y>> arrayMap2 = LIZJ;
            if (!arrayMap2.containsKey(str) || (softReference = arrayMap2.get(str)) == null || softReference.get() == null) {
                EcomLynxVideoPlayerSettings.LIZ.getClass();
                arrayMap2.put(str, new SoftReference<>(EcomLynxVideoPlayerSettings.LIZIZ()));
                LJFF = true;
            }
        }
        SoftReference<C0N0Y> softReference2 = LIZJ.get(str);
        if (softReference2 == null) {
            return null;
        }
        return softReference2.get();
    }

    @Override // X.InterfaceC1766650w4d
    public final boolean LJI(String str) {
        return LJ;
    }

    @Override // X.InterfaceC1766650w4d
    public final C0N0Y LJII(String str) {
        boolean z;
        SoftReference<C0N0Y> softReference;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || LIZLLL) {
            return null;
        }
        ArrayMap<String, SoftReference<C0N0Y>> arrayMap = LIZJ;
        if (!arrayMap.containsKey(str) || (softReference = arrayMap.get(str)) == null) {
            return null;
        }
        return softReference.get();
    }

    @Override // X.InterfaceC1766650w4d
    public final void LIZIZ(String str, boolean z) {
        LIZIZ = z;
    }
}
