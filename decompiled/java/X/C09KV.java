package X;

import Y.AObjectS109S0000000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09KV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09KV {
    public final C0VSJ LIZ;

    public final LinkedHashMap<String, Long> LIZIZ() {
        Object obj;
        LinkedHashMap linkedHashMap;
        if (!this.LIZ.exists()) {
            return new LinkedHashMap<>();
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(C09BH.LJI(this.LIZ, StandardCharsets.UTF_8)).optJSONObject("files");
            if (jSONObjectOptJSONObject == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        linkedHashMap.put(next, Long.valueOf(jSONObjectOptJSONObject2.optLong("createTime", 0L)));
                    }
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object linkedHashMap2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        return (LinkedHashMap) linkedHashMap2;
    }

    public C09KV(C1304160k2g c1304160k2g) {
        C09KY.LIZ.getClass();
        C09KX c09kxLJFF = C09KY.LJFF(c1304160k2g);
        String strLJJIJIL = C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(c09kxLJFF.LIZ.getPath().getBytes(StandardCharsets.UTF_8)), "", new AObjectS109S0000000_3(1));
        this.LIZ = new C0VSJ(c09kxLJFF.LJ, strLJJIJIL + ".json");
    }

    public final synchronized List<C09KW> LIZ(Function1<? super String, ? extends File> function1) {
        ArrayList<C09KW> arrayList;
        LinkedHashMap<String, Long> linkedHashMapLIZIZ = LIZIZ();
        arrayList = new ArrayList();
        boolean z = false;
        for (Map.Entry<String, Long> entry : linkedHashMapLIZIZ.entrySet()) {
            String key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            File fileInvoke = function1.invoke(key);
            if (fileInvoke != null && fileInvoke.exists() && !fileInvoke.isDirectory()) {
                arrayList.add(new C09KW(key, jLongValue));
            } else {
                z = true;
            }
        }
        if (z) {
            LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
            for (C09KW c09kw : arrayList) {
                linkedHashMap.put(c09kw.LIZ, Long.valueOf(c09kw.LIZIZ));
            }
            LIZJ(linkedHashMap);
        }
        return arrayList;
    }

    public final void LIZJ(LinkedHashMap<String, Long> linkedHashMap) throws Throwable {
        File parentFile = this.LIZ.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Long> entry : linkedHashMap.entrySet()) {
            jSONObject2.put(entry.getKey(), new JSONObject().put("createTime", entry.getValue().longValue()));
        }
        jSONObject.put("files", jSONObject2);
        C0VSJ c0vsj = new C0VSJ(this.LIZ.getParentFile(), this.LIZ.getName() + ".tmp");
        C09BH.LJIIIZ(c0vsj, C786410Ut5.J3(jSONObject), StandardCharsets.UTF_8);
        if (this.LIZ.exists() && !this.LIZ.delete()) {
            c0vsj.delete();
            throw new IllegalStateException("failed to replace manifest");
        }
        if (!c0vsj.renameTo(this.LIZ)) {
            C08QA.LJIILLIIL(c0vsj, this.LIZ, true, 4);
            c0vsj.delete();
        }
    }

    public final synchronized void LJ(String str) {
        LinkedHashMap<String, Long> linkedHashMapLIZIZ = LIZIZ();
        if (linkedHashMapLIZIZ.remove(str) != null) {
            LIZJ(linkedHashMapLIZIZ);
        }
    }

    public static void LIZLLL(C09KV c09kv, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        synchronized (c09kv) {
            LinkedHashMap<String, Long> linkedHashMapLIZIZ = c09kv.LIZIZ();
            linkedHashMapLIZIZ.put(str, Long.valueOf(jCurrentTimeMillis));
            c09kv.LIZJ(linkedHashMapLIZIZ);
        }
    }

    public final synchronized void LJFF(String str, String str2) {
        LinkedHashMap<String, Long> linkedHashMapLIZIZ = LIZIZ();
        Long lRemove = linkedHashMapLIZIZ.remove(str);
        linkedHashMapLIZIZ.remove(str2);
        if (lRemove != null) {
            linkedHashMapLIZIZ.put(str2, lRemove);
        }
        LIZJ(linkedHashMapLIZIZ);
    }
}
