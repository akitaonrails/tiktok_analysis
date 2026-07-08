package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS112S0100000_12;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1399780mWu extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final String LL;
    public final Function0<Unit> LLILLJJLI;
    public final long LLILLL;
    public View LLILZ;
    public ImageView LLILZIL;
    public TextView LLILZLL;
    public C1235870iGX LLIZ;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        FrameLayout.LayoutParams layoutParams;
        super.onCreate(bundle);
        setContentView(R.layout.ur);
        this.LLILZ = findViewById(R.id.tqy);
        this.LLILZIL = (ImageView) findViewById(R.id.dav);
        this.LLILZLL = (TextView) findViewById(R.id.s9w);
        this.LLIZ = (C1235870iGX) findViewById(R.id.w28);
        String str = this.LL;
        int i2 = 1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.LLILZLL;
        View view = null;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLIL(textView, i);
        C1235870iGX c1235870iGX = this.LLIZ;
        if (c1235870iGX == null) {
            c1235870iGX = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c1235870iGX.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            if (z) {
                i2 = 17;
            }
            if (layoutParams.gravity != i2) {
                layoutParams.gravity = i2;
                C1235870iGX c1235870iGX2 = this.LLIZ;
                if (c1235870iGX2 == null) {
                    c1235870iGX2 = null;
                }
                C786410Ut5.D6(c1235870iGX2, layoutParams);
            }
        }
        setCanceledOnTouchOutside(false);
        C1235870iGX c1235870iGX3 = this.LLIZ;
        if (c1235870iGX3 == null) {
            c1235870iGX3 = null;
        }
        C1209530ha3 c1209530ha3 = new C1209530ha3(getContext());
        c1209530ha3.LJ();
        c1235870iGX3.setBuilder(c1209530ha3);
        C1235870iGX c1235870iGX4 = this.LLIZ;
        if (c1235870iGX4 == null) {
            c1235870iGX4 = null;
        }
        c1235870iGX4.LJIIIIZZ();
        ImageView imageView = this.LLILZIL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS155S0100000_21(this, 106));
        View view2 = this.LLILZ;
        if (view2 != null) {
            view = view2;
        }
        HandlerHook.viewPostDelay(view, new ARunnableS112S0100000_12(this, 227), this.LLILLL);
    }

    public ProgressDialogC1399780mWu(Context context, String str, Function0<Unit> function0, long j) {
        super(context, R.style.f943aa3);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = j;
    }
}
