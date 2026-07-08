package com.bytedance.alignpage;

import X.C08RN;
import X.C08SE;
import X.C0VSJ;
import X.C2111808Pc;
import X.C2188811AlT;
import X.C786450Ut9;
import X.C805380Via;
import android.app.Application;
import android.content.Context;
import com.bytedance.alignpage.AlignPageOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class AlignPageOpt {
    public static boolean is16kbChecked;
    public static boolean is16kbEnable;
    public static boolean sOptimized;

    public static native boolean n16kbcheck();

    public static native boolean nStart(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str);

    public static native boolean nTest(String str, int i);

    public static File INVOKEVIRTUAL_com_bytedance_alignpage_AlignPageOpt_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public static boolean is16kb(Context context) {
        if (is16kbChecked) {
            return is16kbEnable;
        }
        if (C2111808Pc.LIZ(context)) {
            try {
                is16kbEnable = n16kbcheck();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        is16kbChecked = true;
        return is16kbEnable;
    }

    public static void reportAlignPageExp(String str) {
        String strLIZJ;
        File[] fileArrListFiles = new C0VSJ(str).listFiles(new FilenameFilter() { // from class: X.08Pb
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return AlignPageOpt.lambda$reportAlignPageExp$0(file, str2);
            }
        });
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file != null && file.isFile()) {
                try {
                    strLIZJ = C08SE.LIZJ(file);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZJ = null;
                }
                try {
                    C805380Via.LIZ("AlignPageOpt", strLIZJ, "threadName", "AlignPageOpt");
                    C08SE.LIZIZ(file);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static /* synthetic */ boolean lambda$reportAlignPageExp$0(File file, String str) {
        return str.startsWith("dump_align_page_exp_");
    }

    public static synchronized void test(Context context, String str, int i) {
        if (C2111808Pc.LIZ(context)) {
            try {
                nTest(str, i);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static synchronized void start(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (sOptimized) {
            return;
        }
        synchronized (AlignPageOpt.class) {
            try {
                if (!sOptimized) {
                    if (C2111808Pc.LIZ(context)) {
                        try {
                            C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_bytedance_alignpage_AlignPageOpt_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "align_page_opt");
                            c0vsj.mkdirs();
                            String absolutePath = c0vsj.getAbsolutePath();
                            nStart(z, z2, z3, z4, z5, absolutePath);
                            sOptimized = true;
                            if (z4) {
                                reportAlignPageExp(absolutePath);
                            }
                        } catch (NoSuchMethodError e) {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (UnsatisfiedLinkError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    sOptimized = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
