package X;

import android.text.TextUtils;
import android.util.Size;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9Q {
    public static final C0I9Q LIZIZ = new C0I9Q();
    public final /* synthetic */ C0ZM8<C1322110kVd> LIZ = new C0ZM8<>();

    public static void LIZIZ(LightInteractionCommonResource lightInteractionCommonResource, C1322110kVd c1322110kVd, boolean z, boolean z2) {
        if (!Intrinsics.LJFF(lightInteractionCommonResource.getNeedImageFlip(), Boolean.TRUE)) {
            return;
        }
        if (z2) {
            if (z) {
                C786410Ut5.jc(c1322110kVd, 1.0f);
                return;
            } else {
                C786410Ut5.jc(c1322110kVd, -1.0f);
                return;
            }
        }
        if (z) {
            C786410Ut5.jc(c1322110kVd, -1.0f);
        } else {
            C786410Ut5.jc(c1322110kVd, 1.0f);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.util.Size r18, X.C869590Y9l r19, X.C1322110kVd r20, X.C0I9I r21, com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r22) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I9Q.LIZ(android.util.Size, X.0Y9l, X.0kVd, X.0I9I, com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource):boolean");
    }

    public static boolean LIZJ(Size size, C869590Y9l c869590Y9l, C1322110kVd c1322110kVd, C0I9I c0i9i, LightInteractionCommonResource lightInteractionCommonResource) {
        LightInteractionStickerSetMessage stickerSetMsg;
        ImageComponent imageComponent;
        List<String> list;
        boolean z;
        if (Intrinsics.LJFF(lightInteractionCommonResource.getNeedImageFlip(), Boolean.TRUE)) {
            boolean z2 = !C0ZDX.LJJJJIZL(c869590Y9l);
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ(lightInteractionCommonResource, c1322110kVd, z2, z);
        }
        Integer loopTime = lightInteractionCommonResource.getLoopTime();
        if (loopTime != null && loopTime.intValue() != 0) {
            String messageType = lightInteractionCommonResource.getMessageType();
            if (Intrinsics.LJFF(messageType, String.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_EMOJI.getValue()))) {
                LightInteractionGiphyMessage giphyMessage = lightInteractionCommonResource.getGiphyMessage();
                if (giphyMessage != null) {
                    UrlModel urlModel = new UrlModel();
                    if (C123100dR.LIZ(giphyMessage.staticUrl)) {
                        urlModel.setUrlList(Collections.singletonList(giphyMessage.staticUrl));
                        C0I98.LJFF(c1322110kVd, urlModel, "AnimatedMessageConsumer", null, null, size.getWidth(), size.getHeight(), true, null, C454440Hru.LIZ());
                    } else if (C123100dR.LIZ(giphyMessage.url)) {
                        urlModel.setUrlList(Collections.singletonList(giphyMessage.url));
                        C0I98.LIZ(c1322110kVd, urlModel, "AnimatedMessageConsumer", size.getWidth(), size.getHeight(), true, C454440Hru.LIZ(), C06TB.STABLE_STICKER.getSpace(), 64);
                    } else {
                        GifContent gifContent = (GifContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, GifContent.class);
                        if (gifContent == null) {
                            return false;
                        }
                        if (gifContent.getStaticUrl() != null) {
                            C0I98.LJFF(c1322110kVd, gifContent.getStaticUrl(), "AnimatedMessageConsumer", null, null, size.getWidth(), size.getHeight(), true, null, C454440Hru.LIZ());
                        } else {
                            if (gifContent == null || gifContent.getUrl() == null) {
                                return false;
                            }
                            C0I98.LIZ(c1322110kVd, gifContent.getUrl(), "AnimatedMessageConsumer", size.getWidth(), size.getHeight(), true, C454440Hru.LIZ(), C06TB.STABLE_STICKER.getSpace(), 64);
                        }
                    }
                    return true;
                }
            } else if (Intrinsics.LJFF(messageType, String.valueOf(EnumC868450Y5b.MsgTypeTemplateStickerCard.getValue())) && (stickerSetMsg = lightInteractionCommonResource.getStickerSetMsg()) != null) {
                if (C123100dR.LIZ(stickerSetMsg.staticUrl)) {
                    InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
                    String strValueOf = String.valueOf(stickerSetMsg.stickerId);
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUrlList(Collections.singletonList(stickerSetMsg.staticUrl));
                    C0I98.LJFF(c1322110kVd, imStickerMessageService.LJI(urlModel2, strValueOf), "AnimatedMessageConsumer", null, null, size.getWidth(), size.getHeight(), true, null, C454440Hru.LIZ());
                    return true;
                }
                if (C123100dR.LIZ(stickerSetMsg.stickerUrl)) {
                    InterfaceC454710HsL imStickerMessageService2 = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
                    String strValueOf2 = String.valueOf(stickerSetMsg.stickerId);
                    UrlModel urlModel3 = new UrlModel();
                    urlModel3.setUrlList(Collections.singletonList(stickerSetMsg.stickerUrl));
                    C0I98.LIZ(c1322110kVd, imStickerMessageService2.LJI(urlModel3, strValueOf2), "AnimatedMessageConsumer", size.getWidth(), size.getHeight(), true, C454440Hru.LIZ(), C06TB.STABLE_STICKER.getSpace(), 64);
                    return true;
                }
                StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class);
                InterfaceC454710HsL imStickerMessageService3 = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
                String strValueOf3 = String.valueOf(stickerSetMsg.stickerId);
                UrlModel urlModel4 = new UrlModel();
                if (stickerTemplate != null && (imageComponent = stickerTemplate.imageComponent) != null && (list = imageComponent.urls) != null) {
                    urlModel4.setUrlList(list);
                    C0I98.LIZ(c1322110kVd, imStickerMessageService3.LJI(urlModel4, strValueOf3), "AnimatedMessageConsumer", size.getWidth(), size.getHeight(), true, C454440Hru.LIZ(), C06TB.STABLE_STICKER.getSpace(), 64);
                    return true;
                }
            }
            return false;
        }
        return LIZ(size, c869590Y9l, c1322110kVd, c0i9i, lightInteractionCommonResource);
    }
}
