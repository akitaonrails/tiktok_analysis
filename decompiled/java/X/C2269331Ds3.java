package X;

import android.app.Application;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.port.internal.IActivityPageService;
import com.ss.android.ugc.aweme.port.internal.IFluencyService;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.jvm.internal.AFwS226S0000000_35;
import lth.o;

/* JADX INFO: renamed from: X.1Ds3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269331Ds3 implements InterfaceC2269341Ds4 {
    public final Application LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2269231Drt());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2269321Ds2());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0MVH());
    public final C01GW LJ = C452501pT.LIZIZ(new C0MVJ());
    public final C01GW LJFF = C452501pT.LIZIZ(new C0MVK());
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJJII;
    public final C01GW LJJIII;
    public final C01GW LJJIIJ;
    public final C01GW LJJIIJZLJL;
    public final C01GW LJJIIZ;
    public final C01GW LJJIIZI;
    public final C01GW LJJIJ;
    public final C01GW LJJIJIIJI;
    public final C01GW LJJIJIIJIL;
    public final C01GW LJJIJIL;
    public final C01GW LJJIJL;
    public final C01GW LJJIJLIJ;
    public final C01GW LJJIL;
    public final C01GW LJJIZ;
    public final C01GW LJJJ;
    public final C01GW LJJJI;
    public final C01GW LJJJIL;
    public final C01GW LJJJJ;
    public final C01GW LJJJJI;
    public final C538790LBd LJJJJIZL;
    public final C0LC5 LJJJJJ;
    public final C538870LBl LJJJJJL;
    public final C0LCE LJJJJL;

    @Override // X.InterfaceC2269341Ds4
    public final void isRegressionTest() {
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1447180nlM LIZ() {
        return (InterfaceC1447180nlM) this.LJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C128L LIZIZ() {
        return (C128L) this.LJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1637880siw LIZJ() {
        return (InterfaceC1637880siw) this.LJJIJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1385405bY LIZLLL() {
        return (InterfaceC1385405bY) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0LH6 LJ() {
        return (C0LH6) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1429130nIF LJFF() {
        return (InterfaceC1429130nIF) this.LJJIJLIJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0M6F LJI() {
        return (C0M6F) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0MNC LJII() {
        return (C0MNC) this.LJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC523450Kfv LJIIIIZZ() {
        return (InterfaceC523450Kfv) this.LJJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C1634660sdk LJIIIZ() {
        return new C1634660sdk();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC573980MfE LJIIJ() {
        return (InterfaceC573980MfE) this.LJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final IActivityPageService LJIIL() {
        return (IActivityPageService) this.LJJJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1443020nee LJIILIIL() {
        return (InterfaceC1443020nee) this.LJJJJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC573550MeX LJIILJJIL() {
        return (InterfaceC573550MeX) this.LJJIJL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final IMediaCacheService LJIILL() {
        return (IMediaCacheService) this.LJJJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0MZB LJIILLIIL() {
        return (C0MZB) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJIIZILJ() {
        LiveRecordingsRepository.LIZ.getClass();
        LiveRecordingsRepository liveRecordingsRepository = (LiveRecordingsRepository) PluggableExtentionKt.pluggableSpi$default(LiveRecordingsRepository.class, false, false, false, 14, null);
        if (liveRecordingsRepository != null) {
            liveRecordingsRepository.release();
        }
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1621700sIq LJIJ() {
        return (InterfaceC1621700sIq) this.LJJIJIIJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0MWI LJIJJ() {
        return (C0MWI) this.LJJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC19561311g3 LJIJJLI() {
        return (InterfaceC19561311g3) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1432340nNQ LJJI() {
        return (InterfaceC1432340nNQ) this.LJJIZ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C1444300ngi LJJIII() {
        return new C1444300ngi();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1416920myY LJJIIJ() {
        return (InterfaceC1416920myY) this.LJJJJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC579820Moe LJJIIJZLJL() {
        return (InterfaceC579820Moe) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final IVideoConfigService LJJIIZ() {
        return (IVideoConfigService) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1444620nhE LJJIIZI() {
        return (InterfaceC1444620nhE) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJJIJIL() {
        Application application = o.LIZ;
        if (C993500bxc.LIZIZ.getFirst() == EnumC992780bwS.NO_FETCH) {
            C993500bxc.LIZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1001620cAi(null), 2);
        }
    }

    @Override // X.InterfaceC2269341Ds4
    public final Gson LJJIJL() {
        return (Gson) this.LJJIIZI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1642310sq5 LJJIL() {
        return (InterfaceC1642310sq5) this.LJJIFFI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC194362112i LJJJ() {
        return (InterfaceC194362112i) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC530910Krx LJJJI() {
        return (InterfaceC530910Krx) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1443320nf8 LJJJIL() {
        return (InterfaceC1443320nf8) this.LJIJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C2208671BcP LJJJJ() {
        return (C2208671BcP) this.LJJI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final IFluencyService LJJJJI() {
        return (IFluencyService) this.LJJJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC530040KqY LJJJJIZL() {
        return (InterfaceC530040KqY) this.LJFF.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC577910MlZ LJJJJJ() {
        return (InterfaceC577910MlZ) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC349000DmE LJJJJJL() {
        return (InterfaceC349000DmE) this.LJII.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1623990sMX LJJJJL() {
        return (InterfaceC1623990sMX) this.LJJIIJZLJL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final IVideoConfigService LJJJJLI() {
        return (IVideoConfigService) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC536090L0t LJJJJLL() {
        return (InterfaceC536090L0t) this.LJJIJIL.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C20500515Jr LJJJLIIL() {
        return new C20500515Jr();
    }

    public final IFoundationAVServiceProxy LJJJLL() {
        return (IFoundationAVServiceProxy) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC530910Krx getAlbumService() {
        return (InterfaceC530910Krx) this.LJIJJLI.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final Gson getGson() {
        return (Gson) this.LJJIIZ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1439070nYH getPublishService() {
        return (InterfaceC1439070nYH) this.LJIJ.getValue();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void isDebugConfigOpen() {
        C2269531DsN.LIZ.getClass();
    }

    @Override // X.InterfaceC2269341Ds4
    public final String LJJIJIIJIL() {
        return getAppLanguage();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJJIZ() {
        o.LJFF(C2216131BoR.LIZ());
        TEInterface.nativeSetMaxDetectFrameCount(C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_edit_hdr_v2_max_cache_size", true));
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1457290o1f getAccountService() {
        return LJJJLL().getAccountService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final String getAppLanguage() {
        return ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC2236708pZ getApplicationService() {
        return LJJJLL().getApplicationService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C12VK getBridgeService() {
        return LJJJLL().getBridgeService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC566530MJv getChallengeService() {
        return LJJJLL().getChallengeService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1631390sYT getCommerceService() {
        return LJJJLL().getCommerceService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1631380sYS getIStickerPropService() {
        return LJJJLL().getIStickerPropService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC194501117r getLocalHashTagService() {
        return LJJJLL().getLocalHashTagService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1445350niP getNetworkService() {
        return LJJJLL().getNetworkService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC2385909Wn getRegionService() {
        return LJJJLL().getRegionService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1213410hgJ getUiService() {
        return LJJJLL().getUiService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final long getUpdateVersionCode() {
        return ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVAppContextManager().getUpdateVersionCode();
    }

    @Override // X.InterfaceC2269341Ds4
    public final long getVersionCode() {
        return ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVAppContextManager().getVersionCode();
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1624140sMm unlockStickerService() {
        return LJJJLL().unlockStickerService();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJIIJJI() {
        isDebugConfigOpen();
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJIJI() {
    }

    @Override // X.InterfaceC2269341Ds4
    public final C538790LBd LJIL() {
        return this.LJJJJIZL;
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJJ() {
        o.LJIIIIZZ();
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0LC5 LJJIFFI() {
        return this.LJJJJJ;
    }

    @Override // X.InterfaceC2269341Ds4
    public final C538870LBl LJJII() {
        return this.LJJJJJL;
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC2269341Ds4
    public final C0LCE LJJIJLIJ() {
        return this.LJJJJL;
    }

    @Override // X.InterfaceC2269341Ds4
    public final void LJJJJZ() {
        C804770Vhb c804770Vhb = C804770Vhb.LIZ;
    }

    @Override // X.InterfaceC2269341Ds4
    public final C545370LaB LJJJJZI() {
        return C545370LaB.LIZ;
    }

    @Override // X.InterfaceC2269341Ds4
    public final void initDownloadableModel() {
        o.LIZLLL();
    }

    public C2269331Ds3(Application application) {
        C0LCF c0lcfLJIJJLI;
        this.LIZ = application;
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LJI = C452501pT.LIZ(enumC452301pR, new C0MVD());
        this.LJII = C452501pT.LIZ(enumC452301pR, new C2269311Ds1());
        this.LJIIIIZZ = C452501pT.LIZIZ(new C2207701Baq());
        this.LJIIIZ = C452501pT.LIZIZ(new C2269451DsF());
        this.LJIIJ = C452501pT.LIZIZ(new C2269261Drw());
        this.LJIIJJI = C452501pT.LIZIZ(new C2269401DsA());
        this.LJIIL = C452501pT.LIZIZ(new C2269241Dru());
        this.LJIILIIL = C452501pT.LIZIZ(new C2269501DsK());
        this.LJIILJJIL = C452501pT.LIZIZ(new C2269421DsC());
        this.LJIILL = C452501pT.LIZIZ(new C2297808zQ());
        this.LJIILLIIL = C452501pT.LIZIZ(new C577990Mlh());
        this.LJIIZILJ = C452501pT.LIZIZ(new C12VM());
        this.LJIJ = C452501pT.LIZIZ(new C2269381Ds8());
        this.LJIJI = C452501pT.LIZIZ(new C2269301Ds0());
        this.LJIJJ = C452501pT.LIZIZ(new C0MVL());
        this.LJIJJLI = C452501pT.LIZIZ(new C2269351Ds5(this));
        this.LJIL = C452501pT.LIZIZ(new C2269461DsG());
        this.LJJ = C452501pT.LIZIZ(new C0MVF());
        this.LJJI = C452501pT.LIZIZ(new C2208741BcW(this));
        this.LJJIFFI = C452501pT.LIZIZ(new C2269471DsH());
        this.LJJII = C452501pT.LIZIZ(new C2269411DsB());
        this.LJJIII = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(355));
        this.LJJIIJ = C452501pT.LIZIZ(new C2269371Ds7());
        this.LJJIIJZLJL = C452501pT.LIZIZ(new C2269361Ds6());
        this.LJJIIZ = C452501pT.LIZIZ(new C2207681Bao());
        this.LJJIIZI = C452501pT.LIZIZ(new C2346109Hf());
        this.LJJIJ = C452501pT.LIZIZ(new C2297908zR());
        this.LJJIJIIJI = C452501pT.LIZIZ(new C2269431DsD());
        this.LJJIJIIJIL = C452501pT.LIZIZ(new C124M());
        this.LJJIJIL = C452501pT.LIZIZ(new C0MVI());
        this.LJJIJL = C452501pT.LIZIZ(new C2269391Ds9());
        this.LJJIJLIJ = C452501pT.LIZIZ(new C2269441DsE());
        this.LJJIL = C452501pT.LIZIZ(new C0MVE());
        this.LJJIZ = C452501pT.LIZIZ(new C2269491DsJ());
        this.LJJJ = C452501pT.LIZIZ(new C23205097j());
        this.LJJJI = C452501pT.LIZIZ(new C2269291Drz());
        this.LJJJIL = C452501pT.LIZIZ(new C2269481DsI());
        this.LJJJJ = C452501pT.LIZIZ(new C2297708zP());
        this.LJJJJI = C452501pT.LIZIZ(new C0MVG());
        this.LJJJJIZL = new C538790LBd();
        this.LJJJJJ = new C0LC5();
        this.LJJJJJL = new C538870LBl();
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            c0lcfLJIJJLI = iTextToImageService.LJIJJLI();
        } else {
            c0lcfLJIJJLI = null;
        }
        this.LJJJJL = c0lcfLJIJJLI;
    }

    @Override // X.InterfaceC2269341Ds4
    public final InterfaceC1642310sq5 LJJIJ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1289007392) {
                if (iHashCode != -351781237) {
                    if (iHashCode == 872464206 && str.equals("ttnowfilter")) {
                        return C1639930smF.LIZ.LIZIZ();
                    }
                } else if (str.equals("story_new_editfilter")) {
                    return (InterfaceC1642310sq5) this.LJJIII.getValue();
                }
            } else if (str.equals("story-editeffects")) {
                return (InterfaceC1642310sq5) this.LJJII.getValue();
            }
        }
        return LJJIL();
    }
}
