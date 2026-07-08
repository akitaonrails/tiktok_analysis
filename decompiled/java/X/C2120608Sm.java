package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120608Sm {
    public static final C199494133s<C2120708Sn> LIZ = new C199494133s<>();
    public static final Object LIZIZ = new Object();
    public static C2120708Sn LIZJ = null;

    public static File LIZ(Context context) throws Throwable {
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

    public static long LIZIZ(Context context) {
        PackageManager packageManager = C786410Ut5.N3(context).getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C2204961BRm.LJJJJLI(packageManager, context.getPackageName(), PackageManager.PackageInfoFlags.of(0L), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJnH0DffC1ixxlhdnSHi86fGYiiW", null)).lastUpdateTime;
        }
        return C786410Ut5.Y3(packageManager, context.getPackageName(), 0).lastUpdateTime;
    }

    public static void LIZLLL(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C2120508Sl c2120508SlLIZ;
        int i;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (!z && LIZJ != null) {
            return;
        }
        synchronized (LIZIZ) {
            if (!z) {
                try {
                    if (LIZJ != null) {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int i2 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                z2 = false;
            }
            try {
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                assetFileDescriptorOpenFd.close();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    C0VSJ c0vsj = new C0VSJ(new C0VSJ("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = c0vsj.length();
                    if (c0vsj.exists() && length > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C0VSJ c0vsj2 = new C0VSJ(new C0VSJ("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = c0vsj2.length();
                    if (c0vsj2.exists() && length2 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    try {
                        long jLIZIZ = LIZIZ(context);
                        C0VSJ c0vsj3 = new C0VSJ(LIZ(context), "profileInstalled");
                        if (c0vsj3.exists()) {
                            try {
                                c2120508SlLIZ = C2120508Sl.LIZ(c0vsj3);
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                LIZJ(131072, z3, z4, z2);
                                return;
                            }
                        } else {
                            c2120508SlLIZ = null;
                        }
                        if (c2120508SlLIZ != null && c2120508SlLIZ.LIZJ == jLIZIZ && (i = c2120508SlLIZ.LIZIZ) != 2) {
                            i2 = i;
                        } else if (!z2) {
                            i2 = 327680;
                        } else if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (c2120508SlLIZ != null && c2120508SlLIZ.LIZIZ == 2 && i2 == 1 && length < c2120508SlLIZ.LIZLLL) {
                            i2 = 3;
                        }
                        C2120508Sl c2120508Sl = new C2120508Sl(1, i2, jLIZIZ, length2);
                        if (c2120508SlLIZ == null || !c2120508SlLIZ.equals(c2120508Sl)) {
                            try {
                                c2120508Sl.LIZIZ(c0vsj3);
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                i2 = 196608;
                            }
                        }
                        LIZJ(i2, z3, z4, z2);
                        return;
                    } catch (PackageManager.NameNotFoundException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        LIZJ(65536, z3, z4, z2);
                        return;
                    }
                }
                LIZJ(262144, false, false, z2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.08Sn, java.lang.Object] */
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
    public static C2120708Sn LIZJ(int i, boolean z, boolean z2, boolean z3) {
        ?? r1 = new Object() { // from class: X.08Sn
        };
        LIZJ = r1;
        LIZ.LJIIZILJ(r1);
        return LIZJ;
    }
}
