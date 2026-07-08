package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS108S0100000_8;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class ProgressDialogC1399790mWv extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LLJ = 0;
    public final EnumC1399820mWy LL;
    public ViewGroup LLILLJJLI;
    public ImageView LLILLL;
    public TextView LLILZ;
    public C1235870iGX LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public InterfaceC1399800mWw LLIZLLLIL;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void LIZ(CharSequence charSequence) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        TextView textView = this.LLILZ;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.LLILZ;
        if (textView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView2, i);
        }
        C1235870iGX c1235870iGX = this.LLILZIL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c1235870iGX != null) {
            layoutParams2 = c1235870iGX.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            int i2 = 1;
            if (charSequence == null || charSequence.length() == 0) {
                i2 = 17;
            }
            if (layoutParams.gravity != i2) {
                layoutParams.gravity = i2;
                C1235870iGX c1235870iGX2 = this.LLILZIL;
                if (c1235870iGX2 != null) {
                    C786410Ut5.D6(c1235870iGX2, layoutParams);
                }
            }
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ur);
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.tqy);
        this.LLILLL = (ImageView) findViewById(R.id.dav);
        this.LLILZ = (TextView) findViewById(R.id.s9w);
        this.LLILZIL = (C1235870iGX) findViewById(R.id.w28);
        int i = C1399810mWx.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ViewGroup viewGroup = this.LLILLJJLI;
                    if (viewGroup != null) {
                        HandlerHook.viewPostDelay(viewGroup, new ARunnableS108S0100000_8(this, 146), Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ImageView imageView = this.LLILLL;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
            }
        } else {
            ImageView imageView2 = this.LLILLL;
            if (imageView2 != null) {
                C786410Ut5.LJZI(8, imageView2);
            }
        }
        this.LLILZLL = true;
        setProgress(this.LLIZ);
        C1235870iGX c1235870iGX = this.LLILZIL;
        if (c1235870iGX != null) {
            C1209530ha3 c1209530ha3 = new C1209530ha3(getContext());
            c1209530ha3.LJ();
            c1235870iGX.setBuilder(c1209530ha3);
        }
        C1235870iGX c1235870iGX2 = this.LLILZIL;
        if (c1235870iGX2 != null) {
            c1235870iGX2.LJIIIIZZ();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.LLILLL;
        if (imageView3 != null) {
            C786410Ut5.Q7(imageView3, new ACListenerS155S0100000_21(this, 268));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.LLILZLL) {
            LIZ(charSequence);
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LLIZ) {
            return;
        }
        if (this.LLILZLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getContext().getResources().getString(R.string.txr));
            sbLIZ.append(i);
            sbLIZ.append('%');
            LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLIZ = i;
    }

    public ProgressDialogC1399790mWv(Context context, EnumC1399820mWy enumC1399820mWy) {
        super(context, R.style.f943aa3);
        this.LL = enumC1399820mWy;
    }
}
