package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209881BeM extends AbstractC2209931BeR {
    public static final SimpleDateFormat LLLLII;
    public byte[] LLJJJJLIIL;
    public int LLJJL;
    public JSONArray LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public JSONArray LLJLIL;
    public long LLJLILLLLZIIL;
    public C2209971BeV LLJLL;
    public JSONArray LLJLLIL;
    public C2210011BeZ LLJLLL;
    public JSONObject LLJZ;
    public JSONArray LLJZIJLIL;
    public long LLL;
    public JSONArray LLLF;
    public String LLLFF;
    public String LLLFFI;
    public String LLLFZ;
    public int LLLI;
    public String LLLII;
    public C2209631Bdx LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public String LLLIIL;
    public String LLLIILIL;
    public JSONObject LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public int LLLIZZ;
    public int LLLJ;
    public int LLLJIL;
    public int LLLJL;
    public boolean LLLL;

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return "";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "pack";
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        LLLLII = simpleDateFormat;
    }

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "_data", "blob", "session_id", "varchar", "_fail", "integer", "event_count", "varchar", "key", "varchar", "iv", "varchar", "data_json", "text", "_app_id", "varchar", "encode_type", "integer", "encode_headers", "varchar", "priority", "integer", "forward", "integer", "e_ids", "varchar", "isolate_key", "varchar", "isolate_key_value", "varchar", "_launch_count", "integer", "_terminate_count", "integer", "_event_v1_count", "integer", "_event_v3_count", "integer", "_event_misc_count", "integer", "_impression_count", "integer", "sentry_stained_ids", "varchar");
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        return String.valueOf(this.LL);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC2209931BeR
    public final JSONObject LJIJ() throws JSONException {
        int i;
        JSONObject jSONObjectLIZLLL;
        int i2;
        Object obj;
        JSONObject jSONObject = this.LLLIL;
        if (jSONObject != null) {
            this.LLLFF = jSONObject.optString("key");
            this.LLLFFI = this.LLLIL.optString("iv");
            return this.LLLIL;
        }
        HashSet hashSet = new HashSet();
        ArrayList<C21655119oz> arrayList = new ArrayList();
        C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("magic_tag", "ss_app_log");
        jSONObject2.put("header", this.LLJZ);
        if (c2209901BeOLIZ != null && (obj = c2209901BeOLIZ.LJFF.LIZ) != null) {
            jSONObject2.put("time_sync", obj);
        }
        jSONObject2.put("_gen_time", System.currentTimeMillis());
        C2209971BeV c2209971BeV = this.LLJLL;
        this.LLLILZ = c2209971BeV != null ? 1 : 0;
        if (c2209971BeV != null && c2209971BeV.LLJLILLLLZIIL) {
            long j = c2209971BeV.LLJJIII;
            if (j > 0) {
                hashSet.add(Long.valueOf(j));
            }
            C2209971BeV c2209971BeV2 = this.LLJLL;
            if (c2209971BeV2.LLJJIJIIJIL > 0) {
                arrayList.add(new C21655119oz(this.LLJLL.LLILLJJLI, EnumC2176421AFs.LAUNCH, "launch", String.valueOf(c2209971BeV2.LLJJIJI)));
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.LLJLL.LJIILJJIL());
            jSONObject2.put("launch", jSONArray);
        }
        C2210011BeZ c2210011BeZ = this.LLJLLL;
        this.LLLILZJ = c2210011BeZ != null ? 1 : 0;
        String string = "";
        if (c2210011BeZ != null) {
            long j2 = c2210011BeZ.LLJJIII;
            if (j2 > 0) {
                hashSet.add(Long.valueOf(j2));
            }
            C2210011BeZ c2210011BeZ2 = this.LLJLLL;
            if (c2210011BeZ2.LLJJIJIIJIL > 0) {
                arrayList.add(new C21655119oz(this.LLJLLL.LLILLJJLI, EnumC2176421AFs.TERMINATE, "terminate", String.valueOf(c2210011BeZ2.LLJJIJI)));
            }
            JSONObject jSONObjectLJIILJJIL = this.LLJLLL.LJIILJJIL();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("terminate", jSONObjectLJIILJJIL);
            this.LLLFZ = C786410Ut5.J3(jSONObject3);
            JSONArray jSONArray2 = this.LLJLLIL;
            int length = jSONArray2 != null ? jSONArray2.length() : 0;
            JSONArray jSONArray3 = new JSONArray();
            for (int i3 = 0; i3 < length; i3++) {
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject(new JSONObject(this.LLJLLIL.optString(i3)).optString("params"));
                jSONArray4.put(0, jSONObject4.optString("page_key", ""));
                jSONArray4.put(1, (jSONObject4.optInt("duration", 0) + 999) / LSPassThroughRecordSizeConfig.DEFAULT);
                jSONArray3.put(jSONArray4);
            }
            if (length > 0) {
                jSONObjectLJIILJJIL.put("activites", jSONArray3);
            }
            if (c2209901BeOLIZ != null && (i2 = c2209901BeOLIZ.LJIIIIZZ) > 0) {
                jSONObjectLJIILJJIL.put("launch_from", i2);
                c2209901BeOLIZ.LJIIIIZZ = 0;
            }
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(jSONObjectLJIILJJIL);
            jSONObject2.put("terminate", jSONArray5);
        }
        JSONArray jSONArray6 = this.LLJJLIIIJLLLLLLLZ;
        int length2 = jSONArray6 != null ? jSONArray6.length() : 0;
        this.LLLILZLLLI = length2;
        if (length2 > 0) {
            JSONArray jSONArray7 = new JSONArray();
            for (int i4 = 0; i4 < this.LLJJLIIIJLLLLLLLZ.length(); i4++) {
                JSONObject jSONObject5 = JSONArrayProtectorUtils.getJSONObject(this.LLJJLIIIJLLLLLLLZ, i4);
                long jOptLong = jSONObject5.optLong("event_id", 0L);
                if (jOptLong > 0) {
                    hashSet.add(Long.valueOf(jOptLong));
                }
                if (jSONObject5.optInt("event_stained", 0) > 0) {
                    arrayList.add(new C21655119oz(jSONObject5.optLong("local_time_ms", 0L), EnumC2176421AFs.V1_EVENT, jSONObject5.optString("tag", ""), String.valueOf(jSONObject5.optLong("monitor_id", 0L))));
                }
                jSONArray7.put(jSONObject5);
            }
            jSONObject2.put("event", jSONArray7);
        }
        JSONArray jSONArray8 = this.LLJLIL;
        int length3 = jSONArray8 != null ? jSONArray8.length() : 0;
        this.LLLIZZ = length3;
        if (length3 > 0) {
            JSONArray jSONArray9 = new JSONArray();
            for (int i5 = 0; i5 < this.LLJLIL.length(); i5++) {
                JSONObject jSONObject6 = JSONArrayProtectorUtils.getJSONObject(this.LLJLIL, i5);
                long jOptLong2 = jSONObject6.optLong("event_id", 0L);
                if (jOptLong2 > 0) {
                    hashSet.add(Long.valueOf(jOptLong2));
                }
                if (jSONObject6.optInt("event_stained", 0) > 0) {
                    arrayList.add(new C21655119oz(jSONObject6.optLong("local_time_ms", 0L), EnumC2176421AFs.V3_EVENT, jSONObject6.optString("event", ""), String.valueOf(jSONObject6.optLong("monitor_id", 0L))));
                }
                jSONArray9.put(jSONObject6);
            }
            jSONObject2.put("event_v3", jSONArray9);
        }
        JSONArray jSONArray10 = this.LLJZIJLIL;
        int length4 = jSONArray10 != null ? jSONArray10.length() : 0;
        this.LLLJ = length4;
        if (length4 > 0) {
            JSONArray jSONArray11 = new JSONArray();
            for (int i6 = 0; i6 < this.LLJZIJLIL.length(); i6++) {
                JSONObject jSONObject7 = JSONArrayProtectorUtils.getJSONObject(this.LLJZIJLIL, i6);
                long jOptLong3 = jSONObject7.optLong("event_id", 0L);
                if (jOptLong3 > 0) {
                    hashSet.add(Long.valueOf(jOptLong3));
                }
                if (jSONObject7.optInt("event_stained", 0) > 0) {
                    arrayList.add(new C21655119oz(jSONObject7.optLong("local_time_ms", 0L), EnumC2176421AFs.LOG_DATA, jSONObject7.optString("log_type", ""), String.valueOf(jSONObject7.optLong("monitor_id", 0L))));
                }
                jSONArray11.put(jSONObject7);
            }
            jSONObject2.put("log_data", jSONArray11);
        }
        JSONArray jSONArray12 = this.LLLF;
        int length5 = jSONArray12 != null ? jSONArray12.length() : 0;
        this.LLLJIL = length5;
        if (length5 > 0) {
            jSONObject2.put("item_impression", this.LLLF);
        }
        if (!hashSet.isEmpty()) {
            Long[] lArr = (Long[]) hashSet.toArray(new Long[0]);
            Arrays.sort(lArr);
            StringBuilder sb = new StringBuilder();
            sb.append(lArr[0]);
            if (lArr.length > 1) {
                sb.append(":");
                for (int i7 = 1; i7 < lArr.length; i7++) {
                    sb.append(lArr[i7].longValue() - lArr[i7 - 1].longValue());
                    if (i7 != lArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            string = sb.toString();
        }
        this.LLLIIIIL = string;
        JSONArray jSONArray13 = new JSONArray();
        if (!arrayList.isEmpty()) {
            for (C21655119oz c21655119oz : arrayList) {
                c21655119oz.getClass();
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("event_name", c21655119oz.LIZ);
                    jSONObject8.put("monitor_id", c21655119oz.LIZIZ);
                    EnumC2176421AFs enumC2176421AFs = c21655119oz.LIZLLL;
                    if (enumC2176421AFs != null) {
                        jSONObject8.put("type", enumC2176421AFs.name());
                    }
                    long j3 = c21655119oz.LIZJ;
                    if (j3 > 0) {
                        try {
                            jSONObject8.put("local_time_ms", j3);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    String str = c21655119oz.LJ;
                    if (str != null && !str.isEmpty()) {
                        jSONObject8.put("priority_name", c21655119oz.LJ);
                    }
                    int i8 = c21655119oz.LJFF;
                    if (i8 >= 0) {
                        jSONObject8.put("group_id", i8);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                jSONArray13.put(jSONObject8);
            }
        }
        this.LLLIIIL = jSONArray13.toString();
        if (c2209901BeOLIZ != null) {
            c2209901BeOLIZ.LJFF.LIZIZ(jSONObject2, true);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("request_from", this.LLLJL);
            if (c2209901BeOLIZ.LLLFFI() > 0) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("capability", c2209901BeOLIZ.LLLFFI());
                C2209741Be8 c2209741Be8LJJIIZ = c2209901BeOLIZ.LJJIIZ();
                if (c2209741Be8LJJIIZ != null && c2209741Be8LJJIIZ.LIZ != null) {
                    int iLLLFFI = c2209901BeOLIZ.LLLFFI();
                    C2189301AmG c2189301AmG = c2209741Be8LJJIIZ.LIZ;
                    if (iLLLFFI == c2189301AmG.LIZIZ) {
                        jSONObject10.put("version", c2189301AmG.LIZ);
                    }
                    jSONObject10.put("config_ids", c2209741Be8LJJIIZ.LIZ.LIZLLL);
                }
                jSONObject9.put("event_sampling", jSONObject10);
            }
            try {
                JSONObject jSONObject11 = c2209901BeOLIZ.LJJLI;
                if (jSONObject11 != null) {
                    jSONObject9.put("expected_batch_interval", jSONObject11);
                }
                i = 0;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                i = 0;
                c2209901BeOLIZ.LJJZZI.LJIIZILJ(null, "build expected batch interval to pack failed", th3, new Object[0]);
            }
            try {
                if (c2209901BeOLIZ.LJIIJJI == null) {
                    c2209901BeOLIZ.LJJZZI.LJII("call getLogback after init plz.", new Object[i]);
                    jSONObjectLIZLLL = null;
                } else {
                    jSONObjectLIZLLL = c2209901BeOLIZ.LJIIJJI.LIZLLL();
                }
                if (jSONObjectLIZLLL != null) {
                    jSONObject9.put("log_back", jSONObjectLIZLLL);
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c2209901BeOLIZ.LJJZZI.LJIIZILJ(null, "build logback to pack failed", th4, new Object[0]);
            }
            if (c2209901BeOLIZ.LJJIIJZLJL) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("enable", 1);
                if ((c2209901BeOLIZ.LJIIJJI != null ? c2209901BeOLIZ.LJIIJJI.LJIIJJI : null) != null) {
                    jSONObject12.put("version", (c2209901BeOLIZ.LJIIJJI != null ? c2209901BeOLIZ.LJIIJJI.LJIIJJI : null).LIZ);
                }
                jSONObject12.put("value", this.LLJJ);
                jSONObject9.put("applog_priority", jSONObject12);
            }
            if (c2209901BeOLIZ.LJJLIIIJILLIZJL) {
                try {
                    JSONObject jSONObject13 = new JSONObject();
                    jSONObject13.put("enable", 1);
                    if ((c2209901BeOLIZ.LJIIJJI != null ? c2209901BeOLIZ.LJIIJJI.LJIILJJIL : null) != null) {
                        jSONObject13.put("version", (c2209901BeOLIZ.LJIIJJI != null ? c2209901BeOLIZ.LJIIJJI.LJIILJJIL : null).LIZ);
                    }
                    jSONObject9.put("applog_forward", jSONObject13);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    c2209901BeOLIZ.LJJZZI.LJIIZILJ(null, "build forward to pack failed", th5, new Object[0]);
                }
            }
            C2209921BeQ c2209921BeQ = c2209901BeOLIZ.LJJJJLI;
            int i9 = (c2209921BeQ.LJFF() && c2209921BeQ.LLILLL.LIZLLL()) ? 1 : 0;
            if (c2209901BeOLIZ.LJJJJLI.LL.LJIILJJIL) {
                i9 |= 2;
            }
            if (i9 > 0) {
                jSONObject9.put("sentry_stained", i9);
            }
            if (c2209901BeOLIZ.LLLI() != null) {
                c2209901BeOLIZ.LLLI().LIZIZ(jSONObject9);
            }
            jSONObject2.put("options", jSONObject9);
        }
        this.LLLFF = jSONObject2.optString("key");
        this.LLLFFI = jSONObject2.optString("iv");
        LJIIIIZZ().LIZIZ(4, "pack -> ts:{}, launch:{}, terminate:{}, v1:{}, v3:{}, misc:{}, impression:{}", Long.valueOf(this.LLILLJJLI), this.LLJLL, this.LLJLLL, Integer.valueOf(this.LLLILZLLLI), Integer.valueOf(this.LLLIZZ), Integer.valueOf(this.LLLJ), Integer.valueOf(this.LLLJIL));
        return jSONObject2;
    }

    public final C2209881BeM LJIJJ() {
        C2209881BeM c2209881BeM = new C2209881BeM();
        c2209881BeM.LJJIFFI(this.LLJILJILJ, this.LLJZ, null, null, null, new JSONArray[]{new JSONArray(), null, null}, new long[]{this.LLJL, this.LLJLILLLLZIIL, this.LLL}, null, this.LLLIIII, this.LLLJL);
        c2209881BeM.LLILZ = this.LLILZ;
        c2209881BeM.LLLIIL = this.LLLIIL;
        c2209881BeM.LLLIILIL = this.LLLIILIL;
        return c2209881BeM;
    }

    public final Set<Long> LJIJJLI() {
        String str = this.LLLIIIIL;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            try {
                int iIndexOf = str.indexOf(":");
                if (iIndexOf < 0) {
                    hashSet.add(Long.valueOf(CastLongProtector.parseLong(str)));
                    return hashSet;
                }
                long j = CastLongProtector.parseLong(str.substring(0, iIndexOf));
                hashSet.add(Long.valueOf(j));
                for (String str2 : str.substring(iIndexOf + 1).split(",")) {
                    j += CastLongProtector.parseLong(str2);
                    hashSet.add(Long.valueOf(j));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ().LIZ("Cannot parse set ids:{}!", str, th);
            }
        }
        return hashSet;
    }

    public final List<C21655119oz> LJIL() {
        String str = this.LLLIIIL;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    arrayList.add(new C21655119oz(jSONObjectOptJSONObject.optString("priority_name"), jSONObjectOptJSONObject.optInt("group_id", -1), jSONObjectOptJSONObject.optString("event_name"), jSONObjectOptJSONObject.optString("monitor_id"), jSONObjectOptJSONObject.optLong("local_time_ms"), EnumC2176421AFs.parse(jSONObjectOptJSONObject.optString("type"))));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ().LIZ("Cannot parse stage events:{}!", str, th);
            }
        }
        return arrayList;
    }

    public final void LJJI() {
        C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ);
        if (c2209901BeOLIZ == null) {
            return;
        }
        int i = this.LLLILZ;
        if (i > 0) {
            c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.CLEAN_UP_LAUNCH_COUNT, i);
        }
        int i2 = this.LLLILZJ;
        if (i2 > 0) {
            c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.CLEAN_UP_TERMINATE_COUNT, i2);
        }
        int i3 = this.LLLILZLLLI + this.LLLIZZ + this.LLLJ;
        if (i3 > 0) {
            c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.CLEAN_UP_EVENT_COUNT, i3);
        }
    }

    public final byte[] LJJII() {
        byte[] bArr;
        if (this.LLLL && (bArr = this.LLJJJJLIIL) != null) {
            return bArr;
        }
        try {
            return LJJIII(C786410Ut5.J3(LJIILJJIL()));
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ);
            if (c2209901BeOLIZ != null) {
                c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.MEM_ERROR_COUNT, 1);
            }
            LJJI();
            return null;
        }
    }

    @Override // X.AbstractC2209931BeR
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pack:{id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sid:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", e3_cnt:");
        sbLIZ.append(this.LLLIZZ);
        sbLIZ.append(", e1_cnt:");
        sbLIZ.append(this.LLLILZLLLI);
        sbLIZ.append(", l_cnt:");
        sbLIZ.append(this.LLLILZ);
        sbLIZ.append(", t_cnt:");
        sbLIZ.append(this.LLLILZJ);
        sbLIZ.append(", ipr_cnt:");
        sbLIZ.append(this.LLLJIL);
        sbLIZ.append(", isolate:");
        sbLIZ.append(this.LLLIIL);
        sbLIZ.append("->");
        sbLIZ.append(this.LLLIILIL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIIJ(Cursor cursor) {
        this.LL = cursor.getLong(0);
        this.LLILLJJLI = cursor.getLong(1);
        this.LLJJJJLIIL = cursor.getBlob(2);
        this.LLILZ = cursor.getString(3);
        this.LLJJL = cursor.getInt(4);
        cursor.getString(5);
        this.LLLFF = cursor.getString(6);
        this.LLLFFI = cursor.getString(7);
        this.LLLFZ = cursor.getString(8);
        this.LLJILJILJ = cursor.getString(9);
        this.LLLI = cursor.getInt(10);
        this.LLLII = cursor.getString(11);
        this.LLJJ = cursor.getInt(12);
        this.LLJJI = cursor.getInt(13);
        this.LLLIIIIL = cursor.getString(14);
        this.LLLIIL = cursor.getString(15);
        this.LLLIILIL = cursor.getString(16);
        this.LLLILZ = cursor.getInt(17);
        this.LLLILZJ = cursor.getInt(18);
        this.LLLILZLLLI = cursor.getInt(19);
        this.LLLIZZ = cursor.getInt(20);
        this.LLLJ = cursor.getInt(21);
        this.LLLJIL = cursor.getInt(22);
        this.LLLIIIL = cursor.getString(23);
        this.LLJZ = null;
        this.LLJLL = null;
        this.LLJLLL = null;
        this.LLJLLIL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJLIL = null;
        this.LLJZIJLIL = null;
        this.LLLF = null;
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        try {
            contentValues.put("local_time_ms", Long.valueOf(this.LLILLJJLI));
            contentValues.put("_data", LJJII());
            contentValues.put("session_id", this.LLILZ);
            contentValues.put("key", this.LLLFF);
            contentValues.put("iv", this.LLLFFI);
            contentValues.put("encode_type", Integer.valueOf(this.LLLI));
            contentValues.put("encode_headers", this.LLLII);
            contentValues.put("data_json", this.LLLFZ);
            contentValues.put("_app_id", this.LLJILJILJ);
            contentValues.put("priority", Integer.valueOf(this.LLJJ));
            contentValues.put("forward", Integer.valueOf(this.LLJJI));
            contentValues.put("e_ids", this.LLLIIIIL);
            contentValues.put("isolate_key", this.LLLIIL);
            contentValues.put("isolate_key_value", this.LLLIILIL);
            contentValues.put("_launch_count", Integer.valueOf(this.LLLILZ));
            contentValues.put("_terminate_count", Integer.valueOf(this.LLLILZJ));
            contentValues.put("_event_v1_count", Integer.valueOf(this.LLLILZLLLI));
            contentValues.put("_event_v3_count", Integer.valueOf(this.LLLIZZ));
            contentValues.put("_event_misc_count", Integer.valueOf(this.LLLJ));
            contentValues.put("_impression_count", Integer.valueOf(this.LLLJIL));
            contentValues.put("sentry_stained_ids", this.LLLIIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ().LJIILIIL(5, "write pack to db failed", th, new Object[0]);
        }
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "write ipc not implemented", new Object[0]);
    }

    public final byte[] LJJIII(String str) {
        C2209901BeO c2209901BeOLIZ;
        String strJ3 = null;
        this.LLJJJJLIIL = null;
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str) && C1BF5.LIZJ(this.LLJILJILJ) && (c2209901BeOLIZ = C1BF5.LIZ(this.LLJILJILJ)) != null) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                this.LLJJJJLIIL = bytes;
                if (bytes != null && bytes.length > 0) {
                    if (c2209901BeOLIZ.LJJJJZI != null) {
                        try {
                            C2210751Bfl c2210751BflLIZ = ((C2210151Ben) c2209901BeOLIZ.LJJJJZI).LIZ(this.LLJJJJLIIL);
                            this.LLJJJJLIIL = c2210751BflLIZ.LIZ;
                            this.LLLI = c2210751BflLIZ.LIZIZ;
                            map.putAll(c2210751BflLIZ.LIZJ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "log compress toBytes failed", th, new Object[0]);
                            c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.COMPRESS_ERROR_COUNT, 1);
                        }
                    }
                    if (c2209901BeOLIZ.LJIL) {
                        this.LLJJJJLIIL = c2209901BeOLIZ.LJFF.LIZJ.LIZJ(this.LLJJJJLIIL);
                        map.remove("Content-Encoding");
                        map.put("Content-Type", "application/octet-stream;tt-data=a");
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "toBytes failed", th2, new Object[0]);
                c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.PACK_ERROR_COUNT, 1);
                c2209901BeOLIZ.LJJJJLI.LJI("pack_to_bytes_failed", th2, true);
            }
        }
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        this.LLLII = strJ3;
        return this.LLJJJJLIIL;
    }

    public final C2209881BeM LJIJI(EnumC2210521BfO enumC2210521BfO, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        C2209881BeM c2209881BeM = new C2209881BeM();
        String str2 = this.LLJILJILJ;
        JSONObject jSONObject = this.LLJZ;
        JSONArray jSONArray4 = null;
        if (C0VS7.LIZ(this.LLJLLIL)) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
        }
        JSONArray[] jSONArrayArr = new JSONArray[3];
        if (C0VS7.LIZ(this.LLJJLIIIJLLLLLLLZ)) {
            jSONArray2 = null;
        } else {
            jSONArray2 = new JSONArray();
        }
        jSONArrayArr[0] = jSONArray2;
        if (C0VS7.LIZ(this.LLJLIL)) {
            jSONArray3 = null;
        } else {
            jSONArray3 = new JSONArray();
        }
        jSONArrayArr[1] = jSONArray3;
        if (!C0VS7.LIZ(this.LLJZIJLIL)) {
            jSONArray4 = new JSONArray();
        }
        jSONArrayArr[2] = jSONArray4;
        c2209881BeM.LJJIFFI(str2, jSONObject, null, null, jSONArray, jSONArrayArr, new long[]{this.LLJL, this.LLJLILLLLZIIL, this.LLL}, this.LLLF, this.LLLIIII, this.LLLJL);
        c2209881BeM.LLILZ = this.LLILZ;
        c2209881BeM.LLLIIL = enumC2210521BfO.getKey();
        c2209881BeM.LLLIILIL = str;
        return c2209881BeM;
    }

    public final void LJJIFFI(String str, JSONObject jSONObject, C2209971BeV c2209971BeV, C2210011BeZ c2210011BeZ, JSONArray jSONArray, JSONArray[] jSONArrayArr, long[] jArr, JSONArray jSONArray2, C2209631Bdx c2209631Bdx, int i) {
        int i2;
        int length;
        int length2;
        int length3;
        int length4;
        LJIIL(0L);
        this.LLJZ = jSONObject;
        this.LLJLL = c2209971BeV;
        this.LLJLLL = c2210011BeZ;
        this.LLJLLIL = jSONArray;
        JSONArray jSONArray3 = jSONArrayArr[0];
        this.LLJJLIIIJLLLLLLLZ = jSONArray3;
        this.LLJL = jArr[0];
        int i3 = 1;
        this.LLJLIL = jSONArrayArr[1];
        this.LLJLILLLLZIIL = jArr[1];
        this.LLJZIJLIL = jSONArrayArr[2];
        this.LLL = jArr[2];
        this.LLLF = jSONArray2;
        this.LLLIIII = c2209631Bdx;
        if (c2209631Bdx != null) {
            this.LLJJ = c2209631Bdx.LIZ;
        } else {
            this.LLJJ = -1;
        }
        this.LLLJL = i;
        this.LLJILJILJ = str;
        this.LLLFZ = null;
        this.LLLI = 0;
        this.LLLII = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLJJL = 0;
        this.LLJJJJLIIL = null;
        if (c2209971BeV != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.LLLILZ = i2;
        if (c2210011BeZ == null) {
            i3 = 0;
        }
        this.LLLILZJ = i3;
        if (jSONArray3 != null) {
            length = jSONArray3.length();
        } else {
            length = 0;
        }
        this.LLLILZLLLI = length;
        JSONArray jSONArray4 = this.LLJLIL;
        if (jSONArray4 != null) {
            length2 = jSONArray4.length();
        } else {
            length2 = 0;
        }
        this.LLLIZZ = length2;
        JSONArray jSONArray5 = this.LLJZIJLIL;
        if (jSONArray5 != null) {
            length3 = jSONArray5.length();
        } else {
            length3 = 0;
        }
        this.LLLJ = length3;
        JSONArray jSONArray6 = this.LLLF;
        if (jSONArray6 != null) {
            length4 = jSONArray6.length();
        } else {
            length4 = 0;
        }
        this.LLLJIL = length4;
        this.LLLL = false;
    }
}
