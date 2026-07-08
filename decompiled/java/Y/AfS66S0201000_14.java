package Y;

import X.C09JN;
import X.C0Y3I;
import X.C0YA1;
import X.C0YNY;
import X.C0Z2Z;
import X.C13BV;
import X.C1516540pZE;
import X.C15438062q;
import X.C1C7U;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2244081CsQ;
import X.C869590Y9l;
import X.C875230YVd;
import X.C879170YeJ;
import X.C901060ZWm;
import X.C904270Zdh;
import X.C912320Zqg;
import X.EnumC2244051CsN;
import X.InterfaceC874680YTa;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.im.common.model.PublicResourceResponse;
import com.ss.android.ugc.aweme.im.common.model.SingleResourceRefreshResp;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class AfS66S0201000_14 implements C09JN {
    public final int $t;
    public int i2;
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.im.message.template.component.TextComponent, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static final void accept$0(AfS66S0201000_14 afS66S0201000_14, Object obj) {
        Long lLJIILIIL;
        SingleResourceRefreshResp singleResourceRefreshResp;
        long j;
        long jLongValue;
        long jMin;
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
        C1C7U.LIZ("MessageRefreshWorkerV2Impl@a39d.fireResRefreshRequest$4");
        PublicResourceResponse publicResourceResponse = (PublicResourceResponse) obj;
        if (afS66S0201000_14.i2 == ((C912320Zqg) afS66S0201000_14.l0).LJIIJJI.get()) {
            C912320Zqg c912320Zqg = (C912320Zqg) afS66S0201000_14.l0;
            List<C869590Y9l> list2 = (List) afS66S0201000_14.l1;
            c912320Zqg.getClass();
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
                    BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                    if (baseTemplateLIZ instanceof AwemeCardTemplate) {
                        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) baseTemplateLIZ;
                        Long lLJFF = C912320Zqg.LJFF(c869590Y9l, awemeCardTemplate);
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
                        jMin = Long.MAX_VALUE;
                    } else {
                        if (baseTemplateLIZ instanceof StickerTemplate) {
                            StickerTemplate stickerTemplate = (StickerTemplate) baseTemplateLIZ;
                            String str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_id");
                            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && (singleResourceRefreshResp = (SingleResourceRefreshResp) linkedHashMap.get(Long.valueOf(lLJIILIIL.longValue()))) != null) {
                                Long l2 = singleResourceRefreshResp.ttl;
                                if (l2 != null) {
                                    jLongValue = l2.longValue();
                                    j = Long.MAX_VALUE;
                                } else {
                                    j = Long.MAX_VALUE;
                                    jLongValue = 0;
                                }
                                jMin = Math.min(j, jLongValue);
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
                                    stickerCardFallbackInfoComponent = new StickerCardFallbackInfoComponent(ImageComponent.LIZ(stickerTemplate.fallbackInfo.placeholder, baseFooterComponent, iconTypeComponentLIZIZ, 31));
                                }
                                c869590Y9l.setContentPB(StickerTemplate.LIZIZ(stickerTemplate, imageComponentLIZ, stickerCardFallbackInfoComponent, baseFooterComponent, baseFooterComponent, baseFooterComponent, baseFooterComponent, 32764).encode());
                                z = true;
                            }
                        }
                        z = false;
                        jMin = Long.MAX_VALUE;
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
            Iterator it2 = ((List) afS66S0201000_14.l1).iterator();
            while (it2.hasNext()) {
                C901060ZWm.LIZLLL((C869590Y9l) it2.next(), false);
            }
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJI(new C0Y3I("refresh resources"), arrayList);
            List list7 = (List) afS66S0201000_14.l1;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list7) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() == obj2) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            if (!arrayList2.isEmpty()) {
                C875230YVd.LIZJ(new C0Y3I("refresh resources clear tag"), arrayList2);
            }
            ((C912320Zqg) afS66S0201000_14.l0).LJI().LJII((List) afS66S0201000_14.l1);
            ((C912320Zqg) afS66S0201000_14.l0).LJIIJ.set(false);
            if (!((C912320Zqg) afS66S0201000_14.l0).LJI().LJFF()) {
                ((C912320Zqg) afS66S0201000_14.l0).LJIIIIZZ.onNext(1);
            }
        }
        C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.fireResRefreshRequest$4");
    }

    public static final void accept$1(AfS66S0201000_14 afS66S0201000_14, Object obj) {
        C1C7U.LIZ("MessageRefreshWorkerV2Impl@a39d.fireResRefreshRequest$5");
        if (afS66S0201000_14.i2 == ((C912320Zqg) afS66S0201000_14.l0).LJIIJJI.get()) {
            C912320Zqg.LJII((List) afS66S0201000_14.l1, false);
            ((C912320Zqg) afS66S0201000_14.l0).LJIIJ.set(false);
        }
        C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.fireResRefreshRequest$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS66S0201000_14(int i, int i2, C912320Zqg c912320Zqg, List<? extends C869590Y9l> list) {
        this.$t = list;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c912320Zqg;
    }
}
