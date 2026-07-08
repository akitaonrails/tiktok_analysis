package X;

import Y.ACListenerS154S0100000_19;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0isV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259410isV extends RecyclerView.ViewHolder {
    public final View LL;
    public final C19EG LLILLJJLI;

    public static void I5(String str) {
        C20684815ws.LJIJI("story_archive", new Pair("personal_homepage", "enter_from"), new Pair(str, "action_type"));
    }

    public C1259410isV(View view, C19EG c19eg) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c19eg;
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 209), view);
        C428150Gqb.LIZ(view, EnumC428940Grs.STRONG_MASK, 0.0f);
    }
}
