package X;

import com.bytedance.i18n.region.RegionManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: renamed from: X.0XLD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XLD {
    public abstract C847070XKv LIZ();

    public abstract String LIZIZ();

    public final void LIZJ() {
        C1798060wtI c1798060wtI = C1798060wtI.LIZ;
        String strLIZIZ = LIZIZ();
        RegionManager regionManager = C1798060wtI.LIZJ;
        if (!C1798060wtI.LIZIZ() || regionManager == null) {
            return;
        }
        C0XLD c0xld = regionManager.LJFF.get(strLIZIZ);
        if (c0xld == null) {
            new AwS88S1000000_3(strLIZIZ, 1);
            return;
        }
        C847070XKv c847070XKvLIZ = c0xld.LIZ();
        ((LinkedHashMap) regionManager.LJI).get(strLIZIZ);
        regionManager.LJI.put(strLIZIZ, c847070XKvLIZ);
        Iterator<C0XLF> it2 = regionManager.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(strLIZIZ, c847070XKvLIZ);
        }
    }
}
