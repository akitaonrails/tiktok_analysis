package X;

import Y.ACListenerS164S0100000_30;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS130S0100000_30;
import Y.ARunnableS5S0202000_19;
import Y.ARunnableS88S0200000_19;
import Y.ATListenerS462S0100000_30;
import Y.AUListenerS266S0100000_17;
import Y.AUListenerS268S0100000_19;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.VerifyTaskHandler;
import com.tts.oecverify.methods.JsBridgeModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14AC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AC extends DialogC19728412Gs {
    public JsBridgeModule LL;
    public ImageView LLILLJJLI;
    public C14B8 LLILLL;
    public ViewGroup LLILZ;
    public Button LLILZIL;
    public Button LLILZLL;
    public Context LLIZ;
    public FrameLayout LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final String LLJILJILJ;
    public BdTuringCallback LLJILLL;
    public C20221114Af LLJJ;
    public DialogInterface.OnDismissListener LLJJI;
    public C202203149x LLJJIII;
    public final boolean LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public final C14AS LLJJIJIL;
    public final List<String> LLJJJ;
    public SensorManager LLJJJIL;
    public C14AI LLJJJJ;
    public C20022713Vx<C20220914Ad> LLJJJJJIL;
    public int LLJJJJLIIL;
    public final float[] LLJJL;
    public final float[] LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public long LLJLIL;
    public C14AX LLJLILLLLZIIL;
    public final int LLJLL;
    public final AbstractC202199149t LLJLLIL;
    public int LLJLLL;
    public final C202194149o LLJZ;
    public final C202192149m LLJZIJLIL;
    public final C14AN LLL;
    public final C14AF LLLF;

    public final synchronized void LJJLJ() {
        JsBridgeModule jsBridgeModule;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        boolean z = this.LLJJIJI;
        if (z) {
            if (this.LLIZ == null) {
                return;
            }
        } else if (this.LLIZ == null && this.LL == null) {
            return;
        }
        this.LLIZ = null;
        if (z && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIL.LJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            C786410Ut5.LJJJJIZL(this.LLJJIJIIJIL);
            C786410Ut5.LJZ(8, this.LLJJIJIIJIL);
        }
        if (!this.LLJJIJI && (jsBridgeModule = this.LL) != null) {
            if (jsBridgeModule.LIZ != null) {
                C786410Ut5.LJJZZIII(jsBridgeModule.LIZIZ, new ARunnableS130S0100000_30(jsBridgeModule, 32));
                jsBridgeModule.LIZIZ = null;
                jsBridgeModule.LIZ = null;
            }
            this.LL = null;
        }
    }

    public final synchronized String LJJLJLI() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        List<String> list = this.LLJJJ;
        if (list != null) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    jSONObject.put((String) it2.next(), 1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final void LJJZ() {
        if (this.LLJLLIL.LJI) {
            this.LLILLJJLI.clearAnimation();
            C786410Ut5.LJZI(8, this.LLILLJJLI);
        }
        if (this.LLJLLIL.LJFF) {
            this.LLIZLLLIL.setBackgroundColor(-2013265920);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        SensorManager sensorManager = this.LLJJJIL;
        if (sensorManager != null) {
            try {
                C1300690jx5.LJ(sensorManager, this.LLJJJJ, CertProviderManagerKt.findCert("bpea-oec_turing_sdk_unregister_sensor_info", 1476415505));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!this.LLJJIJI && this.LLILLL != null) {
            HandlerHook.viewPost(getWindow().getDecorView(), new ARunnableS119S0100000_19(this, 125));
            this.LLILLL = null;
        }
        if (this.LLJJIJI && this.LLJJIJIL != null) {
            HandlerHook.viewPost(getWindow().getDecorView(), new ARunnableS88S0200000_19(this, 31));
        }
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        if (isShowing()) {
            try {
                super.dismiss();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Activity activity = this.LLJLLIL.LIZ;
        if (activity != null) {
            C786410Ut5.t4(activity, this.LLLF);
        }
        C202203149x c202203149x = this.LLJJIII;
        if (c202203149x != null) {
            Activity activity2 = c202203149x.LL;
            if (activity2 != null) {
                activity2.getApplication().unregisterActivityLifecycleCallbacks(c202203149x);
            }
            this.LLJJIII = null;
        }
        DialogInterface.OnDismissListener onDismissListener = this.LLJJI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        VerifyTaskHandler verifyTaskHandler = C145R.LIZ;
        VerifyTaskHandler.MessageHandler messageHandler = verifyTaskHandler.LIZIZ;
        if (messageHandler != null) {
            verifyTaskHandler.LIZIZ.sendMessageDelayed(messageHandler.obtainMessage(1, this), 10000L);
        }
        BdTuringCallback bdTuringCallback = this.LLJILLL;
        if (bdTuringCallback != null) {
            bdTuringCallback.onFail(3, null);
            this.LLJILLL = null;
        }
        if (!this.LLJI) {
            if (LJJLJLI().contains("dialogSize")) {
                C202191149l.LJII(this.LLJLLIL, C149V.VERIFY_POP_AFTER_PAGE_LOAD_RETURN_ERROR.getCode(), System.currentTimeMillis(), LJJLJLI(), null);
            } else {
                C202191149l.LJII(this.LLJLLIL, C149V.VERIFY_POP_BEFORE_PAGE_LOAD_RETURN_ERROR.getCode(), System.currentTimeMillis(), LJJLJLI(), null);
            }
            String name = this.LLJLILLLLZIIL.getName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("style", name);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (this.LLJJIJI) {
                LJJLIIIJLLLLLLLZ("bytedcert.goToClose", jSONObject);
            } else {
                String strLIZIZ = C14AL.LIZIZ("bytedcert.goToClose", "bytedcert.goToClose", jSONObject);
                JsBridgeModule jsBridgeModule = this.LL;
                if (jsBridgeModule != null) {
                    jsBridgeModule.LIZ(strLIZIZ);
                }
            }
        }
        if (!this.LLJ) {
            String strLJII = this.LLJLLIL.LJII();
            String strLJFF = this.LLJLLIL.LJFF();
            C14AX c14ax = this.LLJLILLLLZIIL;
            boolean z = this.LLJJIJI;
            String strLJIIJ = this.LLJLLIL.LJIIJ();
            String strLJ = this.LLJLLIL.LJ();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("shark_log_id", strLJII);
                jSONObject2.put("req_path", strLJFF);
                jSONObject2.put("duration", System.currentTimeMillis() - C202191149l.LIZ);
                jSONObject2.put("result", c14ax.ordinal());
                jSONObject2.put("key", "close");
                jSONObject2.put("opt_code", z ? 1 : 0);
                jSONObject2.put("mode", strLJIIJ);
                if (strLJ != null) {
                    jSONObject2.put("idv_type", strLJ);
                }
                C202191149l.LIZJ("oec_verify_sdk", jSONObject2);
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
                C14A6.LIZIZ();
            }
            LJJLJ();
        }
        VerifyTaskHandler verifyTaskHandler2 = C145R.LIZ;
        VerifyTaskHandler.MessageHandler messageHandler2 = verifyTaskHandler2.LIZIZ;
        if (messageHandler2 != null) {
            verifyTaskHandler2.LIZIZ.sendMessage(messageHandler2.obtainMessage(3, null));
        }
    }

    public final synchronized void LJJLL(String str) {
        List<String> list = this.LLJJJ;
        if (list != null) {
            ((ArrayList) list).add(str);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        InterfaceC1541990qEH kitView;
        View viewE1;
        super.onCreate(bundle);
        setContentView(C786410Ut5.Sd(R.layout.dts, C786410Ut5.ne(this.LLIZ), null));
        if (this.LLJLLIL.LJIIJJI() == 15) {
            ((CardView) findViewById(R.id.verify_cardview)).setRadius(0.0f);
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (this.LLJJJIL != null) {
            this.LLJL = System.currentTimeMillis();
            if (C2204961BRm.LJJL(this.LLJJJIL, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPaVxpb4Z8574GDO2d", null)) == null) {
                this.LLJJJJLIIL = 2;
            }
            try {
                SensorManager sensorManager = this.LLJJJIL;
                C1300690jx5.LIZJ(sensorManager, this.LLJJJJ, C2204961BRm.LJJL(sensorManager, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPaVxpb4Z8574GDO2d", null)), 0, CertProviderManagerKt.findCert("bpea-oec_turing_sdk_register_sensor_info", 1476415505));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            this.LLJJJJLIIL = 1;
        }
        if (this.LLJJIJI) {
            this.LLILZ = (ViewGroup) findViewById(R.id.view_feedback);
            findViewById(R.id.xmh);
            this.LLILZIL = (Button) findViewById(R.id.cqb);
            this.LLILZLL = (Button) findViewById(R.id.cqc);
            this.LLILLJJLI = (ImageView) findViewById(R.id.nl1);
            this.LLIZLLLIL = (FrameLayout) findViewById(R.id.ft3);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.verify_webview_frame);
            this.LLJJIJIIJIL = frameLayout;
            C786410Ut5.LJZ(8, frameLayout);
            C14AS c14as = this.LLJJIJIL;
            String str = this.LLJILJILJ;
            FrameLayout frameLayout2 = this.LLJJIJIIJIL;
            final C202192149m c202192149m = this.LLJZIJLIL;
            c14as.LIZIZ = this.LLL;
            c14as.LJFF = frameLayout2;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.LJJJLZIJ(1, "hide_loading");
            sparkContext.LJJ(AbstractC1539010q9T.class, c14as.LJII);
            sparkContext.bizCert = new ThirdPartyBizCert(402685955);
            sparkContext.bid = "astro_behavior_lynx";
            sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0zOG
                @Override // X.C1543000qFu
                public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C202167148n.class);
                    return arrayList;
                }

                @Override // X.C1543000qFu
                public final Map<Class<?>, C1544630qIX<?>> LJII() {
                    HashMap map = new HashMap();
                    map.put(C202168148o.class, new C1544630qIX(c202192149m));
                    return map;
                }
            });
            Context context = c14as.LIZ;
            if (context == null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = null;
            } else {
                C1541950qED.LIZJ.getClass();
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            }
            c14as.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView()) != null && (viewE1 = kitView.e1()) != null) {
                viewE1.setScrollContainer(false);
                viewE1.setHorizontalScrollBarEnabled(false);
                viewE1.setVerticalScrollBarEnabled(false);
                if (C14A6.LIZ() && "release" == "debug") {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                viewE1.setOnTouchListener(new ATListenerS462S0100000_30(c14as, 0));
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout3 = c14as.LJFF;
            if (frameLayout3 != null) {
                frameLayout3.addView(c14as.LJ, layoutParams);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c14as.LJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(sparkContext);
            }
            C20221114Af c20221114Af = new C20221114Af(this.LLJLLIL.LIZJ());
            this.LLJJ = c20221114Af;
            this.LLJJIJIL.LJI = c20221114Af;
            ACListenerS164S0100000_30 aCListenerS164S0100000_30 = new ACListenerS164S0100000_30(this, 22);
            C786410Ut5.L7(this.LLILZIL, aCListenerS164S0100000_30);
            C786410Ut5.L7(this.LLILZLL, aCListenerS164S0100000_30);
        } else {
            this.LLILZ = (ViewGroup) findViewById(R.id.view_feedback);
            findViewById(R.id.xmh);
            this.LLILZIL = (Button) findViewById(R.id.cqb);
            this.LLILZLL = (Button) findViewById(R.id.cqc);
            this.LLILLJJLI = (ImageView) findViewById(R.id.nl1);
            this.LLIZLLLIL = (FrameLayout) findViewById(R.id.ft3);
            C14B8 c14b8 = (C14B8) findViewById(R.id.verify_webview);
            this.LLILLL = c14b8;
            c14b8.LIZ(this.LLL);
            C20221114Af c20221114Af2 = new C20221114Af(this.LLJLLIL.LIZJ());
            this.LLJJ = c20221114Af2;
            this.LLILLL.setOnTouchListener(c20221114Af2);
            ACListenerS164S0100000_30 aCListenerS164S0100000_302 = new ACListenerS164S0100000_30(this, 23);
            C786410Ut5.L7(this.LLILZIL, aCListenerS164S0100000_302);
            C786410Ut5.L7(this.LLILZLL, aCListenerS164S0100000_302);
        }
        if (this.LLJLLIL.LJI) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.LLILLJJLI.startAnimation(rotateAnimation);
            this.LLIZLLLIL.setBackgroundColor(-2013265920);
        } else {
            C786410Ut5.LJZI(8, this.LLILLJJLI);
        }
        Activity activity = this.LLJLLIL.LIZ;
        if (activity != null) {
            C786410Ut5.s4(activity, this.LLLF);
        }
        C202203149x c202203149x = this.LLJJIII;
        Activity activity2 = c202203149x.LL;
        if (activity2 != null) {
            activity2.getApplication().registerActivityLifecycleCallbacks(c202203149x);
        }
        setCanceledOnTouchOutside(this.LLJLLIL.LJ);
        setCancelable(true);
        if (this.LLJJIJI) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJIL.LJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null) {
                this.LLJILLL.onFail(1, null);
                return;
            }
            C202191149l.LJIIIIZZ(1, this.LLJLLIL.LJII(), this.LLJLLIL.LJFF(), this.LLJLLIL.LJIIJ(), this.LLJLLIL.LJ());
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
            if (this.LLJLLIL.LIZLLL()) {
                DisplayMetrics displayMetrics = this.LLIZ.getResources().getDisplayMetrics();
                ViewGroup.LayoutParams layoutParams2 = this.LLJJIJIIJIL.getLayoutParams();
                layoutParams2.width = displayMetrics.widthPixels;
                layoutParams2.height = displayMetrics.heightPixels;
                C786410Ut5.a6(this.LLJJIJIIJIL, layoutParams2);
                C786410Ut5.LJZ(0, this.LLJJIJIIJIL);
                return;
            }
            return;
        }
        this.LL = new JsBridgeModule(this.LLJZ, this.LLILLL);
        C202191149l.LJIIIIZZ(0, this.LLJLLIL.LJII(), this.LLJLLIL.LJFF(), this.LLJLLIL.LJIIJ(), this.LLJLLIL.LJ());
        C14B8 c14b82 = this.LLILLL;
        String str2 = this.LLJILJILJ;
        if (C794280VDu.LIZ(c14b82, "monitor")) {
            c14b82.loadUrl(str2);
        } else {
            String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(c14b82, str2);
            if (!TextUtils.isEmpty(strOnLoadUrl)) {
                str2 = strOnLoadUrl;
            }
            c14b82.loadUrl(str2);
        }
        if (this.LLJLLIL.LIZLLL()) {
            DisplayMetrics displayMetrics2 = this.LLIZ.getResources().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams3 = this.LLILLL.getLayoutParams();
            layoutParams3.width = displayMetrics2.widthPixels;
            layoutParams3.height = displayMetrics2.heightPixels;
            C14B8 c14b83 = this.LLILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14b83);
            c14b83.setLayoutParams(layoutParams3);
            C14B8 c14b84 = this.LLILLL;
            int visibility = c14b84.getVisibility();
            c14b84.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c14b84);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLJJ.LIZ(motionEvent);
        if (this.LLJLLIL.LJ) {
            if (this.LLILZ.getVisibility() == 0) {
                this.LLJLILLLLZIIL = C14AX.CLOSE_FB_MASK;
            } else {
                this.LLJLILLLLZIIL = C14AX.CLOSE_REASON_MASK;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LLJJI = onDismissListener;
    }

    public final void LJJLIIIJLLLLLLLZ(String str, JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C14AS c14as = this.LLJJIJIL;
        if (c14as == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c14as.LJ) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("data", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        kitView.LIZ("OECTuringVerifyPiperCallJS", jSONObject2);
    }

    public final void LJJLIIJ(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        final int iRound = i2;
        final int iRound2 = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeDialog width = ");
        sbLIZ.append(iRound2);
        sbLIZ.append(", height = ");
        sbLIZ.append(iRound);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJIJIL && isShowing()) {
            if (this.LLJLLIL.LIZLLL()) {
                iRound2 = -1;
                iRound = -1;
            } else if (iRound2 > 0 && iRound > 0) {
                float fLIZLLL = C148O.LIZLLL(this.LLIZ);
                iRound2 = Math.round(iRound2 * fLIZLLL);
                iRound = Math.round(fLIZLLL * iRound);
            }
            if (this.LLJJIJI) {
                if (this.LLJJIJIL.LJ == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = this.LLJJIJIIJIL.getLayoutParams();
                if (this.LLJILJIL && (i5 = layoutParams.width) > 0 && (i6 = layoutParams.height) > 0) {
                    C14AS c14as = this.LLJJIJIL;
                    c14as.getClass();
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator<int[]>() { // from class: X.07mB
                        @Override // android.animation.TypeEvaluator
                        public final int[] evaluate(float f, int[] iArr, int[] iArr2) {
                            int[] iArr3 = iArr;
                            int[] iArr4 = iArr2;
                            int length = iArr3.length;
                            int[] iArr5 = new int[length];
                            int i7 = length - 1;
                            if (i7 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    iArr5[i8] = (int) (iArr3[i8] + ((iArr4[i8] - r2) * f));
                                    if (i9 > i7) {
                                        break;
                                    }
                                    i8 = i9;
                                }
                            }
                            return iArr5;
                        }
                    }, new int[]{i5, i6}, new int[]{iRound2, iRound});
                    valueAnimatorOfObject.addUpdateListener(new AUListenerS266S0100000_17(c14as, 44));
                    valueAnimatorOfObject.setDuration(300L);
                    valueAnimatorOfObject.start();
                    this.LLJILJIL = false;
                    return;
                }
                HandlerHook.viewPost(this.LLJJIJIIJIL, new Runnable() { // from class: X.0hgm
                    public final void LIZ() {
                        C14AC c14ac = this.LLILLL;
                        if (c14ac.LLJIJIL) {
                            return;
                        }
                        c14ac.LJJZ();
                        ViewGroup.LayoutParams layoutParams2 = this.LLILLL.LLJJIJIIJIL.getLayoutParams();
                        layoutParams2.width = iRound2;
                        layoutParams2.height = iRound;
                        C786410Ut5.a6(this.LLILLL.LLJJIJIIJIL, layoutParams2);
                        C786410Ut5.LJZ(0, this.LLILLL.LLJJIJIIJIL);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VerifyDialog@71f4.changeDialog$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VerifyDialog@71f4.changeDialog$1");
                    }
                });
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
            if (this.LLJILJIL && (i3 = layoutParams2.width) > 0 && (i4 = layoutParams2.height) > 0) {
                C14B8 c14b8 = this.LLILLL;
                c14b8.getClass();
                ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new TypeEvaluator<int[]>() { // from class: X.07mC
                    @Override // android.animation.TypeEvaluator
                    public final int[] evaluate(float f, int[] iArr, int[] iArr2) {
                        int[] iArr3 = iArr;
                        int[] iArr4 = iArr2;
                        int length = iArr3.length;
                        int[] iArr5 = new int[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            iArr5[i7] = (int) (iArr3[i7] + ((iArr4[i7] - r2) * f));
                        }
                        return iArr5;
                    }
                }, new int[]{i3, i4}, new int[]{iRound2, iRound});
                valueAnimatorOfObject2.addUpdateListener(new AUListenerS268S0100000_19(c14b8, 16));
                valueAnimatorOfObject2.setDuration(300L).start();
                this.LLJILJIL = false;
                return;
            }
            HandlerHook.viewPost(this.LLILLL, new ARunnableS5S0202000_19(layoutParams2, iRound2, iRound, this, 0));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.149m] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.14AI] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.14AN] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.14AF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14AC(X.AbstractC202199149t r11, com.tts.oecverify.BdTuringCallback r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14AC.<init>(X.149t, com.tts.oecverify.BdTuringCallback, boolean):void");
    }
}
