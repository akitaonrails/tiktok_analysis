package X;

import Y.AObserverS230S0100000_28;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.audio.copyright.StitchCopyrightProcessObserverV2;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10JB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10JB extends AbstractC19223010Ii<C10JI> implements C10JI {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public StitchCopyrightProcessObserverV2 LLJJJ;
    public final Function0<C190Z> LLJJJIL;
    public final C19224710Iz LLJJJJ;
    public final MutableLiveData<Boolean> LLJJJJJIL;
    public final InterfaceC1738600vLO LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10JB.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10JB.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C10JB.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/VideoPublishContainerScene;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final InterfaceC855150Xgf C5() {
        return (InterfaceC855150Xgf) this.LLJJIJIIJIL.getValue(this, LLJJL[1]);
    }

    private final VideoPublishContainerScene D5() {
        return (VideoPublishContainerScene) this.LLJJIJIL.getValue(this, LLJJL[2]);
    }

    private final void ap2() {
        Integer numLIZ;
        C19222610Ie c19222610Ie = new C19222610Ie("stitch");
        c19222610Ie.LIZIZ = C1462470oA1.LIZ(T4());
        c19222610Ie.LIZJ = T4().stitchSetting == 0;
        boolean zLJJZZI = C1428470nHB.LJJZZI(T4());
        c19222610Ie.LJIIIIZZ = zLJJZZI;
        if (zLJJZZI) {
            c19222610Ie.LJIIIZ = 2131844964;
        }
        Boolean value = getCommerceActive().getValue();
        c19222610Ie.LJII = value != null ? value.booleanValue() : false;
        c19222610Ie.LIZLLL = T4().getVideoLength();
        c19222610Ie.LJ = 2131835515;
        c19222610Ie.LJFF = 2131858163;
        c19222610Ie.LJI = 2131848931;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        c19222610Ie.LJIIJJI = (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("stitch")) == null || numLIZ.intValue() != 3) ? false : true;
        c19222610Ie.LJIIL = C857680Xkk.LIZIZ(T4());
        t5(c19222610Ie);
    }

    public final void H5() {
        boolean z = this.LLJILLL;
        this.LLJJ = z;
        if (!z && !C1443970ngB.LIZJ(T4().getVideoLength()) && !C1428470nHB.LJJZZI(T4())) {
            i3(AFwS271S0000000_28.get$arr$(222));
        }
        i3(new AwS607S0100000_28(this, 149));
        T4().stitchSetting = !T2().LJII ? 1 : 0;
    }

    public final InterfaceC857270Xk5 x5() {
        return (InterfaceC857270Xk5) this.LLJJIJI.getValue(this, LLJJL[0]);
    }

    @Override // X.C193N
    public C10J3 H4() {
        return (C1428470nHB.LJJZZI(T4()) && C19224110It.LIZ()) ? AnonymousClass1938.LIZ : C193C.LIZ;
    }

    public final void LIZIZ() {
        int stitchVideoDuration;
        Object objValueOf;
        boolean zLIZIZ = C857680Xkk.LIZIZ(T4());
        if (!((Boolean) H2(new C2217381BqS() { // from class: X.10JE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LIZIZ);
            }
        }).LIZJ()).booleanValue() && zLIZIZ) {
            C19EG c19egP4 = P4();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131849244);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder);
            return;
        }
        C0CHQ.LIZ().LJJIIZI().LJJJJJL();
        boolean z = !((Boolean) H2(new C2217381BqS() { // from class: X.10JF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LJII);
            }
        }).LIZJ()).booleanValue();
        i3(new AwS40S0010000_28(z, 14));
        InterfaceC1444620nhE interfaceC1444620nhELJJIIZI = C0CHQ.LIZ().LJJIIZI();
        int i = !z ? 1 : 0;
        interfaceC1444620nhELJJIIZI.LJIJJLI(i);
        T4().stitchSetting = i;
        HashMap<String, String> mapK4 = K4();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", T4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("to_status", z ? "on" : "off");
        c0lab.LJ("content_type", mapK4.get("content_type"));
        c0lab.LJ("content_source", mapK4.get("content_source"));
        c0lab.LJ("shoot_way", mapK4.get("shoot_way"));
        if (T4().isStitchMode()) {
            StitchParams stitchParams = T4().getStitchParams();
            if (stitchParams == null) {
                objValueOf = null;
                c0lab.LIZLLL(objValueOf, "stitch_video_duration");
                c0lab.LIZ(T4().getVideoLength(), "creation_duration");
                C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
            }
            stitchVideoDuration = stitchParams.getStitchVideoDuration();
        } else {
            stitchVideoDuration = 0;
        }
        objValueOf = Integer.valueOf(stitchVideoDuration);
        c0lab.LIZLLL(objValueOf, "stitch_video_duration");
        c0lab.LIZ(T4().getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
    }

    public final void M5() {
        ap2();
        Boolean value = getCommerceActive().getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        boolean zBooleanValue2 = ((Boolean) H2(new C2217381BqS() { // from class: X.10JG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LJII);
            }
        }).LIZJ()).booleanValue();
        T4().stitchSetting = (zBooleanValue || !zBooleanValue2) ? 1 : 0;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        ap2();
        InterfaceC857270Xk5 interfaceC857270Xk5X5 = x5();
        if (interfaceC857270Xk5X5 != null) {
            interfaceC857270Xk5X5.lA2(new AObserverS230S0100000_28(this, 49));
        }
        C5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS607S0100000_28(this, 148));
        D5().registerOnAddAnchorListener(this.LLJJJ.LLILZLL);
    }

    @Override // X.AbstractC19223010Ii
    public void d5() {
        int stitchVideoDuration;
        Integer numValueOf;
        HashMap<String, String> mapK4 = K4();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", T4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("to_status", "disabled");
        c0lab.LJ("content_type", mapK4.get("content_type"));
        c0lab.LJ("content_source", mapK4.get("content_source"));
        c0lab.LJ("shoot_way", mapK4.get("shoot_way"));
        if (T4().isStitchMode()) {
            StitchParams stitchParams = T4().getStitchParams();
            if (stitchParams == null) {
                numValueOf = null;
                c0lab.LIZLLL(numValueOf, "stitch_video_duration");
                c0lab.LIZ(T4().getVideoLength(), "creation_duration");
                C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
                super.d5();
            }
            stitchVideoDuration = stitchParams.getStitchVideoDuration();
        } else {
            stitchVideoDuration = 0;
        }
        numValueOf = Integer.valueOf(stitchVideoDuration);
        c0lab.LIZLLL(numValueOf, "stitch_video_duration");
        c0lab.LIZ(T4().getVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("click_stitch_control", c0lab.LIZ);
        super.d5();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJJJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C10JI
    public MutableLiveData<Boolean> getCommerceActive() {
        return this.LLJJJJJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJJJIL;
    }

    public C19224710Iz v5() {
        return this.LLJJJJ;
    }

    public C10JB(C1DRG c1drg) {
        super(c1drg);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishContainerScene.class, null);
        this.LLJJJ = new StitchCopyrightProcessObserverV2(D5(), this, new C10JC(D5()), new C10JH(this));
        this.LLJJJIL = AFwS217S0000000_28.get$arr$(372);
        this.LLJJJJ = new C19224710Iz(new C10JD(this), new AwS572S0100000_28(this, 547), null, null, 12);
        this.LLJJJJJIL = new MutableLiveData<>(Boolean.FALSE);
        this.LLJJJJLIIL = EnumC214771193h.STITCH;
    }

    public final void E5(boolean z) {
        this.LLJJ = z;
        i3(AFwS271S0000000_28.get$arr$(221));
        T4().stitchSetting = 1;
    }
}
