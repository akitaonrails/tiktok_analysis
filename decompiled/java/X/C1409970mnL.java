package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409970mnL extends AbstractC1664490tPr<C1408540ml2, C1408170mkR> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1064));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1067));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1062));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1065));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1063));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1068));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1066));
    public C0P0T LLJLIL;

    public final void LLLLLJIL() {
        InterfaceC1409980mnM interfaceC1409980mnM = LLLLILI().LIZ.LIZJ;
        InterfaceC21297218Wc interfaceC21297218Wc = LLLLILI().LIZ.LIZLLL;
        interfaceC1409980mnM.LIZJ(interfaceC21297218Wc, (ViewGroup) this.LLJJJIL.getValue());
        interfaceC1409980mnM.LIZ(interfaceC21297218Wc, (ViewGroup) this.LLJJJJ.getValue());
        interfaceC1409980mnM.LIZIZ((ViewGroup) this.LLJJJJJIL.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLLJIL();
        ((TextView) this.LLJJLIIIJLLLLLLLZ.getValue()).setText(C21291518Tx.LJ(EnumC21291418Tw.QUOTA_TITLE_BAR_TEXT, new Object[0]));
        C786410Ut5.I7(new AkS90S0100000_22(this, 29), (View) this.LLJL.getValue());
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ml6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1408540ml2) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 847));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ml3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1408540ml2) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 848));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0ml4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1408540ml2) obj).LJ;
            }
        }, new AwS598S0100000_19(this, 849));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0ml5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1408540ml2) obj).LJFF;
            }
        }, new AwS601S0100000_22(this, 865));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg_, viewGroup, false);
    }
}
