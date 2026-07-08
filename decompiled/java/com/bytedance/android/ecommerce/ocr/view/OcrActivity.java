package com.bytedance.android.ecommerce.ocr.view;

import X.ActivityC2186501Ahk;
import X.C1300690jx5;
import X.C1602160rnK;
import X.C1724380uyS;
import X.C21374818ks;
import X.C2186511Ahl;
import X.C2186521Ahm;
import X.C416780GVw;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C838130WuJ;
import X.DialogC1397850mTn;
import X.DialogC19728412Gs;
import X.InterfaceC2186931AiR;
import X.ViewTreeObserverOnPreDrawListenerC2189661Amq;
import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import oo5.b;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public final class OcrActivity extends ActivityC2186501Ahk {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyowJyghHELIOSLD0wLWsjKj19PiwpPmEcKzcNKjs6Piw4MA==";
    public C21374818ks LLJJIJI;
    public C416780GVw LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public ImageView LLJJJ;
    public DialogC1397850mTn LLJJJIL;

    @Override // X.ActivityC2186501Ahk, android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mTn] */
    @Override // X.ActivityC2186501Ahk
    public final void LJ() {
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new DialogC19728412Gs(this) { // from class: X.0mTn
                public boolean LL;
                public ProgressBar LLILLJJLI;
                public TextView LLILLL;

                @Override // X.DialogC19728412Gs, android.app.Dialog
                public final void show() {
                    Object obj;
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM3JBNAghPpR/TakG52ISTX6/5g8BSWZhKJGwyGUUbAKw==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                        super.show();
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
                    }
                    ProgressBar progressBar = this.LLILLJJLI;
                    if (progressBar != null) {
                        C786410Ut5.LLIIJLIL(progressBar, 0);
                    }
                }

                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    setCanceledOnTouchOutside(false);
                    boolean z = this.LL;
                    this.LL = z;
                    if (z) {
                        Window window = getWindow();
                        if (window != null) {
                            window.setDimAmount(0.5f);
                        }
                    } else {
                        Window window2 = getWindow();
                        if (window2 != null) {
                            window2.setDimAmount(0.0f);
                        }
                    }
                    Window window3 = getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    setContentView(R.layout.dtp);
                    this.LLILLJJLI = (ProgressBar) findViewById(R.id.s_5);
                    this.LLILLL = (TextView) findViewById(R.id.o_8);
                    this.LLILLL.setText(C1724380uyS.LIZ("pipo_common_waiting_while_loading_short"));
                }
            };
        }
        DialogC1397850mTn dialogC1397850mTn = this.LLJJJIL;
        if (dialogC1397850mTn != null) {
            dialogC1397850mTn.show();
            C785410UrT.LIZIZ(dialogC1397850mTn);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1397850mTn);
            C816490W1f.LIZ(dialogC1397850mTn);
        }
    }

    @Override // X.ActivityC2186501Ahk
    public final void LJIIL() {
        DialogC1397850mTn dialogC1397850mTn = this.LLJJJIL;
        if (dialogC1397850mTn != null) {
            dialogC1397850mTn.dismiss();
            C785410UrT.LIZ(dialogC1397850mTn);
        }
    }

    @Override // X.ActivityC2186501Ahk, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() throws JSONException {
        DialogC1397850mTn dialogC1397850mTn = this.LLJJJIL;
        if (dialogC1397850mTn != null) {
            dialogC1397850mTn.dismiss();
            C785410UrT.LIZ(dialogC1397850mTn);
        }
        super.onDestroy();
    }

    @Override // X.ActivityC2186501Ahk, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        this.LLJI.LIZ();
        C2186511Ahl c2186511Ahl = this.LLJIJIL.LIZIZ;
        if (c2186511Ahl.LLILLJJLI != null) {
            try {
                C1300690jx5.LJ(c2186511Ahl.LL, c2186511Ahl, CertProviderManagerKt.findCert("bpea-ocr_sensor_accelerater", 1476415500));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.onPause();
    }

    @Override // X.ActivityC2186501Ahk
    public final void LLZ() {
        super.LLZ();
        C416780GVw c416780GVw = this.LLJJIJIIJIL;
        int visibility = c416780GVw.getVisibility();
        c416780GVw.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c416780GVw);
    }

    @Override // X.ActivityC2186501Ahk
    public final void LLZLI() {
        super.LLZLI();
        C2186521Ahm c2186521Ahm = this.LLJI;
        int visibility = c2186521Ahm.getVisibility();
        c2186521Ahm.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c2186521Ahm);
        C416780GVw c416780GVw = this.LLJJIJIIJIL;
        int visibility2 = c416780GVw.getVisibility();
        c416780GVw.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c416780GVw);
        C786410Ut5.LJZ(0, this.LLJJIJIL);
    }

    @Override // X.ActivityC2186501Ahk, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
        LLLZLZ();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.ActivityC2186501Ahk, android.app.Activity
    public final void finish() {
        super.finish();
    }

    @Override // X.ActivityC2186501Ahk, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.jr);
        this.LLJI = (C2186521Ahm) findViewById(R.id.k5k);
        this.LLJJIJI = (C21374818ks) findViewById(R.id.phy);
        this.LLJJIJIIJIL = (C416780GVw) findViewById(R.id.k5t);
        this.LLJJIJIL = (FrameLayout) findViewById(R.id.k5r);
        ImageView imageView = (ImageView) findViewById(R.id.phw);
        this.LLJJJ = imageView;
        C2186521Ahm c2186521Ahm = this.LLJI;
        c2186521Ahm.LLJLIL = this;
        c2186521Ahm.LLJL = new InterfaceC2186931AiR() { // from class: X.1Ahf
            @Override // X.InterfaceC2186931AiR
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2186931AiR
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2186931AiR
            public final void LIZLLL(Exception exc) {
            }

            @Override // X.InterfaceC2186931AiR
            public final void LJ() {
            }

            @Override // X.InterfaceC2186931AiR
            public final void LIZ() {
                OcrActivity ocrActivity = this.LIZ;
                C2186581Ahs c2186581AhsLLLLZLLIL = ocrActivity.LLLLZLLIL(ocrActivity.LLJJIJIL);
                C2186521Ahm c2186521Ahm2 = this.LIZ.LLJI;
                c2186521Ahm2.LLJJLIIIJLLLLLLLZ = c2186581AhsLLLLZLLIL;
                c2186521Ahm2.LJI();
            }
        };
        C786410Ut5.Q7(imageView, new ACListenerS167S0100000_33(this, 102));
        this.LLJI.setKeepScreenOn(true);
        ((TextView) findViewById(R.id.k5q)).setText(C1724380uyS.LIZ("pipo_payin_instruction_OCR_scan_notice"));
        this.LLJJIJI.setPhotoPickerListener(new ACListenerS167S0100000_33(this, 103));
        this.LLJJIJI.setBackClickListener(new ACListenerS167S0100000_33(this, 104));
        HandlerHook.viewPost(this.LLJJIJI, new ARunnableS133S0100000_33(this, 123));
        C786410Ut5.y3(this.LLJI.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC2189661Amq(this, 1));
        b.LJIJJLI.getClass();
        b.LJIIIZ = 0L;
        b.LJIIJ = 0L;
        b.LJIIJJI = 0L;
        b.LJIILIIL = false;
    }

    @Override // X.ActivityC2186501Ahk, android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        Float fValueOf;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null && (fValueOf = Float.valueOf(fArr[0])) != null) {
            if (!this.LLJJ) {
                if (fValueOf.floatValue() > DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) {
                    C786410Ut5.LJZI(4, this.LLJJJ);
                    return;
                } else {
                    C786410Ut5.LJZI(0, this.LLJJJ);
                    return;
                }
            }
            C786410Ut5.LJZI(0, this.LLJJJ);
        }
    }
}
