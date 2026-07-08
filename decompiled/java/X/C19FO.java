package X;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.19FO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19FO extends Activity implements LifecycleOwner, InterfaceC20097613kM {
    public static final String _pnsPageId = "KSsoOyA6LD1iKiAhLWstOT99HELIOSCyohOSA9LSs4CCwnITMlPTY=";
    public final C830530Wi3<Class<? extends C743650TFb>, C743650TFb> extraDataMap = new C830530Wi3<>();
    public final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    public static /* synthetic */ void getExtraDataMap$annotations() {
    }

    public static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    public void androidx_core_app_ComponentActivity__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public void androidx_core_app_ComponentActivity__onPause$___twin___() {
        super.onPause();
    }

    public void androidx_core_app_ComponentActivity__onResume$___twin___() {
        super.onResume();
    }

    public void androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(int i) {
        super.setRequestedOrientation(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextActivity(this, context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(this, bundle);
    }

    @Override // android.app.Activity
    public void onPause() {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onPause(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onResume(this);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(this, i);
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onPause(C19FO c19fo) {
        c19fo.androidx_core_app_ComponentActivity__onPause$___twin___();
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onResume(C19FO c19fo) {
        c19fo.androidx_core_app_ComponentActivity__onResume$___twin___();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (!str.equals("--translation") || Build.VERSION.SDK_INT < 31) {
                    }
                    break;
                case 100470631:
                    if (!str.equals("--dump-dumpable")) {
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                    break;
                case 472614934:
                    if (!str.equals("--list-dumpables")) {
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                    break;
                case 1159329357:
                    if (!str.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) {
                    }
                    break;
                case 1455016274:
                    if (!str.equals("--autofill") || Build.VERSION.SDK_INT < 26) {
                    }
                    break;
            }
            return false;
        }
        return false;
    }

    public void androidx_core_app_ComponentActivity__onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (C20097513kL.LIZ(decorView, keyEvent)) {
            return true;
        }
        return C20097513kL.LIZIZ(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (C20097513kL.LIZ(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @InterfaceC1294060jmO
    public <T extends C743650TFb> T getExtraData(Class<T> cls) {
        return (T) this.extraDataMap.get(cls);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @InterfaceC1294060jmO
    public void putExtraData(C743650TFb c743650TFb) {
        this.extraDataMap.put((Class<? extends C743650TFb>) c743650TFb.getClass(), c743650TFb);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // X.InterfaceC20097613kM
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(C19FO c19fo, Bundle bundle) {
        if (bundle != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("fix_androidx_fragment", 0) == 1) {
                C2463409l2.LIZ(bundle, "android:fragments", Fragment.class);
                C2463409l2.LIZ(bundle, "android:support:fragments", androidx.fragment.app.Fragment.class);
            }
        }
        if (Build.VERSION.SDK_INT == 26) {
            TypedArray typedArrayObtainStyledAttributes = c19fo.obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = c19fo.getRequestedOrientation();
            typedArrayObtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(c19fo)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1618230sDF c1618230sDF = C1618230sDF.LIZIZ;
        c19fo.getClass();
        c1618230sDF.LIZ.getClass();
        c19fo.androidx_core_app_ComponentActivity__onCreate$___twin___(bundle);
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(C19FO c19fo, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            c19fo.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(i);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = c19fo.obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            c19fo.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(i);
        }
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextActivity(C19FO c19fo, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        c19fo.androidx_core_app_ComponentActivity__attachBaseContext$___twin___(context);
    }
}
