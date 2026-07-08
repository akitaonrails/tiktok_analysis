package X;

import Y.AObjectS55S0000000_2;
import android.os.Build;
import android.view.Surface;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472280oPq {
    public static final ConcurrentHashMap<Surface, InterfaceC1472350oPx> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS55S0000000_2(41));

    public static boolean LIZLLL() {
        return ((Boolean) C1474810oTv.n5.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 29;
    }

    public static boolean LIZJ() {
        return LIZLLL() && ((Boolean) C1474810oTv.u5.getValue()).booleanValue();
    }

    public static void LIZ(InterfaceC1472350oPx interfaceC1472350oPx) {
        if (interfaceC1472350oPx == null || !LIZLLL()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            interfaceC1472350oPx.destroy();
        }
        LJ(interfaceC1472350oPx);
    }

    public static InterfaceC1472350oPx LIZIZ(Surface surface) {
        if (surface == null || !LIZLLL()) {
            return null;
        }
        for (Map.Entry<Surface, InterfaceC1472350oPx> entry : LIZ.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), surface)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static void LJ(InterfaceC1472350oPx interfaceC1472350oPx) {
        Iterator<Map.Entry<Surface, InterfaceC1472350oPx>> it2 = LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getValue(), interfaceC1472350oPx)) {
                it2.remove();
                return;
            }
        }
    }
}
