package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19EG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19EG extends ComponentActivity implements C0VEB {
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpJzt9KTHELIOSU8ZwkhKSIhLCEnCSY4IDk6PDw=";
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final C198R mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public void androidx_fragment_app_FragmentActivity__applyOverrideConfiguration$___twin___(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityConfigurationLancet_applyOverrideConfiguration(this, configuration);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // X.C0VEB
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.LIZ.LLILZ;
    }

    @Override // X.C19FO, android.app.Activity
    public void onResume() {
        this.mFragments.LIZJ();
        super.onResume();
        this.mResumed = true;
        this.mFragments.LIZIZ();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.LIZ.LLILZ.LJJIJL();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.LIZJ();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.LIZ.LLILZ.LJIIZILJ();
        }
        this.mFragments.LIZIZ();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.LIZ.LLILZ.LJJIJLIJ();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.LIZJ();
    }

    public C19EG() {
        this.mFragments = C198R.LIZ(new C19EI(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().LIZJ("android:support:lifecycle", new InterfaceC197061128d() { // from class: X.19F4
            @Override // X.InterfaceC197061128d
            public final Bundle saveState() {
                return this.LIZ.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new C21524219Lk(this, 4));
        addOnNewIntentListener(new C21524219Lk(this, 5));
        addOnContextAvailableListener(new C19FB() { // from class: X.19F5
            @Override // X.C19FB
            public final void LIZ(Context context) {
                this.LIZ.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    public AbstractC20148113sV getSupportLoaderManager() {
        return AbstractC20148113sV.LIZIZ(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.LIZ.LLILZ.LJJ();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.C19FO, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.LIZ.LLILZ.LJJIL(5);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.LIZ.LLILZ.LJJIZ();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void supportFinishAfterTransition() {
        C1606560ruQ.LIZ(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C1606560ruQ.LIZIZ(this);
    }

    public void supportStartPostponedEnterTransition() {
        C1606560ruQ.LJ(this);
    }

    public C19EG(int i) {
        super(i);
        this.mFragments = C198R.LIZ(new C19EI(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.LIZJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.LIZJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        AnonymousClass1996<?> anonymousClass1996 = this.mFragments.LIZ;
        anonymousClass1996.LLILZ.LJIIIIZZ(anonymousClass1996, anonymousClass1996, null);
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.LIZ.LLILZ.LJIJJLI();
    }

    public void setEnterSharedElementCallback(AbstractC1322240kVq abstractC1322240kVq) {
        SharedElementCallbackC1322230kVp sharedElementCallbackC1322230kVp;
        if (abstractC1322240kVq != null) {
            sharedElementCallbackC1322230kVp = new SharedElementCallbackC1322230kVp(abstractC1322240kVq);
        } else {
            sharedElementCallbackC1322230kVp = null;
        }
        C1606560ruQ.LIZJ(this, sharedElementCallbackC1322230kVp);
    }

    public void setExitSharedElementCallback(AbstractC1322240kVq abstractC1322240kVq) {
        SharedElementCallbackC1322230kVp sharedElementCallbackC1322230kVp;
        if (abstractC1322240kVq != null) {
            sharedElementCallbackC1322230kVp = new SharedElementCallbackC1322230kVp(abstractC1322240kVq);
        } else {
            sharedElementCallbackC1322230kVp = null;
        }
        C1606560ruQ.LIZLLL(this, sharedElementCallbackC1322230kVp);
    }

    public static void androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_ActivityConfigurationLancet_applyOverrideConfiguration(C19EG c19eg, Configuration configuration) {
        Integer numValueOf;
        Resources resources;
        Configuration configuration2;
        Configuration configuration3;
        if (Build.VERSION.SDK_INT < 26) {
            Resources resources2 = c19eg.getResources();
            Integer numValueOf2 = null;
            if (resources2 != null && (configuration3 = resources2.getConfiguration()) != null) {
                numValueOf = Integer.valueOf(configuration3.uiMode);
            } else {
                numValueOf = null;
            }
            Context contextP3 = C786410Ut5.P3(c19eg);
            if (contextP3 != null && (resources = contextP3.getResources()) != null && (configuration2 = resources.getConfiguration()) != null) {
                numValueOf2 = Integer.valueOf(configuration2.uiMode);
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                return;
            }
        }
        c19eg.androidx_fragment_app_FragmentActivity__applyOverrideConfiguration$___twin___(configuration);
    }

    public static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                C197064128g c197064128g = fragment.mViewLifecycleOwner;
                if (c197064128g != null) {
                    c197064128g.LIZIZ();
                    if (c197064128g.LLILZIL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.LLILZIL.setCurrentState(state);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.LIZ.LLILZ.LJIJJ(menuItem);
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.LIZJ();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (viewDispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return viewDispatchFragmentsOnCreateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "androidx/fragment/app/FragmentActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4FwyUY1IyWgv5Qc=", new String[]{"01789"})));
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
        this.mFragments.LIZJ();
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) throws Throwable {
        C19EG c19eg;
        Fragment fragment2;
        Intent intent2;
        int iIntValue = i;
        C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4FwyUY1IyWgv5Qc=", new String[]{"01789"});
        C0WST c0wst = new C0WST();
        Bundle bundle = null;
        Object[] objArr = {fragment, intent, Integer.valueOf(iIntValue), null};
        C0WZW c0wzw = new C0WZW(false, "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11091, "androidx/fragment/app/FragmentActivity", "startActivityFromFragment", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11091, "androidx/fragment/app/FragmentActivity", "startActivityFromFragment", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                c19eg = (C19EG) obj;
            } else {
                c19eg = this;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                fragment2 = (Fragment) obj2;
            } else {
                fragment2 = fragment;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                intent2 = (Intent) obj3;
            } else {
                intent2 = intent;
            }
            Object obj4 = objArr2[3];
            if (obj4 != null) {
                iIntValue = ((Integer) obj4).intValue();
            }
            Object obj5 = c0wsuLIZIZ.LIZJ[4];
            if (obj5 != null) {
                bundle = (Bundle) obj5;
            }
        } else {
            c19eg = this;
            fragment2 = fragment;
            intent2 = intent;
        }
        c19eg.startActivityFromFragment(fragment2, intent2, iIntValue, bundle);
        c0wst.LIZ(11091, "androidx/fragment/app/FragmentActivity", "startActivityFromFragment", null, objArr, c19eg, c0wzw, true);
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.LIZ.LLILZ.LJJLIIIJLLLLLLLZ().onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("  ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        printWriter.print(strLIZIZ);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC20148113sV.LIZIZ(this).LIZLLL(strLIZIZ, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.LIZ.LLILZ.LJJJI(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (viewDispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) throws Throwable {
        if (i == -1) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Activity_startActivityForResult_3");
            C2204961BRm.LJIJ(this, intent, -1, bundle, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXPc/73wEpkKP6h6e5t40=", new String[]{"01789"}));
        } else {
            C2204961BRm.LLJJLIIIJLLLLLLLZ(fragment, intent, i, bundle, new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4FwyUY1IyWgv5Qc=", new String[]{"01789"}));
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }
}
