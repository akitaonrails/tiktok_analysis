package X;

import android.app.ActivityManager;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802470Vdt {
    public final String LIZ;
    public final boolean LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public String LJ;
    public final String LJFF;
    public String LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final float[] LJIIIZ;
    public C802590Ve5 LJIIJ;
    public C802590Ve5 LJIIJJI;
    public C802590Ve5 LJIIL;

    public final String LJ() {
        String str = this.LJFF;
        if (str == null || !str.equals("Input dispatching timed out")) {
            return "invalid";
        }
        String lowerCase = this.LJ.toLowerCase();
        return (lowerCase.contains("no window has focus but there is a focused application") || lowerCase.contains("does not have a focused window")) ? "no focused window" : lowerCase.contains("waiting to send non-key event because the touched window has not finished") ? "non-key event not finished" : lowerCase.contains("waiting to send key event because the focused window has not finished") ? "key event not finished" : lowerCase.contains("window is paused") ? "window is paused" : lowerCase.contains("window’s input channel is not registered") ? "input channel not registered" : lowerCase.contains("window’s input connection is") ? "window being removed" : lowerCase.contains("window’s input channel is full") ? "input channel is full" : lowerCase.contains("is not responding. waited") ? "activity is not responding" : "invalid";
    }

    public C802470Vdt() {
        this.LJIIIZ = new float[]{-1.0f, -1.0f, -1.0f};
        this.LIZ = null;
        LJI(null);
    }

    public C802470Vdt(File file) {
        String strSubstring;
        this.LJIIIZ = new float[]{-1.0f, -1.0f, -1.0f};
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "anr_info.txt"));
        if (strLJFF != null && !strLJFF.isEmpty()) {
            String strTrim = "unknown";
            if (strLJFF.equals("silent anr no anr info")) {
                this.LJFF = "silent anr";
            } else if (strLJFF.equals("close anr_info report")) {
                this.LJFF = "Not report anrInfo";
            } else {
                int iLJI = LJI(strLJFF);
                if (iLJI < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Anr Info Parse Error:");
                    sbLIZ.append(iLJI);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                if (TextUtils.isEmpty(this.LJ) || "null".equals(this.LJ)) {
                    strSubstring = "unknown";
                } else if (this.LJ.startsWith("ANR ")) {
                    strSubstring = "Input dispatching timed out";
                    if (this.LJ.startsWith("Input dispatching timed out", 4)) {
                        String str = this.LJ;
                        if (str.toLowerCase().contains("no window has focus") || str.toLowerCase().contains("does not have a focused window")) {
                            strSubstring = "Input dispatching timed out (no focused window)";
                        }
                    } else if (this.LJ.startsWith("executing service", 4)) {
                        strSubstring = "executing service";
                    } else if (this.LJ.startsWith("Broadcast of Intent", 4)) {
                        strSubstring = "Broadcast of Intent";
                    } else {
                        strSubstring = "keyDispatchingTimedOut";
                        if (!this.LJ.startsWith("keyDispatchingTimedOut", 4)) {
                            strSubstring = "not then call Service.startForeground";
                            if (!this.LJ.contains("not then call Service.startForeground")) {
                                strSubstring = this.LJ.substring(4);
                                if (strSubstring == null) {
                                    strSubstring = null;
                                } else {
                                    try {
                                        strSubstring = strSubstring.replaceAll("\\d+", "xxx");
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    strSubstring = this.LJ;
                }
                this.LJFF = strSubstring;
            }
            if (!TextUtils.isEmpty(this.LJI) && !"null".equals(this.LJI)) {
                strTrim = this.LJI;
            } else if (!TextUtils.isEmpty(this.LJ) && !"null".equals(this.LJ)) {
                if (this.LJ.contains("executing service")) {
                    String str2 = this.LJ;
                    strTrim = str2.substring(str2.indexOf("service ") + 8).trim();
                    String[] strArrSplit = strTrim.split("/");
                    if (strArrSplit.length > 1) {
                        strTrim = strArrSplit[strArrSplit.length - 1];
                    }
                } else if (this.LJ.contains("Broadcast of Intent")) {
                    String str3 = this.LJ;
                    strTrim = str3.substring(str3.indexOf("{") + 1, this.LJ.indexOf("}")).trim();
                    String[] strArrSplit2 = strTrim.split("/");
                    if (strArrSplit2.length > 1) {
                        strTrim = strArrSplit2[strArrSplit2.length - 1];
                    }
                }
            }
            this.LJI = strTrim;
            C2112008Pe.LJII(new C0VSJ(file, "anr_info.txt"), LJII(strLJFF, this.LIZJ));
        }
        this.LIZ = strLJFF;
        this.LIZIZ = !new C0VSJ(file, "from_external_flag").exists();
    }

    public static String LIZ(float f) {
        if (f < 0.0f) {
            return "invalid";
        }
        if (f > 100.0f) {
            return "> 100";
        }
        return new String[]{"0~10", "10~20", "20~30", "30~40", "40~50", "50~60", "60~70", "70~80", "80~90", "90~100"}[((int) f) / 10];
    }

    public static String LIZJ(float f) {
        if (f < 0.0f) {
            return "invalid";
        }
        float[] fArr = {2000.0f, 3000.0f, 4000.0f, 5000.0f, 10000.0f, 20000.0f, 30000.0f, 40000.0f, 50000.0f, 60000.0f, 70000.0f, 80000.0f, 90000.0f, 100000.0f, 150000.0f, 200000.0f, 300000.0f, 400000.0f, 500000.0f};
        String[] strArr = {"0~2k", "2k~3k", "3k~4k", "4k~5k", "5k~1w", "1w~2w", "2w~3w", "3w~4w", "4w~5w", "5w~6w", "7w~8w", "8w~9w", "9w~10w", "10w~15w", "15w~20w", "20w~30w", "30w~40w", "40w~50w", "> 50w"};
        int i = 0;
        while (f > fArr[i]) {
            i++;
            if (i >= 19) {
                return strArr[18];
            }
        }
        return strArr[i];
    }

    public static String LIZLLL(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        return "|------------- processErrorStateInfo--------------|\ncondition: " + processErrorStateInfo.condition + "\nprocessName: " + processErrorStateInfo.processName + "\npid: " + processErrorStateInfo.pid + "\nuid: " + processErrorStateInfo.uid + "\ntag: " + processErrorStateInfo.tag + "\nshortMsg : " + processErrorStateInfo.shortMsg + "\nlongMsg : " + processErrorStateInfo.longMsg + "\n-----------------------end----------------------------";
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x013f, code lost:
    
        r0 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802470Vdt.LJI(java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.0Ve5] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.0Ve5] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0Vdt] */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.0Ve5] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.json.JSONObject] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(org.json.JSONObject r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802470Vdt.LJIIIIZZ(org.json.JSONObject):void");
    }

    public final void LJIIIZ(JSONObject jSONObject) {
        int iIndexOf;
        int i = this.LJII;
        while (i < this.LJIIIIZZ && (iIndexOf = this.LIZ.indexOf("\n", i)) >= 0) {
            if (this.LIZ.startsWith("Load: ", i)) {
                String strSubstring = this.LIZ.substring(i + 6, iIndexOf);
                if (strSubstring != null) {
                    String[] strArrSplit = strSubstring.split(" / ");
                    if (strArrSplit.length == 3) {
                        try {
                            double d = CastDoubleProtector.parseDouble(strArrSplit[0].trim());
                            double d2 = CastDoubleProtector.parseDouble(strArrSplit[1].trim());
                            double d3 = CastDoubleProtector.parseDouble(strArrSplit[2].trim());
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(d);
                            jSONArray.put(d2);
                            jSONArray.put(d3);
                            jSONObject.put("load", jSONArray);
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            i = iIndexOf + 1;
        }
    }

    public static boolean LIZIZ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return str.equals(str2);
            }
            return false;
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        if (processErrorStateInfo.condition == processErrorStateInfo2.condition && processErrorStateInfo.pid == processErrorStateInfo2.pid && processErrorStateInfo.uid == processErrorStateInfo2.uid && LIZIZ(processErrorStateInfo.processName, processErrorStateInfo2.processName) && LIZIZ(processErrorStateInfo.tag, processErrorStateInfo2.tag) && LIZIZ(processErrorStateInfo.shortMsg, processErrorStateInfo2.shortMsg) && LIZIZ(processErrorStateInfo.longMsg, processErrorStateInfo2.longMsg)) {
            return true;
        }
        return false;
    }

    public static String LJII(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String strReplace : str.split("\n")) {
                int iIndexOf = strReplace.indexOf(47);
                int iIndexOf2 = strReplace.indexOf(": ");
                if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf < iIndexOf2) {
                    String strSubstring = strReplace.substring(iIndexOf, iIndexOf2);
                    if (!strSubstring.contains(str2) && (strSubstring.contains("com.") || strSubstring.contains(".google"))) {
                        strReplace = strReplace.replace(strSubstring, "/*.*.*");
                    }
                }
                sb.append(strReplace);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }
}
