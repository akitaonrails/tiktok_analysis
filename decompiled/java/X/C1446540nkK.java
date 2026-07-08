package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446540nkK extends AbstractC2255721DQs<InterfaceC1454950nxt> implements InterfaceC1454950nxt, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1454950nxt LLILZIL = this;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 431));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1446540nkK.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1446540nkK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1446540nkK.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZLLLIL = 8;
    }

    private final InterfaceC1446570nkN X1() {
        return (InterfaceC1446570nkN) this.LLILZLL.getValue();
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLIZ[1]);
    }

    @Override // X.InterfaceC1454950nxt
    public void gs() {
        boolean z;
        InterfaceC1446570nkN interfaceC1446570nkNX1;
        AudioEnhanceParam audioEnhanceParam;
        AudioEnhanceParam audioEnhanceParam2;
        if (!((CreativeToolsEntranceReversalConfig) C1439110nYL.LIZIZ.getValue()).hideNoiseReduceOnEditPage || w2().mIsFromDraft) {
            if (((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
                w2().setAudioEnhanceParam(new AudioEnhanceParam(false, false, false, false));
                return;
            }
            AudioEnhanceParam audioEnhanceParam3 = w2().getAudioEnhanceParam();
            if (audioEnhanceParam3 != null) {
                audioEnhanceParam3.getSupportOriginEnhance();
            }
            AudioEnhanceParam audioEnhanceParam4 = w2().getAudioEnhanceParam();
            boolean supportMusicEnhance = audioEnhanceParam4 != null ? audioEnhanceParam4.getSupportMusicEnhance() : false;
            AudioEnhanceParam audioEnhanceParam5 = w2().getAudioEnhanceParam();
            boolean enableOriginEnhance = audioEnhanceParam5 != null ? audioEnhanceParam5.getEnableOriginEnhance() : false;
            AudioEnhanceParam audioEnhanceParam6 = w2().getAudioEnhanceParam();
            boolean enableMusicEnhance = audioEnhanceParam6 != null ? audioEnhanceParam6.getEnableMusicEnhance() : false;
            AudioEnhanceParam audioEnhanceParam7 = w2().getAudioEnhanceParam();
            if (audioEnhanceParam7 != null && C1439120nYM.LIZ(audioEnhanceParam7, w2())) {
                if (!w2().mIsFromDraft) {
                    if (w2().getOrigin() == 1) {
                        enableOriginEnhance = C0A1O.LIZ();
                    } else {
                        Keva keva = C1446590nkP.LIZ;
                        enableOriginEnhance = C1446590nkP.LIZ.getBoolean("audio_music_sound", C0A1O.LIZ());
                    }
                }
                z = true;
            } else {
                enableOriginEnhance = false;
                z = false;
            }
            if (!C571480MbC.LIZ()) {
                supportMusicEnhance = false;
                enableMusicEnhance = false;
            } else if (!w2().mIsFromDraft) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(w2().creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null && !aVMusicExtractAVMusic.isPgc()) {
                    supportMusicEnhance = true;
                } else if (supportMusicEnhance) {
                }
                if (w2().getOrigin() == 1) {
                    enableMusicEnhance = C0A1O.LIZ();
                } else {
                    Keva keva2 = C1446590nkP.LIZ;
                    enableMusicEnhance = C1446590nkP.LIZ.getBoolean("audio_music_sound", C0A1O.LIZ());
                }
            }
            w2().setAudioEnhanceParam(new AudioEnhanceParam(z, supportMusicEnhance, enableOriginEnhance, enableMusicEnhance));
            if (C1446580nkO.LIZ() && (audioEnhanceParam = w2().getAudioEnhanceParam()) != null && (audioEnhanceParam.getSupportOriginEnhance() || audioEnhanceParam.getSupportMusicEnhance())) {
                o2().rm(14, true);
                InterfaceC1460000o62 interfaceC1460000o62O2 = o2();
                AudioEnhanceParam audioEnhanceParam8 = w2().getAudioEnhanceParam();
                interfaceC1460000o62O2.Tx(audioEnhanceParam8 != null ? C349220Dma.LIZ(audioEnhanceParam8) : false);
                Keva keva3 = C1446590nkP.LIZ;
                if (!keva3.getBoolean("display_noise_on_v3", false) && (audioEnhanceParam2 = w2().getAudioEnhanceParam()) != null && C349220Dma.LIZ(audioEnhanceParam2)) {
                    Activity activityLJII = C1664590tQ1.LJII(this);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131838194);
                    C1390380mHk.LIZ(activityLJII, 3043, creativeToastBuilder);
                    keva3.storeBoolean("display_noise_on_v3", true);
                }
            } else {
                o2().rm(14, false);
            }
            if (G2() == null || (interfaceC1446570nkNX1 = X1()) == null) {
                return;
            }
            interfaceC1446570nkNX1.gs();
        }
    }

    public final InterfaceC1460000o62 o2() {
        return (InterfaceC1460000o62) this.LLILZ.getValue(this, LLIZ[2]);
    }

    public final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    public final InterfaceC1452170ntP G2() {
        return Z1().g().getValue();
    }

    @Override // X.InterfaceC1454950nxt
    public void dm() {
        AudioEnhanceParam audioEnhanceParam = w2().getAudioEnhanceParam();
        G50(!(audioEnhanceParam != null && C349220Dma.LIZ(audioEnhanceParam)), true);
        AudioEnhanceParam audioEnhanceParam2 = w2().getAudioEnhanceParam();
        String str = (audioEnhanceParam2 == null || !C349220Dma.LIZ(audioEnhanceParam2)) ? "off" : "on";
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", w2().getEnterFrom());
        c0lab.LJ("shoot_way", w2().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(w2()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(w2()));
        c0lab.LJ("creation_id", w2().getCreationId());
        c0lab.LJ("noise_reducer_status", str);
        c0lab.LJ("enter_type", u4.LJIJJLI(w2()));
        C20684815ws.LJIILLIIL("click_noise_reducer_icon", c0lab.LIZ);
    }

    public final AbstractC1452680nuE gc() {
        AbstractC1452680nuE abstractC1452680nuEGc = Z1().gc();
        if (abstractC1452680nuEGc != null) {
            return abstractC1452680nuEGc;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1454950nxt
    public void zY() {
        boolean z;
        boolean supportOriginEnhance;
        boolean enableOriginEnhance;
        AVMusic aVMusicExtractAVMusic;
        if (((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
            return;
        }
        AudioEnhanceParam audioEnhanceParam = w2().getAudioEnhanceParam();
        if (audioEnhanceParam != null) {
            audioEnhanceParam.getSupportMusicEnhance();
        }
        boolean enableMusicEnhance = audioEnhanceParam != null ? audioEnhanceParam.getEnableMusicEnhance() : false;
        if (!C571480MbC.LIZ() || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(w2().creativeModel.musicBuzModel)) == null || aVMusicExtractAVMusic.isPgc()) {
            z = false;
            enableMusicEnhance = false;
        } else {
            z = true;
            if (w2().getOrigin() != 1) {
                Keva keva = C1446590nkP.LIZ;
                enableMusicEnhance = C1446590nkP.LIZ.getBoolean("audio_music_sound", C0A1O.LIZ());
            }
        }
        VideoPublishEditModel videoPublishEditModelW2 = w2();
        if (audioEnhanceParam != null) {
            supportOriginEnhance = audioEnhanceParam.getSupportOriginEnhance();
            enableOriginEnhance = audioEnhanceParam.getEnableOriginEnhance();
        } else {
            supportOriginEnhance = false;
            enableOriginEnhance = false;
        }
        videoPublishEditModelW2.setAudioEnhanceParam(new AudioEnhanceParam(supportOriginEnhance, z, enableOriginEnhance, enableMusicEnhance));
        C0CNO.LIZLLL(0L, new AwS566S0100000_22(this, 433));
        AudioEnhanceParam audioEnhanceParam2 = w2().getAudioEnhanceParam();
        if (audioEnhanceParam2 == null || !C349220Dma.LIZ(audioEnhanceParam2)) {
            InterfaceC1446570nkN interfaceC1446570nkNX1 = X1();
            if (interfaceC1446570nkNX1 != null) {
                interfaceC1446570nkNX1.LIZ();
                return;
            }
            return;
        }
        InterfaceC1446570nkN interfaceC1446570nkNX12 = X1();
        if (interfaceC1446570nkNX12 != null) {
            interfaceC1446570nkNX12.LIZLLL(null);
        }
    }

    public InterfaceC1454950nxt W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1446540nkK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1454950nxt
    public void G50(boolean z, final boolean z2) {
        boolean supportOriginEnhance;
        boolean supportMusicEnhance;
        boolean supportOriginEnhance2;
        boolean supportOriginEnhance3;
        boolean supportMusicEnhance2;
        AudioEnhanceParam audioEnhanceParam = w2().getAudioEnhanceParam();
        boolean supportMusicEnhance3 = false;
        if (audioEnhanceParam != null && C349220Dma.LIZ(audioEnhanceParam) == z) {
            return;
        }
        AudioEnhanceParam audioEnhanceParam2 = w2().getAudioEnhanceParam();
        if (audioEnhanceParam2 != null && C349220Dma.LIZ(audioEnhanceParam2)) {
            VideoPublishEditModel videoPublishEditModelW2 = w2();
            if (audioEnhanceParam != null) {
                supportOriginEnhance3 = audioEnhanceParam.getSupportOriginEnhance();
                supportMusicEnhance2 = audioEnhanceParam.getSupportMusicEnhance();
            } else {
                supportOriginEnhance3 = false;
                supportMusicEnhance2 = false;
            }
            videoPublishEditModelW2.setAudioEnhanceParam(new AudioEnhanceParam(supportOriginEnhance3, supportMusicEnhance2, false, false));
            InterfaceC1446570nkN interfaceC1446570nkNX1 = X1();
            if (interfaceC1446570nkNX1 != null) {
                interfaceC1446570nkNX1.LIZ();
            }
            o2().Tx(false);
            if (z2) {
                Activity activityLJII = C1664590tQ1.LJII(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131838192);
                C1390380mHk.LIZ(activityLJII, 3044, creativeToastBuilder);
            }
            if (w2().getOrigin() != 1) {
                C1446590nkP.LIZ.storeBoolean("audio_music_sound", false);
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModelW22 = w2();
        if (audioEnhanceParam != null) {
            supportOriginEnhance = audioEnhanceParam.getSupportOriginEnhance();
            supportMusicEnhance = audioEnhanceParam.getSupportMusicEnhance();
            supportOriginEnhance2 = audioEnhanceParam.getSupportOriginEnhance();
            supportMusicEnhance3 = audioEnhanceParam.getSupportMusicEnhance();
        } else {
            supportOriginEnhance = false;
            supportMusicEnhance = false;
            supportOriginEnhance2 = false;
        }
        videoPublishEditModelW22.setAudioEnhanceParam(new AudioEnhanceParam(supportOriginEnhance, supportMusicEnhance, supportOriginEnhance2, supportMusicEnhance3));
        InterfaceC1446570nkN interfaceC1446570nkNX12 = X1();
        if (interfaceC1446570nkNX12 == null) {
            return;
        }
        interfaceC1446570nkNX12.LIZLLL(new InterfaceC349260Dme() { // from class: X.0nkL
            @Override // X.InterfaceC349260Dme
            public final void onFailure() {
                if (z2) {
                    C0CNO.LIZLLL(0L, new AwS566S0100000_22(this.LIZ, 432));
                }
            }

            @Override // X.InterfaceC349260Dme
            public final void onSuccess() {
                C0CNO.LIZLLL(0L, new AwS139S0110000_22(this.LIZ, z2, 4));
            }
        });
    }
}
