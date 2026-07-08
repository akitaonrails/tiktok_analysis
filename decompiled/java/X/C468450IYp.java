package X;

import Y.AfS78S0101000_7;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C468450IYp extends AbstractC468490IYt {
    public final C16F5 LLILLL;
    public final /* synthetic */ C470650Icx LLILZ;

    public static final void P5(int i) {
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        String str = c467800IWc.LJIIIIZZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "foru")) {
            i--;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_no_more_show");
        c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJ()), "has_banner");
        c474500IjALIZ.LJJII(str, "tab_type");
        c474500IjALIZ.LJJII("end", "no_more_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "show_num");
        c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
        c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468450IYp(C470650Icx c470650Icx, View view) {
        super(view);
        this.LLILZ = c470650Icx;
        this.LLILLL = (C16F5) view.findViewById(R.id.zz_);
    }

    @Override // X.AbstractC468490IYt
    public final void I5(int i, Object obj) {
        P5(i);
        C11RK<Pair<Boolean, String>> c11rk = this.LLILZ.LLJJJ;
        if (c11rk != null) {
            N5(c11rk.LJJLJLI(new AfS78S0101000_7(this, i, 1)));
        }
        this.LLILLL.setText(2131842860);
    }
}
