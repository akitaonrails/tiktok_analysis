package X;

import Y.ACListenerS116S0200000_12;
import Y.ARunnableS17S1100000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TWI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("promote_web_creation_popup")
public final class C0TWI extends AbstractC20660815t0 {
    public final ViewGroup LL;
    public C20515215Pi LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public final void LJIIL(Context context) {
        C0TWH.LIZ().storeBoolean("key_has_open_h5_page", true);
        C0TWJ.LIZIZ.LIZIZ(context);
        C20515215Pi c20515215Pi = this.LLILLJJLI;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("web_creation_promote_banner_click", c2344009Gk.LIZ);
    }

    public C0TWI(ViewGroup viewGroup, C0TGX c0tgx) {
        super(c0tgx);
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        String string;
        String strLIZIZ;
        View viewFindViewById;
        C823050WQl.LIZJ().submit(new ARunnableS17S1100000_12(C0TWK.LIZIZ, 9));
        if (c688120Qyw.LIZIZ() != null) {
            C20515215Pi c20515215Pi = new C1257230ioz(this.LL, true).LIZ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_computer_cursor;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c20515215Pi.LJFF(c419910GdJ);
            String string2 = c688120Qyw.LIZ.getString(2131858442);
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJ = string2;
            c1057450dcl.LJIILL = true;
            Context context = c688120Qyw.LIZ;
            if (C0TWH.LIZ().getInt("key_cancel_profile_gudie_time", 0) == 0) {
                string = context.getString(2131858441);
            } else {
                string = context.getString(2131858440);
            }
            String strLJJI = u.LJJI(context.getString(2131858439), ' ', (char) 160, false);
            try {
                strLIZIZ = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{strLJJI}, 1));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(strLJJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            int iLJJJ = a0.LJJJ(strLIZIZ, strLJJI, 0, false, 6);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            if (iLJJJ >= 0) {
                C786410Ut5.p2(spannableString, new C785780Us4(context, this, 4), 0, spannableString.length(), 34);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C446980Hfs.LIZ(context, R.color.ct)), iLJJJ, strLJJI.length() + iLJJJ, 17);
                C786410Ut5.p2(spannableString, new C444920HcY(63, false), iLJJJ, strLJJI.length() + iLJJJ, 17);
            }
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJFF = spannableString;
            c1057450dcl2.LJIIJ = 0;
            c20515215Pi.LIZ.LJIILJJIL = new AwS591S0100000_12(c20656615sK, 784);
            this.LLILLJJLI = c20515215Pi;
            c20515215Pi.LJ();
            C20514915Pf c20514915Pf = c20515215Pi.LJ;
            if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
                viewFindViewById.setClickable(true);
                C786410Ut5.I7(new ACListenerS116S0200000_12(this, c688120Qyw, 59), viewFindViewById);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            C20684815ws.LJIILLIIL("web_creation_promote_banner_show", c2344009Gk.LIZ);
        }
    }
}
