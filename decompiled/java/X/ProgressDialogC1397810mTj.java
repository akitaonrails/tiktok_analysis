package X;

import Y.ARunnableS121S0100000_21;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1397810mTj extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public Drawable LLILZ;
    public String LLILZIL;
    public final BPEAHandler LLILZLL;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 108);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS121S0100000_21.run();
        } else {
            C786410Ut5.LJJZZIII(this.LLILZLL, aRunnableS121S0100000_21);
        }
    }

    public ProgressDialogC1397810mTj(Context context) {
        super(context, 3);
        this.LL = true;
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
    }

    public static /* synthetic */ void LIZ(ProgressDialogC1397810mTj progressDialogC1397810mTj) {
        progressDialogC1397810mTj.getClass();
        C1C7U.LIZ("StyleProgressDialog@bd83.dismiss$1L");
        C19PP c19pp = (C19PP) progressDialogC1397810mTj.findViewById(R.id.lno);
        if (c19pp != null) {
            c19pp.LIZIZ();
        }
        super.dismiss();
        C1C7U.LIZIZ("StyleProgressDialog@bd83.dismiss$1L");
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewFindViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.fve);
        this.LLILLJJLI = true;
        setMessage(this.LLILLL);
        setIndeterminate(false);
        String str = this.LLILZIL;
        if (this.LLILLJJLI && (textView = (TextView) findViewById(R.id.xym)) != null && str != null && str.length() == 0) {
            textView.setText(str);
            C786410Ut5.LLIL(textView, 0);
        }
        this.LLILZIL = str;
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            if (this.LLILLJJLI && (viewFindViewById = findViewById(R.id.tqy)) != null) {
                viewFindViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C800330VaR.LIZIZ(getContext(), R.drawable.dh2)}));
            }
            this.LLILZ = drawable;
        }
        setOnKeyListener(this);
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LLILLJJLI) {
            C19PP c19pp = (C19PP) findViewById(R.id.lno);
            if (c19pp != null) {
                c19pp.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.s8j);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView, i);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        super.setMessage(charSequence);
        if (this.LLILLJJLI && (textView = (TextView) findViewById(R.id.o8v)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView, i);
        }
        this.LLILLL = charSequence;
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.s8j);
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("%");
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C19PP c19pp = (C19PP) findViewById(R.id.lno);
        if (c19pp != null) {
            c19pp.setProgress(i);
        }
    }
}
