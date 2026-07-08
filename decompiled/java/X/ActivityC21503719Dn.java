package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: X.19Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ActivityC21503719Dn extends C19GS implements InterfaceC20277914Wb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OCo7HELIOSLD0jKSIpZx88PyA+CCwnITMlPTY=";
    public final boolean enablePowerPage = true;
    public Fragment rootAttachFragment;
    public static final C21503919Dp Companion = new Object() { // from class: X.19Dp
    };
    public static final C194306110e activityRegistry = new C194306110e();

    private final InterfaceC21503819Do getRootDelegate() {
        C128Y c128y = this.rootAttachFragment;
        if (c128y instanceof InterfaceC21503819Do) {
            return (InterfaceC21503819Do) c128y;
        }
        return null;
    }

    public final Fragment getPowerAttachRootFragment() {
        Fragment fragment = this.rootAttachFragment;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            return supportFragmentManager.LJJJJZ(R.id.rmy);
        }
        return null;
    }

    @Override // android.app.Activity
    public void finish() {
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null) {
            rootDelegate.onActivityFinish();
        }
        super.finish();
        InterfaceC21503819Do rootDelegate2 = getRootDelegate();
        if (rootDelegate2 != null) {
            rootDelegate2.ap();
        }
    }

    public final String getRootFragmentClsName() {
        return INVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null) {
            rootDelegate.tv();
        } else {
            super.onBackPressed();
        }
    }

    public boolean getEnablePowerPage() {
        return this.enablePowerPage;
    }

    public Fragment getRootAttachFragment() {
        return this.rootAttachFragment;
    }

    @Override // X.InterfaceC20277914Wb
    public void powerHostBackPressed() {
        super.onBackPressed();
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[PHI: r1
      0x0061: PHI (r1v4 androidx.fragment.app.Fragment) = (r1v3 androidx.fragment.app.Fragment), (r1v6 androidx.fragment.app.Fragment) binds: [B:15:0x004d, B:20:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            boolean r0 = r3.getEnablePowerPage()
            if (r0 == 0) goto L40
            X.110e r2 = X.ActivityC21503719Dn.activityRegistry
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getName()
            java.util.ArrayList<java.lang.String> r0 = r2.LIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L40
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            r2 = 2131386110(0x7f0a5efe, float:1.839267E38)
            androidx.fragment.app.Fragment r1 = r0.LJJJJZ(r2)
            if (r1 == 0) goto L41
            r3.rootAttachFragment = r1
            android.content.Intent r0 = r3.getIntent()
            r3.injectFields(r1, r0)
        L31:
            X.19Do r0 = r3.getRootDelegate()
            if (r0 == 0) goto L3a
            r0.Q9(r3)
        L3a:
            r0 = 2131558552(0x7f0d0098, float:1.8742423E38)
            r3.setContentView(r0)
        L40:
            return
        L41:
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "POWER_FRAGMENT_CLASS_NAME"
            java.lang.String r0 = INVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r1, r0)
            androidx.fragment.app.Fragment r1 = r3.rootAttachFragment
            if (r1 != 0) goto L61
            if (r0 == 0) goto L31
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Object r1 = r0.newInstance()
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L31
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L31
        L61:
            r3.rootAttachFragment = r1
            android.content.Intent r0 = r3.getIntent()
            r3.injectFields(r1, r0)
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            X.19EH r0 = r0.LJIIJ()
            r0.LIZIZ(r2, r1)
            r0.LJIIJ()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC21503719Dn.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Fragment fragment = this.rootAttachFragment;
        if (fragment != null) {
            injectFields(fragment, intent);
            InterfaceC21503819Do rootDelegate = getRootDelegate();
            if (rootDelegate != null) {
                rootDelegate.qO(intent);
            }
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null) {
            rootDelegate.FE(bundle);
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null) {
            rootDelegate.WK(z);
        }
        super.onWindowFocusChanged(z);
    }

    public void setRootAttachFragment(Fragment fragment) {
        this.rootAttachFragment = fragment;
    }

    public static String INVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void injectFields(Fragment fragment, Intent intent) {
        Bundle arguments;
        Constructor<?> constructor;
        if (intent == null) {
            return;
        }
        Class<?> cls = fragment.getClass();
        String name = cls.getName();
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(name);
                sbLIZ.append("__BindExtra");
                Class<?> clsLoadClass = classLoader.loadClass(C2188811AlT.LIZIZ(sbLIZ));
                if (clsLoadClass != null && (constructor = clsLoadClass.getConstructor(cls, Intent.class)) != null) {
                    constructor.newInstance(fragment, intent);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle bundleINVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (arguments = fragment.getArguments()) != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundleINVOKEVIRTUAL_com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        }
    }

    @Override // X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Boolean boolOnActivityKeyDown;
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null && (boolOnActivityKeyDown = rootDelegate.onActivityKeyDown(i, keyEvent)) != null) {
            return boolOnActivityKeyDown.booleanValue();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Boolean boolOnActivityKeyLongPress;
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null && (boolOnActivityKeyLongPress = rootDelegate.onActivityKeyLongPress(i, keyEvent)) != null) {
            return boolOnActivityKeyLongPress.booleanValue();
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Boolean boolOnActivityKeyUp;
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null && (boolOnActivityKeyUp = rootDelegate.onActivityKeyUp(i, keyEvent)) != null) {
            return boolOnActivityKeyUp.booleanValue();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC21503819Do rootDelegate = getRootDelegate();
        if (rootDelegate != null) {
            rootDelegate.ur(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.InterfaceC20277914Wb
    public void powerHostActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
