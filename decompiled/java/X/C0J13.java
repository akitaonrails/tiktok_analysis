package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0J13, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J13 extends C0J1A {
    public static final /* synthetic */ int LLILZIL = 0;
    public final LinearLayout LLILLJJLI;
    public final C1390410mHn LLILLL;
    public final View LLILZ;

    public final void I5(EnumC485010J0h enumC485010J0h) {
        int i;
        if (enumC485010J0h == null) {
            i = -1;
        } else {
            i = C485030J0j.LIZ[enumC485010J0h.ordinal()];
        }
        if (i != -1) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    C786410Ut5.LJZL(0, this.LLILLJJLI);
                    this.LLILLL.LIZLLL();
                    C786410Ut5.LLLZZIL(this.LLILLL, 8);
                    C786410Ut5.LJLLLLLL(0, this.LLILZ);
                    return;
                }
            } else {
                C786410Ut5.LJZL(0, this.LLILLJJLI);
                C786410Ut5.LJLLLLLL(8, this.LLILZ);
                C786410Ut5.LLLZZIL(this.LLILLL, 0);
                this.LLILLL.LIZJ();
                return;
            }
        }
        C786410Ut5.LJZL(8, this.LLILLJJLI);
        this.LLILLL.LIZLLL();
        C786410Ut5.LLLZZIL(this.LLILLL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
    }

    public C0J13(LinearLayout linearLayout, C1390410mHn c1390410mHn) {
        super(linearLayout);
        this.LLILLJJLI = linearLayout;
        this.LLILLL = c1390410mHn;
        this.LLILZ = linearLayout.findViewById(R.id.pyt);
    }
}
