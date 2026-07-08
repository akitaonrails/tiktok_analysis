package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BXD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BXD {
    public static C1BXD LJ;
    public final C1BXV LIZ;
    public final C1BXF LIZIZ = new C1BXF();
    public final List<C1BY0> LIZJ;
    public final Map<String, C1BY2> LIZLLL;

    public static C1BXD LIZIZ() {
        C1BXD c1bxd = LJ;
        if (c1bxd != null) {
            return c1bxd;
        }
        throw new RuntimeException("NewLego has not been initialized. Please build it first.");
    }

    public C1BXD(C1BX9 c1bx9) {
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LIZLLL = new LinkedHashMap();
        this.LIZ = c1bx9.LIZJ;
        arrayList.addAll(c1bx9.LIZIZ);
        for (Object obj : (ArrayList) c1bx9.LIZ) {
            C1BXF c1bxf = this.LIZIZ;
            c1bxf.getClass();
            if (obj.getClass().isAnnotationPresent(C1BXY.class)) {
                c1bxf.LIZ.put(((C1BXY) obj.getClass().getAnnotation(C1BXY.class)).name(), (C1BXE<?>) obj);
            } else {
                throw new RuntimeException("Engine must be annotated with @EngineDefine");
            }
        }
    }

    public final C1BXZ LIZ(String str) {
        C1BXF c1bxf = this.LIZIZ;
        C1BXE<?> c1bxe = (C1BXE) ((LinkedHashMap) c1bxf.LIZ).get(str);
        if (c1bxe != null) {
            C1BXZ c1bxz = (C1BXZ) ((LinkedHashMap) c1bxf.LIZIZ).get(c1bxe);
            if (c1bxz == null) {
                Class<?> clsLIZ = c1bxe.LIZ();
                if (clsLIZ.isAnnotationPresent(InterfaceC2206441BXe.class)) {
                    try {
                        C2206521BXm c2206521BXm = new C2206521BXm(str, c1bxe.LIZJ(), clsLIZ, c1bxe.LIZIZ());
                        c1bxf.LIZIZ.put(c1bxe, c2206521BXm);
                        return c2206521BXm;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EngineServiceImpl create failed: ");
                        sbLIZ.append(clsLIZ.getSimpleName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th);
                    }
                }
                throw new RuntimeException("Provider must be annotated with @ProviderDefine");
            }
            return c1bxz;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Engine not found: ");
        sbLIZ2.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
