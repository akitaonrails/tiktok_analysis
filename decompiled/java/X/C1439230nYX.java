package X;

import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import dmt.av.video.CompileProbeViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l5a.a;

/* JADX INFO: renamed from: X.0nYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439230nYX extends AbstractC2255721DQs<InterfaceC2180241AUk> implements InterfaceC2180241AUk, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C1DRG LL;
    public boolean LLJJIJIIJIL;
    public final C560530Lyd<Unit> LLJJJ;
    public final LiveEvent<Unit> LLJJJIL;
    public final C560530Lyd<Boolean> LLJJJJ;
    public final LiveEvent<Boolean> LLJJJJJIL;
    public final C560530Lyd<C443120HZe<Integer, Integer, Integer>> LLJJJJLIIL;
    public final LiveEvent<C443120HZe<Integer, Integer, Integer>> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public final LiveEvent<Unit> LLJL;
    public final C560530Lyd<Unit> LLJLIL;
    public final LiveEvent<Unit> LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1449590npF.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455010nxz.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), AVMusic.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), String.class, "old_music_path");
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), String.class, "old_music_original");
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), Integer.class, "draft_to_Edit_from");
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), C1439740nZM.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), C1439300nYe.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 661));
    public final LiveEvent<C2180251AUl> LLJJIJIL = new C560530Lyd();

    private final boolean D5() {
        return E5(true);
    }

    @Override // X.InterfaceC2180241AUk
    public boolean Kq1() {
        return false;
    }

    public InterfaceC2180241AUk i3() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1439230nYX.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1439230nYX.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1439230nYX.class, "dmEditPrePublishApi", "getDmEditPrePublishApi()Lcom/ss/android/ugc/aweme/social/preload/DMEditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1439230nYX.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1439230nYX.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/BaseEditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1439230nYX.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1439230nYX.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1439230nYX.class, "oldMusicModel", "getOldMusicModel()Lcom/ss/android/ugc/aweme/creative/model/music/AVMusic;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1439230nYX.class, "oldMusicPath", "getOldMusicPath()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1439230nYX.class, "oldMusicOriginal", "getOldMusicOriginal()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1439230nYX.class, "draftToEditFrom", "getDraftToEditFrom()I", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1439230nYX.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1439230nYX.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1439230nYX.class, "videoFrom", "getVideoFrom()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoFrom;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1439230nYX.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1439230nYX.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16};
        LLJLLIL = 8;
    }

    private final InterfaceC1455850nzL B3() {
        return (InterfaceC1455850nzL) this.LLILLJJLI.getValue(this, LLJLL[0]);
    }

    private final InterfaceC1451520nsM E3() {
        return (InterfaceC1451520nsM) this.LLILLL.getValue(this, LLJLL[1]);
    }

    private final AVMusic F4() {
        return (AVMusic) this.LLJ.getValue(this, LLJLL[7]);
    }

    private final String H4() {
        return (String) this.LLJIJIL.getValue(this, LLJLL[9]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJLL[3]);
    }

    private final String K4() {
        return (String) this.LLJI.getValue(this, LLJLL[8]);
    }

    private final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLJJIII.getValue(this, LLJLL[15]);
    }

    private final InterfaceC1455010nxz O3() {
        return (InterfaceC1455010nxz) this.LLILZLL.getValue(this, LLJLL[4]);
    }

    private final C1439740nZM P4() {
        return (C1439740nZM) this.LLJILJILJ.getValue(this, LLJLL[11]);
    }

    private final InterfaceC1449590npF q3() {
        return (InterfaceC1449590npF) this.LLILZ.getValue(this, LLJLL[2]);
    }

    private final int v3() {
        return ((Number) this.LLJILJIL.getValue(this, LLJLL[10])).intValue();
    }

    @Override // X.InterfaceC2180241AUk
    public void Ad1() {
        C1446250njr c1446250njr = C1446250njr.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = z4();
        String strTB2 = O3().tB2();
        c1446250njr.getClass();
        C1446250njr.LIZIZ(videoPublishEditModelZ4, strTB2);
        c3();
    }

    @Override // X.InterfaceC2180241AUk
    public void Gj2() {
        C1402610mbT.LJIJJLI(z4(), "cancel");
    }

    public final AbstractC1453750nvx H3() {
        return (AbstractC1453750nvx) this.LLJJI.getValue(this, LLJLL[14]);
    }

    @Override // X.InterfaceC2180241AUk
    public void Nh2() {
        C1402610mbT.LJIJJLI(z4(), "back_to_camera");
        if (n5() && z4().mIsFromDraft) {
            R5();
            return;
        }
        if (z4().getRecordMode() == 1) {
            Z4();
            return;
        }
        if (!C0CHQ.LIZ().LJJJJJ().shouldDisable10MinDraftRecord(z4())) {
            c3();
            return;
        }
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131824731);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZ(activity, 2043, creativeToastBuilder);
    }

    public final AbstractC214814194y O4() {
        return (AbstractC214814194y) this.LLJILLL.getValue(this, LLJLL[12]);
    }

    public final C1439300nYe T4() {
        return (C1439300nYe) this.LLJJ.getValue(this, LLJLL[13]);
    }

    @Override // X.InterfaceC2180241AUk
    public void TM2() {
        C1402610mbT.LJIJJLI(z4(), "save");
        z4().creativeModel.draftInfoModel.saveDraftScene = "clickSheetFromEdit";
        C5();
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c3() {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439230nYX.c3():void");
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZ.getValue(this, LLJLL[5]);
    }

    public final CompileProbeViewModel m3() {
        return (CompileProbeViewModel) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC2180241AUk
    public void qP() {
        C1446250njr c1446250njr = C1446250njr.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = z4();
        String strTB2 = O3().tB2();
        c1446250njr.getClass();
        C1446250njr.LIZIZ(videoPublishEditModelZ4, strTB2);
        C1402610mbT.LJIJJLI(z4(), "discard");
        if (z4().isFromRestoreRecover()) {
            Z4();
        } else {
            X1(false);
        }
    }

    public final VideoPublishEditModel z4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJLL[6]);
    }

    private final void C5() {
        C1402520mbK.LIZLLL(z4(), "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
        if (H3().LLLLLLZ()) {
            H3().LLLLLLJ(new Runnable() { // from class: X.0nYb
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("EditNavigationComponent@8d19.saveAndQuit$1");
                    C1C7U.LIZIZ("EditNavigationComponent@8d19.saveAndQuit$1");
                }
            }, new ARunnableS122S0100000_22(this, 69), T4().LIZ, T4().LIZIZ, true);
        }
    }

    private final void G2() {
        O4().setResult(0);
        O4().finish();
    }

    private final InterfaceC1452170ntP Q3() {
        return JY0().g().getValue();
    }

    private final void R5() {
        if (!TextUtils.isEmpty(z4().getNewDraftId())) {
            C1402610mbT.LJIJ(z4());
        }
        C1452640nuA.LJII(F4(), z4().creativeModel.musicBuzModel.isPhotoMvModeMusic, z4().creativeModel.musicBuzModel);
        C1443030nef.LJII().LJII = "";
        T2(this, null, 1, null);
        Intent intentW2 = w2(z4());
        if (intentW2 == null) {
            return;
        }
        M5(intentW2);
    }

    private final void Z4() {
        if (!TextUtils.isEmpty(z4().getNewDraftId())) {
            C1402610mbT.LJIJ(z4());
        }
        C1452640nuA.LJII(F4(), z4().creativeModel.musicBuzModel.isPhotoMvModeMusic, z4().creativeModel.musicBuzModel);
        C1443030nef.LJII().LJII = "";
        T2(this, null, 1, null);
        Z1(null);
    }

    private final C348100Dkm e4() {
        InterfaceC1452170ntP interfaceC1452170ntPQ3 = Q3();
        if (interfaceC1452170ntPQ3 instanceof C1463670oBx) {
            return ((C1463670oBx) interfaceC1452170ntPQ3).LIZLLL();
        }
        return null;
    }

    private final boolean k5() {
        return z4().isPhotoMvMode() && z4().getOriginal() == 1;
    }

    private final boolean n5() {
        if (z4().getShootMode() != 15 && z4().getShootMode() != 2) {
            VideoPublishEditModel videoPublishEditModelZ4 = z4();
            if (videoPublishEditModelZ4.getShootMode() != 10 || !C1444940nhk.LJII(videoPublishEditModelZ4.getCanvasVideoData()) || videoPublishEditModelZ4.isUploadVideo()) {
                return false;
            }
        }
        return true;
    }

    private final void nD1() {
        JY0().Cq0().observe(this, new AObserverS225S0100000_22(this, 101));
        JY0().Up().observe(this, new AObserverS225S0100000_22(this, 102));
        JY0().s20().observe(this, new AObserverS225S0100000_22(this, 103));
        JY0().op().observe(this, new AObserverS225S0100000_22(this, 104));
        JY0().Tf2().observe(this, new AObserverS225S0100000_22(this, 105));
        JY0().NC1().observe(this, new AObserverS225S0100000_22(this, 106));
    }

    private final C443120HZe<Integer, Integer, Integer> o4() {
        boolean z = z4().mIsFromDraft;
        Integer numValueOf = Integer.valueOf(R.string.jz7);
        Integer numValueOf2 = Integer.valueOf(R.string.f1_);
        return (z && (z4().getFromMultiCut() || z4().getFromCut())) ? new C443120HZe<>(Integer.valueOf(R.string.rrb), numValueOf2, numValueOf) : (z4().getFromMultiCut() || z4().getFromCut() || z4().isPhotoMvMode() || z4().getCanvasVideoData() != null) ? new C443120HZe<>(2131858176, numValueOf2, numValueOf) : new C443120HZe<>(2131858175, numValueOf2, numValueOf);
    }

    private final InterfaceC1455010nxz x5() {
        return LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent ? (InterfaceC1455010nxz) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1455010nxz.class) : O3();
    }

    @Override // X.InterfaceC2180241AUk
    public void Aj0() {
        VideoPublishEditModel videoPublishEditModelZ4 = z4();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("to_status", "cancel");
        c0lab.LJ("prop_id", videoPublishEditModelZ4.getStickerID());
        c0lab.LJ("shoot_way", videoPublishEditModelZ4.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModelZ4.getCreationId());
        C20684815ws.LJIILLIIL("back_to_shoot_confirm", c0lab.LIZ);
    }

    @Override // X.InterfaceC2180241AUk
    public void K30() {
        if (!TextUtils.isEmpty(z4().getNewDraftId())) {
            C1402610mbT.LJIJ(z4());
        }
        H2(C1B4F.LJIILLIIL);
        Z1(null);
    }

    @Override // X.InterfaceC2180241AUk
    public boolean KV0() {
        String duetFrom;
        String albumPreviewNextMethod;
        InterfaceC1449590npF interfaceC1449590npFQ3;
        InterfaceC1451520nsM interfaceC1451520nsME3;
        if (E3() != null && (interfaceC1451520nsME3 = E3()) != null) {
            interfaceC1451520nsME3.m7("quit edit page!");
        }
        if (C294750Bgv.LIZIZ && q3() != null && (interfaceC1449590npFQ3 = q3()) != null) {
            interfaceC1449590npFQ3.m7("quit edit page!");
        }
        if (TextUtils.equals(z4().getEnterFrom(), "effect_qr_scan")) {
            G2();
            return true;
        }
        boolean zLIZ = C0CHQ.LIZ().getAccountService().LIZ();
        if (nu()) {
            jn0(false);
            return false;
        }
        VideoPublishEditModel videoPublishEditModelZ4 = z4();
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C0CHQ.LIZ().getAccountService().isLogin() && (albumPreviewNextMethod = videoPublishEditModelZ4.getAlbumPreviewNextMethod()) != null && albumPreviewNextMethod.length() != 0) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModelZ4.getCreationId());
            c0lab.LIZ(videoPublishEditModelZ4.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
            c0lab.LJ("content_source", "upload");
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelZ4));
            c0lab.LJ("shoot_way", videoPublishEditModelZ4.mShootWay);
            c0lab.LIZ(videoPublishEditModelZ4.getPreviewInfo().getVideoList().size() > 1 ? 1 : 0, "is_multi_content");
            String albumPreviewNextMethod2 = videoPublishEditModelZ4.getAlbumPreviewNextMethod();
            c0lab.LIZ((albumPreviewNextMethod2 == null || !a0.LJJIIZI(albumPreviewNextMethod2, "preview", false)) ? 0 : 1, "is_detail");
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("enter_method", videoPublishEditModelZ4.getAlbumPreviewNextMethod());
            C20684815ws.LJIILLIIL("re_enter_album", c0lab.LIZ);
        }
        C1428640nHS c1428640nHS = C1428640nHS.LIZ;
        VideoPublishEditModel videoPublishEditModelZ42 = z4();
        c1428640nHS.getClass();
        if (C1428640nHS.LIZJ(videoPublishEditModelZ42) && z4().getOriginal() == 1 && ((z4().mIsFromDraft || z4().getDraftFromShoot()) && (C1428520nHG.LJJJZ(z4()) || C1428520nHG.LJJLIIIJ(z4())))) {
            if (!zLIZ) {
                H5(z4().getDraftFromShoot());
                return true;
            }
            if (z4().mIsFromDraft) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
                    X1(false);
                    return true;
                }
                this.LLJJJ.LJIIJ(Unit.LIZ);
                return true;
            }
        }
        if (z4().isDuet()) {
            if (z4().mIsFromDraft && !z4().duetFilesExist()) {
                Z1(null);
                return true;
            }
            if ((z4().mIsFromDraft || z4().getDraftFromShoot()) && !zLIZ) {
                H5(z4().getDraftFromShoot());
            } else if (D5()) {
                c3();
                return false;
            }
            return false;
        }
        if (z4().isFromCrash()) {
            if (C1428470nHB.LLIIIJ(z4()) || C1428520nHG.LJJLIIIJ(z4()) || C1444940nhk.LJI(z4().getCanvasVideoData())) {
                H5(z4().getDraftFromShoot());
                return false;
            }
            if (C1428470nHB.LJJJJZI(z4())) {
                H5(z4().getDraftFromShoot());
                return false;
            }
            if (D5()) {
                c3();
            }
            return false;
        }
        C1446160nji.LIZLLL(z4());
        C1402610mbT.LJJIJ(z4(), JY0(), JY0().g().getValue(), "exit_edit");
        if (z4().getRecordMode() != 1 && (duetFrom = z4().getDuetFrom()) != null && duetFrom.length() != 0) {
            T2(this, null, 1, null);
            if (TextUtils.isEmpty(z4().getNewDraftId())) {
                if (D5()) {
                    c3();
                }
                return false;
            }
            C1402610mbT.LJIJ(z4());
            Z1(null);
            return true;
        }
        if (z4().getRecordMode() == 1) {
            if (!z4().getDraftFromShoot() && !z4().mIsFromDraft) {
                this.LLJLIL.LJIIJ(Unit.LIZ);
                return false;
            }
            if (zLIZ) {
                this.LLJJJJLIIL.LJIIJ(new C443120HZe<>(Integer.valueOf(R.string.rrb), Integer.valueOf(R.string.f1_), Integer.valueOf(R.string.jz7)));
                return false;
            }
            H5(z4().getDraftFromShoot());
            return false;
        }
        if (z4().isCutSameVideoType()) {
            if (!z4().mIsFromDraft && !z4().getDraftFromShoot()) {
                if (E5(false)) {
                    c3();
                }
                return false;
            }
            if (zLIZ) {
                this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
                return false;
            }
            H5(z4().getDraftFromShoot());
            return false;
        }
        if (z4().getOrigin() != 1 && (z4().mIsFromDraft || z4().getDraftFromShoot())) {
            if (zLIZ) {
                this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
                return false;
            }
            H5(z4().getDraftFromShoot());
            return false;
        }
        if (z4().isMvThemeVideoType() && !k5() && (z4().mIsFromDraft || z4().getDraftFromShoot())) {
            if (zLIZ) {
                this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
                return false;
            }
            H5(z4().getDraftFromShoot());
            return false;
        }
        if (z4().getOrigin() == 0 && z4().getCanvasVideoData() != null) {
            if (E5(false)) {
                c3();
            }
            return false;
        }
        if (z4().getFromCut() || z4().getOrigin() == 0 || z4().getFromMultiCut()) {
            this.LLJJJJLIIL.LJIIJ(o4());
            return false;
        }
        if ((z4().mIsFromDraft || z4().getDraftFromShoot()) && !zLIZ) {
            H5(z4().getDraftFromShoot());
            return true;
        }
        if (D5()) {
            c3();
        }
        return false;
    }

    public final void O() {
        if (!C1428470nHB.LLIIIJ(z4()) && C571300Mau.LIZ()) {
            W2(z4());
        }
        C1428520nHG.LJLI(z4());
        C1428470nHB.LIZJ(z4().creativeModel.draftInfoModel);
        C0CHQ.LIZ().getPublishService().LJJJLL();
        C1431870nMf.LJIIL(new C538590LAj(z4(), new C0M2T(false, "VEVideoPublishEditActivity", null, 5, false, 28), false), new InterfaceC540360LHe() { // from class: X.0nYZ
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                if (this.LIZ.O4().mViewDestroyed) {
                    return;
                }
                C1402520mbK c1402520mbK = C1402520mbK.LIZ;
                VideoPublishEditModel videoPublishEditModelZ4 = this.LIZ.z4();
                c1402520mbK.getClass();
                C1402520mbK.LJFF(0, videoPublishEditModelZ4, "video_edit_page", false, false);
                this.LIZ.X1(false);
                C201955140j.LIZJ(C1662160tM6.LIZIZ, "zyc draft save failed");
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
                if (this.LIZ.O4().mViewDestroyed) {
                    return;
                }
                C1402520mbK c1402520mbK = C1402520mbK.LIZ;
                VideoPublishEditModel videoPublishEditModelZ4 = this.LIZ.z4();
                c1402520mbK.getClass();
                C1402520mbK.LJFF(1, videoPublishEditModelZ4, "video_edit_page", false, false);
                String string = this.LIZ.getActivity().getString(2131846777);
                C19EG activity = this.LIZ.getActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                creativeToastBuilder.acrossActivities(true);
                C1390380mHk.LIZ(activity, 1013, creativeToastBuilder);
                this.LIZ.X1(true);
                C201955140j.LIZJ(C1662160tM6.LIZIZ, "zyc draft save success");
            }
        });
    }

    @Override // X.InterfaceC2180241AUk
    public void O90() {
        if (!TextUtils.isEmpty(z4().getNewDraftId())) {
            C1402610mbT.LJIJ(z4());
        }
        C5();
    }

    @Override // X.InterfaceC2180241AUk
    public void PI1() {
        VideoPublishEditModel videoPublishEditModelZ4 = z4();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("to_status", "confirm");
        c0lab.LJ("prop_id", videoPublishEditModelZ4.getStickerID());
        c0lab.LJ("shoot_way", videoPublishEditModelZ4.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModelZ4.getCreationId());
        C20684815ws.LJIILLIIL("back_to_shoot_confirm", c0lab.LIZ);
        NC2(C1B4F.LJIILL);
        yF0();
    }

    public final void W1() {
        String string;
        int i;
        NLEEditor nLEEditor;
        NLEEditor nLEEditor2;
        NLEEditor nLEEditor3;
        AVChallenge recordChallenge;
        List<String> list;
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL = H3().LLLLLJIL();
        if (interfaceC1444170ngVLLLLLJIL != null) {
            C1402650mbX c1402650mbX = C1402650mbX.LIZ;
            VideoPublishEditModel videoPublishEditModelZ4 = z4();
            Bundle bundle = O4().mArguments;
            C348100Dkm c348100DkmE4 = e4();
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            c1402650mbX.getClass();
            if (C1428470nHB.LJJZZI(videoPublishEditModelZ4)) {
                return;
            }
            CanvasVideoData canvasVideoData = videoPublishEditModelZ4.getCanvasVideoData();
            int i2 = 0;
            if ((canvasVideoData == null || (list = canvasVideoData.sourceInfo) == null || list.size() != 1 || C1428470nHB.LJJZZI(videoPublishEditModelZ4)) && !videoPublishEditModelZ4.getEditorProModel().getFromPhotoCanvas()) {
                return;
            }
            if (bundle == null || (string = bundle.getString("enter_edit_page_method")) == null) {
                string = "click_next_button";
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", videoPublishEditModelZ4.mShootWay);
            String enterFrom = videoPublishEditModelZ4.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "video_post_page";
            }
            c0lab.LJ("enter_from", enterFrom);
            c0lab.LJ("enter_method", string);
            c0lab.LJ("creation_id", videoPublishEditModelZ4.getCreationId());
            c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModelZ4));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelZ4));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelZ4));
            c0lab.LIZ(1, "pic_cnt");
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = videoPublishEditModelZ4.creativeModel.initialModel.duetAndStitchRouterConfig;
            if (duetAndStitchRouterConfig != null) {
                DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AwS601S0100000_22(c0lab, 688));
            }
            c0lab.LIZ(C1429380nIe.LIZ ? 1 : 0, EnumC1439240nYY.HAS_COMMERCE_PROP.getStr());
            c0lab.LIZ((Intrinsics.LJFF(videoPublishEditModelZ4.mShootWay, "challenge") && (recordChallenge = videoPublishEditModelZ4.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge.isCommerce) ? 1 : 0, EnumC1439240nYY.HAS_COMMERCE_CHALLENGE.getStr());
            c0lab.LIZ(Intrinsics.LJFF(videoPublishEditModelZ4.mShootWay, "mission") ? 1 : 0, EnumC1439240nYY.HAS_COMMERCIAL_MISSION.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.commerceData != null ? 1 : 0, EnumC1439240nYY.IS_COMMERCE_DATA_IN_TOOLS_LINE.getStr());
            c0lab.LIZ(Intrinsics.LJFF(videoPublishEditModelZ4.mShootWay, "tcm_upload") ? 1 : 0, EnumC1439240nYY.IS_SHOOT_FROM_TCM_ORDER.getStr());
            String str = EnumC1439240nYY.HAS_UNSUPPORTED_STICKER.getStr();
            C1431780nMW.LIZ.getClass();
            c0lab.LIZ((C1431780nMW.LIZIZ(videoPublishEditModelZ4, c348100DkmE4, interfaceC1444170ngVLLLLLJIL) || C1431780nMW.LIZLLL(videoPublishEditModelZ4, interfaceC1444170ngVLLLLLJIL)) ? 1 : 0, str);
            c0lab.LIZ(C1466090oFr.LJIIJJI(videoPublishEditModelZ4.creativeModel.stickerModel) ? 1 : 0, EnumC1439240nYY.HAS_UNSUPPORTED_INTERACTION_STICKER.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.getTtsVoiceModel() != null ? 1 : 0, EnumC1439240nYY.HAS_TTS_TEXT.getStr());
            String str2 = EnumC1439240nYY.HAS_MENTION_TEXT_STICKER.getStr();
            List<TextStickerModel> listLJJIJIL = C1416310mxZ.LJJIJIL(videoPublishEditModelZ4);
            if (listLJJIJIL.isEmpty()) {
                i = 0;
            } else {
                Iterator<TextStickerModel> it2 = listLJJIJIL.iterator();
                while (it2.hasNext()) {
                    if (C0F8Y.LJFF(it2.next())) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            c0lab.LIZ(i, str2);
            String str3 = EnumC1439240nYY.HAS_DYNAMIC_STICKER.getStr();
            C1431780nMW.LIZ.getClass();
            c0lab.LIZ(C1431780nMW.LIZIZ(videoPublishEditModelZ4, c348100DkmE4, interfaceC1444170ngVLLLLLJIL) ? 1 : 0, str3);
            c0lab.LIZ(C1431780nMW.LIZLLL(videoPublishEditModelZ4, interfaceC1444170ngVLLLLLJIL) ? 1 : 0, EnumC1439240nYY.HAS_DURATION_STICKER.getStr());
            c0lab.LIZ(C1431780nMW.LIZJ(videoPublishEditModelZ4) ? 1 : 0, EnumC1439240nYY.HAS_TEXT_MOTION.getStr());
            c0lab.LIZ((videoPublishEditModelZ4.hasSubtitle() || videoPublishEditModelZ4.creativeModel.inlineCaptionModel != null) ? 1 : 0, EnumC1439240nYY.HAS_CAPTIONS.getStr());
            NLEModel model = null;
            boolean zLJII = C1431780nMW.LJII((c348100DkmE4 == null || (nLEEditor3 = c348100DkmE4.LIZ) == null) ? null : nLEEditor3.getModel());
            boolean zLJIIIIZZ = C1431780nMW.LJIIIIZZ((c348100DkmE4 == null || (nLEEditor2 = c348100DkmE4.LIZ) == null) ? null : nLEEditor2.getModel());
            c0lab.LIZ(zLJII ? 1 : 0, EnumC1439240nYY.HAS_ADJUST_FILTER.getStr());
            c0lab.LIZ(zLJIIIIZZ ? 1 : 0, EnumC1439240nYY.IS_FILTER_SET_DURATION.getStr());
            c0lab.LIZ((zLJII || zLJIIIIZZ) ? 1 : 0, EnumC1439240nYY.HAS_UNSUPPORTED_FILTER.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.isDuet() ? 1 : 0, EnumC1439240nYY.IS_DUET.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.getStitchParams() != null ? 1 : 0, EnumC1439240nYY.IS_STITCH.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.isCurrentAutoCutMode() ? 1 : 0, EnumC1439240nYY.HAS_AUTOCUT.getStr());
            c0lab.LIZ(0, EnumC1439240nYY.IS_UNSUPPORT_TEXT_MODE.getStr());
            c0lab.LIZ(C562550M4n.LIZ(videoPublishEditModelZ4) ? 1 : 0, EnumC1439240nYY.IS_PUBLISH_AS_STORY.getStr());
            String str4 = EnumC1439240nYY.IS_PHOTO_MODE_REVERSE.getStr();
            C1403010mc7.LIZ.LJI().getClass();
            c0lab.LIZ(!C2276971EAl.LIZ() ? 1 : 0, str4);
            c0lab.LIZ(C0CHQ.LIZ().getAccountService().LIZ() ? 1 : 0, EnumC1439240nYY.IS_CHILD_MODE.getStr());
            c0lab.LIZ(!C1429880nJS.LIZ(videoPublishEditModelZ4) ? 1 : 0, EnumC1439240nYY.UNSUPPORT_INTERACTION_STICKER.getStr());
            c0lab.LIZ((!C1466090oFr.LJII(videoPublishEditModelZ4.creativeModel.stickerModel) || C573130Mdr.LIZ() || C1429880nJS.LIZ(videoPublishEditModelZ4)) ? 0 : 1, EnumC1439240nYY.UNSUPPORT_ADD_YOURS.getStr());
            c0lab.LIZ((!C1466090oFr.LJIIJ(videoPublishEditModelZ4.creativeModel.stickerModel) || C573120Mdq.LIZ() || C1429880nJS.LIZ(videoPublishEditModelZ4)) ? 0 : 1, EnumC1439240nYY.UNSUPPORT_MUSIC_STICKER.getStr());
            c0lab.LIZ((MusicBeanUtilKt.extractAVMusic(videoPublishEditModelZ4.creativeModel.musicBuzModel) != null ? 1 : 0) ^ 1, EnumC1439240nYY.HAS_NO_MUSIC.getStr());
            c0lab.LIZ(videoPublishEditModelZ4.hasRecord() ? 1 : 0, EnumC1439240nYY.HAS_RECORD_AUDIO.getStr());
            c0lab.LIZ(C1429680nJ8.LJ(videoPublishEditModelZ4.creativeModel.musicBuzModel) ? 1 : 0, EnumC1439240nYY.HAS_LOCAL_SOUND.getStr());
            c0lab.LIZ(0, EnumC1439240nYY.IS_MUSIC_TRIM.getStr());
            String str5 = EnumC1439240nYY.HAS_EDIT_EFFECTS.getStr();
            Object objG = interfaceC1446740nkeJY0 != null ? interfaceC1446740nkeJY0.g() : null;
            c0lab.LIZ((C1431780nMW.LJ(objG instanceof InterfaceC1452170ntP ? (InterfaceC1452170ntP) objG : null, videoPublishEditModelZ4) && videoPublishEditModelZ4.getTimeEffect() == null) ? 0 : 1, str5);
            String str6 = EnumC1439240nYY.HAS_CLIPS.getStr();
            EditorProModel editorProModel = videoPublishEditModelZ4.getEditorProModel();
            c0lab.LIZ((!editorProModel.getFromPhotoCanvas() || (!editorProModel.isPipUsed() && videoPublishEditModelZ4.getPhotoCount() <= 1 && videoPublishEditModelZ4.getVideoCount() <= 0)) ? 0 : 1, str6);
            c0lab.LIZ(videoPublishEditModelZ4.creativeModel.beautyModel.faceBeauty != 0 ? 1 : 0, EnumC1439240nYY.HAS_BEAUTY.getStr());
            String str7 = EnumC1439240nYY.IS_STORY_AVATAR.getStr();
            if (videoPublishEditModelZ4.creativeModel.changeAvatarModel.isFromChangeAvatar && u4.LJJJIL(videoPublishEditModelZ4)) {
                i2 = 1;
            }
            c0lab.LIZ(i2, str7);
            String str8 = EnumC1439240nYY.HAS_KEYFRAME.getStr();
            if (c348100DkmE4 != null && (nLEEditor = c348100DkmE4.LIZ) != null) {
                model = nLEEditor.getModel();
            }
            c0lab.LIZ(C1428470nHB.LLIIJLIL(model) ? 1 : 0, str8);
            c0lab.LIZ(!videoPublishEditModelZ4.creativeModel.magicCombineEffectModel.magicCombineEffectModelList.isEmpty() ? 1 : 0, EnumC1439240nYY.HAS_MAGIC.getStr());
            videoPublishEditModelZ4.creativeModel.imagePublishModel.reasonToPostAsVideo = c0lab.LIZ;
        }
    }

    @Override // X.InterfaceC2180241AUk
    public void cs2() {
        if (!TextUtils.isEmpty(z4().getNewDraftId())) {
            C1402610mbT.LJIJ(z4());
        }
        C1452640nuA.LJII(F4(), z4().creativeModel.musicBuzModel.isPhotoMvModeMusic, z4().creativeModel.musicBuzModel);
        C1443030nef.LJII().LJII = "";
        NC2(C1B4F.LJIILL);
        yF0();
    }

    public final void d5() {
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL;
        if (!H3().LLLLLLZ() || (interfaceC1444170ngVLLLLLJIL = H3().LLLLLJIL()) == null) {
            return;
        }
        interfaceC1444170ngVLLLLLJIL.LJJJJLL();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        B3().i80(this);
        nD1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        B3().i80(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        z4().creativeModel.editModel.hasJumpToPublish = false;
    }

    @Override // X.InterfaceC2180241AUk
    public void yF0() {
        boolean zInLowMemMode = VEMem.getInstance().inLowMemMode();
        H3().LLLLLLL(true);
        if ((C1439280nYc.LIZ() && Q3() != null) || zInLowMemMode) {
            v5(new AwS601S0100000_22(this, 445));
            return;
        }
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438980nY8 c1438980nY8 = new C1438980nY8(H3(), z4());
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438980nY8);
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<Unit> An0() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<C443120HZe<Integer, Integer, Integer>> BY() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<Unit> YM1() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<C2180251AUl> Yc0() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        i3();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<Boolean> lE2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC2180241AUk
    public boolean nu() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC2180241AUk
    public void vN1() {
        R5();
    }

    @Override // X.InterfaceC2180241AUk
    public LiveEvent<Unit> wp1() {
        return this.LLJL;
    }

    public C1439230nYX(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJJJ = c560530Lyd;
        this.LLJJJIL = c560530Lyd;
        C560530Lyd<Boolean> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJJJ = c560530Lyd2;
        this.LLJJJJJIL = c560530Lyd2;
        C560530Lyd<C443120HZe<Integer, Integer, Integer>> c560530Lyd3 = new C560530Lyd<>();
        this.LLJJJJLIIL = c560530Lyd3;
        this.LLJJL = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd4;
        this.LLJL = c560530Lyd4;
        C560530Lyd<Unit> c560530Lyd5 = new C560530Lyd<>();
        this.LLJLIL = c560530Lyd5;
        this.LLJLILLLLZIIL = c560530Lyd5;
    }

    private final boolean E5(boolean z) {
        boolean z2;
        InterfaceC1455010nxz interfaceC1455010nxzX5;
        if (z4().isEnterFromDM()) {
            return true;
        }
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent ? O3().C1() || z4().hasInfoStickers() : ((interfaceC1455010nxzX5 = x5()) != null && interfaceC1455010nxzX5.C1()) || z4().hasInfoStickers() || C1466090oFr.LJIIL(z4().creativeModel.stickerModel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C0IKQ.LIZIZ(z4().getEffectList()) && z4().getTimeEffect() == null && !C1428520nHG.LJJJJ(z4()) && !z4().isChangeMultiEditData() && !z2) {
            return true;
        }
        this.LLJJJJ.LJIIJ(Boolean.valueOf(z));
        return false;
    }

    private final void H2(C1B4F c1b4f) {
        NC2(c1b4f);
    }

    private final void H5(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        Pair pair;
        InterfaceC1455010nxz interfaceC1455010nxzX5;
        boolean z4 = false;
        if (z4().getRecordMode() != 1 && z4().getOrigin() == 1 && !z4().getFromCut() && !z4().getFromMultiCut()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zN5 = n5();
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent ? O3().C1() || z4().hasInfoStickers() : ((interfaceC1455010nxzX5 = x5()) != null && interfaceC1455010nxzX5.C1()) || z4().hasInfoStickers() || C1466090oFr.LJIIL(z4().creativeModel.stickerModel)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!C0IKQ.LIZIZ(z4().getEffectList()) && z4().getTimeEffect() == null && !C1428520nHG.LJJJJ(z4()) && !z4().isChangeMultiEditData() && ((z4().getFilterName() == null || Intrinsics.LJFF(z4().getFilterName(), "normal")) && !z3 && (z4().getMMusicPath() == null || Intrinsics.LJFF(z4().getMMusicPath(), "")))) {
            if (!z2) {
                X1(true);
                return;
            } else if (z4().getDraftFromShoot()) {
                c3();
                return;
            }
        }
        if (!zN5 || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
            z4 = z2;
        }
        if (C1428520nHG.LJJLIIIJ(z4())) {
            pair = new Pair(2131839857, -1);
        } else {
            if (zN5) {
                i = 2131832460;
            } else {
                i = 2131832457;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (zN5) {
                i2 = 2131832459;
            } else {
                i2 = 2131832456;
            }
            pair = new Pair(numValueOf, Integer.valueOf(i2));
        }
        ((C560530Lyd) Yc0()).LJIIJ(new C2180251AUl(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), z, z4));
    }

    private final void M5(Intent intent) {
        C1660680tJi.LIZ().LJIIJJI(getActivity(), intent);
        boolean zInLowMemMode = VEMem.getInstance().inLowMemMode();
        if ((!C1439280nYc.LIZ() || Q3() == null) && !zInLowMemMode) {
            C1438840nXu c1438840nXu = C1438840nXu.LIZ;
            C1438940nY4 c1438940nY4 = new C1438940nY4(H3(), intent, z4());
            c1438840nXu.getClass();
            C1438840nXu.LIZ(c1438940nY4);
            return;
        }
        v5(new AwS388S0200000_22(this, intent, 121));
    }

    private final RecordScene N5(VideoPublishEditModel videoPublishEditModel) {
        RecordScene recordScene = new RecordScene();
        recordScene.musicPath(videoPublishEditModel.getMMusicPath());
        recordScene.musicStart(videoPublishEditModel.getMMusicStart());
        recordScene.musicEnd(videoPublishEditModel.getMMusicEnd());
        recordScene.faceBeauty(videoPublishEditModel.getFaceBeauty());
        recordScene.videoSegment(videoPublishEditModel.getVideoSegmentsDesc());
        recordScene.hardEncode(videoPublishEditModel.getHardEncode());
        recordScene.mp4Path(videoPublishEditModel.videoPath());
        recordScene.maxDuration(videoPublishEditModel.getMaxDuration());
        C1443030nef.LJII().LJIIIIZZ = recordScene;
        return recordScene;
    }

    private final void Z1(Pair<Integer, ? extends Intent> pair) {
        if (pair != null) {
            O4().setResult(pair.getFirst().intValue(), pair.getSecond());
        }
        yF0();
    }

    private final Intent o2(VideoPublishEditModel videoPublishEditModel) {
        RecordScene recordSceneN5 = N5(videoPublishEditModel);
        if (videoPublishEditModel.creativeModel.nowsShootModel == null && !C1428520nHG.LJJLIIIJ(videoPublishEditModel)) {
            if (recordSceneN5.isSegmentsNotValid() && !k5()) {
                if (videoPublishEditModel.isPhotoMvMode()) {
                    this.LLJJJJLIIL.LJIIJ(new C443120HZe<>(2131858176, Integer.valueOf(R.string.f1_), Integer.valueOf(R.string.fte)));
                    return null;
                }
                this.LLJJJJLIIL.LJIIJ(new C443120HZe<>(2131858175, Integer.valueOf(R.string.f1_), Integer.valueOf(R.string.jz7)));
                return null;
            }
            return C1438570nXT.LIZIZ(videoPublishEditModel, v3(), P4());
        }
        return C1438570nXT.LIZIZ(videoPublishEditModel, v3(), P4());
    }

    private final boolean t5(VideoPublishEditModel videoPublishEditModel) {
        C1431780nMW c1431780nMW = C1431780nMW.LIZ;
        e4();
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL = H3().LLLLLJIL();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        c1431780nMW.getClass();
        return C1431780nMW.LJI(videoPublishEditModel, interfaceC1444170ngVLLLLLJIL, interfaceC1446740nkeJY0);
    }

    private final void v5(final Function1<? super Boolean, Unit> function1) {
        InterfaceC1452170ntP interfaceC1452170ntPQ3 = Q3();
        if (interfaceC1452170ntPQ3 != null) {
            interfaceC1452170ntPQ3.Af(new InterfaceC1464130oCh() { // from class: X.0nYa
                @Override // X.InterfaceC1464130oCh
                public final void LIZ() {
                    function1.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC1464130oCh
                public final void onReleaseEngineUnitResourceSuccess() {
                    function1.invoke(Boolean.TRUE);
                }
            });
        }
    }

    private final Intent w2(VideoPublishEditModel videoPublishEditModel) {
        return C1438570nXT.LIZIZ(videoPublishEditModel, v3(), P4());
    }

    @Override // X.InterfaceC2180241AUk
    public void NC2(C1B4F c1b4f) {
        if (!Intrinsics.LJFF("green_screen_kit", z4().mShootWay)) {
            C1403010mc7.LIZ.getBridgeService().LJIIIZ(getActivity(), z4(), c1b4f);
        }
    }

    public final void W2(VideoPublishEditModel videoPublishEditModel) {
        if (t5(videoPublishEditModel)) {
            C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "checkSingleImageConvert transferCanvasPhotoToImageMode");
            C1431780nMW c1431780nMW = C1431780nMW.LIZ;
            InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL = LLJIJIL();
            c1431780nMW.getClass();
            C1431780nMW.LJIIIZ(videoPublishEditModel, interfaceC1444130ngRLLJIJIL, false);
            return;
        }
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "checkSingleImageConvert revertImageModeIfNecessary");
        C1432260nNI.LIZ(videoPublishEditModel);
    }

    public final void X1(boolean z) {
        a.LIZIZ.LIZ(z4().getCreationId());
        boolean zInLowMemMode = VEMem.getInstance().inLowMemMode();
        H3().LLLLLLL(true);
        if ((!C1439280nYc.LIZ() || Q3() == null) && !zInLowMemMode) {
            Intent intent = new Intent();
            if (!C0CHQ.LIZ().getAccountService().LIZ() && v3() != 3) {
                C1660680tJi.LIZ().LIZ(getActivity(), intent, z, z4().creativeModel.draftInfoModel.isConvertToNormalDraft);
            }
            C1438840nXu c1438840nXu = C1438840nXu.LIZ;
            C1438980nY8 c1438980nY8 = new C1438980nY8(H3(), z4());
            c1438840nXu.getClass();
            C1438840nXu.LIZ(c1438980nY8);
            return;
        }
        v5(new AwS601S0100000_22(this, 444));
    }

    @Override // X.InterfaceC2180241AUk
    public void jn0(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // X.InterfaceC2180241AUk
    public void mY1(RetakeVideoContext retakeVideoContext) {
        Intent intentO2 = o2(z4());
        if (intentO2 == null) {
            return;
        }
        intentO2.putExtra("retake_video", retakeVideoContext);
        intentO2.putExtra("retake_shoot_mode", 1);
        M5(intentO2);
    }

    public static void T2(C1439230nYX c1439230nYX, C1B4F c1b4f, int i, Object obj) {
        if ((i & 1) != 0) {
            c1b4f = C1B4F.LJIILL;
        }
        c1439230nYX.H2(c1b4f);
    }
}
