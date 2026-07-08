package X;

import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19223910Ir extends AbstractC19223010Ii<C10JJ> implements C10JJ {
    public static final int LLJJJ = 8;
    public final Function0<C190Z> LLJJIJI;
    public final InterfaceC1738600vLO LLJJIJIIJIL;
    public final C19224710Iz LLJJIJIL;

    @Override // X.C193N, X.C193O
    public void Q3() {
        Integer numLIZ;
        C19222610Ie c19222610Ie = new C19222610Ie("comment");
        c19222610Ie.LIZIZ = true;
        c19222610Ie.LIZJ = T4().commentSetting == 0;
        c19222610Ie.LJ = 0;
        c19222610Ie.LJFF = C1383760m74.LIZIZ.LJIIIIZZ() ? 2131827585 : 2131858160;
        c19222610Ie.LJIIJ = new View.OnClickListener() { // from class: X.10Iu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        c19222610Ie.LJIIJJI = (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("comment")) == null || numLIZ.intValue() != 3) ? false : true;
        t5(c19222610Ie);
    }

    @Override // X.C193N
    public C10J3 H4() {
        return (C1428470nHB.LJJZZI(T4()) && C19224110It.LIZ()) ? AnonymousClass1938.LIZ : C193C.LIZ;
    }

    @Override // X.AbstractC19223010Ii
    public void d5() {
        HashMap<String, String> mapK4 = K4();
        mapK4.put("to_status", "disabled");
        C20684815ws.LJIILLIIL("disable_comment", mapK4);
        super.d5();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJIJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJJIJI;
    }

    public C19224710Iz v5() {
        return this.LLJJIJIL;
    }

    public C19223910Ir(C1DRG c1drg) {
        super(c1drg);
        this.LLJJIJI = new AwS572S0100000_28(this, 549);
        this.LLJJIJIIJIL = EnumC214771193h.COMMENT;
        this.LLJJIJIL = new C19224710Iz(new C19224010Is(this), null, new C19332510kF(this, 8), null, 10);
    }
}
