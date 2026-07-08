package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.b;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JT6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JT6<V> {
    public final C20337914i1<HashMap<String, V>> LIZ;

    public final <V> V LIZ() {
        try {
            HashMap<String, V> mapLIZIZ = this.LIZ.LIZIZ();
            String strValueOf = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            if (mapLIZIZ.containsKey(strValueOf)) {
                V v = mapLIZIZ.get(strValueOf);
                if (v != null) {
                    return v;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                throw e;
            }
        }
        return null;
    }

    public final <V> V LIZIZ(String str) throws Exception {
        try {
            HashMap<String, V> mapLIZIZ = this.LIZ.LIZIZ();
            String strValueOf = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf);
            sbLIZ.append(str);
            if (mapLIZIZ.containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strValueOf);
                sbLIZ2.append(str);
                V v = mapLIZIZ.get(C2188811AlT.LIZIZ(sbLIZ2));
                if (v != null) {
                    return v;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                throw e;
            }
        }
        return null;
    }

    public final void LIZJ(V v) {
        String strValueOf = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        HashMap<String, V> mapLIZIZ = this.LIZ.LIZIZ();
        mapLIZIZ.put(strValueOf, v);
        this.LIZ.LJFF(mapLIZIZ);
    }

    public C0JT6(String str, Type type) {
        this.LIZ = new C20337914i1<>(str, new b.C0011b(null, HashMap.class, String.class, type), new HashMap());
    }

    public final void LIZLLL(Object obj, String str) {
        String strValueOf = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        HashMap<String, V> mapLIZIZ = this.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(str);
        mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
        this.LIZ.LJFF(mapLIZIZ);
    }
}
