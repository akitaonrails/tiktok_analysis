package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0TJL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJL {
    public final View LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 718));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 771));

    public final void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZJ);
        C20684815ws.LJIILLIIL("big_card_long_press", c2344009Gk.LIZ);
    }

    public C0TJL(View view, Context context, String str, AwS429S0200000_28 awS429S0200000_28) {
        this.LIZ = view;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = awS429S0200000_28;
    }
}
