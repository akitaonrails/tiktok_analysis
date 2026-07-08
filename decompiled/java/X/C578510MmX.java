package X;

import Y.AObjectS303S0200000_8;
import Y.AObserverS173S0200000_8;
import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0MmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578510MmX extends AbstractC2255721DQs<InterfaceC576630MjV> implements InterfaceC576630MjV, InterfaceC379610EuV {
    public static final C578580Mme LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final ShortVideoContext LLILZ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC578600Mmg.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576780Mjk.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C539980LFs.class, null);
    public final InterfaceC576630MjV LLJILJILJ = this;
    public final C11NJ LLJILLL = new C11NJ();
    public final C11RK<List<LayoutItemMedia>> LLJJ;
    public final C11NZ<List<LayoutItemMedia>> LLJJI;
    public final C11RK<Integer> LLJJIII;
    public final C11NZ<Integer> LLJJIJI;
    public final C11RK<Unit> LLJJIJIIJIL;
    public final C11NZ<Unit> LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public VESize LLJJJJLIIL;
    public VESize LLJJL;
    public VESize LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public EnumC1778840wOI LLJLIL;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Mme] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578510MmX.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C578510MmX.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C578510MmX.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C578510MmX.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C578510MmX.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C578510MmX.class, "countDownComponent", "getCountDownComponent()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownApi;", 0), new C2217381BqS(C578510MmX.class, "chooseMusicComponent", "getChooseMusicComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new C2217381BqS(C578510MmX.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0), new C2217381BqS(C578510MmX.class, "layoutWorkspaceComponent", "getLayoutWorkspaceComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutWorkspaceApiComponent;", 0), new C2217381BqS(C578510MmX.class, "layoutNLEComponent", "getLayoutNLEComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutNLEComponent;", 0)};
        LLJLILLLLZIIL = new Object() { // from class: X.0Mme
        };
        LLJLLIL = 8;
    }

    private final C539980LFs G2() {
        return (C539980LFs) this.LLJILJIL.getValue(this, LLJLL[9]);
    }

    private final C0L5I W2() {
        return (C0L5I) this.LLJJJJ.getValue();
    }

    private final C579220Mng m3() {
        return (C579220Mng) this.LLJJJ.getValue();
    }

    private final void q3() {
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 719);
        Z1().Wv().LIZ(this, new AObjectS303S0200000_8(this, awS552S0100000_8, 4));
        Z1().Vk().LIZ(this, new AObjectS303S0200000_8(this, awS552S0100000_8, 5));
        T2().r6().observe(this, new AObserverS212S0100000_8(awS552S0100000_8, 70));
    }

    private final void v3() {
        T2().r6().observe(this, new AObserverS173S0200000_8(this, new C259800zU(), 5));
    }

    public final C578620Mmi H2() {
        return (C578620Mmi) this.LLJJJIL.getValue();
    }

    public final InterfaceC576770Mjj T2() {
        return (InterfaceC576770Mjj) this.LLJI.getValue(this, LLJLL[7]);
    }

    public final InterfaceC1628590sTx Z1() {
        return (InterfaceC1628590sTx) this.LLJ.getValue(this, LLJLL[6]);
    }

    public final InterfaceC576780Mjk c3() {
        return (InterfaceC576780Mjk) this.LLJIJIL.getValue(this, LLJLL[8]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLIZ.getValue(this, LLJLL[4]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLILZLL.getValue(this, LLJLL[3]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILLJJLI.getValue(this, LLJLL[0]);
    }

    public final q getStickerApi() {
        return (q) this.LLILLL.getValue(this, LLJLL[1]);
    }

    public final InterfaceC1630630sXF i3() {
        return (InterfaceC1630630sXF) this.LLILZIL.getValue(this, LLJLL[2]);
    }

    public final InterfaceC578600Mmg o2() {
        return (InterfaceC578600Mmg) this.LLIZLLLIL.getValue(this, LLJLL[5]);
    }

    @Override // X.InterfaceC576630MjV
    public void qe() {
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", "turnOffLayout, restore settings");
        o4(this.LLJJJJLIIL);
        this.LLJJJJLIIL = null;
        VESize vESize = this.LLJJL;
        if (vESize != null) {
            F4(vESize.width, vESize.height, this.LLJL);
            this.LLJJL = null;
        }
        z4(this.LLJJLIIIJLLLLLLLZ, this.LLJLIL);
        this.LLJJLIIIJLLLLLLLZ = null;
        C579220Mng c579220MngM3 = m3();
        c579220MngM3.LIZIZ.nL1(null);
        c579220MngM3.LIZIZ.hF2(true, true);
        ((InterfaceC578600Mmg) c579220MngM3.LJFF.getValue()).uO0(c579220MngM3);
        c579220MngM3.LJIJI = false;
        C578620Mmi c578620MmiH2 = H2();
        int iLJIIIIZZ = c578620MmiH2.LIZIZ().u92().LIZIZ().LJIIIIZZ();
        if (iLJIIIIZZ >= 0) {
            c578620MmiH2.LIZIZ().u92().LIZIZ().LIZIZ.LJIIIIZZ(iLJIIIIZZ, 1, 1, 0);
        }
        c578620MmiH2.LJIILLIIL = false;
        W1(true);
    }

    public final C578560Mmc w2() {
        return (C578560Mmc) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC576630MjV
    public void Oa1() {
        VESize vESizeN2 = getCameraApiComponent().St2().getCameraController().N2();
        this.LLJJJJLIIL = new VESize(Math.min(vESizeN2.width, vESizeN2.height), Math.max(vESizeN2.width, vESizeN2.height));
        VESize videoRes = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJIIIIZZ.getVideoRes();
        this.LLJJL = new VESize(videoRes.width, videoRes.height);
        this.LLJL = getCameraApiComponent().pw0().enableRecordingMp4;
        VESize renderSize = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJLJL.getRenderSize();
        this.LLJJLIIIJLLLLLLLZ = new VESize(renderSize.width, renderSize.height);
        this.LLJLIL = getCameraApiComponent().St2().getMediaController().s1().getFitMode();
        AbstractC577050MkB abstractC577050MkBG8 = T2().G8();
        e4(abstractC577050MkBG8 != null ? abstractC577050MkBG8.LIZJ : 0);
        H2().LJIILLIIL = true;
        C579220Mng c579220MngM3 = m3();
        c579220MngM3.LJIJI = true;
        c579220MngM3.LIZIZ.nL1(c579220MngM3);
        ((InterfaceC578600Mmg) c579220MngM3.LJFF.getValue()).Hj2(c579220MngM3);
        T2().E60();
    }

    @Override // X.InterfaceC576630MjV
    public void iL2() {
        if (!T2().PK0()) {
            C576730Mjf.LJIIJ("CameraLayoutCaptureFlowComponent", "attempt to start over in an invalid state");
        } else {
            T2().HK1(T2().pw());
            W1(false);
        }
    }

    @Override // X.InterfaceC576630MjV
    public long kn2() {
        C578560Mmc c578560MmcW2 = w2();
        ShortVideoContext shortVideoContext = c578560MmcW2.LIZ;
        if (shortVideoContext.cameraComponentModel.mMaxDuration > 60000) {
            shortVideoContext.LJJLIIIJJI(60000L);
        }
        return c578560MmcW2.LIZ.cameraComponentModel.mMaxDuration;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", "onCreate");
        q3();
        v3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILLL.dispose();
        if (((Boolean) C305160Bxi.LIZIZ.getValue()).booleanValue()) {
            c3().c91(true, false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C578620Mmi c578620MmiH2 = H2();
        if (c578620MmiH2.LJIILLIIL) {
            c578620MmiH2.LJ();
        }
        C579220Mng c579220MngM3 = m3();
        if (c579220MngM3.LJIJI) {
            c579220MngM3.LJIIIZ.onNext(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC576630MjV
    public C11NZ<Unit> FQ1() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC576630MjV
    public C11NZ<List<LayoutItemMedia>> PT() {
        return this.LLJJI;
    }

    public InterfaceC576630MjV X1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC576630MjV
    public C11NZ<Integer> Zr1() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C578510MmX(C1DRG c1drg) {
        this.LL = c1drg;
        C11RK<List<LayoutItemMedia>> c11rk = new C11RK<>();
        this.LLJJ = c11rk;
        this.LLJJI = new C19475711Hn(c11rk);
        C11RK<Integer> c11rk2 = new C11RK<>();
        this.LLJJIII = c11rk2;
        this.LLJJIJI = new C19475711Hn(c11rk2);
        C11RK<Unit> c11rk3 = new C11RK<>();
        this.LLJJIJIIJIL = c11rk3;
        this.LLJJIJIL = new C19475711Hn(c11rk3);
        this.LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 722));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 720));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 721));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 718));
        this.LLJLIL = EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE;
    }

    private final VESize Q3(VESize vESize) {
        int i = vESize.width;
        if (i % 4 == 0 && vESize.height % 4 == 0) {
            return vESize;
        }
        if (i % 4 != 0) {
            i = ((i / 4) + 1) * 4;
        }
        int i2 = vESize.height;
        if (i2 % 4 != 0) {
            i2 = ((i2 / 4) + 1) * 4;
        }
        return new VESize(i, i2);
    }

    private final void o4(VESize vESize) {
        if (vESize != null) {
            getCameraApiComponent().St2().getCameraController().i4(vESize);
        }
    }

    public final void E3(C579220Mng c579220Mng) {
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIILIIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 50)));
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 51)));
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIILL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 52)));
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIILLIIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 53)));
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIIZILJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 54)));
        C371780Ehs.LIZ(this.LLJILLL, c579220Mng.LJIJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 55)));
    }

    public final void H3(C578620Mmi c578620Mmi) {
        C371780Ehs.LIZ(this.LLJILLL, c578620Mmi.LJII.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 56)));
        C371780Ehs.LIZ(this.LLJILLL, c578620Mmi.LJIIJJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 57)));
        C371780Ehs.LIZ(this.LLJILLL, c578620Mmi.LJIIIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 58)));
    }

    public final void O3(C0L5I c0l5i) {
        C371780Ehs.LIZ(this.LLJILLL, c0l5i.LJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 59)));
    }

    public final void W1(boolean z) {
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", "clearMedias");
        c3().c91(z, z);
        getRecordControlApi().xP1(false, false, true);
        try {
            getCameraApiComponent().u92().LIZIZ().LIZIZ.LJJJ.LIZIZ();
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearMedias: exception=");
            sbLIZ.append(e);
            C576730Mjf.LJIIJ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJJIJIIJIL.onNext(Unit.LIZ);
    }

    public final void e4(int i) {
        VESize vESize;
        VESize vESize2;
        if (i >= 4) {
            vESize = new VESize(C578540Mma.LIZ().cameraWidth46, C540010LFv.LIZLLL(C578540Mma.LIZ().cameraWidth46));
            vESize2 = new VESize(C578540Mma.LIZ().cameraPreviewWidth46, C540010LFv.LIZLLL(C578540Mma.LIZ().cameraPreviewWidth46));
        } else {
            vESize = new VESize(C578540Mma.LIZ().cameraWidth123, C540010LFv.LIZLLL(C578540Mma.LIZ().cameraWidth123));
            vESize2 = new VESize(C578540Mma.LIZ().cameraPreviewWidth123, C540010LFv.LIZLLL(C578540Mma.LIZ().cameraPreviewWidth123));
        }
        if (B3(vESize, this.LLJJJJLIIL)) {
            vESize = null;
        }
        if (B3(vESize2, this.LLJJLIIIJLLLLLLLZ)) {
            vESize2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update camera settings: cameraSize=");
        sbLIZ.append(vESize);
        sbLIZ.append(", renderSize=");
        sbLIZ.append(vESize2);
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
        o4(vESize);
        z4(vESize2, EnumC1778840wOI.SCALE_MODE_CENTER_CROP);
    }

    @Override // X.InterfaceC576630MjV
    public void ga(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteMedia: ");
        sbLIZ.append(i);
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!T2().PK0()) {
            C576730Mjf.LJIIJ("CameraLayoutCaptureFlowComponent", "attempt to delete media in an invalid state");
        } else if (C13LP.LJJJLZIJ(i, c3().KG2()) != null) {
            T2().HK1(1);
            c3().ga(i);
            this.LLJJIII.onNext(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC576630MjV
    public void pn(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("copyMedia: ");
        sbLIZ.append(i);
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (T2().PK0() && !T2().Ce1()) {
            if (C13LP.LJJJLZIJ(i, c3().KG2()) != null) {
                T2().Zh0();
                this.LLJJ.onNext(Collections.singletonList(c3().pn(i)));
                return;
            }
            return;
        }
        C576730Mjf.LJIIJ("CameraLayoutCaptureFlowComponent", "attempt to copy media in an invalid state");
    }

    private final boolean B3(VESize vESize, VESize vESize2) {
        if (vESize == null || vESize2 == null || Math.min(vESize.width, vESize.height) <= Math.min(vESize2.width, vESize2.height)) {
            return false;
        }
        return true;
    }

    private final void z4(VESize vESize, EnumC1778840wOI enumC1778840wOI) {
        getCameraApiComponent().St2().getMediaController().a5(new AwS374S0200000_8(vESize, enumC1778840wOI, 128));
    }

    @Override // X.InterfaceC576630MjV
    public void Hx2(int i, int i2) {
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraPreviewSizeReady: ");
        sbLIZ.append(i);
        sbLIZ.append(" x ");
        sbLIZ.append(i2);
        C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC577050MkB abstractC577050MkBG8 = T2().G8();
        if (abstractC577050MkBG8 != null) {
            i3 = abstractC577050MkBG8.LIZJ;
        } else {
            i3 = 0;
        }
        H4(i3, i, i2);
    }

    @Override // X.InterfaceC576630MjV
    public void tf2(boolean z, boolean z2) {
        String musicId;
        MusicObject musicObject;
        if (T2().PK0() && !T2().Ce1()) {
            AbstractC577050MkB abstractC577050MkBG8 = T2().G8();
            if (abstractC577050MkBG8 != null) {
                int i = abstractC577050MkBG8.LIZJ;
                T2().Zh0();
                int iPw = i - T2().pw();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startUpload: max upload count: ");
                sbLIZ.append(iPw);
                C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
                C0L5I c0l5iW2 = W2();
                if (z) {
                    iPw = 1;
                }
                NLEModel nLEModelLLZ = G2().LLZ();
                ArrayList arrayList = new ArrayList(c3().KG2());
                C524380KhQ.LIZIZ(c0l5iW2.LIZJ);
                ShortVideoContext shortVideoContext = c0l5iW2.LIZJ;
                Bundle bundle = new Bundle();
                bundle.putBoolean("from_privacy_upload_btn_click", z2);
                C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
                bundle.putInt("key_photo_select_max_count", iPw);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_video_select_max_count", iPw);
                bundle.putInt("key_video_select_min_count", 1);
                bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
                C786410Ut5.LJJJI("shoot_way", shortVideoContext.shootWay, bundle);
                bundle.putBoolean("Key_enable_single_select_mode", z);
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJIL(bundle2, "key_layout_filled_medias", arrayList);
                if (nLEModelLLZ != null) {
                    bundle2.putLong("key_layout_max_upload_duration", nLEModelLLZ.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                c0l5iW2.LJII = nLEModelLLZ;
                if (nLEModelLLZ != null) {
                    C0FGC.LIZ(2);
                    NLEEditor nLEEditor = new NLEEditor();
                    nLEEditor.setModel(nLEModelLLZ);
                    nLEEditor.commit();
                    nLEEditor.done();
                    C786410Ut5.LJJJI("key_layout_nle_model_json", nLEEditor.store(), bundle2);
                }
                C786410Ut5.LJJIIZI(bundle, bundle2, "key_pass_through_extra_info");
                bundle.putInt("key_choose_scene", 55);
                bundle.putInt("key_choose_request_code", 1025);
                MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
                if (musicBuzModel != null && (musicObject = musicBuzModel.music) != null) {
                    musicId = MusicBeanUtilKt.getMusicId(musicObject);
                } else {
                    musicId = null;
                }
                C786410Ut5.LJJJI("music_id", musicId, bundle);
                C537520L6g.LJFF(bundle, shortVideoContext.creativeInfo);
                C528230Knd c528230KndLJ = C534690Ky3.LJ(c0l5iW2.LIZJ);
                c528230KndLJ.LJI = C0L9O.VIDEO_SHOOT_PAGE.getValue();
                c528230KndLJ.LJII = EnumC538190L8v.LAYOUT_CELL.getValue();
                C534690Ky3.LIZIZ(c528230KndLJ);
                C1660680tJi.LIZ().LIZJ(c0l5iW2.LIZIZ, bundle, 1025, 1025);
                C1444870nhd c1444870nhd = C1444870nhd.LIZ;
                Activity activity = (Activity) getDiContainer().LJII(C19EG.class, null);
                ShortVideoContext shortVideoContext2 = this.LLILZ;
                C1DRG diContainer = getDiContainer();
                Boolean boolValueOf = Boolean.valueOf(z);
                c1444870nhd.getClass();
                C1444870nhd.LIZIZ(activity, shortVideoContext2, diContainer, null, boolValueOf);
                return;
            }
            return;
        }
        C576730Mjf.LJIIJ("CameraLayoutCaptureFlowComponent", "attempt to upload media in an invalid state");
    }

    private final void F4(int i, int i2, boolean z) {
        getCameraApiComponent().pw0().enableRecordingMp4 = z;
        getCameraApiComponent().St2().getMediaController().h5(new C578550Mmb(i, i2, z));
    }

    private final void H4(int i, int i2, int i3) {
        VESize vESize;
        VESize vESizeQ3;
        if (i >= 4) {
            vESize = new VESize(C578540Mma.LIZ().recordWidth46, C540010LFv.LIZLLL(C578540Mma.LIZ().recordWidth46));
        } else {
            vESize = new VESize(C578540Mma.LIZ().recordWidth123, C540010LFv.LIZLLL(C578540Mma.LIZ().recordWidth123));
        }
        if ((!B3(vESize, this.LLJJL) || (vESize = this.LLJJL) != null) && (vESizeQ3 = Q3(C576730Mjf.LIZIZ(vESize, i2, i3))) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update video record settings: videoSize=");
            sbLIZ.append(vESize);
            sbLIZ.append(" croppedSize=");
            sbLIZ.append(vESizeQ3);
            sbLIZ.append(" cameraPreviewWidth=");
            sbLIZ.append(i2);
            sbLIZ.append(" cameraPreviewHeight=");
            sbLIZ.append(i3);
            C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", C2188811AlT.LIZIZ(sbLIZ));
            F4(vESizeQ3.width, vESizeQ3.height, true);
        }
    }
}
