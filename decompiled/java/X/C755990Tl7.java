package X;

import Y.ACListenerS116S0200000_12;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("live_wallat_webapp_profile_banner")
public final class C755990Tl7 extends AbstractC20660815t0 {
    public final ViewGroup LL;
    public long LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C755990Tl7(ViewGroup viewGroup, C0TGX c0tgx) {
        super(c0tgx);
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        View viewFindViewById;
        C20515215Pi c20515215Pi = new C1257230ioz(this.LL, true).LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_coin;
        c20515215Pi.LJFF(c419910GdJ);
        String strLJIJI = C497740JfY.LJIJI(2131853115);
        String str = "";
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        String strLJIJI2 = C497740JfY.LJIJI(2131853114);
        if (strLJIJI2 != null) {
            str = strLJIJI2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJI);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        int iIntValue = 0;
        C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(C497740JfY.LIZJ(R.attr.a1q)), 0, str.length(), 33);
        c20515215Pi.LIZ.LJFF = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableStringBuilder2);
        c20515215Pi.LIZ.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.a63);
        c20515215Pi.LIZ.LJIILJJIL = new AwS591S0100000_12(this, 631);
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        this.LLILLJJLI = System.currentTimeMillis();
        if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, c20515215Pi, 40), viewFindViewById);
        }
        C0JT6<Integer> c0jt6 = InterfaceC1106030et7.W5;
        Integer numLIZ = c0jt6.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        }
        c0jt6.LIZJ(Integer.valueOf(iIntValue + 1));
        LJIIL("show", null);
    }

    public final void LJIIL(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_profile_webrechage_banner");
        c474500IjALIZ.LJJII(str, "action_type");
        Integer numLIZ = InterfaceC1106030et7.W5.LIZ();
        if (numLIZ == null) {
            numLIZ = 0;
        }
        c474500IjALIZ.LJJII(numLIZ, "show_times");
        if (!Intrinsics.LJFF(str, "show")) {
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI), "duration");
        }
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "button_name");
        }
        c474500IjALIZ.LIZ();
    }
}
