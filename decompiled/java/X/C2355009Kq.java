package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.09Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2355009Kq {
    public static boolean LJIIJJI() {
        try {
            return "mounted".equals(C786410Ut5.X3());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @InterfaceC1294060jmO
    public static C0VSJ LJ() {
        if (!LJIIJ() || !LJIIJJI()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08P1.LIZ());
        sbLIZ.append("/livestream");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        LIZJ(c0vsj);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("app path:");
        sbLIZ2.append(c0vsj.getAbsolutePath());
        C20441214yg.LIZIZ("file_path", C2188811AlT.LIZIZ(sbLIZ2));
        return c0vsj;
    }

    public static boolean LJIIJ() {
        String strX3;
        try {
            strX3 = C786410Ut5.X3();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strX3 = null;
        }
        return "mounted".equals(strX3) || "mounted_ro".equals(strX3);
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new C0VSJ(str).exists();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZIZ(String str) {
        try {
            long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC771350UNp.LIVE_RESPONSE.getFullPath());
            sbLIZ.append(curUserId);
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C771340UNo.LIZIZ("response", strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZJ(C0VSJ c0vsj) {
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.exists();
    }

    @InterfaceC1294060jmO
    public static C0VSJ LIZLLL(String str) {
        if (LJIIJ() && LJIIJJI()) {
            C0VSJ c0vsj = new C0VSJ(LJ(), str);
            LIZJ(c0vsj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" path:");
            sbLIZ.append(c0vsj.getAbsolutePath());
            C20441214yg.LIZIZ("file_path", C2188811AlT.LIZIZ(sbLIZ));
            return c0vsj;
        }
        return null;
    }

    public static C0VSJ LJFF(Context context) {
        if (LJIIJ() && LJIIJJI() && C786410Ut5.x2(context) != null) {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.x2(context).getPath());
            LIZJ(c0vsj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache path:");
            sbLIZ.append(c0vsj.getAbsolutePath());
            C20441214yg.LIZIZ("file_path", C2188811AlT.LIZIZ(sbLIZ));
            return c0vsj;
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static C0VSJ LJI(Context context) {
        if (LJIIJ() && LJIIJJI()) {
            C0VSJ c0vsj = new C0VSJ(LJFF(context), "picture");
            LIZJ(c0vsj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("picture");
            sbLIZ.append(" cache path:");
            sbLIZ.append(c0vsj.getAbsolutePath());
            C20441214yg.LIZIZ("file_path", C2188811AlT.LIZIZ(sbLIZ));
            return c0vsj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LJII(android.content.Context r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2355009Kq.LJII(android.content.Context):X.0VSJ");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:16777307), block:B:68:0x005c */
    public static String LJIIL(C0VSJ c0vsj) throws Throwable {
        C0VSF c0vsf;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        String strLIZIZ = "";
        if (!LIZ(c0vsj.getPath())) {
            return "";
        }
        BufferedReader bufferedReader3 = null;
        try {
            try {
                c0vsf = new C0VSF(c0vsj);
            } catch (Throwable th) {
                th = th;
                bufferedReader3 = bufferedReader2;
            }
        } catch (Exception e) {
            e = e;
            c0vsf = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            c0vsf = null;
        }
        try {
            bufferedReader = new BufferedReader(c0vsf);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(line);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        try {
                            break;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsf != null) {
                        try {
                            c0vsf.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (bufferedReader != null) {
                    }
                    return strLIZIZ;
                }
            }
            c0vsf.close();
        } catch (Exception e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader3 = bufferedReader3;
                }
                bufferedReader3 = bufferedReader3;
            }
            if (c0vsf != null) {
                try {
                    c0vsf.close();
                } catch (IOException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            }
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                    throw th;
                } catch (IOException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    throw th;
                }
            }
            throw th;
        }
        try {
            bufferedReader.close();
            return strLIZIZ;
        } catch (IOException e8) {
            TryCatchGuardChecker.doCheck(e8);
            return strLIZIZ;
        }
    }

    public static void LJIILJJIL(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJIILJJIL(file2);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public static void LJIILL(String str) {
        if (LJIIJJI() && !TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.canWrite()) {
                c0vsj.delete();
            }
        }
    }

    public static C0VSJ LJIIIIZZ(Context context, String str) {
        C0VSJ c0vsj = new C0VSJ(LJII(context), str);
        if (!LIZJ(c0vsj)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" path:");
        sbLIZ.append(c0vsj.getAbsolutePath());
        C20441214yg.LIZIZ("file_path", C2188811AlT.LIZIZ(sbLIZ));
        return c0vsj;
    }

    public static C0VSJ LJIIIZ(Context context, String str) {
        if (new C0VSJ(LJ(), str).exists()) {
            return LIZLLL(str);
        }
        if (new C0VSJ(LJII(context), str).exists()) {
            return LJIIIIZZ(context, str);
        }
        if (LJIIJ() && LJIIJJI()) {
            C0VSJ c0vsjLIZLLL = LIZLLL(str);
            if (c0vsjLIZLLL == null) {
                return LJIIIIZZ(context, str);
            }
            return c0vsjLIZLLL;
        }
        return LJIIIIZZ(context, str);
    }

    public static boolean LJIILLIIL(Object obj, String str) {
        try {
            long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC771350UNp.LIVE_RESPONSE.getFullPath());
            sbLIZ.append(curUserId);
            sbLIZ.append(File.separator);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C0VSJ c0vsj2 = new C0VSJ(strLIZIZ2);
            if (!c0vsj2.exists()) {
                c0vsj2.createNewFile();
            }
            C771340UNo.LJFF("response", strLIZIZ2);
            String strLJIILL = C19748512Ol.LIZIZ.LJIILL(obj);
            if (!TextUtils.isEmpty(strLJIILL) && !TextUtils.isEmpty(strLIZIZ2)) {
                try {
                    C794210VDn c794210VDn = new C794210VDn(strLIZIZ2, false);
                    c794210VDn.write(strLJIILL);
                    c794210VDn.flush();
                    c794210VDn.close();
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static Object LJIILIIL(int i, Class cls, String str) {
        try {
            long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC771350UNp.LIVE_RESPONSE.getFullPath());
            sbLIZ.append(curUserId);
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C771340UNo.LJFF("response", strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            String strLJIIL = "";
            if (c0vsj.exists()) {
                if (i > 0) {
                    if (System.currentTimeMillis() - c0vsj.lastModified() > ((long) i) * 24 * 60 * 60 * 1000) {
                        c0vsj.delete();
                        C771340UNo.LIZIZ("response", strLIZIZ);
                        return null;
                    }
                }
                strLJIIL = LJIIL(c0vsj);
            }
            return C19748512Ol.LIZIZ.LJII(strLJIIL, cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
