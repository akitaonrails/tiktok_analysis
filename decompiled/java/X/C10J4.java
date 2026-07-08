package X;

import Y.AObserverS230S0100000_28;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10J4, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10J4 extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final PrivacySettingsRestrictionItem LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final Function0<C190Z> LLJILJILJ;
    public final C19224710Iz LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10J4.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10J4.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C10J4.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C10J4.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJIJI = 8;
    }

    public final boolean K4() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final C19EG P4() {
        return (C19EG) this.LLJ.getValue(this, LLJJIII[1]);
    }

    public final InterfaceC857270Xk5 T4() {
        return (InterfaceC857270Xk5) this.LLJILJIL.getValue(this, LLJJIII[3]);
    }

    public final VideoPublishEditModel Z4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJIII[0]);
    }

    public final InterfaceC855150Xgf d5() {
        return (InterfaceC855150Xgf) this.LLJIJIL.getValue(this, LLJJIII[2]);
    }

    public final void k5() {
        i3(AFwS271S0000000_28.get$arr$(217));
        Z4().creativeModel.privacySettingModel.allowShareToStory = 2;
    }

    public final void n5() {
        i3(new AwS607S0100000_28(this, 142));
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        Z4().creativeModel.transientPostPageModel.LJIJ = T2().LIZIZ;
        InterfaceC857270Xk5 interfaceC857270Xk5T4 = T4();
        if (interfaceC857270Xk5T4 != null) {
            interfaceC857270Xk5T4.lA2(new AObserverS230S0100000_28(this, 46));
        }
        d5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS607S0100000_28(this, 141));
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJI;
    }

    public C19224710Iz O4() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILJILJ;
    }

    public C10J4(C1DRG c1drg, PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
        super(c1drg);
        this.LLIZ = privacySettingsRestrictionItem;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(370));
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJILJILJ = new AwS572S0100000_28(this, 540);
        this.LLJILLL = new C19224710Iz(new AwS572S0100000_28(this, 539), null, new C19332510kF(this, 5), null, 10);
        this.LLJJ = EnumC214771193h.SHARE_TO_STORY;
        this.LLJJI = C193C.LIZ;
    }
}
