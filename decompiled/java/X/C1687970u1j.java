package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS234S0300000_25;

/* JADX INFO: renamed from: X.0u1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687970u1j {
    public static final C05P0 LIZ(LiveData liveData, InterfaceC1680500tpg interfaceC1680500tpg) {
        return LIZIZ(liveData, liveData.getValue(), interfaceC1680500tpg, 0);
    }

    public static final C05P0 LIZIZ(LiveData liveData, Object obj, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) interfaceC1680500tpg.LJJIL(C13GF.LIZ);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj2 = C1680510tph.LIZIZ;
        if (objLJJ == obj2) {
            if (liveData.isInitialized()) {
                obj = liveData.getValue();
            }
            objLJJ = C20028913Yh.LJI(obj);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        boolean zLJII = interfaceC1680500tpg.LJII(liveData) | interfaceC1680500tpg.LJII(lifecycleOwner);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == obj2) {
            objLJJ2 = new AwS234S0300000_25(liveData, (LiveData<Object>) lifecycleOwner, (LifecycleOwner) c05p0, (C05P0<Object>) 39);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C1680540tpk.LIZ(liveData, lifecycleOwner, (Function1) objLJJ2, interfaceC1680500tpg);
        return c05p0;
    }
}
