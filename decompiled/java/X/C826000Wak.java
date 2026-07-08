package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826000Wak {
    public static InterfaceC826020Wam LIZ;
    public static final C1895507bd LIZIZ = new InterfaceC1895607be() { // from class: X.07bd
        @Override // X.InterfaceC1895607be
        public final String LIZ(String str, String str2, Object[] objArr) {
            StringBuilder sb = new StringBuilder();
            if (objArr != null) {
                if (objArr.length != 0) {
                    for (Object obj : objArr) {
                        if ((obj instanceof String) || (obj instanceof Number)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('-');
                            sbLIZ.append(obj);
                            sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('-');
            sbLIZ2.append(str2);
            sbLIZ2.append((Object) sb);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
    };
    public static final Map<Integer, C826010Wal> LIZJ = new LinkedHashMap();

    public static void LIZ(int i, InterfaceC826050Wap interfaceC826050Wap, InterfaceC826030Wan interfaceC826030Wan, InterfaceC826040Wao interfaceC826040Wao) {
        C1895507bd c1895507bd = LIZIZ;
        Map<Integer, C826010Wal> map = LIZJ;
        synchronized (map) {
            try {
                map.put(Integer.valueOf(i), new C826010Wal(interfaceC826030Wan, interfaceC826050Wap, c1895507bd, interfaceC826040Wao));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
