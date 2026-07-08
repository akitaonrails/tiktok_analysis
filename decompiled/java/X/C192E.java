package X;

import Y.AObserverS234S0100000_32;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.192E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C192E extends AnonymousClass1927 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final Scene LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1738600vLO LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C192E.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C192E.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C192E.class, "publishVisibilityRadioApi", "getPublishVisibilityRadioApi()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/PublishVisibilityRadioOptionApi;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJL = 8;
    }

    private final InterfaceC855150Xgf N5() {
        return (InterfaceC855150Xgf) this.LLJJJ.getValue(this, LLJJJJLIIL[0]);
    }

    private final InterfaceC905270ZfJ R5() {
        return (InterfaceC905270ZfJ) this.LLJJJJ.getValue(this, LLJJJJLIIL[2]);
    }

    public final InterfaceC857270Xk5 M5() {
        return (InterfaceC857270Xk5) this.LLJJJIL.getValue(this, LLJJJJLIIL[1]);
    }

    @Override // X.AnonymousClass1927
    public void P4() {
        this.LLIZ.LLILZLL = T4();
        this.LLIZ.LLILZIL = new InterfaceC192003109p() { // from class: X.192C
            @Override // X.InterfaceC192003109p
            public final void LIZIZ(List<? extends AbstractC191840103i> list) {
                C192E c192e = this.LIZ;
                c192e.i3(new AwS398S0200000_32((List) list, (List<? extends AbstractC191840103i>) c192e, (C192E) 20));
            }
        };
    }

    public final void S5() {
        i3(new AwS611S0100000_32(this, 129));
        t5().creativeModel.privacySettingModel.allowAIRemix = 2;
    }

    @Override // X.AnonymousClass1927
    public InterfaceC192004109q T4() {
        return new InterfaceC192004109q() { // from class: X.192H
            @Override // X.InterfaceC192004109q
            public final int LIZ() {
                return this.LIZ.t5().creativeModel.privacySettingModel.allowAIRemix;
            }

            @Override // X.InterfaceC192004109q
            public final VideoPublishEditModel LIZIZ() {
                return this.LIZ.t5();
            }

            @Override // X.InterfaceC192004109q
            public final void LIZJ(int i) {
                this.LIZ.t5().creativeModel.privacySettingModel.allowAIRemix = i;
            }
        };
    }

    public final void d6() {
        i3(new AwS611S0100000_32(this, 132));
    }

    private final int H5() {
        VideoPublishEditModel videoPublishEditModelT5 = t5();
        C298650BnD.LIZ();
        if (C857680Xkk.LIZIZ(videoPublishEditModelT5) || t5().creativeModel.privacySettingModel.isSubscribeOnly) {
            return 4;
        }
        return t5().isPrivate;
    }

    private final boolean U5() {
        InterfaceC857270Xk5 interfaceC857270Xk5M5 = M5();
        if (interfaceC857270Xk5M5 == null) {
            List<String> list = t5().geofencingSetting;
            if (list == null || list.isEmpty()) {
                return false;
            }
        } else if (interfaceC857270Xk5M5.h20().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass1927, X.C193N, X.C193O
    public void Q3() {
        InterfaceC905270ZfJ interfaceC905270ZfJR5;
        LiveState<Integer> liveStateJN2;
        C854860XgC c854860XgC = t5().creativeModel.transientPostPageModel;
        C10IZ.LJI(t5());
        c854860XgC.getClass();
        super.Q3();
        InterfaceC857270Xk5 interfaceC857270Xk5M5 = M5();
        if (interfaceC857270Xk5M5 != null) {
            interfaceC857270Xk5M5.lA2(new AObserverS234S0100000_32(this, 26));
        }
        InterfaceC855150Xgf interfaceC855150XgfN5 = N5();
        if (interfaceC855150XgfN5 != null && (liveStateJN2 = interfaceC855150XgfN5.JN2()) != null) {
            liveStateJN2.LJIIIZ(this, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 130));
        }
        if (N5() != null || (interfaceC905270ZfJR5 = R5()) == null) {
            return;
        }
        interfaceC905270ZfJR5.Zz0(n5(), new AwS611S0100000_32(this, 131));
    }

    public final boolean m6() {
        InterfaceC855150Xgf interfaceC855150XgfN5 = N5();
        return (interfaceC855150XgfN5 != null ? interfaceC855150XgfN5.hu0() : H5()) == 4 || U5();
    }

    @Override // X.AnonymousClass1927, X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJJJJIL;
    }

    public C192E(C1DRG c1drg, Scene scene, C109Y c109y, boolean z) {
        super(c1drg, c109y, z);
        this.LLJJIJIL = scene;
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC905270ZfJ.class, null);
        this.LLJJJJJIL = EnumC214771193h.ALLOW_AI_REMIX;
    }
}
