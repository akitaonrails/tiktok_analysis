package X;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463650oBv extends AbstractC2255721DQs<InterfaceC1454690nxT> implements InterfaceC1454690nxT, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final CapCutTemplateMusic LLILLJJLI;
    public final InterfaceC1454690nxT LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 286));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1463650oBv.class, "musicApi", "getMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1463650oBv.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1463650oBv.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJ = 8;
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZ.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLIZLLLIL[2]);
    }

    public final InterfaceC1413540mt6 o2() {
        return (InterfaceC1413540mt6) this.LLILZ.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC1454960nxu w2() {
        return (InterfaceC1454960nxu) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String str = this.LLILLJJLI.templateId;
        if (str.length() > 0) {
            if (1 != 0) {
                InterfaceC1413540mt6 interfaceC1413540mt6O2 = o2();
                if (interfaceC1413540mt6O2 != null) {
                    interfaceC1413540mt6O2.LJ();
                }
                C527590Kmb.LIZ.getClass();
                final C527600Kmc c527600KmcLIZ = C527590Kmb.LIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("query musicInfo, templateId = ");
                sbLIZ.append(str);
                sbLIZ.append(", musicId = ");
                sbLIZ.append(c527600KmcLIZ != null ? c527600KmcLIZ.LIZ : null);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C1720306oT.LIZ;
                X1(str, c527600KmcLIZ != null ? c527600KmcLIZ.LIZ : null, new InterfaceC20498115It() { // from class: X.0oBu
                    @Override // X.InterfaceC20498115It
                    public final void onFailed(Exception exc) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CCTemplateMusicComponent ; onFailed : ");
                        sbLIZ2.append(Log.getStackTraceString(exc));
                        C0M7M.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC1413540mt6 interfaceC1413540mt6O22 = this.LIZ.o2();
                        if (interfaceC1413540mt6O22 != null) {
                            interfaceC1413540mt6O22.LJIIL();
                        }
                        C354270Duj.LIZ(500L, new AwS566S0100000_22(this.LIZ, 287));
                    }

                    @Override // X.InterfaceC20498115It
                    public final void onSuccess(MusicModel musicModel, String str2) {
                        AVMusic aVMusicApply;
                        int duration;
                        Integer numValueOf;
                        int i2;
                        InterfaceC1413540mt6 interfaceC1413540mt6O22 = this.LIZ.o2();
                        if (interfaceC1413540mt6O22 != null) {
                            interfaceC1413540mt6O22.LJIIL();
                        }
                        if (str2 != null && (aVMusicApply = new C15KP().apply(musicModel)) != null) {
                            C527600Kmc c527600Kmc = c527600KmcLIZ;
                            if (musicModel != null) {
                                duration = musicModel.getDuration();
                            } else {
                                duration = -1;
                            }
                            aVMusicApply.setDuration(C141Q.LIZIZ(duration, str2));
                            if (c527600Kmc != null) {
                                numValueOf = Integer.valueOf(c527600Kmc.LIZIZ);
                            } else {
                                numValueOf = null;
                            }
                            aVMusicApply.ccTemplateMusicStartTime = numValueOf;
                            if (c527600Kmc != null) {
                                i2 = c527600Kmc.LIZIZ;
                            } else {
                                i2 = 0;
                            }
                            aVMusicApply.setMusicStartFromCut(i2);
                            this.LIZ.W1(c527600KmcLIZ);
                            if (this.LIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                                if (C0MT6.LIZ()) {
                                    this.LIZ.w2().Rq(str2, aVMusicApply, false, false, false, false, -1L, false, true, "", false, null);
                                } else {
                                    C1452640nuA.LJII(aVMusicApply, false, this.LIZ.getEditModel().creativeModel.musicBuzModel);
                                    this.LIZ.w2().hr(new C1454900nxo(false, null, aVMusicApply, str2, false, 0L, 960));
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public InterfaceC1454690nxT Z1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void W1(C527600Kmc c527600Kmc) {
        C1463660oBw c1463660oBw;
        if (getEditModel().creativeModel.initialModel.wwaModel == null && c527600Kmc != null && (c1463660oBw = c527600Kmc.LIZJ) != null && c1463660oBw.LIZ != 0 && System.currentTimeMillis() - c1463660oBw.LIZ <= 3600000) {
            getEditModel().creativeModel.initialModel.wwaModel = new WWAModel(false, c1463660oBw.LIZIZ, c1463660oBw.LIZJ, c1463660oBw.LIZLLL, true, true, null);
        }
    }

    public C1463650oBv(C1DRG c1drg, CapCutTemplateMusic capCutTemplateMusic) {
        this.LL = c1drg;
        this.LLILLJJLI = capCutTemplateMusic;
    }

    private final void X1(String str, String str2, InterfaceC20498115It interfaceC20498115It) {
        if (str2 != null && str2.length() != 0) {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJ(getActivity(), str2, interfaceC20498115It);
        } else {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJI(getActivity(), interfaceC20498115It, str);
        }
    }
}
