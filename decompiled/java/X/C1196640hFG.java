package X;

import android.graphics.Rect;
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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0hFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196640hFG {
    public final Window LIZ;
    public final List<View> LIZIZ;
    public final C1196650hFH LIZJ = new C1196650hFH();
    public final Rect[] LIZLLL;
    public boolean LJ;
    public Window.Callback LJFF;

    public C1196640hFG(Window window, C13BV c13bv, Boolean bool, Boolean bool2) {
        this.LIZ = window;
        this.LIZIZ = c13bv;
        int size = c13bv.size();
        Rect[] rectArr = new Rect[size];
        for (int i = 0; i < size; i++) {
            rectArr[i] = new Rect();
        }
        this.LIZLLL = rectArr;
        try {
            final Window.Callback callback = this.LIZ.getCallback();
            this.LJFF = callback;
            this.LIZ.setCallback(new Window.Callback() { // from class: X.0hFM
                @Override // android.view.Window.Callback
                public final void onAttachedToWindow() {
                    callback.onAttachedToWindow();
                }

                @Override // android.view.Window.Callback
                public final void onContentChanged() {
                    callback.onContentChanged();
                }

                @Override // android.view.Window.Callback
                public final void onDetachedFromWindow() {
                    callback.onDetachedFromWindow();
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested() {
                    return callback.onSearchRequested();
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    return callback.dispatchGenericMotionEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return callback.dispatchKeyEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                    return callback.dispatchKeyShortcutEvent(keyEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                    return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    C1196640hFG c1196640hFG = this;
                    C1196650hFH c1196650hFH = c1196640hFG.LIZJ;
                    int i2 = 0;
                    if (c1196650hFH.LIZ && c1196650hFH.LIZIZ) {
                        return callback.dispatchTouchEvent(motionEvent);
                    }
                    if (!c1196640hFG.LJ) {
                        IntRange intRange = new IntRange(0, c1196640hFG.LIZLLL.length - 1);
                        C1196640hFG c1196640hFG2 = this;
                        C531650Kt9 it2 = intRange.iterator();
                        while (it2.LLILLL) {
                            int iNextInt = it2.nextInt();
                            ((View) ListProtector.get(c1196640hFG2.LIZIZ, iNextInt)).getGlobalVisibleRect(c1196640hFG2.LIZLLL[iNextInt]);
                        }
                        this.LJ = true;
                    }
                    if (motionEvent != null) {
                        C1196640hFG c1196640hFG3 = this;
                        Rect[] rectArr2 = c1196640hFG3.LIZLLL;
                        if (rectArr2 != null && rectArr2.length != 0) {
                            int length = rectArr2.length;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                Rect rect = c1196640hFG3.LIZLLL[i2];
                                if (motionEvent.getRawX() <= rect.right && motionEvent.getRawX() >= rect.left && motionEvent.getRawY() >= rect.top && motionEvent.getRawY() <= rect.bottom) {
                                    c1196640hFG3.LIZJ.LIZ(c1196640hFG3.LIZ, motionEvent);
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            c1196640hFG3.LIZJ.LIZ(c1196640hFG3.LIZ, motionEvent);
                        }
                    }
                    return callback.dispatchTouchEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                    return callback.dispatchTrackballEvent(motionEvent);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeFinished(ActionMode actionMode) {
                    callback.onActionModeFinished(actionMode);
                }

                @Override // android.view.Window.Callback
                public final void onActionModeStarted(ActionMode actionMode) {
                    callback.onActionModeStarted(actionMode);
                }

                @Override // android.view.Window.Callback
                public final View onCreatePanelView(int i2) {
                    return callback.onCreatePanelView(i2);
                }

                @Override // android.view.Window.Callback
                public final boolean onSearchRequested(SearchEvent searchEvent) {
                    return callback.onSearchRequested(searchEvent);
                }

                @Override // android.view.Window.Callback
                public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                    callback.onWindowAttributesChanged(layoutParams);
                }

                @Override // android.view.Window.Callback
                public final void onWindowFocusChanged(boolean z) {
                    callback.onWindowFocusChanged(z);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2) {
                    return callback.onWindowStartingActionMode(callback2);
                }

                @Override // android.view.Window.Callback
                public final boolean onCreatePanelMenu(int i2, Menu menu) {
                    return callback.onCreatePanelMenu(i2, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
                    return callback.onMenuItemSelected(i2, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i2, Menu menu) {
                    return callback.onMenuOpened(i2, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i2, Menu menu) {
                    callback.onPanelClosed(i2, menu);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i2) {
                    return callback.onWindowStartingActionMode(callback2, i2);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i2, View view, Menu menu) {
                    return callback.onPreparePanel(i2, view, menu);
                }
            });
            C1196650hFH.LIZJ(this.LIZJ, this.LIZ.getContext(), "operation_on_poi_detail", null, null, bool, bool2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
