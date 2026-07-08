package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431400Gvq extends LinkMovementMethod {
    public static final C431400Gvq LIZ = new C431400Gvq();
    public static AbstractC2678011w LIZIZ;
    public static InterfaceC431410Gvr LIZJ;

    public static AbstractC2678011w LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        if (layout != null) {
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
            AbstractC2678011w[] abstractC2678011wArr = (AbstractC2678011w[]) spannable.getSpans(iU3, iU3, AbstractC2678011w.class);
            if (abstractC2678011wArr.length != 0) {
                C431400Gvq c431400Gvq = LIZ;
                AbstractC2678011w abstractC2678011w = abstractC2678011wArr[0];
                c431400Gvq.getClass();
                if (iU3 >= spannable.getSpanStart(abstractC2678011w) && iU3 <= spannable.getSpanEnd(abstractC2678011w)) {
                    return abstractC2678011wArr[0];
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r8, android.text.Spannable r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            X.0Gvr r4 = X.C431400Gvq.LIZJ
            r6 = 0
            r5 = 0
            if (r4 == 0) goto L56
            float r0 = r10.getX()
            int r3 = (int) r0
            int r0 = r8.getTotalPaddingLeft()
            int r3 = r3 - r0
            int r0 = r8.getScrollX()
            int r3 = r3 + r0
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r8.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r8.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r2 = r8.getLayout()
            if (r2 == 0) goto L96
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r3
            int r3 = X.C786410Ut5.U3(r2, r1, r0)
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r9.getSpans(r3, r3, r0)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            int r0 = r2.length
            if (r0 == 0) goto L96
            X.0Gvq r0 = X.C431400Gvq.LIZ
            r1 = r2[r5]
            r0.getClass()
            int r0 = r9.getSpanStart(r1)
            if (r3 < r0) goto L96
            int r0 = r9.getSpanEnd(r1)
            if (r3 > r0) goto L96
            r0 = r2[r5]
        L53:
            r4.LIZ(r0, r10, r8)
        L56:
            int r1 = r10.getAction()
            if (r1 == 0) goto L82
            r0 = 2
            if (r1 == r0) goto L72
            X.011w r0 = X.C431400Gvq.LIZIZ
            if (r0 == 0) goto L68
            X.0Gvq r0 = X.C431400Gvq.LIZ
            super.onTouchEvent(r8, r9, r10)
        L68:
            X.C431400Gvq.LIZIZ = r6
            android.text.Selection.removeSelection(r9)
        L6d:
            boolean r0 = super.onTouchEvent(r8, r9, r10)
            return r0
        L72:
            X.011w r1 = LIZ(r8, r9, r10)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L98
            X.011w r0 = X.C431400Gvq.LIZIZ
            if (r0 == 0) goto L6d
            if (r1 == r0) goto L6d
            X.C431400Gvq.LIZIZ = r6
            android.text.Selection.removeSelection(r9)
            goto L6d
        L82:
            X.011w r0 = LIZ(r8, r9, r10)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La1
            X.C431400Gvq.LIZIZ = r0
            if (r0 == 0) goto L6d
            int r1 = r9.getSpanStart(r0)
            int r0 = r9.getSpanEnd(r0)
            android.text.Selection.setSelection(r9, r1, r0)
            goto L6d
        L96:
            r0 = r6
            goto L53
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            return r5
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C431400Gvq.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
