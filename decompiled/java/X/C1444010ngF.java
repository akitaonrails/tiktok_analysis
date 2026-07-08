package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0ngF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444010ngF extends AbstractC2255721DQs<InterfaceC1459480o5C> implements InterfaceC1459480o5C, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public String LLILZLL;
    public AVMusic LLIZ;
    public String LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1444010ngF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1444010ngF.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1444010ngF.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1444010ngF.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJI = 8;
    }

    public InterfaceC1459480o5C X1() {
        return this;
    }

    private final InterfaceC1454960nxu G2() {
        return (InterfaceC1454960nxu) this.LLILZIL.getValue(this, LLJ[3]);
    }

    private final boolean T2() {
        String str = this.LLILZLL;
        if (str == null || str.length() == 0 || !w2().creativeModel.musicBuzModel.hasRecordLastSelectMusic) {
            return false;
        }
        W1();
        MusicBuzModel musicBuzModel = w2().creativeModel.musicBuzModel;
        C1452640nuA.LJII(this.LLIZ, musicBuzModel.isPhotoMvModeMusic, musicBuzModel);
        musicBuzModel.musicPath = this.LLILZLL;
        if (C0MT6.LIZ()) {
            G2().Rq(this.LLILZLL, this.LLIZ, H2(this.LLIZLLLIL), false, false, false, -1L, false, true, "", false, null);
            return true;
        }
        Boolean bool = Boolean.FALSE;
        String str2 = this.LLIZLLLIL;
        if (str2 == null) {
            str2 = "others";
        }
        AVMusic aVMusic = this.LLIZ;
        G2().hr(C1421090n5H.LIZ(bool, str2, aVMusic, this.LLILZLL, null, true, null, aVMusic != null ? aVMusic.getDuration() : 0L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
        return true;
    }

    private final void W1() {
        String musicId;
        String str = this.LLIZLLLIL;
        if (str == null) {
            return;
        }
        w2().setMusicOrigin(str);
        AVMusic aVMusic = this.LLIZ;
        if (aVMusic == null || (musicId = aVMusic.getMusicId()) == null) {
            return;
        }
        G2().fr(musicId, str);
    }

    private final InterfaceC1453200nv4 Z1() {
        return (InterfaceC1453200nv4) this.LLILLL.getValue(this, LLJ[1]);
    }

    private final InterfaceC1413540mt6 o2() {
        return (InterfaceC1413540mt6) this.LLILZ.getValue(this, LLJ[2]);
    }

    private final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    @Override // X.InterfaceC1459480o5C
    public void QI1() {
        InterfaceC1453200nv4 interfaceC1453200nv4Z1;
        i21();
        if (Z1() == null || (interfaceC1453200nv4Z1 = Z1()) == null || !interfaceC1453200nv4Z1.hn0()) {
            InterfaceC1413540mt6 interfaceC1413540mt6O2 = o2();
            if (interfaceC1413540mt6O2 != null) {
                interfaceC1413540mt6O2.YO1(false);
            }
        } else {
            InterfaceC1453200nv4 interfaceC1453200nv4Z12 = Z1();
            if (interfaceC1453200nv4Z12 != null) {
                interfaceC1453200nv4Z12.LLLLZI(false);
            }
        }
        String str = this.LLILZLL;
        if (str == null || str.length() == 0) {
            return;
        }
        w2().creativeModel.musicBuzModel.hasRecordLastSelectMusic = true;
    }

    @Override // X.InterfaceC1459480o5C
    public void i21() {
        MusicBuzModel musicBuzModel = w2().creativeModel.musicBuzModel;
        String str = musicBuzModel.musicPath;
        if (str == null || str.length() == 0) {
            return;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            aVMusicExtractAVMusic.clearCutInfo();
        } else {
            aVMusicExtractAVMusic = null;
        }
        this.LLIZ = aVMusicExtractAVMusic;
        this.LLILZLL = musicBuzModel.musicPath;
        String musicOrigin = musicBuzModel.musicOrigin;
        if (musicOrigin == null) {
            musicOrigin = w2().getMusicOrigin();
        }
        this.LLIZLLLIL = musicOrigin;
        w2().creativeModel.musicBuzModel.hasRecordLastSelectMusic = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // X.InterfaceC1459480o5C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wG1() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.w2()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            boolean r0 = r0.hasRecordLastSelectMusic
            r3 = 0
            if (r0 != 0) goto Le
            return r3
        Le:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r5.LLIZ
            r4 = 0
            if (r0 == 0) goto L6e
            java.lang.String r1 = r0.getMusicId()
        L17:
            X.0nv4 r0 = r5.Z1()
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.ib()
        L21:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r5.LLIZ
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.getMusicId()
            r2 = 1
            if (r0 == 0) goto L67
            int r0 = r0.length()
            if (r0 == 0) goto L67
            r5.W1()
            X.0nv4 r0 = r5.Z1()
            if (r0 == 0) goto L65
            boolean r0 = r0.LLLLZI(r2)
            if (r0 != r2) goto L65
        L47:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.w2()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r1 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r5.LLIZ
            com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.updateAVMusic(r1, r0)
        L54:
            r5.LLIZ = r4
            r5.LLILZLL = r4
            r5.LLIZLLLIL = r4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.w2()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            r0.hasRecordLastSelectMusic = r3
            return r2
        L65:
            r2 = 0
            goto L47
        L67:
            boolean r2 = r5.T2()
            goto L54
        L6c:
            r0 = r4
            goto L21
        L6e:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444010ngF.wG1():boolean");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1444010ngF(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final boolean H2(String str) {
        return Intrinsics.LJFF(str, "edit_page_recommend");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCancelMusicInFullScreenPage(C1444020ngG c1444020ngG) {
        i21();
    }
}
