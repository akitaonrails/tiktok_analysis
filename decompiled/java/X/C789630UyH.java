package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0UyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789630UyH implements Application.ActivityLifecycleCallbacks {
    public final Set<Integer> LL = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void LIZ(Activity activity) {
        if (activity != null) {
            try {
                if (!((HashSet) this.LL).contains(Integer.valueOf(activity.hashCode()))) {
                    ((HashSet) this.LL).add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    final Window.Callback callback = window.getCallback();
                    window.setCallback(new Window.Callback(callback) { // from class: X.0hFR
                        public final Window.Callback LL;

                        @Override // android.view.Window.Callback
                        public final void onAttachedToWindow() {
                            this.LL.onAttachedToWindow();
                        }

                        @Override // android.view.Window.Callback
                        public final void onContentChanged() {
                            this.LL.onContentChanged();
                        }

                        @Override // android.view.Window.Callback
                        public final void onDetachedFromWindow() {
                            this.LL.onDetachedFromWindow();
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onSearchRequested() {
                            return this.LL.onSearchRequested();
                        }

                        {
                            this.LL = callback;
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                            return this.LL.dispatchGenericMotionEvent(motionEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                            return this.LL.dispatchKeyEvent(keyEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                            return this.LL.dispatchKeyShortcutEvent(keyEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                            return this.LL.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (motionEvent != null && motionEvent.getAction() == 0) {
                                C1196780hFU.LIZ = System.currentTimeMillis();
                            }
                            return this.LL.dispatchTouchEvent(motionEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                            return this.LL.dispatchTrackballEvent(motionEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final void onActionModeFinished(ActionMode actionMode) {
                            this.LL.onActionModeFinished(actionMode);
                        }

                        @Override // android.view.Window.Callback
                        public final void onActionModeStarted(ActionMode actionMode) {
                            this.LL.onActionModeStarted(actionMode);
                        }

                        @Override // android.view.Window.Callback
                        public final View onCreatePanelView(int i) {
                            return this.LL.onCreatePanelView(i);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onSearchRequested(SearchEvent searchEvent) {
                            return this.LL.onSearchRequested(searchEvent);
                        }

                        @Override // android.view.Window.Callback
                        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                            this.LL.onWindowAttributesChanged(layoutParams);
                        }

                        @Override // android.view.Window.Callback
                        public final void onWindowFocusChanged(boolean z) {
                            this.LL.onWindowFocusChanged(z);
                        }

                        @Override // android.view.Window.Callback
                        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2) {
                            return this.LL.onWindowStartingActionMode(callback2);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onCreatePanelMenu(int i, Menu menu) {
                            return this.LL.onCreatePanelMenu(i, menu);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
                            return this.LL.onMenuItemSelected(i, menuItem);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onMenuOpened(int i, Menu menu) {
                            return this.LL.onMenuOpened(i, menu);
                        }

                        @Override // android.view.Window.Callback
                        public final void onPanelClosed(int i, Menu menu) {
                            this.LL.onPanelClosed(i, menu);
                        }

                        @Override // android.view.Window.Callback
                        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i) {
                            return this.LL.onWindowStartingActionMode(callback2, i);
                        }

                        @Override // android.view.Window.Callback
                        public final boolean onPreparePanel(int i, View view, Menu menu) {
                            return this.LL.onPreparePanel(i, view, menu);
                        }
                    });
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZIZ(e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ((HashSet) this.LL).remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LIZ(activity);
    }
}
