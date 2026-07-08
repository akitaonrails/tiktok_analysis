package X;

import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0PtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659230PtR {
    public static View LIZIZ(InterfaceC648130PbX interfaceC648130PbX) {
        if (interfaceC648130PbX.LJJZZI().getViewType() == 1 && (interfaceC648130PbX.LLLLLLLZIL() instanceof View)) {
            return (View) interfaceC648130PbX.LLLLLLLZIL();
        }
        return interfaceC648130PbX.LJJZZI().getItemView();
    }

    public static void LIZ(InterfaceC648130PbX interfaceC648130PbX, final C650630PfZ c650630PfZ) {
        InterfaceC648270Pbl interfaceC648270PblLLLLLLLZIL = interfaceC648130PbX.LLLLLLLZIL();
        if (interfaceC648270PblLLLLLLLZIL instanceof C661460Px2) {
            WeakHashMap weakHashMap = (WeakHashMap) C659240PtS.LIZ;
            Object linkedHashMap = weakHashMap.get(interfaceC648270PblLLLLLLLZIL);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                weakHashMap.put(interfaceC648270PblLLLLLLLZIL, linkedHashMap);
            }
            Map map = (Map) linkedHashMap;
            if (map.get(c650630PfZ) != null) {
                return;
            }
            C659290PtX c659290PtX = new C659290PtX() { // from class: X.0PtQ
                @Override // X.C659290PtX, X.InterfaceC661730PxT
                public final void LIZIZ(int i, int i2, int i3) {
                    c650630PfZ.LJJLIIIJ();
                }
            };
            map.put(c650630PfZ, c659290PtX);
            ((C661460Px2) interfaceC648270PblLLLLLLLZIL).LJIILLIIL(c659290PtX);
            return;
        }
        if (interfaceC648270PblLLLLLLLZIL instanceof C661470Px3) {
            ((C661470Px3) interfaceC648270PblLLLLLLLZIL).setVideoPlayerStatusListener(new InterfaceC661770PxX() { // from class: X.0PtT
                @Override // X.InterfaceC661770PxX
                public final void LIZ(C581630MrZ c581630MrZ) {
                    if (c581630MrZ.LIZ != 7) {
                        return;
                    }
                    c650630PfZ.LJJLIIIJ();
                }
            });
        }
    }

    public static void LIZJ(InterfaceC648130PbX interfaceC648130PbX, C650630PfZ c650630PfZ) {
        InterfaceC648270Pbl interfaceC648270PblLLLLLLLZIL = interfaceC648130PbX.LLLLLLLZIL();
        if (interfaceC648270PblLLLLLLLZIL instanceof C661460Px2) {
            WeakHashMap weakHashMap = (WeakHashMap) C659240PtS.LIZ;
            Map map = (Map) weakHashMap.get(interfaceC648270PblLLLLLLLZIL);
            if (map != null) {
                Object objRemove = map.remove(c650630PfZ);
                if (objRemove != null) {
                    ((ArrayList) ((C661460Px2) interfaceC648270PblLLLLLLLZIL).LLL).remove(objRemove);
                }
                if (map != null && map.isEmpty()) {
                    weakHashMap.remove(interfaceC648270PblLLLLLLLZIL);
                    return;
                }
                return;
            }
            return;
        }
        if (!(interfaceC648270PblLLLLLLLZIL instanceof C661470Px3)) {
            return;
        }
        ((C661470Px3) interfaceC648270PblLLLLLLLZIL).setVideoPlayerStatusListener(null);
    }
}
