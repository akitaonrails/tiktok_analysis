package X;

import Y.AObjectS240S0100000_5;
import android.os.Bundle;
import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ETW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETW extends AbstractC364960ESo<C0EQP, Unit> {
    public C389110FNl LLJJLIIIJLLLLLLLZ;
    public final C0ESS LLJL = C0ESS.SMALL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 689));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 692));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 691));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 694));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 688));

    @Override // X.AbstractC364960ESo
    public final Function1<C539960LFq, Unit> LLLLIL() {
        return new AwS584S0100000_5(this, 595);
    }

    @Override // X.AbstractC364960ESo
    public final Function1<C1DRF, Unit> LLLLILI() {
        return new AwS584S0100000_5(this, 596);
    }

    @Override // X.AbstractC364960ESo
    public final C0EZ4 LLLLJ() {
        return new C0EZ4(null, null, new AwS549S0100000_5(this, 693), null, 11);
    }

    public final void LLLLLJIL() {
        C389110FNl c389110FNl = this.LLJJLIIIJLLLLLLLZ;
        if (c389110FNl != null) {
            c389110FNl.onBackPressed();
        }
        InterfaceC360800ECo interfaceC360800ECo = (InterfaceC360800ECo) this.LLJLIL.getValue();
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 26);
        }
        C0E5S c0e5s = (C0E5S) this.LLJLLIL.getValue();
        if (c0e5s != null) {
            c0e5s.yV(AFwS234S0000000_5.get$arr$(301));
        }
        LLLLIIIILLL();
    }

    @Override // X.AbstractC364960ESo
    public final C0ESS LLLLJI() {
        return this.LLJL;
    }

    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        LiveEvent<String> liveEventOX0;
        LiveEvent<C375830EoP<Unit>> liveEventV2;
        LiveEvent<Unit> liveEventVD1;
        LiveEvent<Unit> liveEventGs1;
        LiveEvent<Unit> liveEventL72;
        super.onActivityCreated(bundle);
        C0ETQ c0etq = (C0ETQ) this.LLJLILLLLZIIL.getValue();
        if (c0etq != null) {
            c0etq.fx1(new AwS549S0100000_5(this, 690));
        }
        C0ETQ c0etq2 = (C0ETQ) this.LLJLILLLLZIIL.getValue();
        if (c0etq2 != null && (liveEventL72 = c0etq2.L72()) != null) {
            liveEventL72.LIZ(this, new AObjectS240S0100000_5(this, 95));
        }
        C0ETQ c0etq3 = (C0ETQ) this.LLJLILLLLZIIL.getValue();
        if (c0etq3 != null && (liveEventGs1 = c0etq3.Gs1()) != null) {
            liveEventGs1.LIZ(this, new AObjectS240S0100000_5(this, 96));
        }
        InterfaceC357900E1k interfaceC357900E1k = (InterfaceC357900E1k) this.LLJLLL.getValue();
        if (interfaceC357900E1k != null && (liveEventVD1 = interfaceC357900E1k.VD1()) != null) {
            liveEventVD1.LIZ(this, new AObjectS240S0100000_5(this, 97));
        }
        C389110FNl c389110FNl = this.LLJJLIIIJLLLLLLLZ;
        if (c389110FNl != null && (liveEventV2 = c389110FNl.v2()) != null) {
            liveEventV2.LIZ(this, new AObjectS240S0100000_5(this, 98));
        }
        C389110FNl c389110FNl2 = this.LLJJLIIIJLLLLLLLZ;
        if (c389110FNl2 != null && (liveEventOX0 = c389110FNl2.oX0()) != null) {
            liveEventOX0.LIZ(this, new AObjectS240S0100000_5(this, 99));
        }
    }
}
