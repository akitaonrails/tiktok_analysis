package androidx.activity;

import X.AbstractC1563340qmi;
import X.AbstractC903280Zc6;
import X.AnonymousClass1433;
import X.C01GW;
import X.C092O;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C128Y;
import X.C1565730qqZ;
import X.C1688560u2g;
import X.C168Q;
import X.C197065128h;
import X.C197066128i;
import X.C197069128l;
import X.C19719512Dh;
import X.C199Y;
import X.C19EP;
import X.C19F0;
import X.C19F8;
import X.C19FA;
import X.C19FB;
import X.C19FD;
import X.C19FF;
import X.C19FO;
import X.C2077708Bz;
import X.C21152817qA;
import X.C21506219Em;
import X.C21506519Ep;
import X.C21507219Ew;
import X.C2188811AlT;
import X.C452501pT;
import X.C480030Is5;
import X.C786410Ut5;
import X.C903290Zc7;
import X.EnumC682280QpW;
import X.InterfaceC1294060jmO;
import X.InterfaceC1670800ta2;
import X.InterfaceC1671500tbA;
import X.InterfaceC197061128d;
import X.InterfaceC19739612La;
import X.InterfaceC21505419Ee;
import X.InterfaceC21506819Es;
import X.InterfaceC21507319Ex;
import X.InterfaceC21507419Ey;
import X.InterfaceC21507519Ez;
import X.InterfaceExecutorC21352518hH;
import X.ViewTreeObserverOnDrawListenerC21352618hI;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS36S0201000_32;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class ComponentActivity extends C19FO implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C128Y, InterfaceC1671500tbA, InterfaceC1670800ta2, InterfaceC21505419Ee, InterfaceC19739612La, InterfaceC21507519Ez, InterfaceC21507319Ex, InterfaceC21507419Ey, C19F8 {
    public static final C19FA Companion = new Object() { // from class: X.19FA
    };
    public static final String _pnsPageId = "KSsoOyA6LD1iKCwnITMlPTZ9HELIOSCyohOSA9LSs4CCwnITMlPTY=";
    public ViewModelStore _viewModelStore;
    public final C19FF activityResultRegistry;
    public int contentLayoutId;
    public final C21506519Ep contextAwareHelper;
    public final C01GW defaultViewModelProviderFactory$delegate;
    public boolean dispatchingOnMultiWindowModeChanged;
    public boolean dispatchingOnPictureInPictureModeChanged;
    public final C01GW fullyDrawnReporter$delegate;
    public final C19EP menuHostHelper;
    public final AtomicInteger nextLocalRequestCode;
    public final C01GW onBackPressedDispatcher$delegate;
    public final CopyOnWriteArrayList<C092O<Configuration>> onConfigurationChangedListeners;
    public final CopyOnWriteArrayList<C092O<C19FD>> onMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList<C092O<Intent>> onNewIntentListeners;
    public final CopyOnWriteArrayList<C092O<C480030Is5>> onPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList<C092O<Integer>> onTrimMemoryListeners;
    public final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    public final InterfaceExecutorC21352518hH reportFullyDrawnExecutor;
    public final C197065128h savedStateRegistryController;

    public static /* synthetic */ void access$000(C19FO c19fo, Intent intent, int i) throws Throwable {
        androidx_activity_ComponentActivity_androidx_core_app_ComponentActivity_startActivityForResult_super(c19fo, intent, i, new C0WZX("dTF6Tg0zW9KSVFQ1TASNcmDQP7s1HE5paYFHFpityLVq6j8=", new String[]{"01789"}));
    }

    public static /* synthetic */ void access$001(C19FO c19fo, Intent intent, int i, Bundle bundle) throws Throwable {
        androidx_activity_ComponentActivity_androidx_core_app_ComponentActivity_startActivityForResult_super(c19fo, intent, i, bundle, new C0WZX("dTF6Tg0zW9KSVFQ1TASNcmDQP7s1HE5paYFHFpityLVq6j8=", new String[]{"01789"}));
    }

    public static void androidx_activity_ComponentActivity_androidx_core_app_ComponentActivity_startActivityForResult_super(C19FO c19fo, Intent intent, int i, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", c19fo, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", null, objArr, c19fo, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            activity = obj != null ? (Activity) obj : c19fo;
            Object obj2 = objArr2[1];
            intent2 = obj2 != null ? (Intent) obj2 : intent;
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            activity = c19fo;
            intent2 = intent;
        }
        super.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", null, objArr, activity, c0wzw, true);
    }

    public static void androidx_activity_ComponentActivity_androidx_core_app_ComponentActivity_startActivityForResult_super(C19FO c19fo, Intent intent, int i, Bundle bundle, C0WZX c0wzx) throws Throwable {
        Activity activity;
        Intent intent2;
        Bundle bundle2;
        int iIntValue = i;
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue), bundle};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", c19fo, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", null, objArr, c19fo, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            activity = obj != null ? (Activity) obj : c19fo;
            Object obj2 = objArr2[1];
            intent2 = obj2 != null ? (Intent) obj2 : intent;
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[3];
            bundle2 = obj4 != null ? (Bundle) obj4 : bundle;
        } else {
            activity = c19fo;
            intent2 = intent;
            bundle2 = bundle;
        }
        super.startActivityForResult(intent2, iIntValue, bundle2);
        c0wst.LIZ(11094, "androidx/core/app/ComponentActivity", "startActivityForResult", null, objArr, activity, c0wzw, true);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // X.InterfaceC1671500tbA
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getOnBackPressedDispatcher(this);
    }

    @InterfaceC1294060jmO
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    private final InterfaceExecutorC21352518hH createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC21352618hI(this);
    }

    public final OnBackPressedDispatcher androidx_activity_ComponentActivity__getOnBackPressedDispatcher$___twin___() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            C21507219Ew c21507219Ew = (C21507219Ew) getLastNonConfigurationInstance();
            if (c21507219Ew != null) {
                this._viewModelStore = c21507219Ew.LIZIZ;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        Bundle bundleINVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        C903290Zc7 c903290Zc7 = new C903290Zc7((Object) null);
        if (getApplication() != null) {
            c903290Zc7.LIZIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        c903290Zc7.LIZIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c903290Zc7.LIZIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        if (intent != null && (bundleINVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
            c903290Zc7.LIZIZ(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundleINVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        }
        return c903290Zc7;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C21152817qA getFullyDrawnReporter() {
        return (C21152817qA) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        return this.savedStateRegistryController.LIZIZ;
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.LIZIZ;
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C21506519Ep();
        this.menuHostHelper = new C19EP(new ARunnableS132S0100000_32(this, 2));
        C197065128h c197065128hLIZ = C197069128l.LIZ(this);
        this.savedStateRegistryController = c197065128hLIZ;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = C452501pT.LIZIZ(new AwS576S0100000_32(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C19FF() { // from class: X.19ER
            @Override // X.C19FF
            public final void LIZIZ(final int i, AnonymousClass1433 anonymousClass1433, Object obj) throws Throwable {
                Bundle extras;
                ComponentActivity componentActivity = this.LJII;
                final AnonymousClass1431 anonymousClass1431LIZIZ = anonymousClass1433.LIZIZ(componentActivity, obj);
                if (anonymousClass1431LIZIZ != null) {
                    C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new Runnable() { // from class: X.19EV
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19ER c19er = this.LL;
                            int i2 = i;
                            Object obj2 = anonymousClass1431LIZIZ.LIZ;
                            String str = (String) ((LinkedHashMap) c19er.LIZ).get(Integer.valueOf(i2));
                            if (str != null) {
                                C19FJ c19fj = (C19FJ) ((LinkedHashMap) c19er.LJ).get(str);
                                if (c19fj == null || c19fj.LIZ == 0) {
                                    c19er.LJI.remove(str);
                                    c19er.LJFF.put(str, obj2);
                                } else {
                                    C168Q<O> c168q = c19fj.LIZ;
                                    if (((ArrayList) c19er.LIZLLL).remove(str)) {
                                        c168q.LIZ((O) obj2);
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
                Intent intentLIZ = anonymousClass1433.LIZ(componentActivity, obj);
                Bundle bundleG3 = null;
                try {
                    if (intentLIZ.getExtras() != null) {
                        try {
                            extras = intentLIZ.getExtras();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            extras = null;
                        }
                        if (extras.getClassLoader() == null) {
                            intentLIZ.setExtrasClassLoader(componentActivity.getClassLoader());
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (intentLIZ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundleG3 = C786410Ut5.g3(intentLIZ, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intentLIZ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                }
                if (Intrinsics.LJFF("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentLIZ.getAction())) {
                    String[] stringArrayExtra = intentLIZ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    C2204961BRm.LLJJIJI(componentActivity, stringArrayExtra, i, new C0WZX("dTF6Tg0zW9KSVFQ1TASNcmDQP7s1HE5paYFHFpityLVq6j8=", new String[]{"01789"}));
                    return;
                }
                if (Intrinsics.LJFF("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentLIZ.getAction())) {
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentLIZ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        componentActivity.startIntentSenderForResult(intentSenderRequest.intentSender, i, intentSenderRequest.fillInIntent, intentSenderRequest.flagsMask, intentSenderRequest.flagsValues, 0, bundleG3);
                        return;
                    } catch (IntentSender.SendIntentException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new ARunnableS36S0201000_32(this, i, e3, 0));
                        return;
                    }
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(componentActivity, intentLIZ, "Activity_startActivityForResult_3");
                C2204961BRm.LJIJ(componentActivity, intentLIZ, i, bundleG3, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXPc/73wEpkKP6h6e5t40=", new String[]{"01789"}));
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString();
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: X.19Eu
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(this.LL, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: X.19Ev
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$3(this.LL, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        c197065128hLIZ.LIZ.LIZIZ();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().addObserver(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().LIZJ("android:support:activity-result", new InterfaceC197061128d() { // from class: X.19F1
            @Override // X.InterfaceC197061128d
            public final Bundle saveState() {
                return ComponentActivity._init_$lambda$4(this.LIZ);
            }
        });
        addOnContextAvailableListener(new C19FB() { // from class: X.19F2
            @Override // X.C19FB
            public final void LIZ(Context context) {
                ComponentActivity._init_$lambda$5(this.LIZ, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = C452501pT.LIZIZ(new AwS573S0100000_29(this, 7));
        this.onBackPressedDispatcher$delegate = C452501pT.LIZIZ(new AwS576S0100000_32(this, 2));
    }

    @InterfaceC1294060jmO
    public Object getLastCustomNonConfigurationInstance() {
        C21507219Ew c21507219Ew = (C21507219Ew) getLastNonConfigurationInstance();
        if (c21507219Ew != null) {
            return c21507219Ew.LIZ;
        }
        return null;
    }

    @Override // X.C19FO, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this._viewModelStore;
        }
        "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString();
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        C1688560u2g.LIZIZ(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.t8b, this);
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void onBackPressed() {
        getOnBackPressedDispatcher().LJ();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C21507219Ew c21507219Ew;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (((c21507219Ew = (C21507219Ew) getLastNonConfigurationInstance()) == null || (viewModelStore = c21507219Ew.LIZIZ) == null) && objOnRetainCustomNonConfigurationInstance == null)) {
            return null;
        }
        C21507219Ew c21507219Ew2 = new C21507219Ew();
        c21507219Ew2.LIZ = objOnRetainCustomNonConfigurationInstance;
        c21507219Ew2.LIZIZ = viewModelStore;
        return c21507219Ew2;
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it2 = this.onUserLeaveHintListeners.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C2077708Bz.LIZ()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().LIZ();
            Trace.endSection();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Trace.endSection();
            throw th;
        }
    }

    @Override // X.InterfaceC1670800ta2
    public final C19FF getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }

    public static Bundle INVOKEVIRTUAL_androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        C19FF c19ff = componentActivity.activityResultRegistry;
        c19ff.getClass();
        C786410Ut5.LJJIJIL(bundle, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(((LinkedHashMap) c19ff.LIZIZ).values()));
        C786410Ut5.LJJJIL(bundle, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(((LinkedHashMap) c19ff.LIZIZ).keySet()));
        C786410Ut5.LJJJIL(bundle, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(c19ff.LIZLLL));
        C786410Ut5.LJJIIZI(bundle, new Bundle(c19ff.LJI), "KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        return bundle;
    }

    public static OnBackPressedDispatcher androidx_activity_ComponentActivity_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getOnBackPressedDispatcher(ComponentActivity componentActivity) {
        Integer numLIZ;
        if (componentActivity instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) componentActivity.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), componentActivity)) != null) {
                OnBackPressedDispatcher onBackPressedDispatcherAndroidx_activity_ComponentActivity__getOnBackPressedDispatcher$___twin___ = componentActivity.androidx_activity_ComponentActivity__getOnBackPressedDispatcher$___twin___();
                C1565730qqZ.LIZIZ(numLIZ.intValue(), componentActivity);
                return onBackPressedDispatcherAndroidx_activity_ComponentActivity__getOnBackPressedDispatcher$___twin___;
            }
        }
        return componentActivity.androidx_activity_ComponentActivity__getOnBackPressedDispatcher$___twin___();
    }

    @Override // X.C19F8
    public void addMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        C19EP c19ep = this.menuHostHelper;
        c19ep.LIZIZ.add(interfaceC21506819Es);
        c19ep.LIZ.run();
    }

    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: X.19Et
            public final /* synthetic */ ComponentActivity LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(onBackPressedDispatcher, this.LLILLJJLI, lifecycleOwner, event);
            }
        });
    }

    @Override // X.InterfaceC19739612La
    public final void addOnConfigurationChangedListener(C092O<Configuration> c092o) {
        this.onConfigurationChangedListeners.add(c092o);
    }

    public final void addOnContextAvailableListener(C19FB c19fb) {
        C21506519Ep c21506519Ep = this.contextAwareHelper;
        Context context = c21506519Ep.LIZIZ;
        if (context != null) {
            c19fb.LIZ(context);
        }
        ((CopyOnWriteArraySet) c21506519Ep.LIZ).add(c19fb);
    }

    @Override // X.InterfaceC21507319Ex
    public final void addOnMultiWindowModeChangedListener(C092O<C19FD> c092o) {
        this.onMultiWindowModeChangedListeners.add(c092o);
    }

    public final void addOnNewIntentListener(C092O<Intent> c092o) {
        this.onNewIntentListeners.add(c092o);
    }

    @Override // X.InterfaceC21507419Ey
    public final void addOnPictureInPictureModeChangedListener(C092O<C480030Is5> c092o) {
        this.onPictureInPictureModeChangedListeners.add(c092o);
    }

    @Override // X.InterfaceC21507519Ez
    public final void addOnTrimMemoryListener(C092O<Integer> c092o) {
        this.onTrimMemoryListeners.add(c092o);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C092O<Configuration>> it2 = this.onConfigurationChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(configuration);
        }
    }

    @Override // X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.LIZ(bundle);
        C21506519Ep c21506519Ep = this.contextAwareHelper;
        c21506519Ep.LIZIZ = this;
        Iterator it2 = ((CopyOnWriteArraySet) c21506519Ep.LIZ).iterator();
        while (it2.hasNext()) {
            ((C19FB) it2.next()).LIZ(this);
        }
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<C092O<C19FD>> it2 = this.onMultiWindowModeChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(new C19FD(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<C092O<Intent>> it2 = this.onNewIntentListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(intent);
        }
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<C092O<C480030Is5>> it2 = this.onPictureInPictureModeChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(new C480030Is5(z));
        }
    }

    @Override // X.C19FO, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (getLifecycle() instanceof LifecycleRegistry) {
            ((LifecycleRegistry) getLifecycle()).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.LIZIZ(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C092O<Integer>> it2 = this.onTrimMemoryListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(Integer.valueOf(i));
        }
    }

    @Override // X.C19F8
    public void removeMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        this.menuHostHelper.LIZ(interfaceC21506819Es);
    }

    @Override // X.InterfaceC19739612La
    public final void removeOnConfigurationChangedListener(C092O<Configuration> c092o) {
        this.onConfigurationChangedListeners.remove(c092o);
    }

    public final void removeOnContextAvailableListener(C19FB c19fb) {
        ((CopyOnWriteArraySet) this.contextAwareHelper.LIZ).remove(c19fb);
    }

    @Override // X.InterfaceC21507319Ex
    public final void removeOnMultiWindowModeChangedListener(C092O<C19FD> c092o) {
        this.onMultiWindowModeChangedListeners.remove(c092o);
    }

    public final void removeOnNewIntentListener(C092O<Intent> c092o) {
        this.onNewIntentListeners.remove(c092o);
    }

    @Override // X.InterfaceC21507419Ey
    public final void removeOnPictureInPictureModeChangedListener(C092O<C480030Is5> c092o) {
        this.onPictureInPictureModeChangedListeners.remove(c092o);
    }

    @Override // X.InterfaceC21507519Ez
    public final void removeOnTrimMemoryListener(C092O<Integer> c092o) {
        this.onTrimMemoryListeners.remove(c092o);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.LJLJL(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.LJLJL(getWindow().getDecorView());
        super.setContentView(view);
    }

    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        Bundle bundleLIZ = componentActivity.getSavedStateRegistry().LIZ("android:support:activity-result");
        if (bundleLIZ != null) {
            C19FF c19ff = componentActivity.activityResultRegistry;
            c19ff.getClass();
            ArrayList<Integer> integerArrayList = bundleLIZ.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleLIZ.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundleLIZ.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    ((ArrayList) c19ff.LIZLLL).addAll(stringArrayList2);
                }
                Bundle bundle = bundleLIZ.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle != null) {
                    C786410Ut5.LJJIIJZLJL(c19ff.LJI, bundle);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) ListProtector.get(stringArrayList, i);
                    if (c19ff.LIZIZ.containsKey(str)) {
                        Integer numRemove = c19ff.LIZIZ.remove(str);
                        if (!c19ff.LJI.containsKey(str)) {
                            C19719512Dh.LIZJ(c19ff.LIZ).remove(numRemove);
                        }
                    }
                    int iIntValue = ((Number) ListProtector.get(integerArrayList, i)).intValue();
                    Object obj = ListProtector.get(stringArrayList, i);
                    c19ff.LIZ.put(Integer.valueOf(iIntValue), (String) obj);
                    c19ff.LIZIZ.put((String) obj, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.LJLJL(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC21506819Es interfaceC21506819Es, LifecycleOwner lifecycleOwner) {
        final C19EP c19ep = this.menuHostHelper;
        c19ep.LIZIZ.add(interfaceC21506819Es);
        c19ep.LIZ.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C21506219Em c21506219Em = (C21506219Em) ((HashMap) c19ep.LIZJ).remove(interfaceC21506819Es);
        if (c21506219Em != null) {
            c21506219Em.LIZ.removeObserver(c21506219Em.LIZIZ);
            c21506219Em.LIZIZ = null;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.19Eo
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C19EP c19ep2 = c19ep;
                InterfaceC21506819Es interfaceC21506819Es2 = interfaceC21506819Es;
                c19ep2.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c19ep2.LIZ(interfaceC21506819Es2);
                }
            }
        };
        ((HashMap) c19ep.LIZJ).put(interfaceC21506819Es, new C21506219Em(lifecycle, lifecycleEventObserver));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            C19EP c19ep = this.menuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<InterfaceC21506819Es> it2 = c19ep.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<InterfaceC21506819Es> it2 = this.menuHostHelper.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZLLL(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<C092O<C19FD>> it2 = this.onMultiWindowModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new C19FD(z));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<InterfaceC21506819Es> it2 = this.menuHostHelper.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<C092O<C480030Is5>> it2 = this.onPictureInPictureModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new C480030Is5(z));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // X.InterfaceC21505419Ee
    public final <I, O> C19F0<I> registerForActivityResult(AnonymousClass1433<I, O> anonymousClass1433, C168Q<O> c168q) {
        return registerForActivityResult(anonymousClass1433, this.activityResultRegistry, c168q);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.LJLJL(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void startActivityForResult(Intent intent, int i) {
        INVOKESPECIAL_androidx_activity_ComponentActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(this, intent, i);
    }

    public static void INVOKESPECIAL_androidx_activity_ComponentActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(C19FO c19fo, Intent intent, int i) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19fo, intent, "Activity_startActivityForResult_2");
        access$000(c19fo, intent, i);
    }

    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
            viewPeekDecorView.cancelPendingInputEvents();
        }
    }

    public static final void _init_$lambda$3(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.LIZIZ = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.LJJIL();
        }
    }

    public void addMenuProvider(final InterfaceC21506819Es interfaceC21506819Es, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        final C19EP c19ep = this.menuHostHelper;
        c19ep.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C21506219Em c21506219Em = (C21506219Em) ((HashMap) c19ep.LIZJ).remove(interfaceC21506819Es);
        if (c21506219Em != null) {
            c21506219Em.LIZ.removeObserver(c21506219Em.LIZIZ);
            c21506219Em.LIZIZ = null;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.19EZ
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C19EP c19ep2 = c19ep;
                Lifecycle.State state2 = state;
                InterfaceC21506819Es interfaceC21506819Es2 = interfaceC21506819Es;
                c19ep2.getClass();
                if (event == Lifecycle.Event.upTo(state2)) {
                    c19ep2.LIZIZ.add(interfaceC21506819Es2);
                    c19ep2.LIZ.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    c19ep2.LIZ(interfaceC21506819Es2);
                } else {
                    if (event != Lifecycle.Event.downFrom(state2)) {
                        return;
                    }
                    c19ep2.LIZIZ.remove(interfaceC21506819Es2);
                    c19ep2.LIZ.run();
                }
            }
        };
        ((HashMap) c19ep.LIZJ).put(interfaceC21506819Es, new C21506219Em(lifecycle, lifecycleEventObserver));
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.activityResultRegistry.LIZ(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator<InterfaceC21506819Es> it2 = this.menuHostHelper.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "androidx/activity/ComponentActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dTF6Tg0zW9KSVFQ1TASNcmDQP7s1HE5paYFHFpityLVq6j8=", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        if (!this.activityResultRegistry.LIZ(iIntValue, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr2))) {
            super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
        }
    }

    public final <I, O> C19F0<I> registerForActivityResult(AnonymousClass1433<I, O> anonymousClass1433, C19FF c19ff, C168Q<O> c168q) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity_rq#");
        sbLIZ.append(this.nextLocalRequestCode.getAndIncrement());
        return c19ff.LIZJ(C2188811AlT.LIZIZ(sbLIZ), this, anonymousClass1433, c168q);
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void startActivityForResult(Intent intent, int i, Bundle bundle) throws Throwable {
        INVOKESPECIAL_androidx_activity_ComponentActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(this, intent, i, bundle);
    }

    public static void INVOKESPECIAL_androidx_activity_ComponentActivity_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(C19FO c19fo, Intent intent, int i, Bundle bundle) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19fo, intent, "Activity_startActivityForResult_3");
        access$001(c19fo, intent, i, bundle);
    }

    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.LJFF = componentActivity.getOnBackInvokedDispatcher();
            onBackPressedDispatcher.LJFF(onBackPressedDispatcher.LJII);
        }
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @InterfaceC1294060jmO
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
