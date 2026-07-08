package X;

import Y.ACListenerS164S0100000_30;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS130S0100000_30;
import Y.ATListenerS462S0100000_30;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bdturing.VerifyTaskHandler;
import com.bytedance.bdturing.methods.JsBridgeModule;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14AD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AD extends DialogC19728412Gs {
    public JsBridgeModule LL;
    public ImageView LLILLJJLI;
    public C14B7 LLILLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZ;
    public WebKitView LLILZIL;
    public C14B3 LLILZLL;
    public boolean LLIZ;
    public ViewGroup LLIZLLLIL;
    public Button LLJ;
    public Button LLJI;
    public Context LLJIJIL;
    public FrameLayout LLJILJIL;
    public CardView LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final String LLJJIJI;
    public InterfaceC202160148g LLJJIJIIJIL;
    public C20221014Ae LLJJIJIL;
    public DialogInterface.OnDismissListener LLJJJ;
    public C148P LLJJJIL;
    public C14AW LLJJJJ;
    public final int LLJJJJJIL;
    public final AbstractC202165148l LLJJJJLIIL;
    public final C149P LLJJL;
    public final C14AM LLJJLIIIJLLLLLLLZ;
    public final C14AG LLJL;

    public final synchronized void LJJLIIIJLLLLLLLZ() {
        if (this.LLJIJIL == null && this.LL == null) {
            return;
        }
        this.LLJIJIL = null;
        JsBridgeModule jsBridgeModule = this.LL;
        if (jsBridgeModule.LIZ != null) {
            C786410Ut5.LJJZZIII(jsBridgeModule.LIZIZ, new ARunnableS130S0100000_30(jsBridgeModule, 33));
            jsBridgeModule.LIZIZ = null;
            jsBridgeModule.LIZ = null;
        }
        this.LL = null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LLIZ && this.LLILZ != null) {
            HandlerHook.viewPost(getWindow().getDecorView(), new ARunnableS119S0100000_19(this, 140));
            this.LLILZ = null;
            this.LLILZLL = null;
            int i = C14B3.LJ;
            new WeakReference(null);
        }
        if (this.LLILLL != null) {
            HandlerHook.viewPost(getWindow().getDecorView(), new ARunnableS119S0100000_19(this, 141));
            this.LLILLL = null;
        }
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        if (isShowing()) {
            try {
                super.dismiss();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LLJJJJLIIL.getActivity() != null) {
            C786410Ut5.t4(this.LLJJJJLIIL.getActivity(), this.LLJL);
        }
        C148P c148p = this.LLJJJIL;
        if (c148p != null) {
            Activity activity = c148p.LL;
            if (activity != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(c148p);
            }
            this.LLJJJIL = null;
        }
        DialogInterface.OnDismissListener onDismissListener = this.LLJJJ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        VerifyTaskHandler verifyTaskHandler = C145S.LIZ;
        VerifyTaskHandler.MessageHandler messageHandler = verifyTaskHandler.LIZIZ;
        if (messageHandler != null) {
            verifyTaskHandler.LIZIZ.sendMessageDelayed(messageHandler.obtainMessage(1, this), 10000L);
        }
        InterfaceC202160148g interfaceC202160148g = this.LLJJIJIIJIL;
        if (interfaceC202160148g != null && !this.LLJILLL) {
            interfaceC202160148g.onFail(3);
            this.LLJJIJIIJIL = null;
        }
        if (!this.LLJJ) {
            String name = this.LLJJJJ.getName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("style", name);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.getMessage();
            }
            String strLIZIZ = C14AH.LIZIZ("bytedcert.goToClose", "bytedcert.goToClose", jSONObject);
            JsBridgeModule jsBridgeModule = this.LL;
            if (jsBridgeModule != null) {
                jsBridgeModule.LIZ(strLIZIZ);
            }
        }
        if (!this.LLJILLL) {
            C14AW c14aw = this.LLJJJJ;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", System.currentTimeMillis() - C202179148z.LIZ);
                jSONObject2.put("result", c14aw.getName());
                jSONObject2.put("key", "close");
                C202179148z.LIZJ("turing_verify_sdk", jSONObject2);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20221514Aj.LIZIZ();
            }
            LJJLIIIJLLLLLLLZ();
        }
        VerifyTaskHandler verifyTaskHandler2 = C145S.LIZ;
        VerifyTaskHandler.MessageHandler messageHandler2 = verifyTaskHandler2.LIZIZ;
        if (messageHandler2 != null) {
            verifyTaskHandler2.LIZIZ.sendMessage(messageHandler2.obtainMessage(3, null));
        }
    }

    public final void LJJLIIJ() {
        C14B3 c14b3;
        C14B7 c14b7;
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.view_feedback);
        findViewById(R.id.xmh);
        this.LLJ = (Button) findViewById(R.id.cqb);
        this.LLJI = (Button) findViewById(R.id.cqc);
        this.LLILLJJLI = (ImageView) findViewById(R.id.nl1);
        this.LLILLL = (C14B7) findViewById(R.id.verify_webview);
        this.LLJILJILJ = (CardView) findViewById(R.id.dgb);
        this.LLJILJIL = (FrameLayout) findViewById(R.id.ft3);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            this.LLJILJILJ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            C786410Ut5.LLLLIIIILLL(this.LLILZ, 4);
            InterfaceC1541990qEH kitView = this.LLILZ.getKitView();
            if (kitView instanceof WebKitView) {
                this.LLILZIL = (WebKitView) kitView;
            } else {
                this.LLILZIL = null;
            }
        }
        ACListenerS164S0100000_30 aCListenerS164S0100000_30 = new ACListenerS164S0100000_30(this, 24);
        C786410Ut5.L7(this.LLJ, aCListenerS164S0100000_30);
        C786410Ut5.L7(this.LLJI, aCListenerS164S0100000_30);
        if (!this.LLIZ && (c14b7 = this.LLILLL) != null) {
            c14b7.LIZ(this.LLJJLIIIJLLLLLLLZ);
        }
        if (this.LLIZ && (c14b3 = this.LLILZLL) != null) {
            C14AM c14am = this.LLJJLIIIJLLLLLLLZ;
            Context context = this.LLJIJIL;
            c14b3.LIZ = c14am;
            c14b3.LIZIZ = context;
            if (context != null) {
                C14C8 c14c8 = c14b3.LIZJ;
                if (c14c8 != null) {
                    c14c8.LLJ = c14am;
                    c14c8.LLJI = context;
                }
                if ((context instanceof Activity) && c14c8 != null) {
                    c14c8.LLJIJIL = context;
                }
            }
        }
        C20221014Ae c20221014Ae = new C20221014Ae(this.LLJJJJLIIL.getEventLimits());
        this.LLJJIJIL = c20221014Ae;
        if (!this.LLIZ || this.LLILZ == null) {
            C14B7 c14b72 = this.LLILLL;
            if (c14b72 != null) {
                c14b72.setOnTouchListener(c20221014Ae);
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, 8);
                    return;
                }
                return;
            }
            return;
        }
        WebKitView webKitView = this.LLILZIL;
        webKitView.getClass();
        webKitView.setOnTouchListener(new ATListenerS462S0100000_30(this, 1));
        C14B7 c14b73 = this.LLILLL;
        if (c14b73 != null) {
            int visibility = c14b73.getVisibility();
            c14b73.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c14b73);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View view;
        WebKitView webKitView;
        super.onCreate(bundle);
        try {
            setContentView(C786410Ut5.Sd(R.layout.d_b, C786410Ut5.ne(this.LLJIJIL), null));
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            LJJLIIJ();
            if (this.LLJJJJLIIL.getLoading()) {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                this.LLILLJJLI.startAnimation(rotateAnimation);
                this.LLJILJIL.setBackgroundColor(-2013265920);
            } else {
                C786410Ut5.LJZI(8, this.LLILLJJLI);
            }
            if (this.LLJJJJLIIL.getActivity() != null) {
                C786410Ut5.s4(this.LLJJJJLIIL.getActivity(), this.LLJL);
            }
            C148P c148p = this.LLJJJIL;
            Activity activity = c148p.LL;
            if (activity != null) {
                activity.getApplication().registerActivityLifecycleCallbacks(c148p);
            }
            setCanceledOnTouchOutside(this.LLJJJJLIIL.getMaskCancel());
            setCancelable(true);
            if (this.LLIZ && this.LLILZ != null && (webKitView = this.LLILZIL) != null) {
                this.LL = new JsBridgeModule(this.LLJJL, webKitView);
            } else {
                this.LL = new JsBridgeModule(this.LLJJL, this.LLILLL);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadUrl = ");
            sbLIZ.append(this.LLJJIJI);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!this.LLIZ) {
                C14B7 c14b7 = this.LLILLL;
                String str = this.LLJJIJI;
                if (C794280VDu.LIZ(c14b7, "monitor")) {
                    c14b7.loadUrl(str);
                } else {
                    String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(c14b7, str);
                    if (!TextUtils.isEmpty(strOnLoadUrl)) {
                        str = strOnLoadUrl;
                    }
                    c14b7.loadUrl(str);
                }
            }
            if (this.LLJJJJLIIL.getFullscreen()) {
                DisplayMetrics displayMetrics = this.LLJIJIL.getResources().getDisplayMetrics();
                if ((this.LLIZ && (view = this.LLILZ) != null) || (view = this.LLILLL) != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = displayMetrics.widthPixels;
                    layoutParams.height = displayMetrics.heightPixels;
                    C786410Ut5.W5(view, layoutParams);
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
        } catch (InflateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("InflateException during layout inflation: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC202160148g interfaceC202160148g = this.LLJJIJIIJIL;
            if (interfaceC202160148g != null) {
                interfaceC202160148g.onFail(2);
            }
            try {
                dismiss();
                C785410UrT.LIZ(this);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unexpected exception during dialog creation: ");
            sbLIZ3.append(e3.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            InterfaceC202160148g interfaceC202160148g2 = this.LLJJIJIIJIL;
            if (interfaceC202160148g2 != null) {
                interfaceC202160148g2.onFail(2);
            }
            try {
                dismiss();
                C785410UrT.LIZ(this);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C20221014Ae c20221014Ae = this.LLJJIJIL;
        if (c20221014Ae != null) {
            c20221014Ae.LIZ(motionEvent);
        }
        if (this.LLJJJJLIIL.getMaskCancel()) {
            if (this.LLIZLLLIL.getVisibility() == 0) {
                this.LLJJJJ = C14AW.CLOSE_FB_MASK;
            } else {
                this.LLJJJJ = C14AW.CLOSE_REASON_MASK;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LLJJJ = onDismissListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.14AM] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.14AG] */
    public C14AD(AbstractC202165148l abstractC202165148l, InterfaceC202160148g interfaceC202160148g) {
        String strLIZIZ;
        AnonymousClass1490 anonymousClass1490;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        boolean z;
        Activity activity = abstractC202165148l.getActivity();
        Objects.requireNonNull(activity);
        super(activity, R.style.a04);
        this.LLIZ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        this.LLJJIJIL = null;
        this.LLJJJJ = C14AW.CLOSE_REASON_APP;
        this.LLJJL = new C149P(this);
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC20220614Aa() { // from class: X.14AM
            @Override // X.InterfaceC20220614Aa
            public final void LIZIZ(int i) {
                C14AD c14ad = this.LIZ;
                c14ad.LLJILLL = true;
                CardView cardView = c14ad.LLJILJILJ;
                if (cardView != null) {
                    C786410Ut5.LLILLL(cardView, 0);
                }
                C202179148z.LJFF(0, i, "success", this.LIZ.LLJJJJLIIL.getActivity().getClass().getSimpleName());
            }

            @Override // X.InterfaceC20220614Aa
            public final void LIZ(int i, int i2, String str) {
                C14AD c14ad = this.LIZ;
                c14ad.LLJILLL = false;
                CardView cardView = c14ad.LLJILJILJ;
                if (cardView != null) {
                    C786410Ut5.LLILLL(cardView, 0);
                }
                if (!this.LIZ.LLJJI) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Service error");
                    sbLIZ.append(i);
                    sbLIZ.append(", Please feed back to us");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C202179148z.LJFF(i, i2, str, this.LIZ.LLJJJJLIIL.getActivity().getClass().getSimpleName());
            }
        };
        this.LLJL = new ComponentCallbacks() { // from class: X.14AG
            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
                int i;
                boolean z2;
                int i2 = configuration.orientation;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 2;
                }
                if (this.LL.LLJJJJLIIL.getType() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canOrientation: ");
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!z2) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("orientation", i);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                String strLIZIZ2 = C14AH.LIZIZ("bytedcert.orientation_changing", "bytedcert.orientation_changing", jSONObject);
                C14AD c14ad = this.LL;
                c14ad.LLJJIII = true;
                JsBridgeModule jsBridgeModule = c14ad.LL;
                if (jsBridgeModule != null) {
                    jsBridgeModule.LIZ(strLIZIZ2);
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("result", i);
                    jSONObject2.put("key", "orientation_change");
                    C202179148z.LIZJ("turing_verify_sdk", jSONObject2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20221514Aj.LIZIZ();
                }
            }
        };
        this.LLJJJJLIIL = abstractC202165148l;
        this.LLJJJJJIL = abstractC202165148l.getType();
        String url = abstractC202165148l.getUrl();
        this.LLJJIJI = url;
        this.LLJJIJIIJIL = interfaceC202160148g;
        this.LLJIJIL = abstractC202165148l.getActivity();
        try {
            C202178148y c202178148y = C1498550p6D.LIZ;
            if (c202178148y != null && (anonymousClass1490 = c202178148y.LIZ) != null) {
                JSONObject jSONObjectLIZ = AnonymousClass1492.LIZ(anonymousClass1490);
                if (jSONObjectLIZ == null) {
                    zOptBoolean = false;
                } else {
                    zOptBoolean = jSONObjectLIZ.optBoolean("use_spark", false);
                }
                JSONObject jSONObjectLIZ2 = AnonymousClass1492.LIZ(anonymousClass1490);
                if (jSONObjectLIZ2 != null) {
                    zOptBoolean2 = jSONObjectLIZ2.optBoolean("spark_view", false);
                } else {
                    zOptBoolean2 = false;
                }
                if (zOptBoolean && zOptBoolean2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLIZ = z;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
        }
        if (this.LLIZ) {
            final C14B3 c14b3 = new C14B3(url);
            this.LLILZLL = c14b3;
            final Context context = this.LLJIJIL;
            if (context != null) {
                if (!URLUtil.isValidUrl(url)) {
                    strLIZIZ = null;
                } else {
                    String str = a0.LJJIIZI(url, "?", false) ? "%26" : "?";
                    String strLJIIJJI = Intrinsics.LJIIJJI(Uri.encode("tiktok_bric_captcha"), "channel%3D");
                    String strLJIIJJI2 = Intrinsics.LJIIJJI(Uri.encode("index.html"), "bundle%3D");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(url);
                    sbLIZ.append(str);
                    sbLIZ.append(strLJIIJJI);
                    sbLIZ.append("%26");
                    sbLIZ.append(strLJIIJJI2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                String string = UriProtector.parse(new Uri.Builder().scheme("aweme").authority("roma_redirect").path("/").appendQueryParameter("spark_page", "bric_captcha").build().toString()).buildUpon().appendQueryParameter("captcha_url", strLIZIZ).build().toString();
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string);
                sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.14AR
                    public boolean LLILLJJLI = true;

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        if (this.LLILLJJLI) {
                            c14b3.getClass();
                            InterfaceC20220614Aa interfaceC20220614Aa = c14b3.LIZ;
                            if (interfaceC20220614Aa != null) {
                                interfaceC20220614Aa.LIZIZ(1);
                            }
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                        c14b3.getClass();
                        this.LLILLJJLI = false;
                        InterfaceC20220614Aa interfaceC20220614Aa = c14b3.LIZ;
                        if (interfaceC20220614Aa != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            if (str3 == null) {
                                str3 = "";
                            }
                            sbLIZ2.append(str3);
                            sbLIZ2.append('|');
                            sbLIZ2.append(str2);
                            interfaceC20220614Aa.LIZ(-1, 1, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                });
                sparkContext.LJJ(AbstractC1539010q9T.class, new AbstractC1539010q9T() { // from class: X.14AV
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        C1541480qDS c1541480qDS;
                        if ((interfaceC1531560pxS instanceof C1541480qDS) && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                            new C14C8();
                            c1541480qDS.LJII(C14C8.class, new AwS396S0200000_30(c14b3, context, 45));
                        }
                    }
                });
                c1537900q7g.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C148N.LJFF(context) * DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), C814420VxA.LIZIZ(C148N.LJFF(context) * 310)));
                new WeakReference(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView();
                c14b3.LIZLLL = kitView instanceof WebKitView ? (WebKitView) kitView : null;
                c14b3.LIZ();
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            }
            this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        }
        C148N.LJ(this.LLJJJJLIIL.getActivity());
        this.LLJJJIL = new C148P(this.LLJJJJLIIL.getActivity());
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.14AP
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                int action = keyEvent.getAction();
                if (keyCode == 4 && action == 1) {
                    if (this.LL.LLIZLLLIL.getVisibility() == 0) {
                        this.LL.LLJJJJ = C14AW.CLOSE_FB_SYSTEM;
                        return false;
                    }
                    C14AD c14ad = this.LL;
                    if (c14ad.LLIZ && c14ad.LLILZ != null) {
                        c14ad.LLJJJJ = C14AW.CLOSE_REASON_BACK;
                        WebKitView webKitView = c14ad.LLILZIL;
                        if (webKitView == null || !webKitView.canGoBack()) {
                            return false;
                        }
                        this.LL.LLILZIL.goBack();
                        return true;
                    }
                    C14B7 c14b7 = c14ad.LLILLL;
                    if (c14b7 != null && c14b7.canGoBack()) {
                        this.LL.LLILLL.goBack();
                        return true;
                    }
                    this.LL.LLJJJJ = C14AW.CLOSE_REASON_BACK;
                    return false;
                }
                return false;
            }
        });
    }
}
