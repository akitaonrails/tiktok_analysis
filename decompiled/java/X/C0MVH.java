package X;

import Y.ARunnableS13S1200000_8;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MVH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVH extends C09AY implements Function0<C0M89> {
    public C0MVH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0M89] */
    @Override // kotlin.jvm.functions.Function0
    public final C0M89 invoke() {
        return new C0M6F() { // from class: X.0M89
            public final C01GW LIZ = C452501pT.LIZIZ(new C545670Laf());
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C0M4O());
            public final C01GW LIZJ = C452501pT.LIZIZ(new C0M8E());
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C0M8F());
            public final C01GW LJ = C452501pT.LIZIZ(new C0M8B());
            public final C01GW LJFF = C452501pT.LIZIZ(new C0M8C());
            public boolean LJI;
            public boolean LJII;

            @Override // X.C0M6F
            public final void LJ() {
            }

            @Override // X.C0M6F
            public final InterfaceC557100Lt6 LIZ() {
                return (InterfaceC557100Lt6) this.LIZJ.getValue();
            }

            @Override // X.C0M6F
            public final InterfaceC545580LaW LIZIZ() {
                return (InterfaceC545580LaW) this.LIZ.getValue();
            }

            @Override // X.C0M6F
            public final InterfaceC570320MYk LIZJ() {
                return (InterfaceC570320MYk) this.LJ.getValue();
            }

            @Override // X.C0M6F
            public final String LJI() {
                C570230MYb.LIZ.getClass();
                return C570230MYb.LIZLLL();
            }

            @Override // X.C0M6F
            public final boolean LJIIJJI() {
                return ((Boolean) C283070B7p.LIZ.getValue()).booleanValue();
            }

            @Override // X.C0M6F
            public final String LJIIL() {
                C570230MYb.LIZ.getClass();
                InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                CreativeInfo creativeInfo = C1445850njD.LIZ;
                C0MI0 c0mi0 = C0MI0.LAST_PUBLISH_FAILED_LOG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0CHQ.LIZ().getAccountService().LIZJ());
                sbLIZ.append(".json");
                return pathService.LJIILL(creativeInfo, c0mi0, C2188811AlT.LIZIZ(sbLIZ), false);
            }

            @Override // X.C0M6F
            public final InterfaceC557110Lt7 LJIILJJIL() {
                return (InterfaceC557110Lt7) this.LIZIZ.getValue();
            }

            @Override // X.C0M6F
            public final InterfaceC557090Lt5 LJIILL() {
                return (InterfaceC557090Lt5) this.LIZLLL.getValue();
            }

            @Override // X.C0M6F
            public final C0M6G LJIJJ() {
                return (C0M6G) this.LJFF.getValue();
            }

            @Override // X.C0M6F
            public final List<String> genCreationIdsOfVisibleDraft() {
                return C13LP.LLIIII(((Keva) C12879052f.LIZ.getValue()).getAll().keySet());
            }

            @Override // X.C0M6F
            public final boolean LJIILIIL() {
                return C0M1K.LIZ();
            }

            @Override // X.C0M6F
            public final boolean enableAddDraftLossMonitor() {
                return C0CHC.LIZ();
            }

            @Override // X.C0M6F
            public final boolean LJIIZILJ() {
                return this.LJII;
            }

            @Override // X.C0M6F
            public final boolean LJIJJLI() {
                return this.LJI;
            }

            @Override // X.C0M6F
            public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                C0M2U.LIZ.getClass();
                C0M2U.LIZ(videoPublishEditModel, "tcm", null);
            }

            @Override // X.C0M6F
            public final void LJIIIIZZ(List<String> list) {
                final String strLIZIZ = "";
                for (String str : list) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(((Keva) C12879052f.LIZ.getValue()).getString(str, ""));
                    sbLIZ.append(';');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C1AF0.LJ(new RuntimeException(strLIZIZ) { // from class: X.0M8A
                    public static final int $stable = 8;
                    public final String LL;

                    public final String getMsg() {
                        return this.LL;
                    }

                    {
                        super(strLIZIZ);
                        this.LL = strLIZIZ;
                    }
                });
            }

            @Override // X.C0M6F
            public final void LJIIJ(boolean z) {
                this.LJII = z;
            }

            @Override // X.C0M6F
            public final void LJIILLIIL(String str) {
                if (!C306790C0v.LIZ()) {
                    return;
                }
                ArrayList arrayList = (ArrayList) C0M1W.LIZJ;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    C0M1W.LIZ(null);
                }
            }

            @Override // X.C0M6F
            public final void LJIJ(boolean z) {
                this.LJI = z;
            }

            @Override // X.C0M6F
            public final void LJIJI(C0M88 c0m88) {
                CreativeModel creativeModel = c0m88.LIZ;
                if (((Boolean) C258180A9w.LIZ.getValue()).booleanValue() && !creativeModel.draftInfoModel.isDraft && !C568750MSj.LIZ(creativeModel)) {
                    VideoPublishEditModel videoPublishEditModel = c0m88.LIZJ;
                    if (videoPublishEditModel != null && videoPublishEditModel.mIsFromDraft) {
                        return;
                    }
                    C0CHQ.LIZ().isDebugConfigOpen();
                    C823050WQl.LIZLLL().execute(new ARunnableS13S1200000_8(creativeModel, "", c0m88, 1));
                }
            }

            @Override // X.C0M6F
            public final void LJFF(VideoPublishEditModel videoPublishEditModel, String str) {
                boolean z;
                InterfaceC1429470nIn interfaceC1429470nInLJFF;
                C0M2U.LIZ.getClass();
                Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
                int iIntValue = pairLJIIJJI.getFirst().intValue();
                int iIntValue2 = pairLJIIJJI.getSecond().intValue();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
                c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
                c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
                c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
                c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
                c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
                c0lab.LIZ(iIntValue2, "pic_cnt");
                c0lab.LIZ(iIntValue, "video_cnt");
                c0lab.LJ("function", str);
                AutoPickModel autoPickModel = videoPublishEditModel.creativeModel.autoPickModel;
                boolean zLIZ = C1874810yt5.LIZ(autoPickModel);
                c0lab.LIZ(zLIZ ? 1 : 0, "is_album_aipick");
                if (zLIZ) {
                    String str2 = autoPickModel.pickMethod;
                    if ((!a0.LJJJIL(str2)) && str2 != null) {
                        c0lab.LJ("pick_method", str2);
                    }
                }
                c0lab.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(videoPublishEditModel));
                c0lab.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
                c0lab.LJ("content_size", C1428520nHG.LJJIIJ(videoPublishEditModel));
                C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
                C1413430msv.LIZLLL(videoPublishEditModel, c0lab);
                C1413430msv.LIZIZ(videoPublishEditModel, c0lab);
                IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel))) {
                    z = true;
                } else {
                    z = false;
                }
                String str3 = "1";
                if (z) {
                    c0lab.LJ("is_visual_poet", "1");
                }
                c0lab.LIZ(C573570MeZ.LIZJ(videoPublishEditModel) ? 1 : 0, "is_pic_frame_single_pic_edit");
                if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
                    c0lab.LIZ(1, "pic_cnt");
                    c0lab.LJ("content_type", "multi_photo");
                }
                C1413430msv.LIZ(videoPublishEditModel, c0lab);
                c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
                C564410MBr c564410MBr = C564410MBr.LIZ;
                UsageStatus usageStatusLJ = videoPublishEditModel.getAILivePhotoModel().LJ();
                c564410MBr.getClass();
                c0lab.LIZ(C564410MBr.LIZLLL(usageStatusLJ), "ai_livephoto_status");
                C1413430msv.LJFF(videoPublishEditModel, c0lab);
                C580270MpN.LJIILIIL(videoPublishEditModel, c0lab, "edit_page_function_click");
                C572310McX.LIZJ(c0lab, videoPublishEditModel, null, false);
                if (C298680BnG.LIZ()) {
                    c0lab.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
                }
                if (C1403850mdT.LJFF(videoPublishEditModel)) {
                    if (!C1444810nhX.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel)) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0lab.LJ("music_lyrics_status", str3);
                }
                C20684815ws.LJIILLIIL("edit_page_function_click", c0lab.LIZ);
            }

            @Override // X.C0M6F
            public final void LJIIIZ(ShortVideoContext shortVideoContext, String str) {
                C0M2U.LIZ.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", shortVideoContext.getCreationId());
                c0lab.LJ("shoot_way", shortVideoContext.shootWay);
                c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
                c0lab.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
                c0lab.LJ("function", str);
                C20684815ws.LJIILLIIL("shoot_page_function_click", c0lab.LIZ);
            }

            @Override // X.C0M6F
            public final void LJIL(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
                C0M2U.LIZ.getClass();
                C0M2U.LIZ(videoPublishEditModel, str, str2);
            }

            @Override // X.C0M6F
            public final void LJJ(Activity activity, AwemeDraft awemeDraft, int i, OnStartEditDraftListener onStartEditDraftListener) {
                C570560MZi.LJ(activity, awemeDraft, i, System.currentTimeMillis(), null, onStartEditDraftListener, "page");
            }

            @Override // X.C0M6F
            public final Object LJII(VideoPublishEditModel videoPublishEditModel, AwemeDraft awemeDraft, String str, String str2, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
                return DraftCopy.LIZ.LIZIZ(videoPublishEditModel, awemeDraft, str, "DraftCopy", true, str2, AFwS239S0000000_8.get$arr$(161), AFwS239S0000000_8.get$arr$(162), interfaceC1364105Vn);
            }
        };
    }
}
