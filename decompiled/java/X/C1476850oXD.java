package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476850oXD implements InterfaceC1475640oVG {
    @Override // X.InterfaceC1475640oVG
    public final void LIZ(InterfaceC1475360oUo interfaceC1475360oUo) {
    }

    @Override // X.InterfaceC1475640oVG
    public final C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
        C1477120oXe c1477120oXe = new C1477120oXe();
        c1477120oXe.LLIZ.append("LowestBitrateSelector");
        c1477120oXe.LLIZLLLIL = "Lowest";
        if (list != null && !list.isEmpty()) {
            InterfaceC1477220oXo interfaceC1477220oXo = (InterfaceC1477220oXo) ListProtector.get(list, 0);
            for (InterfaceC1477220oXo interfaceC1477220oXo2 : list) {
                if (interfaceC1477220oXo2.getBitRate() < interfaceC1477220oXo.getBitRate()) {
                    interfaceC1477220oXo = interfaceC1477220oXo2;
                }
            }
            c1477120oXe.LLIZ.append(", select min");
            c1477120oXe.LLILZLL = interfaceC1477220oXo.getBitRate();
            c1477120oXe.LL = interfaceC1477220oXo;
            return c1477120oXe;
        }
        c1477120oXe.LLIZ.append(", bitrate list is empty");
        c1477120oXe.LLILZIL = new C1477070oXZ(0, "bitrate list is empty...");
        return c1477120oXe;
    }
}
