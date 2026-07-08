package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414640mus extends AbstractC2255721DQs<InterfaceC1413600mtC> implements InterfaceC1413600mtC, InterfaceC379610EuV {
    public static final C1414690mux LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public InterfaceC1414530muh LLJJLIIIJLLLLLLLZ;
    public InterfaceC1414570mul LLJL;
    public Runnable LLJLLL;
    public Runnable LLJZ;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366390EYb.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(218));
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366660EZc.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C1412740mro.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455620nyy.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1412230mqz.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1419190n2D.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    public final InterfaceC1731706qJ LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 636));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 635));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 634));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 633));
    public final Set<C1412470mrN> LLJZIJLIL = new LinkedHashSet();
    public final InterfaceC497601wk LLL = C2296808zG.LIZIZ();
    public final C1413140msS LLLF = new C1413140msS(this);
    public final C1412900ms4 LLLFF = new C1412900ms4(this);
    public final C1414700muy LLLFFI = new C1414700muy(this);
    public final C1414650mut LLLFZ = new C1414650mut(this);
    public final C1414560muk LLLI = new C1414560muk(this);

    public InterfaceC1413600mtC W1() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [X.0mux] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1414640mus.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1414640mus.class, "editModel", "getEditModel$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1414640mus.class, "editPreviewApi", "getEditPreviewApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1414640mus.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0), new C2217381BqS(C1414640mus.class, "editEffectApi", "getEditEffectApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0), new C2217381BqS(C1414640mus.class, "toolbarApi", "getToolbarApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1414640mus.class, "editStickApi", "getEditStickApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C1414640mus.class, "mixEditingMaterialDataApi", "getMixEditingMaterialDataApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C1414640mus.class, "editCutMusicApi", "getEditCutMusicApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new C2217381BqS(C1414640mus.class, "editAutoCutApi", "getEditAutoCutApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C1414640mus.class, "editVolumeV2Api", "getEditVolumeV2Api$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1414640mus.class, "lighteningMusicApi", "getLighteningMusicApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C1414640mus.class, "editUgcTemplateApi", "getEditUgcTemplateApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/ugctemplate/EditUgcTemplateApi;", 0), new C2217381BqS(C1414640mus.class, "editAdapterApi", "getEditAdapterApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1414640mus.class, "videoPicCountHolder", "getVideoPicCountHolder$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/mixediting/eventtrack/MixEditingCurrentEditModelVideoPicCountHolder;", 0), new C2217381BqS(C1414640mus.class, "silentAutoCaptionApi", "getSilentAutoCaptionApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0), new C2217381BqS(C1414640mus.class, "editPrePublishApi", "getEditPrePublishApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C1414640mus.class, "editPreviewResDowngradeApi", "getEditPreviewResDowngradeApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/videoquality/EditPreviewResDowngradeApi;", 0), new C2217381BqS(C1414640mus.class, "musicController", "getMusicController$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C1414640mus.class, "editMusicControllerApi", "getEditMusicControllerApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C1414640mus.class, "editAdjustClipsApi", "getEditAdjustClipsApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new C2217381BqS(C1414640mus.class, "editorAutoSaveDraftApi", "getEditorAutoSaveDraftApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C1414640mus.class, "lyricBusinessApi", "getLyricBusinessApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0)};
        LLLII = new Object() { // from class: X.0mux
        };
        LLLIIIIL = 8;
    }

    public final InterfaceC1446740nke B3() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLLIIII[2]);
    }

    public final C0EMC C5() {
        return (C0EMC) this.LLJLILLLLZIIL.getValue();
    }

    public final C0EWD D5() {
        return (C0EWD) this.LLJLIL.getValue();
    }

    public final InterfaceC1412230mqz E3() {
        return (InterfaceC1412230mqz) this.LLJJJ.getValue(this, LLLIIII[17]);
    }

    public final C1415150mvh E5() {
        return (C1415150mvh) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC1413600mtC
    public void F50() {
        InterfaceC1414530muh interfaceC1414530muh;
        C1412800mru c1412800mruLJIL;
        C1414700muy c1414700muy = this.LLLFFI;
        C1414660muu c1414660muuO4 = c1414700muy.LIZ.o4();
        c1414660muuO4.getClass();
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get recovery = ");
        AVMusic aVMusic = c1414660muuO4.LJ;
        sbLIZ.append(aVMusic != null ? aVMusic.getName() : null);
        C201955140j.LIZLLL(c0mj8, "music_recovery", C2188811AlT.LIZIZ(sbLIZ));
        AVMusic aVMusic2 = c1414660muuO4.LJ;
        if (aVMusic2 != null) {
            if ((aVMusic2.hasExtendMusicList() && C349930Dnj.LIZ(c1414700muy.LIZ.m3(), c1414700muy.LIZ.B3().LLZ(), false)) || ((interfaceC1414530muh = c1414700muy.LIZ.LLJJLIIIJLLLLLLLZ) != null && (c1412800mruLJIL = interfaceC1414530muh.LJIL()) != null && c1412800mruLJIL.LIZ == MixEditingMaterialType.AI_ALIVE_TEMPLATE)) {
                long jLJIILL = s.LJIILL(c1414700muy.LIZ.B3());
                aVMusic2.setExtendMusicList(null);
                aVMusic2.setMusicEndFromCut((int) jLJIILL);
            }
            c1414700muy.LIZ.Io1(aVMusic2, EnumC1413120msQ.RECOVERY, 0, 0, true);
        }
    }

    public final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLJJIII.getValue(this, LLLIIII[13]);
    }

    public final InterfaceC1419190n2D H2() {
        return (InterfaceC1419190n2D) this.LLJJJJJIL.getValue(this, LLLIIII[20]);
    }

    public final InterfaceC1461350o8D H3() {
        return (InterfaceC1461350o8D) this.LLJ.getValue(this, LLLIIII[6]);
    }

    public final InterfaceC1413540mt6 H4() {
        return (InterfaceC1413540mt6) this.LLJILLL.getValue(this, LLLIIII[11]);
    }

    public final InterfaceC1460000o62 H5() {
        return (InterfaceC1460000o62) this.LLIZLLLIL.getValue(this, LLLIIII[5]);
    }

    public final InterfaceC366450EYh K4() {
        return (InterfaceC366450EYh) this.LLJJL.getValue(this, LLLIIII[22]);
    }

    public final C1412740mro M5() {
        return (C1412740mro) this.LLJJIJI.getValue(this, LLLIIII[14]);
    }

    public final InterfaceC366660EZc O3() {
        return (InterfaceC366660EZc) this.LLJJI.getValue(this, LLLIIII[12]);
    }

    public final C1415130mvf O4() {
        return (C1415130mvf) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC1413600mtC
    public void ON0() {
        this.LLLFFI.LIZ.O4().LIZIZ();
    }

    public final InterfaceC1418580n1E Q3() {
        return (InterfaceC1418580n1E) this.LLJILJILJ.getValue(this, LLLIIII[10]);
    }

    public final InterfaceC1417050myl T2() {
        return (InterfaceC1417050myl) this.LLJILJIL.getValue(this, LLLIIII[9]);
    }

    public final InterfaceC366390EYb W2() {
        return (InterfaceC366390EYb) this.LLILZLL.getValue(this, LLLIIII[3]);
    }

    public final InterfaceC1413730mtP Z4() {
        return (InterfaceC1413730mtP) this.LLJI.getValue(this, LLLIIII[7]);
    }

    public final InterfaceC1457250o1b c3() {
        return (InterfaceC1457250o1b) this.LLJIJIL.getValue(this, LLLIIII[8]);
    }

    public final InterfaceC1454960nxu d5() {
        return (InterfaceC1454960nxu) this.LLJJJIL.getValue(this, LLLIIII[18]);
    }

    public final InterfaceC559500Lwy e4() {
        return (InterfaceC559500Lwy) this.LLJJJJLIIL.getValue(this, LLLIIII[21]);
    }

    @Override // X.InterfaceC1413600mtC
    public void gJ2() {
        Runnable runnable = this.LLJZ;
        this.LLJZ = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLLIIII[0]);
    }

    public final InterfaceC1455500nym i3() {
        return (InterfaceC1455500nym) this.LLIZ.getValue(this, LLLIIII[4]);
    }

    public final VideoPublishEditModel m3() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLLIIII[1]);
    }

    public final C1414660muu o4() {
        return (C1414660muu) this.LLJLLIL.getValue();
    }

    public final InterfaceC1454960nxu q3() {
        return (InterfaceC1454960nxu) this.LLJJJJ.getValue(this, LLLIIII[19]);
    }

    @Override // X.InterfaceC1413600mtC
    public void sU() {
        Runnable runnable = this.LLJLLL;
        this.LLJLLL = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final InterfaceC1451520nsM v3() {
        return (InterfaceC1451520nsM) this.LLJJIJIL.getValue(this, LLLIIII[16]);
    }

    public final InterfaceC1455620nyy x5() {
        return (InterfaceC1455620nyy) this.LLJJIJIIJIL.getValue(this, LLLIIII[15]);
    }

    public void P5() {
        i3().aH(false);
    }

    @Override // X.InterfaceC1413600mtC
    public void Qd() {
        C5().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1414530muh.class, new AwS601S0100000_22(this, 425));
    }

    @Override // X.InterfaceC1413600mtC
    public C1414660muu y41() {
        return o4();
    }

    public final Runnable F4() {
        return this.LLJLLL;
    }

    public final InterfaceC497601wk P4() {
        return this.LLL;
    }

    public final InterfaceC1414530muh T4() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C1414650mut X1() {
        return this.LLLFZ;
    }

    public final C1414700muy Z1() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C1413140msS k5() {
        return this.LLLF;
    }

    public final InterfaceC1414570mul n5() {
        return this.LLJL;
    }

    public final Set<C1412470mrN> o2() {
        return this.LLJZIJLIL;
    }

    public final C19A3 t5() {
        return this.LL;
    }

    public final C1414560muk v5() {
        return this.LLLI;
    }

    public final C1412900ms4 w2() {
        return this.LLLFF;
    }

    public final Runnable z4() {
        return this.LLJZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    @Override // X.InterfaceC1413600mtC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void AO1(X.C1412800mru r11) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414640mus.AO1(X.0mru):void");
    }

    @Override // X.InterfaceC1413600mtC
    public void DV(C1413690mtL c1413690mtL) {
        C1412800mru c1412800mruLJIL;
        Asset asset;
        InterfaceC1418580n1E interfaceC1418580n1EQ3;
        C1414700muy c1414700muy = this.LLLFFI;
        c1414700muy.getClass();
        if (c1413690mtL.LIZJ == EnumC1998707sH.NORMAL && C306410Bzj.LIZ()) {
            InterfaceC1417050myl interfaceC1417050mylT2 = c1414700muy.LIZ.T2();
            if (interfaceC1417050mylT2 != null) {
                interfaceC1417050mylT2.Xm1(C0MJ9.MIX_EDITING);
            }
        } else {
            InterfaceC1417050myl interfaceC1417050mylT22 = c1414700muy.LIZ.T2();
            if (interfaceC1417050mylT22 != null) {
                interfaceC1417050mylT22.d32(C0MJ9.MIX_EDITING);
            }
        }
        InterfaceC1414530muh interfaceC1414530muh = c1414700muy.LIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            c1412800mruLJIL = interfaceC1414530muh.LJIL();
        } else {
            c1412800mruLJIL = null;
        }
        if (MusicBeanUtilKt.extractAVMusic(c1414700muy.LIZ.m3().creativeModel.musicBuzModel) != null && (interfaceC1418580n1EQ3 = c1414700muy.LIZ.Q3()) != null) {
            interfaceC1418580n1EQ3.A10(1.0f);
        }
        Asset assetLIZ = C1414150mu5.LIZ(c1414700muy.LIZ.B3().g().getValue());
        if (assetLIZ == null || assetLIZ.getAsset_type() != AssetType.CAPCUT_TEMPLATE.getValue() || (c1412800mruLJIL != null && (asset = c1412800mruLJIL.LIZLLL) != null && C1416120mxG.LIZ(asset))) {
            C1414640mus c1414640mus = c1414700muy.LIZ;
            c1414640mus.W82(c1414640mus.m3().getMusicId(), "clear music when clear AI template");
            InterfaceC1418580n1E interfaceC1418580n1EQ32 = c1414700muy.LIZ.Q3();
            if (interfaceC1418580n1EQ32 != null) {
                C1414930mvL.LIZ.getClass();
                interfaceC1418580n1EQ32.Hr1(true, false, C1414930mvL.LJIILIIL());
                if (!C291340BbQ.LIZ() || C1414600muo.LJFF(c1414700muy.LIZ.m3().getVoiceVolume(), 1.0f)) {
                    interfaceC1418580n1EQ32.N81(1.0f);
                }
            }
        } else {
            c1414700muy.LIZ.m3().setVeAudioRecorderParam(null);
            if (C291350BbR.LIZ()) {
                C1414640mus c1414640mus2 = c1414700muy.LIZ;
                c1414640mus2.W82(c1414640mus2.m3().getMusicId(), "clear music when clear CC template in multi-material");
            }
            InterfaceC1418580n1E interfaceC1418580n1EQ33 = c1414700muy.LIZ.Q3();
            if (interfaceC1418580n1EQ33 != null) {
                C1414930mvL.LIZ.getClass();
                interfaceC1418580n1EQ33.Hr1(true, false, C1414930mvL.LJIILIIL());
                if (!C291340BbQ.LIZ() || C1414600muo.LJFF(c1414700muy.LIZ.m3().getVoiceVolume(), 1.0f)) {
                    interfaceC1418580n1EQ33.N81(1.0f);
                }
            }
        }
        C0EWD c0ewdD5 = c1414700muy.LIZ.D5();
        boolean z = c1413690mtL.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0EWD.LJIIL;
        c0ewdD5.LJFF(z, false, false);
        c1414700muy.LIZ.m3().creativeModel.mixEditingModel.templateMobParams = null;
        if (c1413690mtL.LIZIZ) {
            c1414700muy.LIZ.H5().refresh();
        }
        InterfaceC1417050myl interfaceC1417050mylT23 = c1414700muy.LIZ.T2();
        if (interfaceC1417050mylT23 != null) {
            interfaceC1417050mylT23.Fj2(null);
        }
        InterfaceC1414570mul interfaceC1414570mul = c1414700muy.LIZ.LLJL;
        if (interfaceC1414570mul != null) {
            interfaceC1414570mul.LIZJ(c1413690mtL.LIZJ);
        }
    }

    public void R5(String str) {
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "MixEditingMaterialOperationComponent", str);
    }

    public final void S5(Runnable runnable) {
        this.LLJZ = runnable;
    }

    public final void U5(Runnable runnable) {
        this.LLJLLL = runnable;
    }

    @Override // X.InterfaceC1413600mtC
    public void Us2(InterfaceC1414570mul interfaceC1414570mul) {
        this.LLJL = interfaceC1414570mul;
    }

    public final void d6(InterfaceC1414530muh interfaceC1414530muh) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC1414530muh;
    }

    public final void m6(InterfaceC1414570mul interfaceC1414570mul) {
        this.LLJL = interfaceC1414570mul;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    @Override // X.InterfaceC1413600mtC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o80(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414640mus.o80(java.lang.String):void");
    }

    public C1414640mus(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC1413600mtC
    public void La1(int i, EnumC1998707sH enumC1998707sH) {
        Long lValueOf;
        InterfaceC1419190n2D interfaceC1419190n2DH2;
        C1414700muy c1414700muy = this.LLLFFI;
        c1414700muy.LIZ.C5().LIZJ();
        if (((Boolean) C288130BRb.LIZ.getValue()).booleanValue() && (interfaceC1419190n2DH2 = c1414700muy.LIZ.H2()) != null) {
            interfaceC1419190n2DH2.ar2();
        }
        MusicObject musicObject = c1414700muy.LIZ.m3().creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            lValueOf = Long.valueOf(musicObject.id);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String musicOriginWithCheck = c1414700muy.LIZ.m3().getMusicOriginWithCheck();
        c1414700muy.LIZ.W82(strValueOf, "clearSoundSync");
        C0EMA c0ema = C0EMA.LIZ;
        VideoPublishEditModel videoPublishEditModelM3 = c1414700muy.LIZ.m3();
        Integer numValueOf = Integer.valueOf(i);
        Pair<Integer, Integer> pairLIZ = c1414700muy.LIZ.M5().LIZ();
        c0ema.getClass();
        C0EMA.LIZ(videoPublishEditModelM3, false, strValueOf, musicOriginWithCheck, numValueOf, pairLIZ);
        InterfaceC1414570mul interfaceC1414570mul = c1414700muy.LIZ.LLJL;
        if (interfaceC1414570mul != null) {
            interfaceC1414570mul.LIZJ(enumC1998707sH);
        }
    }

    public boolean N5(int i, int i2) {
        C1412800mru c1412800mruPL;
        InterfaceC1414530muh interfaceC1414530muh;
        C1412800mru c1412800mruPL2;
        String music_id;
        boolean z;
        boolean z2;
        BusinessExtra business_extra;
        BusinessExtra business_extra2;
        InterfaceC1414530muh interfaceC1414530muh2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh2 != null && (c1412800mruPL = interfaceC1414530muh2.pL(i)) != null && (interfaceC1414530muh = this.LLJJLIIIJLLLLLLLZ) != null && (c1412800mruPL2 = interfaceC1414530muh.pL(i2)) != null) {
            MixEditingMaterialType mixEditingMaterialType = c1412800mruPL.LIZ;
            if (mixEditingMaterialType == MixEditingMaterialType.CANCEL_TYPE && c1412800mruPL2.LIZ == MixEditingMaterialType.EFFECT_TYPE) {
                return true;
            }
            MixEditingMaterialType mixEditingMaterialType2 = MixEditingMaterialType.EFFECT_TYPE;
            if (mixEditingMaterialType == mixEditingMaterialType2 && c1412800mruPL2.LIZ == mixEditingMaterialType2) {
                Asset asset = c1412800mruPL.LIZLLL;
                String music_id2 = null;
                if (asset != null && (business_extra2 = asset.getBusiness_extra()) != null) {
                    music_id = business_extra2.getMusic_id();
                } else {
                    music_id = null;
                }
                Asset asset2 = c1412800mruPL2.LIZLLL;
                if (asset2 != null && (business_extra = asset2.getBusiness_extra()) != null) {
                    music_id2 = business_extra.getMusic_id();
                }
                if (Intrinsics.LJFF(music_id, music_id2) && music_id != null && music_id.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((music_id == null || music_id.length() == 0) && (music_id2 == null || music_id2.length() == 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void W82(String str, String str2) {
        C1412800mru c1412800mruLJIL;
        C1413140msS c1413140msS = this.LLLF;
        InterfaceC1414530muh interfaceC1414530muh = c1413140msS.LIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            c1412800mruLJIL = interfaceC1414530muh.LJIL();
        } else {
            c1412800mruLJIL = null;
        }
        if (Intrinsics.LJFF("music_clear_from_capsule", str2)) {
            c1413140msS.LIZ.m3().creativeModel.musicBuzModel.isMusicFromAutoEdit = false;
            c1413140msS.LIZ.o4().LJ = null;
            C1412870ms1.LIZ.getClass();
            C1412870ms1.LIZLLL(c1412800mruLJIL, null, null);
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "music_recovery", "set recovery = null");
            InterfaceC1414530muh interfaceC1414530muh2 = c1413140msS.LIZ.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1414530muh2 != null) {
                interfaceC1414530muh2.tx();
            }
        }
        if (str != null) {
            C1414660muu c1414660muuO4 = c1413140msS.LIZ.o4();
            VideoPublishEditModel videoPublishEditModelM3 = c1413140msS.LIZ.m3();
            InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) c1413140msS.LIZ.getDiContainer().LJIIL(null, InterfaceC1454960nxu.class);
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1413140msS, 921);
            c1414660muuO4.getClass();
            C1414660muu.LIZ(videoPublishEditModelM3, interfaceC1454960nxu, str, awS566S0100000_22);
            c1413140msS.LIZ.m3().creativeModel.musicBuzModel.isMusicFromAutoEdit = false;
        }
    }

    @Override // X.InterfaceC1413600mtC
    public void nB(C1414670muv c1414670muv, C1412460mrM c1412460mrM) {
        C1414650mut c1414650mut = this.LLLFZ;
        if (c1414650mut.LIZ.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            boolean zN5 = c1414650mut.LIZ.N5(c1414670muv.LIZ, c1414670muv.LIZIZ);
            C1414640mus c1414640mus = c1414650mut.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("needSkipSeekToStart: ");
            sbLIZ.append(zN5);
            c1414640mus.R5(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1452170ntP value = c1414650mut.LIZ.B3().g().getValue();
            if (value != null) {
                value.gf(new AwS266S0300000_22(c1414650mut, c1414670muv, c1412460mrM, 30), c1414670muv.LJFF, !zN5);
            }
        }
    }

    @Override // X.InterfaceC1413600mtC
    public void GI2(int i, C1412800mru c1412800mru, boolean z) {
        int iQr;
        InterfaceC1414530muh interfaceC1414530muh = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            iQr = interfaceC1414530muh.qr();
        } else {
            iQr = 0;
        }
        RQ(iQr, i, c1412800mru, true, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    @Override // X.InterfaceC1413600mtC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Io1(com.ss.android.ugc.aweme.creative.model.music.AVMusic r29, X.EnumC1413120msQ r30, int r31, int r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414640mus.Io1(com.ss.android.ugc.aweme.creative.model.music.AVMusic, X.0msQ, int, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    @Override // X.InterfaceC1413600mtC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void RQ(final int r31, final int r32, final X.C1412800mru r33, final boolean r34, final boolean r35) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414640mus.RQ(int, int, X.0mru, boolean, boolean):void");
    }
}
