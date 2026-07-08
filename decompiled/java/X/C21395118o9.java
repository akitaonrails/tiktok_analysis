package X;

import Y.ACListenerS166S0100000_32;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18o9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21395118o9 extends AbstractC1542070qEP implements InterfaceC1538610q8p {
    public final ViewGroup LLILLJJLI;
    public Context LLILLL;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILLL = null;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        Context context = this.LLILLL;
        if (context == null) {
            return null;
        }
        C19326510jH c19326510jH = new C19326510jH(context);
        C418570Gb9 c418570Gb9 = c19326510jH.LL;
        C418570Gb9 c418570Gb92 = c418570Gb9 != null ? c418570Gb9 : null;
        c418570Gb92.LIZ();
        c418570Gb92.LLJJ = true;
        c418570Gb92.LLJILJIL = true;
        c418570Gb92.postInvalidate();
        return c19326510jH;
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJLIIIJILLIZJL() {
        return LJJL();
    }

    @Override // X.InterfaceC1538610q8p
    public final ViewGroup LJJLJ() {
        return this.LLILLJJLI;
    }

    public C21395118o9(ViewGroup viewGroup) {
        this.LLILLJJLI = viewGroup;
    }

    public static File LJJIJL(Context context) throws Throwable {
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

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLL = context;
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJJJLI(final C1537720q7O c1537720q7O) {
        return LJJJLIIL(new InterfaceC1051240dSk() { // from class: X.18oB
            @Override // X.InterfaceC1051240dSk
            public final void refresh() {
                c1537720q7O.reload();
            }
        });
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        Context context = this.LLILLL;
        if (context != null) {
            C787870UvR c787870UvR = new C787870UvR(context);
            c787870UvR.setRetryClickListener(new ACListenerS166S0100000_32(interfaceC1051240dSk, 131));
            return c787870UvR;
        }
        return null;
    }

    @Override // X.AbstractC1542070qEP
    public final File LIZIZ(SparkSchemaParam sparkSchemaParam, String str) throws Throwable {
        String skeletonPath;
        String channel;
        String skeletonPath2;
        InputStream inputStreamOpen;
        File fileLJJIJL;
        File fileLJJIJL2;
        AssetManager assets;
        if (sparkSchemaParam == null || (skeletonPath = sparkSchemaParam.getSkeletonPath()) == null || skeletonPath.length() == 0) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            return c0vsj;
        }
        if (sparkSchemaParam == null || (channel = sparkSchemaParam.getChannel()) == null || (skeletonPath2 = sparkSchemaParam.getSkeletonPath()) == null) {
            return null;
        }
        try {
            Context context = this.LLILLL;
            if (context != null && (assets = context.getAssets()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skeletons/");
                sbLIZ.append(channel);
                sbLIZ.append('/');
                sbLIZ.append(skeletonPath2);
                inputStreamOpen = assets.open(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                inputStreamOpen = null;
            }
            try {
                Context context2 = this.LLILLL;
                if (context2 != null) {
                    fileLJJIJL = LJJIJL(context2);
                } else {
                    fileLJJIJL = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skeletons/");
                sbLIZ2.append(channel);
                sbLIZ2.append('/');
                sbLIZ2.append(skeletonPath2);
                C0VSV c0vsv = new C0VSV(new C0VSJ(fileLJJIJL, C2188811AlT.LIZIZ(sbLIZ2)));
                if (inputStreamOpen != null) {
                    try {
                        C2106208My.LIZ(inputStreamOpen, c0vsv);
                    } finally {
                        th = th;
                        try {
                            try {
                            } catch (Throwable th) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th2) {
                        }
                    }
                }
                C2107108Nh.LIZ(c0vsv, null);
                C2107108Nh.LIZ(inputStreamOpen, null);
                Context context3 = this.LLILLL;
                if (context3 != null) {
                    fileLJJIJL2 = LJJIJL(context3);
                } else {
                    fileLJJIJL2 = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("skeletons/");
                sbLIZ3.append(channel);
                sbLIZ3.append('/');
                sbLIZ3.append(skeletonPath2);
                C0VSJ c0vsj2 = new C0VSJ(fileLJJIJL2, C2188811AlT.LIZIZ(sbLIZ3));
                if (!c0vsj2.exists()) {
                    return null;
                }
                return c0vsj2;
            } catch (Throwable th3) {
                th = th3;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamOpen, th);
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = null;
                }
            }
        } catch (Throwable th7) {
            TryCatchGuardChecker.doCheck(th7);
            return null;
        }
    }

    @Override // X.InterfaceC1538610q8p
    public final void LJJIIJ(Context context, C1537480q70 c1537480q70) {
        this.LLILLL = context;
    }

    @Override // X.AbstractC1542070qEP
    public final View LJIJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LLILLL;
        if (context != null) {
            C21405218pm c21405218pm = new C21405218pm(context);
            c21405218pm.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
            c21405218pm.setFromAlpha(f);
            c21405218pm.setToAlpha(f2);
            c21405218pm.setDuration(l);
            c21405218pm.LIZ(file);
            C786410Ut5.LLJILJILJ(c21405218pm, 0);
            return c21405218pm;
        }
        return null;
    }
}
