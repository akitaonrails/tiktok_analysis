package X;

import Y.AObserverS235S0100000_33;
import Y.ARunnableS24S1100000_19;
import android.R;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import co5.d;
import co5.g;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import com.bytedance.pipo.ocr.ocr.view.CaptureExtender;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;
import oo5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Ahk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ActivityC2186501Ahk extends C19GS implements SensorEventListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZiovO2HELIOSElISA7Zw0yOyADKj0SKzElPyYnMQ==";
    public OcrViewModel LL;
    public SensorManager LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public C2186521Ahm LLJI;
    public CaptureExtender LLJIJIL;
    public Sensor LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public AbstractC2186641Ahy LLILZIL = C2186631Ahx.LIZIZ;
    public final long LLJJIII = System.currentTimeMillis();

    public void LJ() {
    }

    public void LJIIL() {
    }

    public final void LLLLZI() {
        this.LLIZLLLIL = true;
        b.LJII(b.LJIJJLI, "payin_checkout_ocr", "back", null, null, null, 60);
    }

    public final void LLZZ() {
        if (isFinishing()) {
            return;
        }
        b bVar = b.LJIJJLI;
        List listLJIIJJI = C1697810uHb.LJIIJJI("go_setting", "cancel");
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.getClass();
        b.LJIIJJI(jCurrentTimeMillis, "ocr_camera_access_fail", listLJIIJJI);
        C14CN.LJJLIIIJLLLLLLLZ(this, C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_camera_title"), LLLLZLLLI("pipo_payin_instruction_OCR_refused_camera_content"), C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_setting"), C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_gotit"), new C14CO() { // from class: X.1Ahr
            @Override // X.C14CO
            public final void LIZ() {
                b bVar2 = b.LJIJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                bVar2.getClass();
                b.LJIIJ(jCurrentTimeMillis2, "go_setting", "ocr_camera_access_fail");
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                ActivityC2186501Ahk activityC2186501Ahk = this.LIZ;
                c19741112Lp.getClass();
                C19741112Lp.LJIIIZ(activityC2186501Ahk, "android.permission.CAMERA");
                this.LIZ.getClass();
            }

            @Override // X.C14CO
            public final void LIZIZ() {
                b bVar2 = b.LJIJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                bVar2.getClass();
                b.LJIIJ(jCurrentTimeMillis2, "cancel", "ocr_camera_access_fail");
            }
        });
    }

    public final void LLZZZIL() {
        if (isFinishing()) {
            return;
        }
        b bVar = b.LJIJJLI;
        List listLJIIJJI = C1697810uHb.LJIIJJI("go_setting", "cancel");
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.getClass();
        b.LJIIJJI(jCurrentTimeMillis, "ocr_album_access_fail", listLJIIJJI);
        C14CN.LJJLIIIJLLLLLLLZ(this, C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_album_title"), LLLLZLLLI("pipo_payin_instruction_OCR_refused_album_content"), C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_setting"), C1724380uyS.LIZ("pipo_payin_instruction_OCR_refused_gotit"), new C14CO() { // from class: X.1Ahq
            @Override // X.C14CO
            public final void LIZ() {
                b bVar2 = b.LJIJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                bVar2.getClass();
                b.LJIIJ(jCurrentTimeMillis2, "go_setting", "ocr_album_access_fail");
                this.LIZ.LLZLI();
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                ActivityC2186501Ahk activityC2186501Ahk = this.LIZ;
                activityC2186501Ahk.getClass();
                String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                c19741112Lp.getClass();
                C19741112Lp.LJIIIZ(activityC2186501Ahk, str);
                this.LIZ.getClass();
            }

            @Override // X.C14CO
            public final void LIZIZ() {
                b bVar2 = b.LJIJJLI;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                bVar2.getClass();
                b.LJIIJ(jCurrentTimeMillis2, "cancel", "ocr_album_access_fail");
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public final void LLLLZLL() throws Throwable {
        this.LL.LLILLJJLI = System.currentTimeMillis();
        LLZ();
        if (Build.VERSION.SDK_INT > 33) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            LLLLLZL(this, intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.PICK");
            LLLLLZL(this, Intent.createChooser(intent2, ""));
        }
    }

    public final void LLLZLZ() {
        C19741112Lp.LIZ.getClass();
        if (C19741112Lp.LIZLLL(this, "android.permission.CAMERA")) {
            this.LLJI.LIZJ();
            this.LLJILLL = false;
        } else {
            if (this.LLJ) {
                return;
            }
            b.LJIJJLI.getClass();
            Cert cert = b.LIZLLL().LJFF;
            if (cert != null) {
                b.LJIIJJI(System.currentTimeMillis(), "ocr_camera_request_permission", C1697810uHb.LJIIJJI("always_allow", "forbid", "do_not_ask_again"));
                C19514711Wn.LIZIZ.LIZIZ(this, cert).LIZIZ("android.permission.CAMERA").LIZJ(new C2189751Amz(this, 0));
                this.LLJ = true;
            }
        }
    }

    public final void LLLZZIL() throws Throwable {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            LLLLLZL(this, intent);
            return;
        }
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        String str = i >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
        c19741112Lp.getClass();
        if (C19741112Lp.LIZLLL(this, str)) {
            LLLLZLL();
            return;
        }
        b.LJIJJLI.getClass();
        Cert cert = b.LIZLLL().LJII;
        if (cert != null) {
            b.LJIIJJI(System.currentTimeMillis(), "ocr_album_request_permission", C1697810uHb.LJIIJJI("always_allow", "forbid", "do_not_ask_again"));
            C19514711Wn c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(this, cert);
            String[] strArr = new String[1];
            strArr[0] = i < 33 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES";
            c19514711WnLIZIZ.LIZIZ(strArr).LIZJ(new C2189751Amz(this, 1));
        }
    }

    public void LLZ() {
        this.LLJI.LIZ();
        C2186521Ahm c2186521Ahm = this.LLJI;
        C2186531Ahn c2186531Ahn = c2186521Ahm.LLJJL;
        if (c2186531Ahn != null) {
            C21147817pM.LIZ();
            c2186531Ahn.LJIIIZ = 0;
            synchronized (c2186531Ahn.LIZJ) {
                try {
                    c2186531Ahn.LIZIZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c2186521Ahm.LLJJL = null;
        }
    }

    public void LLZLI() {
        this.LLJI.LIZJ();
        this.LLJI.LJI();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onPause() {
        try {
            SensorManager sensorManager = this.LLILLJJLI;
            if (sensorManager != null) {
                C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-ocr_sensor", 1476415499));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.LLILZLL) {
            return;
        }
        int i = this.LLJILLL ? 104 : 105;
        LLZLLLL(0, Integer.valueOf(i));
        b.LJIJJLI.LIZ(0, i, "user cancel", null, "unknown");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLLLZI();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() throws JSONException {
        boolean zLJI = MethodIDManager.LJI(202298);
        this.LLILZ = System.currentTimeMillis();
        b bVar = b.LJIJJLI;
        String str = !isFinishing() ? "kill" : this.LLIZLLLIL ? "back" : "result";
        long j = this.LLJJI;
        long j2 = this.LLILZ;
        long j3 = j2 - this.LLJJIII;
        AbstractC2186641Ahy abstractC2186641Ahy = this.LLILZIL;
        long j4 = this.LLILLL;
        String str2 = this.LLIZ;
        if (str2 == null) {
            str2 = "undefined error";
        }
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "payin_checkout_ocr");
        jSONObject.put("finish_type", str);
        jSONObject.put("timestamp", j2);
        jSONObject.put("stay_time", j3);
        b.LJIILIIL("fp_sdk_checkout_page_finish", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_timestamp", j);
        jSONObject2.put("leave_timestamp", j2);
        jSONObject2.put("ocr_duration", j3);
        jSONObject2.put("ocr_type", b.LJ(b.LJIIL));
        jSONObject2.put("user_choose_type", abstractC2186641Ahy.LIZ);
        jSONObject2.put("ocr_result", str2);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        jSONObject2.put("is_name_success", CardStruct.IStatusCode.DEFAULT);
        if (j4 != 0) {
            jSONObject2.put("card_first_recognize_timestamp", j4);
        }
        long j5 = b.LJIIJ;
        if (j5 != 0) {
            jSONObject2.put("card_first_cut_timestamp", j5);
        }
        long j6 = b.LJIIIZ;
        if (j6 != 0) {
            jSONObject2.put("text_start_timestamp", j6);
        }
        long j7 = b.LJIIJJI;
        if (j7 != 0) {
            jSONObject2.put("card_number_recognize_timestamp", j7);
            jSONObject2.put("expire_date_recognize_timestamp", b.LJIIJJI);
        }
        if (b.LJIILIIL) {
            str3 = "1";
        }
        jSONObject2.put("is_expire_date_success", str3);
        d dVar = b.LJIIIIZZ;
        jSONObject2.put("ocr_scenario", dVar != null ? dVar.LIZ : null);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("enter_ocr_type", b.LJIILJJIL);
        jSONObject3.put("first_use_ocr_type", b.LJIILL);
        String str4 = b.LJIILLIIL;
        if (str4 != null) {
            jSONObject3.put("actual_ocr_type", str4);
        }
        b.LJIILIIL("rd_pipo_complete_ocr_scan", jSONObject3);
        b.LJIILIIL("fp_sdk_ocr_card_info_recognize", jSONObject2);
        CaptureExtender captureExtender = this.LLJIJIL;
        if (captureExtender.LIZIZ()) {
            C848120XOw c848120XOwLIZ = C848120XOw.LIZ(captureExtender.LIZ);
            c848120XOwLIZ.getClass();
            c848120XOwLIZ.LIZJ.LJ(captureExtender);
        }
        super.onDestroy();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        super.onResume();
        b.LJIJJLI.getClass();
        b.LJIJ = 0;
        try {
            SensorManager sensorManager = this.LLILLJJLI;
            if (sensorManager != null) {
                C1300690jx5.LIZJ(sensorManager, this, this.LLJILJIL, 3, CertProviderManagerKt.findCert("bpea-ocr_sensor", 1476415499));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLLLZIL(int i) {
        C2186771AiB c2186771AiB = this.LLJI.LL;
        if (c2186771AiB != null && !c2186771AiB.LJI && c2186771AiB.LIZ != null && c2186771AiB.LJFF) {
            RunnableC2186811AiF runnableC2186811AiF = c2186771AiB.LJIILIIL;
            runnableC2186811AiF.LL = i;
            c2186771AiB.LIZ.LIZIZ(runnableC2186811AiF);
        }
    }

    public final C2186581Ahs LLLLZLLIL(View view) {
        DisplayMetrics displayMetrics;
        if (view == null || (displayMetrics = getResources().getDisplayMetrics()) == null) {
            return null;
        }
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = i;
        float f2 = i2;
        return new C2186581Ahs(view.getLeft() / f, view.getTop() / f2, view.getWidth() / f, view.getHeight() / f2, i, i2);
    }

    public final String LLLLZLLLI(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strLIZ = C1724380uyS.LIZ(str);
        if (a0.LJJIIZI(strLIZ, "{APPname}", false)) {
            try {
                Context applicationContext = getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext == null) {
                    applicationContext = C2409809cO.LIZ;
                }
                PackageManager packageManager = applicationContext.getPackageManager();
                Context applicationContext2 = getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext2 == null) {
                    applicationContext2 = C2409809cO.LIZ;
                }
                strLIZ = u.LJJIFFI(strLIZ, "{APPname}", packageManager.getApplicationLabel(applicationContext2.getApplicationInfo()).toString(), false);
                return strLIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return u.LJJIFFI(strLIZ, ">\"{APPname}\"", "", false);
            }
        }
        return strLIZ;
    }

    public void LLZZLLIL(String str) {
        runOnUiThread(new ARunnableS24S1100000_19(this, str, 4));
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        final Application application = getApplication();
        this.LL = (OcrViewModel) new ViewModelProvider(this, new ViewModelProvider.Factory(application) { // from class: X.0gMc
            public final Application LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = application;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(OcrViewModel.class)) {
                    return new OcrViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        }).get(OcrViewModel.class);
        this.LLJIJIL = new CaptureExtender(this);
        CaptureExtender captureExtender = this.LLJIJIL;
        if (captureExtender.LIZIZ()) {
            C2186511Ahl c2186511Ahl = new C2186511Ahl(captureExtender.LIZ);
            captureExtender.LIZIZ = c2186511Ahl;
            c2186511Ahl.LLIZLLLIL = new C2186611Ahv(captureExtender);
            C848120XOw c848120XOwLIZ = C848120XOw.LIZ(captureExtender.LIZ);
            c848120XOwLIZ.getClass();
            c848120XOwLIZ.LIZJ.LIZJ(captureExtender);
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | 1024);
        View childAt = ((ViewGroup) C786410Ut5.qe(window, R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            C20097313kJ.LIZJ(childAt);
        }
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            View decorView2 = getWindow().getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
        Object systemService = getSystemService("sensor");
        Sensor sensorLJJL = null;
        if (!(systemService instanceof SensorManager)) {
            systemService = null;
        }
        SensorManager sensorManager = (SensorManager) systemService;
        this.LLILLJJLI = sensorManager;
        if (sensorManager != null) {
            sensorLJJL = C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM3JBNAgj3nVfV/D8ixaP+BguBeuQ==", null));
        }
        this.LLJILJIL = sensorLJJL;
        this.LL.LL.observe(this, new AObserverS235S0100000_33(this, 63));
    }

    public static void LLLLLZL(ActivityC2186501Ahk activityC2186501Ahk, Intent intent) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityC2186501Ahk, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activityC2186501Ahk);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM3JBNAgj3nVfV/D8ixaP+BguBeuQ==", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 252;
        Object[] objArr = {intent, 252};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/bytedance/pipo/ocr/view/BaseOcrActivity", "startActivityForResult", activityC2186501Ahk, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/bytedance/pipo/ocr/view/BaseOcrActivity", "startActivityForResult", null, objArr, activityC2186501Ahk, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = activityC2186501Ahk;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = activityC2186501Ahk;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "com/bytedance/pipo/ocr/view/BaseOcrActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLLLL(java.lang.Integer r3, java.lang.Integer r4) {
        /*
            r2 = this;
            if (r3 == 0) goto Le
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto Le
            java.lang.String r0 = "success"
            r2.LLIZ = r0
            return
        Le:
            if (r4 == 0) goto L5e
            int r1 = r4.intValue()
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto L1d
            java.lang.String r0 = "cancel"
        L1a:
            r2.LLIZ = r0
            return
        L1d:
            int r1 = r4.intValue()
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L28
            java.lang.String r0 = "service busy"
            goto L1a
        L28:
            int r1 = r4.intValue()
            r0 = 104(0x68, float:1.46E-43)
            if (r1 != r0) goto L33
            java.lang.String r0 = "permission denied"
            goto L1a
        L33:
            int r1 = r4.intValue()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L5b
            int r1 = r4.intValue()
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L5b
            int r1 = r4.intValue()
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == r0) goto L5b
            int r1 = r4.intValue()
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L5b
            int r1 = r4.intValue()
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 != r0) goto L5e
        L5b:
            java.lang.String r0 = "system error"
            goto L1a
        L5e:
            java.lang.String r0 = "undefined error"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC2186501Ahk.LLZLLLL(java.lang.Integer, java.lang.Integer):void");
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i == 252) {
            if (i2 == -1) {
                this.LLILZIL = C2186621Ahw.LIZIZ;
                if (intent != null && (data = intent.getData()) != null) {
                    LJ();
                    OcrViewModel ocrViewModel = this.LL;
                    C1DFB c1dfb = C0PEM.LIZJ;
                    ocrViewModel.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(ocrViewModel), c1dfb, null, new C2186671Ai1(ocrViewModel, data, null), 2);
                    return;
                }
                LLLZ(0, 108, "choose image uri null", null, "scan");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("choose phone not ok : ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            LLZLI();
        }
    }

    public void LLLZ(final int i, final int i2, final String str, final g gVar, final String str2) {
        runOnUiThread(new Runnable() { // from class: X.1Aho
            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r10 = this;
                    java.lang.String r1 = "local"
                    r3 = 1
                    oo5.b r4 = oo5.b.LJIJJLI     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    int r5 = r2     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    int r6 = r3     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    java.lang.String r7 = r4     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    co5.g r8 = r5     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    java.lang.String r9 = r6     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    r4.LIZ(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L4d
                    java.lang.String r0 = r6
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L46
                    goto L27
                L1b:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4d
                    java.lang.String r0 = r6
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L46
                L27:
                    X.1Ahk r1 = r10.LL
                    X.1Ahw r0 = X.C2186621Ahw.LIZIZ
                    r1.LLILZIL = r0
                L2d:
                    X.1Ahk r2 = r10.LL
                    int r0 = r2
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r3
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r2.LLZLLLL(r1, r0)
                    X.1Ahk r0 = r10.LL
                    r0.LLILZLL = r3
                    r0.finish()
                    return
                L46:
                    X.1Ahk r1 = r10.LL
                    X.1Ahx r0 = X.C2186631Ahx.LIZIZ
                    r1.LLILZIL = r0
                    goto L2d
                L4d:
                    r4 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> L4d
                    java.lang.String r0 = r6
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L78
                    X.1Ahk r1 = r10.LL
                    X.1Ahw r0 = X.C2186621Ahw.LIZIZ
                    r1.LLILZIL = r0
                L5f:
                    X.1Ahk r2 = r10.LL
                    int r0 = r2
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    int r0 = r3
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r2.LLZLLLL(r1, r0)
                    X.1Ahk r0 = r10.LL
                    r0.LLILZLL = r3
                    r0.finish()
                    throw r4
                L78:
                    X.1Ahk r1 = r10.LL
                    X.1Ahx r0 = X.C2186631Ahx.LIZIZ
                    r1.LLILZIL = r0
                    goto L5f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2186541Aho.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseOcrActivity@6669.onOcrResult$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseOcrActivity@6669.onOcrResult$1");
            }
        });
    }
}
