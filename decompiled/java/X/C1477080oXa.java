package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477080oXa extends AbstractC1477410oY7 {
    public InterfaceC1475640oVG LJ;

    public C1477080oXa(InterfaceC1477480oYE interfaceC1477480oYE) {
        super(interfaceC1477480oYE);
    }

    @Override // X.InterfaceC1475640oVG
    public final C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
        C1477120oXe c1477120oXe = new C1477120oXe();
        c1477120oXe.LLIZLLLIL = "Intelligent";
        if (list != null && !list.isEmpty()) {
            List<? extends InterfaceC1477220oXo> listLIZJ = LIZJ(list);
            if (((ArrayList) listLIZJ).isEmpty()) {
                c1477120oXe.LLILZIL = new C1477070oXZ(5, "Intersection bitrate list is empty.");
                return c1477120oXe;
            }
            try {
                Object obj = map.get("internet_speed");
                if (obj instanceof Number) {
                    int iIntValue = ((Integer) obj).intValue();
                    InterfaceC1475640oVG interfaceC1475640oVG = this.LJ;
                    C1477030oXV c1477030oXV = new C1477030oXV();
                    c1477030oXV.LIZ(iIntValue);
                    c1477120oXe = interfaceC1475640oVG.LIZIZ(listLIZJ, c1477030oXV.LIZ);
                    c1477120oXe.getClass();
                    return c1477120oXe;
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return c1477120oXe;
        }
        c1477120oXe.LLILZIL = new C1477070oXZ(0, "bitrate list is empty...");
        return c1477120oXe;
    }
}
