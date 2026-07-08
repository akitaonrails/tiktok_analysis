package X;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.dumper.MemoryInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802440Vdq extends CrashSummary {
    public static final String LLIZLLLIL;
    public static final Pattern LLJ;
    public final boolean LL;
    public final int LLILLJJLI;
    public String LLILLL;
    public final C0VJI LLILZ;
    public C802470Vdt LLILZIL;
    public C802460Vds LLILZLL;
    public C802850VeV LLIZ;

    @Override // com.bytedance.crash.crash.CrashSummary
    public final String loadStackTrace() {
        String string;
        JSONObject jSONObject = new JSONObject();
        C0VJJ c0vjj = this.LLILZ.LIZJ;
        if (c0vjj != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < c0vjj.LJIIIZ.size() && !((String) ListProtector.get(c0vjj.LJIIIZ, i)).startsWith("  at ")) {
                sb.append((String) ListProtector.get(c0vjj.LJIIIZ, i));
                sb.append('\n');
                i++;
            }
            Package r12 = MessageRecorder.class.getPackage();
            boolean z = false;
            int i2 = i;
            if (r12 != null) {
                while (i2 < c0vjj.LJIIIZ.size()) {
                    String str = (String) ListProtector.get(c0vjj.LJIIIZ, i2);
                    if (str.startsWith(r12.getName(), 5)) {
                        z = true;
                    } else if (str.startsWith("android.os.Looper.loop", 5)) {
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                sb.append("  at android.os.MessageQueue.next(MessageQueue.java:339)\n  - calling the observer callback\n");
                c0vjj.LJIIJ = true;
                i = i2;
            }
            while (i < c0vjj.LJIIIZ.size()) {
                sb.append((String) ListProtector.get(c0vjj.LJIIIZ, i));
                sb.append('\n');
                i++;
            }
            string = sb.toString();
        } else {
            string = null;
        }
        this.LLILLL = string;
        if (TextUtils.isEmpty(string)) {
            this.LLILLL = C2112008Pe.LJFF(new C0VSJ(this.mDirectory, "main_stack.txt"));
        }
        if (TextUtils.isEmpty(this.LLILLL)) {
            this.LLILLL = "at InvalidStack.NoStackAvailable(Invalid.java:1).\n";
        }
        try {
            jSONObject.put("mainStackFromTrace", this.LLILLL);
            jSONObject.put("invalid", this.LLILLL == "at InvalidStack.NoStackAvailable(Invalid.java:1).\n");
            jSONObject.put("is_new_stack", 10);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(CrashType.ANR);
        sbLIZ.append(".summary");
        LLIZLLLIL = C2188811AlT.LIZIZ(sbLIZ);
        LLJ = PatternProtector.compile("^start_time=(\\d+)\\nstart_up_time=(\\d+)\\ncrash_time=(\\d+)\\nprocess_name=(.*)\\npid=(\\d+)\\nby_signal=(true|false)\\n(?:trigger=(\\d+)\\n?)?");
    }

    public static C802440Vdq LJI(File file) {
        int i;
        C0VSJ c0vsj = new C0VSJ(file, LLIZLLLIL);
        String strLJFF = C2112008Pe.LJFF(c0vsj);
        if (!TextUtils.isEmpty(strLJFF)) {
            try {
                Matcher matcher = LLJ.matcher(strLJFF);
                if (matcher.find()) {
                    long j = CastLongProtector.parseLong(matcher.group(1));
                    long j2 = CastLongProtector.parseLong(matcher.group(2));
                    long j3 = CastLongProtector.parseLong(matcher.group(3));
                    String strGroup = matcher.group(4);
                    int i2 = CastIntegerProtector.parseInt(matcher.group(5));
                    boolean z = Boolean.parseBoolean(matcher.group(6));
                    if (matcher.group(7) != null) {
                        i = CastIntegerProtector.parseInt(matcher.group(7));
                    } else {
                        i = 9999;
                    }
                    return new C802440Vdq(c0vsj.getParentFile(), j, j2, j3, strGroup, i2, i, z);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C801940Vd2.LIZIZ("NPTH_ANR_ERROR_LOAD", th);
                return null;
            }
        }
        return null;
    }

    public final void LIZJ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("data");
        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("{\"mainStackFromTrace\":\"\\\"main\\\"")) {
            String strLJFF = C2112008Pe.LJFF(new C0VSJ(this.mDirectory, "main_stack.txt"));
            if (TextUtils.isEmpty(strLJFF)) {
                return;
            }
            String[] strArrSplit = strLJFF.split("\n");
            JSONArray jSONArray = new JSONArray();
            for (String str : strArrSplit) {
                jSONArray.put(str);
            }
            C0VYL.LIZ("main_stack_2nd", jSONArray, jSONObject);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x036f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26, types: [int] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.bytedance.crash.crash.CrashSummary
    public final void appendSpecialFilter(org.json.JSONObject r26) {
        /*
            Method dump skipped, instruction units count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802440Vdq.appendSpecialFilter(org.json.JSONObject):void");
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [X.0VeU, X.0VeV] */
    @Override // com.bytedance.crash.crash.CrashSummary
    public final void assemblySpecialCrashBody(C801830Vcr c801830Vcr, Header header) {
        String strValueOf;
        char c = 1;
        try {
            c801830Vcr.LIZJ("is_anr", 1);
            this.LLILZ.LIZIZ(c801830Vcr.LIZ);
            C802470Vdt c802470Vdt = new C802470Vdt(this.mDirectory);
            this.LLILZIL = c802470Vdt;
            c802470Vdt.LJIIIIZZ(c801830Vcr.LIZ);
            MessageRecorder.LIZLLL(c801830Vcr.LIZ);
            C803950VgH.LJIIIIZZ(c801830Vcr.LIZ);
            this.LLILZLL = new C802460Vds(this.mDirectory, c801830Vcr.LIZ, this.LLILZ, this.LLILZIL);
            C802460Vds.LJIIIZ(c801830Vcr.LIZ, this.mDirectory);
            final File file = this.mDirectory;
            ?? r2 = new C802840VeU(file) { // from class: X.0VeV
                {
                    InterfaceC803660Vfo interfaceC803660Vfo = new InterfaceC803660Vfo() { // from class: X.1ESe
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x0082 A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[RETURN] */
                        @Override // X.InterfaceC803660Vfo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.String LIZ(java.lang.String r8, java.lang.String r9) {
                            /*
                                Method dump skipped, instruction units count: 516
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C2281581ESe.LIZ(java.lang.String, java.lang.String):java.lang.String");
                        }
                    };
                }

                @Override // X.C802840VeU
                public final void LIZIZ(JSONObject jSONObject) {
                    JSONObject jSONObjectLJ = C0VJO.LJ("filters", jSONObject);
                    if (jSONObject.optLong("rss") / 1024 > 200) {
                        C0VJO.LIZIZ("mem_ess_reason", LIZ(1), jSONObjectLJ);
                        C0VJO.LIZIZ("mem_rss_reason", LIZ(3), jSONObjectLJ);
                        C0VJO.LIZIZ("mem_pss_reason", LIZ(4), jSONObjectLJ);
                    }
                    C802910Veb c802910Veb = new C802910Veb("MB");
                    c802910Veb.LIZJ(new Long[]{0L, 16L, 32L, 64L, 128L, 256L, 512L, 768L, 1024L, 2048L, 4096L, 8192L});
                    for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
                        String str = (String) entry.getKey();
                        C803520Vfa c803520Vfa = (C803520Vfa) entry.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ess_classified_");
                        sbLIZ.append(str.toLowerCase(Locale.ROOT));
                        C0VJO.LJIIIIZZ(jSONObjectLJ, C2188811AlT.LIZIZ(sbLIZ), c802910Veb.LIZ(c803520Vfa.LIZ[1] / 1024));
                    }
                    c802910Veb.LIZJ(new Long[]{0L, 8L, 16L, 24L, 32L, 48L, 64L, 128L});
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_sys_font", "SYSTEM_DATA", "fonts");
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_non_moving", "DALVIK_SPACE", "non_moving_space");
                    c802910Veb.LIZJ(new Long[]{0L, 32L, 64L, 128L, 256L, 512L, 768L, 1024L});
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_base_odex", "APP_JAVA_LIB", "base.odex");
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_base_vdex", "APP_JAVA_LIB", "base.vdex");
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_base_apk", "APP_JAVA_LIB", "base.apk");
                    LIZJ(jSONObjectLJ, c802910Veb, "ess_base_art", "APP_JAVA_LIB", "base.art");
                    c802910Veb.LIZJ(new Long[]{0L, 2L, 4L, 8L, 12L, 16L, 32L, 64L, 128L, 256L, 512L});
                    LIZLLL(jSONObjectLJ, c802910Veb, "ess_max_sys_lib", "SYSTEM_NATIVE_LIB");
                    LIZLLL(jSONObjectLJ, c802910Veb, "ess_max_app_lib", "APP_NATIVE_LIB");
                    LIZLLL(jSONObjectLJ, c802910Veb, "ess_max_app_data", "APP_DATA");
                    LIZLLL(jSONObjectLJ, c802910Veb, "ess_max_app_plugins", "APP_PLUGINS");
                }
            };
            this.LLIZ = r2;
            JSONObject jSONObject = c801830Vcr.LIZ;
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : ((HashMap) r2.LIZ).entrySet()) {
                String str = (String) entry.getKey();
                C803520Vfa c803520Vfa = (C803520Vfa) entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("type", str);
                    jSONObject2.put("pss", String.valueOf(c803520Vfa.LIZ[c] * 1024));
                    jSONObject2.put("rss", String.valueOf(c803520Vfa.LIZ[3] * 1024));
                    long j = c803520Vfa.LIZ[3];
                    if (j > 0) {
                        try {
                            strValueOf = String.valueOf(r11[5] / j);
                        } catch (JSONException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        strValueOf = "0.0";
                    }
                    jSONObject2.put("ref_rate", strValueOf);
                    jSONObject2.put("vma", String.valueOf(c803520Vfa.LIZ[0]));
                    jSONObject2.put("vss", String.valueOf(c803520Vfa.LIZ[2] * 1024));
                    jSONObject2.put("swap", String.valueOf(c803520Vfa.LIZ[7] * 1024));
                } catch (JSONException e2) {
                    e = e2;
                }
                jSONArray.put(jSONObject2);
                c = 1;
            }
            C0VJO.LJIIIIZZ(jSONObject, "tagged_maps_size", jSONArray);
            LIZJ(c801830Vcr.LIZ);
            C802740VeK.LIZ(c801830Vcr.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
        }
        if ((!TextUtils.isEmpty(this.LLILZIL.LIZ)) && this.LLILLL != "at InvalidStack.NoStackAvailable(Invalid.java:1).\n") {
            if (Build.VERSION.SDK_INT >= 30 && C803490VfX.LIZJ) {
                String strOptString = c801830Vcr.LIZ.optString("exit_reason");
                if (!TextUtils.isEmpty(strOptString) && !strOptString.contains("6")) {
                    C0VJO.LJIIIIZZ(header.LIZ, "aid", 2010);
                    return;
                }
                return;
            }
            return;
        }
        C0VJO.LJIIIIZZ(header.LIZ, "aid", 2010);
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public final boolean upload(C802790VeP c802790VeP, JSONObject jSONObject) {
        boolean zUpload = super.upload(c802790VeP, jSONObject);
        if (!C803490VfX.LIZ && !zUpload) {
            C2112008Pe.LJ(this.mDirectory);
        }
        return zUpload;
    }

    @Override // com.bytedance.crash.crash.CrashSummary
    public final void loadCrashInfo(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        MemoryInfo.LIZIZ(jSONObject, file);
        MessageRecorder.LIZJ(jSONObject, file);
        if (file != null) {
            C0VXA.LIZIZ(jSONObject, file.getParentFile());
        }
        C801620VcW.LIZJ(jSONObject, file);
        C803950VgH.LJII(jSONObject, file);
        C0VYH.LJ(jSONObject, file);
        C0VYQ.LIZ(jSONObject, file);
        Scraps.pushTo(jSONObject, file);
        C801640VcY.LIZJ(jSONObject, file);
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null && c802790VeP.LJIIJJI != null) {
            C799500VXw.LIZLLL(jSONObject, jSONObject2, file);
        }
    }

    public static void LJFF(File file, long j, boolean z, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file);
        sbLIZ.append("/");
        sbLIZ.append(LLIZLLLIL);
        C801730Vch c801730Vch = new C801730Vch(C2188811AlT.LIZIZ(sbLIZ));
        String strLIZJ = C802270VdZ.LIZJ();
        long jLIZJ = C0VX9.LIZJ();
        long j2 = C0VX9.LIZIZ().LJFF;
        int iMyPid = Process.myPid();
        c801730Vch.LIZLLL("start_time=");
        c801730Vch.LIZ.LIZJ(jLIZJ);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("start_up_time=");
        c801730Vch.LIZ.LIZJ(j2);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("crash_time=");
        c801730Vch.LIZ.LIZJ(j);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("process_name=");
        c801730Vch.LIZLLL(strLIZJ);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("pid=");
        c801730Vch.LIZ.LIZIZ(iMyPid);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("by_signal=");
        c801730Vch.LJFF(z);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LIZLLL("trigger=");
        c801730Vch.LIZ.LIZIZ(i);
        c801730Vch.LIZ.LIZ('\n');
        c801730Vch.LJI();
    }

    public C802440Vdq(File file, long j, long j2, long j3, String str, int i, int i2, boolean z) {
        super(file, CrashType.ANR, j, j2, j3, str, "main", i, i);
        this.LL = z;
        this.LLILLJJLI = i2;
        this.LLILZ = new C0VJI(file, i);
        this.mStackTrace = loadStackTrace();
    }
}
