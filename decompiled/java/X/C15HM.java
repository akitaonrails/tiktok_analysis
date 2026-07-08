package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.15HM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HM extends LinearLayout {
    public final ArrayList<C15IP> LL;
    public C15HQ LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public InterfaceC20494515Hj<C15HP> LLILZIL;

    public ArrayList<C15IP> getMusicItemViews() {
        return this.LL;
    }

    public C15HM(Context context, int i, boolean z) {
        super(context);
        this.LL = new ArrayList<>(3);
        this.LLILLL = i;
        this.LLILZ = z;
        setOrientation(1);
        int i2 = 0;
        do {
            C15IP c15ip = new C15IP(this.LLILLL, C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.cx5, null, false), C1402480mbG.LIZ());
            ViewGroup viewGroup = c15ip.LLJJI;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, 0, 0);
            c15ip.LLLL = this.LLILZ;
            this.LL.add(c15ip);
            C15HQ c15hq = this.LLILLJJLI;
            InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLILZIL;
            c15ip.LLLI = c15hq;
            c15ip.LLLIL = interfaceC20494515Hj;
            addView(c15ip.itemView);
            i2++;
        } while (i2 < 3);
    }
}
