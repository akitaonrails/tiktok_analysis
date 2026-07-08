package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418910n1l extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public boolean LLIZ;

    public C1418910n1l(Context context) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bmm, this, true);
        this.LL = viewTd;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.bmy);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        if (viewTd != null) {
            viewFindViewById2 = viewTd.findViewById(R.id.e1g);
        } else {
            viewFindViewById2 = null;
        }
        this.LLILLL = viewFindViewById2;
        if (viewTd != null) {
            viewFindViewById3 = viewTd.findViewById(R.id.u03);
        } else {
            viewFindViewById3 = null;
        }
        this.LLILZ = viewFindViewById3;
        if (viewTd != null) {
            viewFindViewById4 = viewTd.findViewById(R.id.tzj);
        } else {
            viewFindViewById4 = null;
        }
        this.LLILZIL = viewFindViewById4;
        this.LLILZLL = viewTd != null ? viewTd.findViewById(R.id.dsz) : null;
    }

    public final void setBack(boolean z) {
        this.LLIZ = z;
    }
}
