package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogC1239100iLk extends DialogC19728412Gs {
    public static final int LLILLL;
    public int LL;
    public int LLILLJJLI;

    public void LJJLIIIJLLLLLLLZ() {
    }

    static {
        C844470XAv.LIZ.getClass();
        LLILLL = (int) C12ES.LIZJ(20.0f, C844470XAv.LIZ());
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(this.LL, this.LLILLJJLI);
    }

    public DialogC1239100iLk(Context context) {
        super(context, R.style.ae0);
        this.LL = C12ES.LJIIJ(getContext());
        this.LLILLJJLI = C12ES.LJIIIIZZ(getContext());
        requestWindowFeature(1);
        LJJLIIIJLLLLLLLZ();
    }

    public DialogC1239100iLk(Context context, int i) {
        this(context, i, false, true, false);
    }

    public DialogC1239100iLk(Context context, int i, boolean z, boolean z2, boolean z3) {
        int iLJIIJ;
        super(context, i);
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
        LJJLIIIJLLLLLLLZ();
    }
}
