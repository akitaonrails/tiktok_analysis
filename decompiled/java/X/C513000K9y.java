package X;

import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513000K9y implements InterfaceC1096630edx {
    public static final C513000K9y LIZ;
    public static final HashMap<Integer, InterfaceC513010K9z> LIZIZ;
    public static int LIZJ;

    @Override // X.InterfaceC1096630edx
    public final int LIZLLL() {
        return 8;
    }

    @Override // X.InterfaceC1096630edx
    public final void LJI() {
    }

    static {
        C513000K9y c513000K9y = new C513000K9y();
        LIZ = c513000K9y;
        LIZIZ = new HashMap<>();
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).uW1(c513000K9y);
    }

    @Override // X.InterfaceC1096630edx
    public final void LIZ() {
        InterfaceC513010K9z interfaceC513010K9z = LIZIZ.get(Integer.valueOf(LIZJ));
        if (interfaceC513010K9z != null) {
            interfaceC513010K9z.LIZ();
        }
    }

    @Override // X.InterfaceC1096630edx
    public final boolean LIZIZ() {
        InterfaceC513010K9z interfaceC513010K9z = LIZIZ.get(Integer.valueOf(LIZJ));
        return interfaceC513010K9z != null && interfaceC513010K9z.LIZIZ();
    }

    @Override // X.InterfaceC1096630edx
    public final Map<Integer, List<String>> LIZJ() {
        InterfaceC513010K9z interfaceC513010K9z;
        int i = LIZJ;
        if (i != 1) {
            if (i != 3 || (interfaceC513010K9z = LIZIZ.get(3)) == null) {
                return null;
            }
            return interfaceC513010K9z.LIZJ();
        }
        InterfaceC513010K9z interfaceC513010K9z2 = LIZIZ.get(1);
        if (interfaceC513010K9z2 != null) {
            return interfaceC513010K9z2.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1096630edx
    public final boolean LJ(boolean z) {
        Iterator<T> it2 = LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (((InterfaceC513010K9z) ((Map.Entry) it2.next()).getValue()).isShowing()) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIIIZZ(int i, InterfaceC513010K9z interfaceC513010K9z) {
        HashMap<Integer, InterfaceC513010K9z> map = LIZIZ;
        if (Intrinsics.LJFF(map.get(Integer.valueOf(i)), interfaceC513010K9z)) {
            map.remove(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC1096630edx
    public final boolean LJFF(String str, Object obj) {
        InterfaceC513010K9z interfaceC513010K9z = LIZIZ.get(Integer.valueOf(LIZJ));
        if (interfaceC513010K9z != null && interfaceC513010K9z.LJ(str)) {
            return true;
        }
        return false;
    }

    public final boolean LJII(InterfaceC513010K9z interfaceC513010K9z, DataChannel dataChannel) {
        LIZIZ.put(Integer.valueOf(interfaceC513010K9z.LIZLLL()), interfaceC513010K9z);
        LIZJ = interfaceC513010K9z.LIZLLL();
        return ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).qD0(this, dataChannel).LIZ;
    }
}
