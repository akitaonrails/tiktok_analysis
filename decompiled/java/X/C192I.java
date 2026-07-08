package X;

import Y.AObserverS234S0100000_32;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.192I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C192I extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final Scene LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final Function0<C190Z> LLJILJIL;
    public final C19224710Iz LLJILJILJ;
    public final InterfaceC1738600vLO LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C192I.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C192I.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C192I.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C192I.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJI = 8;
    }

    public final C19EG O4() {
        return (C19EG) this.LLJ.getValue(this, LLJJ[1]);
    }

    public final InterfaceC857270Xk5 P4() {
        return (InterfaceC857270Xk5) this.LLJIJIL.getValue(this, LLJJ[3]);
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJ[0]);
    }

    public final InterfaceC855150Xgf Z4() {
        return (InterfaceC855150Xgf) this.LLJI.getValue(this, LLJJ[2]);
    }

    public final void d5() {
        i3(AFwS278S0000000_32.get$arr$(85));
        T4().creativeModel.privacySettingModel.contentReusePermission = 2;
    }

    public final void k5() {
        i3(new AwS611S0100000_32(this, 128));
    }

    @Override // X.C193N
    public C10J3 H4() {
        return (C1428470nHB.LJJZZI(T4()) && C19224110It.LIZ()) ? AnonymousClass1938.LIZ : C193C.LIZ;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        C854860XgC c854860XgC = T4().creativeModel.transientPostPageModel;
        T2().getClass();
        c854860XgC.getClass();
        InterfaceC857270Xk5 interfaceC857270Xk5P4 = P4();
        if (interfaceC857270Xk5P4 != null) {
            interfaceC857270Xk5P4.lA2(new AObserverS234S0100000_32(this, 25));
        }
        Z4().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 127));
        ComplianceServiceProvider.LJIJJ().LIZ(O4(), C20622515mp.LJIILL(O4(), this.LLIZ), "publish");
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILLL;
    }

    public C19224710Iz K4() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILJIL;
    }

    public C192I(C1DRG c1drg, Scene scene) {
        super(c1drg);
        this.LLIZ = scene;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJILJIL = new AwS576S0100000_32(this, 295);
        this.LLJILJILJ = new C19224710Iz(new AwS576S0100000_32(this, 294), null, new C19LY(this, 4), null, 10);
        this.LLJILLL = EnumC214771193h.CONTENT_REUSE;
    }
}
