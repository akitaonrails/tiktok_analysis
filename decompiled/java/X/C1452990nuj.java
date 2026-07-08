package X;

import Y.AObjectS245S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS26S0202000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452990nuj extends AbstractC2255721DQs<InterfaceC366390EYb> implements InterfaceC366390EYb, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static final int LLLILZJ;
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final Function0<C1462070o9N> LLILZ;
    public final C364440EQo LLILZIL;
    public EditEffectVideoModel LLJJIJI;
    public C0E4T LLJJJJLIIL;
    public NLEModel LLJJL;
    public AudioRecorderParam LLJJLIIIJLLLLLLLZ;
    public C1453000nuk LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public ArrayList<EffectPointModel> LLJLL;
    public EffectPointModel LLJLLIL;
    public AVMusic LLJLLL;
    public String LLJZ;
    public int LLJZIJLIL;
    public boolean LLLFF;
    public boolean LLLFFI;
    public NLEModel LLLII;
    public C1453030nun LLLIIII;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455730nz9.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453020num.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456070nzh.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453620nvk.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454950nxt.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376040Eok.class, null);
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public int LLL = -1;
    public float LLLF = -1.0f;
    public float LLLFZ = -1.0f;
    public boolean LLLI = true;
    public List<TextStickerData> LLLIIIIL = new ArrayList();
    public List<StickerItemModel> LLLIIIL = new ArrayList();
    public InfoStickerModel LLLIIL = new InfoStickerModel();
    public List<StickerItemModel> LLLIILIL = new ArrayList();
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 292));

    public InterfaceC366390EYb G2() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1452990nuj.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1452990nuj.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1452990nuj.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1452990nuj.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1452990nuj.class, "storyEditFilterApi", "getStoryEditFilterApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1452990nuj.class, "editAudioEffectApi", "getEditAudioEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1452990nuj.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1452990nuj.class, "editAutoEnhanceApi", "getEditAutoEnhanceApi()Lcom/ss/android/ugc/gamora/editor/enhance/EditAutoEnhanceApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1452990nuj.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1452990nuj.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1452990nuj.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1452990nuj.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1452990nuj.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1452990nuj.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1452990nuj.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1452990nuj.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C1452990nuj.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS18 = new C2217381BqS(C1452990nuj.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17, c2217381BqS18};
        LLLILZJ = 8;
    }

    private final InterfaceC1453430nvR B3() {
        return (InterfaceC1453430nvR) this.LLJ.getValue(this, LLLILZ[3]);
    }

    private final InterfaceC1453200nv4 E3() {
        return (InterfaceC1453200nv4) this.LLJJJJ.getValue(this, LLLILZ[16]);
    }

    private final void Ev() {
        C1452640nuA.LJII(null, false, this.LLILLL.creativeModel.musicBuzModel);
        InterfaceC1454960nxu interfaceC1454960nxuF4 = F4();
        if (interfaceC1454960nxuF4 != null) {
            interfaceC1454960nxuF4.lr(true);
        }
    }

    private final InterfaceC1454960nxu F4() {
        return (InterfaceC1454960nxu) this.LLJJIJIL.getValue(this, LLLILZ[13]);
    }

    private final InterfaceC1455850nzL H2() {
        return (InterfaceC1455850nzL) this.LLJJJJJIL.getValue(this, LLLILZ[17]);
    }

    private final SafeHandler K4() {
        return (SafeHandler) this.LLLIL.getValue();
    }

    private final InterfaceC1461350o8D O3() {
        return (InterfaceC1461350o8D) this.LLJJ.getValue(this, LLLILZ[9]);
    }

    private final InterfaceC1453020num O4() {
        return (InterfaceC1453020num) this.LLJI.getValue(this, LLLILZ[4]);
    }

    private final InterfaceC1456910o13 Q3() {
        return (InterfaceC1456910o13) this.LLJILJIL.getValue(this, LLLILZ[6]);
    }

    private final InterfaceC1456070nzh T2() {
        return (InterfaceC1456070nzh) this.LLJIJIL.getValue(this, LLLILZ[5]);
    }

    private final InterfaceC1454950nxt W2() {
        return (InterfaceC1454950nxt) this.LLJJJ.getValue(this, LLLILZ[14]);
    }

    private final InterfaceC1455730nz9 c3() {
        return (InterfaceC1455730nz9) this.LLIZLLLIL.getValue(this, LLLILZ[2]);
    }

    private final InterfaceC1460000o62 e4() {
        return (InterfaceC1460000o62) this.LLJILLL.getValue(this, LLLILZ[8]);
    }

    private final InterfaceC1453620nvk i3() {
        return (InterfaceC1453620nvk) this.LLJILJILJ.getValue(this, LLLILZ[7]);
    }

    private final InterfaceC1457250o1b m3() {
        return (InterfaceC1457250o1b) this.LLJJIJIIJIL.getValue(this, LLLILZ[12]);
    }

    private final void o2() {
        if ((this.LLILLL.getTimeEffect() == null && C0IKQ.LIZ(this.LLILLL.getEffectList())) || C0IKQ.LIZ(this.LLILLL.getEffectList())) {
            return;
        }
        this.LLILLL.getEffectList().clear();
    }

    private final InterfaceC1418580n1E o4() {
        return (InterfaceC1418580n1E) this.LLILZLL.getValue(this, LLLILZ[0]);
    }

    private final InterfaceC376040Eok q3() {
        return (InterfaceC376040Eok) this.LLJJJIL.getValue(this, LLLILZ[15]);
    }

    private final InterfaceC1455500nym v3() {
        return (InterfaceC1455500nym) this.LLJJI.getValue(this, LLLILZ[10]);
    }

    private final EditEffectVideoModel z4() {
        EditEffectVideoModel editEffectVideoModel = this.LLJJIJI;
        if (editEffectVideoModel != null) {
            return editEffectVideoModel;
        }
        C1462070o9N c1462070o9NInvoke = this.LLILZ.invoke();
        if (c1462070o9NInvoke == null) {
            return null;
        }
        EditEffectVideoModel editEffectVideoModel2 = (EditEffectVideoModel) C1659630tI1.LJIIIIZZ(c1462070o9NInvoke, null, null, 6).get(EditEffectVideoModel.class);
        this.LLJJIJI = editEffectVideoModel2;
        return editEffectVideoModel2;
    }

    public final InterfaceC1455860nzM H3() {
        return (InterfaceC1455860nzM) this.LLIZ.getValue(this, LLLILZ[1]);
    }

    public final InterfaceC361710EGb H4() {
        return (InterfaceC361710EGb) this.LLJJIII.getValue(this, LLLILZ[11]);
    }

    @Override // X.InterfaceC366390EYb
    public void Ua1() {
        String str;
        InterfaceC1455860nzM interfaceC1455860nzMH3;
        AbstractC1452680nuE abstractC1452680nuEGc;
        NLEModel nLEModel = this.LLLII;
        if (nLEModel != null && (interfaceC1455860nzMH3 = H3()) != null && (abstractC1452680nuEGc = interfaceC1455860nzMH3.gc()) != null) {
            abstractC1452680nuEGc.LJJ().yc(nLEModel);
        }
        NLEModel nLEModel2 = this.LLLII;
        this.LLLII = NLEModel.dynamicCast(nLEModel2 != null ? nLEModel2.deepClone() : null);
        C1453030nun c1453030nun = this.LLLIIII;
        if (c1453030nun != null) {
            this.LLILLL.setMMusicStart(c1453030nun.LIZJ);
            this.LLILLL.setMMusicEnd(c1453030nun.LIZJ + c1453030nun.LIZLLL);
            C1452640nuA.LJII(null, false, this.LLILLL.creativeModel.musicBuzModel);
            InterfaceC1454960nxu interfaceC1454960nxuF4 = F4();
            if (interfaceC1454960nxuF4 != null) {
                interfaceC1454960nxuF4.lr(true);
            }
            this.LLILLL.setMusicVolume(c1453030nun.LJ);
            AVMusic aVMusic = c1453030nun.LIZ;
            if (aVMusic != null && (str = c1453030nun.LIZIZ) != null) {
                W1(aVMusic, str, c1453030nun.LIZJ, c1453030nun.LIZLLL);
            }
        }
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = H2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            interfaceC1461660o8iLIZJ.Yr();
        }
    }

    @Override // X.InterfaceC366390EYb
    public void gK() {
        n5(this.LLILLL, this.LLJJJJLIIL);
        this.LLILLL.setTimeEffect(null);
        this.LLILLL.creativeModel.inlineCaptionModel = null;
        this.LLILZIL.LIZ();
        InterfaceC1456910o13 interfaceC1456910o13Q3 = Q3();
        if (interfaceC1456910o13Q3 != null) {
            interfaceC1456910o13Q3.eN1(null, false);
        }
        InterfaceC1456910o13 interfaceC1456910o13Q32 = Q3();
        if (interfaceC1456910o13Q32 != null) {
            interfaceC1456910o13Q32.pQ0();
        }
        InterfaceC1456910o13 interfaceC1456910o13Q33 = Q3();
        if (interfaceC1456910o13Q33 != null) {
            interfaceC1456910o13Q33.Z30(this.LLILZIL);
        }
        InterfaceC1460000o62 interfaceC1460000o62E4 = e4();
        if (interfaceC1460000o62E4 != null) {
            interfaceC1460000o62E4.lC0(new C1453050nup(this.LLILLL.getAutoEnhanceOn(), R.raw.icon_camera_enhancephoto_fill));
        }
        this.LLILLL.setAutoEnhanceOn(false);
        this.LLILLL.setAutoEnhanceType(0);
        w2();
        if (this.LLILLL.getCommentVideoModel() != null) {
            CommentVideoModel commentVideoModel = this.LLILLL.getCommentVideoModel();
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            CommentVideoModel commentVideoModel2 = this.LLILLL.getCommentVideoModel();
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    @Override // X.InterfaceC366390EYb
    public void tl0() {
        String str;
        AbstractC1452680nuE abstractC1452680nuEGc;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        NLEModel nLEModel = this.LLJJL;
        if (nLEModel != null) {
            InterfaceC1455860nzM interfaceC1455860nzMH3 = H3();
            if (interfaceC1455860nzMH3 != null && (abstractC1452680nuEGc2 = interfaceC1455860nzMH3.gc()) != null) {
                abstractC1452680nuEGc2.LJJ().yc(nLEModel);
            }
            InterfaceC1455860nzM interfaceC1455860nzMH32 = H3();
            if (interfaceC1455860nzMH32 != null && (abstractC1452680nuEGc = interfaceC1455860nzMH32.gc()) != null) {
                C391360FWc.LIZLLL("EditControlComponent#restoreEdits", abstractC1452680nuEGc.LJJ(), AFwS261S0000000_22.get$arr$(112));
            }
        }
        this.LLILLL.setMMusicStart(this.LLJZIJLIL);
        this.LLILLL.setMMusicEnd(this.LLJZIJLIL + this.LLL);
        C1452640nuA.LJII(null, false, this.LLILLL.creativeModel.musicBuzModel);
        InterfaceC1454960nxu interfaceC1454960nxuF4 = F4();
        if (interfaceC1454960nxuF4 != null) {
            interfaceC1454960nxuF4.lr(true);
        }
        this.LLILLL.setMusicVolume(this.LLLF);
        this.LLILLL.setVoiceVolume(this.LLLFZ);
        AVMusic aVMusic = this.LLJLLL;
        if (aVMusic != null && (str = this.LLJZ) != null) {
            W1(aVMusic, str, this.LLJZIJLIL, this.LLL);
        }
        Z4();
    }

    private final void Z4() {
        C0FVT c0fvtKR;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = H2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            interfaceC1461660o8iLIZJ.Yr();
        }
        if (this.LLLIIIIL.isEmpty()) {
            return;
        }
        new InfoStickerModel();
        new ArrayList();
        List<TextStickerData> list = this.LLLIIIIL;
        InterfaceC391390FWf interfaceC391390FWf = (InterfaceC391390FWf) getDiContainer().LJIIL(null, InterfaceC391390FWf.class);
        if (list != null) {
            for (TextStickerData textStickerData : list) {
                if (interfaceC391390FWf != null) {
                    interfaceC391390FWf.Vh0(new C11YM(textStickerData));
                }
            }
        }
        int i = 0;
        for (TextStickerData textStickerData2 : this.LLLIIIIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            TextStickerData textStickerData3 = textStickerData2;
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ2 = H2().AT().LIZJ();
            if (interfaceC1461660o8iLIZJ2 != null && (c0fvtKR = interfaceC1461660o8iLIZJ2.kR()) != null) {
                c0fvtKR.Pj(textStickerData3, true, AFwS234S0000000_5.get$arr$(71));
            }
            i = i2;
        }
    }

    private final void w2() {
        InterfaceC391240FVq interfaceC391240FVqU30;
        InterfaceC1461350o8D interfaceC1461350o8DLIZJ = H2().TI1().LIZJ();
        boolean zC1 = interfaceC1461350o8DLIZJ != null ? interfaceC1461350o8DLIZJ.C1() : false;
        if (this.LLILLL.hasInfoStickers() || zC1) {
            C1462070o9N c1462070o9NInvoke = this.LLILZ.invoke();
            if (c1462070o9NInvoke != null) {
                c1462070o9NInvoke.LJJJJIZL(new C1453040nuo());
            }
            InterfaceC1461350o8D interfaceC1461350o8DO3 = O3();
            if (interfaceC1461350o8DO3 == null || (interfaceC391240FVqU30 = interfaceC1461350o8DO3.u30()) == null) {
                return;
            }
            interfaceC391240FVqU30.ab(true);
        }
    }

    @Override // X.InterfaceC366390EYb
    public void Kr2() {
        LiveData liveData;
        InterfaceC1456070nzh interfaceC1456070nzhT2;
        InterfaceC1455730nz9 interfaceC1455730nz9C3 = c3();
        if (interfaceC1455730nz9C3 != null) {
            interfaceC1455730nz9C3.LLJJJJ();
        }
        this.LLILLL.setVeAudioEffectParam(null);
        InterfaceC1453430nvR interfaceC1453430nvRB3 = B3();
        if (interfaceC1453430nvRB3 != null) {
            interfaceC1453430nvRB3.l4(true);
        }
        InterfaceC1453020num interfaceC1453020numO4 = O4();
        if (interfaceC1453020numO4 != null) {
            interfaceC1453020numO4.l4(true);
        }
        InterfaceC1455860nzM interfaceC1455860nzMH3 = H3();
        if (interfaceC1455860nzMH3 != null) {
            interfaceC1455860nzMH3.pn2(new C1453000nuk(false, (FilterBean) null, false, (String) null, false, 48));
        }
        this.LLILLL.setSelectedId(0);
        this.LLILLL.setCurFilterIds(null);
        this.LLILLL.setSelectedFilterId(null);
        this.LLILLL.setSelectedFilterLabel(null);
        this.LLILLL.setSelectedFilterCategoryKey(null);
        InterfaceC1455860nzM interfaceC1455860nzMH32 = H3();
        if (interfaceC1455860nzMH32 != null && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && (interfaceC1456070nzhT2 = T2()) != null) {
            interfaceC1456070nzhT2.ij(interfaceC1455860nzMH32, this.LLILLL);
        }
        this.LLILLL.setVeAudioEffectParam(null);
        this.LLILLL.creativeModel.inlineCaptionModel = null;
        this.LLILZIL.LIZ();
        InterfaceC1456910o13 interfaceC1456910o13Q3 = Q3();
        if (interfaceC1456910o13Q3 != null) {
            interfaceC1456910o13Q3.eN1(null, false);
        }
        InterfaceC1456910o13 interfaceC1456910o13Q32 = Q3();
        if (interfaceC1456910o13Q32 != null) {
            interfaceC1456910o13Q32.pQ0();
        }
        InterfaceC1456910o13 interfaceC1456910o13Q33 = Q3();
        if (interfaceC1456910o13Q33 != null) {
            interfaceC1456910o13Q33.Z30(this.LLILZIL);
        }
        EditEffectVideoModel editEffectVideoModelZ4 = z4();
        if (editEffectVideoModelZ4 != null && (liveData = (LiveData) editEffectVideoModelZ4.LLJJ.getValue()) != null) {
            liveData.setValue(null);
        }
        o2();
        this.LLILLL.setTimeEffect(null);
        w2();
        if (this.LLILLL.getCommentVideoModel() != null) {
            CommentVideoModel commentVideoModel = this.LLILLL.getCommentVideoModel();
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            CommentVideoModel commentVideoModel2 = this.LLILLL.getCommentVideoModel();
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    public final void P4() {
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ2 = H2().Iz2().LIZJ();
        if (interfaceC1461650o8hLIZJ2 != null) {
            interfaceC1461650o8hLIZJ2.Nm();
        }
        if (this.LLLIIIL.isEmpty() || (interfaceC1461650o8hLIZJ = H2().Iz2().LIZJ()) == null) {
            return;
        }
        interfaceC1461650o8hLIZJ.fb1(this.LLLIIL);
    }

    public final void T4() {
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ = H2().Iz2().LIZJ();
        if (interfaceC1461650o8hLIZJ != null) {
            for (StickerItemModel stickerItemModel : this.LLLIILIL) {
                interfaceC1461650o8hLIZJ.cS(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime, stickerItemModel.uiStartTime, stickerItemModel.uiEndTime);
            }
        }
    }

    @Override // X.InterfaceC366390EYb
    public void lP() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1455860nzM interfaceC1455860nzMH3 = H3();
        if (interfaceC1455860nzMH3 != null && (liveDataG = interfaceC1455860nzMH3.g()) != null) {
            liveDataG.observe(this, new AObjectS245S0100000_22(this, 51));
        }
        q3().Pk2().LIZ(this, new AObjectS245S0100000_22(this, 52));
    }

    @Override // X.InterfaceC366390EYb
    public C0E4T LX() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void Z1(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        FilterBean filterBeanBi2;
        String filterFolder;
        InterfaceC1455860nzM interfaceC1455860nzMH3 = H3();
        if (interfaceC1455860nzMH3 != null && (filterBeanBi2 = interfaceC1455860nzMH3.Bi2()) != null && (filterFolder = filterBeanBi2.getFilterFolder()) != null) {
            a0.LJJJIL(filterFolder);
        }
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.FILTER && !Intrinsics.LJFF(nLETrack.getExtra("is_from_template"), "true")) {
                    nLEModel.removeTrack(nLETrack);
                }
            }
        }
    }

    @Override // X.InterfaceC366390EYb
    public void Dj1(HashMap<String, String> map) {
        NLEModel nLEModel = this.LLLII;
        if (nLEModel != null) {
            int i = C365960EWk.LIZ;
            C365960EWk.LJFF(nLEModel, map);
        }
    }

    @Override // X.InterfaceC366390EYb
    public void cv1(boolean z) {
        InterfaceC1452170ntP interfaceC1452170ntPLJJ;
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        InterfaceC1457250o1b interfaceC1457250o1bM3;
        InterfaceC1418580n1E interfaceC1418580n1EO4;
        String str;
        EffectPointModel timeEffect;
        AbstractC1452680nuE abstractC1452680nuEGc3;
        InterfaceC391240FVq interfaceC391240FVqU30;
        InterfaceC1455860nzM interfaceC1455860nzMH3;
        InterfaceC1454950nxt interfaceC1454950nxtW2;
        InterfaceC1453620nvk interfaceC1453620nvkI3;
        InterfaceC1455860nzM interfaceC1455860nzMH32;
        InterfaceC1455860nzM interfaceC1455860nzMH33;
        NLEModel nLEModelBf;
        InterfaceC1455860nzM interfaceC1455860nzMH34;
        AbstractC1452680nuE abstractC1452680nuEGc4;
        AbstractC1452680nuE abstractC1452680nuEGc5;
        InterfaceC1455860nzM interfaceC1455860nzMH35 = H3();
        if (interfaceC1455860nzMH35 != null && (abstractC1452680nuEGc5 = interfaceC1455860nzMH35.gc()) != null) {
            interfaceC1452170ntPLJJ = abstractC1452680nuEGc5.LJJ();
        } else {
            interfaceC1452170ntPLJJ = null;
        }
        if (interfaceC1452170ntPLJJ instanceof C1463670oBx) {
            c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ;
        } else {
            c1463670oBx = null;
        }
        if (c1463670oBx != null && (nLEModelBf = c1463670oBx.bf(false)) != null && (interfaceC1455860nzMH34 = H3()) != null && (abstractC1452680nuEGc4 = interfaceC1455860nzMH34.gc()) != null) {
            abstractC1452680nuEGc4.LJJ().yc(nLEModelBf);
        }
        C391360FWc.LJ("", new AwS566S0100000_22(this, 290));
        this.LLILLL.setVeAudioRecorderParam(this.LLJJLIIIJLLLLLLLZ);
        C1453000nuk c1453000nuk = this.LLJL;
        if (c1453000nuk != null && (interfaceC1455860nzMH33 = H3()) != null) {
            interfaceC1455860nzMH33.pn2(c1453000nuk);
        }
        if (this.LLILLL.getVeAudioEffectParam() != null && (interfaceC1455860nzMH32 = H3()) != null) {
            interfaceC1455860nzMH32.tH1(C364410EQl.LIZ(true, this.LLILLL.getVeAudioEffectParam()));
        }
        if (this.LLJLIL && (interfaceC1453620nvkI3 = i3()) != null) {
            interfaceC1453620nvkI3.Vw0(true, false);
        }
        this.LLILLL.setAutoEnhanceOn(this.LLJLIL);
        this.LLILLL.setAutoEnhanceType(this.LLJLILLLLZIIL);
        if (this.LLLFFI && (interfaceC1454950nxtW2 = W2()) != null) {
            interfaceC1454950nxtW2.G50(true, false);
        }
        ArrayList<EffectPointModel> arrayList = this.LLJLL;
        if (arrayList != null && !arrayList.isEmpty() && H3() != null && (interfaceC1455860nzMH3 = H3()) != null) {
            C0EYL.LIZ(this.LLJLL, interfaceC1455860nzMH3.dS1(), null, Boolean.valueOf(this.LLILLL.isReverse()), true);
        }
        InterfaceC1461350o8D interfaceC1461350o8DLIZJ = H2().TI1().LIZJ();
        if (interfaceC1461350o8DLIZJ != null && (interfaceC391240FVqU30 = interfaceC1461350o8DLIZJ.u30()) != null) {
            interfaceC391240FVqU30.ab(true);
        }
        this.LLILLL.setTimeEffect(this.LLJLLIL);
        if (C1428520nHG.LJJIJIIJIL(this.LLILLL) && (timeEffect = this.LLILLL.getTimeEffect()) != null) {
            int startPoint = timeEffect.getStartPoint();
            int endPoint = timeEffect.getEndPoint() - timeEffect.getStartPoint();
            InterfaceC1455860nzM interfaceC1455860nzMH36 = H3();
            if (interfaceC1455860nzMH36 != null && (abstractC1452680nuEGc3 = interfaceC1455860nzMH36.gc()) != null) {
                InterfaceC1452170ntP interfaceC1452170ntPLJJ2 = abstractC1452680nuEGc3.LJJ();
                C391360FWc.LIZLLL("EditControlComponent#restoreEdits", interfaceC1452170ntPLJJ2, new AwS26S0202000_22(timeEffect, startPoint, endPoint, interfaceC1452170ntPLJJ2, 0));
            }
        }
        if (z) {
            this.LLILLL.setMMusicStart(this.LLJZIJLIL);
            this.LLILLL.setMMusicEnd(this.LLJZIJLIL + this.LLL);
            if (MusicBeanUtilKt.extractAVMusic(this.LLILLL.creativeModel.musicBuzModel) != null) {
                Ev();
            } else {
                InterfaceC1460000o62 interfaceC1460000o62E4 = e4();
                if (interfaceC1460000o62E4 != null) {
                    interfaceC1460000o62E4.refresh();
                }
            }
            AVMusic aVMusic = this.LLJLLL;
            if (aVMusic != null && (str = this.LLJZ) != null) {
                W1(aVMusic, str, this.LLJZIJLIL, this.LLL);
            }
            if (this.LLLF >= 0.0f && (interfaceC1418580n1EO4 = o4()) != null) {
                interfaceC1418580n1EO4.A10(this.LLLF);
            }
            InterfaceC1455860nzM interfaceC1455860nzMH37 = H3();
            if (interfaceC1455860nzMH37 != null && (interfaceC1457250o1bM3 = m3()) != null) {
                interfaceC1457250o1bM3.LLLL(C1428520nHG.LJJJIL(interfaceC1455860nzMH37));
            }
            InterfaceC1457250o1b interfaceC1457250o1bM32 = m3();
            if (interfaceC1457250o1bM32 != null) {
                interfaceC1457250o1bM32.of1();
            }
            this.LLILLL.setEditMusicSyncMode(this.LLLFF);
            C12VU c12vu = (C12VU) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(C12VU.class);
            if (c12vu != null) {
                c12vu.Z10(this.LLLFF);
            }
            if (this.LLLFZ >= 0.0f) {
                AudioRecorderParam audioRecorderParam = this.LLJJLIIIJLLLLLLLZ;
                if (audioRecorderParam != null && !audioRecorderParam.getNeedOriginalSound() && this.LLLFZ == 0.0f) {
                    InterfaceC1418580n1E interfaceC1418580n1EO42 = o4();
                    if (interfaceC1418580n1EO42 != null) {
                        interfaceC1418580n1EO42.Hr1(false, false, true);
                    }
                    InterfaceC1453200nv4 interfaceC1453200nv4E3 = E3();
                    if (interfaceC1453200nv4E3 != null) {
                        interfaceC1453200nv4E3.UM(false);
                    }
                }
                InterfaceC1418580n1E interfaceC1418580n1EO43 = o4();
                if (interfaceC1418580n1EO43 != null) {
                    interfaceC1418580n1EO43.N81(this.LLLFZ);
                }
            }
        }
        NLEModel nLEModel = this.LLJJL;
        if (nLEModel != null) {
            InterfaceC1455860nzM interfaceC1455860nzMH38 = H3();
            if (interfaceC1455860nzMH38 != null && (abstractC1452680nuEGc2 = interfaceC1455860nzMH38.gc()) != null) {
                abstractC1452680nuEGc2.LJJ().yc(nLEModel);
            }
            InterfaceC1455860nzM interfaceC1455860nzMH39 = H3();
            if (interfaceC1455860nzMH39 != null && (abstractC1452680nuEGc = interfaceC1455860nzMH39.gc()) != null) {
                C391360FWc.LIZLLL("EditControlComponent#restoreEdits", abstractC1452680nuEGc.LJJ(), AFwS261S0000000_22.get$arr$(111));
            }
        }
        Z4();
        InterfaceC1460000o62 interfaceC1460000o62E42 = e4();
        if (interfaceC1460000o62E42 != null) {
            interfaceC1460000o62E42.ut0(20, this.LLLI);
        }
        K4().postDelayed(new ARunnableS122S0100000_22(this, 35), 100L);
    }

    @Override // X.InterfaceC366390EYb
    public void kA(boolean z) {
        InterfaceC1452170ntP interfaceC1452170ntPLJJ;
        C1463670oBx c1463670oBx;
        NLEModel nLEModelBf;
        boolean zLIZ;
        ArrayList<EffectPointModel> arrayListDt;
        LiveData<Boolean> liveDataLQ1;
        Boolean value;
        List<StickerItemModel> list;
        LiveData<C1453000nuk> liveDataGq1;
        C1453000nuk value2;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1455860nzM interfaceC1455860nzMH3 = H3();
        C1453000nuk c1453000nuk = null;
        if (interfaceC1455860nzMH3 != null && (abstractC1452680nuEGc = interfaceC1455860nzMH3.gc()) != null) {
            interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
        } else {
            interfaceC1452170ntPLJJ = null;
        }
        if (interfaceC1452170ntPLJJ instanceof C1463670oBx) {
            c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ;
        } else {
            c1463670oBx = null;
        }
        int duration = 0;
        if (c1463670oBx != null) {
            nLEModelBf = c1463670oBx.bf(false);
        } else {
            nLEModelBf = null;
        }
        this.LLJJL = nLEModelBf;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.copyFrom(this.LLILLL.getVeAudioRecorderParam());
        this.LLJJLIIIJLLLLLLLZ = audioRecorderParam;
        InterfaceC1455860nzM interfaceC1455860nzMH32 = H3();
        if (interfaceC1455860nzMH32 != null && (liveDataGq1 = interfaceC1455860nzMH32.gq1()) != null && (value2 = liveDataGq1.getValue()) != null) {
            c1453000nuk = new C1453000nuk(value2.LIZIZ, value2.LIZLLL, value2.LIZ, value2.LIZJ, value2.LJ, value2.LJFF);
        }
        this.LLJL = c1453000nuk;
        this.LLJLIL = this.LLILLL.getAutoEnhanceOn();
        this.LLJLILLLLZIIL = this.LLILLL.getAutoEnhanceType();
        AudioEnhanceParam audioEnhanceParam = this.LLILLL.getAudioEnhanceParam();
        if (audioEnhanceParam != null) {
            zLIZ = C349220Dma.LIZ(audioEnhanceParam);
        } else {
            zLIZ = false;
        }
        this.LLLFFI = zLIZ;
        if (C364100EPg.LIZ()) {
            this.LLJLL = new ArrayList<>(this.LLILLL.getEffectList());
        } else {
            InterfaceC1455860nzM interfaceC1455860nzMH33 = H3();
            if (interfaceC1455860nzMH33 != null && (arrayListDt = interfaceC1455860nzMH33.dt()) != null) {
                this.LLJLL = new ArrayList<>(arrayListDt);
            }
        }
        this.LLJLLIL = this.LLILLL.getTimeEffect();
        InfoStickerModel infoStickerModel = this.LLILLL.getInfoStickerModel();
        boolean zBooleanValue = true;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList<StickerItemModel> arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                int i = stickerItemModel.type;
                if (i == 11 || i == 0 || i == 10) {
                    arrayList.add(stickerItemModel);
                }
            }
            for (StickerItemModel stickerItemModel2 : arrayList) {
                List<StickerItemModel> list2 = this.LLLIILIL;
                StickerItemModel stickerItemModel3 = new StickerItemModel();
                stickerItemModel3.setId(stickerItemModel2.getId());
                stickerItemModel3.startTime = stickerItemModel2.startTime;
                stickerItemModel3.endTime = stickerItemModel2.endTime;
                stickerItemModel3.uiStartTime = stickerItemModel2.uiStartTime;
                stickerItemModel3.uiEndTime = stickerItemModel2.uiEndTime;
                list2.add(stickerItemModel3);
            }
        }
        if (z) {
            this.LLJLLL = MusicBeanUtilKt.extractAVMusic(this.LLILLL.creativeModel.musicBuzModel);
            this.LLJZ = this.LLILLL.getMMusicPath();
            this.LLJZIJLIL = this.LLILLL.getMMusicStart();
            this.LLLF = this.LLILLL.getMusicVolume();
            if (this.LLILLL.getMMusicEnd() >= 0) {
                duration = this.LLILLL.getMMusicEnd() - this.LLILLL.getMMusicStart();
            } else {
                AVMusic aVMusic = this.LLJLLL;
                if (aVMusic != null) {
                    duration = aVMusic.getDuration();
                }
            }
            this.LLL = duration;
            this.LLLFF = this.LLILLL.getEditMusicSyncMode();
            this.LLLFZ = this.LLILLL.getVoiceVolume();
            InterfaceC1460000o62 interfaceC1460000o62E4 = e4();
            if (interfaceC1460000o62E4 != null && (liveDataLQ1 = interfaceC1460000o62E4.lQ1(20)) != null && (value = liveDataLQ1.getValue()) != null) {
                zBooleanValue = value.booleanValue();
            }
            this.LLLI = zBooleanValue;
        }
        this.LLLIIIIL.clear();
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = H2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            Iterator<TextStickerData> it2 = interfaceC1461660o8iLIZJ.Et0().iterator();
            while (it2.hasNext()) {
                this.LLLIIIIL.add(it2.next());
            }
        }
        this.LLLIIIL.clear();
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ = H2().Iz2().LIZJ();
        if (interfaceC1461650o8hLIZJ != null) {
            Iterator<StickerItemModel> it3 = interfaceC1461650o8hLIZJ.Lm().iterator();
            while (it3.hasNext()) {
                this.LLLIIIL.add(it3.next());
            }
            this.LLLIIL.stickers = this.LLLIIIL;
        }
    }

    @Override // X.InterfaceC366390EYb
    public void p32(boolean z) {
        InterfaceC391240FVq interfaceC391240FVqU30;
        InterfaceC1454950nxt interfaceC1454950nxtW2;
        InterfaceC1453620nvk interfaceC1453620nvkI3;
        InterfaceC1455860nzM interfaceC1455860nzMH3;
        C391360FWc.LJ("", new AwS566S0100000_22(this, 289));
        if (!u4.LJJJJIZL(this.LLILLL) && (interfaceC1455860nzMH3 = H3()) != null) {
            interfaceC1455860nzMH3.l4(true);
        }
        InterfaceC1455860nzM interfaceC1455860nzMH32 = H3();
        if (interfaceC1455860nzMH32 != null) {
            interfaceC1455860nzMH32.tH1(C364410EQl.LIZIZ());
        }
        if (this.LLILLL.getAutoEnhanceOn() && (interfaceC1453620nvkI3 = i3()) != null) {
            interfaceC1453620nvkI3.Vw0(false, false);
        }
        if (this.LLLFFI && (interfaceC1454950nxtW2 = W2()) != null) {
            interfaceC1454950nxtW2.G50(false, false);
        }
        InterfaceC1461350o8D interfaceC1461350o8DLIZJ = H2().TI1().LIZJ();
        if (interfaceC1461350o8DLIZJ != null && (interfaceC391240FVqU30 = interfaceC1461350o8DLIZJ.u30()) != null) {
            interfaceC391240FVqU30.ab(false);
        }
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ = H2().Iz2().LIZJ();
        if (interfaceC1461650o8hLIZJ != null) {
            interfaceC1461650o8hLIZJ.Nm();
        }
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = H2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            interfaceC1461660o8iLIZJ.Yr();
        }
        InterfaceC1455500nym interfaceC1455500nymV3 = v3();
        if (interfaceC1455500nymV3 != null) {
            interfaceC1455500nymV3.YI();
        }
        InterfaceC1455500nym interfaceC1455500nymV32 = v3();
        if (interfaceC1455500nymV32 != null) {
            interfaceC1455500nymV32.aH(true);
        }
        if (z) {
            this.LLILLL.setEditMusicSyncMode(false);
            C12VU c12vu = (C12VU) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(C12VU.class);
            if (c12vu != null) {
                c12vu.Z10(false);
            }
            this.LLILLL.setMMusicStart(0);
            this.LLILLL.setMMusicEnd(this.LLL);
            if (this.LLJLLL != null && this.LLJZ != null) {
                C1452640nuA.LJII(null, false, this.LLILLL.creativeModel.musicBuzModel);
                InterfaceC1454960nxu interfaceC1454960nxuF4 = F4();
                if (interfaceC1454960nxuF4 != null) {
                    interfaceC1454960nxuF4.lr(true);
                }
            }
            this.LLILLL.setMusicVolume(1.0f);
            if (!u4.LJJIJ(this.LLILLL) || (u4.LJJIJ(this.LLILLL) && C1418530n19.LIZIZ(this.LLILLL))) {
                this.LLILLL.setVoiceVolume(0.0f);
                InterfaceC1455860nzM interfaceC1455860nzMH33 = H3();
                if (interfaceC1455860nzMH33 != null) {
                    interfaceC1455860nzMH33.EY0(VEVolumeChangeOp.ofVoice(0.0f));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    @Override // X.InterfaceC366390EYb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tv2(com.bytedance.ies.nle.editor_jni.NLEModel r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452990nuj.tv2(com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    private final void d5(VideoPublishEditModel videoPublishEditModel, C0E4T c0e4t) {
        AudioEffectParam audioEffectParam;
        if (c0e4t != null) {
            audioEffectParam = c0e4t.LIZLLL;
        } else {
            audioEffectParam = null;
        }
        videoPublishEditModel.setVeAudioEffectParam(audioEffectParam);
    }

    private final void k5(VideoPublishEditModel videoPublishEditModel, C0E4T c0e4t) {
        C0E4W c0e4w;
        String str;
        float f;
        boolean z;
        if (c0e4t != null && (c0e4w = c0e4t.LJ) != null) {
            String str2 = null;
            videoPublishEditModel.setSelectedFilterResId(c0e4w.LIZ);
            C0E4W c0e4w2 = c0e4t.LJ;
            if (c0e4w2 != null) {
                str = c0e4w2.LIZIZ;
            } else {
                str = null;
            }
            videoPublishEditModel.setSelectedFilterLabel(str);
            C0E4W c0e4w3 = c0e4t.LJ;
            if (c0e4w3 != null) {
                str2 = c0e4w3.LIZJ;
            }
            videoPublishEditModel.setSelectedFilterId(str2);
            C0E4W c0e4w4 = c0e4t.LJ;
            if (c0e4w4 != null) {
                f = c0e4w4.LIZLLL;
            } else {
                f = 0.0f;
            }
            videoPublishEditModel.setSelectedFilterIntensity(f);
            FilterModel filterModel = videoPublishEditModel.creativeModel.filterModel;
            C0E4W c0e4w5 = c0e4t.LJ;
            if (c0e4w5 != null) {
                z = c0e4w5.LJ;
            } else {
                z = false;
            }
            filterModel.isUseComposerFilterInEditPage = z;
        }
    }

    private final void n5(VideoPublishEditModel videoPublishEditModel, C0E4T c0e4t) {
        AudioRecorderParam audioRecorderParam;
        List<EffectPointModel> list;
        List<SoundEffect> list2;
        if (c0e4t != null) {
            audioRecorderParam = c0e4t.LIZ;
        } else {
            audioRecorderParam = null;
        }
        videoPublishEditModel.setVeAudioRecorderParam(audioRecorderParam);
        List<SoundEffect> list3 = videoPublishEditModel.creativeModel.soundEffectInfoModel.soundEffectList;
        list3.clear();
        if (c0e4t != null && (list2 = c0e4t.LIZIZ) != null) {
            list3.addAll(list2);
        }
        ArrayList<EffectPointModel> arrayList = videoPublishEditModel.creativeModel.editEffectModel.effectList;
        arrayList.clear();
        if (c0e4t != null && (list = c0e4t.LIZJ) != null) {
            arrayList.addAll(list);
        }
        d5(videoPublishEditModel, c0e4t);
        k5(videoPublishEditModel, c0e4t);
    }

    @Override // X.InterfaceC366390EYb
    public void Aa2(Context context, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        List<EffectPointModel> list;
        ITemplateApplyService iTemplateApplyService = (ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class);
        C0LE8.LIZ.getClass();
        C0E4T c0e4tLIZIZ = iTemplateApplyService.LIZIZ(context, nLEModel, videoPublishEditModel, C0LE8.LJFF, this.LLILLL.creativeModel);
        this.LLJJJJLIIL = c0e4tLIZIZ;
        if (c0e4tLIZIZ != null && (list = c0e4tLIZIZ.LIZJ) != null) {
            try {
                this.LLILLL.creativeModel.editEffectModel.effectList = new ArrayList<>(list);
            } catch (C1541810qDz e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    private final void W1(AVMusic aVMusic, String str, int i, int i2) {
        C1454900nxo c1454900nxoLIZ;
        if (i >= 0) {
            aVMusic.setMusicStartFromCut(i);
        }
        InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) getDiContainer().LJIIL(null, InterfaceC1454960nxu.class);
        C1452640nuA.LJII(aVMusic, false, this.LLILLL.creativeModel.musicBuzModel);
        if (C0MT6.LIZ()) {
            if (interfaceC1454960nxu != null) {
                interfaceC1454960nxu.Rq(str, aVMusic, true, false, false, false, i2, false, true, "", false, null);
                return;
            }
            return;
        }
        if (str != null && str.length() != 0) {
            c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, true, null, i2, LivePreviewCTASmartDisplayManager.DEFAULT, false);
        } else {
            c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.TRUE, null, null, null, null, true, null, i2, LivePreviewCTASmartDisplayManager.DEFAULT, false);
        }
        if (interfaceC1454960nxu == null) {
            return;
        }
        interfaceC1454960nxu.hr(c1454900nxoLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1452990nuj(C1DRG c1drg, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0<? extends C1462070o9N> function0, C364440EQo c364440EQo) {
        this.LL = c1drg;
        this.LLILLJJLI = c19eg;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = function0;
        this.LLILZIL = c364440EQo;
    }
}
