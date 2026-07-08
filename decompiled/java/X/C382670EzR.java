package X;

import com.bytedance.als.h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;

/* JADX INFO: renamed from: X.0EzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382670EzR extends C0ETZ<InterfaceC379270Etx, C382730EzX, C382680EzS, C382690EzT> implements InterfaceC379270Etx {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C376260Ep6 LLJJI;
    public final C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final Function0<C382730EzX> LLJJJIL;
    public final Function0<C382680EzS> LLJJJJ;
    public final Function0<C382690EzT> LLJJJJJIL;
    public final h0<C382700EzU> LLJJJJLIIL;
    public EnumC382750EzZ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C382670EzR.class, "modelSelectionApi", "getModelSelectionApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/modelselect/EPAIGCModelSelectApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C382670EzR.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJL = 8;
    }

    public final InterfaceC379250Etv H4() {
        return (InterfaceC379250Etv) this.LLJJIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    @Override // X.InterfaceC379270Etx
    public void Jc2() {
        i3(AFwS234S0000000_5.get$arr$(152));
    }

    public final C379120Eti K4() {
        return (C379120Eti) this.LLJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final InterfaceC379160Etm O4() {
        return (InterfaceC379160Etm) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC379250Etv P4() {
        return (InterfaceC379250Etv) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC379270Etx
    public EnumC378720Et4 N7() {
        return T2().LIZJ == EnumC382750EzZ.VIDEO ? EnumC378720Et4.TEXT_TO_VIDEO_CREATION : EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
    }

    @Override // ge.i
    public Function0<C382730EzX> E3() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379270Etx
    public C385670FAf<C382700EzU> Rx0() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382680EzS> o2() {
        return this.LLJJJJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382690EzT> w2() {
        return this.LLJJJJJIL;
    }

    private final void T4(boolean z) {
        if (z) {
            C378370EsV c378370EsV = C378370EsV.LIZ;
            AbstractC359300E6u abstractC359300E6u = K4().LLJILJIL;
            c378370EsV.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_source", String.valueOf(abstractC359300E6u));
            C20684815ws.LJIILLIIL("text_to_video_panel_show", c2344009Gk.LIZ);
            return;
        }
        C378370EsV c378370EsV2 = C378370EsV.LIZ;
        AbstractC359300E6u abstractC359300E6u2 = K4().LLJILJIL;
        c378370EsV2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_source", String.valueOf(abstractC359300E6u2));
        C20684815ws.LJIILLIIL("text_to_image_panel_show", c2344009Gk2.LIZ);
    }

    @Override // X.InterfaceC379270Etx
    public void Fm2(boolean z) {
        i3(new AwS20S0010000_5(z, 15));
    }

    @Override // X.InterfaceC379270Etx
    public void Vc1(boolean z) {
        i3(new AwS20S0010000_5(z, 14));
    }

    @Override // X.InterfaceC379270Etx
    public void bE(C378970EtT c378970EtT) {
        EnumC382750EzZ enumC382750EzZ;
        if (c378970EtT.LIZJ.LIZ) {
            enumC382750EzZ = EnumC382750EzZ.VIDEO;
        } else {
            enumC382750EzZ = EnumC382750EzZ.IMAGE;
        }
        i3(new AwS371S0200000_5(c378970EtT, enumC382750EzZ, 46));
        if (K4().LLJJIII == C0E9W.AI_CREATE && this.LLJJL != enumC382750EzZ) {
            this.LLJJL = enumC382750EzZ;
            T4(c378970EtT.LIZJ.LIZ);
        }
    }

    @Override // X.InterfaceC379270Etx
    public void zU0(String str) {
        i3(new AwS56S1000000_5(str, 9));
    }

    public C382670EzR(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        super(c376260Ep6, c1drg);
        this.LLJJI = c376260Ep6;
        this.LLJJIII = c1drg;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJIJI = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5((InterfaceC379610EuV) this, 289));
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5((InterfaceC379610EuV) this, 290));
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379250Etv.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
        this.LLJJJIL = AFwS191S0000000_5.get$arr$(100);
        this.LLJJJJ = new AwS549S0100000_5(this, 287);
        this.LLJJJJJIL = new AwS549S0100000_5(this, 288);
        this.LLJJJJLIIL = new h0<>(null);
    }
}
