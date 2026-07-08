package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8C extends C0V1P {
    public static String LLJLILLLLZIIL;
    public static String LLJLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJILLL;
    public String LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public boolean LLJJJ;
    public List<C0V8D> LLJJJIL;
    public C823150WQv<C0V8F> LLJJLIIIJLLLLLLLZ;
    public C823150WQv<C0V8F> LLJL;
    public C823150WQv<C0V8G> LLJLIL;
    public long LLJI = 524288000;
    public long LLJIJIL = 524288000;
    public int LLJILJIL = 20;
    public long LLJILJILJ = 2592000000L;
    public List<String> LLJJJJ = new ArrayList();
    public List<String> LLJJJJJIL = new ArrayList();
    public final List<String> LLJJJJLIIL = new ArrayList();
    public final List<String> LLJJL = new ArrayList();

    @Override // X.C0V1P
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.C0V1P
    public final long LJIILJJIL() {
        return 120000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    public final void LJIJ() {
        List<C0V8D> list;
        ?? r11 = 1;
        String[] strArr = {LLJLILLLLZIIL, LLJLL};
        this.LLJJJIL = new ArrayList();
        int i = 0;
        do {
            String str = strArr[i];
            LJIIZILJ(new C0VSJ(str), r11, r11, this.LLJJJIL);
            C0VSJ c0vsj = new C0VSJ(str);
            C0V8E c0v8e = new C0V8E(this);
            c0v8e.LIZ = str;
            c0v8e.LIZIZ = new C0V8E(this);
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                c0v8e.LIZLLL = fileArrListFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(c0v8e);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i2 = 0;
                    r11 = r11;
                    while (i2 < size) {
                        C0V8E c0v8e2 = (C0V8E) linkedList.poll();
                        if (c0v8e2 != null) {
                            String str2 = c0v8e2.LIZ;
                            C0VSJ c0vsj2 = new C0VSJ(str2);
                            if (!c0vsj2.exists() || ((ArrayList) this.LLJJJJLIIL).contains(str2)) {
                                c0v8e2.LIZIZ.LIZLLL -= r11 == true ? 1 : 0;
                            } else if (c0vsj2.isFile()) {
                                long length = c0vsj2.length();
                                if (length > 0) {
                                    if (C792400V6o.LJIIIIZZ()) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("appendExceptionFileQueue: path: ");
                                        sbLIZ.append(str2);
                                        sbLIZ.append(", size: ");
                                        sbLIZ.append(length);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    if (length <= 17179869184L) {
                                        if (this.LLJJLIIIJLLLLLLLZ == null) {
                                            this.LLJJLIIIJLLLLLLLZ = new C823150WQv<>(this.LLJILJIL);
                                        }
                                        this.LLJJLIIIJLLLLLLLZ.LIZ(new C0V8F(str2, length, r11 == true ? 1 : 0));
                                    }
                                }
                                C0V8E c0v8e3 = c0v8e2.LIZIZ;
                                if (c0v8e3 != null) {
                                    c0v8e3.LIZ(length);
                                    if (!c0v8e2.LIZIZ.LJFF) {
                                        long jCurrentTimeMillis = System.currentTimeMillis() - c0vsj2.lastModified();
                                        if (jCurrentTimeMillis >= this.LLJILJILJ && jCurrentTimeMillis < 62899200000L && jCurrentTimeMillis > 0) {
                                            LJIILLIIL(0, length, jCurrentTimeMillis, str2);
                                        }
                                    }
                                }
                            } else {
                                File[] fileArrListFiles2 = c0vsj2.listFiles();
                                if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
                                    c0v8e2.LIZIZ.LIZ(0L);
                                } else {
                                    c0v8e2.LIZLLL = fileArrListFiles2.length;
                                    for (File file : fileArrListFiles2) {
                                        C0V8E c0v8e4 = new C0V8E(this);
                                        c0v8e4.LIZIZ = c0v8e2;
                                        c0v8e4.LIZ = file.getAbsolutePath();
                                        if (file.isDirectory() && !c0v8e2.LJFF) {
                                            long jCurrentTimeMillis2 = System.currentTimeMillis() - file.lastModified();
                                            if (jCurrentTimeMillis2 >= this.LLJILJILJ && jCurrentTimeMillis2 < 62899200000L && jCurrentTimeMillis2 > 0) {
                                                c0v8e4.LJFF = true;
                                                c0v8e4.LJI = jCurrentTimeMillis2;
                                            }
                                        }
                                        linkedList.offer(c0v8e4);
                                    }
                                }
                            }
                        }
                        i2++;
                        r11 = 1;
                    }
                }
            }
            i++;
        } while (i < 2);
        List<String> list2 = this.LLJJL;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            Iterator it2 = ((ArrayList) this.LLJJL).iterator();
            while (it2.hasNext()) {
                LJIIZILJ(new C0VSJ((String) it2.next()), r11 == true ? 1 : 0, false, this.LLJJJIL);
            }
        }
        for (C0V8D c0v8d : (ArrayList) this.LLJJJIL) {
            if ("normal".equals(c0v8d.LJ) && (list = c0v8d.LJFF) != null) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        c0v8d.LIZIZ += ((C0V8D) it3.next()).LIZIZ;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    @Override // X.C0V1P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V8C.LJIIL():void");
    }

    public C0V8C(boolean z) {
        this.LLJJIJIL = z;
        this.LLILZIL = "disk";
    }

    public static File LJIILL(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static long LJIJI(File file) {
        long length;
        long j = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    length = LJIJJ(file2);
                } else {
                    length = file2.length();
                }
                j += length;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return j;
    }

    public static long LJIJJ(File file) {
        if (C2259908tJ.LIZIZ()) {
            long jLIZ = C2259908tJ.LIZ(file);
            if (jLIZ <= 0) {
                return LJIJI(file);
            }
            return jLIZ;
        }
        return LJIJI(file);
    }

    @Override // X.C0V1P
    public final void LIZJ(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("dump_switch", true);
        this.LLJ = zOptBoolean;
        if (zOptBoolean) {
            long jCurrentTimeMillis = System.currentTimeMillis() - C2166108eB.LIZ.LIZ.getLong("check_disk_last_time", 0L);
            if (jCurrentTimeMillis < 86400000 && jCurrentTimeMillis > 0) {
                this.LLIZLLLIL = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.LLJI = ((long) jSONObject.optInt("dump_threshold")) * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.LLJIJIL = ((long) jSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.LLJILJIL = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.LLJILJILJ = ((long) jSONObject.optInt("outdated_days")) * 86400000;
            }
            this.LLJJJJ = C792730V7v.LIZLLL("disk_customed_paths", jSONObject);
            this.LLJJJJJIL = C792730V7v.LIZJ("ignored_relative_paths", jSONObject);
        }
        if (jSONObject.optBoolean("enable_collect_apm6", false)) {
            this.LLIZLLLIL = true;
        }
        if (this.LLJJIJIL && !this.LLILZLL && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
        }
    }

    public final boolean LJIJJLI(C0V8D c0v8d) {
        Iterator it2 = ((ArrayList) this.LLJJJJLIIL).iterator();
        while (it2.hasNext()) {
            if (c0v8d.LIZ.contains((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILLIIL(final int i, final long j, final long j2, final String str) {
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendutdatedFileQueue: path: ");
            sbLIZ.append(str);
            sbLIZ.append(", size: ");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 102400 && j <= 17179869184L) {
            if (this.LLJLIL == null) {
                this.LLJLIL = new C823150WQv<>(this.LLJILJIL);
            }
            this.LLJLIL.LIZ(new C0V8F(i, j, j2, str) { // from class: X.0V8G
                public final String LLILZ;
                public final long LLILZIL;
                public final int LLILZLL;
                public final long LLIZ;

                @Override // X.C0V8F
                public final JSONObject LIZJ() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        String strReplace = this.LLILZ;
                        if (strReplace.contains(C0V8C.LLJLILLLLZIIL)) {
                            strReplace = strReplace.replace(C0V8C.LLJLILLLLZIIL, "internal");
                        } else if (strReplace.contains(C0V8C.LLJLL)) {
                            strReplace = strReplace.replace(C0V8C.LLJLL, "external");
                        }
                        jSONObject.put("name", strReplace);
                        jSONObject.put("size", this.LLILZIL);
                        int i2 = this.LLILZLL;
                        if (i2 > 0) {
                            jSONObject.put("num", i2);
                        }
                        jSONObject.put("outdate_interval", this.LLIZ);
                        return jSONObject;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }

                @Override // X.C0V8F, java.lang.Comparable
                public final int compareTo(Object obj) {
                    long j3 = this.LLIZ;
                    long j4 = ((C0V8G) obj).LLIZ;
                    if (j3 == j4) {
                        return 0;
                    }
                    if (j3 > j4) {
                        return 1;
                    }
                    return -1;
                }

                {
                    this.LLILZ = str;
                    this.LLILZIL = j;
                    this.LLILZLL = i;
                    this.LLIZ = j2;
                }
            });
        }
    }

    public final void LJIIZILJ(File file, int i, boolean z, List<C0V8D> list) {
        if (i <= 2 && file.exists()) {
            if (!((ArrayList) this.LLJJJJLIIL).contains(file.getAbsolutePath())) {
                if (file.isDirectory()) {
                    if (z) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null && file2.exists()) {
                                    if (!((ArrayList) this.LLJJJJLIIL).contains(file2.getAbsolutePath())) {
                                        C0V8D c0v8d = new C0V8D();
                                        c0v8d.LIZLLL = file2.isDirectory();
                                        c0v8d.LIZ = file2.getAbsolutePath();
                                        if (file2.isDirectory()) {
                                            ArrayList arrayList = new ArrayList();
                                            c0v8d.LJFF = arrayList;
                                            if (i == 2) {
                                                c0v8d.LIZIZ = LJIJJ(file2);
                                            }
                                            LJIIZILJ(file2, i + 1, z, arrayList);
                                            list.add(c0v8d);
                                        } else {
                                            c0v8d.LIZIZ = file2.length();
                                            list.add(c0v8d);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    C0V8D c0v8d2 = new C0V8D();
                    c0v8d2.LIZLLL = true;
                    c0v8d2.LJ = "custom";
                    c0v8d2.LIZ = file.getAbsolutePath();
                    c0v8d2.LIZIZ = LJIJJ(file);
                    list.add(c0v8d2);
                    return;
                }
                C0V8D c0v8d3 = new C0V8D();
                c0v8d3.LIZLLL = false;
                c0v8d3.LIZ = file.getAbsolutePath();
                c0v8d3.LIZIZ = file.length();
                if (!z) {
                    c0v8d3.LJ = "custom";
                }
                list.add(c0v8d3);
            }
        }
    }

    public final void LJIL(long j, long j2, long j3, long j4) {
        long j5;
        try {
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("disk: data: ");
                sbLIZ.append(j);
                sbLIZ.append(" , cache: ");
                sbLIZ.append(j2);
                sbLIZ.append(" , total: ");
                sbLIZ.append(j3);
                sbLIZ.append(" , free: ");
                sbLIZ.append(j4);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            long j6 = 17179869184L;
            if (j > 17179869184L) {
                j5 = 17179869184L;
            } else {
                j5 = j;
            }
            if (j2 <= 17179869184L) {
                j6 = j2;
            }
            JSONObject jSONObject = new JSONObject();
            if (j > 0) {
                jSONObject.put("data", j5);
            }
            if (j2 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j3 > 0) {
                jSONObject.put("total", j3 / 1073741824);
            }
            if (j4 > 0) {
                jSONObject.put("rom_free", j4 / 1073741824);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.LLJ && j5 > this.LLJI) {
                if (this.LLJJLIIIJLLLLLLLZ != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ.LIZIZ()).iterator();
                    while (it2.hasNext()) {
                        JSONObject jSONObjectLIZJ = ((C0V8F) it2.next()).LIZJ();
                        if (jSONObjectLIZJ != null) {
                            jSONArray.put(jSONObjectLIZJ);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.LLJL != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it3 = ((ArrayList) this.LLJL.LIZIZ()).iterator();
                    while (it3.hasNext()) {
                        JSONObject jSONObjectLIZJ2 = ((C0V8F) it3.next()).LIZJ();
                        if (jSONObjectLIZJ2 != null) {
                            jSONArray2.put(jSONObjectLIZJ2);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.LLJLIL != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it4 = ((ArrayList) this.LLJLIL.LIZIZ()).iterator();
                    while (it4.hasNext()) {
                        JSONObject jSONObjectLIZJ3 = ((C0V8G) it4.next()).LIZJ();
                        if (jSONObjectLIZJ3 != null) {
                            jSONArray3.put(jSONObjectLIZJ3);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<C0V8D> list = this.LLJJJIL;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j5);
                    JSONArray jSONArray4 = new JSONArray();
                    for (C0V8D c0v8d : (ArrayList) this.LLJJJIL) {
                        if (LJIJJLI(c0v8d)) {
                            c0v8d.LIZJ = 0.0f;
                        } else {
                            c0v8d.LIZJ = (float) new BigDecimal(c0v8d.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                        }
                        List<C0V8D> list2 = c0v8d.LJFF;
                        if (list2 != null) {
                            ArrayList<C0V8D> arrayList = (ArrayList) list2;
                            if (arrayList.size() > 0) {
                                for (C0V8D c0v8d2 : arrayList) {
                                    if (LJIJJLI(c0v8d2)) {
                                        c0v8d2.LIZJ = 0.0f;
                                    } else {
                                        c0v8d2.LIZJ = (float) new BigDecimal(c0v8d2.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                                    }
                                }
                            }
                        }
                        jSONArray4.put(c0v8d.LIZ());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                this.LLJJLIIIJLLLLLLLZ = null;
                this.LLJL = null;
                this.LLJLIL = null;
                this.LLJJJIL = null;
            }
            C0V1P.LJIILIIL(new C791160V1u("disk", "storageUsed", jSONObject, null, jSONObject2, 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
