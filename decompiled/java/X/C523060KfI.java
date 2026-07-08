package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523060KfI implements InterfaceC528410Knv {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC528410Knv
    public final /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC528410Knv
    public final /* synthetic */ void LJIIL() {
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJIILJJIL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        return true;
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LIZ() {
        List<TikTokMediaModel> listLIZJ;
        List<TikTokMediaModel> listLIZJ2;
        C533730KwV c533730KwV = C533730KwV.LIZ;
        int chooseScene$tools_camera_record_release = this.LIZ.getChooseScene$tools_camera_record_release();
        c533730KwV.getClass();
        if (!C533730KwV.LIZLLL(chooseScene$tools_camera_record_release, false) && this.LIZ.getChooseScene$tools_camera_record_release() != 15) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            if (mvChoosePhotoScene.lastVideoCount < mvChoosePhotoScene.maxVideoSelectCount) {
                return false;
            }
        } else if (this.LIZ.isCelebrationMode()) {
            InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
            if (((interfaceC522120Kdm == null || (listLIZJ2 = interfaceC522120Kdm.LIZJ()) == null) ? 0 : listLIZJ2.size()) < this.LIZ.maxVideoSelectCount) {
                return false;
            }
        } else {
            InterfaceC522120Kdm interfaceC522120Kdm2 = this.LIZ.videoImageMixedController;
            if (interfaceC522120Kdm2 == null || (listLIZJ = interfaceC522120Kdm2.LIZJ()) == null || !(!listLIZJ.isEmpty())) {
                return false;
            }
            if (listLIZJ.size() < this.LIZ.maxVideoSelectCount) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJ() {
        return this.LIZ.tryInitVideoImageMixed();
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJFF() {
        List<TikTokMediaModel> listLIZJ;
        InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : listLIZJ) {
            if (tikTokMediaModel.LJIILJJIL()) {
                arrayList.add(tikTokMediaModel);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel2 : listLIZJ) {
            if (tikTokMediaModel2.LJIIJ()) {
                arrayList2.add(tikTokMediaModel2);
            }
        }
        return arrayList2.size() >= mvChoosePhotoScene.maxPhotoSelectCount - size;
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJIIJJI() {
        List<TikTokMediaModel> listLIZJ;
        InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : listLIZJ) {
            if (tikTokMediaModel.LJIILJJIL()) {
                arrayList.add(tikTokMediaModel);
            }
        }
        return arrayList.size() >= mvChoosePhotoScene.maxVideoSelectCount;
    }

    public C523060KfI(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZIZ(C0L90 c0l90) {
        MvChoosePhotoScene.initChooseListener$onSelectFinishInternal(this.LIZ, c0l90);
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZLLL(MediaModel mediaModel) {
        if (C529980KqS.LIZ(this.LIZ.getChooseScene$tools_camera_record_release())) {
            MvChoosePhotoScene.t0(this.LIZ, mediaModel, null, 2);
            return;
        }
        if (mediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.updateSelectMediaForMob(1);
            C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
            C530020KqW mediaModelFactory = mvChoosePhotoScene.getMediaModelFactory();
            c527240Km2.getClass();
            TikTokMediaModel tikTokMediaModelLIZJ = C527240Km2.LIZJ(mediaModelFactory, mediaModel);
            mvChoosePhotoScene.chooseVideoMediaEvent(C1697810uHb.LJIILJJIL(C527240Km2.LIZJ(mvChoosePhotoScene.getMediaModelFactory(), mediaModel)), C0L9I.THUMBNAIL, tikTokMediaModelLIZJ.mediaRatio, new Size(tikTokMediaModelLIZJ.width, tikTokMediaModelLIZJ.height), mediaModel);
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
            mvChoosePhotoScene2.tabNameMap.put(mediaModel.id, mvChoosePhotoScene2.getTabNameForCurrentPosition());
            C1458370o3P c1458370o3P = C1458370o3P.LIZ;
            ShortVideoContext shortVideoContext = mvChoosePhotoScene2.shortVideoContext;
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaModel);
            Bundle bundle = mvChoosePhotoScene2.mArguments;
            c1458370o3P.getClass();
            C1458370o3P.LJJ(shortVideoContext, arrayList, bundle);
        }
        this.LIZ.selectMediaModel.clear();
        if (mediaModel != null) {
            this.LIZ.selectMediaModel.add(mediaModel);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        mvChoosePhotoScene3.chosenMediaType = 2;
        mvChoosePhotoScene3.firstSelect();
        this.LIZ.processLibraryBeforeFinish(null);
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIIIZ(MediaModel mediaModel) {
        this.LIZ.mobUnselectMedia(mediaModel, C0L9C.UNSELECT_O);
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIILIIL(String str) throws JSONException {
        this.LIZ.toastMob(str);
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJII(MediaModel mediaModel, C0L90 c0l90) {
        Context sceneContext = this.LIZ.getSceneContext();
        if (sceneContext == null) {
            return false;
        }
        if (C523140KfQ.LIZ(c0l90)) {
            if (C0L0K.LIZ(C2471909mP.LJIJ(mediaModel), AFwS239S0000000_8.get$arr$(84))) {
                if (C522250Kdz.LIZIZ() && !C523650KgF.LIZ()) {
                    this.LIZ.finishScene(false);
                }
                return false;
            }
        } else if (C0L0K.LIZIZ(sceneContext, C2471909mP.LJIJ(mediaModel), "video_upload", false, 24)) {
            if (C522250Kdz.LIZIZ() && !C523650KgF.LIZ()) {
                this.LIZ.finishScene(false);
            }
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC522270Ke1 interfaceC522270Ke1 = mvChoosePhotoScene.cutSameController;
        if (interfaceC522270Ke1 != null) {
            mvChoosePhotoScene.getApplicationContext();
            return interfaceC522270Ke1.LIZ(this.LIZ.videoImageMixedController, mediaModel);
        }
        return true;
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIIIIZZ(TikTokMediaModel tikTokMediaModel, View view) {
        if (tikTokMediaModel == null || view == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.isEnterPreviewing && mvChoosePhotoScene.isUgcTemplateMode()) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        mvChoosePhotoScene2.isEnterPreviewing = true;
        if (mvChoosePhotoScene2.isEditorProReplace()) {
            Bundle bundle = this.LIZ.mArguments;
            long j = -1;
            if (bundle != null) {
                j = bundle.getLong("Key_replace_item_duration", -1L);
            }
            ChooseMediaViewModel chooseMediaViewModel = this.LIZ.chooseMediaViewModel;
            if (chooseMediaViewModel != null) {
                ChooseMediaViewModel.mR2(chooseMediaViewModel, j, null, null, 6);
            }
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LIZ.chooseMediaViewModel;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.LLJJI = EnumC538230L8z.VIDEOS;
            chooseMediaViewModel2.wR2(chooseMediaViewModel2.LLILZLL);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        mvChoosePhotoScene3.previewIndex = mvChoosePhotoScene3.findTargetPreviewIndex(tikTokMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LIZ;
        mvChoosePhotoScene4.isMixedPreview = false;
        mvChoosePhotoScene4.enterPreviewScene(new AwS552S0100000_8(tikTokMediaModel, 263), new AwS552S0100000_8(this.LIZ, 264), new AwS552S0100000_8(this.LIZ, 265));
    }

    @Override // X.InterfaceC528410Knv
    public final int LJI(boolean z, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        boolean z2;
        this.LIZ.firstSelect();
        C1458730o3z c1458730o3zLIZJ = null;
        if (tikTokMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.tabNameMap.put(((MediaModel) tikTokMediaModel).id, "videos");
            mvChoosePhotoScene.updateMaxSelectItemRank(z, tikTokMediaModel, c0l90);
            C1458370o3P c1458370o3P = C1458370o3P.LIZ;
            Long lValueOf = Long.valueOf(tikTokMediaModel.duration);
            c1458370o3P.getClass();
            c1458730o3zLIZJ = C1458370o3P.LIZJ(tikTokMediaModel, lValueOf);
        }
        ChooseMediaViewModel chooseMediaViewModel = this.LIZ.chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.rR2();
        }
        C1458370o3P c1458370o3P2 = C1458370o3P.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        ShortVideoContext shortVideoContext = mvChoosePhotoScene2.shortVideoContext;
        if (mvChoosePhotoScene2.getChooseScene$tools_camera_record_release() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1458370o3P2.getClass();
        C1458370o3P.LJJIIJ(c1458730o3zLIZJ, z, shortVideoContext, z2, false);
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        InterfaceC522120Kdm interfaceC522120Kdm = mvChoosePhotoScene3.videoImageMixedController;
        if (interfaceC522120Kdm != null) {
            if (mvChoosePhotoScene3.enableAllTab() && tikTokMediaModel != null) {
                C528320Knm c528320Knm = mvChoosePhotoScene3.chooseAllFragment;
                if (c528320Knm != null) {
                    c528320Knm.LLLLLJIL(tikTokMediaModel, z);
                }
                return interfaceC522120Kdm.LJIILLIIL(tikTokMediaModel, z, true, c0l90);
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            int chooseScene$tools_camera_record_release = mvChoosePhotoScene3.getChooseScene$tools_camera_record_release();
            c533730KwV.getClass();
            if (C533730KwV.LIZLLL(chooseScene$tools_camera_record_release, false) && tikTokMediaModel != null) {
                return interfaceC522120Kdm.LJIILLIIL(tikTokMediaModel, z, true, c0l90);
            }
        }
        List<? extends TikTokMediaModel> list = this.LIZ.selectVideoList;
        if (list == null || !(!list.isEmpty())) {
            return 1;
        }
        return list.size();
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIIJ(List<TikTokMediaModel> list, C0L9I c0l9i, TikTokMediaModel tikTokMediaModel) {
        int size;
        String str;
        if (list != null) {
            size = ((ArrayList) list).size();
        } else {
            size = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.lastVideoCount < size) {
            Size size2 = null;
            mvChoosePhotoScene.updateSelectMediaForMob(null);
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
            if (tikTokMediaModel != null) {
                str = tikTokMediaModel.mediaRatio;
                size2 = new Size(tikTokMediaModel.width, tikTokMediaModel.height);
            } else {
                str = null;
            }
            mvChoosePhotoScene2.chooseVideoMediaEvent(list, c0l9i, str, size2, tikTokMediaModel);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        mvChoosePhotoScene3.lastVideoCount = size;
        mvChoosePhotoScene3.selectVideoList = list;
        mvChoosePhotoScene3.updateUIWhenChooseMedia$tools_camera_record_release(mvChoosePhotoScene3.hasSelectedMedia());
        this.LIZ.showOrHideSureText(list);
        this.LIZ.showOrHideOneMinuteVideoHint(size);
        if (!this.LIZ.isEditorProMode()) {
            ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFilesForUpload(this.LIZ, "upload");
        }
        this.LIZ.notifyDmAlbumSelectionChanged();
    }
}
