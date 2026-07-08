package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807040VlG {
    public final C807020VlE LIZ = new C807020VlE();

    public final void LIZIZ(String str, EnumC807010VlD enumC807010VlD) {
        C807090VlL c807090VlLLIZIZ = C0VGA.LIZIZ(str);
        if (c807090VlLLIZIZ != null) {
            this.LIZ.getClass();
            c807090VlLLIZIZ.LIZJ = enumC807010VlD;
        }
    }

    public final void LIZJ(String str, C807210VlX c807210VlX) {
        C807090VlL c807090VlLLIZIZ = C0VGA.LIZIZ(str);
        if (c807090VlLLIZIZ != null) {
            this.LIZ.getClass();
            c807090VlLLIZIZ.LIZLLL = c807210VlX;
        }
    }

    public final void LIZ(long j, String str, boolean z) {
        InterfaceC807030VlF interfaceC807030VlF;
        if (Intrinsics.LJFF(C0VGA.LIZ().checkAndReportLog, Boolean.TRUE)) {
            C0VGA.LJIIIIZZ(AFwS247S0000000_13.get$arr$(46));
        }
        C807160VlS c807160VlSRemove = C0VGA.LIZ.remove(str);
        if (c807160VlSRemove != null) {
            this.LIZ.getClass();
            Object obj = c807160VlSRemove.LIZLLL;
            if (obj instanceof InterfaceC807030VlF) {
                interfaceC807030VlF = (InterfaceC807030VlF) obj;
            } else {
                interfaceC807030VlF = null;
            }
            if (z) {
                if (interfaceC807030VlF != null) {
                    interfaceC807030VlF.cancel();
                }
            } else if (interfaceC807030VlF != null) {
                interfaceC807030VlF.LIZLLL(j);
            }
            Iterator<Map.Entry<String, C807090VlL>> it2 = C0VGA.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getValue().LIZIZ.LIZ, str)) {
                    it2.remove();
                }
            }
        }
    }
}
