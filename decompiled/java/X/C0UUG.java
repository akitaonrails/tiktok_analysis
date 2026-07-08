package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestResolutionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UUG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUG extends SurfaceView implements InterfaceC754220TiG, InterfaceC923870a9J, InterfaceC923890a9L {
    public final C758340Tou LL;
    public C773070UUf LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C1273890jFr LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public C2247601Cy6 LLJI;
    public SurfaceHolder LLJIJIL;
    public long LLJILJIL;
    public final long LLJILJILJ;

    @Override // X.InterfaceC923870a9J
    public final void LIZ(String str, String str2) {
    }

    @Override // X.InterfaceC923870a9J
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC923870a9J
    public Object getAttachedComposerManager() {
        return null;
    }

    public /* bridge */ /* synthetic */ void setDataChannel(DataChannel dataChannel) {
    }

    public void setLinkMicLiveEffectCallback(InterfaceC924050a9b interfaceC924050a9b) {
    }

    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC774920UaY interfaceC774920UaY) {
    }

    @Override // X.InterfaceC923890a9L
    public final void LIZIZ() {
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.D3(CertProviderManagerKt.findCert("bpea-568", 1476788483));
        }
    }

    @Override // X.InterfaceC923890a9L
    public final Boolean LIZJ() {
        if (this.LLILZLL == null) {
            return Boolean.FALSE;
        }
        boolean zLIZ = C0U30.LIZ(getContext(), this.LLILZLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAudioBeOccupied:");
        sbLIZ.append(zLIZ);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(zLIZ);
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIL() {
        C20441214yg.LIZIZ("VirtualAvatarView", "startCaptureVideo");
    }

    @Override // X.InterfaceC923870a9J
    public C0UH6 getEffectWrapperProxy() {
        return new C0UH3(null);
    }

    @Override // X.InterfaceC754220TiG
    public InterfaceC1273910jFt getLiveCore() {
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            return c1273890jFr.LJI;
        }
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        C20441214yg.LIZIZ("VirtualAvatarView", "onAttachedToWindow");
        if ((getParent() instanceof C0UUV) && ((C0UUV) getParent()).LIZ()) {
            super.onAttachedToWindow();
            return;
        }
        if ((getParent() instanceof C0UUU) && ((C0UUU) getParent()).isAdjustParent()) {
            super.onAttachedToWindow();
            return;
        }
        if (C781270Ukn.LJIILJJIL().Kn2()) {
            super.onAttachedToWindow();
            return;
        }
        super.onAttachedToWindow();
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-373", 1476788234), false);
        }
    }

    public final void LJII() {
        AbstractC1273900jFs abstractC1273900jFs;
        int i;
        int i2;
        Surface surface;
        AbstractC1273900jFs abstractC1273900jFs2;
        C1269340j8W c1269340j8WLLD;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realUpdateVirtualAvatar model=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", CaptureDevice=");
        C1273890jFr c1273890jFr = this.LLILZLL;
        Boolean boolValueOf = null;
        sbLIZ.append((c1273890jFr == null || (abstractC1273900jFs2 = c1273890jFr.LJI) == null || (c1269340j8WLLD = abstractC1273900jFs2.LLD()) == null) ? null : Integer.valueOf(c1269340j8WLLD.LJJII()));
        sbLIZ.append(" surfaceHolder=");
        SurfaceHolder surfaceHolder = this.LLJIJIL;
        if (surfaceHolder != null && (surface = surfaceHolder.getSurface()) != null) {
            boolValueOf = Boolean.valueOf(surface.isValid());
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILLJJLI.LIZLLL()) {
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
                return;
            }
            return;
        }
        C2247601Cy6 c2247601Cy62 = this.LLJI;
        if (c2247601Cy62 != null) {
            c2247601Cy62.LIZLLL();
        }
        C1273890jFr c1273890jFr2 = this.LLILZLL;
        if (c1273890jFr2 != null && (abstractC1273900jFs = c1273890jFr2.LJI) != null) {
            abstractC1273900jFs.LJJLIL(4);
            C2247601Cy6 c2247601Cy63 = new C2247601Cy6(true);
            this.LLJI = c2247601Cy63;
            c2247601Cy63.LIZIZ(getContext(), abstractC1273900jFs, this.LLILLJJLI, false);
            SurfaceHolder surfaceHolder2 = this.LLJIJIL;
            if (surfaceHolder2 != null) {
                C2247611Cy7 c2247611Cy7 = this.LLILLJJLI.LIZLLL;
                if (c2247611Cy7 != null) {
                    i = c2247611Cy7.LIZ;
                    i2 = c2247611Cy7.LIZIZ;
                } else {
                    i = 540;
                    i2 = 720;
                }
                C2247601Cy6 c2247601Cy64 = this.LLJI;
                if (c2247601Cy64 != null) {
                    c2247601Cy64.LJ(surfaceHolder2, i, i2);
                }
            }
            C2247601Cy6 c2247601Cy65 = this.LLJI;
            if (c2247601Cy65 != null) {
                c2247601Cy65.LJFF();
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        C20441214yg.LJ("VirtualAvatarView", "realUpdateVirtualAvatar liveCore null");
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJJI() {
        if (System.currentTimeMillis() - this.LLJILJIL >= this.LLJILJILJ && this.LLILZIL) {
            this.LLILZIL = false;
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZ(false);
            }
            this.LLJILJIL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILJJIL() {
        if (System.currentTimeMillis() - this.LLJILJIL >= this.LLJILJILJ && !this.LLILZIL) {
            this.LLILZIL = true;
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZ(true);
            }
            this.LLJILJIL = System.currentTimeMillis();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow autoReleaseWhenDetach=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", hasReleaseResource=");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        if ((getParent() instanceof C0UUV) && ((C0UUV) getParent()).LIZ()) {
            super.onDetachedFromWindow();
            return;
        }
        if ((getParent() instanceof C0UUU) && ((C0UUU) getParent()).isAdjustParent()) {
            super.onDetachedFromWindow();
            return;
        }
        if (C781270Ukn.LJIILJJIL().Kn2()) {
            super.onDetachedFromWindow();
            return;
        }
        if (!this.LLJ) {
            super.onDetachedFromWindow();
            return;
        }
        if (!this.LLILLL) {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-400", 1476788484));
            }
            C1273890jFr c1273890jFr2 = this.LLILZLL;
            if (c1273890jFr2 != null) {
                c1273890jFr2.release(CertProviderManagerKt.findCert("bpea-493", 1476788484));
            }
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
            }
            this.LLILZ = true;
            this.LLILLL = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC923870a9J
    public final boolean LJFF() {
        return this.LLILZ;
    }

    public final C758340Tou getConfig() {
        return this.LL;
    }

    @Override // X.InterfaceC923870a9J
    public InterfaceC769940UIe getLiveStream() {
        return this.LLILZLL;
    }

    public final C773070UUf getModel() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC923870a9J
    public final void LJ(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null) {
            int iLJJII = c1269340j8WLLD.LJJII();
            int i = 1;
            if (iLJJII == 1) {
                i = 2;
            }
            this.LLIZLLLIL = i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchCamera lastVideoCaptureDevice=");
        sbLIZ.append(this.LLIZLLLIL);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC923870a9J
    public final void LJI(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLIZLLLIL = i;
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIIIZ(C936050aSx c936050aSx) {
        if (Intrinsics.LJFF(this.LLILLJJLI, c936050aSx)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateVirtualAvatar skip ");
            sbLIZ.append(c936050aSx);
            C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLILLJJLI = c936050aSx;
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this, 704));
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILL(Cert cert) {
        C20441214yg.LIZIZ("VirtualAvatarView", "pause");
        try {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(cert);
            }
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZJ();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "VirtualAvatarView", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIZILJ(Cert cert) {
        C20441214yg.LIZIZ("VirtualAvatarView", "resume");
        try {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null) {
                c1273890jFr.J3(cert, false);
            }
            C2247601Cy6 c2247601Cy6 = this.LLJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LJFF();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "VirtualAvatarView", e.getStackTrace());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C20441214yg.LIZIZ("VirtualAvatarView", "onDraw");
    }

    @Override // X.InterfaceC923890a9L
    public final void release(Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release hasReleaseResource=");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.t3(cert);
        }
        C1273890jFr c1273890jFr2 = this.LLILZLL;
        if (c1273890jFr2 != null) {
            c1273890jFr2.LJIILL(cert);
        }
        C1273890jFr c1273890jFr3 = this.LLILZLL;
        if (c1273890jFr3 != null) {
            c1273890jFr3.release(cert);
        }
        C2247601Cy6 c2247601Cy6 = this.LLJI;
        if (c2247601Cy6 != null) {
            c2247601Cy6.LIZLLL();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C930890aKd.class);
        C1273890jFr c1273890jFrLJIIJJI = C776270Ucj.LIZ.LJIIJJI(false, null, false);
        if (c1273890jFrLJIIJJI != null) {
            dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, c1273890jFrLJIIJJI);
        }
    }

    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setModel(C773070UUf c773070UUf) {
        this.LLILLJJLI = c773070UUf;
    }

    public void setReleaseMode(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIIIZZ(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioMute mute=");
        sbLIZ.append(z);
        sbLIZ.append(" cert");
        sbLIZ.append(cert);
        sbLIZ.append("liveStream=");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.LJIIIIZZ(cert, z);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILIIL(Cert cert, boolean z) {
        C1273890jFr c1273890jFr;
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        int iLJJII;
        C1273890jFr c1273890jFr2;
        AbstractC1273900jFs abstractC1273900jFs2;
        C1269340j8W c1269340j8WLLD2;
        if (z == this.LLIZ && (c1273890jFr2 = this.LLILZLL) != null && (abstractC1273900jFs2 = c1273890jFr2.LJI) != null && (c1269340j8WLLD2 = abstractC1273900jFs2.LLD()) != null && this.LLIZLLLIL == c1269340j8WLLD2.LJJII()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchCamera openCamera=");
            sbLIZ.append(z);
            sbLIZ.append(" skip");
            C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchCamera openCamera=");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchCameraImpl openCamera=");
        sbLIZ3.append(z);
        sbLIZ3.append(" lastVideoCaptureDevice=");
        sbLIZ3.append(this.LLIZLLLIL);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLIZ = z;
        if (!z && (c1273890jFr = this.LLILZLL) != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (iLJJII = c1269340j8WLLD.LJJII()) != 5 && iLJJII != 4) {
            this.LLIZLLLIL = iLJJII;
        }
    }

    @Override // X.InterfaceC754220TiG
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            return c1273890jFr.i3(c1275030jHh, interfaceC775310UbB);
        }
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C20441214yg.LIZIZ("VirtualAvatarView", "onMeasure");
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJ(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVirtualAvatarPushParam width=");
        sbLIZ.append(i);
        sbLIZ.append(" height=");
        sbLIZ.append(i2);
        sbLIZ.append(" fps=");
        sbLIZ.append(i3);
        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJ(i, i2, i3);
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this, 703));
    }

    public C0UUG(Context context, C758340Tou c758340Tou, final DataChannel dataChannel, C773070UUf c773070UUf) {
        int i;
        int i2;
        super(context);
        this.LL = c758340Tou;
        this.LLILLJJLI = c773070UUf;
        this.LLIZLLLIL = 4;
        this.LLJ = true;
        LinkMicMockAvatarConfigSetting linkMicMockAvatarConfigSetting = LinkMicMockAvatarConfigSetting.INSTANCE;
        linkMicMockAvatarConfigSetting.getValue();
        InterfaceC774920UaY interfaceC774920UaY = new InterfaceC774920UaY(dataChannel) { // from class: X.0UUO
            @Override // X.InterfaceC774920UaY
            public final void GR() {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void HA(long j) {
            }

            @Override // X.InterfaceC774920UaY
            public final void HQ() {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void I1(int i3, int i4) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void Kj() {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void L1(int i3) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void LLLLIILL(int i3) {
            }

            @Override // X.InterfaceC774920UaY
            public final void Nt() {
            }

            @Override // X.InterfaceC774920UaY
            public final void Th(float f) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void Xz(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
            }

            @Override // X.InterfaceC774920UaY
            public final void bz() {
            }

            @Override // X.InterfaceC774920UaY
            public final void cN() {
            }

            @Override // X.InterfaceC774920UaY
            public final void fE() {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void gG(boolean z) {
            }

            @Override // X.InterfaceC774920UaY
            public final void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
            }

            @Override // X.InterfaceC774920UaY
            public final void ku(int i3, int i4, String str) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void mQ() {
            }

            @Override // X.InterfaceC774920UaY
            public final void onStreamStart() {
            }

            @Override // X.InterfaceC774920UaY
            public final void pq(int i3) {
            }

            @Override // X.InterfaceC774920UaY
            public final void v5() {
            }

            @Override // X.InterfaceC774920UaY
            public final void vn(double d, double d2, double d3) {
            }
        };
        this.LLJILJILJ = linkMicMockAvatarConfigSetting.getValue().speakInterval;
        this.LLIZ = true;
        String value = AdmServerCfgSetting.INSTANCE.getValue();
        ByteAudioConfig byteAudioConfig = new ByteAudioConfig();
        byteAudioConfig.admType = 1;
        byteAudioConfig.admServerCfg = value;
        if (LiveAbLabelSetting.INSTANCE.getIntValue("opt_up_sample") == 1) {
            i = 540;
            i2 = 960;
        } else {
            i = 240;
            i2 = 320;
        }
        C748410TXj guestResolution = MultiGuestV3GuestResolutionSetting.INSTANCE.getGuestResolution();
        if (guestResolution != null) {
            i = guestResolution.LIZ;
            i2 = guestResolution.LIZIZ;
        }
        C776280Uck c776280Uck = new C776280Uck(context);
        c776280Uck.LJJIFFI = C781270Ukn.LJIJJ().IG0();
        c776280Uck.LJJIL = new C1276880jKg();
        c776280Uck.LJJI = new C0UNM();
        c776280Uck.LJJIZ = new C0UH8();
        c776280Uck.LJIJJLI = 4;
        c776280Uck.LJIL = 5;
        c776280Uck.LJJ = byteAudioConfig;
        c776280Uck.LJJJ = null;
        c776280Uck.LJJJI = TestEnableEffectSetting.INSTANCE.disable() ? null : EnumC1309510kBJ.INST.getResourceFinder(getContext());
        Map<String, Object> map = C1338270kvh.LIZ;
        c776280Uck.LJJJJJL = false;
        c776280Uck.LJJJJL = LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        c776280Uck.LJJJJ = i;
        c776280Uck.LJJJJI = i2;
        c776280Uck.LJJJJLL = false;
        c776280Uck.LJJJJZ = false;
        if (MultiGuestV3ChangeFpsGuestSetting.INSTANCE.isEnable()) {
            c776280Uck.LJIIIZ = 1;
            c776280Uck.LJIIIIZZ = 15;
        }
        String value2 = MultiGuestV3GuestSetting.INSTANCE.getValue();
        if (value2 != null && value2.length() > 0) {
            c776280Uck.LJJIJ = value2;
        }
        C1273890jFr c1273890jFr = new C1273890jFr(c776280Uck.LIZ());
        this.LLILZLL = c1273890jFr;
        c1273890jFr.G3(interfaceC774920UaY);
        AbstractC1273900jFs abstractC1273900jFs = c1273890jFr.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJJ(new InterfaceC1268540j7E() { // from class: X.0UUN
                @Override // X.InterfaceC1268540j7E
                public final void LIZ(int i3) {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(MultiGuestAudioVolumeEvent.class, Integer.valueOf(i3));
                    }
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initView ");
            sbLIZ.append(abstractC1273900jFs);
            C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ));
            C2247601Cy6 c2247601Cy6 = new C2247601Cy6(true);
            this.LLJI = c2247601Cy6;
            c2247601Cy6.LIZIZ(context, abstractC1273900jFs, this.LLILLJJLI, false);
            abstractC1273900jFs.LJJLIL(4);
            SurfaceHolder holder = getHolder();
            if (holder != null) {
                holder.addCallback(new SurfaceHolder.Callback() { // from class: X.0UUK
                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceCreated ");
                        sbLIZ2.append(surfaceHolder);
                        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ2));
                        C0UUG c0uug = this.LL;
                        c0uug.LLJIJIL = surfaceHolder;
                        c0uug.LJII();
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceDestroyed ");
                        sbLIZ2.append(surfaceHolder);
                        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ2));
                        C2247601Cy6 c2247601Cy62 = this.LL.LLJI;
                        if (c2247601Cy62 != null) {
                            c2247601Cy62.LIZLLL();
                        }
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceChanged ");
                        sbLIZ2.append(surfaceHolder);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(i4);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(i5);
                        C20441214yg.LIZIZ("VirtualAvatarView", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LL.LLJIJIL = surfaceHolder;
                    }
                });
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C930890aKd.class, c1273890jFr);
        dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, c1273890jFr);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C20441214yg.LIZIZ("VirtualAvatarView", "onLayout");
        setZOrderMediaOverlay(true);
    }
}
