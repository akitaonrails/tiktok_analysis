package X;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802490Vdv extends CrashSummary {
    public static final String LLILZ;
    public static final Pattern LLILZIL;
    public final String LL;
    public final boolean LLILLJJLI;
    public C802840VeU LLILLL;

    @Override // com.bytedance.crash.crash.CrashSummary
    public final String loadStackTrace() {
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(this.mDirectory, "throwable.txt"));
        if (!TextUtils.isEmpty(strLJFF)) {
            return strLJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("\n\tat InvalidStack.NoStackAvailable: ");
        sbLIZ.append(this.LLILLJJLI ? "Is OOM" : "Not OOM");
        sbLIZ.append(" (SourceFile.java:-1).\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(CrashType.JAVA);
        sbLIZ.append(".summary");
        LLILZ = C2188811AlT.LIZIZ(sbLIZ);
        LLILZIL = PatternProtector.compile("^start_time=(\\d+)\\nstart_up_time=(\\d+)\\ncrash_time=(\\d+)\\nprocess_name=(.*)\\nthread_name=(.*)\\npid=(\\d+)\\ntid=(\\d+)\\noom=(\\d+)\\nlaunch=(\\d+)\\nthrowable=(.*)");
    }

    public static C802490Vdv LIZJ(File file) {
        String strLJFF;
        boolean z;
        boolean z2;
        if (!file.getName().equals(LLILZ) || (strLJFF = C2112008Pe.LJFF(file)) == null) {
            return null;
        }
        try {
            Matcher matcher = LLILZIL.matcher(strLJFF);
            if (matcher.find() && matcher.groupCount() == 10) {
                String strGroup = matcher.group(10);
                if (!TextUtils.isEmpty(strGroup)) {
                    long j = CastLongProtector.parseLong(matcher.group(1));
                    long j2 = CastLongProtector.parseLong(matcher.group(2));
                    long j3 = CastLongProtector.parseLong(matcher.group(3));
                    String strGroup2 = matcher.group(4);
                    String strGroup3 = matcher.group(5);
                    int i = CastIntegerProtector.parseInt(matcher.group(6));
                    int i2 = CastIntegerProtector.parseInt(matcher.group(7));
                    if (CastIntegerProtector.parseInt(matcher.group(8)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (CastIntegerProtector.parseInt(matcher.group(9)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new C802490Vdv(file.getParentFile(), j, j2, j3, strGroup2, strGroup3, i, i2, z, strGroup, z2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZIZ("NPTH_JAVA_SUMMARY", th);
        }
        return null;
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public final void appendSpecialFilter(JSONObject jSONObject) {
        String str;
        String strTrim;
        CrashType crashType = this.mCrashType;
        CrashType crashType2 = CrashType.LAUNCH;
        if (crashType == crashType2) {
            jSONObject = getOriginalBody(jSONObject);
        }
        JSONObject jSONObjectLJ = C0VJO.LJ("filters", jSONObject);
        if (new C0VSJ(this.mDirectory, "ignore").exists()) {
            C0VJO.LJIIIIZZ(jSONObjectLJ, "has_ignore", String.valueOf(true));
        }
        CrashType crashType3 = this.mCrashType;
        if ((crashType3 == crashType2 || crashType3 == CrashType.JAVA) && (str = this.mStackTrace) != null) {
            try {
                if (!str.isEmpty()) {
                    String[] strArrSplit = str.split("\n", 2);
                    if (strArrSplit.length != 0) {
                        int iIndexOf = strArrSplit[0].indexOf(58);
                        if (iIndexOf == -1) {
                            iIndexOf = strArrSplit[0].indexOf(65306);
                        }
                        if (iIndexOf != -1) {
                            strTrim = strArrSplit[0].substring(0, iIndexOf).trim();
                        } else {
                            strTrim = strArrSplit[0].trim();
                        }
                        if (strTrim != null) {
                            C0VJO.LJIIIIZZ(jSONObjectLJ, "java_reason", strTrim);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C0VJO.LJIIIIZZ(jSONObjectLJ, "malloc_type", NativeBridge.LJIL());
        C0VJO.LJIIIIZZ(jSONObjectLJ, "from_custom", Boolean.FALSE);
        C802840VeU c802840VeU = this.LLILLL;
        if (c802840VeU != null) {
            c802840VeU.LIZIZ(jSONObject);
        }
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public final JSONObject getOriginalBody(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (this.mCrashType == CrashType.LAUNCH && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null && jSONArrayOptJSONArray.length() > 0) {
            return jSONArrayOptJSONArray.optJSONObject(0);
        }
        return jSONObject;
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public final void assemblySpecialCrashBody(C801830Vcr c801830Vcr, Header header) {
        String string;
        C0VJG.LIZJ(this.mDirectory, c801830Vcr.LIZ, false);
        c801830Vcr.LIZJ("isOOM", Boolean.valueOf(this.LLILLJJLI));
        C802770VeN c802770VeNLIZ = C802770VeN.LIZ();
        if (c802770VeNLIZ != null) {
            string = c802770VeNLIZ.LJFF().getRandomDeviceId();
        } else {
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (TextUtils.isEmpty(string)) {
                string = "0000-1111-2222-3333-4444";
            }
        }
        c801830Vcr.LIZJ("launch_did", string);
        if (this.mCrashType == CrashType.LAUNCH) {
            c801830Vcr.LIZJ("crash_type", "java");
            c801830Vcr.LIZJ("event_type", "start_crash");
            c801830Vcr.LIZJ("stack", String.valueOf(c801830Vcr.LIZ.remove("data")));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", new JSONArray().put(c801830Vcr.LIZ));
                c801830Vcr.LIZ = jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            c801830Vcr.LIZJ("isJava", 1);
        }
        this.LLILLL = new C802840VeU(this.mDirectory);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C802490Vdv(File file, long j, long j2, long j3, String str, String str2, int i, int i2, boolean z, String str3, boolean z2) {
        CrashType crashType;
        if (z2) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        super(file, crashType, j, j2, j3, str, str2, i, i2);
        this.LL = str3;
        this.LLILLJJLI = z;
        this.mStackTrace = loadStackTrace();
    }
}
