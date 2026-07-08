package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.List;

/* JADX INFO: renamed from: X.0hOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class WindowCallbackC1202580hOq implements Window.Callback {
    public final Window.Callback LL;

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.LL.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
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

    public WindowCallbackC1202580hOq(Window.Callback callback) {
        if (callback != null) {
            this.LL = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.LL.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.LL.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.LL.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.LL.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window window;
        try {
            return this.LL.dispatchTouchEvent(motionEvent);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            Window.Callback callback = this.LL;
            StringBuilder sb = new StringBuilder();
            if (callback instanceof Dialog) {
                sb.append("callback is dialog, dialog info:");
                sb.append(callback);
                Dialog dialog = (Dialog) callback;
                window = dialog.getWindow();
                Activity ownerActivity = dialog.getOwnerActivity();
                if (ownerActivity != null) {
                    sb.append(" dialog's activity info:");
                    sb.append(ownerActivity);
                } else {
                    Context context = dialog.getContext();
                    if (context instanceof Activity) {
                        sb.append(" dialog's activity info:");
                        sb.append(context);
                    }
                }
            } else {
                window = null;
            }
            if (callback instanceof Activity) {
                sb.append("callback is activity, activity info:");
                sb.append(callback);
                window = ((Activity) callback).getWindow();
            }
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WindowCallbackWrapperLancet:");
            sbLIZ.append(sb.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            if (window != null) {
                PrintStream printStream2 = System.err;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ViewTree info:");
                StringBuilder sb2 = new StringBuilder();
                C485810J3j.LIZ((ViewGroup) window.getDecorView(), sb2);
                sbLIZ2.append(sb2.toString());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            throw e;
        }
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
    public View onCreatePanelView(int i) {
        return this.LL.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        C1202610hOt.LIZ(this.LL, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C1202590hOr.LIZ(this.LL, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.LL.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.LL.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.LL.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.LL.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.LL.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.LL.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.LL.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C1202590hOr.LIZIZ(this.LL, callback, i);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.LL.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C1202600hOs.LIZ(this.LL, list, menu, i);
    }
}
