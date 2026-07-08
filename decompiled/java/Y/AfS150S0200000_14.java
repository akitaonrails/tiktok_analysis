package Y;

import X.C09JN;
import X.C0Y3I;
import X.C0YA1;
import X.C0YNY;
import X.C13BV;
import X.C1516540pZE;
import X.C15438062q;
import X.C19292410dm;
import X.C1C7U;
import X.C201955140j;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2244081CsQ;
import X.C385220F8m;
import X.C856290XiV;
import X.C856340Xia;
import X.C857670Xkj;
import X.C869590Y9l;
import X.C879170YeJ;
import X.C904270Zdh;
import X.C912330Zqh;
import X.EnumC2244051CsN;
import X.InterfaceC2257101DWa;
import X.InterfaceC856160XiI;
import X.InterfaceC874680YTa;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.im.common.model.PublicResourceResponse;
import com.ss.android.ugc.aweme.im.common.model.SingleResourceRefreshResp;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.setting.ContentCheckPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class AfS150S0200000_14 implements C09JN {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.im.message.template.component.TextComponent, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5 */
    public static final void accept$0(AfS150S0200000_14 afS150S0200000_14, Object obj) {
        Long lLJIILIIL;
        SingleResourceRefreshResp singleResourceRefreshResp;
        long jLongValue;
        IconTypeComponent iconTypeComponentLIZIZ;
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        boolean z;
        Long lLJIILIIL2;
        SingleResourceRefreshResp singleResourceRefreshResp2;
        List<String> list;
        long jLongValue2;
        SingleResourceRefreshResp singleResourceRefreshResp3;
        long jLongValue3;
        IconTypeComponent iconTypeComponentLIZIZ2;
        ImageComponent imageComponent;
        QuotePicturePreviewComponent quotePicturePreviewComponentLIZ;
        C1C7U.LIZ("MessageRefreshWorkerImpl@e7b.fireResRefreshRequest$4");
        PublicResourceResponse publicResourceResponse = (PublicResourceResponse) obj;
        C912330Zqh c912330Zqh = (C912330Zqh) afS150S0200000_14.l0;
        List<C869590Y9l> list2 = (List) afS150S0200000_14.l1;
        c912330Zqh.getClass();
        ArrayList arrayList = new ArrayList();
        BaseFooterComponent baseFooterComponent = 0;
        if (publicResourceResponse != null && publicResourceResponse.singleResourceRefreshRespList != null) {
            List<SingleResourceRefreshResp> list3 = publicResourceResponse.singleResourceRefreshRespList;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list3, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (SingleResourceRefreshResp singleResourceRefreshResp4 : list3) {
                linkedHashMap.put(singleResourceRefreshResp4.resId, singleResourceRefreshResp4);
            }
            for (C869590Y9l c869590Y9l : list2) {
                Object localCache = c869590Y9l.getLocalCache(501);
                long jMin = Long.MAX_VALUE;
                if (localCache instanceof AwemeCardTemplate) {
                    AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) localCache;
                    Long lLJFF = C912330Zqh.LJFF(c869590Y9l, awemeCardTemplate);
                    if (lLJFF != null && (singleResourceRefreshResp3 = (SingleResourceRefreshResp) linkedHashMap.get(Long.valueOf(lLJFF.longValue()))) != null) {
                        Long l = singleResourceRefreshResp3.ttl;
                        if (l != null) {
                            jLongValue3 = l.longValue();
                        } else {
                            jLongValue3 = 0;
                        }
                        jMin = Math.min(Long.MAX_VALUE, jLongValue3);
                        Integer num = singleResourceRefreshResp3.fallbackIconType;
                        if (num == null || (iconTypeComponentLIZIZ2 = C2244081CsQ.LIZIZ(EnumC2244051CsN.fromValue(num.intValue()))) == null) {
                            iconTypeComponentLIZIZ2 = IconTypeComponent.DEFAULT;
                        }
                        ImageComponent imageComponent2 = awemeCardTemplate.baseVideoComponent.coverImage;
                        if (imageComponent2 != null) {
                            List list4 = singleResourceRefreshResp3.urlList;
                            if (list4 == null) {
                                list4 = C13BV.INSTANCE;
                            }
                            imageComponent = ImageComponent.LIZ(imageComponent2, list4, iconTypeComponentLIZIZ2, 30);
                        } else {
                            List list5 = singleResourceRefreshResp3.urlList;
                            if (list5 == null) {
                                list5 = C13BV.INSTANCE;
                            }
                            imageComponent = new ImageComponent(list5, (String) baseFooterComponent, (ResolutionComponent) baseFooterComponent, (String) baseFooterComponent, iconTypeComponentLIZIZ2, 30);
                        }
                        VideoCoverComponent videoCoverComponentLIZ = VideoCoverComponent.LIZ(awemeCardTemplate.baseVideoComponent, imageComponent);
                        PreviewHintComponent previewHintComponent = awemeCardTemplate.previewHintComponent;
                        QuotePicturePreviewComponent quotePicturePreviewComponent = previewHintComponent.quotePicturePreview;
                        if (quotePicturePreviewComponent != null) {
                            quotePicturePreviewComponentLIZ = QuotePicturePreviewComponent.LIZ(quotePicturePreviewComponent, imageComponent, iconTypeComponentLIZIZ2);
                        } else {
                            quotePicturePreviewComponentLIZ = baseFooterComponent;
                        }
                        PreviewHintComponent previewHintComponentLIZ = PreviewHintComponent.LIZ(previewHintComponent, baseFooterComponent, baseFooterComponent, quotePicturePreviewComponentLIZ, 47);
                        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = awemeCardTemplate.fallbackInfo;
                        c869590Y9l.setContentPB(AwemeCardTemplate.LIZJ(awemeCardTemplate, videoCoverComponentLIZ, VideoCardFallbackInfoComponent.LIZ(videoCardFallbackInfoComponent, ImageComponent.LIZ(videoCardFallbackInfoComponent.image, baseFooterComponent, iconTypeComponentLIZIZ2, 31)), baseFooterComponent, previewHintComponentLIZ, baseFooterComponent, baseFooterComponent, baseFooterComponent, baseFooterComponent, 4028).encode());
                        z = true;
                    }
                    z = false;
                } else {
                    if (localCache instanceof StickerTemplate) {
                        StickerTemplate stickerTemplate = (StickerTemplate) localCache;
                        String str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_id");
                        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && (singleResourceRefreshResp = (SingleResourceRefreshResp) linkedHashMap.get(Long.valueOf(lLJIILIIL.longValue()))) != null) {
                            Long l2 = singleResourceRefreshResp.ttl;
                            if (l2 != null) {
                                jLongValue = l2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            jMin = Math.min(Long.MAX_VALUE, jLongValue);
                            Integer num2 = singleResourceRefreshResp.fallbackIconType;
                            if (num2 == null || (iconTypeComponentLIZIZ = C2244081CsQ.LIZIZ(EnumC2244051CsN.fromValue(num2.intValue()))) == null) {
                                iconTypeComponentLIZIZ = IconTypeComponent.DEFAULT;
                            }
                            ImageComponent imageComponent3 = stickerTemplate.imageComponent;
                            List list6 = singleResourceRefreshResp.urlList;
                            if (list6 == null) {
                                list6 = C13BV.INSTANCE;
                            }
                            ImageComponent imageComponentLIZ = ImageComponent.LIZ(imageComponent3, list6, iconTypeComponentLIZIZ, 30);
                            if (singleResourceRefreshResp.urlList != null) {
                                StickerCardFallbackInfoComponent.Companion.getClass();
                                stickerCardFallbackInfoComponent = StickerCardFallbackInfoComponent.EMPTY_FALLBACK;
                            } else {
                                stickerCardFallbackInfoComponent = new StickerCardFallbackInfoComponent(ImageComponent.LIZ(stickerTemplate.fallbackInfo.placeholder, null, iconTypeComponentLIZIZ, 31));
                            }
                            c869590Y9l.setContentPB(StickerTemplate.LIZIZ(stickerTemplate, imageComponentLIZ, stickerCardFallbackInfoComponent, null, null, null, null, 32764).encode());
                            z = true;
                        }
                    }
                    z = false;
                }
                for (Map.Entry<String, List<C0YA1>> entry : c869590Y9l.getPropertyItemListMap().entrySet()) {
                    String key = entry.getKey();
                    List<C0YA1> value = entry.getValue();
                    if (C879170YeJ.LIZJ(key) && (lLJIILIIL2 = C2095008Iq.LJIILIIL(key.substring(2))) != null && (singleResourceRefreshResp2 = (SingleResourceRefreshResp) linkedHashMap.get(Long.valueOf(lLJIILIIL2.longValue()))) != null && (list = singleResourceRefreshResp2.urlList) != null) {
                        for (C0YA1 c0ya1 : value) {
                            UrlStruct urlStruct = c0ya1.url;
                            C904270Zdh c904270Zdh = new C904270Zdh();
                            c904270Zdh.LIZLLL = urlStruct.uri;
                            C1516540pZE.LIZ(list);
                            c904270Zdh.LJ = list;
                            c904270Zdh.LJFF = urlStruct.width;
                            c904270Zdh.LJI = urlStruct.height;
                            c904270Zdh.LJII = urlStruct.data_size;
                            c0ya1.url = c904270Zdh.build();
                            Long l3 = singleResourceRefreshResp2.ttl;
                            if (l3 != null) {
                                jLongValue2 = l3.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            jMin = Math.min(jMin, jLongValue2);
                            z = true;
                        }
                    }
                }
                if (z) {
                    if (jMin == Long.MAX_VALUE) {
                        jMin = 0;
                    }
                    c869590Y9l.setTtl(jMin);
                    arrayList.add(c869590Y9l);
                }
                baseFooterComponent = 0;
            }
        }
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJI(new C0Y3I("refresh resources"), arrayList);
        ((C912330Zqh) afS150S0200000_14.l0).LJI().LIZJ();
        ((C912330Zqh) afS150S0200000_14.l0).LJIIJ.set(false);
        C1C7U.LIZIZ("MessageRefreshWorkerImpl@e7b.fireResRefreshRequest$4");
    }

    public static final void accept$1(AfS150S0200000_14 afS150S0200000_14, Object obj) {
        C1C7U.LIZ("MessageRefreshWorkerImpl@e7b.fireResRefreshRequest$5");
        C912330Zqh.LJII((List) afS150S0200000_14.l1, false);
        ((C912330Zqh) afS150S0200000_14.l0).LJIIJ.set(false);
        C1C7U.LIZIZ("MessageRefreshWorkerImpl@e7b.fireResRefreshRequest$5");
    }

    public static final void accept$2(AfS150S0200000_14 afS150S0200000_14, Object obj) {
        String uid;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        CreativeModel creativeModel2;
        PrivacySettingModel privacySettingModel2;
        ContentCheckInfo contentCheckInfo2;
        CreativeModel creativeModel3;
        PrivacySettingModel privacySettingModel3;
        ContentCheckInfo contentCheckInfo3;
        C1C7U.LIZ("ContentCheckHelper@fb13.updateUsageCountTodayData$1$1");
        ContentCheckPermissionResponse contentCheckPermissionResponse = (ContentCheckPermissionResponse) obj;
        if (contentCheckPermissionResponse.status_code == 0) {
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" isEligible:");
            sbLIZ.append(contentCheckPermissionResponse.isEligible());
            sbLIZ.append(", usageCountToday:");
            sbLIZ.append(contentCheckPermissionResponse.getUsageCountToday());
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
            Integer usageCountToday = contentCheckPermissionResponse.getUsageCountToday();
            if (usageCountToday != null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) afS150S0200000_14.l0;
                int iIntValue = usageCountToday.intValue();
                if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (privacySettingModel3 = creativeModel3.privacySettingModel) != null && (contentCheckInfo3 = privacySettingModel3.contentCheckInfo) != null) {
                    contentCheckInfo3.usageCountToday = iIntValue;
                }
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) afS150S0200000_14.l0;
            if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (privacySettingModel2 = creativeModel2.privacySettingModel) != null && (contentCheckInfo2 = privacySettingModel2.contentCheckInfo) != null) {
                contentCheckInfo2.isEligible = Intrinsics.LJFF(contentCheckPermissionResponse.isEligible(), Boolean.TRUE);
            }
            InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
            if (interfaceC2257101DWaLIZ != null) {
                uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
            } else {
                uid = null;
            }
            VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) afS150S0200000_14.l0;
            if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null) {
                contentCheckInfo.manualChangeSwitch = C856290XiV.LIZ(uid);
            }
            Function0 function0 = (Function0) afS150S0200000_14.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("ContentCheckHelper@fb13.updateUsageCountTodayData$1$1");
    }

    public static final void accept$3(AfS150S0200000_14 afS150S0200000_14, Object obj) {
        C1C7U.LIZ("TitleSensitivityChecker$SensitiveTitleCheck@eb5b.check$2");
        C201955140j.LIZ("TitleSensitivity  sync data failed");
        ((C856340Xia) afS150S0200000_14.l0).LLIZ.invoke();
        ((C856340Xia) afS150S0200000_14.l0).LJ((InterfaceC856160XiI) afS150S0200000_14.l1);
        C1C7U.LIZIZ("TitleSensitivityChecker$SensitiveTitleCheck@eb5b.check$2");
    }

    public AfS150S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
