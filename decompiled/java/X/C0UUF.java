package X;

import Y.AObjectS387S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.LiveStreamFpsReportData;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LinkVideoReleaseComposerManagerEvent;
import com.bytedance.android.live.effect.model.LiveEffectAdaptiveChannel;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoCaptureChangeEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreloadStageSmallModelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PauseOptPushFpsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestResolutionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectMsgEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0UUF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUF extends SurfaceView implements InterfaceC754220TiG, InterfaceC923870a9J, InterfaceC923890a9L, C0UHE {
    public final C758340Tou LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final InterfaceC769400UGc LLILZ;
    public final C0UHA LLILZIL;
    public final C1273890jFr LLILZLL;
    public final InterfaceC1268640j7O LLIZ;
    public boolean LLIZLLLIL;
    public C11JF LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC924050a9b LLJILJILJ;
    public DataChannel LLJILLL;
    public C0U78 LLJJ;
    public C2247601Cy6 LLJJI;
    public C773070UUf LLJJIII;
    public long LLJJIJI;
    public final long LLJJIJIIJIL;

    @Override // X.InterfaceC923890a9L
    public final void LJIIJJI() {
        LJIJ(false);
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILJJIL() {
        LJIJ(true);
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILLIIL() {
    }

    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC774920UaY interfaceC774920UaY) {
    }

    @Override // X.InterfaceC923890a9L
    public final void LIZIZ() {
        this.LLILZLL.D3(CertProviderManagerKt.findCert("bpea-568", 1476788483));
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
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(zLIZ);
    }

    public final void LJIJJ() {
        AbstractC1273900jFs abstractC1273900jFs;
        if (this.LLJJIII == null || !MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility()) {
            return;
        }
        C773070UUf c773070UUf = this.LLJJIII;
        String string = c773070UUf != null ? c773070UUf.toString() : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realUpdateVirtualAvatar avatarModel=");
        sbLIZ.append(string);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJIII.LIZLLL()) {
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
                C1273890jFr c1273890jFr = this.LLILZLL;
                if (c1273890jFr == null || (abstractC1273900jFs = c1273890jFr.LJI) == null) {
                    return;
                }
                if (this.LLJI) {
                    abstractC1273900jFs.LJJLIL(this.LLJIJIL);
                    return;
                } else {
                    abstractC1273900jFs.LJJLIL(5);
                    return;
                }
            }
            return;
        }
        C2247601Cy6 c2247601Cy62 = this.LLJJI;
        if (c2247601Cy62 != null) {
            c2247601Cy62.LIZLLL();
        }
        C1273890jFr c1273890jFr2 = this.LLILZLL;
        if (c1273890jFr2 == null || c1273890jFr2.LJI == null) {
            C20441214yg.LJ("LinkVideo2View", "realUpdateVirtualAvatar liveCore null");
            return;
        }
        C2247601Cy6 c2247601Cy63 = new C2247601Cy6(this.LLJJIII.LIZIZ);
        this.LLJJI = c2247601Cy63;
        c2247601Cy63.LIZIZ(getContext(), this.LLILZLL.LJI, this.LLJJIII, true);
        this.LLILZLL.LJI.LJJLIL(4);
        this.LLJJI.LJFF();
        C1273890jFr c1273890jFr3 = this.LLILZLL;
        if (c1273890jFr3 != null) {
            c1273890jFr3.s3(true);
        }
    }

    @Override // X.InterfaceC923870a9J
    public C0UH6 getEffectWrapperProxy() {
        return new C0UH3(this.LLILZIL);
    }

    @Override // X.InterfaceC754220TiG
    public InterfaceC1273910jFt getLiveCore() {
        return this.LLILZLL.LJI;
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" startCaptureVideo ");
        sbLIZ.append(this.LLILZIL == null);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        C0UHA c0uha = this.LLILZIL;
        if (c0uha != null) {
            c0uha.LIZ();
        }
    }

    public final void LJIJI() {
        C0U78 c0u78ComposerManagerB = C781270Ukn.LJI().composerManagerB();
        this.LLJJ = c0u78ComposerManagerB;
        C0UGC c0ugc = new C0UGC();
        c0ugc.LIZLLL = "guest_linkmic";
        c0ugc.LIZ = C0UD4.LJIIIZ;
        c0ugc.LJ = true;
        c0ugc.LIZJ = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getDefaultComposerHandler(this.LLIZ, "LinkVideo2View");
        c0ugc.LJFF = new C0UGE() { // from class: X.0UUQ
            @Override // X.C0UGE
            public final void LIZ(boolean z) {
                this.LIZ.LLILZLL.F3(Boolean.valueOf(z));
            }
        };
        c0u78ComposerManagerB.or(new C0UG8(c0ugc));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        if ((getParent() instanceof C0UUV) && ((C0UUV) getParent()).LIZ()) {
            super.onAttachedToWindow();
            return;
        }
        if ((getParent() instanceof C0UUU) && ((C0UUU) getParent()).isAdjustParent()) {
            super.onAttachedToWindow();
        } else if (C781270Ukn.LJIILJJIL().Kn2()) {
            super.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
            this.LLILZLL.J3(CertProviderManagerKt.findCert("bpea-373", 1476788234), false);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        C11JF c11jf;
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
        if (!this.LLJILJIL) {
            super.onDetachedFromWindow();
            return;
        }
        if (!this.LLILLJJLI) {
            this.LLJILLL.LC0(LinkVideoReleaseComposerManagerEvent.class, this.LLJJ);
            C0U78 c0u78 = this.LLJJ;
            if (c0u78 != null) {
                if (c0u78 instanceof InterfaceC932350aMz) {
                    c0u78.release();
                }
                C0U78 c0u782 = this.LLJJ;
                if (c0u782 instanceof C0U78) {
                    c0u782.LJIIL();
                }
            }
            this.LLJILLL.LC0(LiveStreamFpsReportData.class, new C773470UVt());
            this.LLILZIL.LJIIZILJ(CertProviderManagerKt.findCert("bpea-433", 1476788484));
            this.LLILZLL.LJIILL(CertProviderManagerKt.findCert("bpea-400", 1476788484));
            this.LLILZLL.release(CertProviderManagerKt.findCert("bpea-493", 1476788484));
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
            }
            this.LLILLL = true;
            this.LLILLJJLI = true;
        }
        super.onDetachedFromWindow();
        if (this.LLILLJJLI || (c11jf = this.LLJ) == null || c11jf.isDisposed()) {
            return;
        }
        this.LLJ.dispose();
    }

    @Override // X.InterfaceC923870a9J
    public final void LIZLLL() {
        LJIJI();
    }

    @Override // X.InterfaceC923870a9J
    public final boolean LJFF() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC923870a9J
    public Object getAttachedComposerManager() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC923870a9J
    public InterfaceC769940UIe getLiveStream() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC923870a9J
    public final void LJ(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs;
        if (this.LLILZIL != null) {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && abstractC1273900jFs.LLD() != null) {
                int i = 1;
                if (this.LLILZLL.LJI.LLD().LJJII() == 1) {
                    i = 2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("switchCamera lastVideoCaptureDevice=");
                sbLIZ.append(this.LLJIJIL);
                sbLIZ.append(",currentDevice=");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJIJIL = i;
            }
            this.LLILZIL.LJIIJ(cert);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJI(boolean z) {
        if (z) {
            this.LLJIJIL = 2;
        } else {
            this.LLJIJIL = 1;
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIIIZ(C936050aSx c936050aSx) {
        InterfaceC1268640j7O interfaceC1268640j7O;
        if (MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (interfaceC1268640j7O = this.LLIZ) != null) {
            interfaceC1268640j7O.enable(this.LLJI);
        }
        C773070UUf c773070UUf = this.LLJJIII;
        if (c773070UUf != null) {
            c936050aSx.LIZLLL = c773070UUf.LIZLLL;
            this.LLJJIII = c936050aSx;
        } else {
            this.LLJJIII = c936050aSx;
        }
        LJIJJ();
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILL(Cert cert) {
        C20441214yg.LIZIZ("LinkVideo2View", "pause");
        try {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(cert);
            }
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZJ();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIZILJ(Cert cert) {
        C20441214yg.LIZIZ("LinkVideo2View", "resume");
        try {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null) {
                c1273890jFr.J3(cert, false);
            }
            this.LLILZ.onResume();
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LJFF();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    public final void LJIJ(boolean z) {
        C1273890jFr c1273890jFr;
        AbstractC1273900jFs abstractC1273900jFs;
        if (System.currentTimeMillis() - this.LLJJIJI >= this.LLJJIJIIJIL && this.LLJJI != null && !this.LLJI && (c1273890jFr = this.LLILZLL) != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && abstractC1273900jFs.LLD() != null && this.LLILZLL.LJI.LLD().LJJII() == 4) {
            this.LLJJI.LIZ(z);
            this.LLJJIJI = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void release(Cert cert) {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILZ.onDestroy();
        GiftService.LLILLJJLI.getGiftPreDownloadService().release();
        this.LLILLJJLI = true;
        C0U78 c0u78 = this.LLJJ;
        if (c0u78 != null) {
            if (c0u78 instanceof InterfaceC932350aMz) {
                c0u78.release();
            }
            C0U78 c0u782 = this.LLJJ;
            if (c0u782 instanceof C0U78) {
                c0u782.LJIIL();
            }
        }
        C0UHA c0uha = this.LLILZIL;
        if (c0uha != null) {
            c0uha.LJIIZILJ(cert);
        }
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.t3(cert);
            this.LLILZLL.LJIILL(cert);
            this.LLILZLL.release(cert);
        }
        C11JF c11jf = this.LLJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LLJ.dispose();
        }
        C2247601Cy6 c2247601Cy6 = this.LLJJI;
        if (c2247601Cy6 != null) {
            c2247601Cy6.LIZLLL();
        }
        this.LLJILLL.LC0(LiveStreamFpsReportData.class, new C773470UVt());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C930890aKd.class);
        dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, C776270Ucj.LIZ.LJIIJJI(false, null, false));
    }

    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public void setDataChannel(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        this.LLJILLL = dataChannel;
        C500260Jjc.LJJLIIIJILLIZJL(new AObjectS387S0100000_12(this, 1));
    }

    public void setLinkMicLiveEffectCallback(InterfaceC924050a9b interfaceC924050a9b) {
        this.LLJILJILJ = interfaceC924050a9b;
    }

    public void setReleaseMode(boolean z) {
        this.LLJILJIL = z;
    }

    public C0UUF(Context context, C758340Tou c758340Tou) {
        int i;
        int i2;
        int i3;
        String idStr;
        Object resourceFinder;
        boolean z;
        super(context, null);
        InterfaceC769400UGc interfaceC769400UGcCreateStickerGiftEffectManager = C781270Ukn.LJII().createStickerGiftEffectManager("LinkVideo2View", true);
        this.LLILZ = interfaceC769400UGcCreateStickerGiftEffectManager;
        this.LLIZLLLIL = false;
        this.LLJIJIL = 1;
        this.LLJILJIL = true;
        this.LLJJIJI = 0L;
        this.LLJJIJIIJIL = LinkMicMockAvatarConfigSetting.INSTANCE.getValue().speakInterval;
        InterfaceC774920UaY interfaceC774920UaY = new InterfaceC774920UaY(this) { // from class: X.0UUM
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
            public final /* synthetic */ void I1(int i4, int i5) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void Kj() {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void L1(int i4) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void LLLLIILL(int i4) {
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
            public final /* synthetic */ void gG(boolean z2) {
            }

            @Override // X.InterfaceC774920UaY
            public final void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
            }

            @Override // X.InterfaceC774920UaY
            public final void ku(int i4, int i5, String str) {
            }

            @Override // X.InterfaceC774920UaY
            public final /* synthetic */ void mQ() {
            }

            @Override // X.InterfaceC774920UaY
            public final void onStreamStart() {
            }

            @Override // X.InterfaceC774920UaY
            public final void pq(int i4) {
            }

            @Override // X.InterfaceC774920UaY
            public final void v5() {
            }

            @Override // X.InterfaceC774920UaY
            public final void vn(double d, double d2, double d3) {
            }
        };
        this.LL = c758340Tou;
        EnumC1309510kBJ enumC1309510kBJ = EnumC1309510kBJ.INST;
        String modelFilePath = enumC1309510kBJ.getModelFilePath();
        if (c758340Tou != null && c758340Tou.LIZLLL == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLJI = true;
        if (c758340Tou != null && !c758340Tou.LJ) {
            this.LLJI = false;
            i = 5;
        }
        String value = AdmServerCfgSetting.INSTANCE.getValue();
        ByteAudioConfig byteAudioConfig = new ByteAudioConfig();
        byteAudioConfig.admType = 1;
        byteAudioConfig.admServerCfg = value;
        if (LiveAbLabelSetting.INSTANCE.getIntValue("opt_up_sample") == 1) {
            i2 = 540;
            i3 = 960;
        } else {
            i2 = 240;
            i3 = 320;
        }
        C748410TXj guestResolution = MultiGuestV3GuestResolutionSetting.INSTANCE.getGuestResolution();
        if (guestResolution != null) {
            i2 = guestResolution.LIZ;
            i3 = guestResolution.LIZIZ;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = "";
        }
        C776280Uck c776280Uck = new C776280Uck(getContext());
        c776280Uck.LJJIFFI = C781270Ukn.LJIJJ().IG0();
        c776280Uck.LJJIL = new C1276880jKg();
        c776280Uck.LJJI = new C0UNM();
        c776280Uck.LJJIZ = new C0UH8();
        c776280Uck.LJIJJLI = i;
        c776280Uck.LJIL = 5;
        c776280Uck.LJJ = byteAudioConfig;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        c776280Uck.LJJJ = testEnableEffectSetting.disable() ? null : modelFilePath;
        if (testEnableEffectSetting.disable()) {
            resourceFinder = null;
        } else {
            resourceFinder = enumC1309510kBJ.getResourceFinder(getContext());
        }
        c776280Uck.LJJJI = resourceFinder;
        Map<String, Object> map = C1338270kvh.LIZ;
        c776280Uck.LJJJJJL = false;
        c776280Uck.LJJJJL = LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        c776280Uck.LJJJJ = i2;
        c776280Uck.LJJJJI = i3;
        c776280Uck.LJJIJIL = idStr;
        c776280Uck.LJJJJLL = false;
        c776280Uck.LJJJJZ = false;
        c776280Uck.LJJJJZI = PauseOptPushFpsSetting.INSTANCE.getValue();
        if (MultiGuestV3ChangeFpsGuestSetting.INSTANCE.isEnable()) {
            c776280Uck.LJIIIZ = 1;
            c776280Uck.LJIIIIZZ = 15;
        }
        String value2 = MultiGuestV3GuestSetting.INSTANCE.getValue();
        if (value2 != null && !value2.isEmpty()) {
            c776280Uck.LJJIJ = value2;
        }
        C776310Ucn c776310UcnLIZ = c776280Uck.LIZ();
        C1273890jFr c1273890jFr = new C1273890jFr(c776310UcnLIZ);
        this.LLILZLL = c1273890jFr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" config = ");
        sbLIZ.append(c776310UcnLIZ);
        sbLIZ.append(" cameraFacing = ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(c1273890jFr.LJI.LLD().LJJII());
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        C1273890jFr c1273890jFr2 = this.LLILZLL;
        if (c758340Tou != null && !c758340Tou.LJFF) {
            z = false;
        } else {
            z = true;
        }
        C0UHA c0uha = new C0UHA(this, c1273890jFr2, z, false);
        c0uha.LLILZLL = new C0UHL() { // from class: X.0UDF
            @Override // X.InterfaceC1266820j4S
            public final /* synthetic */ void LIZJ(Map map2) {
            }

            @Override // X.C0UHL
            public final /* synthetic */ void LLLZ(String str, String str2, Map map2, C0U8C c0u8c) {
            }

            @Override // X.InterfaceC1266820j4S
            public final /* synthetic */ void onInfo(int i4, int i5, String str) {
            }

            @Override // X.InterfaceC1266820j4S
            public final void LIZLLL(int i4, int i5, int i6) {
                C0UUF c0uuf = this.LL;
                c0uuf.getClass();
                if (i4 != 4 && i4 != 5 && i4 != 6) {
                    if (i4 == 400) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("StreamInfo: ");
                        sbLIZ2.append(i4);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(i5);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(i6);
                        C20441214yg.LIZIZ("EffectMonitor#Adaptive", C2188811AlT.LIZIZ(sbLIZ2));
                        if (i5 == 1) {
                            C781270Ukn.LJI().getLiveEffectController().LJIIJ();
                            c0uuf.LLJILLL.zW(LiveEffectAdaptiveChannel.class, new C767620U9g());
                            return;
                        }
                        return;
                    }
                    return;
                }
                DataChannel dataChannel = c0uuf.LLJILLL;
                if (dataChannel == null) {
                    return;
                }
                dataChannel.LC0(MultiGuestV3VideoCaptureChangeEvent.class, new C443120HZe(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
        };
        c0uha.LLJILJILJ = C0UX8.EVENT_PAGE_MULTI_GUEST;
        this.LLILZIL = c0uha;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = c1273890jFr.LJIIL();
        this.LLIZ = interfaceC1268640j7OLJIIL;
        LJIJI();
        c0uha.LLILZIL = new C0THS(this);
        c0uha.LJIIIZ(this);
        interfaceC769400UGcCreateStickerGiftEffectManager.LIZLLL(this.LLJILLL, c0uha, c1273890jFr, interfaceC1268640j7OLJIIL);
        interfaceC769400UGcCreateStickerGiftEffectManager.onCreate();
        AbstractC1273900jFs abstractC1273900jFs = c1273890jFr.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJJJ(new InterfaceC1268540j7E() { // from class: X.0UUL
                @Override // X.InterfaceC1268540j7E
                public final void LIZ(int i4) {
                    DataChannel dataChannel = this.LIZ.LLJILLL;
                    if (dataChannel != null) {
                        dataChannel.LC0(MultiGuestAudioVolumeEvent.class, Integer.valueOf(i4));
                    }
                }
            });
            c1273890jFr.G3(interfaceC774920UaY);
        }
        dataChannelGlobal.JQ2(C930890aKd.class, c1273890jFr);
        dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, c1273890jFr);
        if (LivePreloadStageSmallModelSetting.INSTANCE.isEnable()) {
            C13QA.LIZ().LIZIZ(0, true);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LIZ(String str, String str2) {
        this.LLILZ.LIZ(str, str2);
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
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        C1273890jFr c1273890jFr = this.LLILZLL;
        if (c1273890jFr != null) {
            c1273890jFr.LJIIIIZZ(cert, z);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILIIL(Cert cert, boolean z) {
        int iLJJII;
        InterfaceC1268640j7O interfaceC1268640j7O;
        AbstractC1273900jFs abstractC1273900jFs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" switchCamera openCamera=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        if (z == this.LLJI) {
            C1273890jFr c1273890jFr = this.LLILZLL;
            if (c1273890jFr != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && abstractC1273900jFs.LLD() != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(hashCode());
                sbLIZ2.append(" switchCamera lastVideoCaptureDevice = ");
                sbLIZ2.append(this.LLJIJIL);
                sbLIZ2.append(" ");
                sbLIZ2.append(this.LLILZLL.LJI.LLD().LJJII());
                C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ2));
                if (this.LLJIJIL == this.LLILZLL.LJI.LLD().LJJII()) {
                    return;
                }
            } else {
                C1273890jFr c1273890jFr2 = this.LLILZLL;
                if (c1273890jFr2 == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(hashCode());
                    sbLIZ3.append(" switchCamera mLiveStream is null");
                    C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                AbstractC1273900jFs abstractC1273900jFs2 = c1273890jFr2.LJI;
                if (abstractC1273900jFs2 == null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(hashCode());
                    sbLIZ4.append(" switchCamera mLiveStream.getLiveCore() is null");
                    C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                if (abstractC1273900jFs2.LLD() != null) {
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(hashCode());
                sbLIZ5.append(" switchCamera mLiveStream.getLiveCore().getBuilder() is null");
                C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(hashCode());
        sbLIZ6.append(" switchCameraImpl openCamera=");
        sbLIZ6.append(z);
        sbLIZ6.append(",lastVideoCaptureDevice=");
        sbLIZ6.append(this.LLJIJIL);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ6));
        this.LLJI = z;
        if (MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (interfaceC1268640j7O = this.LLIZ) != null) {
            interfaceC1268640j7O.enable(this.LLJI);
        }
        if (this.LLJI) {
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
            }
            this.LLILZLL.L3(this.LLJIJIL, cert);
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs3 = this.LLILZLL.LJI;
        if (abstractC1273900jFs3 != null && abstractC1273900jFs3.LLD() != null && (iLJJII = this.LLILZLL.LJI.LLD().LJJII()) != 5) {
            this.LLJIJIL = iLJJII;
        }
        this.LLILZLL.L3(5, cert);
        LJIJJ();
    }

    @Override // X.InterfaceC754220TiG
    public final C1274030jG5 i3(C1275030jHh c1275030jHh, InterfaceC775310UbB interfaceC775310UbB) {
        return this.LLILZLL.i3(c1275030jHh, interfaceC775310UbB);
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJ(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVirtualAvatarPushParam width=");
        sbLIZ.append(i);
        sbLIZ.append(",height=");
        sbLIZ.append(i2);
        sbLIZ.append(",fps=");
        sbLIZ.append(i3);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
        C773070UUf c773070UUf = this.LLJJIII;
        if (c773070UUf != null) {
            c773070UUf.LJ(i, i2, i3);
            if (!this.LLJJIII.LIZLLL()) {
                return;
            }
            HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 21));
        }
    }

    @Override // X.C0UHE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 589840) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkVideo2View onMessageReceived i=");
            sbLIZ.append(i);
            sbLIZ.append(",i1=");
            sbLIZ.append(i2);
            sbLIZ.append(",i2=");
            sbLIZ.append(i3);
            sbLIZ.append(",s=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJILLL.LC0(MultiLetsDanceEffectMsgEvent.class, new C770110UIv(i, i2, i3, str));
        }
    }
}
