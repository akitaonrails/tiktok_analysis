package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTK implements C0ZTQ {
    public final Keva LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ConcurrentHashMap<String, Long> LJ;
    public final ConcurrentHashMap<String, Long> LJFF;

    public final void LIZLLL() {
        ConcurrentHashMap<String, Long> concurrentHashMap = this.LJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().longValue() + C911570ZpT.LIZ().statusMappingActiveTime >= System.currentTimeMillis()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Object key = ((Map.Entry) it2.next()).getKey();
            this.LJ.remove(key);
            this.LJFF.remove(key);
            Keva keva = this.LIZ;
            String str = this.LIZIZ;
            Gson gson = C09EF.LIZ;
            keva.storeString(str, GsonProtectorUtils.toJson(gson, this.LJ));
            this.LIZ.storeString(this.LIZJ, GsonProtectorUtils.toJson(gson, this.LJFF));
        }
    }

    public C0ZTK(C0ZTL c0ztl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0ztl.getTag());
        sbLIZ.append("_task_mapping");
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = repo;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0ztl.getTag());
        sbLIZ2.append("_task_mapping_key");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZIZ = strLIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c0ztl.getTag());
        sbLIZ3.append("_task_create_time_key");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        this.LIZJ = strLIZIZ2;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(c0ztl.getTag());
        sbLIZ4.append("_status_manager");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
        ConcurrentHashMap<String, Long> concurrentHashMap = new ConcurrentHashMap<>();
        this.LJ = concurrentHashMap;
        ConcurrentHashMap<String, Long> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.LJFF = concurrentHashMap2;
        try {
            Gson gson = C09EF.LIZ;
            concurrentHashMap.putAll((Map) gson.LJIIIIZZ(repo.getString(strLIZIZ, ""), new TypeToken<Map<String, ? extends Long>>() { // from class: X.0ZTN
            }.getType()));
            concurrentHashMap2.putAll((Map) gson.LJIIIIZZ(repo.getString(strLIZIZ2, ""), new TypeToken<Map<String, ? extends Long>>() { // from class: X.0ZTO
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0ZTQ
    public final long LIZJ(String str) {
        Long l = this.LJ.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.C0ZTQ
    public final void LIZ(long j, String str) {
        long jLongValue;
        Long l = this.LJ.get(str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue >= j) {
            return;
        }
        this.LJ.put(str, Long.valueOf(j));
        String str2 = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateIndex: taskId ");
        sbLIZ.append(str);
        sbLIZ.append(" , index ");
        sbLIZ.append(j);
        C0YS1.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ));
        Keva keva = this.LIZ;
        String str3 = this.LIZIZ;
        Gson gson = C09EF.LIZ;
        keva.storeString(str3, GsonProtectorUtils.toJson(gson, this.LJ));
        if (!this.LJFF.contains(str)) {
            this.LJFF.put(str, Long.valueOf(System.currentTimeMillis()));
            this.LIZ.storeString(this.LIZJ, GsonProtectorUtils.toJson(gson, this.LJFF));
        }
    }

    @Override // X.C0ZTQ
    public final boolean LIZIZ(C869590Y9l c869590Y9l, BaseInteractiveTaskTemplate baseInteractiveTaskTemplate) {
        C0ZTQ c0ztq;
        int messageType = baseInteractiveTaskTemplate.getMessageType();
        if (messageType != 1812) {
            if (messageType != 1816) {
                return false;
            }
            c0ztq = C0ZTP.LIZIZ;
        } else {
            c0ztq = C0ZTM.LIZIZ;
        }
        long index = c869590Y9l.getIndex();
        c0ztq.LIZ(index, baseInteractiveTaskTemplate.getTaskId());
        if (baseInteractiveTaskTemplate.Jv() || Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_group_shot_hide_card"), "1") || C0ZDX.LJJJJZ(c869590Y9l)) {
            return true;
        }
        long jLIZJ = c0ztq.LIZJ(baseInteractiveTaskTemplate.getTaskId());
        if (jLIZJ <= index) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide card: lastIndex ");
        sbLIZ.append(jLIZJ);
        sbLIZ.append(", currentIndex ");
        sbLIZ.append(index);
        C2188811AlT.LIZIZ(sbLIZ);
        c869590Y9l.getLocalExt().put("local_ext_group_shot_hide_card", "1");
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "local_ext_group_shot_hide_card", new C0Y3R("1"), new C0Y3I("check group shot hide status"));
        return true;
    }
}
