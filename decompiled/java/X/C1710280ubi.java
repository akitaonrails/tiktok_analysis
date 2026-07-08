package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS63S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0ubi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710280ubi extends LinearLayout {
    public boolean LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final TuxTextView getTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final View getRedDot() {
        return (View) this.LLILLL.getValue();
    }

    public C1710280ubi(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dw9, this, true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1448));
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1447));
    }

    public final void LIZ(String str, ViewOnClickListenerC1709160uZu viewOnClickListenerC1709160uZu) {
        getTitle().setText(str);
        if (this.LL) {
            C786410Ut5.LJLLLLLL(8, getRedDot());
        } else {
            C786410Ut5.LJLLLLLL(0, getRedDot());
        }
        C786410Ut5.I7(new AkS63S0200000_26(this, viewOnClickListenerC1709160uZu, 5), this);
    }
}
