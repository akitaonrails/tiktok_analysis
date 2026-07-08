package X;

import Y.ACListenerS143S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MS8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MS8 extends AbstractC2255721DQs<InterfaceC568180MQe> implements InterfaceC568180MQe, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LL;
    public final Function0<ForwardMedia> LLILLJJLI;
    public final Function0<Integer> LLILLL;
    public List<? extends AVMusic> LLJJIJI;
    public final InterfaceC568180MQe LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), OnThisDayCardPreviewScene.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), C1457860o2a.class, null);
    public final View LLJIJIL = i3().mView.findViewById(R.id.bmy);
    public final View LLJILJIL = i3().mView.findViewById(R.id.view_all);
    public final View LLJILJILJ = i3().mView.findViewById(R.id.uuu);
    public final View LLJILLL = i3().mView.findViewById(R.id.ott);
    public final View LLJJ = i3().mView.findViewById(R.id.jge);
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 658));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 657));
    public final MutableLiveData<MusicBuzModel> LLJJIJIIJIL = new MutableLiveData<>();
    public final C560530Lyd<Boolean> LLJJIJIL = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MS8.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MS8.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MS8.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MS8.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MS8.class, "onThisDayPreviewScene", "getOnThisDayPreviewScene()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/OnThisDayCardPreviewScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0MS8.class, "chooseMusicConfig", "getChooseMusicConfig()Lcom/ss/android/ugc/aweme/port/in/music/ChooseMusicConfig;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJJIL = 8;
    }

    @Override // X.InterfaceC568180MQe, X.InterfaceC1455160nyE
    public void Q4(String str, int i, int i2, int i3, boolean z) {
    }

    @Override // X.InterfaceC568180MQe, X.InterfaceC1455160nyE
    public void t3() {
        W1(false);
    }

    private final C1457860o2a G2() {
        return (C1457860o2a) this.LLJI.getValue(this, LLJJJ[5]);
    }

    private final InterfaceC1460000o62 T2() {
        return (InterfaceC1460000o62) this.LLILZLL.getValue(this, LLJJJ[1]);
    }

    private final VideoPublishEditModel W2() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJJ[2]);
    }

    private final InterfaceC1454960nxu c3() {
        return (InterfaceC1454960nxu) this.LLIZLLLIL.getValue(this, LLJJJ[3]);
    }

    public final InterfaceC1453200nv4 H2() {
        return (InterfaceC1453200nv4) this.LLILZIL.getValue(this, LLJJJ[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // X.InterfaceC568180MQe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void WH2() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MS8.WH2():void");
    }

    public final OnThisDayCardPreviewScene i3() {
        return (OnThisDayCardPreviewScene) this.LLJ.getValue(this, LLJJJ[4]);
    }

    public final AnonymousClass1188 o2() {
        return (AnonymousClass1188) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        VideoPublishEditModel videoPublishEditModelW2;
        VideoPublishEditModel videoPublishEditModelW22;
        VideoPublishEditModel videoPublishEditModelW23;
        super.onCreate();
        nD1();
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.Jf1(false, false);
        }
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 98), this.LLJILLL);
        VideoPublishEditModel videoPublishEditModelW24 = W2();
        boolean z = videoPublishEditModelW24 != null && videoPublishEditModelW24.getVideoCount() == 0 && (((videoPublishEditModelW2 = W2()) != null && C1428470nHB.LJJZZI(videoPublishEditModelW2)) || (((videoPublishEditModelW22 = W2()) != null && C1428470nHB.LJLIIL(videoPublishEditModelW22)) || ((videoPublishEditModelW23 = W2()) != null && C1428470nHB.LJZI(videoPublishEditModelW23))));
        C1458410o3T c1458410o3T = C1458410o3T.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = W2().mShootWay;
        if (str == null) {
            str = "";
        }
        c1458410o3T.LIZ(5, jCurrentTimeMillis, false, str, C1442040nd4.LJ(W2(), 0L, false, null, null, false, 0L, false, null, null, false, 1022), null, true, z, "", "", i3().requireActivity(), "tos_uri").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 44));
    }

    public final void v3() {
        ForwardMedia forwardMediaInvoke = this.LLILLJJLI.invoke();
        List<? extends AVMusic> list = this.LLJJIJI;
        if (list == null || list.isEmpty() || forwardMediaInvoke == null || !C566580MKa.LIZ(forwardMediaInvoke).LIZ()) {
            return;
        }
        C568280MQo.LIZ(this, true, false, 2);
    }

    public final AnonymousClass1188 w2() {
        return (AnonymousClass1188) this.LLJJI.getValue();
    }

    private final void X1() {
        c3().cr();
        C1403470mcr.LJFF(W2());
    }

    private final void nD1() {
        LiveData<Pair<Boolean, Boolean>> liveDataX8;
        LiveData<Integer> liveDataWw;
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null && (liveDataWw = interfaceC1460000o62T2.ww()) != null) {
            liveDataWw.observe(this, new AObserverS212S0100000_8(this, 65));
        }
        InterfaceC1460000o62 interfaceC1460000o62T22 = T2();
        if (interfaceC1460000o62T22 == null || (liveDataX8 = interfaceC1460000o62T22.x8()) == null) {
            return;
        }
        liveDataX8.observe(this, new AObserverS212S0100000_8(this, 66));
    }

    @Override // X.InterfaceC568180MQe, X.InterfaceC1455160nyE
    public void LLJL() {
        ForwardMedia forwardMediaInvoke;
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.Jf1(true, true);
        }
        if (!((Boolean) C272810Amd.LIZ.getValue()).booleanValue() || (forwardMediaInvoke = this.LLILLJJLI.invoke()) == null || forwardMediaInvoke.localMedia == null) {
            W2().creativeModel.onThisDayData.setMoveMusicToTop(false);
        } else {
            C568280MQo.LIZ(this, false, true, 1);
            W2().creativeModel.onThisDayData.setMoveMusicToTop(true);
        }
        if (C0MT6.LIZ()) {
            C1403470mcr.LJII(W2(), "ai_panel", 26);
            W1(true);
        } else {
            C1403470mcr.LJII(W2(), null, 30);
            X1();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        MusicBuzModel musicBuzModel;
        super.onResume();
        MusicBuzModel musicBuzModel2 = W2().creativeModel.musicBuzModel;
        ForwardMedia forwardMediaInvoke = this.LLILLJJLI.invoke();
        MusicBeanUtilKt.updateAVMusic(musicBuzModel2, (forwardMediaInvoke == null || (musicBuzModel = C566580MKa.LIZ(forwardMediaInvoke).LIZIZ) == null) ? null : MusicBeanUtilKt.extractAVMusic(musicBuzModel));
    }

    @Override // X.InterfaceC568180MQe
    public void z3() {
        InterfaceC1460000o62 interfaceC1460000o62T2 = T2();
        if (interfaceC1460000o62T2 != null) {
            interfaceC1460000o62T2.Jf1(false, false);
        }
    }

    public InterfaceC568180MQe Z1() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC568180MQe
    public LiveData<MusicBuzModel> b7() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC568180MQe
    public LiveEvent<Boolean> zQ() {
        return this.LLJJIJIL;
    }

    private final void W1(boolean z) {
        boolean zIsMvThemeMusic;
        q3(z);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(W2().creativeModel.musicBuzModel);
        boolean z2 = false;
        if (aVMusicExtractAVMusic != null) {
            zIsMvThemeMusic = aVMusicExtractAVMusic.isMvThemeMusic();
        } else {
            zIsMvThemeMusic = false;
        }
        InterfaceC1454960nxu interfaceC1454960nxuC3 = c3();
        if (C570830Ma9.LIZIZ(W2()) && !zIsMvThemeMusic) {
            z2 = true;
        }
        interfaceC1454960nxuC3.eg(z2);
    }

    private final boolean m3(ForwardMedia forwardMedia) {
        MediaModel mediaModel;
        if (forwardMedia != null) {
            mediaModel = forwardMedia.localMedia;
        } else {
            mediaModel = null;
        }
        if (mediaModel != null) {
            MediaModel mediaModel2 = forwardMedia.localMedia;
            if (mediaModel2 != null && mediaModel2.LJIIJ()) {
                return false;
            }
        } else {
            if (forwardMedia == null || !C565720MGs.LIZ(forwardMedia)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final void q3(boolean z) {
        InterfaceC1453200nv4 interfaceC1453200nv4H2 = H2();
        if (interfaceC1453200nv4H2 != null) {
            interfaceC1453200nv4H2.LJJ(z);
        }
    }

    @Override // X.InterfaceC568180MQe
    public void IV0(boolean z) {
        float f;
        ForwardMedia forwardMediaInvoke = this.LLILLJJLI.invoke();
        if (forwardMediaInvoke != null) {
            C566580MKa.LIZ(forwardMediaInvoke).LIZ = z;
        }
        VideoPublishEditModel videoPublishEditModelW2 = W2();
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.setHasOriginalSound(m3(forwardMediaInvoke));
        audioRecorderParam.setNeedOriginalSound(z);
        float voiceVolume = 0.0f;
        if (audioRecorderParam.getHasOriginalSound() && z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        audioRecorderParam.setVoiceVolume(f);
        videoPublishEditModelW2.setVeAudioRecorderParam(audioRecorderParam);
        VideoPublishEditModel videoPublishEditModelW22 = W2();
        AudioRecorderParam veAudioRecorderParam = W2().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            voiceVolume = veAudioRecorderParam.getVoiceVolume();
        }
        videoPublishEditModelW22.setVoiceVolume(voiceVolume);
    }

    @Override // X.InterfaceC568180MQe
    public void LLLLZI(boolean z) {
        float f;
        MusicBuzModel musicBuzModel;
        VideoPublishEditModel videoPublishEditModelW2 = W2();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        videoPublishEditModelW2.setMusicVolume(f);
        W2().creativeModel.musicBuzModel.enableMusicSound = z;
        ForwardMedia forwardMediaInvoke = this.LLILLJJLI.invoke();
        if (forwardMediaInvoke != null && (musicBuzModel = C566580MKa.LIZ(forwardMediaInvoke).LIZIZ) != null) {
            musicBuzModel.enableMusicSound = z;
        }
        this.LLJJIJIL.LJIIIZ(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    @Override // X.InterfaceC568180MQe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void AA1(boolean r120, boolean r121) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MS8.AA1(boolean, boolean):void");
    }

    public C0MS8(C1DRG c1drg, Function0<ForwardMedia> function0, Function0<Integer> function02) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }
}
