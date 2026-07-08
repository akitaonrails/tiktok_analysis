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

/* JADX INFO: renamed from: X.10J5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10J5 extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final PrivacySettingsRestrictionItem LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public Boolean LLJILJILJ;
    public final Function0<C190Z> LLJILLL;
    public final C19224710Iz LLJJ;
    public final InterfaceC1738600vLO LLJJI;
    public final C10J3 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C10J5.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C10J5.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C10J5.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C10J5.class, "geoFencingOptionApi", "getGeoFencingOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/geofencing/GeoFencingOptionApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJIJIIJIL = 8;
    }

    public final void K4() {
        i3(AFwS271S0000000_28.get$arr$(220));
        d5().creativeModel.privacySettingModel.allowCreateSticker = 2;
    }

    public final boolean O4() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final C19EG T4() {
        return (C19EG) this.LLJ.getValue(this, LLJJIJI[1]);
    }

    public final InterfaceC857270Xk5 Z4() {
        return (InterfaceC857270Xk5) this.LLJILJIL.getValue(this, LLJJIJI[3]);
    }

    public final VideoPublishEditModel d5() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJIJI[0]);
    }

    public final InterfaceC855150Xgf k5() {
        return (InterfaceC855150Xgf) this.LLJIJIL.getValue(this, LLJJIJI[2]);
    }

    public final void n5() {
        i3(new AwS607S0100000_28(this, 146));
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = C0CHQ.LIZ().LJJIIZI().LJII(2);
        if (!d5().creativeModel.transientPostPageModel.LJIIZILJ) {
            c118300cf.element = 2;
        }
        i3(new AwS607S0100000_28(c118300cf, 147));
        d5().creativeModel.privacySettingModel.allowCreateSticker = c118300cf.element;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        d5().creativeModel.transientPostPageModel.LJIL = T2().LJII ? 1 : 2;
        d5().creativeModel.transientPostPageModel.LJIIZILJ = T2().LIZIZ;
        InterfaceC857270Xk5 interfaceC857270Xk5Z4 = Z4();
        if (interfaceC857270Xk5Z4 != null) {
            interfaceC857270Xk5Z4.lA2(new AObserverS230S0100000_28(this, 48));
        }
        k5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS607S0100000_28(this, 145));
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJI;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJIII;
    }

    public C19224710Iz P4() {
        return this.LLJJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILLL;
    }

    public C10J5(C1DRG c1drg, PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
        super(c1drg);
        this.LLIZ = privacySettingsRestrictionItem;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(371));
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC857270Xk5.class, null);
        this.LLJILLL = new AwS572S0100000_28(this, 546);
        this.LLJJ = new C19224710Iz(new AwS572S0100000_28(this, 545), null, new C19332510kF(this, 7), null, 10);
        this.LLJJI = EnumC214771193h.ALLOW_CREATE_STICKER;
        this.LLJJIII = C193C.LIZ;
    }
}
