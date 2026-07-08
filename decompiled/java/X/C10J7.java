package X;

import Y.AObserverS230S0100000_28;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import uxk.a;

/* JADX INFO: renamed from: X.10J7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10J7 extends AbstractC19223010Ii<C10JK> implements C10JK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final Function0<C190Z> LLJJIJIL;
    public final InterfaceC1738600vLO LLJJJ;
    public final C19224710Iz LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10J7.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10J7.class, "permissionApi", "getPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJJJIL = 8;
    }

    private final InterfaceC855150Xgf C5() {
        return (InterfaceC855150Xgf) this.LLJJIJIIJIL.getValue(this, LLJJJJ[1]);
    }

    public final void E5() {
        if (!((Boolean) H2(new C2217381BqS() { // from class: X.10J9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LIZIZ);
            }
        }).LIZJ()).booleanValue()) {
            if (C857680Xkk.LIZIZ(T4())) {
                C19EG c19egP4 = P4();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder.messageRes(2131849241);
                C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder);
                return;
            }
            return;
        }
        C0CHQ.LIZ().LJJIIZI().LJJIIJZLJL();
        boolean z = !((Boolean) H2(new C2217381BqS() { // from class: X.10JA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LJII);
            }
        }).LIZJ()).booleanValue();
        i3(new AwS40S0010000_28(z, 16));
        T4().reactDuetSetting = !z ? 1 : 0;
        a aVar = a.LIZ;
        int i = T4().reactDuetSetting;
        aVar.getClass();
        a.LJIIIIZZ(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", T4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("to_status", z ? "on" : "off");
        c0lab.LJ("shoot_way", K4().get("shoot_way"));
        c0lab.LIZ(T4().isDuet() ? T4().getDuetVideoDuration() : 0, "duet_video_duration");
        c0lab.LIZ(T4().getDuetFromDuetButton(), "is_from_duet_button");
        c0lab.LJ("duet_layout", T4().isDuet() ? T4().getDuetLayout() : "");
        c0lab.LIZ(T4().getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_react_duet_control", c0lab.LIZ);
    }

    public final void H5() {
        boolean z = this.LLJILLL;
        this.LLJJ = z;
        if (!z && !C1443970ngB.LIZJ(T4().getVideoLength()) && !C1428470nHB.LJJZZI(T4())) {
            i3(AFwS271S0000000_28.get$arr$(226));
        }
        i3(new AwS607S0100000_28(this, 151));
        T4().reactDuetSetting = !T2().LJII ? 1 : 0;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        Integer numLIZ;
        C19222610Ie c19222610Ie = new C19222610Ie("duet");
        c19222610Ie.LIZIZ = C1462470oA1.LIZJ(T4());
        boolean z = T4().reactDuetSetting == 0;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default duet switch: ");
        sbLIZ.append(z ? "on" : "off");
        sbLIZ.append(", reason: init publish page");
        c1437510nVlLJJLIIIJ.LIZ("publish_setting", C2188811AlT.LIZIZ(sbLIZ));
        c19222610Ie.LIZJ = z;
        boolean zLJJZZI = C1428470nHB.LJJZZI(T4());
        c19222610Ie.LJIIIIZZ = zLJJZZI;
        if (zLJJZZI) {
            c19222610Ie.LJIIIZ = 2131844963;
        }
        c19222610Ie.LIZLLL = T4().getVideoLength();
        c19222610Ie.LJ = 2131835507;
        c19222610Ie.LJFF = 2131858162;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        c19222610Ie.LJIIJJI = (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("duet")) == null || numLIZ.intValue() != 3) ? false : true;
        c19222610Ie.LJIIL = C857680Xkk.LIZIZ(T4());
        t5(c19222610Ie);
        InterfaceC857270Xk5 interfaceC857270Xk5X5 = x5();
        if (interfaceC857270Xk5X5 != null) {
            interfaceC857270Xk5X5.lA2(new AObserverS230S0100000_28(this, 50));
        }
        C5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS607S0100000_28(this, 150));
    }

    @Override // X.AbstractC19223010Ii
    public void d5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", T4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("to_status", "disabled");
        c0lab.LJ("shoot_way", K4().get("shoot_way"));
        c0lab.LIZ(T4().isDuet() ? T4().getDuetVideoDuration() : 0, "duet_video_duration");
        c0lab.LIZ(T4().getDuetFromDuetButton(), "is_from_duet_button");
        c0lab.LJ("duet_layout", T4().isDuet() ? T4().getDuetLayout() : "");
        c0lab.LIZ(T4().getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_react_duet_control", c0lab.LIZ);
        super.d5();
    }

    public final InterfaceC857270Xk5 x5() {
        return (InterfaceC857270Xk5) this.LLJJIJI.getValue(this, LLJJJJ[0]);
    }

    @Override // X.C193N
    public C10J3 H4() {
        return (C1428470nHB.LJJZZI(T4()) && C19224110It.LIZ()) ? AnonymousClass1938.LIZ : C193C.LIZ;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJJIJIL;
    }

    public C19224710Iz v5() {
        return this.LLJJJIL;
    }

    public C10J7(C1DRG c1drg) {
        super(c1drg);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJJIJIL = AFwS217S0000000_28.get$arr$(373);
        this.LLJJJ = EnumC214771193h.DUET;
        this.LLJJJIL = new C19224710Iz(new C10J8(this), new AwS572S0100000_28(this, 550), null, null, 12);
    }

    public final void D5(boolean z) {
        this.LLJJ = z;
        i3(AFwS271S0000000_28.get$arr$(225));
        T4().reactDuetSetting = 1;
    }
}
