package X;

import Y.AObserverS225S0100000_22;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0mxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416100mxE extends AbstractC2255721DQs<C05YF> implements C05YF, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1419190n2D.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 309));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 308));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1416100mxE.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1416100mxE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1416100mxE.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1416100mxE.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1416100mxE.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1416100mxE.class, "lyricBusinessApi", "getLyricBusinessApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILJIL = 8;
    }

    private final C1415130mvf G2() {
        return (C1415130mvf) this.LLJI.getValue();
    }

    public final C0EMC H2() {
        return (C0EMC) this.LLJ.getValue();
    }

    public final InterfaceC1419190n2D W1() {
        return (InterfaceC1419190n2D) this.LLILZLL.getValue(this, LLJIJIL[3]);
    }

    public final InterfaceC1454960nxu X1() {
        return (InterfaceC1454960nxu) this.LLILZIL.getValue(this, LLJIJIL[2]);
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    public final InterfaceC1418580n1E o2() {
        return (InterfaceC1418580n1E) this.LLIZ.getValue(this, LLJIJIL[4]);
    }

    public final InterfaceC366450EYh w2() {
        return (InterfaceC366450EYh) this.LLIZLLLIL.getValue(this, LLJIJIL[5]);
    }

    public final void T2() {
        String str;
        AVMusic aVMusicExtractAVMusic;
        EPAnchorData ePAnchorData;
        EditorProSchemeModel editorProSchemeModel = getEditModel().creativeModel.editorProSchemeModel;
        if (editorProSchemeModel == null || (ePAnchorData = editorProSchemeModel.anchorData) == null || (str = ePAnchorData.resourceId) == null || str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.Edit.Hydrate", "SKIP-EMPTY-RESOURCE");
            return;
        }
        MusicBuzModel musicBuzModel = getEditModel().creativeModel.musicBuzModel;
        if (musicBuzModel != null) {
            String strLIZJ = C1429680nJ8.LIZJ(musicBuzModel);
            if (strLIZJ.length() > 0) {
                ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
                AVMusic aVMusicLIZ = iLyricsRuleTemplatePreloadService != null ? iLyricsRuleTemplatePreloadService.LIZ(strLIZJ, str) : null;
                if (aVMusicLIZ == null) {
                    aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                    if (aVMusicExtractAVMusic == null) {
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SKIP-NO-AVMUSIC preload-miss + MusicDataCenter-null key=");
                        sbLIZ.append(strLIZJ);
                        sbLIZ.append('#');
                        sbLIZ.append(str);
                        C1426005i6.LIZJ(c1398350mUb, "Anchor.Edit.Hydrate", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                } else {
                    aVMusicExtractAVMusic = aVMusicLIZ;
                }
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HYDRATE key=");
                sbLIZ2.append(strLIZJ);
                sbLIZ2.append('#');
                sbLIZ2.append(str);
                sbLIZ2.append(" musicSrc=");
                sbLIZ2.append(aVMusicLIZ != null ? "preload-stash" : "MusicDataCenter");
                C1426005i6.LIZ(c1398350mUb2, "Anchor.Edit.Hydrate", C2188811AlT.LIZIZ(sbLIZ2));
                G2().LIZ(aVMusicExtractAVMusic, str, C0MJ7.LYRIC_ANCHOR, null);
                return;
            }
        }
        C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.Edit.Hydrate", "SKIP-EMPTY-MUSIC empty musicId on editModel");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        boolean zLIZLLL = C537970L7z.LIZLLL(getEditModel().creativeModel.editorProSchemeModel);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENTRY isFromLyricEffectAnchorClick=");
        sbLIZ.append(zLIZLLL);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Edit.Hydrate", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZLLL) {
            Z1().ww2().observe(this, new AObserverS225S0100000_22(this, 47));
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1416100mxE(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
