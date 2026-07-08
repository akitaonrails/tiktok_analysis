package X;

import Y.ACListenerS112S0200000_8;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ou7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("one_minute_notice_popup_task")
public final class C634170Ou7 extends AbstractC20660115st<View> {
    public final Activity LL;
    public final C1257230ioz LLILLJJLI;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        int i;
        View viewFindViewById;
        C1257230ioz c1257230ioz = this.LLILLJJLI;
        if (c1257230ioz == null) {
            return null;
        }
        C20515215Pi c20515215Pi = c1257230ioz.LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.drawable.d06;
        c20515215Pi.LJFF(c419910GdJ);
        c20515215Pi.LIZ.LJIILJJIL = AFwS240S0000000_9.get$arr$(865);
        if (Keva.getRepo("keva_repo_landscape_component").getInt("x_clicked_count", 0) == 0) {
            i = 2131838780;
        } else {
            i = 2131838781;
        }
        Activity activity = this.LL;
        String string = activity.getString(2131829743);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(string);
        SpannableString spannableString = new SpannableString(activity.getString(i, C2188811AlT.LIZIZ(sbLIZ)));
        int iLJJJ = a0.LJJJ(spannableString, string, 0, false, 6);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan((int) 4294847573L), iLJJJ, string.length() + iLJJJ, 33);
        C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, string.length() + iLJJJ, 33);
        String string2 = activity.getString(2131838782);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJ = string2;
        c1057450dcl.LJFF = spannableString;
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
            viewFindViewById.setClickable(true);
            C786410Ut5.I7(new ACListenerS112S0200000_8(this, c20515215Pi, 20), viewFindViewById);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "personal_homepage");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("long_video_intro_show", c2344009Gk.LIZ);
        return c20514915Pf;
    }

    public C634170Ou7(C0TGX c0tgx, C19EG c19eg, C1257230ioz c1257230ioz) {
        super(c0tgx);
        this.LL = c19eg;
        this.LLILLJJLI = c1257230ioz;
    }
}
