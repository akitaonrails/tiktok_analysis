package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650690t3b extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final EnumC1651770t5L LLJILJIL;
    public final EnumC1651310t4b LLJILJILJ;
    public final AwS569S0100000_25 LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650690t3b.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650690t3b.class, "lowLightHintApiComponent", "getLowLightHintApiComponent()Lcom/ss/android/ugc/aweme/videoquality/LowLightHintApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650690t3b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C19EG LJIL() {
        return (C19EG) this.LLILZLL.getValue(this, LLJJ[0]);
    }

    public final InterfaceC1650230t2r LJJ() {
        return (InterfaceC1650230t2r) this.LLIZLLLIL.getValue(this, LLJJ[2]);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651310t4b LJII() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJILJIL;
    }

    public C1650690t3b(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1650700t3c.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(c1drg, 804));
        this.LLJILJIL = EnumC1651770t5L.FLASH;
        this.LLJILJILJ = EnumC1651310t4b.FIXED;
        this.LLJILLL = new AwS569S0100000_25(this, 803);
    }

    @Override // X.AbstractC1651430t4n
    public final void LJIJI(C1654400t9a c1654400t9a) {
        if (LJJ().n() && C2253291DHj.LJIIIZ(LJIL())) {
            C19EG c19egLJIL = LJIL();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131830666);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19egLJIL, 1070, creativeToastBuilder);
        }
    }

    public final String LJIJJLI(int i) {
        if (i == R.raw.icon_camera_flash_fill) {
            return LJIL().getString(2131824459);
        }
        if (i == R.raw.icon_color_flash) {
            return LJIL().getString(2131824459);
        }
        if (i == R.raw.icon_color_flash_slash) {
            return LJIL().getString(2131824458);
        }
        if (i == R.raw.icon_camera_flash_slash_fill) {
            return LJIL().getString(2131824458);
        }
        return null;
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZLLL(C1654400t9a c1654400t9a, Object obj) {
        LJIJI(c1654400t9a);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        int i;
        int i2;
        super.LIZ(c1654400t9a, i3Var);
        int nextFlashMode = LJJ().getNextFlashMode();
        boolean zUe = LJJ().Ue();
        InterfaceC1650700t3c interfaceC1650700t3c = (InterfaceC1650700t3c) this.LLIZ.getValue(this, LLJJ[1]);
        if (interfaceC1650700t3c != null && !this.LLJI && interfaceC1650700t3c.Cx1() && nextFlashMode == 2 && zUe) {
            C201955140j.LIZIZ("record_low_light_hint", "user turn on flash after toast.");
            this.LLJI = true;
            if (interfaceC1650700t3c.Ed1()) {
                C201955140j.LIZIZ("record_low_light_hint", "Mark complete for oneShot case.");
                interfaceC1650700t3c.oO0();
            }
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = i3Var.LL;
        C1653260t7k.LIZ("click_flash");
        boolean z = false;
        if (zUe) {
            InterfaceC1650620t3U interfaceC1650620t3U = (InterfaceC1650620t3U) this.LLJ.getValue();
            if (interfaceC1650620t3U != null) {
                nextFlashMode = interfaceC1650620t3U.getNextFlashMode();
                interfaceC1650620t3U.qh(nextFlashMode);
                if (nextFlashMode == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                c118300cf.element = C577500Mku.LIZJ(i2);
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "camera_use_ae_mode_external", true, false)) {
                InterfaceC1650230t2r interfaceC1650230t2rLJJ = LJJ();
                if (nextFlashMode == 0) {
                    i = 0;
                } else {
                    i = 5;
                }
                interfaceC1650230t2rLJJ.qh(i);
            }
        } else {
            LJJ().qh(nextFlashMode);
            InterfaceC1650620t3U interfaceC1650620t3U2 = (InterfaceC1650620t3U) this.LLJ.getValue();
            if (interfaceC1650620t3U2 != null) {
                interfaceC1650620t3U2.nR(nextFlashMode);
            }
            c118300cf.element = C577500Mku.LIZJ(nextFlashMode);
        }
        LJIIJJI(new AwS391S0200000_25(c118300cf, this, 203));
        C1650550t3N c1650550t3N = C1650550t3N.LIZ;
        ShortVideoContext shortVideoContextLJIIL = LJIIL();
        if (!this.LLJIJIL && this.LLJI) {
            z = true;
        }
        c1650550t3N.getClass();
        C1650550t3N.LIZ(shortVideoContextLJIIL, z, nextFlashMode, zUe);
        if (this.LLJI) {
            this.LLJIJIL = true;
        }
        C0T6J.LIZ(c1654400t9a.LIZ, AFwS214S0000000_25.get$arr$(419));
    }
}
