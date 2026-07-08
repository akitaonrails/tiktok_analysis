package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogC1899840zXS extends DialogC19728412Gs {
    public static final int LLILLL = (int) C12ES.LIZJ(20.0f, ((AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)).LJIIJJI());
    public final int LL;
    public final int LLILLJJLI;

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(this.LL, this.LLILLJJLI);
    }

    public DialogC1899840zXS(Context context, boolean z, boolean z2, boolean z3) {
        int iLJIIJ;
        super(context, R.style.aee);
        requestWindowFeature(1);
        int iLJIIIIZZ = -1;
        if (z3) {
            iLJIIJ = -2;
        } else if (z) {
            iLJIIJ = -1;
        } else {
            iLJIIJ = C12ES.LJIIJ(getContext()) - (LLILLL * 2);
        }
        this.LL = iLJIIJ;
        if (!z) {
            if (z2) {
                iLJIIIIZZ = -2;
            } else {
                iLJIIIIZZ = C12ES.LJIIIIZZ(getContext()) - (LLILLL * 4);
            }
        }
        this.LLILLJJLI = iLJIIIIZZ;
    }
}
