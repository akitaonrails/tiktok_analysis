package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS112S0100000_12;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1399830mWz extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LLJ = 0;
    public final EnumC1399900mX6 LL;
    public ViewGroup LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public C1235870iGX LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public InterfaceC1399840mX0 LLIZLLLIL;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void LIZ() {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(42);
        }
        ImageView imageView = this.LLILLL;
        FrameLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 8388661;
        }
        ImageView imageView2 = this.LLILLL;
        if (imageView2 != null) {
            C786410Ut5.c6(imageView2, layoutParams);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d3i);
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.tqy);
        this.LLILLL = (ImageView) findViewById(R.id.dav);
        this.LLILZ = (TuxTextView) findViewById(R.id.s9w);
        this.LLILZIL = (C1235870iGX) findViewById(R.id.w28);
        int i = C1399890mX5.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ViewGroup viewGroup = this.LLILLJJLI;
                        if (viewGroup != null) {
                            HandlerHook.viewPostDelay(viewGroup, new ARunnableS112S0100000_12(this, 480), 10000L);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ViewGroup viewGroup2 = this.LLILLJJLI;
                    if (viewGroup2 != null) {
                        HandlerHook.viewPostDelay(viewGroup2, new ARunnableS112S0100000_12(this, 479), Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
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
            C786410Ut5.Q7(imageView3, new ACListenerS155S0100000_21(this, 271));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.LLILZLL) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setText(charSequence);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, i);
            }
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LLIZ) {
            return;
        }
        if (this.LLILZLL) {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getResources().getString(R.string.txr));
            sb.append(i);
            sb.append("%");
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setText(sb);
            }
        }
        this.LLIZ = i;
    }

    public ProgressDialogC1399830mWz(Context context, int i, EnumC1399900mX6 enumC1399900mX6) {
        super(context, i);
        this.LL = enumC1399900mX6;
    }
}
