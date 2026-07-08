package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: renamed from: X.19Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnKeyListenerC21554419Xa implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final C21545419To LL;
    public final C21545419To LLILLJJLI;
    public final TimeModel LLILLL;
    public boolean LLILZ;

    public final void LIZ(int i) {
        boolean z;
        C21545419To c21545419To = this.LLILLJJLI;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c21545419To.setChecked(z);
        C21545419To c21545419To2 = this.LL;
        if (i != 10) {
            z2 = false;
        }
        c21545419To2.setChecked(z2);
        this.LLILLL.LLILZ = i;
    }

    public ViewOnKeyListenerC21554419Xa(C21545419To c21545419To, C21545419To c21545419To2, TimeModel timeModel) {
        this.LL = c21545419To;
        this.LLILLJJLI = c21545419To2;
        this.LLILLL = timeModel;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            LIZ(12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.view.View r7, int r8, android.view.KeyEvent r9) {
        /*
            r6 = this;
            boolean r0 = r6.LLILZ
            r4 = 0
            if (r0 == 0) goto L6
            return r4
        L6:
            r3 = 1
            r6.LLILZ = r3
            android.widget.EditText r7 = (android.widget.EditText) r7
            com.google.android.material.timepicker.TimeModel r0 = r6.LLILLL
            int r0 = r0.LLILZ
            r5 = 12
            if (r0 != r5) goto L2f
            r0 = 67
            if (r8 != r0) goto L53
            int r0 = r9.getAction()
            if (r0 != 0) goto L53
            android.text.Editable r0 = r7.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L53
            r0 = 10
            r6.LIZ(r0)
        L2c:
            r6.LLILZ = r4
            return r3
        L2f:
            android.text.Editable r2 = r7.getText()
            if (r2 == 0) goto L53
            r0 = 7
            if (r8 < r0) goto L53
            r0 = 16
            if (r8 > r0) goto L53
            int r0 = r9.getAction()
            if (r0 != r3) goto L53
            int r0 = r7.getSelectionStart()
            r1 = 2
            if (r0 != r1) goto L53
            int r0 = r2.length()
            if (r0 != r1) goto L53
            r6.LIZ(r5)
            goto L2c
        L53:
            r3 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnKeyListenerC21554419Xa.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }
}
