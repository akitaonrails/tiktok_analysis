package X;

import Y.ACListenerS60S0400000_28;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914960zvq implements InterfaceC1915180zwC {
    public final ViewGroup LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC1915180zwC
    public final void LIZ() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void LIZJ(EnumC1876780ywG enumC1876780ywG) {
    }

    @Override // X.InterfaceC1915180zwC
    public final void LJ() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void onDismiss() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void onRejected() {
    }

    public C1914960zvq(String str, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1915180zwC
    public final boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
        return C1914950zvp.LIZ(enumC1876780ywG, collectConsentParam);
    }

    @Override // X.InterfaceC1915180zwC
    public final void LIZLLL(Context context, CollectConsentParam collectConsentParam, C1914970zvr c1914970zvr, AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, C1914980zvs c1914980zvs) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bdd, this.LIZ, true);
        C786410Ut5.LJLZ(0, this.LIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("style", "bottom");
        c2344009Gk.LJIIIIZZ("business", "au_u16_visibility_options");
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZIZ);
        C20684815ws.LJIILLIIL("pns_popup_shown", c2344009Gk.LIZ);
        c1914970zvr.invoke();
        C786410Ut5.I7(new ACListenerS60S0400000_28(this, collectConsentParam, awS429S0200000_28, c1914980zvs, 3), viewTd.findViewById(R.id.fy0));
        C786410Ut5.I7(new ACListenerS60S0400000_28(this, collectConsentParam, awS429S0200000_28, c1914980zvs, 4), viewTd.findViewById(R.id.view_more));
    }
}
