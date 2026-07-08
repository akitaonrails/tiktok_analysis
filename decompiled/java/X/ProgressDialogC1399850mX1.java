package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1399850mX1 extends ProgressDialog {
    public boolean LL;
    public CharSequence LLILLJJLI;
    public Drawable LLILLL;
    public int LLILZ;
    public final Activity LLILZIL;

    public ProgressDialogC1399850mX1(Context context) {
        super(context, 3);
        this.LLILZIL = C1388190mED.LIZ(context);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewFindViewById;
        super.onCreate(bundle);
        setContentView(R.layout.d7e);
        this.LL = true;
        setMessage(this.LLILLJJLI);
        setIndeterminate(false);
        setProgress(this.LLILZ);
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            if (this.LL && (viewFindViewById = findViewById(R.id.tqy)) != null) {
                viewFindViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, getContext().getResources().getDrawable(R.drawable.aqd)}));
            }
            this.LLILLL = drawable;
        }
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LL) {
            C19PN c19pn = (C19PN) findViewById(R.id.lno);
            if (c19pn != null) {
                c19pn.setIndeterminate(z);
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
        super.setMessage(charSequence);
        if (this.LL && (textView = (TextView) findViewById(R.id.o8v)) != null) {
            textView.setText(charSequence);
        }
        this.LLILLJJLI = charSequence;
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.LL) {
            TextView textView = (TextView) findViewById(R.id.s8j);
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("%");
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            C19PN c19pn = (C19PN) findViewById(R.id.lno);
            if (c19pn != null) {
                c19pn.setProgress(i);
            }
        }
        this.LLILZ = i;
    }
}
