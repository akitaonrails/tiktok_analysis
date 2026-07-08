package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703370uQZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(426));
    public static final C01GW LIZIZ;
    public static final CopyOnWriteArrayList<InterfaceC1703530uQp> LIZJ;
    public static final ConcurrentHashMap<String, String> LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(425));
        LIZIZ = c01gwLIZIZ;
        LIZJ = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        LIZLLL = concurrentHashMap;
        C1703380uQa c1703380uQa = new AbstractC1703430uQf() { // from class: X.0uQa
            public static final String LIZJ = "existing_user";

            @Override // X.AbstractC1703340uQW
            public final String LIZJ() {
                return LIZJ;
            }
        };
        LIZJ().getClass();
        ConcurrentHashMap<String, AbstractC1703340uQW<? extends C1238730iL9>> concurrentHashMap2 = C1703360uQY.LIZIZ;
        concurrentHashMap2.put(c1703380uQa.LIZJ(), c1703380uQa);
        C1703440uQg c1703440uQg = C1703440uQg.LIZIZ;
        LIZJ().getClass();
        concurrentHashMap2.put(c1703440uQg.LIZJ(), c1703440uQg);
        C1703450uQh c1703450uQh = new C1703450uQh();
        c01gwLIZIZ.getValue().getClass();
        ConcurrentHashMap<String, InterfaceC1703280uQQ<? extends C1238730iL9>> concurrentHashMap3 = C1703350uQX.LIZIZ;
        concurrentHashMap3.put("new_user_data_resource", c1703450uQh);
        C1703390uQb c1703390uQb = new C1703390uQb();
        c01gwLIZIZ.getValue().getClass();
        concurrentHashMap3.put("existing_user_data_resource", c1703390uQb);
        concurrentHashMap.put("new_user", "new_user_data_resource");
        concurrentHashMap.put("existing_user", "existing_user_data_resource");
    }

    public static C1703360uQY LIZJ() {
        return (C1703360uQY) LIZ.getValue();
    }

    public static void LIZIZ(String str) throws Exception {
        LIZJ().getClass();
        AbstractC1703340uQW abstractC1703340uQWLIZ = C1703360uQY.LIZ(str);
        final String str2 = LIZLLL.get(str);
        if (str2 == null) {
            return;
        }
        LIZIZ.getValue().getClass();
        InterfaceC1703280uQQ<? extends C1238730iL9> interfaceC1703280uQQ = C1703350uQX.LIZIZ.get(str2);
        if (interfaceC1703280uQQ != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1703290uQR(abstractC1703340uQWLIZ, interfaceC1703280uQQ, null), 3);
            return;
        }
        throw new Exception(str2) { // from class: X.0DlV
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Data resource [");
                sbLIZ.append(str2);
                sbLIZ.append("] is not registered");
                super(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public static void LIZ(Context context, String str) throws Exception {
        LIZJ().getClass();
        AbstractC1703340uQW abstractC1703340uQWLIZ = C1703360uQY.LIZ(str);
        String strLIZJ = abstractC1703340uQWLIZ.LIZJ();
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        if (Intrinsics.LJFF(strLIZJ, "new_user")) {
            strLIZJ = "signup";
        } else if (Intrinsics.LJFF(strLIZJ, "existing_user")) {
            strLIZJ = "settings";
        }
        interfaceC1519030pdFLIZJ.LIZ("change_region_handle_click", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, strLIZJ)));
        abstractC1703340uQWLIZ.LIZIZ(context);
    }
}
