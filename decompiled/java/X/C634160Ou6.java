package X;

import Y.ACListenerS111S0200000_7;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ou6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("add_yours_profile_guide")
public final class C634160Ou6 extends AbstractC20660115st<View> {
    public final ViewStub LL;
    public final int LLILLJJLI;
    public final Activity LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    public final int LJIIL() {
        return ((Number) this.LLILZIL.getValue()).intValue();
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        View viewFindViewById;
        ViewStub viewStub = this.LL;
        if (viewStub == null) {
            return null;
        }
        C786410Ut5.LJLLLL(viewStub);
        View viewFindViewById2 = this.LLILLL.findViewById(this.LLILLJJLI);
        String string = c688120Qyw.LIZ.getString(2131825069);
        SpannableString spannableString = new SpannableString(c688120Qyw.LIZ.getString(2131825070, string));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, viewFindViewById2.getContext()));
        StyleSpan styleSpan = new StyleSpan(1);
        int iLJJJ = a0.LJJJ(spannableString, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        C786410Ut5.p2(spannableString, styleSpan, iLJJJ, length, 17);
        C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, length, 33);
        C20515215Pi c20515215Pi = new C1257230ioz((ViewGroup) this.LLILLL.findViewById(this.LLILLJJLI), true).LIZ;
        c20515215Pi.LJI(new AwS580S0100000_1(this, 433));
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 340);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJIILJJIL = awS586S0100000_7;
        c1057450dcl.LJFF = spannableString;
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
            viewFindViewById.setClickable(true);
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, c20515215Pi, 24), viewFindViewById);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("add_yours_personal_notice_show", c2344009Gk.LIZ);
        Keva.getRepo("add_yours_profile_guide").storeLong("last_show_time", System.currentTimeMillis());
        return viewFindViewById2;
    }

    public C634160Ou6(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg) {
        super(c0tgx);
        this.LL = viewStub;
        this.LLILLJJLI = R.id.s0t;
        this.LLILLL = c19eg;
        this.LLILZ = 505;
        this.LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(283));
        this.LLILZLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(284));
    }
}
