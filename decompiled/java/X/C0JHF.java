package X;

/* JADX INFO: renamed from: X.0JHF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHF {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r7.contains(r1.getTag()) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.app.Activity r5, android.view.MotionEvent r6, java.util.List r7) {
        /*
            r2 = 0
            if (r6 == 0) goto L63
            int r0 = r6.getAction()
            if (r0 != 0) goto L63
            android.view.View r3 = r5.getCurrentFocus()
            if (r3 != 0) goto L10
            return
        L10:
            java.lang.Object r0 = r3.getTag()
            boolean r0 = X.C13LP.LJJJJ(r0, r7)
            if (r0 != 0) goto L39
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.View
            r4 = 0
            if (r0 == 0) goto L89
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L8a
            java.lang.Object r0 = r1.getTag()
        L2b:
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L64
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L84
        L39:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r3.getGlobalVisibleRect(r4)
            float r0 = r6.getRawX()
            int r1 = (int) r0
            float r0 = r6.getRawY()
            int r0 = (int) r0
            boolean r0 = r4.contains(r1, r0)
            if (r0 != 0) goto L63
            r3.clearFocus()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = X.C786410Ut5.F2(r5, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r0 = r3.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
        L63:
            return
        L64:
            if (r1 != 0) goto L84
            r1 = r4
        L67:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L82
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L73
            java.lang.Object r4 = r1.getTag()
        L73:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L63
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L63
            goto L39
        L82:
            r1 = r4
            goto L73
        L84:
            android.view.ViewParent r1 = r1.getParent()
            goto L67
        L89:
            r1 = r4
        L8a:
            r0 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JHF.LIZ(android.app.Activity, android.view.MotionEvent, java.util.List):void");
    }
}
