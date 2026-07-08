package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.tnc.TNCManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import m14.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490200osk {
    public final Context LIZ;
    public final boolean LIZJ;
    public String LIZLLL = "";
    public C1490210osl LIZIZ = new C1490210osl();

    public static String LIZIZ() {
        if (TextUtils.isEmpty(TNCManager.LJJIIJ)) {
            return null;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(new JSONObject(TNCManager.LJJIIJ), "data");
            Logger.debug();
            return string;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C1490210osl LJ(JSONObject jSONObject) {
        boolean z;
        try {
            ((ConcurrentHashMap) l.LJ().LJIIIZ).clear();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tnc_config");
            C1490210osl c1490210osl = new C1490210osl();
            if (jSONObjectOptJSONObject == null) {
                return c1490210osl;
            }
            boolean z2 = true;
            if (jSONObjectOptJSONObject.has("local_enable")) {
                if (JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject, "local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                c1490210osl.LIZ = z;
            }
            if (jSONObjectOptJSONObject.has("probe_enable")) {
                if (JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject, "probe_enable") == 0) {
                    z2 = false;
                }
                c1490210osl.LIZIZ = z2;
            }
            if (jSONObjectOptJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObjectOptJSONObject, "local_host_filter");
                HashMap map = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(string, 0);
                        }
                    }
                }
                c1490210osl.LIZJ = map;
            } else {
                c1490210osl.LIZJ = null;
            }
            if (jSONObjectOptJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject, "host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            ((ConcurrentHashMap) l.LJ().LJIIIZ).put(next, string2);
                        }
                    }
                }
            }
            c1490210osl.LIZLLL = jSONObjectOptJSONObject.optInt("req_to_cnt", c1490210osl.LIZLLL);
            c1490210osl.LJ = jSONObjectOptJSONObject.optInt("req_to_api_cnt", c1490210osl.LJ);
            c1490210osl.LJFF = jSONObjectOptJSONObject.optInt("req_to_ip_cnt", c1490210osl.LJFF);
            c1490210osl.LJI = jSONObjectOptJSONObject.optInt("req_err_cnt", c1490210osl.LJI);
            c1490210osl.LJII = jSONObjectOptJSONObject.optInt("req_err_api_cnt", c1490210osl.LJII);
            c1490210osl.LJIIIIZZ = jSONObjectOptJSONObject.optInt("req_err_ip_cnt", c1490210osl.LJIIIIZZ);
            c1490210osl.LJIIIZ = jSONObjectOptJSONObject.optInt("update_interval", c1490210osl.LJIIIZ);
            c1490210osl.LJIIJ = jSONObjectOptJSONObject.optInt("update_random_range", c1490210osl.LJIIJ);
            c1490210osl.LJIIJJI = jSONObjectOptJSONObject.optString("http_code_black", c1490210osl.LJIIJJI);
            return c1490210osl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LIZJ(long j) {
        JSONObject jSONObjectOptJSONObject;
        String string;
        try {
            boolean z = Boolean.parseBoolean(C842230X2f.LIZ(7, this.LIZ));
            String strLIZ = C842230X2f.LIZ(4, this.LIZ);
            if (TextUtils.isEmpty(strLIZ)) {
                strLIZ = LIZIZ();
                if (TextUtils.isEmpty(strLIZ)) {
                    Logger.debug();
                    return;
                }
                z = false;
            }
            JSONObject jSONObject = new JSONObject(strLIZ);
            if (!z || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
                jSONObjectOptJSONObject = jSONObject;
            }
            C1490210osl c1490210oslLJ = LJ(jSONObjectOptJSONObject);
            l.LJ().LJI(EnumC1492690owl.TTCACHE.mValue, j, C842230X2f.LIZ(5, this.LIZ), C842230X2f.LIZ(6, this.LIZ), jSONObjectOptJSONObject);
            LIZLLL(jSONObjectOptJSONObject);
            if (Logger.debug()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadLocalConfigForOtherProcess, config: ");
                if (c1490210oslLJ == null) {
                    string = "null";
                } else {
                    string = c1490210oslLJ.toString();
                }
                sbLIZ.append(string);
                Logger.d("TNCConfigHandler", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c1490210oslLJ != null) {
                this.LIZIZ = c1490210oslLJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logger.debug();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0258 A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ea A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0328 A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034c A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x035b A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0385 A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038d A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0392 A[Catch: JSONException -> 0x08e8, TryCatch #4 {JSONException -> 0x08e8, blocks: (B:119:0x020e, B:122:0x0214, B:124:0x021d, B:129:0x0230, B:133:0x023d, B:137:0x024d, B:139:0x0258, B:143:0x0265, B:147:0x0275, B:151:0x0285, B:155:0x0295, B:157:0x02a2, B:160:0x02aa, B:300:0x0562, B:301:0x056a, B:163:0x02ba, B:165:0x02c2, B:166:0x02d1, B:168:0x02dd, B:169:0x02df, B:170:0x02e2, B:172:0x02ea, B:176:0x02f5, B:180:0x0302, B:181:0x0304, B:185:0x030f, B:189:0x031e, B:191:0x0328, B:192:0x032a, B:196:0x0335, B:200:0x0342, B:202:0x034c, B:203:0x0353, B:205:0x035b, B:206:0x035f, B:208:0x0371, B:210:0x0379, B:212:0x0385, B:214:0x0392, B:213:0x038d, B:125:0x0223, B:127:0x0229, B:162:0x02b0), top: B:473:0x020e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0846 A[Catch: all -> 0x08d0, TryCatch #0 {all -> 0x08d0, blocks: (B:430:0x0830, B:432:0x0846, B:433:0x084e, B:435:0x0854, B:437:0x085c), top: B:465:0x0830 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0854 A[Catch: all -> 0x08d0, TryCatch #0 {all -> 0x08d0, blocks: (B:430:0x0830, B:432:0x0846, B:433:0x084e, B:435:0x0854, B:437:0x085c), top: B:465:0x0830 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x085c A[Catch: all -> 0x08d0, TRY_LEAVE, TryCatch #0 {all -> 0x08d0, blocks: (B:430:0x0830, B:432:0x0846, B:433:0x084e, B:435:0x0854, B:437:0x085c), top: B:465:0x0830 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0881 A[Catch: all -> 0x08c2, TryCatch #2 {all -> 0x08c2, blocks: (B:439:0x086b, B:441:0x0881, B:442:0x0889, B:444:0x088f, B:446:0x0897), top: B:469:0x086b }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x088f A[Catch: all -> 0x08c2, TryCatch #2 {all -> 0x08c2, blocks: (B:439:0x086b, B:441:0x0881, B:442:0x0889, B:444:0x088f, B:446:0x0897), top: B:469:0x086b }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0897 A[Catch: all -> 0x08c2, TRY_LEAVE, TryCatch #2 {all -> 0x08c2, blocks: (B:439:0x086b, B:441:0x0881, B:442:0x0889, B:444:0x088f, B:446:0x0897), top: B:469:0x086b }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08c0  */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.0orx, X.0os8] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.0orx, X.0osC] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(org.json.JSONObject r19) {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490200osk.LIZLLL(org.json.JSONObject):void");
    }

    public C1490200osk(Context context, boolean z) {
        this.LIZ = context;
        this.LIZJ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.Object r26, X.EnumC1492690owl r27, java.lang.String r28, long r29) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490200osk.LIZ(java.lang.Object, X.0owl, java.lang.String, long):boolean");
    }
}
