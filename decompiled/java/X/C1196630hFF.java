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
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0hFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196630hFF {
    public final Window LIZ;
    public final List<View> LIZIZ;
    public final C1196660hFI LIZJ;
    public final Rect[] LIZLLL;
    public boolean LJ;
    public Window.Callback LJFF;

    public C1196630hFF(Window window, C13BV c13bv, Boolean bool, Boolean bool2, Boolean bool3, PageFinder pageFinder, int i) {
        Boolean bool4;
        String str;
        Boolean bool5;
        Boolean bool6 = bool3;
        Boolean bool7 = bool2;
        Boolean bool8 = bool;
        if ((i & 4) != 0) {
            bool4 = Boolean.FALSE;
        } else {
            bool4 = null;
        }
        if ((i & 8) != 0) {
            str = "operation_on_poi_detail";
        } else {
            str = "ttls_operation_on_poi";
        }
        if ((i & 64) != 0) {
            bool5 = Boolean.FALSE;
        } else {
            bool5 = null;
        }
        bool8 = (i & 128) != 0 ? Boolean.FALSE : bool8;
        bool7 = (i & 256) != 0 ? Boolean.FALSE : bool7;
        bool6 = (i & 512) != 0 ? Boolean.FALSE : bool6;
        PageFinder pageFinder2 = (i & 1024) == 0 ? pageFinder : null;
        this.LIZ = window;
        this.LIZIZ = c13bv;
        this.LIZJ = new C1196660hFI();
        int size = c13bv.size();
        Rect[] rectArr = new Rect[size];
        for (int i2 = 0; i2 < size; i2++) {
            rectArr[i2] = new Rect();
        }
        this.LIZLLL = rectArr;
        try {
            final Window.Callback callback = this.LIZ.getCallback();
            this.LJFF = callback;
            this.LIZ.setCallback(new Window.Callback() { // from class: X.0hFN
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
                    C1196630hFF c1196630hFF = this;
                    C1196660hFI c1196660hFI = c1196630hFF.LIZJ;
                    int i3 = 0;
                    if (c1196660hFI.LIZ && c1196660hFI.LIZIZ) {
                        return callback.dispatchTouchEvent(motionEvent);
                    }
                    if (!c1196630hFF.LJ) {
                        IntRange intRange = new IntRange(0, c1196630hFF.LIZLLL.length - 1);
                        C1196630hFF c1196630hFF2 = this;
                        C531650Kt9 it2 = intRange.iterator();
                        while (it2.LLILLL) {
                            int iNextInt = it2.nextInt();
                            ((View) ListProtector.get(c1196630hFF2.LIZIZ, iNextInt)).getGlobalVisibleRect(c1196630hFF2.LIZLLL[iNextInt]);
                        }
                        this.LJ = true;
                    }
                    if (motionEvent != null) {
                        C1196630hFF c1196630hFF3 = this;
                        Rect[] rectArr2 = c1196630hFF3.LIZLLL;
                        if (rectArr2 != null && rectArr2.length != 0) {
                            int length = rectArr2.length;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                Rect rect = c1196630hFF3.LIZLLL[i3];
                                if (motionEvent.getRawX() <= rect.right && motionEvent.getRawX() >= rect.left && motionEvent.getRawY() >= rect.top && motionEvent.getRawY() <= rect.bottom) {
                                    c1196630hFF3.LIZJ.LIZ(c1196630hFF3.LIZ, motionEvent);
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            c1196630hFF3.LIZJ.LIZ(c1196630hFF3.LIZ, motionEvent);
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
                public final View onCreatePanelView(int i3) {
                    return callback.onCreatePanelView(i3);
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
                public final boolean onCreatePanelMenu(int i3, Menu menu) {
                    return callback.onCreatePanelMenu(i3, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
                    return callback.onMenuItemSelected(i3, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i3, Menu menu) {
                    return callback.onMenuOpened(i3, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i3, Menu menu) {
                    callback.onPanelClosed(i3, menu);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i3) {
                    return callback.onWindowStartingActionMode(callback2, i3);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i3, View view, Menu menu) {
                    return callback.onPreparePanel(i3, view, menu);
                }
            });
            C1196660hFI.LIZJ(this.LIZJ, this.LIZ.getContext(), str, null, null, bool4, bool5, bool8, bool7, bool6, pageFinder2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
