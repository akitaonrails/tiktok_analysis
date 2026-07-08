package X;

import android.app.Activity;
import android.util.Size;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PlDataBean;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523070KfJ implements InterfaceC528410Knv {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC528410Knv
    public final /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC528410Knv
    public final /* synthetic */ void LJIIL() {
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LIZ() {
        List<TikTokMediaModel> listLIZJ;
        List<TikTokMediaModel> listLIZJ2;
        C533730KwV c533730KwV = C533730KwV.LIZ;
        int chooseScene$tools_camera_record_release = this.LIZ.getChooseScene$tools_camera_record_release();
        boolean z = this.LIZ.stickerSupportMultiPhotos;
        c533730KwV.getClass();
        if (!C533730KwV.LIZLLL(chooseScene$tools_camera_record_release, z) && this.LIZ.getChooseScene$tools_camera_record_release() != 15) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            return mvChoosePhotoScene.lastPhotoCount >= mvChoosePhotoScene.maxPhotoSelectCount;
        }
        if (this.LIZ.isCelebrationMode()) {
            InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
            return ((interfaceC522120Kdm == null || (listLIZJ2 = interfaceC522120Kdm.LIZJ()) == null) ? 0 : listLIZJ2.size()) >= this.LIZ.maxPhotoSelectCount;
        }
        InterfaceC522120Kdm interfaceC522120Kdm2 = this.LIZ.videoImageMixedController;
        if (interfaceC522120Kdm2 == null || (listLIZJ = interfaceC522120Kdm2.LIZJ()) == null || !(!listLIZJ.isEmpty())) {
            return false;
        }
        return listLIZJ.size() >= this.LIZ.maxPhotoSelectCount;
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

    public C523070KfJ(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZIZ(C0L90 c0l90) {
        MvChoosePhotoScene.initChooseListener$onSelectFinishInternal(this.LIZ, c0l90);
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZLLL(MediaModel mediaModel) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.isDMGroupShot) {
            mvChoosePhotoScene.groupShotFaceDetectAndHandClick(mediaModel);
        } else {
            mvChoosePhotoScene.preProcessFileForLivePhoto(mediaModel, true);
            this.LIZ.onClickSingleImageInternal(mediaModel);
        }
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
        if (!this.LIZ.isCustomSticker() && this.LIZ.displayImageDimensionsFilteringUIToast(mediaModel)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIIIIZZ(TikTokMediaModel tikTokMediaModel, View view) {
        if (tikTokMediaModel == null || view == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.isEnterPreviewing && (mvChoosePhotoScene.isUgcTemplateMode() || this.LIZ.isPhotoModeTemplateMode())) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        mvChoosePhotoScene2.isEnterPreviewing = true;
        ChooseMediaViewModel chooseMediaViewModel = mvChoosePhotoScene2.chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.LLJJI = EnumC538230L8z.PHOTOS;
            chooseMediaViewModel.wR2(chooseMediaViewModel.LLILZIL);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        mvChoosePhotoScene3.previewIndex = mvChoosePhotoScene3.findTargetPreviewIndex(tikTokMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LIZ;
        mvChoosePhotoScene4.isMixedPreview = false;
        mvChoosePhotoScene4.enterPreviewScene(new AwS552S0100000_8(tikTokMediaModel, 251), new AwS552S0100000_8(this.LIZ, 252), new AwS552S0100000_8(this.LIZ, 253));
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJIILJJIL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        Activity activity;
        Activity activity2;
        String mvAlgorithmHint;
        String strLJFF;
        SdkExtraInfo sdkExtraInfo;
        PlDataBean pl;
        List<String> alg;
        if (tikTokMediaModel == null) {
            return false;
        }
        SdkExtraInfo sdkExtraInfo2 = this.LIZ.sdkExtraInfo;
        if (sdkExtraInfo2 == null || !sdkExtraInfo2.isLegal()) {
            return true;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        String str = "";
        if (tikTokMediaModel.height >= mvChoosePhotoScene.minHeight && tikTokMediaModel.width >= mvChoosePhotoScene.minWidth) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
            String str2 = mvChoosePhotoScene2.mvResourceZipPath;
            if (str2 != null && (strLJFF = tikTokMediaModel.LJFF()) != null && (sdkExtraInfo = mvChoosePhotoScene2.sdkExtraInfo) != null && (pl = sdkExtraInfo.getPl()) != null && (alg = pl.getAlg()) != null) {
                mvChoosePhotoScene2.veImageDetectUtils.LIZ(str2, strLJFF, alg, new VEImageDetectUtils.IDetectImageResultListener() { // from class: X.0KfO
                    @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener
                    public final void onDetectResult(String str3, String str4, String str5, boolean z) {
                        atomicBoolean.set(z);
                    }
                });
            }
            if (!atomicBoolean.get() && !C523140KfQ.LIZ(c0l90) && (activity2 = this.LIZ.mActivity) != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                SdkExtraInfo sdkExtraInfo3 = this.LIZ.sdkExtraInfo;
                if (sdkExtraInfo3 != null && (mvAlgorithmHint = sdkExtraInfo3.getMvAlgorithmHint()) != null) {
                    str = mvAlgorithmHint;
                }
                creativeToastBuilder.message(str);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity2, 3076, creativeToastBuilder);
            }
            return atomicBoolean.get();
        }
        if (!C523140KfQ.LIZ(c0l90) && (activity = mvChoosePhotoScene.mActivity) != null) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            String str3 = mvChoosePhotoScene.srcLimitedToast;
            if (str3 != null) {
                str = str3;
            }
            creativeToastBuilder2.message(str);
            creativeToastBuilder2.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3076, creativeToastBuilder2);
        }
        return false;
    }

    @Override // X.InterfaceC528410Knv
    public final int LJI(boolean z, TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        boolean z2;
        C528340Kno c528340Kno;
        if (!this.LIZ.isCustomSticker() && this.LIZ.displayImageDimensionsFilteringUIToast(tikTokMediaModel)) {
            return 0;
        }
        this.LIZ.firstSelect();
        C1458730o3z c1458730o3zLIZJ = null;
        if (tikTokMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.tabNameMap.put(((MediaModel) tikTokMediaModel).id, "photos");
            mvChoosePhotoScene.updateMaxSelectItemRank(z, tikTokMediaModel, c0l90);
            C1458370o3P.LIZ.getClass();
            c1458730o3zLIZJ = C1458370o3P.LIZJ(tikTokMediaModel, null);
        }
        this.LIZ.preloadVEVideoInfo(tikTokMediaModel, z);
        this.LIZ.preProcessFileForImageMode(tikTokMediaModel, z);
        this.LIZ.preProcessFileForLivePhoto(tikTokMediaModel, z);
        ChooseMediaViewModel chooseMediaViewModel = this.LIZ.chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.rR2();
        }
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        ShortVideoContext shortVideoContext = mvChoosePhotoScene2.shortVideoContext;
        if (mvChoosePhotoScene2.getChooseScene$tools_camera_record_release() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1458370o3P.getClass();
        C1458370o3P.LJJIIJ(c1458730o3zLIZJ, z, shortVideoContext, z2, false);
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        InterfaceC522120Kdm interfaceC522120Kdm = mvChoosePhotoScene3.videoImageMixedController;
        if (interfaceC522120Kdm != null) {
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ() && tikTokMediaModel != null && tikTokMediaModel.LJIIJJI() && (c528340Kno = mvChoosePhotoScene3.chooseLivePhotoFragment) != null) {
                c528340Kno.LLLLLJIL(tikTokMediaModel, z);
            }
            if (mvChoosePhotoScene3.enableAllTab() && tikTokMediaModel != null) {
                C528320Knm c528320Knm = mvChoosePhotoScene3.chooseAllFragment;
                if (c528320Knm != null) {
                    c528320Knm.LLLLLJIL(tikTokMediaModel, z);
                }
                return interfaceC522120Kdm.LJIILLIIL(tikTokMediaModel, z, false, c0l90);
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            int chooseScene$tools_camera_record_release = mvChoosePhotoScene3.getChooseScene$tools_camera_record_release();
            boolean z3 = mvChoosePhotoScene3.stickerSupportMultiPhotos;
            c533730KwV.getClass();
            if (C533730KwV.LIZLLL(chooseScene$tools_camera_record_release, z3) && tikTokMediaModel != null) {
                return interfaceC522120Kdm.LJIILLIIL(tikTokMediaModel, z, false, c0l90);
            }
        }
        List<? extends TikTokMediaModel> list = this.LIZ.selectPhotoList;
        if (list == null || !(!list.isEmpty())) {
            return 1;
        }
        return list.size();
    }

    @Override // X.InterfaceC528410Knv
    public final void LJIIJ(List<TikTokMediaModel> list, C0L9I c0l9i, TikTokMediaModel tikTokMediaModel) {
        int size;
        String str;
        if (tikTokMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            if (mvChoosePhotoScene.effectDimensionsFilteringEnabled && (tikTokMediaModel.height < mvChoosePhotoScene.minHeight || tikTokMediaModel.width < mvChoosePhotoScene.minWidth)) {
                return;
            }
        }
        if (list != null) {
            size = ((ArrayList) list).size();
        } else {
            size = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        if (mvChoosePhotoScene2.lastPhotoCount < size) {
            Size size2 = null;
            mvChoosePhotoScene2.updateSelectMediaForMob(null);
            MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
            if (tikTokMediaModel != null) {
                str = tikTokMediaModel.mediaRatio;
                size2 = new Size(tikTokMediaModel.width, tikTokMediaModel.height);
            } else {
                str = null;
            }
            mvChoosePhotoScene3.onChoosePhotoUploadContentEvent(tikTokMediaModel, c0l9i, str, size2, size, C530690Krb.LIZLLL(tikTokMediaModel));
        }
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LIZ;
        mvChoosePhotoScene4.lastPhotoCount = size;
        mvChoosePhotoScene4.selectPhotoList = list;
        mvChoosePhotoScene4.updateUIWhenChooseMedia$tools_camera_record_release(mvChoosePhotoScene4.hasSelectedMedia());
        this.LIZ.showOrHideSureText(list);
        this.LIZ.showOrHideOneMinuteVideoHint(size);
        if (!this.LIZ.isEditorProMode()) {
            ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFilesForUpload(this.LIZ, "upload");
        }
        this.LIZ.notifyDmAlbumSelectionChanged();
    }
}
