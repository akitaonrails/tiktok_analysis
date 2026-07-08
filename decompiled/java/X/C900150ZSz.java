package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ZSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900150ZSz {
    public final Keva LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final ConcurrentHashMap<String, Long> LIZLLL;
    public final ConcurrentHashMap<String, Long> LJ;

    public C900150ZSz() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe");
        sbLIZ.append("_task_mapping");
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = repo;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("vibe");
        sbLIZ2.append("_task_mapping_key");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZIZ = strLIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("vibe");
        sbLIZ3.append("_task_create_time_key");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        this.LIZJ = strLIZIZ2;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("vibe");
        sbLIZ4.append("_status_manager");
        C2188811AlT.LIZIZ(sbLIZ4);
        ConcurrentHashMap<String, Long> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZLLL = concurrentHashMap;
        ConcurrentHashMap<String, Long> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.LJ = concurrentHashMap2;
        try {
            Gson gson = C09EF.LIZ;
            concurrentHashMap.putAll((Map) gson.LJIIIIZZ(repo.getString(strLIZIZ, ""), new TypeToken<Map<String, ? extends Long>>() { // from class: X.00Wf
            }.getType()));
            concurrentHashMap2.putAll((Map) gson.LJIIIIZZ(repo.getString(strLIZIZ2, ""), new TypeToken<Map<String, ? extends Long>>() { // from class: X.00Wg
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(C869590Y9l c869590Y9l) {
        c869590Y9l.getLocalExt().put("local_ext_dynamic_hide_card", "1");
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "local_ext_dynamic_hide_card", new C0Y3R("1"), new C0Y3I("check dynamic card center hide status"));
    }
}
