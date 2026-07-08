package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.broadcast.PauseOptPushFpsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0UUH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUH implements InterfaceC923870a9J, InterfaceC923890a9L {
    public final Context LL;
    public final SurfaceView LLILLJJLI;
    public final C758340Tou LLILLL;
    public final Object LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final C0UHA LLIZ;
    public final C1273890jFr LLIZLLLIL;
    public final InterfaceC1268640j7O LLJ;
    public boolean LLJI;
    public C11JF LLJIJIL;
    public boolean LLJILJIL;
    public final InterfaceC769000UEo LLJJ;
    public C2247601Cy6 LLJJI;
    public C773070UUf LLJJIII;
    public long LLJJIJI;
    public int LLJILJILJ = 1;
    public boolean LLJILLL = true;
    public final long LLJJIJIIJIL = LinkMicMockAvatarConfigSetting.INSTANCE.getValue().speakInterval;

    @Override // X.InterfaceC923870a9J
    public final /* synthetic */ void LIZ(String str, String str2) {
    }

    @Override // X.InterfaceC923890a9L
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC923870a9J
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJJI() {
        LJII(false);
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILJJIL() {
        LJII(true);
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIL() {
        C0UHA c0uha = this.LLIZ;
        if (c0uha != null) {
            Cert certFindCert = CertProviderManagerKt.findCert("bpea-multiguest_start_capture_video_in_preview_panel", 1476788234);
            InterfaceC769940UIe interfaceC769940UIe = c0uha.LLIZ;
            if (interfaceC769940UIe != null) {
                interfaceC769940UIe.z3(certFindCert);
                C0UHC.LIZ("capture_video");
                c0uha.LLJJIII = false;
            }
        }
    }

    @Override // X.InterfaceC923870a9J
    public final C0UH6 getEffectWrapperProxy() {
        return new C0UH3(this.LLIZ);
    }

    @Override // X.InterfaceC923890a9L
    public final Boolean LIZJ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC923870a9J
    public final boolean LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC923870a9J
    public final Object getAttachedComposerManager() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC923870a9J
    public final InterfaceC769940UIe getLiveStream() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC923870a9J
    public final void LJ(Cert cert) {
        C0UHA c0uha = this.LLIZ;
        if (c0uha != null) {
            c0uha.LJIIJ(cert);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJI(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLJILJILJ = i;
    }

    public final void LJII(boolean z) {
        if (System.currentTimeMillis() - this.LLJJIJI < this.LLJJIJIIJIL) {
            return;
        }
        C2247601Cy6 c2247601Cy6 = this.LLJJI;
        if (c2247601Cy6 != null) {
            c2247601Cy6.LIZ(z);
        }
        this.LLJJIJI = System.currentTimeMillis();
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIIIZ(C936050aSx c936050aSx) {
        AbstractC1273900jFs abstractC1273900jFs;
        AbstractC1273900jFs abstractC1273900jFs2;
        InterfaceC1268640j7O interfaceC1268640j7O;
        MultiGuestAvatarFeatureSetting multiGuestAvatarFeatureSetting = MultiGuestAvatarFeatureSetting.INSTANCE;
        if (multiGuestAvatarFeatureSetting.hasUseAbility() && (interfaceC1268640j7O = this.LLJ) != null) {
            interfaceC1268640j7O.enable(this.LLJILJIL);
        }
        this.LLJJIII = c936050aSx;
        if (multiGuestAvatarFeatureSetting.hasUseAbility()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("realUpdateVirtualAvatar avatarModel=");
            sbLIZ.append(this.LLJJIII);
            C20441214yg.LIZIZ("LinkMicPreviewView", C2188811AlT.LIZIZ(sbLIZ));
            C773070UUf c773070UUf = this.LLJJIII;
            Boolean boolValueOf = null;
            if (c773070UUf != null) {
                boolValueOf = Boolean.valueOf(c773070UUf.LIZLLL());
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C2247601Cy6 c2247601Cy6 = this.LLJJI;
                if (c2247601Cy6 != null) {
                    c2247601Cy6.LIZLLL();
                }
                C1273890jFr c1273890jFr = this.LLIZLLLIL;
                if (c1273890jFr != null && (abstractC1273900jFs2 = c1273890jFr.LJI) != null) {
                    c1273890jFr.s3(true);
                    C2247601Cy6 c2247601Cy62 = new C2247601Cy6(true);
                    this.LLJJI = c2247601Cy62;
                    c2247601Cy62.LIZIZ(this.LL, abstractC1273900jFs2, this.LLJJIII, true);
                    abstractC1273900jFs2.LJJLIL(4);
                    C2247601Cy6 c2247601Cy63 = this.LLJJI;
                    if (c2247601Cy63 != null) {
                        c2247601Cy63.LJFF();
                        if (Unit.LIZ != null) {
                            return;
                        }
                    }
                }
                C20441214yg.LJ("LinkMicPreviewView", "realUpdateVirtualAvatar livecore = null");
                return;
            }
            C2247601Cy6 c2247601Cy64 = this.LLJJI;
            if (c2247601Cy64 != null) {
                c2247601Cy64.LIZLLL();
            }
            C1273890jFr c1273890jFr2 = this.LLIZLLLIL;
            if (c1273890jFr2 == null || (abstractC1273900jFs = c1273890jFr2.LJI) == null) {
                return;
            }
            if (this.LLJILJIL) {
                abstractC1273900jFs.LJJLIL(this.LLJILJILJ);
            } else {
                abstractC1273900jFs.LJJLIL(5);
            }
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILL(Cert cert) {
        try {
            C1273890jFr c1273890jFr = this.LLIZLLLIL;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(cert);
            }
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZJ();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "LinkMicPreviewView", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIZILJ(Cert cert) {
        try {
            C1273890jFr c1273890jFr = this.LLIZLLLIL;
            if (c1273890jFr != null) {
                c1273890jFr.J3(cert, false);
            }
            C2247601Cy6 c2247601Cy6 = this.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LJFF();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIJ(6, "LinkMicPreviewView", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void release(Cert cert) {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        InterfaceC769000UEo interfaceC769000UEo = this.LLJJ;
        if (interfaceC769000UEo != null) {
            if (interfaceC769000UEo instanceof InterfaceC932350aMz) {
                interfaceC769000UEo.release();
            }
            InterfaceC769000UEo interfaceC769000UEo2 = this.LLJJ;
            if (interfaceC769000UEo2 instanceof C0U78) {
                ((C0U78) interfaceC769000UEo2).LJIIL();
            }
        }
        C0UHA c0uha = this.LLIZ;
        if (c0uha != null) {
            c0uha.LJIIZILJ(cert);
        }
        C1273890jFr c1273890jFr = this.LLIZLLLIL;
        if (c1273890jFr != null) {
            c1273890jFr.t3(cert);
            C1273890jFr c1273890jFr2 = this.LLIZLLLIL;
            if (c1273890jFr2 != null) {
                c1273890jFr2.LJIILL(cert);
            }
            C1273890jFr c1273890jFr3 = this.LLIZLLLIL;
            if (c1273890jFr3 != null) {
                c1273890jFr3.release(cert);
            }
        }
        C2247601Cy6 c2247601Cy6 = this.LLJJI;
        if (c2247601Cy6 != null) {
            c2247601Cy6.LIZLLL();
        }
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIIIZZ(Cert cert, boolean z) {
        C1273890jFr c1273890jFr = this.LLIZLLLIL;
        if (c1273890jFr != null) {
            c1273890jFr.LJIIIIZZ(cert, z);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILIIL(Cert cert, boolean z) {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        InterfaceC1268640j7O interfaceC1268640j7O;
        if (z == this.LLJILJIL) {
            return;
        }
        this.LLJILJIL = z;
        if (MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (interfaceC1268640j7O = this.LLJ) != null) {
            interfaceC1268640j7O.enable(this.LLJILJIL);
        }
        if (this.LLJILJIL) {
            C1273890jFr c1273890jFr = this.LLIZLLLIL;
            if (c1273890jFr != null) {
                c1273890jFr.L3(this.LLJILJILJ, cert);
                return;
            }
            return;
        }
        C1273890jFr c1273890jFr2 = this.LLIZLLLIL;
        if (c1273890jFr2 == null || (abstractC1273900jFs = c1273890jFr2.LJI) == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) {
            return;
        }
        int iLJJII = c1269340j8WLLD.LJJII();
        if (iLJJII != 5) {
            this.LLJILJILJ = iLJJII;
        }
        C1273890jFr c1273890jFr3 = this.LLIZLLLIL;
        if (c1273890jFr3 == null) {
            return;
        }
        c1273890jFr3.L3(5, cert);
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
        C20441214yg.LIZIZ("LinkMicPreviewView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C0UUH(Context context, SurfaceView surfaceView, C758340Tou c758340Tou, Object obj) {
        int i;
        int i2;
        this.LL = context;
        this.LLILLJJLI = surfaceView;
        this.LLILLL = c758340Tou;
        this.LLILZ = obj;
        boolean z = true;
        EnumC1309510kBJ enumC1309510kBJ = EnumC1309510kBJ.INST;
        String modelFilePath = enumC1309510kBJ.getModelFilePath();
        if (c758340Tou != null && c758340Tou.LIZLLL == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLJILJIL = true;
        if (c758340Tou != null && !c758340Tou.LJ) {
            this.LLJILJIL = false;
            i = 5;
        }
        if (C497740JfY.LJIL()) {
            i2 = 240;
        } else {
            i2 = 320;
        }
        int i3 = C497740JfY.LJIL() ? 320 : 240;
        C776280Uck c776280Uck = new C776280Uck(context);
        c776280Uck.LJJIFFI = C781270Ukn.LJIJJ().IG0();
        c776280Uck.LJJIL = new C1276880jKg();
        c776280Uck.LJJI = new C0UNM();
        c776280Uck.LJJIZ = new C0UH8();
        c776280Uck.LJIJJLI = i;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        c776280Uck.LJJJ = testEnableEffectSetting.disable() ? null : modelFilePath;
        c776280Uck.LJJJI = testEnableEffectSetting.disable() ? null : enumC1309510kBJ.getResourceFinder(context);
        c776280Uck.LJJJJ = i2;
        c776280Uck.LJJJJI = i3;
        c776280Uck.LJJJJLL = false;
        c776280Uck.LJJJJZ = true;
        c776280Uck.LJJL = true;
        c776280Uck.LJJJJZI = PauseOptPushFpsSetting.INSTANCE.getValue();
        C1273890jFr c1273890jFr = new C1273890jFr(c776280Uck.LIZ());
        this.LLIZLLLIL = c1273890jFr;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = c1273890jFr.LJIIL();
        this.LLJ = interfaceC1268640j7OLJIIL;
        if (surfaceView != null) {
            SurfaceView surfaceView2 = this.LLILLJJLI;
            C1273890jFr c1273890jFr2 = this.LLIZLLLIL;
            if (c758340Tou != null && !c758340Tou.LJFF) {
                z = false;
            }
            C0UHA c0uha = new C0UHA(surfaceView2, c1273890jFr2, z, false);
            c0uha.LLJILJILJ = C0UX8.EVENT_PAGE_MULTI_GUEST;
            this.LLIZ = c0uha;
        }
        if (obj instanceof InterfaceC769000UEo) {
            InterfaceC769000UEo interfaceC769000UEo = (InterfaceC769000UEo) obj;
            this.LLJJ = interfaceC769000UEo;
            if (interfaceC769000UEo != null) {
                C0UGC c0ugc = new C0UGC();
                c0ugc.LIZLLL = "guest_linkmic";
                c0ugc.LIZ = C0UD4.LJIIIZ;
                c0ugc.LIZJ = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getDefaultComposerHandler(interfaceC1268640j7OLJIIL, "LinkMicPreviewView");
                interfaceC769000UEo.or(new C0UG8(c0ugc));
            }
        }
        C0UHA c0uha2 = this.LLIZ;
        if (c0uha2 != null) {
            c0uha2.LLILZIL = new C0UGO() { // from class: X.0UUJ
                @Override // X.C0UGO
                public final void onError(int i4, int i5) {
                    this.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("status ");
                    sbLIZ.append(i4);
                    sbLIZ.append(' ');
                    sbLIZ.append(i5);
                    sbLIZ.append(' ');
                    sbLIZ.append((String) null);
                    C20441214yg.LJ("LinkMicPreviewView", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.C0UGO
                public final void onInfo(int i4, int i5, int i6, String str) {
                    if (i4 == 1) {
                        C0UUH c0uuh = this.LIZ;
                        if (!c0uuh.LLJI) {
                            C11O8 c11o8LJJJLZIJ = C11NZ.LJJJJZ(1).LJJJLZIJ(C1701940uOG.LIZIZ());
                            C0UUH c0uuh2 = this.LIZ;
                            c0uuh.LLJIJIL = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS181S0100000_12(c0uuh2, 34), new AfS181S0100000_12(c0uuh2, 35));
                        }
                    }
                }
            };
        }
        C20441214yg.LIZIZ("LinkMicPreviewView", "init");
    }
}
