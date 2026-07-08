package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptConfigV2;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080S {
    public static void LIZJ(Object obj, List list) {
        Object c098200Yq;
        Object c098200Yq2;
        String strLIZIZ;
        try {
            if (obj instanceof String) {
                strLIZIZ = (String) obj;
            } else {
                strLIZIZ = C20485080t.LIZIZ(obj);
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
            }
            c098200Yq = new JSONObject(strLIZIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Regex regex = C09ZZ.LIZ;
            try {
                c098200Yq2 = C09ZZ.LIZIZ(str, jSONObject);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            arrayList2.add(c098200Yq2);
        }
        for (List list2 : arrayList2) {
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next());
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C1766300w44.LIZ.LIZ((String) it4.next(), jSONObject);
        }
    }

    public static void LIZ(EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig interceptConfig, Request request, Object obj) {
        try {
            for (EcMobSpliceCheckNetworkInterceptConfigV2.CacheKeyEntity cacheKeyEntity : interceptConfig.cacheKeyEntities) {
                int i = cacheKeyEntity.cacheKeySource;
                if (i == EnumC1981007pQ.QUERY.getValue()) {
                    LIZIZ(cacheKeyEntity.path, request, obj);
                } else if (i == EnumC1981007pQ.BODY.getValue()) {
                    LIZJ(obj, cacheKeyEntity.path);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(List list, Request request, Object obj) {
        Object c098200Yq;
        String string;
        Object c098200Yq2;
        LinkedHashMap linkedHashMap;
        String strLIZIZ;
        String strDecode = "";
        if (request == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                strLIZIZ = (String) obj;
            } else {
                strLIZIZ = C20485080t.LIZIZ(obj);
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
            }
            c098200Yq = new JSONObject(strLIZIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                TypedOutput body = request.getBody();
                if (body != null) {
                    body.writeTo(byteArrayOutputStream);
                }
                string = byteArrayOutputStream.toString();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                string = "";
            }
            try {
                strDecode = URLDecoder.decode(string, StandardCharsets.UTF_8.name());
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                c098200Yq2 = (Map) C1280004ze.LIZIZ(strDecode, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W6
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj2 = c098200Yq2;
            }
            Map map = (Map) obj2;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                try {
                    if (C123100dR.LIZ(strDecode)) {
                        Iterator it2 = a0.LJJLIIIJILLIZJL(strDecode, new String[]{"&"}, 0, 6).iterator();
                        while (it2.hasNext()) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                                linkedHashMap.put(listLJJLIIIJILLIZJL.get(0), listLJJLIIIJILLIZJL.get(1));
                            }
                        }
                    }
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(linkedHashMap.get(it3.next()));
            }
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (C123100dR.LIZ((String) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            for (String str : arrayList2) {
                if (str != null) {
                    C1766300w44.LIZ.LIZ(str, jSONObject);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                byteArrayOutputStream.close();
                throw th3;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                throw th3;
            }
        }
    }
}
