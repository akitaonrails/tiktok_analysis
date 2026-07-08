package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204651BQh {
    public final LruCache<String, C2204661BQi> LIZIZ;
    public final InterfaceC2204671BQj LIZJ;
    public final String LIZLLL;
    public Map<String, List<C1059330dfn>> LIZ = new ConcurrentHashMap();
    public volatile boolean LJ = false;

    public static String LIZJ(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("[.]")).length) < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strArrSplit[length - 2]);
        sbLIZ.append(e3.d);
        sbLIZ.append(strArrSplit[length - 1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1059330dfn LJ(JSONObject jSONObject) {
        C1059330dfn c1059330dfn = new C1059330dfn();
        c1059330dfn.LIZ = PatternProtector.compile(JSONObjectProtectorUtils.getString(jSONObject, "pattern"));
        c1059330dfn.LIZIZ = EnumC1062390dkj.from(JSONObjectProtectorUtils.getString(jSONObject, "group"));
        c1059330dfn.LIZJ = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("included_methods");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                c1059330dfn.LIZJ.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i));
            }
        }
        c1059330dfn.LIZLLL = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                c1059330dfn.LIZLLL.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray2, i2));
            }
        }
        return c1059330dfn;
    }

    public final List<C1059330dfn> LIZ(String str) {
        if (this.LJ) {
            return this.LIZ.get(str);
        }
        throw new C2204681BQk("Permission config is outdated!");
    }

    public final void LIZLLL(List list, JSONObject jSONObject) {
        try {
            C2204811BQx c2204811BQx = new C2204811BQx();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, next);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    copyOnWriteArrayList.add(LJ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)));
                }
                concurrentHashMap.put(next, copyOnWriteArrayList);
                c2204811BQx.LIZJ(Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "package_version")), JSONObjectProtectorUtils.getString(jSONObject, "channel"));
            }
            this.LIZ = concurrentHashMap;
            c2204811BQx.LIZ("label_parse_config", list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parse configurations failed, response: ");
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ);
            if (list != null) {
                C2204811BQx c2204811BQx2 = new C2204811BQx();
                c2204811BQx2.LIZJ(e.getClass().getSimpleName(), "exception_name");
                c2204811BQx2.LIZJ(e.getMessage(), "exception_message");
                c2204811BQx2.LIZJ(C786410Ut5.J3(jSONObject), "value");
                c2204811BQx2.LIZ("label_parse_config_exception", list);
            }
        }
        this.LIZIZ.evictAll();
        this.LJ = true;
    }

    public final C2204661BQi LIZIZ(String str, List<TimeLineEvent> list, C1543850qHH c1543850qHH) {
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        String string = new Uri.Builder().scheme(scheme).authority(authority).path(uri.getPath()).toString();
        C2204661BQi c2204661BQi = new C2204661BQi();
        Object objValueOf = "null";
        if (authority != null && !authority.isEmpty()) {
            C2204661BQi c2204661BQi2 = this.LIZIZ.get(string);
            if (c2204661BQi2 != null) {
                C2204811BQx c2204811BQx = new C2204811BQx();
                c2204811BQx.LIZJ("from_cache", "from");
                c2204811BQx.LIZJ(c2204661BQi2.LIZ.toString(), "rule_permission_group");
                c2204811BQx.LIZJ(c2204661BQi2.LIZIZ.toString(), "rule_included_method");
                c2204811BQx.LIZJ(c2204661BQi2.LIZJ.toString(), "rule_excluded_method");
                c2204811BQx.LIZ("label_permission_checker_cache_rule", list);
                return c2204661BQi2;
            }
            C2204661BQi c2204661BQi3 = new C2204661BQi();
            Uri uri2 = UriProtector.parse(string);
            String scheme2 = uri2.getScheme();
            String authority2 = uri2.getAuthority();
            String strLIZJ = LIZJ(authority2);
            if (!TextUtils.isEmpty(scheme2) && !TextUtils.isEmpty(authority2) && strLIZJ != null) {
                List<C1059330dfn> listLIZ = LIZ(strLIZJ);
                C2204811BQx c2204811BQx2 = new C2204811BQx();
                c2204811BQx2.LIZJ(strLIZJ, "shortened_host");
                if (listLIZ != null) {
                    objValueOf = Integer.valueOf(listLIZ.size());
                }
                c2204811BQx2.LIZJ(objValueOf, "config_size");
                c2204811BQx2.LIZ("label_permission_checker_remote_config", list);
                if (listLIZ == null) {
                    c2204661BQi3.LIZ = EnumC1062390dkj.PUBLIC;
                    this.LIZIZ.put(string, c2204661BQi3);
                    if (c1543850qHH != null) {
                        c1543850qHH.LIZLLL(4);
                    }
                } else {
                    for (C1059330dfn c1059330dfn : listLIZ) {
                        if (c1059330dfn.LIZ.matcher(string).find()) {
                            if (c1059330dfn.LIZIZ.compareTo(c2204661BQi3.LIZ) >= 0) {
                                c2204661BQi3.LIZ = c1059330dfn.LIZIZ;
                            }
                            c2204661BQi3.LIZIZ.addAll(c1059330dfn.LIZJ);
                            c2204661BQi3.LIZJ.addAll(c1059330dfn.LIZLLL);
                        } else if (c1543850qHH != null) {
                            c1543850qHH.LIZLLL(0);
                        }
                    }
                    this.LIZIZ.put(string, c2204661BQi3);
                    C2204811BQx c2204811BQx3 = new C2204811BQx();
                    c2204811BQx3.LIZJ("from_merge", "from");
                    c2204811BQx3.LIZJ(c2204661BQi3.LIZ.toString(), "rule_permission_group");
                    c2204811BQx3.LIZJ(c2204661BQi3.LIZIZ.toString(), "rule_included_method");
                    c2204811BQx3.LIZJ(c2204661BQi3.LIZJ.toString(), "rule_excluded_method");
                    c2204811BQx3.LIZ("label_permission_checker_merge_remote_config", list);
                }
            } else {
                this.LIZIZ.put(string, c2204661BQi3);
                if (c1543850qHH != null) {
                    c1543850qHH.LIZLLL(3);
                }
            }
            C2204811BQx c2204811BQx4 = new C2204811BQx();
            c2204811BQx4.LIZJ("from_create", "from");
            c2204811BQx4.LIZ("label_permission_checker", list);
            return c2204661BQi3;
        }
        C2204811BQx c2204811BQx5 = new C2204811BQx();
        c2204811BQx5.LIZJ("null", "host");
        c2204811BQx5.LIZ("label_permission_checker_null_host", list);
        c2204661BQi.LIZ = EnumC1062390dkj.PUBLIC;
        if (c1543850qHH != null) {
            c1543850qHH.LIZLLL(3);
        }
        return c2204661BQi;
    }

    public C2204651BQh(String str, int i, InterfaceC2204671BQj interfaceC2204671BQj, Executor executor, JSONObject jSONObject, List list, C1BR9 c1br9) {
        this.LIZLLL = str;
        if (i <= 0) {
            this.LIZIZ = new LruCache<>(16);
        } else {
            this.LIZIZ = new LruCache<>(i);
        }
        this.LIZJ = interfaceC2204671BQj;
        if (jSONObject == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.bytedance.ies.web.jsbridge2.PermissionConfig.");
            sbLIZ.append(str);
            interfaceC2204671BQj.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new C2204831BQz(this, list, c1br9, str, executor));
            return;
        }
        LIZLLL(list, jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("com.bytedance.ies.web.jsbridge2.PermissionConfig.");
        sbLIZ2.append(str);
        interfaceC2204671BQj.LIZ(C2188811AlT.LIZIZ(sbLIZ2), C786410Ut5.J3(jSONObject));
    }
}
