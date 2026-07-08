package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0Kdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522130Kdn implements InterfaceC528100KnQ {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC528100KnQ
    public final void LIZ(int i, int i2) {
    }

    public C522130Kdn(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC528100KnQ
    public final void LIZIZ(TikTokMediaModel tikTokMediaModel) {
        List<TikTokMediaModel> listLIZJ;
        boolean z;
        InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
        if (interfaceC522120Kdm != null && (listLIZJ = interfaceC522120Kdm.LIZJ()) != null) {
            int size = listLIZJ.size();
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.showOrHideOneMinuteVideoHint(size);
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            mvChoosePhotoScene.updateUIWhenChooseMedia$tools_camera_record_release(z);
        }
        this.LIZ.mobUnselectMedia(tikTokMediaModel, C0L9C.UNSELECT_X);
    }

    @Override // X.InterfaceC528100KnQ
    public final void LIZJ(final TikTokMediaModel tikTokMediaModel, final View view) {
        List<TikTokMediaModel> listLIZJ;
        ArrayList<TikTokMediaModel> arrayListLJ;
        ChooseMediaViewModel chooseMediaViewModel;
        InterfaceC522120Kdm interfaceC522120Kdm;
        ArrayList<TikTokMediaModel> arrayListLJIL;
        ChooseMediaViewModel chooseMediaViewModel2;
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.isEnterPreviewing && (mvChoosePhotoScene.isUgcTemplateMode() || this.LIZ.isPhotoModeTemplateMode())) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        if (mvChoosePhotoScene2.choosePhotoConfig.LJIIIIZZ) {
            return;
        }
        mvChoosePhotoScene2.isEnterPreviewing = true;
        InterfaceC522120Kdm interfaceC522120Kdm2 = mvChoosePhotoScene2.videoImageMixedController;
        if (interfaceC522120Kdm2 != null) {
            interfaceC522120Kdm2.LJJI();
        }
        if (tikTokMediaModel != null) {
            final MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
            if (view != null) {
                if (!C525490KjD.LIZIZ(tikTokMediaModel, true)) {
                    mvChoosePhotoScene3.isEnterPreviewing = false;
                    return;
                }
                InterfaceC522120Kdm interfaceC522120Kdm3 = mvChoosePhotoScene3.videoImageMixedController;
                if (interfaceC522120Kdm3 != null && (listLIZJ = interfaceC522120Kdm3.LIZJ()) != null) {
                    if (mvChoosePhotoScene3.choosePhotoConfig.LJFF.showDockInPreviewPage && (interfaceC522120Kdm = mvChoosePhotoScene3.videoImageMixedController) != null && (arrayListLJIL = interfaceC522120Kdm.LJIL()) != null && (chooseMediaViewModel2 = mvChoosePhotoScene3.chooseMediaViewModel) != null) {
                        chooseMediaViewModel2.xR2(arrayListLJIL);
                    }
                    if (!C529980KqS.LIZJ(mvChoosePhotoScene3.getChooseScene$tools_camera_record_release()) && !mvChoosePhotoScene3.isSoundSyncMode() && !mvChoosePhotoScene3.isUgcTemplateMode() && !mvChoosePhotoScene3.isAutoCutAnchorSoundSyncMode() && !mvChoosePhotoScene3.isPhotoModeTemplateMode()) {
                        ChooseMediaViewModel chooseMediaViewModel3 = mvChoosePhotoScene3.chooseMediaViewModel;
                        if (chooseMediaViewModel3 != null) {
                            ArrayList arrayList = new ArrayList(listLIZJ);
                            chooseMediaViewModel3.LLJJI = EnumC538230L8z.MIXED;
                            chooseMediaViewModel3.wR2(arrayList);
                        }
                    } else {
                        InterfaceC522120Kdm interfaceC522120Kdm4 = mvChoosePhotoScene3.videoImageMixedController;
                        if (interfaceC522120Kdm4 != null && (arrayListLJ = interfaceC522120Kdm4.LJ()) != null && (chooseMediaViewModel = mvChoosePhotoScene3.chooseMediaViewModel) != null) {
                            ArrayList arrayList2 = new ArrayList(arrayListLJ);
                            chooseMediaViewModel.LLJJI = EnumC538230L8z.MIXED;
                            chooseMediaViewModel.wR2(arrayList2);
                        }
                    }
                    mvChoosePhotoScene3.mixPreviewIndex = tikTokMediaModel.selectIndex - 1;
                    mvChoosePhotoScene3.isMixedPreview = true;
                    InterfaceC526970Klb interfaceC526970Klb = new InterfaceC526970Klb() { // from class: X.0KfF
                        @Override // X.InterfaceC526970Klb
                        public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel2) {
                            return true;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final int LJI() {
                            return 3;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final boolean LIZ() {
                            List<TikTokMediaModel> listLIZJ2;
                            List<TikTokMediaModel> listLIZJ3;
                            C533730KwV c533730KwV = C533730KwV.LIZ;
                            int chooseScene$tools_camera_record_release = mvChoosePhotoScene3.getChooseScene$tools_camera_record_release();
                            boolean z = mvChoosePhotoScene3.stickerSupportMultiPhotos;
                            c533730KwV.getClass();
                            if (!C533730KwV.LIZLLL(chooseScene$tools_camera_record_release, z)) {
                                MvChoosePhotoScene mvChoosePhotoScene4 = mvChoosePhotoScene3;
                                return mvChoosePhotoScene4.lastPhotoCount >= mvChoosePhotoScene4.maxPhotoSelectCount;
                            }
                            if (mvChoosePhotoScene3.isCelebrationMode()) {
                                InterfaceC522120Kdm interfaceC522120Kdm5 = mvChoosePhotoScene3.videoImageMixedController;
                                return ((interfaceC522120Kdm5 == null || (listLIZJ3 = interfaceC522120Kdm5.LIZJ()) == null) ? 0 : listLIZJ3.size()) >= mvChoosePhotoScene3.maxPhotoSelectCount;
                            }
                            InterfaceC522120Kdm interfaceC522120Kdm6 = mvChoosePhotoScene3.videoImageMixedController;
                            if (interfaceC522120Kdm6 == null || (listLIZJ2 = interfaceC522120Kdm6.LIZJ()) == null || !(!listLIZJ2.isEmpty())) {
                                return false;
                            }
                            return listLIZJ2.size() >= mvChoosePhotoScene3.maxPhotoSelectCount;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final int LIZIZ() {
                            ArrayList<TikTokMediaModel> arrayListLJ2;
                            if (!mvChoosePhotoScene3.isSoundSyncMode() && !mvChoosePhotoScene3.isUgcTemplateMode() && !mvChoosePhotoScene3.isAutoCutAnchorSoundSyncMode() && !mvChoosePhotoScene3.isPhotoModeTemplateMode()) {
                                return tikTokMediaModel.selectIndex - 1;
                            }
                            InterfaceC522120Kdm interfaceC522120Kdm5 = mvChoosePhotoScene3.videoImageMixedController;
                            if (interfaceC522120Kdm5 == null || (arrayListLJ2 = interfaceC522120Kdm5.LJ()) == null) {
                                return 0;
                            }
                            return arrayListLJ2.indexOf(tikTokMediaModel);
                        }

                        @Override // X.InterfaceC526970Klb
                        public final List<TikTokMediaModel> LIZJ() {
                            List<TikTokMediaModel> listLIZJ2;
                            InterfaceC522120Kdm interfaceC522120Kdm5 = mvChoosePhotoScene3.videoImageMixedController;
                            return (interfaceC522120Kdm5 == null || (listLIZJ2 = interfaceC522120Kdm5.LIZJ()) == null) ? C13BV.INSTANCE : listLIZJ2;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final boolean LJII() {
                            return mvChoosePhotoScene3.choosePhotoConfig.LIZIZ;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final void LJIIIIZZ() {
                            String strJ4;
                            if (mvChoosePhotoScene3.isCutSameMode() || mvChoosePhotoScene3.isMVMode()) {
                                strJ4 = C786410Ut5.j4(mvChoosePhotoScene3.getString(2131830079), Arrays.copyOf(new Object[]{Integer.valueOf(mvChoosePhotoScene3.maxPhotoSelectCount)}, 1));
                                View view2 = view;
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.message(strJ4);
                                creativeToastBuilder.isTuxToastLegacy(true);
                                C1390380mHk.LIZLLL(view2, 3075, creativeToastBuilder);
                            } else {
                                strJ4 = mvChoosePhotoScene3.isSoundSyncMode() ? C786410Ut5.j4(mvChoosePhotoScene3.getString(2131848654), Arrays.copyOf(new Object[]{Integer.valueOf(mvChoosePhotoScene3.maxPhotoSelectCount)}, 1)) : "";
                            }
                            View view3 = view;
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            creativeToastBuilder2.message(strJ4);
                            creativeToastBuilder2.isTuxToastLegacy(true);
                            C1390380mHk.LIZLLL(view3, 3075, creativeToastBuilder2);
                        }

                        @Override // X.InterfaceC526970Klb
                        public final boolean LJIIIZ() {
                            return (C529980KqS.LIZJ(mvChoosePhotoScene3.getChooseScene$tools_camera_record_release()) || mvChoosePhotoScene3.isCutSameMode() || mvChoosePhotoScene3.isSoundSyncMode() || mvChoosePhotoScene3.isAutoCutAnchorSoundSyncMode()) ? false : true;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final boolean LJ(TikTokMediaModel tikTokMediaModel2) {
                            Context sceneContext = mvChoosePhotoScene3.getSceneContext();
                            if (sceneContext == null) {
                                return false;
                            }
                            if (C0L0K.LIZIZ(sceneContext, C2471909mP.LJIJ(tikTokMediaModel), "video_upload", false, 24)) {
                                if (C522250Kdz.LIZIZ() && !C523650KgF.LIZ()) {
                                    ChooseMediaViewModel chooseMediaViewModel4 = mvChoosePhotoScene3.chooseMediaViewModel;
                                    if (chooseMediaViewModel4 != null) {
                                        chooseMediaViewModel4.AR2(new ArrayList(), false);
                                    }
                                    mvChoosePhotoScene3.finishScene(false);
                                }
                                return false;
                            }
                            MvChoosePhotoScene mvChoosePhotoScene4 = mvChoosePhotoScene3;
                            InterfaceC522270Ke1 interfaceC522270Ke1 = mvChoosePhotoScene4.cutSameController;
                            if (interfaceC522270Ke1 != null) {
                                mvChoosePhotoScene4.getApplicationContext();
                                return interfaceC522270Ke1.LIZ(mvChoosePhotoScene3.videoImageMixedController, tikTokMediaModel);
                            }
                            return true;
                        }

                        @Override // X.InterfaceC526970Klb
                        public final View LJFF(TikTokMediaModel tikTokMediaModel2) {
                            if (tikTokMediaModel2 != null) {
                                InterfaceC522120Kdm interfaceC522120Kdm5 = mvChoosePhotoScene3.videoImageMixedController;
                                if (interfaceC522120Kdm5 != null) {
                                    return interfaceC522120Kdm5.LJIIIZ(tikTokMediaModel2);
                                }
                                return null;
                            }
                            return view.findViewById(R.id.video_cover);
                        }
                    };
                    mvChoosePhotoScene3.getEventLogger().LJIIIIZZ(mvChoosePhotoScene3.shortVideoContext, tikTokMediaModel, mvChoosePhotoScene3.mvId, mvChoosePhotoScene3.shootWay, mvChoosePhotoScene3.getTabNameForCurrentPosition(), mvChoosePhotoScene3.getAlbumCommonParams());
                    MvChoosePhotoScene.push$default(mvChoosePhotoScene3, C526910KlV.class, false, true, interfaceC526970Klb, null, 16, null);
                }
            }
        }
    }
}
