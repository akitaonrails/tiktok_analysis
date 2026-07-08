package X;

import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523090KfL implements InterfaceC528410Knv {
    public final /* synthetic */ MvChoosePhotoScene LIZ;
    public final /* synthetic */ C523060KfI LIZIZ;
    public final /* synthetic */ C523070KfJ LIZJ;

    @Override // X.InterfaceC528410Knv
    public final /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LJIILJJIL(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        return true;
    }

    @Override // X.InterfaceC528410Knv
    public final boolean LIZ() {
        List<TikTokMediaModel> listLIZJ;
        InterfaceC522120Kdm interfaceC522120Kdm = this.LIZ.videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
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

    @Override // X.InterfaceC528410Knv
    public final void LJIIL() {
        if (!C522250Kdz.LIZIZ() || C523650KgF.LIZ()) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C526160KkI(this.LIZ, null), 3);
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZIZ(C0L90 c0l90) {
        MvChoosePhotoScene.initChooseListener$onSelectFinishInternal(this.LIZ, c0l90);
    }

    @Override // X.InterfaceC528410Knv
    public final void LIZLLL(MediaModel mediaModel) {
        Set<String> setLJII;
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.enableBottomDocker || mvChoosePhotoScene.isSoundSyncMode() || this.LIZ.isUgcTemplateMode() || this.LIZ.isAutoCutAnchorSoundSyncMode() || this.LIZ.isFromAddFeaturedVideo() || this.LIZ.isCutSameMode() || C527910Kn7.LIZIZ() || this.LIZ.isDMAlbum()) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService().getJatoBoostAbilityForEditPage();
            if (mediaModel != null && mediaModel.LJIILJJIL()) {
                this.LIZIZ.LIZLLL(mediaModel);
            } else {
                this.LIZJ.LIZLLL(mediaModel);
            }
            String str = "";
            if (!this.LIZ.supportStoryStandaloneAlbum() && ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LIZLLL().contains(Integer.valueOf(this.LIZ.getChooseScene$tools_camera_record_release()))) {
                if (mediaModel != null) {
                    MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
                    IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService = (IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class);
                    String strLJFF = mediaModel.LJFF();
                    if (strLJFF != null) {
                        str = strLJFF;
                    }
                    iMixEditingFeatureExtractionService.LJ(new C2262608tk(str, mediaModel.duration, Boolean.valueOf(mediaModel.LJIILJJIL()), null, mediaModel.LJFF(), mediaModel.id, false, 72), C2295608z4.LIZIZ(), new C2263508tt(mvChoosePhotoScene2.shootWay, mvChoosePhotoScene2.contentSource, null, 12));
                    return;
                }
                return;
            }
            if (!C527950KnB.LIZJ() || mediaModel == null) {
                return;
            }
            MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
            if (C311120CHm.LIZ() == 1) {
                setLJII = Collections.singleton("clip_d128");
            } else {
                s.LIZ.getClass();
                setLJII = C15442062u.LJII(C15442062u.LJIIIZ(C2295608z4.LIZIZ(), C2295608z4.LIZ()), C118600ci.LIZ());
            }
            IMixEditingFeatureExtractionService iMixEditingFeatureExtractionService2 = (IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class);
            String strLJFF2 = mediaModel.LJFF();
            if (strLJFF2 != null) {
                str = strLJFF2;
            }
            iMixEditingFeatureExtractionService2.LJ(new C2262608tk(str, mediaModel.duration, Boolean.valueOf(mediaModel.LJIILJJIL()), null, mediaModel.LJFF(), mediaModel.id, false, 72), setLJII, new C2263508tt(mvChoosePhotoScene3.shootWay, mvChoosePhotoScene3.contentSource, null, 12));
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
            chooseMediaViewModel2.LLJJI = EnumC538230L8z.ALL;
            chooseMediaViewModel2.wR2(chooseMediaViewModel2.LLIZ);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
        mvChoosePhotoScene3.previewIndex = mvChoosePhotoScene3.findTargetPreviewIndex(tikTokMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LIZ;
        mvChoosePhotoScene4.isMixedPreview = false;
        InterfaceC522120Kdm interfaceC522120Kdm = mvChoosePhotoScene4.videoImageMixedController;
        if (interfaceC522120Kdm != null) {
            interfaceC522120Kdm.LJJI();
        }
        this.LIZ.enterPreviewScene(new AwS552S0100000_8(tikTokMediaModel, 242), AFwS194S0000000_8.get$arr$(148), new AwS552S0100000_8(this.LIZ, 243));
    }

    public C523090KfL(MvChoosePhotoScene mvChoosePhotoScene, C523060KfI c523060KfI, C523070KfJ c523070KfJ) {
        this.LIZ = mvChoosePhotoScene;
        this.LIZIZ = c523060KfI;
        this.LIZJ = c523070KfJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC528410Knv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(boolean r7, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r8, X.C0L90 r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            r0.firstSelect()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel r0 = r0.chooseMediaViewModel
            if (r0 == 0) goto Le
            r0.rR2()
        Le:
            r3 = 1
            r2 = 0
            if (r8 == 0) goto L6a
            boolean r0 = r8.LJIILJJIL()
            if (r0 != r3) goto L6a
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            X.0Knn r0 = r0.chooseVideoFragment
            if (r0 == 0) goto L21
            r0.LLLLLJIL(r8, r7)
        L21:
            if (r8 == 0) goto L9f
        L23:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r5 = r6.LIZ
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.tabNameMap
            java.lang.String r1 = r8.id
            java.lang.String r0 = "all"
            r4.put(r1, r0)
            r5.updateMaxSelectItemRank(r7, r8, r9)
            X.0o3P r4 = X.C1458370o3P.LIZ
            long r0 = r8.duration
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.getClass()
            X.0o3z r5 = X.C1458370o3P.LIZJ(r8, r0)
        L40:
            X.0o3P r4 = X.C1458370o3P.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.shortVideoContext
            int r0 = r0.getChooseScene$tools_camera_record_release()
            if (r0 != 0) goto L68
            r0 = 1
        L4d:
            r4.getClass()
            X.C1458370o3P.LJJIIJ(r5, r7, r1, r0, r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            X.0Kdm r1 = r0.videoImageMixedController
            if (r1 == 0) goto L65
            if (r8 == 0) goto L66
            boolean r0 = r8.LJIILJJIL()
            if (r0 != r3) goto L66
        L61:
            int r2 = r1.LJIILLIIL(r8, r7, r3, r9)
        L65:
            return r2
        L66:
            r3 = 0
            goto L61
        L68:
            r0 = 0
            goto L4d
        L6a:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            r0.preloadVEVideoInfo(r8, r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            r0.preProcessFileForImageMode(r8, r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            r0.preProcessFileForLivePhoto(r8, r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            X.0Knl r0 = r0.mvChoosePhotoFragment
            if (r0 == 0) goto L82
            r0.LLLLLJIL(r8, r7)
        L82:
            X.0Mmd r0 = X.C578570Mmd.LIZ
            r0.getClass()
            boolean r0 = X.C578570Mmd.LIZ()
            if (r0 == 0) goto L21
            if (r8 == 0) goto L9f
            boolean r0 = r8.LJIIJJI()
            if (r0 != r3) goto L23
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r6.LIZ
            X.0Kno r0 = r0.chooseLivePhotoFragment
            if (r0 == 0) goto L21
            r0.LLLLLJIL(r8, r7)
            goto L21
        L9f:
            r5 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C523090KfL.LJI(boolean, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, X.0L90):int");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC528410Knv
    public final void LJIIJ(List<TikTokMediaModel> list, C0L9I c0l9i, TikTokMediaModel tikTokMediaModel) {
        int size;
        Size size2;
        String str;
        boolean zLJIILJJIL = false;
        if (list != null) {
            size = ((ArrayList) list).size();
        } else {
            size = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.lastPhotoCount + mvChoosePhotoScene.lastVideoCount < size) {
            if (list != null) {
                zLJIILJJIL = ((MediaModel) ListProtector.get(list, ((ArrayList) list).size() - 1)).LJIILJJIL();
            }
            String str2 = null;
            Size size3 = null;
            this.LIZ.updateSelectMediaForMob(null);
            if (zLJIILJJIL) {
                MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
                if (tikTokMediaModel != null) {
                    str = tikTokMediaModel.mediaRatio;
                    size3 = new Size(tikTokMediaModel.width, tikTokMediaModel.height);
                } else {
                    str = null;
                }
                mvChoosePhotoScene2.chooseVideoMediaEvent(list, c0l9i, str, size3, tikTokMediaModel);
            } else {
                MvChoosePhotoScene mvChoosePhotoScene3 = this.LIZ;
                if (tikTokMediaModel != null) {
                    str2 = tikTokMediaModel.mediaRatio;
                    size2 = new Size(tikTokMediaModel.width, tikTokMediaModel.height);
                } else {
                    size2 = null;
                }
                mvChoosePhotoScene3.onChoosePhotoUploadContentEvent(tikTokMediaModel, c0l9i, str2, size2, size, C530690Krb.LIZLLL(tikTokMediaModel));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (MediaModel mediaModel : (ArrayList) list) {
                if (mediaModel.LJIILJJIL()) {
                    arrayList2.add(mediaModel);
                } else {
                    arrayList.add(mediaModel);
                }
            }
        }
        this.LIZ.lastPhotoCount = arrayList.size();
        this.LIZ.lastVideoCount = arrayList2.size();
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LIZ;
        mvChoosePhotoScene4.selectPhotoList = arrayList;
        mvChoosePhotoScene4.selectVideoList = arrayList2;
        mvChoosePhotoScene4.updateUIWhenChooseMedia$tools_camera_record_release(mvChoosePhotoScene4.hasSelectedMedia());
        this.LIZ.showOrHideSureText(list);
        this.LIZ.showOrHideOneMinuteVideoHint(size);
        TextView textView = this.LIZ.sureTextView;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        if (!this.LIZ.isEditorProMode()) {
            ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).preloadLayoutFilesForUpload(this.LIZ, "upload");
        }
        this.LIZ.notifyDmAlbumSelectionChanged();
    }
}
