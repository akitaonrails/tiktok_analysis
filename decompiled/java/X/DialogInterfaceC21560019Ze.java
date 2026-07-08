package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceC21560019Ze extends C19GU implements DialogInterface {
    public final AlertController LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[PHI: r14
      0x0053: PHI (r14v1 android.view.View) = (r14v0 android.view.View), (r14v6 android.view.View) binds: [B:6:0x003f, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c0  */
    @Override // X.C19GU, X.C19EK, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceC21560019Ze.onCreate(android.os.Bundle):void");
    }

    @Override // X.C19GU, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.LLILZLL;
        alertController.LJ = charSequence;
        TextView textView = alertController.LJJII;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public DialogInterfaceC21560019Ze(Context context, int i) {
        super(context, LJJZ(i, context));
        this.LLILZLL = new AlertController(getContext(), this, getWindow());
    }

    public static int LJJZ(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.b9g, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C21578619ce c21578619ce = this.LLILZLL.LJIL;
        if (c21578619ce != null && c21578619ce.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C21578619ce c21578619ce = this.LLILZLL.LJIL;
        if (c21578619ce != null && c21578619ce.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
