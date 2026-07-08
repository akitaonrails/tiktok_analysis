package Y;

import X.AbstractC1434490nQt;
import X.C09AJ;
import X.C09JN;
import X.C0AY1;
import X.C0C64;
import X.C0L8G;
import X.C0LAB;
import X.C0MJO;
import X.C11JF;
import X.C13LP;
import X.C1403850mdT;
import X.C1404120mdu;
import X.C1411940mqW;
import X.C1413430msv;
import X.C1421530n5z;
import X.C1428470nHB;
import X.C1431070nLN;
import X.C1431390nLt;
import X.C1432850nOF;
import X.C1436180nTc;
import X.C1436190nTd;
import X.C1443560nfW;
import X.C1444810nhX;
import X.C1447800nmM;
import X.C1450070nq1;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1456900o12;
import X.C1459590o5N;
import X.C1459620o5Q;
import X.C1465200oEQ;
import X.C1466910oHB;
import X.C15438062q;
import X.C1C7U;
import X.C201955140j;
import X.C204607154j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2265108u9;
import X.C2341909Fp;
import X.C259800zU;
import X.C531610Kt5;
import X.C531620Kt6;
import X.C572310McX;
import X.C573570MeZ;
import X.C580270MpN;
import X.C7740030o;
import X.EnumC1412640mre;
import X.EnumC1436980nUu;
import X.EnumC2251001D8o;
import X.InterfaceC1406950miT;
import X.InterfaceC1432820nOC;
import X.InterfaceC1460000o62;
import X.InterfaceC2342209Fs;
import X.InterfaceC420801kM;
import X.RunnableC1432010nMt;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.cutsame.cut_android.TemplateExtra;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.resource.MergedTemplateListResponseWrapper;
import com.ss.android.ugc.aweme.resource.MvEffect;
import com.ss.android.ugc.aweme.resource.TemplateResponseItem;
import com.ss.android.ugc.aweme.resource.UlikeMergedTemplateStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.recent.cache.LruCacheMusicModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectResponse;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public class AfS157S0200000_22 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS157S0200000_22 r4, java.lang.Object r5) {
        /*
            java.lang.String r3 = "RecommendDescApi@bf84.requestPhotoLabel$1"
            X.C1C7U.LIZ(r3)
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r5 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse) r5
            java.util.List<java.lang.String> r0 = r5.labels
            if (r0 == 0) goto L5c
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L5c
        L14:
            java.lang.String r2 = "ai_tip label"
            if (r1 == 0) goto L34
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0nVl r1 = r0.LJJLIIIJ()
            java.lang.String r0 = "ai_tip photo_text_description/label success"
            r1.LIZ(r2, r0)
            java.lang.Object r0 = r4.l0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r5)
        L30:
            X.C1C7U.LIZIZ(r3)
            return
        L34:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0nVl r1 = r0.LJJLIIIJ()
            java.lang.String r0 = "ai_tip photo_text_description/label no data return"
            r1.LIZ(r2, r0)
            java.lang.Object r1 = r4.l1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.0mp9 r0 = X.EnumC1411090mp9.NO_RESULT_RETURN
            r1.invoke(r0)
            java.lang.Integer r0 = r5.statusCode
            if (r0 == 0) goto L30
            int r1 = r0.intValue()
            r0 = 3019014(0x2e1106, float:4.23054E-39)
            if (r1 != r0) goto L30
            goto L30
        L5c:
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS157S0200000_22.accept$0(Y.AfS157S0200000_22, java.lang.Object):void");
    }

    public static final void accept$1(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("EditRootScene@37d3.initObserver$4$1");
        ImportVideoInfo importVideoInfo = (ImportVideoInfo) obj;
        C1455260nyO c1455260nyO = (C1455260nyO) afS157S0200000_22.l0;
        C1404120mdu c1404120mdu = (C1404120mdu) afS157S0200000_22.l1;
        c1455260nyO.getClass();
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = c1455260nyO.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c0lab.LIZ(!C1428470nHB.LJJLIIIJ(videoPublishEditModel) ? 1 : 0, "is_fast_import");
        c0lab.LJFF("fast_import_depend_hw_decode", importVideoInfo.getFastImportDependHW());
        c0lab.LIZ(c1404120mdu.LIZ, "video_decode_type");
        c0lab.LIZ(c1404120mdu.LIZIZ, "video_decode_hw_switch_sw");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_video_decode_info", c0lab.LIZ);
        C1C7U.LIZIZ("EditRootScene@37d3.initObserver$4$1");
    }

    public static final void accept$10(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("TikTokWaveTask@6d1f.startTimeoutMonitoring$1");
        AbstractC1434490nQt abstractC1434490nQt = (AbstractC1434490nQt) afS157S0200000_22.l0;
        C1431070nLN c1431070nLN = (C1431070nLN) afS157S0200000_22.l1;
        if (!abstractC1434490nQt.LLILZIL && abstractC1434490nQt.LLILLJJLI == 0) {
            c1431070nLN.LIZIZ(new C1431390nLt(abstractC1434490nQt.LJIIJJI(), EnumC1436980nUu.CLIENT, "wave_task"), EnumC2251001D8o.OUTER);
        }
        C1C7U.LIZIZ("TikTokWaveTask@6d1f.startTimeoutMonitoring$1");
    }

    public static final void accept$11(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("ProductVideoAnchorTool@41da.tryUploadFrameResult$1");
        C1456900o12 c1456900o12 = C1456900o12.LIZ;
        Function1 function1 = (Function1) afS157S0200000_22.l0;
        c1456900o12.getClass();
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJI((String) obj, null, new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 745));
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS157S0200000_22.l1).element;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("ProductVideoAnchorTool@41da.tryUploadFrameResult$1");
    }

    public static final void accept$12(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        Object cutsameDataItem;
        C1C7U.LIZ("TemplateFetcher@4ce9.requestMergedTemplateDetail$1");
        MergedTemplateListResponseWrapper mergedTemplateListResponseWrapper = (MergedTemplateListResponseWrapper) obj;
        if (mergedTemplateListResponseWrapper.status == 0) {
            ArrayList<UlikeMergedTemplateStruct> arrayList = mergedTemplateListResponseWrapper.data.templateList;
            ArrayList arrayList2 = new ArrayList();
            for (UlikeMergedTemplateStruct ulikeMergedTemplateStruct : arrayList) {
                int i = ulikeMergedTemplateStruct.templateType;
                Integer num = null;
                if (i == EnumC1412640mre.MV_TEMPLATE.getValue()) {
                    if (ulikeMergedTemplateStruct.mvData != null) {
                        MvThemeData mvThemeData = new MvThemeData();
                        UrlModel urlModel = new UrlModel(new ArrayList(), null, null, null, null);
                        List<String> urlList = ulikeMergedTemplateStruct.mvData.getFile_url().getUrlList();
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(urlList, 10));
                        for (String str : urlList) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(ulikeMergedTemplateStruct.mvData.getFile_url().getUri());
                            arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        urlModel.setUrlList(arrayList3);
                        urlModel.setUri(ulikeMergedTemplateStruct.mvData.getMd5());
                        UrlModel urlModel2 = new UrlModel(new ArrayList(), null, null, null, null);
                        List<String> urlList2 = ulikeMergedTemplateStruct.mvData.getIcon_url().getUrlList();
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(urlList2, 10));
                        for (String str2 : urlList2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append(ulikeMergedTemplateStruct.mvData.getIcon_url().getUri());
                            arrayList4.add(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        urlModel2.setUrlList(arrayList4);
                        MvEffect mvEffect = ulikeMergedTemplateStruct.mvData;
                        mvEffect.setFile_url(urlModel);
                        mvEffect.setIcon_url(urlModel2);
                        mvThemeData.LJI(new Effect(mvEffect));
                        mvThemeData.urlPrefixList = ulikeMergedTemplateStruct.urlPrefix;
                        mvThemeData.sourceId = 2;
                        cutsameDataItem = mvThemeData;
                        arrayList2.add(cutsameDataItem);
                    }
                } else if (i == EnumC1412640mre.CUT_SAME.getValue() || i == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                    TemplateResponseItem templateResponseItem = ulikeMergedTemplateStruct.cutsameInfo;
                    if (templateResponseItem != null) {
                        String str3 = ulikeMergedTemplateStruct.media_id;
                        boolean z = ulikeMergedTemplateStruct.isCommerceMusic;
                        String str4 = ulikeMergedTemplateStruct.region;
                        String str5 = ulikeMergedTemplateStruct.videoRatio;
                        int i2 = ulikeMergedTemplateStruct.templateType;
                        int size = 0;
                        try {
                            if (i2 == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                                List<TemplateSlot> second = (List) TemplateResponseItem.LIZ(templateResponseItem.extra).getFirst();
                                Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(second);
                                if (pairLIZ.getFirst().booleanValue()) {
                                    second = pairLIZ.getSecond();
                                }
                                if (C0AY1.LIZ(true)) {
                                    size = ((ArrayList) C531620Kt6.LIZ(second)).size();
                                } else {
                                    size = second.size();
                                }
                            } else {
                                int i3 = C0L8G.LIZ;
                                size = C0L8G.LIZ(templateResponseItem.extra).size();
                            }
                            num = ((TemplateExtra) C7740030o.LIZ().getGson().LJII(templateResponseItem.extra, TemplateExtra.class)).sourceId;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("cutsame extra illegal ");
                            sbLIZ3.append(str3);
                            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        String str6 = templateResponseItem.title;
                        String str7 = templateResponseItem.description;
                        String str8 = templateResponseItem.templateUrl;
                        CutSameVideo cutSameVideo = templateResponseItem.video;
                        String str9 = templateResponseItem.extra;
                        String str10 = templateResponseItem.sdkVersion;
                        String str11 = templateResponseItem.md5;
                        ArrayList<String> arrayList5 = templateResponseItem.musicIds;
                        String str12 = templateResponseItem.musicUrl;
                        boolean z2 = templateResponseItem.musicPostUnavailable;
                        Integer num2 = num;
                        cutsameDataItem = new CutsameDataItem(str3, i2, str6, str7, str8, null, cutSameVideo, 0, 0L, str9, str10, str11, templateResponseItem.iconUrl, num2, arrayList5, templateResponseItem.challengeIds, z, size, str4, str5, templateResponseItem.authorInfo, null, str12, Boolean.valueOf(z2), 0, null, null, new ArrayList(), null, -1.0f, null, null, null, null, false, null, null, null, null, null, null, null, null, null);
                        arrayList2.add(cutsameDataItem);
                    }
                }
            }
            Object objLJJJLL = C13LP.LJJJLL(arrayList2);
            if (objLJJJLL != null) {
                ((Function1) afS157S0200000_22.l0).invoke(objLJJJLL);
            } else {
                ((Function1) afS157S0200000_22.l1).invoke("");
            }
        } else {
            ((Function1) afS157S0200000_22.l1).invoke(mergedTemplateListResponseWrapper.message);
        }
        C1C7U.LIZIZ("TemplateFetcher@4ce9.requestMergedTemplateDetail$1");
    }

    public static final void accept$2(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("EditStickerPanelScene@e11.bindView$3");
        Boolean bool = (Boolean) obj;
        ((C1465200oEQ) afS157S0200000_22.l0).LLLLII(bool.booleanValue());
        if (bool.booleanValue()) {
            C1465200oEQ c1465200oEQ = (C1465200oEQ) afS157S0200000_22.l0;
            C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(c1465200oEQ.LLLILZ());
            c0labLJIILIIL.LIZ(1002, "scene_id");
            c0labLJIILIIL.LJ("creation_id", c1465200oEQ.LLLILZ().getCreationId());
            c0labLJIILIIL.LJ("shoot_way", c1465200oEQ.LLLILZ().mShootWay);
            c0labLJIILIIL.LJ("enter_from", "video_edit_page");
            c0labLJIILIIL.LJ("content_type", c1465200oEQ.LLLILZ().getAvetParameter().getContentType());
            c0labLJIILIIL.LJ("content_source", c1465200oEQ.LLLILZ().getAvetParameter().getContentSource());
            c0labLJIILIIL.LIZ(C1403850mdT.LJIIIIZZ(c1465200oEQ.LLLILZ()), "is_multi_content");
            c0labLJIILIIL.LJ("enter_method", c1465200oEQ.LLJIJIL);
            c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
            c0labLJIILIIL.LIZ(c1465200oEQ.LLLILZ().getPreviewInfo().getPreviewVideoLength(), "creation_duration");
            c0labLJIILIIL.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(c1465200oEQ.LLLILZ()));
            c0labLJIILIIL.LJ("shoot_enter_method", c1465200oEQ.LLLILZ().getShootEnterMethod());
            c0labLJIILIIL.LJ("shoot_enter_from", C1428470nHB.LJJIIJ(c1465200oEQ.LLLILZ(), true));
            c0labLJIILIIL.LIZ(0, "is_photo_editor");
            Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(c1465200oEQ.LLLILZ());
            c0labLJIILIIL.LIZ(pairLJIIJJI.getFirst().intValue(), "video_cnt");
            c0labLJIILIIL.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
            if (c1465200oEQ.LLLILZ().getDraftId() != 0) {
                c0labLJIILIIL.LIZ(c1465200oEQ.LLLILZ().getDraftId(), "draft_id");
            }
            if (!TextUtils.isEmpty(c1465200oEQ.LLLILZ().getNewDraftId())) {
                c0labLJIILIIL.LJ("new_draft_id", c1465200oEQ.LLLILZ().getNewDraftId());
            }
            if (C1428470nHB.LLIIIJ(c1465200oEQ.LLLILZ()) || C1428470nHB.LJLJLJ(c1465200oEQ.LLLILZ())) {
                c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(c1465200oEQ.LLLILZ()));
            }
            InitialMobParams initialMobParams = c1465200oEQ.LLLILZ().creativeModel.initialModel.mobParams;
            if (initialMobParams != null && (str2 = initialMobParams.enterType) != null && str2.length() != 0) {
                c0labLJIILIIL.LJ("enter_type", str2);
            }
            String str3 = c1465200oEQ.LLLILZ().creativeModel.initialModel.dmCameraModel.enterDM;
            if (str3 != null && str3.length() != 0 && str3 != null) {
                c0labLJIILIIL.LJ("enter_dm", str3);
            }
            c1465200oEQ.LLLIZZ(c1465200oEQ.LLLILZ(), c0labLJIILIIL, false);
            C0MJO.LIZIZ(c1465200oEQ.LLLILZ().creativeModel, c0labLJIILIIL);
            c0labLJIILIIL.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(c1465200oEQ.LLLILZ()));
            c0labLJIILIIL.LJ("editorpro_click_from", C1403850mdT.LJ(c1465200oEQ.LLLILZ()));
            c0labLJIILIIL.LIZ(C573570MeZ.LIZJ(c1465200oEQ.LLLILZ()) ? 1 : 0, "is_pic_frame_single_pic_edit");
            if (C573570MeZ.LIZJ(c1465200oEQ.LLLILZ()) || C573570MeZ.LIZIZ(c1465200oEQ.LLLILZ())) {
                c0labLJIILIIL.LIZ(1, "pic_cnt");
                c0labLJIILIIL.LJ("content_type", "multi_photo");
            }
            C1413430msv.LIZLLL(c1465200oEQ.LLLILZ(), c0labLJIILIIL);
            C1413430msv.LIZIZ(c1465200oEQ.LLLILZ(), c0labLJIILIIL);
            C1413430msv.LIZ(c1465200oEQ.LLLILZ(), c0labLJIILIIL);
            c0labLJIILIIL.LIZ(c1465200oEQ.LLLILZ().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
            c0labLJIILIIL.LIZ(C1428470nHB.LJJJZ(c1465200oEQ.LLLILZ()) ? 1 : 0, "is_draft");
            C1413430msv.LJFF(c1465200oEQ.LLLILZ(), c0labLJIILIIL);
            C580270MpN.LJIILIIL(c1465200oEQ.LLLILZ(), c0labLJIILIIL, "click_sticker_entrance");
            if (C1403850mdT.LJFF(c1465200oEQ.LLLILZ())) {
                if (C1444810nhX.LIZJ(c1465200oEQ.LLLILZ().creativeModel.musicBuzModel)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJIILIIL.LJ("music_lyrics_status", str);
            }
            C572310McX.LJ(c1465200oEQ.LLLILZ(), c0labLJIILIIL);
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("click_sticker_entrance", c0labLJIILIIL.LIZ);
        }
        if (bool.booleanValue()) {
            C1447800nmM.LIZIZ((C1465200oEQ) afS157S0200000_22.l0).LLLIILIL((C1465200oEQ) afS157S0200000_22.l0, (C1466910oHB) afS157S0200000_22.l1);
            InterfaceC1406950miT interfaceC1406950miT = ((C1465200oEQ) afS157S0200000_22.l0).LLJJJJ;
            if (interfaceC1406950miT != null) {
                interfaceC1406950miT.Ho();
            }
        } else {
            C1447800nmM.LIZIZ((C1465200oEQ) afS157S0200000_22.l0).LLLLLLLZIL((C1466910oHB) afS157S0200000_22.l1);
            InterfaceC1406950miT interfaceC1406950miT2 = ((C1465200oEQ) afS157S0200000_22.l0).LLJJJJ;
            if (interfaceC1406950miT2 != null) {
                interfaceC1406950miT2.Bl();
            }
        }
        C1C7U.LIZIZ("EditStickerPanelScene@e11.bindView$3");
    }

    public static final void accept$3(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1459620o5Q c1459620o5QOO;
        int i;
        List<? extends MusicModel> list;
        List<? extends MusicModel> list2;
        List<? extends MusicModel> list3;
        C1459620o5Q c1459620o5QOO2;
        boolean z;
        List<? extends MusicModel> list4;
        C1C7U.LIZ("EditToolbarHelper@4d74.getAIRecommendMusic$1");
        C204607154j c204607154j = (C204607154j) obj;
        InterfaceC1460000o62 interfaceC1460000o62LIZIZ = ((C1459590o5N) afS157S0200000_22.l0).LIZIZ();
        Long lValueOf = null;
        int size = 0;
        if (interfaceC1460000o62LIZIZ != null && (c1459620o5QOO2 = interfaceC1460000o62LIZIZ.OO()) != null) {
            if (c204607154j == null || (list4 = c204607154j.LIZ) == null || list4.isEmpty() || (c204607154j != null && c204607154j.LIZJ == 3)) {
                z = false;
            } else {
                z = true;
            }
            c1459620o5QOO2.LIZJ = z;
        }
        C1459590o5N c1459590o5N = (C1459590o5N) afS157S0200000_22.l0;
        c1459590o5N.LIZ.runOnUiThread(new ARunnableS91S0200000_22(c1459590o5N, (View) afS157S0200000_22.l1, 26));
        InterfaceC1460000o62 interfaceC1460000o62LIZIZ2 = ((C1459590o5N) afS157S0200000_22.l0).LIZIZ();
        if (interfaceC1460000o62LIZIZ2 != null && (c1459620o5QOO = interfaceC1460000o62LIZIZ2.OO()) != null && c1459620o5QOO.LIZJ && c204607154j != null && c204607154j.LIZIZ >= 0) {
            VideoPublishEditModel videoPublishEditModel = ((C1459590o5N) afS157S0200000_22.l0).LIZIZ;
            StringBuilder sb = new StringBuilder();
            if (c204607154j != null && (list2 = c204607154j.LIZ) != null && !list2.isEmpty() && c204607154j != null && (list3 = c204607154j.LIZ) != null) {
                boolean z2 = false;
                for (MusicModel musicModel : list3) {
                    if (z2) {
                        sb.append(",");
                    }
                    sb.append(musicModel.getMusicId());
                    z2 = true;
                }
            }
            C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
            c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0labLJIILIIL.LJ("enter_from", "video_edit_page");
            if (c204607154j != null && (list = c204607154j.LIZ) != null) {
                size = list.size();
            }
            c0labLJIILIIL.LIZ(size, "music_upload_num");
            if (c204607154j != null) {
                lValueOf = Long.valueOf(c204607154j.LIZIZ);
            }
            c0labLJIILIIL.LIZLLL(lValueOf, "music_upload_duration");
            c0labLJIILIIL.LJ("music_id_list", sb.toString());
            if (c204607154j != null) {
                i = c204607154j.LIZJ;
            } else {
                i = 2;
            }
            c0labLJIILIIL.LIZ(i, "music_rec_type");
            C20684815ws.LJIILLIIL("music_upload_done", c0labLJIILIIL.LIZ);
            if (c204607154j != null) {
                c204607154j.LIZIZ = -1L;
            }
        }
        C1C7U.LIZIZ("EditToolbarHelper@4d74.getAIRecommendMusic$1");
    }

    public static final void accept$4(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("CustomStickerExtractor@41db.start$2");
        ((InterfaceC1432820nOC) afS157S0200000_22.l0).onFinish(false);
        ((C1432850nOF) afS157S0200000_22.l1).getClass();
        C2265108u9.LIZJ();
        ((C1432850nOF) afS157S0200000_22.l1).LJ();
        C1C7U.LIZIZ("CustomStickerExtractor@41db.start$2");
    }

    public static final void accept$5(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("RecommendEffectRequestApi@b399.getRecommendEffectsFromServer$1");
        RecommendEffectResponse recommendEffectResponse = (RecommendEffectResponse) obj;
        Integer num = recommendEffectResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            ((Function1) afS157S0200000_22.l0).invoke(recommendEffectResponse);
        } else {
            ((Function1) afS157S0200000_22.l1).invoke(String.valueOf(recommendEffectResponse.statusCode));
        }
        C1C7U.LIZIZ("RecommendEffectRequestApi@b399.getRecommendEffectsFromServer$1");
    }

    public static final void accept$6(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("ImageSynthesisTask@c8d1.compileNLE$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image publish presenter compile Error throwable = ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_image_exception_publish_error_fix", true, false)) {
            RunnableC1432010nMt runnableC1432010nMt = (RunnableC1432010nMt) afS157S0200000_22.l0;
            runnableC1432010nMt.LJ(new AwS423S0200000_22(runnableC1432010nMt, (RunnableC1432010nMt) afS157S0200000_22.l1, (o<Unit>) 78));
        }
        C1C7U.LIZIZ("ImageSynthesisTask@c8d1.compileNLE$3");
    }

    public static final void accept$7(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("RecentMusicRepository@7dc0.recentMusicList$2$1");
        MusicList musicList = (MusicList) obj;
        List<Music> list = musicList.musicList;
        if (list != null && !list.isEmpty()) {
            for (Music music : musicList.musicList) {
                Map<String, MusicModel> map = C1421530n5z.LLILLL;
                String idStr = music.getIdStr();
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                musicModelConvertToMusicModel.setLogPbOrNot(musicList.logPb);
                map.put(idStr, musicModelConvertToMusicModel);
            }
        }
        List list2 = (List) afS157S0200000_22.l0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (C1421530n5z.LLILLL.containsKey(((LruCacheMusicModel) obj2).musicId)) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list3 = (List) pair.getFirst();
        for (LruCacheMusicModel lruCacheMusicModel : (List) pair.getSecond()) {
            C1411940mqW c1411940mqW = C1421530n5z.LLILLJJLI;
            String str = lruCacheMusicModel.musicId;
            c1411940mqW.LIZIZ.remove(str);
            c1411940mqW.LIZ.remove(str);
        }
        C09AJ c09aj = (C09AJ) afS157S0200000_22.l1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            MusicModel musicModel = C1421530n5z.LLILLL.get(((LruCacheMusicModel) it2.next()).musicId);
            if (musicModel != null) {
                arrayList3.add(musicModel);
            }
        }
        c09aj.onNext(arrayList3);
        C1C7U.LIZIZ("RecentMusicRepository@7dc0.recentMusicList$2$1");
    }

    public static final void accept$8(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("SocialEditRootScene@8880.initObserver$4$1");
        C1455250nyN c1455250nyN = (C1455250nyN) afS157S0200000_22.l0;
        C1404120mdu c1404120mdu = (C1404120mdu) afS157S0200000_22.l1;
        c1455250nyN.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!C1428470nHB.LJJLIIIJ(c1455250nyN.getEditModel()) ? 1 : 0, "is_fast_import");
        c0lab.LJFF("fast_import_depend_hw_decode", ((ImportVideoInfo) obj).getFastImportDependHW());
        c0lab.LIZ(c1404120mdu.LIZ, "video_decode_type");
        c0lab.LIZ(c1404120mdu.LIZIZ, "video_decode_hw_switch_sw");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_video_decode_info", c0lab.LIZ);
        C1C7U.LIZIZ("SocialEditRootScene@8880.initObserver$4$1");
    }

    public static final void accept$9(AfS157S0200000_22 afS157S0200000_22, Object obj) {
        C1C7U.LIZ("WaitUploadParamsTask@fa8c.startTimeOutTask$1");
        C1436180nTc c1436180nTc = (C1436180nTc) afS157S0200000_22.l0;
        if (!c1436180nTc.LLJ) {
            c1436180nTc.LJIILJJIL(new C1436190nTd(null, true, 1), (C1431070nLN) afS157S0200000_22.l1);
        } else {
            C11JF c11jf = c1436180nTc.LLJI;
            if (c11jf != null && !c11jf.isDisposed()) {
                C11JF c11jf2 = c1436180nTc.LLJI;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                c1436180nTc.LLJI = null;
            }
        }
        C1C7U.LIZIZ("WaitUploadParamsTask@fa8c.startTimeOutTask$1");
    }

    public AfS157S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
