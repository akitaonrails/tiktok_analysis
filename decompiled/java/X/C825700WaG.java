package X;

import com.bytedance.pumbaa.app2app.data.App2AppData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0WaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825700WaG implements InterfaceC825780WaO {
    public static final C825700WaG LIZ = new C825700WaG();
    public static final CopyOnWriteArraySet<InterfaceC825780WaO> LIZIZ;
    public static final CopyOnWriteArraySet<InterfaceC825760WaM> LIZJ;

    static {
        CopyOnWriteArraySet<InterfaceC825780WaO> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        LIZIZ = copyOnWriteArraySet;
        LIZJ = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(C825690WaF.LIZ);
    }

    @Override // X.InterfaceC825780WaO
    public final boolean LIZ(int i, App2AppData app2AppData) {
        Iterator<InterfaceC825780WaO> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZ(i, app2AppData)) {
                return true;
            }
        }
        return false;
    }
}
