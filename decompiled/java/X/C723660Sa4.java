package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Sa4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723660Sa4 {
    public final Map<LifecycleOwner, AssemSupervisor> LIZ = new ConcurrentHashMap();
    public final Map<LifecycleOwner, C0RTY> LIZIZ = new ConcurrentHashMap();
    public final Map<LifecycleOwner, C724710Sbl> LIZJ = new ConcurrentHashMap();
    public final Map<LifecycleOwner, AbstractC724210Sax> LIZLLL = new ConcurrentHashMap();

    public static C0RTY LIZ(C723660Sa4 c723660Sa4, LifecycleOwner lifecycleOwner) {
        C0RTY c0rty = (C0RTY) ((ConcurrentHashMap) c723660Sa4.LIZIZ).get(lifecycleOwner);
        if (c0rty == null) {
            AssemSupervisor assemSupervisor = (AssemSupervisor) ((ConcurrentHashMap) c723660Sa4.LIZ).get(lifecycleOwner);
            if (assemSupervisor != null) {
                return assemSupervisor.LJ();
            }
            return null;
        }
        return c0rty;
    }
}
