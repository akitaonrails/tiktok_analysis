package X;

import Y.ARunnableS116S0100000_16;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051900dTo {
    public final Dialog LIZ;
    public final ImageView LIZIZ;
    public final TextView LIZJ;
    public final View LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final BPEAHandler LJI = new BPEAHandler();
    public final ARunnableS116S0100000_16 LJII = new ARunnableS116S0100000_16(this, 235);

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        try {
            if (this.LIZ.isShowing()) {
                C786410Ut5.LIZIZ(this.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1051900dTo(Context context) {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        Dialog dialog = new Dialog(context, R.style.aey);
        this.LIZ = dialog;
        try {
            View viewSd = C786410Ut5.Sd(R.layout.e9u, layoutInflaterNe, null);
            this.LIZLLL = viewSd;
            this.LIZIZ = (ImageView) viewSd.findViewById(R.id.jxe);
            TextView textView = (TextView) viewSd.findViewById(R.id.text);
            this.LIZJ = textView;
            textView.setMaxWidth((int) ((((double) C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YoWZcri75MvLtFeUTAek0omf79ZV3CoATTXigQpM=", null)).getWidth()) * 0.68d) - 80.0d));
            dialog.setContentView(viewSd);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(C446980Hfs.LIZ(context, R.color.dr)));
            dialog.getWindow().addFlags(8);
            dialog.getWindow().addFlags(32);
            dialog.getWindow().addFlags(16);
            dialog.getWindow().setLayout(-2, -2);
            dialog.getWindow().setGravity(17);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ(int i, int i2, String str) {
        if (!this.LJ && i2 > 0) {
            boolean z = false;
            if (i > 0) {
                this.LIZIZ.setImageResource(i);
                C786410Ut5.LJZI(0, this.LIZIZ);
                z = true;
            } else {
                C786410Ut5.LJZI(8, this.LIZIZ);
            }
            if (!C2093608Ic.LJ(str)) {
                this.LIZJ.setText(str);
            } else if (!z) {
                return;
            }
            this.LJI.removeCallbacks(this.LJII);
            LIZ();
            try {
                this.LIZ.getWindow().setGravity(17);
                C786410Ut5.B4(this.LIZ);
                C786410Ut5.LJLIIL(i2, this.LJI, this.LJII);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
