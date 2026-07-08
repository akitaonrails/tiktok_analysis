package X;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.ammt.mmt.impl.NativeMMTPlugin;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.0VmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807760VmQ {
    public static boolean LIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08O2.LIZ().getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("NativeMMT.ini");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLIZ, 0, "LeakDetectorSp");
        return (sharedPreferencesLIZJ.getBoolean("open_leak_detector_on_local_test", false) && sharedPreferencesLIZJ.getBoolean("native_memory_monitor_status", true)) || c0vsj.exists();
    }

    public static boolean LIZIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return contextLIZ.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isOk ");
            sbLIZ.append(th);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static void LIZJ(Context context) throws Exception {
        C807770VmR c807770VmR = new C807770VmR();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.bytedance.ammt.mmt.DUMP");
        intentFilter.addAction("com.bytedance.ammt.mmt.START");
        C786410Ut5.LJIJJ(context, c807770VmR, intentFilter);
        if (NativeMMTPlugin.LIZLLL == null) {
            synchronized (NativeMMTPlugin.class) {
                try {
                    NativeMMTPlugin.LIZLLL = new NativeMMTPlugin();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        NativeMMTPlugin nativeMMTPlugin = NativeMMTPlugin.LIZLLL;
        String strLIZ = C803080Ves.LIZ(context);
        nativeMMTPlugin.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append(NativeMMTPlugin.LJ);
        nativeMMTPlugin.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        nativeMMTPlugin.LIZJ = "native";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08O2.LIZ().getAbsolutePath());
        sbLIZ2.append(str);
        sbLIZ2.append("NativeMMT.ini");
        int i = 314572800;
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C0VSP(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)))));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            } else {
                                i = Integer.parseInt(line);
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            TryCatchGuardChecker.doCheck(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            nativeMMTPlugin.LIZIZ(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                            nativeMMTPlugin.LIZJ();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            TryCatchGuardChecker.doCheck(th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException th2) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException th22) {
        }
        nativeMMTPlugin.LIZIZ(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        nativeMMTPlugin.LIZJ();
    }
}
