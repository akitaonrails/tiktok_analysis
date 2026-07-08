package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19470711Fp extends TuxTextView {
    public final boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    public C19470711Fp(Context context) {
        super(context, null, 0);
        this.LLJJJJ = true;
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJJL = C960203pA.LIZ(R.attr.a04, getContext());
        int i = C19733712It.LIZIZ;
        this.LLJJJJLIIL = i;
        int iLIZJ = C19733712It.LIZJ(i);
        if (this.LLJJLIIIJLLLLLLLZ) {
            setTextColor(this.LLJJJJJIL ? this.LLJJJJLIIL : iLIZJ);
        }
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.LLJL) {
                if (this.LLJJJJ) {
                    setTextColor(this.LLJJL);
                    return;
                }
                return;
            }
            setTextColor(this.LLJJJJLIIL);
            return;
        }
        setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
    }

    public final void setOldPanelStyle(boolean z) {
        int i = C19733712It.LIZIZ;
        this.LLJJJJLIIL = i;
        int iLIZJ = C19733712It.LIZJ(i);
        if (this.LLJJJJJIL) {
            iLIZJ = this.LLJJJJLIIL;
        }
        setTextColor(iLIZJ);
    }

    public final void setSelectTextColor(int i) {
        this.LLJJJJLIIL = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
    }

    public final void setStatusTextColor(int i) {
        this.LLJJL = i;
        boolean z = this.LLJL;
        this.LLJL = z;
        if (z) {
            if (this.LLJJJJ) {
                setTextColor(i);
                return;
            }
            return;
        }
        setTextColor(this.LLJJJJLIIL);
    }
}
