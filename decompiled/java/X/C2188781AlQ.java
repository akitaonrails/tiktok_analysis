package X;

import android.app.Application;
import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188781AlQ {
    public static final C2188781AlQ LIZ = new C2188781AlQ();

    public static void LIZ(Context context) throws Throwable {
        Object obj;
        VERuntime.getInstance().setAssetManagerEnable(true);
        C1A66.LIZLLL(new AssetResourceFinder(context.getAssets(), "model/"));
        Context contextN3 = C786410Ut5.N3(context);
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextN3.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        C1A66.LIZJ(context, file.getAbsolutePath());
        C1A66.LJFF((byte) 15);
        VERuntime.getInstance().registerApplog(new InterfaceC2188801AlS() { // from class: X.1AlR
            @Override // X.InterfaceC2188801AlS
            public final void LIZ(String str, JSONObject jSONObject) {
            }
        });
        VERuntime.getInstance().setEffectLogLevel(3);
        C1A66.LJ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("setMaxImageBufferCount: ");
        sbLIZ4.append(10);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
        TEInterface.nativeSetImageBufferLimit(10, 1920, 1920);
        VEEditor.LJJJJ(13060256);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("setEnableEffectTransition: ");
        sbLIZ5.append(true);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ5));
        TEInterface.nativeEnableEffectTransiton(true);
        VEEditor.LJJJI();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("enableHighSpeed ");
        sbLIZ6.append(true);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ6));
        TEInterface.nativeEnableHighSpeed(true);
    }
}
