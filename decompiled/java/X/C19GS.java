package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19GS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19GS extends C19EG implements C19WW, C0W16 {
    public static final String _pnsPageId = "KSsoOyA6LD1iKD8jKyohOS4nZiQ8HELIOSOWESODUPJiIjKTENKjs6Piw4MA==";
    public C19GT mDelegate;
    public Resources mResources;

    public void androidx_appcompat_app_AppCompatActivity__recreate$___twin___() {
        super.recreate();
    }

    public void onLocalesChanged(C838510Wuv c838510Wuv) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C0W15 c0w15) {
    }

    @Override // X.C19WW
    public void onSupportActionModeFinished(AbstractC21549319Vb abstractC21549319Vb) {
    }

    @Override // X.C19WW
    public void onSupportActionModeStarted(AbstractC21549319Vb abstractC21549319Vb) {
    }

    public void onSupportContentChanged() {
    }

    @Override // X.C19WW
    public AbstractC21549319Vb onWindowStartingSupportActionMode(InterfaceC21549419Vc interfaceC21549419Vc) {
        return null;
    }

    @Override // android.app.Activity
    public void recreate() {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(this, view, layoutParams);
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public C19GT getDelegate() {
        if (this.mDelegate == null) {
            C19GV c19gv = C19GT.LL;
            this.mDelegate = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public C19GS() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().LIZJ("androidx:appcompat", new InterfaceC197061128d() { // from class: X.19GX
            @Override // X.InterfaceC197061128d
            public final Bundle saveState() {
                Bundle bundle = new Bundle();
                this.LIZ.getDelegate().LJIJI();
                return bundle;
            }
        });
        addOnContextAvailableListener(new C19FB() { // from class: X.19GW
            @Override // X.C19FB
            public final void LIZ(Context context) {
                C19GT delegate = this.LIZ.getDelegate();
                delegate.LJIIJJI();
                this.LIZ.getSavedStateRegistry().LIZ("androidx:appcompat");
                delegate.LJIILL();
            }
        });
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        C19W7 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.LIZ()) {
                super.closeOptionsMenu();
            }
        }
    }

    public InterfaceC21510219Ga getDrawerToggleDelegate() {
        return getDelegate().LJII();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().LJIIIZ();
    }

    public C19W7 getSupportActionBar() {
        return getDelegate().LJIIJ();
    }

    @Override // X.C0W16
    public Intent getSupportParentActivityIntent() {
        return C815500Vyu.LIZ(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().LJIIL();
    }

    @Override // X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().LJIILLIIL();
    }

    @Override // X.C19EG, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().LJIJ();
    }

    @Override // X.C19EG, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().LJIJJ();
    }

    @Override // X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().LJIJJLI();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C0W15 c0w15 = new C0W15(this);
        onCreateSupportNavigateUpTaskStack(c0w15);
        onPrepareSupportNavigateUpTaskStack(c0w15);
        c0w15.LJFF();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        C19W7 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.LJIIJJI()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // X.C19EG
    public void supportInvalidateOptionsMenu() {
        getDelegate().LJIIL();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public C19GS(int i) {
        super(i);
        initDelegate();
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(C19GS c19gs) {
        c19gs.androidx_appcompat_app_AppCompatActivity__recreate$___twin___();
        try {
            throw new RuntimeException("Activity recreated!");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(int i) {
        initializeViewTreeOwners();
        getDelegate().LJJI(i);
    }

    @Override // X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().LJ(context));
    }

    @Override // X.C19FO, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C19W7 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.LJIIJ(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().LJFF(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().LJIILJJIL(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onCreateSupportNavigateUpTaskStack(C0W15 c0w15) {
        c0w15.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null || (supportParentActivityIntent = C815500Vyu.LIZ(this)) != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(c0w15.LLILLJJLI.getPackageManager());
            }
            c0w15.LJ(component);
            c0w15.LL.add(supportParentActivityIntent);
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().LJIIZILJ();
    }

    public void setSupportActionBar(C19V8 c19v8) {
        getDelegate().LJJIIJZLJL(c19v8);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().LJJIIZ(i);
    }

    public AbstractC21549319Vb startSupportActionMode(InterfaceC21549419Vc interfaceC21549419Vc) {
        return getDelegate().LJJIJ(interfaceC21549419Vc);
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().LJJ(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(View view) {
        initializeViewTreeOwners();
        getDelegate().LJJIFFI(view);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(C19GS c19gs, int i) {
        if (!C2260308tN.LIZ()) {
            c19gs.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(i);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c19gs.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(i);
        C2260308tN.LIZIZ(i, SystemClock.elapsedRealtime() - jElapsedRealtime, c19gs, "set");
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C19GS c19gs, int i) {
        C19GS c19gs2;
        if (c19gs instanceof C19GS) {
            c19gs2 = c19gs;
        } else {
            c19gs2 = null;
        }
        C1685300txQ.LIZ(c19gs2);
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(c19gs, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().LIZJ(view, layoutParams);
    }

    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().LJJII(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C19W7 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.LIZLLL() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().LJJIIZI(charSequence);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C19GS c19gs, View view) {
        C19GS c19gs2;
        if (c19gs instanceof C19GS) {
            c19gs2 = c19gs;
        } else {
            c19gs2 = null;
        }
        C1685300txQ.LIZ(c19gs2);
        c19gs.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(view);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_setContentView(C19GS c19gs, View view, ViewGroup.LayoutParams layoutParams) {
        C19GS c19gs2;
        if (c19gs instanceof C19GS) {
            c19gs2 = c19gs;
        } else {
            c19gs2 = null;
        }
        C1685300txQ.LIZ(c19gs2);
        c19gs.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(view, layoutParams);
    }
}
