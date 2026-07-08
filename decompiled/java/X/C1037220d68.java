package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import java.util.Collections;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037220d68 extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public SparkWebViewTouchDelegate LLILLJJLI;
    public InterfaceC1037260d6C LLILLL;
    public Activity LLILZ;
    public WebKitView LLILZIL;
    public String LLILZLL;

    public C1037220d68(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
    }

    public final String getContainerId() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null) {
            return null;
        }
        return sparkContext.containerId;
    }

    public final C1039050d95 getRootContainer() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        InterfaceC1056670dbV interfaceC1056670dbV = (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null) ? null : (InterfaceC1056670dbV) sparkContext.LJFF(InterfaceC1056670dbV.class);
        if (interfaceC1056670dbV instanceof C1039050d95) {
            return (C1039050d95) interfaceC1056670dbV;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    public final Activity getActivity() {
        return this.LLILZ;
    }

    public final InterfaceC1037260d6C getScrollListener() {
        return this.LLILLL;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LL;
    }

    public final WebKitView getWebView() {
        return this.LLILZIL;
    }

    @C14EU
    public final void onJsBroadcast(C1038820d8i c1038820d8i) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLILLJJLI;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZJ(c1038820d8i);
        }
    }

    public final void setActivity(Activity activity) {
        this.LLILZ = activity;
    }

    public final void setCanScrollVertically(boolean z) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLILLJJLI;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZIZ = z;
        }
    }

    public final void setEnableScrollControl(boolean z) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLILLJJLI;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZJ = z;
        }
    }

    public final void setOutTouchDelegate(View.OnTouchListener onTouchListener) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLILLJJLI;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZLLL = onTouchListener;
        }
    }

    public final void setScrollListener(InterfaceC1037260d6C interfaceC1037260d6C) {
        this.LLILLL = interfaceC1037260d6C;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public final void setWebView(WebKitView webKitView) {
        this.LLILZIL = webKitView;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        InterfaceC1541990qEH kitView;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (C123100dR.LIZ(getContainerId())) {
            jSONObject2.put("reactId", getContainerId());
        }
        jSONObject2.put("data", jSONObject);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.X0("notification", Collections.singletonList(jSONObject2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037220d68(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        AttributeSet attributeSet2 = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = new SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(context, attributeSet2, 62);
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, -1, -1);
    }

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
    public final void LIZ(Uri uri, Bundle bundle, AbstractC1542100qES abstractC1542100qES) {
        SparkContext sparkContext;
        AdSparkContext adSparkContextLIZJ;
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF != null && (adSparkContextLIZJ = iAdSparkUtilsLJFF.LIZJ(getContext(), uri.toString(), bundle, null, false)) != null) {
            if (abstractC1542100qES == null) {
                abstractC1542100qES = new C1077560e9C(this, 5);
            }
            adSparkContextLIZJ.LJJLJ(abstractC1542100qES);
            sparkContext = adSparkContextLIZJ;
        } else {
            sparkContext = new SparkContext();
        }
        sparkContext.bizCert = new ThirdPartyBizCert(402657281);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy(this) { // from class: X.0d6A
                public final /* synthetic */ C1037230d69 LL;

                @Override // X.InterfaceC2217701Bqy
                public final Context LIZJ(Context context) {
                    getClass();
                    return context;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIILLIIL(boolean z) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIL(Activity activity, Context context) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJI(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle2) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIL(SparkActivity sparkActivity, Bundle bundle2) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJ(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJ(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJLL(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJZI(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle2) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                    getClass();
                    return false;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle2) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLJLI(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLL(SparkActivity sparkActivity) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void finish() {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onActivityResult(int i, int i2, Intent intent) {
                    getClass();
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onRestoreInstanceState(Bundle bundle2) {
                    getClass();
                }

                @Override // X.InterfaceC1163130gND
                public final void release() {
                    getClass();
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.0d69] */
                {
                    this.getClass();
                    this.LL = new InterfaceC2217701Bqy() { // from class: X.0d69
                        @Override // X.InterfaceC2217701Bqy
                        public final Context LIZJ(Context context) {
                            return context;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIILLIIL(boolean z) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIL(Activity activity, Context context) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIJIIJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIL(SparkActivity sparkActivity, Bundle bundle2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJZI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                            return false;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLJLI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLL(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void finish() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onActivityResult(int i, int i2, Intent intent) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onRestoreInstanceState(Bundle bundle2) {
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }
                    };
                }
            });
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(sparkContext);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
        }
    }
}
