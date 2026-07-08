package X;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.os.Build;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineLoader;
import com.bytedance.speech.speechengine.bridge.SpeechBridge;
import com.bytedance.speech.speechengine.bridge.SpeechBridgeCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.1BWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWJ implements SpeechEngine, SpeechBridgeCallback {
    public static C1741960vQo LJIIJJI;
    public SpeechEngine.SpeechListener LIZ = null;
    public String LIZIZ = "";
    public String LIZJ = "Recorder";
    public boolean LIZLLL = true;
    public long LJ = -1;
    public Context LJFF = null;
    public boolean LJI = false;
    public int LJII = 1024;
    public boolean LJIIIIZZ = true;
    public String LJIIIZ = "";
    public final SpeechBridge LJIIJ = SpeechEngineLoader.getInstance().createBridge();

    public final synchronized boolean LIZJ() {
        if (!this.LIZLLL) {
            return true;
        }
        Context context = this.LJFF;
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                return false;
            }
            if (((AudioManager) C786410Ut5.H2(this.LJFF, "audio")).getMode() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized long createEngine() {
        long jCreateEngineToNative;
        destroyEngine(this.LJ);
        jCreateEngineToNative = this.LJIIJ.createEngineToNative(this);
        this.LJ = jCreateEngineToNative;
        return jCreateEngineToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void destroyEngine() {
        long j = this.LJ;
        if (j == -1) {
            return;
        }
        this.LJIIJ.destroyEngineToNative(j);
        this.LJ = -1L;
        C1741960vQo c1741960vQo = LJIIJJI;
        if (c1741960vQo != null) {
            c1741960vQo.LIZ(-1, 0, this.LIZIZ, "");
        }
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int initEngine() {
        int i;
        if (this.LJ == -1) {
            return -1;
        }
        AssetManager assets = this.LJI ? this.LJFF.getResources().getAssets() : null;
        if (this.LJII == 8192 && this.LJIIIIZZ) {
            setOptionInt("tts_with_frontend", 1);
            setOptionString("tts_frontend_type", "tnSimple");
        }
        Context context = this.LJFF;
        if (context != null) {
            setOptionString("tracking_data_path", LIZ(context).getPath());
            setOptionString("settings_file_dir", LIZ(this.LJFF).getPath());
        }
        int i2 = this.LJII;
        if (i2 != 1024 && i2 != 16384 && this.LJIIIZ == "late_bind" && (i = Build.VERSION.SDK_INT) >= 26 && i < 29) {
            this.LJFF.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE");
        }
        int iInitEngineToNative = this.LJIIJ.initEngineToNative(this.LJ, assets);
        if (iInitEngineToNative == 0) {
            setOptionString("device_info", C818030W7d.LIZ);
        }
        C1741960vQo c1741960vQo = LJIIJJI;
        if (c1741960vQo != null) {
            c1741960vQo.LIZ(0, iInitEngineToNative, this.LIZIZ, "");
        }
        return iInitEngineToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int resetEngine() {
        long j = this.LJ;
        if (j == -1) {
            return -1;
        }
        return this.LJIIJ.resetEngineToNative(j);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setRemoteView(SurfaceView surfaceView) {
    }

    public static synchronized C1741960vQo LJ() {
        return LJIIJJI;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final String getVersion() {
        return this.LJIIJ.getVersionToNative();
    }

    static {
        SpeechEngineLoader.getInstance().load();
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

    public static synchronized void LIZIZ(C1741960vQo c1741960vQo) {
        LJIIJJI = c1741960vQo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean LIZLLL(int i) {
        if (!this.LIZJ.equals("Recorder")) {
            return false;
        }
        String str = this.LIZIZ;
        str.getClass();
        switch (str.hashCode()) {
            case -1511396501:
                if (str.equals("voiceclone")) {
                    if (i == 2011 || i == 2012) {
                    }
                }
                break;
            case -1332085432:
                if (!str.equals("dialog")) {
                }
                if (i == 1000) {
                }
                break;
            case -1018583194:
                if (!str.equals("voiceconv")) {
                }
                if (i == 1000) {
                }
                break;
            case -799233858:
                if (!str.equals("recorder")) {
                }
                if (i == 1000) {
                }
                break;
            case 3124:
                if (!str.equals("au")) {
                }
                if (i == 1000) {
                }
                break;
            case 96896:
                if (!str.equals("asr")) {
                }
                if (i == 1000) {
                }
                break;
            case 3046114:
                if (!str.equals("capt")) {
                }
                if (i == 1000) {
                }
                break;
            case 1331753737:
                if (!str.equals("fulllink")) {
                }
                if (i == 1000) {
                }
                break;
        }
        return false;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void destroyEngine(long j) {
        destroyEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized String fetchResult(int i) {
        long j = this.LJ;
        if (j == -1) {
            return "{\"err_code\":-1}";
        }
        return this.LJIIJ.fetchStringResultToNative(j, i);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final String getVersion(long j) {
        return getVersion();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int initEngine(long j) {
        return initEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized boolean isEngineSupported(String str) {
        return SpeechEngineLoader.getInstance().createBridge().isEngineSupportedToNative(str);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int resetEngine(long j) {
        return resetEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setContext(Context context) {
        this.LJFF = context;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setListener(SpeechEngine.SpeechListener speechListener) {
        this.LIZ = speechListener;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int feedAudio(byte[] bArr, int i) {
        if (this.LJ == -1) {
            return -1;
        }
        if (this.LIZIZ.equals("afp")) {
            return this.LJIIJ.processAudioToNative(this.LJ, bArr, i, true);
        }
        return this.LJIIJ.feedAudioToNative(this.LJ, bArr, i);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int fetchResult(long j, byte[] bArr) {
        if (this.LIZIZ.equals("afp")) {
            return fetchResult(1200, bArr);
        }
        return -1800;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int sendDirective(int i, String str) {
        int iSendDirectiveToNative;
        if (this.LJ == -1) {
            return -1;
        }
        if (LIZLLL(i) && !LIZJ()) {
            iSendDirectiveToNative = -700;
        } else {
            iSendDirectiveToNative = this.LJIIJ.sendDirectiveToNative(this.LJ, i, str);
        }
        C1741960vQo c1741960vQo = LJIIJJI;
        if (c1741960vQo != null) {
            c1741960vQo.LIZ(i, iSendDirectiveToNative, this.LIZIZ, str);
        }
        return iSendDirectiveToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionBoolean(String str, boolean z) {
        if (this.LJ == -1) {
            return;
        }
        if (str == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 941586385) {
            if (iHashCode == 1724100682 && str.equals("enable_check_record_permission")) {
                this.LIZLLL = z;
            }
        } else if (str.equals("tts_enable_player")) {
            this.LJIIIIZZ = z;
        }
        this.LJIIJ.setOptionBooleanToNative(this.LJ, str, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionDouble(String str, double d) {
        long j = this.LJ;
        if (j == -1) {
            return;
        }
        if (str == null) {
            return;
        }
        this.LJIIJ.setOptionDoubleToNative(j, str, d);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionInt(String str, int i) {
        if (this.LJ == -1) {
            return;
        }
        if (str == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1782938240) {
            if (iHashCode == 1524111045 && str.equals("tts_work_mode")) {
                this.LJII = i;
            }
        } else if (str.equals("recorder_preset")) {
        }
        this.LJIIJ.setOptionIntToNative(this.LJ, str, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionString(String str, String str2) {
        if (this.LJ == -1) {
            return;
        }
        if (str != null && str2 != null) {
            switch (str.hashCode()) {
                case -1875173788:
                    if (str.equals("authenticate_type")) {
                        this.LJIIIZ = str2;
                    }
                    break;
                case -1288521830:
                    if (str.equals("tts_off_resource_path")) {
                        this.LJI = str2.startsWith("android_asset://");
                    }
                    break;
                case -1269912457:
                    if (str.equals("aed_resource_path")) {
                        this.LJI = str2.startsWith("android_asset://");
                    }
                    break;
                case -1174706902:
                    if (str.equals("recorder_data_source_type")) {
                        this.LIZJ = str2;
                    }
                    break;
                case 1700942440:
                    if (str.equals("engine_name")) {
                        this.LIZIZ = str2;
                    }
                    break;
            }
            this.LJIIJ.setOptionStringToNative(this.LJ, str, str2);
        }
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int fetchResult(int i, byte[] bArr) {
        long j = this.LJ;
        if (j == -1) {
            return -1;
        }
        return this.LJIIJ.fetchResultToNative(j, i, bArr);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int feedAudio(long j, byte[] bArr, int i) {
        return feedAudio(bArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x011c A[Catch: JSONException -> 0x0137, TRY_ENTER, TryCatch #1 {JSONException -> 0x0137, blocks: (B:68:0x00d5, B:70:0x00df, B:88:0x0126, B:93:0x0134, B:79:0x00f9, B:82:0x0106, B:83:0x010e, B:87:0x011f, B:86:0x011c), top: B:130:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[Catch: JSONException -> 0x0137, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0137, blocks: (B:68:0x00d5, B:70:0x00df, B:88:0x0126, B:93:0x0134, B:79:0x00f9, B:82:0x0106, B:83:0x010e, B:87:0x011f, B:86:0x011c), top: B:130:0x00d5 }] */
    @Override // com.bytedance.speech.speechengine.bridge.SpeechBridgeCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpeechMessage(int r19, byte[] r20, int r21) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BWJ.onSpeechMessage(int, byte[], int):void");
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int processAudio(byte[] bArr, int i, boolean z) {
        long j = this.LJ;
        if (j == -1) {
            return -1;
        }
        return this.LJIIJ.processAudioToNative(j, bArr, i, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int sendDirective(int i, String str, Cert cert) {
        int iSendDirectiveToNative;
        if (this.LJ == -1) {
            return -1;
        }
        if (LIZLLL(i) && !LIZJ()) {
            iSendDirectiveToNative = -700;
        } else {
            String str2 = "sendDirective";
            try {
                if (LIZLLL(i)) {
                    str2 = "sendDirectiveStartCapture";
                } else if (i == 2001 || i == 1001 || i == 1100) {
                    str2 = "sendDirectiveStopCapture";
                }
                C838090WuF.LIZ(cert, new String[]{"audio"}, "SpeechSDK", str2);
                if (str == null) {
                    str = "";
                }
                iSendDirectiveToNative = this.LJIIJ.sendDirectiveToNative(this.LJ, i, str);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                iSendDirectiveToNative = -710;
            }
        }
        C1741960vQo c1741960vQo = LJIIJJI;
        if (c1741960vQo != null) {
            c1741960vQo.LIZ(i, iSendDirectiveToNative, this.LIZIZ, str);
        }
        return iSendDirectiveToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionBoolean(long j, String str, boolean z) {
        setOptionBoolean(str, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionInt(long j, String str, int i) {
        setOptionInt(str, i);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized void setOptionString(long j, String str, String str2) {
        setOptionString(str, str2);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int sendDirective(long j, int i, String str) {
        return sendDirective(i, str);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public final synchronized int sendDirective(long j, int i, String str, Cert cert) {
        return sendDirective(i, str, cert);
    }
}
