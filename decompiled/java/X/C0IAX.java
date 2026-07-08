package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionTextMessage;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAX implements InterfaceC912670ZrF {
    public static final C0IAX LL = new C0IAX();

    public static final AttachmentTypeComponent LIZ(EnumC462090IAd enumC462090IAd) {
        int i = C462080IAc.LIZ[enumC462090IAd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT;
                }
                return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_REPOST;
            }
            return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_FAVOURITE;
        }
        return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_LIKE;
    }

    @Override // X.InterfaceC912670ZrF
    public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
        long j;
        long jLongValue;
        UrlModel cover = null;
        if (aweme == null) {
            return null;
        }
        BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
        referenceVideo.setRefVideoId(aweme.getAid());
        referenceVideo.setRefVideoAuthorUid(AwemeExtKt.getAuthorUid(aweme));
        referenceVideo.setRefVideoAuthorSecUid(AwemeExtKt.getSecAuthorUid(aweme));
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        }
        referenceVideo.setRefVideoCoverUrl(cover);
        referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
        referenceVideo.setRefVideoIsStory(aweme.getIsTikTokStory());
        Story story = aweme.getStory();
        if (story != null) {
            j = story.expiredAt;
        } else {
            j = 0;
        }
        referenceVideo.setExpireAt(j);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        referenceVideo.setOriginAuthorId(jLongValue);
        return referenceVideo;
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJJJJ(Serializable serializable, EnumC462090IAd enumC462090IAd) {
        BaseContent.ReferenceVideo referenceVideo;
        long jLongValue;
        List<String> urlList;
        Long lLJIILIIL;
        AttachmentComponent attachmentComponent = null;
        if ((serializable instanceof BaseContent.ReferenceVideo) && (referenceVideo = (BaseContent.ReferenceVideo) serializable) != null) {
            AttachmentTypeComponent attachmentTypeComponentLIZ = LIZ(enumC462090IAd);
            String refVideoId = referenceVideo.getRefVideoId();
            if (refVideoId == null) {
                refVideoId = "";
            }
            String refVideoAuthorUid = referenceVideo.getRefVideoAuthorUid();
            if (refVideoAuthorUid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(refVideoAuthorUid)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            long originAuthorId = referenceVideo.getOriginAuthorId();
            UrlModel refVideoCoverUrl = referenceVideo.getRefVideoCoverUrl();
            if (refVideoCoverUrl == null || (urlList = refVideoCoverUrl.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            attachmentComponent = new AttachmentComponent(attachmentTypeComponentLIZ, refVideoId, jLongValue, originAuthorId, new UrlStructComponent(urlList), referenceVideo.getRefVideoAwemeType(), referenceVideo.getRefVideoIsStory(), referenceVideo.getFallbackStatusComponent(), referenceVideo.getExpireAt());
        }
        return attachmentComponent;
    }

    public static BaseContent LIZJ(LightInteractionCommonResource lightInteractionCommonResource, BaseContent.ReferenceVideo referenceVideo, Integer num) {
        LightInteractionTextMessage textMsg;
        UrlModel urlModel;
        UrlModel urlModel2;
        long jLongValue;
        String messageType = lightInteractionCommonResource.getMessageType();
        if (Intrinsics.LJFF(messageType, String.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_EMOJI.getValue()))) {
            LightInteractionGiphyMessage giphyMessage = lightInteractionCommonResource.getGiphyMessage();
            if (giphyMessage == null) {
                return null;
            }
            C0I0B.LJFF.LIZJ();
            Context contextLIZ = C894660Z7w.LIZ();
            GifContent gifContent = new GifContent();
            Integer num2 = giphyMessage.width;
            if (num2 != null) {
                gifContent.setWidth(num2.intValue());
                Integer num3 = giphyMessage.height;
                if (num3 != null) {
                    gifContent.setHeight(num3.intValue());
                    if (giphyMessage.url == null) {
                        urlModel = null;
                    } else {
                        urlModel = new UrlModel();
                        urlModel.setUrlList(Collections.singletonList(giphyMessage.url));
                    }
                    gifContent.setUrl(urlModel);
                    if (giphyMessage.staticUrl == null) {
                        urlModel2 = null;
                    } else {
                        urlModel2 = new UrlModel();
                        urlModel2.setUrlList(Collections.singletonList(giphyMessage.staticUrl));
                    }
                    gifContent.setStaticUrl(urlModel2);
                    Integer num4 = giphyMessage.aweType;
                    if (num4 != null) {
                        gifContent.type = num4.intValue();
                        String str = giphyMessage.imageType;
                        if (str != null) {
                            gifContent.setImageType(str);
                            String string = giphyMessage.displayName;
                            if (string == null) {
                                string = contextLIZ.getString(2131835699);
                            }
                            gifContent.setDisplayName(string);
                            String str2 = giphyMessage.imageId;
                            long jLongValue2 = 0;
                            if (str2 != null) {
                                Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                                if (lLJIILIIL != null) {
                                    jLongValue = lLJIILIIL.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                gifContent.setImageId(jLongValue);
                            }
                            gifContent.setStickerId(giphyMessage.stickerId);
                            String str3 = giphyMessage.packageId;
                            if (str3 != null) {
                                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str3);
                                if (lLJIILIIL2 != null) {
                                    jLongValue2 = lLJIILIIL2.longValue();
                                }
                                gifContent.setPackageId(jLongValue2);
                            }
                            String str4 = giphyMessage.version;
                            if (str4 != null) {
                                gifContent.setVersion(str4);
                            }
                            gifContent.setRefVideo(referenceVideo);
                            if (num == null) {
                                num = 0;
                            }
                            gifContent.setReferenceScene(num);
                            return gifContent;
                        }
                    }
                }
            }
        } else {
            if (!Intrinsics.LJFF(messageType, String.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_TEXT.getValue())) || (textMsg = lightInteractionCommonResource.getTextMsg()) == null) {
                return null;
            }
            TextContent.Companion companion = TextContent.Companion;
            String str5 = textMsg.text;
            if (str5 != null) {
                TextContent textContentObtain = companion.obtain(str5, null, null, null, null, null);
                textContentObtain.setRefVideo(referenceVideo);
                return textContentObtain;
            }
        }
        return null;
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJIIIZ(Aweme aweme, User user, EnumC462090IAd enumC462090IAd) {
        long j;
        List<String> urlList;
        long j2;
        UrlModel cover;
        String uid;
        if (aweme == null) {
            return null;
        }
        AttachmentTypeComponent attachmentTypeComponentLIZ = LIZ(enumC462090IAd);
        String aid = aweme.getAid();
        long jLongValue = -1;
        if (user != null && (uid = user.getUid()) != null) {
            j = CastLongProtector.parseLong(uid);
        } else {
            j = -1;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        }
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        UrlStructComponent urlStructComponent = new UrlStructComponent(urlList);
        int awemeType = aweme.getAwemeType();
        boolean isTikTokStory = aweme.getIsTikTokStory();
        FallbackStatusComponent fallbackStatusComponent = FallbackStatusComponent.UNKNOWN;
        Story story = aweme.getStory();
        if (story != null) {
            j2 = story.expiredAt;
        } else {
            j2 = 0;
        }
        return new AttachmentComponent(attachmentTypeComponentLIZ, aid, j, jLongValue, urlStructComponent, awemeType, isTikTokStory, fallbackStatusComponent, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate LJFF(com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r39, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r40, java.lang.String r41, java.lang.String r42, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r43) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IAX.LJFF(com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent):com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate");
    }
}
