package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS283S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376630Eph extends AbstractC381020Ewm<InterfaceC376440EpO> implements InterfaceC376440EpO, InterfaceC379610EuV {
    public static final C376690Epn LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final Activity LLILZIL;
    public final InterfaceC376440EpO LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final C01GW LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C01GW LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public boolean LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC497601wk LLJJJJ;
    public final InterfaceC376660Epk LLJJJJJIL;
    public TuxSheet LLJJJJLIIL;
    public C09AE LLJJL;
    public ImageAlbumData LLJJLIIIJLLLLLLLZ;
    public CanvasVideoData LLJL;

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0Epn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C376630Eph.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C376630Eph.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C376630Eph.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C376630Eph.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0), new C2217381BqS(C376630Eph.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C376630Eph.class, "lyricApi", "getLyricApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0), new C2217381BqS(C376630Eph.class, "autoSaveDraftApi", "getAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C376630Eph.class, "resetRecordSegmentsAction", "getResetRecordSegmentsAction()Landroidx/lifecycle/MutableLiveData;", 0), new C2217381BqS(C376630Eph.class, "closeAlbumAction", "getCloseAlbumAction()Landroidx/lifecycle/MutableLiveData;", 0), new C2217381BqS(C376630Eph.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/EditRootScene;", 0), new C2217381BqS(C376630Eph.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C376630Eph.class, "editExitApiComponent", "getEditExitApiComponent()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C376630Eph.class, "oldModel", "getOldModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJLIL = new Object() { // from class: X.0Epn
        };
        LLJLL = 8;
    }

    private final C0EHC B3() {
        return (C0EHC) this.LLJILJIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    private final long E3() {
        return ((Number) this.LLJJIII.getValue()).longValue();
    }

    private final InterfaceC1453420nvQ G2() {
        return (InterfaceC1453420nvQ) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[1]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIIJIL.getValue(this, LLJLILLLLZIIL[10]);
    }

    private final C1455260nyO T2() {
        return (C1455260nyO) this.LLJJIJI.getValue(this, LLJLILLLLZIIL[9]);
    }

    private final boolean T4() {
        VideoPublishEditModel editModel;
        ImageAlbumData imageAlbumData;
        AICoverInfo aiCoverInfo;
        C1446760nkg.LIZ.getClass();
        return (!C1446760nkg.LIZJ() || (editModel = getEditModel()) == null || (imageAlbumData = editModel.getImageAlbumData()) == null || (aiCoverInfo = imageAlbumData.getAiCoverInfo()) == null || !aiCoverInfo.getAnyGenerating()) ? false : true;
    }

    private final InterfaceC1461350o8D W2() {
        return (InterfaceC1461350o8D) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[4]);
    }

    private final C0EC7 m3() {
        return (C0EC7) this.LLJI.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final C0EY2 q3() {
        return (C0EY2) this.LLIZ.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final InterfaceC1453420nvQ H2() {
        return (InterfaceC1453420nvQ) this.LLJJIJIL.getValue(this, LLJLILLLLZIIL[11]);
    }

    public final VideoPublishEditModel H3() {
        return (VideoPublishEditModel) this.LLJJJIL.getValue(this, LLJLILLLLZIIL[12]);
    }

    public final MutableLiveData<Boolean> O3() {
        return (MutableLiveData) this.LLJJ.getValue(this, LLJLILLLLZIIL[7]);
    }

    public final C0E5S Q3() {
        return (C0E5S) this.LLJ.getValue(this, LLJLILLLLZIIL[2]);
    }

    public final InterfaceC559500Lwy o2() {
        return (InterfaceC559500Lwy) this.LLJILLL.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final InterfaceC372610EjD v3() {
        return (InterfaceC372610EjD) this.LLJILJILJ.getValue();
    }

    public final MutableLiveData<Boolean> w2() {
        return (MutableLiveData) this.LLJJI.getValue(this, LLJLILLLLZIIL[8]);
    }

    private final C0ELJ i3() {
        C0EHI value = q3().zu2().getValue();
        if (value != null) {
            return value.LJ;
        }
        return null;
    }

    public final void F4() {
        EditorProModel editorProModel;
        ImageEditRootScene imageEditRootScene;
        if (T2() == null) {
            C19A3 c19a3 = this.LLILLL;
            Scene scene = c19a3 != null ? c19a3.mParentScene : null;
            if ((scene instanceof ImageEditRootScene) && (imageEditRootScene = (ImageEditRootScene) scene) != null) {
                imageEditRootScene.LLZIL();
            }
        } else {
            C1455260nyO c1455260nyOT2 = T2();
            if (c1455260nyOT2 != null) {
                c1455260nyOT2.LLLLJI();
            }
        }
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
            editorProModel.setActionsViaEPMoreOptions("");
        }
        H3().setImageAlbumData(this.LLJJLIIIJLLLLLLLZ);
        H3().setCanvasVideoData(this.LLJL);
    }

    public final void Z4() {
        C0EMK c0emk;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        this.LLJL = H3().getCanvasVideoData();
        boolean zLIZ = c0e48W1.Bo().LIZ();
        C351360Dq2.LJ(C350870DpF.LJI(c0e48W1));
        C376570Epb c376570Epb = new C376570Epb(c0e48W1);
        c376570Epb.LIZIZ = new C366310EXt(zLIZ, this.LLJJJ, m3().jU1(C350870DpF.LJI(c0e48W1)));
        boolean z = C0E50.LIZ;
        InterfaceC372610EjD interfaceC372610EjDV3 = v3();
        C376420EpM c376420EpM = interfaceC372610EjDV3 instanceof C376420EpM ? (C376420EpM) interfaceC372610EjDV3 : null;
        if (c376420EpM != null && (c0emk = c376420EpM.LLJ) != null) {
            c0emk.LIZJ(c376570Epb);
            c0emk.LIZIZ(c376570Epb, true);
        }
        C0E50.LIZ = z;
        Pair<Integer, Integer> pairLJJII = u4.LJJII(C350870DpF.LJI(c0e48W1), false);
        int iIntValue = pairLJJII.getFirst().intValue();
        int iIntValue2 = pairLJJII.getSecond().intValue();
        H3().setVideoCount(iIntValue);
        H3().setPhotoCount(iIntValue2);
        this.LLJJLIIIJLLLLLLLZ = H3().getImageAlbumData();
        boolean z2 = iIntValue2 == 1 && iIntValue == 0;
        if (!z || z2) {
            return;
        }
        H3().setImageAlbumData(null);
    }

    public final InterfaceC379580EuS c3() {
        C1462070o9N c1462070o9NLLLLLJIL;
        C1DRG c1drgLJIIIZ;
        C1455260nyO c1455260nyOT2 = T2();
        if (c1455260nyOT2 == null || (c1462070o9NLLLLLJIL = c1455260nyOT2.LLLLLJIL()) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLLLLLJIL)) == null) {
            return null;
        }
        return (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class);
    }

    public final VideoPublishEditModel getEditModel() {
        C0EHJ c0ehj;
        C0EHI value = q3().zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    public InterfaceC376440EpO Z1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final void H4(Function0<Unit> function0) {
        if (!T4()) {
            function0.invoke();
            return;
        }
        Activity activity = this.LLILZIL;
        if (activity == null) {
            function0.invoke();
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJFF(2131821412);
        c1397580mTM.LIZ(2131821410);
        C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(function0, (Function0<Unit>) 693));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final Object P4(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (this.LLILZIL == null) {
            return Unit.LIZ;
        }
        AudioRecordActivityViewModel audioRecordActivityViewModelLIZIZ = C350150Do5.LIZIZ(this.LLILLL.mView);
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return Unit.LIZ;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return Unit.LIZ;
        }
        Object objZQ2 = audioRecordActivityViewModelLIZIZ.zQ2(editModel, c0e48W1, new AwS549S0100000_5(this, 777), interfaceC1364105Vn);
        if (objZQ2 == C099R.LJFF()) {
            return objZQ2;
        }
        return Unit.LIZ;
    }

    public final void X1(C336690DHv c336690DHv) {
        boolean z;
        C1462070o9N c1462070o9NLLLLLJIL;
        C19EG c19eg;
        Dialog dialog;
        if (this.LLILZIL == null) {
            return;
        }
        boolean z2 = false;
        if (C573570MeZ.LIZ() && C1428470nHB.LIZIZ(H3())) {
            z = true;
        } else {
            z = false;
        }
        C1455260nyO c1455260nyOT2 = T2();
        if (c1455260nyOT2 != null) {
            c1462070o9NLLLLLJIL = c1455260nyOT2.LLLLLJIL();
        } else {
            c1462070o9NLLLLLJIL = null;
        }
        boolean zLJIJJ = C1428520nHG.LJIJJ(H3(), c1462070o9NLLLLLJIL, JY0());
        H3().creativeModel.editSaveLocalModel.selectedImagesList = null;
        if (C1428470nHB.LJLIIL(H3()) && !z) {
            z2 = true;
        }
        H3().creativeModel.editSaveLocalModel.withSaveTypeOption = zLJIJJ;
        if (C0CHQ.LIZ().getPublishService().LJJLIIIJJIZ(H3(), true)) {
            if (zLJIJJ) {
                String str = TuxSheet._pnsPageId;
                DialogFragment dialogFragment = (DialogFragment) c336690DHv.getTag(R.id.fds);
                if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
                    dialog.hide();
                }
                C1418900n1k c1418900n1k = C1418900n1k.LIZ;
                Activity activity = this.LLILZIL;
                C1408780mlQ c1408780mlQ = new C1408780mlQ(!z2, z2);
                AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 770);
                AwS549S0100000_5 awS549S0100000_52 = new AwS549S0100000_5(this, 771);
                AwS619S0100000_5 awS619S0100000_5 = new AwS619S0100000_5(this, 26);
                AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(this, 692);
                c1418900n1k.getClass();
                TuxSheet tuxSheetLJFF = C1418900n1k.LJFF(activity, c1408780mlQ, awS549S0100000_5, awS549S0100000_52, awS619S0100000_5, awS584S0100000_5);
                Activity activity2 = this.LLILZIL;
                if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null) {
                    tuxSheetLJFF.show(c19eg.getSupportFragmentManager(), "guide posting before save");
                    return;
                }
                return;
            }
            F4();
        }
    }

    public final void e4(Function2<? super Boolean, ? super Boolean, Unit> function2) {
        boolean z;
        C0E48 c0e48W1;
        boolean zIsAdvancedEdit;
        boolean z2 = false;
        if (q3().Tl0().getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        if (i3() != null && z) {
            VideoPublishEditModel editModel = getEditModel();
            if (editModel == null || (c0e48W1 = W1()) == null) {
                return;
            }
            if (editModel.creativeModel.draftInfoModel.isDraft) {
                zIsAdvancedEdit = editModel.getEditorProModel().getHasDraftAgain();
            } else {
                zIsAdvancedEdit = editModel.getEditorProModel().isAdvancedEdit();
            }
            C013C c013c = new C013C();
            if (c0e48W1.Bo().LIZ() || zIsAdvancedEdit) {
                z2 = true;
            }
            c013c.element = z2;
            if (!editModel.creativeModel.draftInfoModel.isDraft) {
                C363500EMy.LIZ.getClass();
                if (C363500EMy.LJIIL(editModel)) {
                    c013c.element = true;
                }
            }
            C363500EMy.LIZ.getClass();
            if (C363500EMy.LJIILIIL(editModel) && (!C354090DuR.LJI.isEmpty())) {
                c013c.element = true;
            }
            if (editModel.isFromCrash()) {
                InterfaceC372610EjD interfaceC372610EjDV3 = v3();
                if (interfaceC372610EjDV3 != null) {
                    interfaceC372610EjDV3.FP2(AFwS191S0000000_5.get$arr$(223), new AwS283S0300000_5(this, (C376630Eph) function2, (Function2<? super Boolean, ? super Boolean, Unit>) c013c, (C013C) 1));
                    return;
                }
                return;
            }
            DraftInfoModel draftInfoModel = editModel.creativeModel.draftInfoModel;
            if (draftInfoModel.isDraft) {
                draftInfoModel.saveDraftScene = "editor_pro_add_more";
                InterfaceC372610EjD interfaceC372610EjDV32 = v3();
                if (interfaceC372610EjDV32 != null) {
                    interfaceC372610EjDV32.FP2(AFwS191S0000000_5.get$arr$(224), new AwS441S0200000_5(this, editModel, 9));
                    return;
                }
                return;
            }
            O4(function2, c013c.element);
            return;
        }
        Boolean bool = Boolean.FALSE;
        function2.invoke(bool, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a2  */
    @Override // X.InterfaceC376440EpO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fQ0(boolean r13) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376630Eph.fQ0(boolean):void");
    }

    public final void o4(Function0<Unit> function0) {
        EnumC376530EpX enumC376530EpXCK2;
        boolean z;
        VideoPublishEditModel editModel;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || ((Boolean) c0e48W1.S7().LIZJ("is_showing_album_page", Boolean.FALSE)).booleanValue()) {
            return;
        }
        InterfaceC372610EjD interfaceC372610EjDV3 = v3();
        if (interfaceC372610EjDV3 != null) {
            enumC376530EpXCK2 = interfaceC372610EjDV3.cK2();
        } else {
            enumC376530EpXCK2 = null;
        }
        if (enumC376530EpXCK2 == EnumC376530EpX.MIN_LIMIT_TOAST) {
            C372670EjJ.LIZIZ(C1664590tQ1.LJII(this).getString(2131850311));
            return;
        }
        if (C350870DpF.LJII(c0e48W1) > E3()) {
            z = true;
        } else {
            z = false;
        }
        if (enumC376530EpXCK2 == EnumC376530EpX.MAX_LIMIT_TOAST) {
            VideoPublishEditModel editModel2 = getEditModel();
            if (editModel2 != null) {
                C361680EFy.LJJLIL(editModel2, c0e48W1);
            }
            Activity activity = this.LLILZIL;
            if (activity != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LIZIZ(this.LLILLL.getString(2131833419, Long.valueOf((E3() / ((long) 60)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                c1397580mTM.LIZJ(AFwS234S0000000_5.get$arr$(335));
                C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, (C376630Eph) function0, (Function0<Unit>) 150));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C363750ENx.LIZ.LIZIZ("ExceedTimeLimitDialogShown", true);
            return;
        }
        if (z && (editModel = getEditModel()) != null) {
            C361680EFy.LJJLIL(editModel, c0e48W1);
        }
        if (c0e48W1.LLLLLLIL() != null) {
            Q3().w6(null, false, false);
        }
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        Z4();
        function0.invoke();
    }

    public final void K4(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        EditorProModel editorProModel;
        CreativeModel creativeModel2;
        PostPageModel postPageModel;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        if (c0e48W1.getPlayer().isPlaying()) {
            c0e48W1.getPlayer().pause(false);
        }
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (creativeModel2 = editModel.creativeModel) != null && (postPageModel = creativeModel2.postPageModel) != null) {
            postPageModel.isEnterFromEPDirectly = true;
        }
        VideoPublishEditModel editModel2 = getEditModel();
        if (editModel2 != null && (editorProModel = editModel2.getEditorProModel()) != null) {
            editorProModel.setBackFromPublishTimestamp(0L);
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel editModel3 = getEditModel();
        AVMusic aVMusicM174clone = null;
        if (editModel3 != null && (creativeModel = editModel3.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            aVMusicM174clone = aVMusicExtractAVMusic.m174clone();
        }
        c363500EMy.getClass();
        C363500EMy.LJFF = aVMusicM174clone;
        Z4();
        InterfaceC1453420nvQ interfaceC1453420nvQG2 = G2();
        if (interfaceC1453420nvQG2 != null) {
            interfaceC1453420nvQG2.Za0("shoot_page_edit_tab", false, "editor_pro_add_more", new AwS549S0100000_5(this, function2, 776), new AwS406S0200000_5(this, (C376630Eph) function2, (Function2<? super Boolean, ? super Boolean, Unit>) 72));
        }
    }

    public final void O4(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        EnumC376530EpX enumC376530EpXCK2;
        boolean z2;
        VideoPublishEditModel editModel;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        InterfaceC372610EjD interfaceC372610EjDV3 = v3();
        if (interfaceC372610EjDV3 != null) {
            enumC376530EpXCK2 = interfaceC372610EjDV3.cK2();
        } else {
            enumC376530EpXCK2 = null;
        }
        if (enumC376530EpXCK2 == EnumC376530EpX.MIN_LIMIT_TOAST) {
            Activity activity = this.LLILZIL;
            if (activity != null) {
                C372670EjJ.LIZIZ(activity.getString(2131850311));
            }
            InterfaceC559500Lwy interfaceC559500LwyO2 = o2();
            if (interfaceC559500LwyO2 != null) {
                interfaceC559500LwyO2.Bw0();
            }
            Boolean bool = Boolean.FALSE;
            function2.invoke(bool, bool);
            return;
        }
        if (C350870DpF.LJII(c0e48W1) > E3()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enumC376530EpXCK2 == EnumC376530EpX.MAX_LIMIT_TOAST) {
            VideoPublishEditModel editModel2 = getEditModel();
            if (editModel2 != null) {
                C361680EFy.LJJLIL(editModel2, c0e48W1);
            }
            Activity activity2 = this.LLILZIL;
            if (activity2 != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                c1397580mTM.LIZIZ(this.LLILLL.getString(2131833419, Long.valueOf((E3() / ((long) 60)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                c1397580mTM.LIZJ(AFwS234S0000000_5.get$arr$(336));
                C985403tE.LIZ(c1397580mTM, new AwS59S0210000_5(this, (C376630Eph) function2, (Function2<? super Boolean, ? super Boolean, Unit>) z, true));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C363750ENx.LIZ.LIZIZ("ExceedTimeLimitDialogShown", true);
            return;
        }
        if (z2 && (editModel = getEditModel()) != null) {
            C361680EFy.LJJLIL(editModel, c0e48W1);
        }
        if (c0e48W1.LLLLLLIL() != null) {
            Q3().w6(null, false, false);
        }
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        z4(function2, z);
    }

    public final void z4(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        InterfaceC350420DoW interfaceC350420DoWBs;
        InterfaceC559500Lwy interfaceC559500LwyO2;
        C09AE c09ae = this.LLJJL;
        if (c09ae != null && c09ae.isActive()) {
            return;
        }
        if (C301780BsG.LIZ() && (interfaceC559500LwyO2 = o2()) != null) {
            interfaceC559500LwyO2.Rm2();
        }
        m3().xJ2().LLJJIII = false;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (interfaceC350420DoWBs = c0e48W1.bs()) != null) {
            C350440DoY.LIZIZ(interfaceC350420DoWBs);
        }
        this.LLJJL = C23250099c.LIZLLL(this.LLJJJJ, null, null, new C356540DyO(this, function2, z, null), 3);
    }

    public C376630Eph(C19A3 c19a3, C1DRG c1drg, Activity activity) {
        super(c1drg);
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = activity;
        this.LLILZLL = this;
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), C0EC7.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EHC.class, null);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 772));
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), MutableLiveData.class, "reset_record_segments_action");
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), MutableLiveData.class, "close_album_action");
        this.LLJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(225));
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C1455260nyO.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJJ = C2296808zG.LIZIZ();
        this.LLJJJJJIL = new InterfaceC376660Epk() { // from class: X.0Epi
            @Override // X.InterfaceC376660Epk
            public final void LIZ() {
                EditorProModel editorProModel;
                C361680EFy.LJJLIIIJJIZ(this.LIZ.getEditModel(), "click_post_to_save_without_watermark");
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
                    editorProModel.setActionsViaEPMoreOptions("post_to_save_via_more");
                }
                InterfaceC372610EjD interfaceC372610EjDV3 = this.LIZ.v3();
                if (interfaceC372610EjDV3 != null) {
                    interfaceC372610EjDV3.jl0(new AwS549S0100000_5(this.LIZ, 773), new AwS619S0100000_5(this.LIZ, 27));
                }
            }

            @Override // X.InterfaceC376660Epk
            public final void LIZIZ() {
                EditorProModel editorProModel;
                C361680EFy.LJJLIIIJJIZ(this.LIZ.getEditModel(), "click_post_to_story");
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
                    editorProModel.setActionsViaEPMoreOptions("post_via_more");
                }
                InterfaceC372610EjD interfaceC372610EjDV3 = this.LIZ.v3();
                if (interfaceC372610EjDV3 != null) {
                    interfaceC372610EjDV3.jl0(new AwS549S0100000_5(this.LIZ, 774), new AwS619S0100000_5(this.LIZ, 28));
                }
            }

            @Override // X.InterfaceC376660Epk
            public final void close() {
                TuxSheet tuxSheet = this.LIZ.LLJJJJLIIL;
                if (tuxSheet != null) {
                    tuxSheet.dismiss();
                }
            }

            @Override // X.InterfaceC376660Epk
            public final void em() {
                C376420EpM c376420EpM;
                EditorProModel editorProModel;
                C361680EFy.LJJLIIIJJIZ(this.LIZ.getEditModel(), "click_save_draft");
                if (this.LIZ.getEditModel() != null) {
                    C376630Eph c376630Eph = this.LIZ;
                    c376630Eph.H3().getEditorProModel().setActionsViaEPMoreOptions("save_draft_via_more");
                    VideoPublishEditModel editModel = c376630Eph.getEditModel();
                    if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
                        editorProModel.setActionsViaEPMoreOptions("save_draft_via_more");
                    }
                    InterfaceC372610EjD interfaceC372610EjDV3 = c376630Eph.v3();
                    Boolean boolValueOf = null;
                    if ((interfaceC372610EjDV3 instanceof C376420EpM) && (c376420EpM = (C376420EpM) interfaceC372610EjDV3) != null) {
                        boolValueOf = Boolean.valueOf(c376420EpM.m3(AFwS191S0000000_5.get$arr$(228), new AwS619S0100000_5(c376630Eph, 31), new AwS549S0100000_5(c376630Eph, 775)));
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        return;
                    }
                    TuxSheet tuxSheet = c376630Eph.LLJJJJLIIL;
                    if (tuxSheet != null) {
                        tuxSheet.dismiss();
                    }
                    c376630Eph.e4(new AwS619S0100000_5(c376630Eph, 30));
                }
            }

            @Override // X.InterfaceC376660Epk
            public final void LIZJ(C336690DHv c336690DHv) {
                C376420EpM c376420EpM;
                EditorProModel editorProModel;
                C361680EFy.LJJLIIIJJIZ(this.LIZ.getEditModel(), "click_save_with_watermark");
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
                    editorProModel.setActionsViaEPMoreOptions("save_local_via_more");
                }
                InterfaceC372610EjD interfaceC372610EjDV3 = this.LIZ.v3();
                Boolean boolValueOf = null;
                if ((interfaceC372610EjDV3 instanceof C376420EpM) && (c376420EpM = (C376420EpM) interfaceC372610EjDV3) != null) {
                    boolValueOf = Boolean.valueOf(c376420EpM.m3(AFwS191S0000000_5.get$arr$(226), new AwS619S0100000_5(this.LIZ, 29), AFwS191S0000000_5.get$arr$(227)));
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    return;
                }
                C376630Eph c376630Eph = this.LIZ;
                c376630Eph.o4(new AwS406S0200000_5(c376630Eph, c336690DHv, 71));
            }
        };
    }
}
