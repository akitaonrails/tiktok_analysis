package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08EG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EG {
    public static final C08EG LIZ = new C08EG();
    public static final ConcurrentHashMap<String, C1969907nd> LIZIZ = new ConcurrentHashMap<>();

    public static C1969907nd LIZ(String str) throws Throwable {
        ConcurrentHashMap<String, C1969907nd> concurrentHashMap = LIZIZ;
        C1969907nd c1969907nd = concurrentHashMap.get(str);
        if (c1969907nd != null) {
            a0.LJJJIL(c1969907nd.LJ);
            c1969907nd.LJFF.size();
            Objects.toString(c1969907nd.LJFF);
            c1969907nd.LJI.size();
            return c1969907nd;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dynamic_feature_install/");
        sbLIZ.append(str);
        sbLIZ.append(".json");
        Reader inputStreamReader = new InputStreamReader(C08EH.LIZ().getAssets().open(C2188811AlT.LIZIZ(sbLIZ)), Charsets.UTF_8);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        Throwable th = null;
        try {
            String strLIZJ = C08KC.LIZJ(inputStreamReader);
            C2107108Nh.LIZ(inputStreamReader, null);
            JSONObject jSONObject = new JSONObject(strLIZJ);
            String strOptString = jSONObject.optString("moduleName");
            String strOptString2 = jSONObject.optString("projectPath");
            String strOptString3 = jSONObject.optString("packageName");
            String strOptString4 = jSONObject.optString("className");
            String strOptString5 = jSONObject.optString("soName");
            Set setLIZIZ = LIZIZ(jSONObject.optJSONArray("spiProviderProjects"));
            Set setLIZIZ2 = LIZIZ(jSONObject.optJSONArray("serviceKeys"));
            C1969907nd c1969907nd2 = new C1969907nd(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, setLIZIZ, setLIZIZ2);
            concurrentHashMap.put(str, c1969907nd2);
            a0.LJJJIL(strOptString5);
            setLIZIZ.size();
            Objects.toString(setLIZIZ);
            setLIZIZ2.size();
            return c1969907nd2;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(inputStreamReader, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static Set LIZIZ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C08CX.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArray.optString(i);
            if ((!a0.LJJJIL(strOptString)) && strOptString != null) {
                linkedHashSet.add(strOptString);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C08EJ LIZJ(X.C1969907nd r9) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08EG.LIZJ(X.07nd):X.08EJ");
    }
}
