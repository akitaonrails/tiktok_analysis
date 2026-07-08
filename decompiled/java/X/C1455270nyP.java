package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS184S0200000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import rlf.a;

/* JADX INFO: renamed from: X.0nyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455270nyP extends AbstractC2255721DQs<InterfaceC1455360nyY> implements InterfaceC1455360nyY, InterfaceC379610EuV {
    public static final C1456680o0g LLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public final C1DRG LL;
    public final Function0<AbstractC1453750nvx> LLILLJJLI;
    public final Function0<C1462070o9N> LLILLL;
    public final Function0<Context> LLILZ;
    public final Function0<C384100F4e> LLILZIL;
    public boolean LLILZLL;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 754));
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 757));
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452510ntx.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455840nzK.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455730nz9.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454950nxt.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1431860nMe.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456070nzh.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1419190n2D.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410280mnq.class, null);
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0MFO.class, null);
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455720nz8.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453020num.class, null);
    public final InterfaceC1731706qJ LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
    public final InterfaceC1731706qJ LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451320ns2.class, null);
    public final InterfaceC1731706qJ LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
    public final InterfaceC1731706qJ LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456450o0J.class, null);
    public final InterfaceC1731706qJ LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MER.class, null);
    public final InterfaceC1731706qJ LLJZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC578380MmK.class, null);
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 758));

    public InterfaceC1455360nyY w2() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [X.0o0g] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1455270nyP.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1455270nyP.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1455270nyP.class, "baseEditToolbarApi", "getBaseEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C1455270nyP.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C1455270nyP.class, "cropApi", "getCropApi()Lcom/ss/android/ugc/gamora/editor/crop/CropApi;", 0), new C2217381BqS(C1455270nyP.class, "aiMeEditPreviewApi", "getAiMeEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/aime/AiMeEditPreviewApi;", 0), new C2217381BqS(C1455270nyP.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0), new C2217381BqS(C1455270nyP.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new C2217381BqS(C1455270nyP.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0), new C2217381BqS(C1455270nyP.class, "sendToDMApi", "getSendToDMApi()Lcom/ss/android/ugc/aweme/social/sendtodm/SendToDMApiComponent;", 0), new C2217381BqS(C1455270nyP.class, "editAudioEffectApi", "getEditAudioEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0), new C2217381BqS(C1455270nyP.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new C2217381BqS(C1455270nyP.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0), new C2217381BqS(C1455270nyP.class, "switchModePayloadProviderApi", "getSwitchModePayloadProviderApi()Lcom/ss/android/ugc/aweme/image/switchmode/payload/ImageModeSwitchPayloadProviderApi;", 0), new C2217381BqS(C1455270nyP.class, "livePhotoEditApi", "getLivePhotoEditApi()Lcom/ss/android/ugc/gamora/editor/livephoto/LivePhotoEditApi;", 0), new C2217381BqS(C1455270nyP.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/AudioEditApi;", 0), new C2217381BqS(C1455270nyP.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C1455270nyP.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1455270nyP.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1455270nyP.class, "storyEditFilterApi", "getStoryEditFilterApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditFilterApi;", 0), new C2217381BqS(C1455270nyP.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new C2217381BqS(C1455270nyP.class, "photoTemplateApi", "getPhotoTemplateApi()Lcom/ss/android/ugc/aweme/image/phototemplate/PhotoTemplateApi;", 0), new C2217381BqS(C1455270nyP.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0), new C2217381BqS(C1455270nyP.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicControlApi;", 0), new C2217381BqS(C1455270nyP.class, "retouchApiComponent", "getRetouchApiComponent()Lcom/ss/android/ugc/gamora/editor/retouch/RetouchApiComponent;", 0), new C2217381BqS(C1455270nyP.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0)};
        LLL = new Object() { // from class: X.0o0g
        };
        LLLFF = 8;
    }

    private final InterfaceC1453420nvQ B3() {
        return (InterfaceC1453420nvQ) this.LLJILJIL.getValue(this, LLLF[3]);
    }

    private final InterfaceC1410280mnq C5() {
        return (InterfaceC1410280mnq) this.LLJJJIL.getValue(this, LLLF[13]);
    }

    private final InterfaceC1455720nz8 G2() {
        return (InterfaceC1455720nz8) this.LLJJJJJIL.getValue(this, LLLF[15]);
    }

    private final InterfaceC1453200nv4 H3() {
        return (InterfaceC1453200nv4) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLF[18]);
    }

    private final C0EYP H4() {
        return (C0EYP) this.LLJLL.getValue(this, LLLF[22]);
    }

    private final C0MFO K4() {
        return (C0MFO) this.LLJJJJ.getValue(this, LLLF[14]);
    }

    private final InterfaceC1456450o0J O3() {
        return (InterfaceC1456450o0J) this.LLJLLIL.getValue(this, LLLF[23]);
    }

    private final InterfaceC1451320ns2 P4() {
        return (InterfaceC1451320ns2) this.LLJLILLLLZIIL.getValue(this, LLLF[21]);
    }

    private final InterfaceC1452510ntx T2() {
        return (InterfaceC1452510ntx) this.LLJILJILJ.getValue(this, LLLF[4]);
    }

    private final InterfaceC1444410ngt T4() {
        return (InterfaceC1444410ngt) this.LLJIJIL.getValue();
    }

    private final InterfaceC1419190n2D W2() {
        return (InterfaceC1419190n2D) this.LLJJIJIL.getValue(this, LLLF[11]);
    }

    private final InterfaceC1455680nz4 X1() {
        return (InterfaceC1455680nz4) this.LLJJIII.getValue(this, LLLF[8]);
    }

    private final InterfaceC1455840nzK Z1() {
        return (InterfaceC1455840nzK) this.LLJILLL.getValue(this, LLLF[5]);
    }

    private final C0MER Z4() {
        return (C0MER) this.LLJLLL.getValue(this, LLLF[24]);
    }

    private final InterfaceC1456070nzh c3() {
        return (InterfaceC1456070nzh) this.LLJJIJIIJIL.getValue(this, LLLF[10]);
    }

    private final InterfaceC1461350o8D e4() {
        return (InterfaceC1461350o8D) this.LLJJJJLIIL.getValue(this, LLLF[16]);
    }

    private final InterfaceC1454950nxt i3() {
        return (InterfaceC1454950nxt) this.LLJJI.getValue(this, LLLF[7]);
    }

    private final InterfaceC1431860nMe k5() {
        return (InterfaceC1431860nMe) this.LLJJIJI.getValue(this, LLLF[9]);
    }

    private final InterfaceC1455730nz9 m3() {
        return (InterfaceC1455730nz9) this.LLJJ.getValue(this, LLLF[6]);
    }

    private final InterfaceC1457250o1b q3() {
        return (InterfaceC1457250o1b) this.LLJLIL.getValue(this, LLLF[20]);
    }

    private final C1462070o9N t5() {
        return this.LLILLL.invoke();
    }

    private final InterfaceC1453020num v5() {
        return (InterfaceC1453020num) this.LLJL.getValue(this, LLLF[19]);
    }

    private final InterfaceC1418580n1E z4() {
        return (InterfaceC1418580n1E) this.LLJJL.getValue(this, LLLF[17]);
    }

    public final InterfaceC578380MmK E3() {
        return (InterfaceC578380MmK) this.LLJZ.getValue(this, LLLF[25]);
    }

    @Override // X.InterfaceC1455360nyY
    public void GQ1() {
        InterfaceC1465010oE7 interfaceC1465010oE7Zi0;
        InterfaceC1465010oE7 interfaceC1465010oE7Zi02;
        M5("click_edit_add_yours_entrance");
        InterfaceC1461350o8D interfaceC1461350o8DE4 = e4();
        if (interfaceC1461350o8DE4 != null && (interfaceC1465010oE7Zi02 = interfaceC1461350o8DE4.zi0()) != null) {
            interfaceC1465010oE7Zi02.LJLLL("edit_page_entrance");
        }
        C1403900mdY c1403900mdY = C1403900mdY.LIZ;
        VideoPublishEditModel videoPublishEditModelO4 = O4();
        InterfaceC1461350o8D interfaceC1461350o8DE42 = e4();
        AddYoursStickerModel addYoursStickerModelV61 = (interfaceC1461350o8DE42 == null || (interfaceC1465010oE7Zi0 = interfaceC1461350o8DE42.zi0()) == null) ? null : interfaceC1465010oE7Zi0.V61();
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 538);
        c1403900mdY.getClass();
        C1403900mdY.LJIIJ(videoPublishEditModelO4, addYoursStickerModelV61, awS601S0100000_22);
        View view = getView();
        if (view != null) {
            C0T6J.LIZ(view, AFwS210S0000000_22.get$arr$(263));
        }
    }

    public final InterfaceC1455610nyx H2() {
        return (InterfaceC1455610nyx) this.LLJI.getValue(this, LLLF[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZLLLIL.getValue(this, LLLF[1]);
    }

    public final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLLF[0]);
    }

    public final AbstractC1453750nvx Q3() {
        return this.LLILLJJLI.invoke();
    }

    @Override // X.InterfaceC1455360nyY
    public void Qh2() {
        M5("click_edit_settings_entrance");
        O4().creativeModel.transientPostPageModel.LJJIIJZLJL = "click_audience_select";
        InterfaceC1444410ngt interfaceC1444410ngtT4 = T4();
        if (interfaceC1444410ngtT4 != null) {
            interfaceC1444410ngtT4.s80();
        }
        InterfaceC1455610nyx interfaceC1455610nyxH2 = H2();
        if (interfaceC1455610nyxH2 != null) {
            interfaceC1455610nyxH2.bo();
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LIZJ(O4(), "video_edit_page", null);
    }

    public final void R5() {
        InterfaceC1452170ntP value;
        M5("click_edit_effect_entrance");
        O4().creativeModel.effectEntrancePosition = "edit_page_panel";
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 != null) {
            C1402610mbT.LJJI(O4(), interfaceC1460000o62O4.Oz1(), false);
        }
        InterfaceC1455500nym interfaceC1455500nymV3 = v3();
        if (interfaceC1455500nymV3 != null) {
            interfaceC1455500nymV3.show();
        }
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        JY0().HV(false);
        C1459710o5Z.LIZ("effect");
        InterfaceC1455610nyx interfaceC1455610nyxH2 = H2();
        if (interfaceC1455610nyxH2 != null) {
            interfaceC1455610nyxH2.bo();
        }
        if (!C0BVH.LIZ() || O4().videoFps(true) >= C0BM4.LIZ() || (value = JY0().g().getValue()) == null) {
            return;
        }
        value.setPreviewFps(C0BM4.LIZ(), true);
    }

    @Override // X.InterfaceC1455360nyY
    public void WZ1() {
        C384100F4e c384100F4eInvoke = this.LLILZIL.invoke();
        if (c384100F4eInvoke != null) {
            c384100F4eInvoke.LIZ();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void YB0() {
        a.LIZ.LIZJ(O4(), "save_local");
        InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
        if (publishService.LJJLIIIJJIZ(O4(), true)) {
            Q3().LLLLILI(new Runnable() { // from class: X.0nzr
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("EditToolBarClickCallbacksComponent@2520.editSaveLocal$1");
                    C1C7U.LIZIZ("EditToolBarClickCallbacksComponent@2520.editSaveLocal$1");
                }
            }, new ARunnableS91S0200000_22(this, publishService, 23));
        }
    }

    public final Context d5() {
        return this.LLILZ.invoke();
    }

    public final CreativeToast n5() {
        return (CreativeToast) this.LLJZIJLIL.getValue();
    }

    public final InterfaceC1460000o62 o4() {
        return (InterfaceC1460000o62) this.LLJ.getValue();
    }

    public final InterfaceC1455500nym v3() {
        return (InterfaceC1455500nym) this.LLJJJ.getValue(this, LLLF[12]);
    }

    private final void D5() {
        String strYe;
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 == null || (strYe = interfaceC1460000o62O4.Ye()) == null) {
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62O42 = o4();
        if (interfaceC1460000o62O42 != null) {
            interfaceC1460000o62O42.rt();
        }
        C1402810mbn c1402810mbn = C1402810mbn.LIZ;
        VideoPublishEditModel videoPublishEditModelO4 = O4();
        c1402810mbn.getClass();
        C1402810mbn.LIZIZ(videoPublishEditModelO4, strYe);
        InterfaceC1417050myl interfaceC1417050myl = (InterfaceC1417050myl) getDiContainer().LJIIL(null, InterfaceC1417050myl.class);
        if (interfaceC1417050myl != null) {
            interfaceC1417050myl.HB0(strYe);
        }
    }

    private final InterfaceC1452170ntP F4() {
        return JY0().g().getValue();
    }

    private final boolean H5() {
        return (O4().isDuet() || C1403850mdT.LJIIL(O4())) ? false : true;
    }

    private final void S5() {
        InterfaceC1456070nzh interfaceC1456070nzhC3 = c3();
        if (interfaceC1456070nzhC3 != null) {
            interfaceC1456070nzhC3.c4();
        }
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        C1459710o5Z.LIZ("voice");
        C1402610mbT.LJIL(O4());
    }

    private final void U5() {
        InterfaceC1457250o1b interfaceC1457250o1bQ3 = q3();
        if (interfaceC1457250o1bQ3 != null) {
            interfaceC1457250o1bQ3.ca(true);
        }
        InterfaceC1457250o1b interfaceC1457250o1bQ32 = q3();
        if (interfaceC1457250o1bQ32 != null) {
            interfaceC1457250o1bQ32.Xv0(false);
        }
        InterfaceC1457250o1b interfaceC1457250o1bQ33 = q3();
        if (interfaceC1457250o1bQ33 != null) {
            interfaceC1457250o1bQ33.show();
        }
    }

    private final void W1() {
        if (C570830Ma9.LIZIZ(O4())) {
            U5();
        }
    }

    private final View getView() {
        return Q3().mView;
    }

    @Override // X.InterfaceC1455360nyY
    public void Ch0() {
        InterfaceC1456450o0J interfaceC1456450o0JO3 = O3();
        if (interfaceC1456450o0JO3 != null) {
            interfaceC1456450o0JO3.LLJL();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void D02() {
        InterfaceC1453200nv4 interfaceC1453200nv4H3 = H3();
        if (interfaceC1453200nv4H3 != null) {
            interfaceC1453200nv4H3.ao1();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void Ej2() {
        long j;
        long j2;
        if (C301810BsJ.LIZ()) {
            C197010126e c197010126e = C197010126e.LIZ;
            String strLJIIL = C1428470nHB.LJIIL(O4());
            c197010126e.getClass();
            C1456210nzv c1456210nzvLJIIJJI = C197010126e.LJIIJJI(strLJIIL);
            C1462070o9N c1462070o9NT5 = t5();
            if (c1462070o9NT5 != null) {
                c1462070o9NT5.LLLLIL(c1456210nzvLJIIJJI.LIZJ);
            }
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            C577650Ml9 c577650Ml9 = c1456210nzvLJIIJJI.LJ;
            if (c577650Ml9 != null) {
                j = c577650Ml9.LIZ;
                j2 = c577650Ml9.LIZIZ;
            } else {
                j = 0;
                j2 = 0;
            }
            interfaceC1446740nkeJY0.oz1(j, j2, c1456210nzvLJIIJJI.LIZ);
        } else {
            C197010126e c197010126e2 = C197010126e.LIZ;
            String strLJIIL2 = C1428470nHB.LJIIL(O4());
            CreativeInfo creativeInfo = O4().getCreativeInfo();
            c197010126e2.getClass();
            C1456210nzv c1456210nzvLJIIJ = C197010126e.LJIIJ(creativeInfo, strLJIIL2);
            JY0().i61(c1456210nzvLJIIJ.LIZIZ);
            C1462070o9N c1462070o9NT52 = t5();
            if (c1462070o9NT52 != null) {
                c1462070o9NT52.LLLLIL(c1456210nzvLJIIJ.LIZJ);
            }
            InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
            if (interfaceC1460000o62O4 != null) {
                interfaceC1460000o62O4.EJ2(22, C197010126e.LIZJ(c1456210nzvLJIIJ));
            }
        }
        C1446250njr c1446250njr = C1446250njr.LIZ;
        VideoPublishEditModel videoPublishEditModelO4 = O4();
        c1446250njr.getClass();
        C1446250njr.LIZ(videoPublishEditModelO4);
    }

    @Override // X.InterfaceC1455360nyY
    public void Mi1() {
        InterfaceC1431860nMe interfaceC1431860nMeK5;
        if (C1662060tLw.LIZIZ(getView()) || (interfaceC1431860nMeK5 = k5()) == null) {
            return;
        }
        interfaceC1431860nMeK5.tJ0(true);
    }

    @Override // X.InterfaceC1455360nyY
    public void Ng2() {
        if (C564860MDk.LIZJ(O4().getAILivePhotoModel(), getActivity())) {
            return;
        }
        if (O4().isCurrentAutoCutMode()) {
            Activity activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131836575);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        C0MFO c0mfoK4 = K4();
        LivePhotoPreviewMode livePhotoPreviewModeLB1 = c0mfoK4 != null ? c0mfoK4.LB1() : null;
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 != null) {
            interfaceC1460000o62O4.UH2(livePhotoPreviewModeLB1);
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void U81() {
        InterfaceC1455610nyx interfaceC1455610nyxH2;
        if (!C1428520nHG.LJIIZILJ(O4())) {
            O4().creativeModel.editSaveLocalModel.withSaveTypeOption = false;
            YB0();
            C1418900n1k c1418900n1k = C1418900n1k.LIZ;
            VideoPublishEditModel videoPublishEditModelO4 = O4();
            c1418900n1k.getClass();
            C1418900n1k.LIZ(0, 0, videoPublishEditModelO4, "save");
            return;
        }
        if (C1418920n1m.LIZ() && (interfaceC1455610nyxH2 = H2()) != null) {
            interfaceC1455610nyxH2.Jf1(false, false);
        }
        Activity activity = getActivity();
        if (activity != null) {
            C1451630nsX c1451630nsX = (C1451630nsX) getDiContainer().LJIIL(null, C1451630nsX.class);
            C1418900n1k c1418900n1k2 = C1418900n1k.LIZ;
            VideoPublishEditModel videoPublishEditModelO42 = O4();
            C1462070o9N c1462070o9NT5 = t5();
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            InterfaceC1455610nyx interfaceC1455610nyxH22 = H2();
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 752);
            AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(this, 753);
            c1418900n1k2.getClass();
            C1418900n1k.LIZLLL(activity, videoPublishEditModelO42, c1462070o9NT5, interfaceC1446740nkeJY0, c1451630nsX, awS566S0100000_22, awS566S0100000_222, interfaceC1455610nyxH22, null);
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void UX0() {
        InterfaceC1453020num interfaceC1453020numV5 = v5();
        if (interfaceC1453020numV5 != null) {
            interfaceC1453020numV5.H52(true);
        }
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        C1402610mbT.LJJII(O4(), null, false, 14);
    }

    @Override // X.InterfaceC1455360nyY
    public void VN() {
        Context contextD5 = d5();
        if (contextD5 != null) {
            M5("click_edit_voice_entrance");
            InterfaceC1455720nz8 interfaceC1455720nz8G2 = G2();
            if (interfaceC1455720nz8G2 != null) {
                interfaceC1455720nz8G2.yf0(contextD5);
            }
            C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
            InterfaceC1455720nz8 interfaceC1455720nz8G22 = G2();
            if (interfaceC1455720nz8G22 != null) {
                interfaceC1455720nz8G22.c4();
            }
            C1402610mbT.LJIL(O4());
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void ZW() {
        C1DRG diContainer;
        C19530711b7 c19530711b7;
        if (C564860MDk.LIZJ(O4().getAILivePhotoModel(), getActivity()) || (diContainer = getDiContainer()) == null || (c19530711b7 = (C19530711b7) diContainer.LJIIL(null, C19530711b7.class)) == null) {
            return;
        }
        c19530711b7.FI2();
    }

    public final void d6() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        CreativeToast creativeToastN5 = n5();
        if (creativeToastN5 != null) {
            creativeToastN5.dismiss();
        }
        if (O4().getEditMusicSyncMode()) {
            InterfaceC1419190n2D interfaceC1419190n2DW2 = W2();
            if (interfaceC1419190n2DW2 != null) {
                interfaceC1419190n2DW2.tG1(false, new AwS601S0100000_22(this, 542));
                return;
            }
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPF4 = F4();
        if (interfaceC1452170ntPF4 != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPF4)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && slots.size() >= 2) {
            InterfaceC1419190n2D interfaceC1419190n2DW22 = W2();
            if (interfaceC1419190n2DW22 != null) {
                interfaceC1419190n2DW22.tG1(true, new AwS601S0100000_22(this, 543));
                return;
            }
            return;
        }
        Activity activity = getActivity();
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833430);
            C1390380mHk.LIZ(activity, 1055, creativeToastBuilder);
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void dm() {
        InterfaceC1454950nxt interfaceC1454950nxtI3 = i3();
        if (interfaceC1454950nxtI3 != null) {
            interfaceC1454950nxtI3.dm();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void em() {
        if (C1428470nHB.LLIIIJ(O4())) {
            InterfaceC1453420nvQ interfaceC1453420nvQB3 = B3();
            if (interfaceC1453420nvQB3 != null) {
                interfaceC1453420nvQB3.vR(false, "saveTextVideoFromEdit", "video_edit_page");
                return;
            }
            return;
        }
        InterfaceC1453420nvQ interfaceC1453420nvQB32 = B3();
        if (interfaceC1453420nvQB32 != null) {
            interfaceC1453420nvQB32.vR(false, "clickPopupFromEdit", "video_edit_page");
        }
    }

    public final Activity getActivity() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return (Activity) getDiContainer().LJIIL(null, Activity.class);
        }
        return null;
    }

    @Override // X.InterfaceC1455360nyY
    public void iR0() {
        MutableLiveData<Boolean> mutableLiveDataFz0;
        InterfaceC1461350o8D interfaceC1461350o8DE4 = e4();
        if (interfaceC1461350o8DE4 != null && (mutableLiveDataFz0 = interfaceC1461350o8DE4.fz0()) != null) {
            mutableLiveDataFz0.setValue(Boolean.FALSE);
        }
        W1();
        InterfaceC1455610nyx interfaceC1455610nyxH2 = H2();
        if (interfaceC1455610nyxH2 != null) {
            interfaceC1455610nyxH2.bo();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void lM2() {
        String strX5 = x5(2131833435);
        Activity activity = getActivity();
        if (activity != null) {
            C21566919al c21566919al = new C21566919al(activity);
            c21566919al.LIZJ = C20642515q3.LJFF().getString(2131825165, strX5);
            c21566919al.LJIIJ(R.string.fte, new DialogInterfaceOnClickListenerC1466630oGj(this, 4), false);
            c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0o06
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void o02() {
        if (C1428520nHG.LJIIJJI(O4()) && O4().getOrigin() == 2) {
            S5();
            return;
        }
        if ((!C1428520nHG.LJJL(O4()) && !C1428520nHG.LJJLIIIIJ(O4())) || C1428520nHG.LJJJJL(O4())) {
            S5();
            return;
        }
        Activity activity = getActivity();
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829830);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3066, creativeToastBuilder);
        }
    }

    public final C1DRG o2() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return getDiContainer();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Integer> liveDataWw;
        C0ETY c0ety;
        Class<InterfaceC1455610nyx> cls;
        AwS601S0100000_22 awS601S0100000_22;
        InterfaceC1410280mnq interfaceC1410280mnqC5;
        C385670FAf<SwitchModePayload> c385670FAfB31;
        super.onCreate();
        if (this.LLILZLL) {
            return;
        }
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel videoPublishEditModelO4 = O4();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1455610nyx.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 540);
        } else {
            if (!C365940EWi.LIZLLL(videoPublishEditModelO4)) {
                InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) ((C05YF) diContainer.LJIIL(null, InterfaceC1455610nyx.class));
                if (interfaceC1455610nyx != null && (liveDataWw = interfaceC1455610nyx.ww()) != null) {
                    liveDataWw.observe(this, new AObserverS184S0200000_22(this, interfaceC1455610nyx, 7));
                }
                C533090KvT.LIZIZ.LIZLLL(O4().getOutputFile(), this, new ARunnableS122S0100000_22(this, 78));
                interfaceC1410280mnqC5 = C5();
                if (interfaceC1410280mnqC5 != null || (c385670FAfB31 = interfaceC1410280mnqC5.B31()) == null) {
                }
                c385670FAfB31.LIZ(this, new AObjectS245S0100000_22(this, 229));
                return;
            }
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1455610nyx.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 541);
        }
        c0ety.Sd(cls, awS601S0100000_22);
        C533090KvT.LIZIZ.LIZLLL(O4().getOutputFile(), this, new ARunnableS122S0100000_22(this, 78));
        interfaceC1410280mnqC5 = C5();
        if (interfaceC1410280mnqC5 != null) {
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void pc2() {
        InterfaceC1452170ntP value;
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        C1459710o5Z.LIZ("sticker");
        if (!C0BVH.LIZ() || O4().videoFps(true) >= C0BM4.LIZ() || (value = JY0().g().getValue()) == null) {
            return;
        }
        value.setPreviewFps(C0BM4.LIZ(), true);
    }

    @Override // X.InterfaceC1455360nyY
    public void r81() {
        MutableLiveData<Boolean> mutableLiveDataFz0;
        InterfaceC1461350o8D interfaceC1461350o8DE4 = e4();
        if (interfaceC1461350o8DE4 != null && (mutableLiveDataFz0 = interfaceC1461350o8DE4.fz0()) != null) {
            mutableLiveDataFz0.setValue(Boolean.FALSE);
        }
        if (C0MT6.LIZ() && H5()) {
            D02();
        } else {
            InterfaceC1418580n1E interfaceC1418580n1EZ4 = z4();
            if (interfaceC1418580n1EZ4 != null) {
                interfaceC1418580n1EZ4.show();
            }
            C1402610mbT.LJJIIZ(O4());
        }
        InterfaceC1455610nyx interfaceC1455610nyxH2 = H2();
        if (interfaceC1455610nyxH2 != null) {
            interfaceC1455610nyxH2.bo();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void tI0() {
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 != null) {
            interfaceC1460000o62O4.rm(1300, false);
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void u40() {
        if (C564860MDk.LIZJ(O4().getAILivePhotoModel(), getActivity())) {
            return;
        }
        InterfaceC1452510ntx interfaceC1452510ntxT2 = T2();
        if (interfaceC1452510ntxT2 != null) {
            interfaceC1452510ntxT2.show();
        }
        C1402680mba.LIZJ(C1402680mba.LIZ, O4());
    }

    @Override // X.InterfaceC1455360nyY
    public void uN() {
        C1455260nyO c1455260nyO;
        InterfaceC1419190n2D interfaceC1419190n2DW2 = W2();
        if (interfaceC1419190n2DW2 != null) {
            interfaceC1419190n2DW2.uV0();
        }
        if (C1428520nHG.LJJLIL(O4()) && O4().getAILivePhotoModel().LJII()) {
            C564860MDk.LJ(d5(), "effect", new AwS566S0100000_22(this, 751));
            return;
        }
        if (!C1428520nHG.LJJLIL(O4()) || H4() == null) {
            R5();
            return;
        }
        C363500EMy.LIZ.getClass();
        C363500EMy.LJIIIZ = true;
        AbstractC1453750nvx abstractC1453750nvxQ3 = Q3();
        if ((abstractC1453750nvxQ3 instanceof C1455260nyO) && (c1455260nyO = (C1455260nyO) abstractC1453750nvxQ3) != null) {
            C1455260nyO.LLLLZLLLI(c1455260nyO, true, 2);
        }
        O4().creativeModel.effectEntrancePosition = "editor_pro_panel";
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 != null) {
            C1402610mbT.LJJI(O4(), interfaceC1460000o62O4.Oz1(), true);
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void uU1() {
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
        InterfaceC1455730nz9 interfaceC1455730nz9M3 = m3();
        if (interfaceC1455730nz9M3 != null) {
            interfaceC1455730nz9M3.c4();
        }
    }

    @Override // X.InterfaceC1455360nyY
    public void ur2() {
        if (C564860MDk.LIZLLL(O4().getAILivePhotoModel(), getActivity())) {
            return;
        }
        if (C1403920mda.LIZ(O4(), false) && !O4().isCurrentAutoCutMode()) {
            InterfaceC1451320ns2 interfaceC1451320ns2P4 = P4();
            if (interfaceC1451320ns2P4 != null) {
                interfaceC1451320ns2P4.oh2(true);
                return;
            }
            return;
        }
        Activity activity = getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131838240);
            c1389890mGx.LJIIJJI();
        }
        C201955140j.LIZ("EditToolBarClickCallbacksComponent Unable to enter photo template");
    }

    @Override // X.InterfaceC1455360nyY
    public void xC() {
        C1DRG c1drgLJIIIZ;
        InterfaceC379580EuS interfaceC379580EuS;
        C1462070o9N c1462070o9NT5 = t5();
        if (c1462070o9NT5 == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NT5)) == null || (interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class)) == null) {
            return;
        }
        interfaceC379580EuS.m4();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    private final void M5(String str) {
        C1653260t7k.LIZ(str);
    }

    private final String x5(int i) {
        return Q3().getString(i);
    }

    @Override // X.InterfaceC1455360nyY
    public void AW1(AbstractC564980MDw abstractC564980MDw) {
        InterfaceC1455680nz4 interfaceC1455680nz4X1 = X1();
        if (interfaceC1455680nz4X1 != null) {
            interfaceC1455680nz4X1.Os(abstractC564980MDw);
        }
    }

    public final void E5(int i) {
        C1455260nyO c1455260nyO;
        C1455260nyO c1455260nyO2;
        C1455260nyO c1455260nyO3;
        if (i != 10) {
            if (i != 11) {
                if (i != 25) {
                    if (i != 26) {
                        if (i != 1100) {
                            if (i != 1101) {
                                if (i != 1104) {
                                    if (i != 1105) {
                                        if (i != 1200) {
                                            if (i != 1300) {
                                                if (i != 1700) {
                                                    if (i != 1800) {
                                                        if (i != 8000 && i != 8001) {
                                                            switch (i) {
                                                                case 1:
                                                                    InterfaceC1456450o0J interfaceC1456450o0JO3 = O3();
                                                                    if (interfaceC1456450o0JO3 != null) {
                                                                        interfaceC1456450o0JO3.LLJL();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    uN();
                                                                    break;
                                                                case 3:
                                                                    KV("click_button", null);
                                                                    break;
                                                                case 4:
                                                                    pc2();
                                                                    break;
                                                                case 5:
                                                                    WZ1();
                                                                    break;
                                                                case 6:
                                                                    o02();
                                                                    break;
                                                                case 7:
                                                                    r81();
                                                                    break;
                                                                case 8:
                                                                    iR0();
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 14:
                                                                            dm();
                                                                            break;
                                                                        case 15:
                                                                            AbstractC1453750nvx abstractC1453750nvxQ3 = Q3();
                                                                            if ((abstractC1453750nvxQ3 instanceof C1455260nyO) && (c1455260nyO2 = (C1455260nyO) abstractC1453750nvxQ3) != null) {
                                                                                C1455260nyO.LLLLZLLLI(c1455260nyO2, false, 3);
                                                                            }
                                                                            break;
                                                                        case 16:
                                                                            u40();
                                                                            break;
                                                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                            Qh2();
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                                    AbstractC1453750nvx abstractC1453750nvxQ32 = Q3();
                                                                                    if ((abstractC1453750nvxQ32 instanceof C1455260nyO) && (c1455260nyO3 = (C1455260nyO) abstractC1453750nvxQ32) != null) {
                                                                                        c1455260nyO3.LLLLZ(new AwS566S0100000_22(this, 756));
                                                                                    }
                                                                                    break;
                                                                                case 21:
                                                                                    W61(false);
                                                                                    break;
                                                                                case 22:
                                                                                    Ej2();
                                                                                    break;
                                                                                case 23:
                                                                                    em();
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            C0MER c0merZ4 = Z4();
                                                            if (c0merZ4 != null) {
                                                                c0merZ4.fK1();
                                                            }
                                                        }
                                                    } else {
                                                        AW1(new C565010MDz(0));
                                                    }
                                                } else {
                                                    UX0();
                                                }
                                            } else {
                                                tI0();
                                            }
                                        } else {
                                            Mi1();
                                        }
                                    } else {
                                        Ng2();
                                    }
                                } else {
                                    ur2();
                                }
                            } else {
                                InterfaceC1456450o0J interfaceC1456450o0JO32 = O3();
                                if (interfaceC1456450o0JO32 != null) {
                                    interfaceC1456450o0JO32.LLJL();
                                }
                            }
                        } else {
                            GQ1();
                        }
                    } else {
                        ZW();
                    }
                } else {
                    U81();
                }
            } else {
                C1402610mbT.LJJIIJZLJL(O4(), "main_first", 0, null, null, C1402610mbT.LJIILLIIL(O4()), 60);
                Q3().LLLLIILL("edit_page_subtitle_sidebar", AFwS210S0000000_22.get$arr$(343));
            }
        } else {
            AbstractC1453750nvx abstractC1453750nvxQ33 = Q3();
            if ((abstractC1453750nvxQ33 instanceof C1455260nyO) && (c1455260nyO = (C1455260nyO) abstractC1453750nvxQ33) != null) {
                c1455260nyO.LLLLZ(new AwS566S0100000_22(this, 755));
            }
        }
        C533090KvT.LIZIZ.LIZLLL(O4().getOutputFile(), this, new ARunnableS122S0100000_22(this, 77));
    }

    @Override // X.InterfaceC1455360nyY
    public void W61(boolean z) {
        String str;
        boolean z2;
        String string;
        NowsShootModel nowsShootModel;
        VideoPublishEditModel videoPublishEditModelO4 = O4();
        Activity activity = getActivity();
        if (C565160MEo.LIZJ(videoPublishEditModelO4) && !C1414940mvM.LIZJ(videoPublishEditModelO4) && C564860MDk.LIZLLL(videoPublishEditModelO4.getAILivePhotoModel(), activity)) {
            return;
        }
        InterfaceC1419190n2D interfaceC1419190n2DW2 = W2();
        if (interfaceC1419190n2DW2 != null) {
            interfaceC1419190n2DW2.uV0();
        }
        C1653260t7k.LIZ("click_edit_template_entrance");
        C1DRG diContainer = getDiContainer();
        C1417180myy c1417180myyLJII = C1417160myw.LJII(d5(), O4(), diContainer, true);
        if (!z) {
            if (O4().creativeModel.autoCutModel.applyScenario == EnumC1417150myv.UNSET.getCode()) {
                O4().creativeModel.autoCutModel.applyScenario = EnumC1417150myv.VIDEO_EDIT.getCode();
            }
            List<AutoCutMediaModel> list = c1417180myyLJII.LIZ;
            if (O4().creativeModel.photoModeEnterEditingStage.photoModeEnterAutoCut) {
                str = "edit_page_photo";
            } else {
                str = "video_edit_page";
            }
            String str2 = O4().mShootWay;
            String creationId = O4().getCreationId();
            boolean zIsCurrentAutoCutMode = O4().isCurrentAutoCutMode();
            String strLJJIIZI = C1428470nHB.LJJIIZI(O4());
            int origin = O4().getOrigin();
            String musicId = O4().getMusicId();
            String strLIZIZ = C1412490mrP.LIZIZ(O4());
            String str3 = O4().creativeModel.initialModel.dmCameraModel.enterDM;
            if (str3 == null) {
                str3 = "";
            }
            if (C1428470nHB.LJJLIIIJLLLLLLLZ(O4()) && (nowsShootModel = O4().creativeModel.nowsShootModel) != null && nowsShootModel.type == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String strLIZLLL = C1403850mdT.LIZLLL(O4());
            String strLJ = C1403850mdT.LJ(O4());
            boolean zLIZIZ = C573570MeZ.LIZIZ(O4());
            EnumC1413160msU enumC1413160msU = O4().creativeModel.photoModeEnterEditingStage.itemType;
            if (enumC1413160msU != null) {
                string = enumC1413160msU.toString();
            } else {
                string = null;
            }
            C1417710mzp.LJIIZILJ(list, str, str2, creationId, zIsCurrentAutoCutMode, strLJJIIZI, origin, musicId, strLIZIZ, str3, z2, string, strLIZLLL, strLJ, zLIZIZ, 0, false, null, 0, null, O4().creativeModel.imageEditModel.livePicCnt, O4().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoContent, O4().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage, false, C1428470nHB.LJJJZ(O4()), null, new AwS601S0100000_22(this, 539), 42958848);
        }
        if (C1417160myw.LJIJJ(null, O4()) && c1417180myyLJII.LIZ != null) {
            if (C1428520nHG.LJJJJLI(O4())) {
                C0E3C c0e3c = C0E3C.LIZ;
                Context contextD5 = d5();
                if (contextD5 != null) {
                    InterfaceC1456070nzh interfaceC1456070nzhC3 = c3();
                    InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
                    VideoPublishEditModel videoPublishEditModelO42 = O4();
                    AwS266S0300000_22 awS266S0300000_22 = new AwS266S0300000_22(this, diContainer, c1417180myyLJII, 20);
                    c0e3c.getClass();
                    C0E3C.LIZIZ(contextD5, interfaceC1456070nzhC3, interfaceC1446740nkeJY0, videoPublishEditModelO42, awS266S0300000_22);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C1417160myw.LJIL(d5(), diContainer, O4(), c1417180myyLJII, false, 48);
            }
            D5();
            return;
        }
        InterfaceC1460000o62 interfaceC1460000o62O4 = o4();
        if (interfaceC1460000o62O4 != null) {
            interfaceC1460000o62O4.rm(21, false);
        }
    }

    public static final boolean N5(C1455270nyP c1455270nyP, int i) {
        InterfaceC1455840nzK interfaceC1455840nzKZ1 = c1455270nyP.Z1();
        if (interfaceC1455840nzKZ1 != null) {
            List<Integer> first = interfaceC1455840nzKZ1.st0().getFirst();
            String second = interfaceC1455840nzKZ1.st0().getSecond();
            InterfaceC1455840nzK interfaceC1455840nzKZ12 = c1455270nyP.Z1();
            if (interfaceC1455840nzKZ12 != null && !interfaceC1455840nzKZ12.VG0() && !first.contains(Integer.valueOf(i))) {
                Activity activity = c1455270nyP.getActivity();
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(second);
                    C1390380mHk.LIZ(activity, 6015, creativeToastBuilder);
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1455360nyY
    public void KV(String str, Function1<? super StickerModel, Unit> function1) {
        InterfaceC1461660o8i interfaceC1461660o8iLLLLLLLLL;
        M5("click_edit_text_entrance");
        C1462070o9N c1462070o9NT5 = t5();
        if (c1462070o9NT5 != null && (interfaceC1461660o8iLLLLLLLLL = c1462070o9NT5.LLLLLLLLL()) != null && interfaceC1461660o8iLLLLLLLLL.lK1()) {
            return;
        }
        C1462070o9N c1462070o9NT52 = t5();
        if (c1462070o9NT52 != null) {
            C1462070o9N.LLLZLL(c1462070o9NT52, null, function1, 1);
        }
        u4.LJJLIIIIJ(O4(), str, 0, null, null, null, null, null, null, null, 1016);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1455270nyP(C1DRG c1drg, Function0<? extends AbstractC1453750nvx> function0, Function0<? extends C1462070o9N> function02, Function0<? extends Context> function03, Function0<C384100F4e> function04, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = function03;
        this.LLILZIL = function04;
        this.LLILZLL = z;
    }
}
