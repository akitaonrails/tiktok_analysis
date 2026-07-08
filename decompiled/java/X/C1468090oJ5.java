package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468090oJ5 {
    public static boolean LJFF;
    public static boolean LJI;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public CopyOnWriteArrayList<C1468080oJ4> LIZIZ = null;
    public CopyOnWriteArrayList<C1468080oJ4> LIZJ = null;
    public CopyOnWriteArrayList<Integer> LIZLLL = null;
    public int LJ = 0;

    public final void LIZJ() {
        CopyOnWriteArrayList<C1468080oJ4> copyOnWriteArrayList = this.LIZJ;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        if (this.LIZJ.size() <= 0 || this.LIZJ.get(0).LJ != -1) {
            EngineThreadPool.addExecuteTask(new ARunnableS123S0100000_23(this, 193));
        }
    }

    public static long LIZ(String str) {
        if (str != null && !str.isEmpty()) {
            char[] charArray = str.toCharArray();
            String str2 = null;
            int i = 0;
            String str3 = null;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (true) {
                if (i >= charArray.length) {
                    break;
                }
                char c = charArray[i];
                if (c == ' ') {
                    if (i2 == 12) {
                        str3 = new String(charArray, i3, i - i3);
                    } else if (i2 == 13) {
                        str2 = new String(charArray, i3, i - i3);
                        break;
                    }
                    if (z) {
                        i2++;
                        i3 = i + 1;
                    }
                } else if (c == ')') {
                    z = true;
                }
                i++;
            }
            if (str3 != null && str2 != null) {
                try {
                    return (CastIntegerProtector.parseInt(str3) + CastIntegerProtector.parseInt(str2)) * 10;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return -1L;
                }
            }
            return -1L;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static String LIZIZ(String str) throws Throwable {
        C0VSP c0vsp;
        BufferedInputStream bufferedInputStream;
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
                r2 = str;
            }
            try {
                bufferedInputStream = new BufferedInputStream(c0vsp);
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i));
                    }
                    String string = sb.toString();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        c0vsp.close();
                        return string;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return string;
                    }
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (c0vsp != null) {
                        try {
                            c0vsp.close();
                            return "";
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return "";
                        }
                    }
                    return "";
                }
            } catch (Exception e6) {
                e = e6;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = r2;
                    }
                    r2 = r2;
                }
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
                if (c0vsp != null) {
                    try {
                        c0vsp.close();
                        throw th;
                    } catch (IOException e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            c0vsp = null;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            c0vsp = null;
        }
    }

    public final void LIZLLL(C1468080oJ4 c1468080oJ4) {
        Object obj;
        String lowerCase;
        String strSubstring;
        long jLongValue;
        if (c1468080oJ4 != null) {
            int i = c1468080oJ4.LJIIIIZZ;
            long j = -1;
            if (i == 1) {
                String str = c1468080oJ4.LIZIZ;
                if (str != null) {
                    if (LJI) {
                        try {
                            int i2 = CastIntegerProtector.parseInt(str);
                            Class<?> cls = Class.forName("com.bytedance.otis.resource.cpu.CpuNative");
                            jLongValue = ((Long) cls.getMethod("getThreadCpuTime", Integer.TYPE).invoke(cls, Integer.valueOf(i2))).longValue();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            jLongValue = -1;
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("/proc/self/task/");
                        sbLIZ.append(str);
                        sbLIZ.append("/stat");
                        jLongValue = LIZ(LIZIZ(C2188811AlT.LIZIZ(sbLIZ)));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c1468080oJ4.LJFF == 0 || jLongValue == -1) {
                        c1468080oJ4.LJII = -1.0f;
                    } else {
                        c1468080oJ4.LJII = (jLongValue - c1468080oJ4.LJ) / (jCurrentTimeMillis - r2);
                    }
                    c1468080oJ4.LJ = jLongValue;
                    c1468080oJ4.LJFF = jCurrentTimeMillis;
                }
            } else if (i == 2 && c1468080oJ4.LIZJ != null) {
                c1468080oJ4.LJ = 0L;
                if (c1468080oJ4.LJFF == 0) {
                    c1468080oJ4.LJFF = System.currentTimeMillis();
                }
                HashSet<String> hashSet = c1468080oJ4.LIZJ;
                this.LJ = 0;
                Iterator<String> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("/proc/self/task/");
                    sbLIZ2.append(next);
                    sbLIZ2.append("/stat");
                    String strLIZIZ = LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
                        long jLIZ = LIZ(strLIZIZ);
                        if (jLIZ != j) {
                            HashMap<String, Object> map = c1468080oJ4.LIZLLL;
                            if (map != null) {
                                if (map.containsKey(next) && (obj = c1468080oJ4.LIZLLL.get(next)) != null && jLIZ - ((Long) obj).longValue() > 0) {
                                    this.LJ++;
                                }
                                c1468080oJ4.LIZLLL.put(next, Long.valueOf(jLIZ));
                            }
                            c1468080oJ4.LJ += jLIZ;
                            j = -1;
                        }
                    } else {
                        it2.remove();
                        j = -1;
                    }
                }
                if (c1468080oJ4.LJI == 0) {
                    c1468080oJ4.LJI = c1468080oJ4.LJ;
                } else {
                    c1468080oJ4.LJII = (c1468080oJ4.LJ - r2) / (System.currentTimeMillis() - c1468080oJ4.LJFF);
                }
            }
            String str2 = c1468080oJ4.LIZ;
            if (str2 != null) {
                if (str2.contains("-")) {
                    int iIndexOf = c1468080oJ4.LIZ.indexOf("-");
                    if (iIndexOf > 0 && (strSubstring = c1468080oJ4.LIZ.substring(0, iIndexOf)) != null) {
                        lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                    } else {
                        return;
                    }
                } else {
                    lowerCase = c1468080oJ4.LIZ.toLowerCase(Locale.ROOT);
                }
                if (lowerCase != null) {
                    if (LJFF) {
                        float f = c1468080oJ4.LJII;
                        if (f != -1.0f) {
                            this.LIZ.put(lowerCase, Float.valueOf(f));
                            return;
                        }
                        return;
                    }
                    this.LIZ.put(lowerCase, Float.valueOf(c1468080oJ4.LJII));
                }
            }
        }
    }

    public final void LJ(String[] strArr) {
        HashSet<String> hashSet;
        for (int i = 1; i < this.LIZIZ.size() + 1; i++) {
            if (strArr.length == 2 && strArr[1].startsWith(this.LIZIZ.get(i).LIZ)) {
                if (this.LIZIZ.get(i).LJIIIIZZ == 2) {
                    if (this.LIZIZ.get(i).LIZJ == null) {
                        this.LIZIZ.get(i).LIZJ = new HashSet<>();
                    }
                    if (this.LIZIZ.get(i).LIZLLL == null) {
                        this.LIZIZ.get(i).LIZLLL = new HashMap<>();
                    }
                    if (this.LIZIZ.get(i).LIZJ != null && (hashSet = this.LIZIZ.get(i).LIZJ) != null && !hashSet.contains(strArr[0])) {
                        hashSet.add(strArr[0]);
                        return;
                    }
                    return;
                }
                C1468080oJ4 c1468080oJ4 = this.LIZIZ.get(i);
                c1468080oJ4.LJFF = 0L;
                c1468080oJ4.LJI = 0L;
                c1468080oJ4.LJII = -1.0f;
                c1468080oJ4.LJ = 0L;
                c1468080oJ4.LIZIZ = strArr[0];
                c1468080oJ4.LJFF = System.currentTimeMillis();
                return;
            }
        }
    }
}
