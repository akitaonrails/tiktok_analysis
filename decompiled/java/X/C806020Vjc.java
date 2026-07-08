package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Vjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806020Vjc {
    public final CoroutineContext LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(272));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 168));
    public final Gson LIZLLL;

    public final C0VSJ LJFF() {
        String strLIZIZ;
        try {
            try {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                File fileY2 = C786410Ut5.y2(contextLIZ, "aigc_logs");
                if (fileY2 == null) {
                    fileY2 = new C0VSJ(LIZ(contextLIZ), "aigc_logs");
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_uid_report", true, true)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) this.LIZIZ.getValue());
                    sbLIZ.append("_trace_logs");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "trace_logs";
                }
                C0VSJ c0vsj = new C0VSJ(fileY2, strLIZIZ);
                if (c0vsj.exists() && c0vsj.isFile()) {
                    try {
                        c0vsj.delete();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                c0vsj.mkdirs();
                return c0vsj;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public final Keva LJ() {
        return (Keva) this.LIZJ.getValue();
    }

    public final C0VSJ LIZJ() {
        C0VSJ c0vsjLJFF = LJFF();
        if (c0vsjLJFF == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ().getInt("trace_read_index", 0));
        sbLIZ.append(".log");
        return new C0VSJ(c0vsjLJFF, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0VSJ LIZLLL() {
        C0VSJ c0vsjLJFF = LJFF();
        if (c0vsjLJFF == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ().getInt("trace_write_index", 0));
        sbLIZ.append(".log");
        C0VSJ c0vsj = new C0VSJ(c0vsjLJFF, C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.isFile()) {
            c0vsj.delete();
        }
        return c0vsj;
    }

    public C806020Vjc(CoroutineContext coroutineContext) {
        this.LIZ = coroutineContext;
        C1227904rF.LIZ.getClass();
        this.LIZLLL = C1227904rF.LIZLLL();
    }

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

    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, this.LIZ, new C806000Vja(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public static void LJI(long j, TraceItem traceItem) {
        if (!C255800A0s.LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        String str = traceItem.traceId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("trace_id", str);
        String str3 = traceItem.eventName;
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJFF("event_name", str3);
        String str4 = traceItem.tenant;
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJFF("tenant", str4);
        String str5 = traceItem.business;
        if (str5 == null) {
            str5 = "";
        }
        c2344009Gk.LJFF("business", str5);
        String str6 = traceItem.scene;
        if (str6 != null) {
            str2 = str6;
        }
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("creation_trace_event_size_exceed_4kb", c2344009Gk.LIZ);
    }

    public static void LJII(long j, long j2, String str) {
        if (!C255800A0s.LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LJFF("error", str);
        c2344009Gk.LIZLLL(j2, "file_size");
        C20684815ws.LJIILLIIL("creation_trace_log_write", c2344009Gk.LIZ);
    }
}
