package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196610hFD {
    public final Window LIZ;
    public final C1196600hFC LIZIZ;
    public Window.Callback LIZJ;

    public C1196610hFD(Window window, PageFinder pageFinder) {
        this.LIZ = window;
        C1196600hFC c1196600hFC = new C1196600hFC();
        this.LIZIZ = c1196600hFC;
        try {
            final Window.Callback callback = window.getCallback();
            this.LIZJ = callback;
            window.setCallback(new Window.Callback() { // from class: X.0hFL
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

                /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
                
                    r0.setAccessible(true);
                    r1 = r0.get(r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0172, code lost:
                
                    if (r1 == null) goto L109;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0174, code lost:
                
                    r0 = X.C1196600hFC.LJIILIIL;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x0176, code lost:
                
                    if (r0 == null) goto L109;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0178, code lost:
                
                    r0.setAccessible(true);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x017f, code lost:
                
                    if (r0.get(r1) == null) goto L109;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x0181, code lost:
                
                    r5.LIZLLL("click", r5.LJI, r5.LJII, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x0189, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x018a, code lost:
                
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x01f1, code lost:
                
                    r5.LIZLLL("click", r5.LJI, r5.LJII, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
                
                    if (r6 == null) goto L137;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
                
                    r2 = X.C1196600hFC.LIZ(r6);
                    r1 = X.C1196600hFC.LIZJ(r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
                
                    if (r2 == null) goto L63;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
                
                    if (kotlin.text.a0.LJJJIL(r2) == false) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
                
                    r2 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
                
                    r5.LJI = r2;
                    r5.LJII = X.C1196600hFC.LIZIZ(r6);
                    r5.LJIIIIZZ = X.C1196600hFC.LIZJ(r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
                
                    if ((java.lang.System.currentTimeMillis() - r5.LIZLLL) < 500) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
                
                    r3 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
                
                    if ((r6 instanceof X.C1845930y8V) == false) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x011e, code lost:
                
                    if (((X.C1845930y8V) r6) == null) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
                
                    r0 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
                
                    r0 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
                
                    if (r0 == false) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x012b, code lost:
                
                    if ((r6 instanceof X.C1203360hQ6) == false) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
                
                    r0 = (X.C1203360hQ6) r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x0130, code lost:
                
                    if (r0 == null) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
                
                    if (r0.getOnValueSelectedListener() == null) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
                
                    r5.LIZLLL("click", r5.LJI, r5.LJII, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
                
                    if ((r6 instanceof X.C1203350hQ5) == false) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
                
                    r0 = (X.C1203350hQ5) r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x0148, code lost:
                
                    if (r0 == null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x014e, code lost:
                
                    if (r0.getOnValueSelectedListener() == null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
                
                    if ((r6 instanceof X.C1179570gnj) == false) goto L147;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
                
                    r0 = (X.C1179570gnj) r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
                
                    if (r0 == null) goto L147;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x015c, code lost:
                
                    if (r0.LLILZLL == null) goto L147;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x015e, code lost:
                
                    r5.LIZLLL("click", r5.LJI, r5.LJII, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0167, code lost:
                
                    r0 = X.C1196600hFC.LJIIJJI;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0169, code lost:
                
                    if (r0 == null) goto L109;
                 */
                /* JADX WARN: Removed duplicated region for block: B:132:0x01db A[Catch: all -> 0x021a, TryCatch #3 {all -> 0x021a, blocks: (B:4:0x000b, B:10:0x0019, B:12:0x001d, B:14:0x0025, B:16:0x0029, B:18:0x0034, B:20:0x003e, B:23:0x0045, B:25:0x004f, B:27:0x0053, B:29:0x0059, B:30:0x005b, B:31:0x005f, B:33:0x0063, B:35:0x0067, B:37:0x006f, B:39:0x0077, B:41:0x0089, B:43:0x0096, B:44:0x00a9, B:46:0x00b1, B:48:0x00b5, B:49:0x00be, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00dc, B:59:0x00e8, B:61:0x00f2, B:64:0x00f9, B:68:0x0117, B:70:0x011b, B:77:0x0129, B:79:0x012d, B:81:0x0132, B:83:0x0138, B:84:0x0141, B:86:0x0145, B:88:0x014a, B:91:0x0151, B:93:0x0155, B:95:0x015a, B:97:0x015e, B:106:0x0181, B:118:0x01a9, B:129:0x01cf, B:132:0x01db, B:134:0x01df, B:135:0x01e7, B:131:0x01d8, B:120:0x01b2, B:108:0x018a, B:136:0x01f1, B:137:0x01f8, B:138:0x01ff, B:110:0x018f, B:112:0x0193, B:114:0x019c, B:116:0x01a0, B:121:0x01b5, B:123:0x01b9, B:125:0x01c2, B:127:0x01c6, B:98:0x0167, B:100:0x016b, B:102:0x0174, B:104:0x0178), top: B:149:0x000b, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:145:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00a9 A[Catch: all -> 0x021a, TryCatch #3 {all -> 0x021a, blocks: (B:4:0x000b, B:10:0x0019, B:12:0x001d, B:14:0x0025, B:16:0x0029, B:18:0x0034, B:20:0x003e, B:23:0x0045, B:25:0x004f, B:27:0x0053, B:29:0x0059, B:30:0x005b, B:31:0x005f, B:33:0x0063, B:35:0x0067, B:37:0x006f, B:39:0x0077, B:41:0x0089, B:43:0x0096, B:44:0x00a9, B:46:0x00b1, B:48:0x00b5, B:49:0x00be, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00dc, B:59:0x00e8, B:61:0x00f2, B:64:0x00f9, B:68:0x0117, B:70:0x011b, B:77:0x0129, B:79:0x012d, B:81:0x0132, B:83:0x0138, B:84:0x0141, B:86:0x0145, B:88:0x014a, B:91:0x0151, B:93:0x0155, B:95:0x015a, B:97:0x015e, B:106:0x0181, B:118:0x01a9, B:129:0x01cf, B:132:0x01db, B:134:0x01df, B:135:0x01e7, B:131:0x01d8, B:120:0x01b2, B:108:0x018a, B:136:0x01f1, B:137:0x01f8, B:138:0x01ff, B:110:0x018f, B:112:0x0193, B:114:0x019c, B:116:0x01a0, B:121:0x01b5, B:123:0x01b9, B:125:0x01c2, B:127:0x01c6, B:98:0x0167, B:100:0x016b, B:102:0x0174, B:104:0x0178), top: B:149:0x000b, inners: #0, #1, #2 }] */
                @Override // android.view.Window.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
                    /*
                        Method dump skipped, instruction units count: 549
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.WindowCallbackC1196690hFL.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
                public final View onCreatePanelView(int i) {
                    return callback.onCreatePanelView(i);
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
                public final boolean onCreatePanelMenu(int i, Menu menu) {
                    return callback.onCreatePanelMenu(i, menu);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
                    return callback.onMenuItemSelected(i, menuItem);
                }

                @Override // android.view.Window.Callback
                public final boolean onMenuOpened(int i, Menu menu) {
                    return callback.onMenuOpened(i, menu);
                }

                @Override // android.view.Window.Callback
                public final void onPanelClosed(int i, Menu menu) {
                    callback.onPanelClosed(i, menu);
                }

                @Override // android.view.Window.Callback
                public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i) {
                    return callback.onWindowStartingActionMode(callback2, i);
                }

                @Override // android.view.Window.Callback
                public final boolean onPreparePanel(int i, View view, Menu menu) {
                    return callback.onPreparePanel(i, view, menu);
                }
            });
            c1196600hFC.LIZ = Integer.valueOf(ViewConfiguration.get(window.getContext()).getScaledTouchSlop());
            c1196600hFC.LJFF = "ttls_operation_on_poi";
            c1196600hFC.LJIIJ = pageFinder;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
