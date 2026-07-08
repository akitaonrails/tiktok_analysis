package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.IMNudgeAndStreakService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IB5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IB5 implements InterfaceC1365230ldB {
    public static final C0IB5 LIZIZ = new C0IB5();

    @Override // X.InterfaceC1365230ldB
    public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
        long j;
        long jLongValue;
        if (aweme != null) {
            BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
            referenceVideo.setRefVideoId(aweme.getAid());
            referenceVideo.setRefVideoAuthorUid(AwemeExtKt.getAuthorUid(aweme));
            referenceVideo.setRefVideoAuthorSecUid(AwemeExtKt.getSecAuthorUid(aweme));
            referenceVideo.setRefVideoAwemeType(aweme.getAwemeType());
            referenceVideo.setRefVideoCoverUrl(aweme.getVideo().getCover());
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
        return null;
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentTypeComponent LJIIL(C0IB7 c0ib7) {
        int i = C0IB6.LIZ[c0ib7.ordinal()];
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

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LJFF(Serializable serializable, C0IB7 c0ib7) {
        BaseContent.ReferenceVideo referenceVideo;
        long jLongValue;
        List<String> urlList;
        Long lLJIILIIL;
        AttachmentComponent attachmentComponent = null;
        if ((serializable instanceof BaseContent.ReferenceVideo) && (referenceVideo = (BaseContent.ReferenceVideo) serializable) != null) {
            AttachmentTypeComponent attachmentTypeComponentLJIIL = IMNudgeAndStreakService.LJFF.LJIIL(c0ib7);
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
            attachmentComponent = new AttachmentComponent(attachmentTypeComponentLJIIL, refVideoId, jLongValue, originAuthorId, new UrlStructComponent(urlList), referenceVideo.getRefVideoAwemeType(), referenceVideo.getRefVideoIsStory(), referenceVideo.getFallbackStatusComponent(), referenceVideo.getExpireAt());
        }
        return attachmentComponent;
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LIZJ(Aweme aweme, User user, C0IB7 c0ib7) {
        long jLongValue;
        List<String> urlList;
        long j;
        UrlModel cover;
        String uid;
        if (aweme == null) {
            return null;
        }
        AttachmentTypeComponent attachmentTypeComponentLJIIL = IMNudgeAndStreakService.LJFF.LJIIL(c0ib7);
        String aid = aweme.getAid();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
        long j2 = -1;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        if (user != null && (uid = user.getUid()) != null) {
            j2 = CastLongProtector.parseLong(uid);
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
            j = story.expiredAt;
        } else {
            j = 0;
        }
        return new AttachmentComponent(attachmentTypeComponentLJIIL, aid, j2, jLongValue, urlStructComponent, awemeType, isTikTokStory, fallbackStatusComponent, j);
    }

    @Override // X.InterfaceC1365230ldB
    public final Map<String, String> LJIIIIZZ(SetSticker setSticker, AttachmentComponent attachmentComponent, String str) {
        Long stickerId = setSticker.getStickerId();
        if (stickerId != null) {
            Long lValueOf = Long.valueOf(stickerId.longValue());
            Long setId = setSticker.getSetId();
            if (setId != null) {
                return LJ(lValueOf, Long.valueOf(setId.longValue()), attachmentComponent, str);
            }
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1365230ldB
    public final Map<String, String> LJ(Long l, Long l2, AttachmentComponent attachmentComponent, String str) {
        int i;
        AttachmentTypeComponent attachmentTypeComponent;
        if (IMNudgeAndStreakService.LJFF.LJJIIJ(l, l2)) {
            if (attachmentComponent != null && (attachmentTypeComponent = attachmentComponent.type) != null) {
                i = C0IB6.LIZIZ[attachmentTypeComponent.ordinal()];
            } else {
                i = -1;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C1373350lqH c1373350lqH = new C1373350lqH();
                        c1373350lqH.LIZJ("dm_you_nudge_nickname", Collections.singletonList(str));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c1373350lqH.LIZLLL());
                        linkedHashMap.put("receiver_preview", "dm_nudge_inapp_banner");
                        linkedHashMap.put("quote_preview", "dm_nudge_quoted_sticker_status");
                        return linkedHashMap;
                    }
                    C1373350lqH c1373350lqH2 = new C1373350lqH();
                    c1373350lqH2.LIZJ("dm_activity_nudge_chatPage_repost", Collections.singletonList(str));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1373350lqH2.LIZLLL());
                    linkedHashMap2.put("receiver_preview", "dm_activity_nudge_chatPage_receiver_repost");
                    linkedHashMap2.put("quote_preview", "dm_nudge_quoted_sticker_status");
                    return linkedHashMap2;
                }
                C1373350lqH c1373350lqH3 = new C1373350lqH();
                c1373350lqH3.LIZJ("dm_activity_nudge_chatPage_favorite", Collections.singletonList(str));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(c1373350lqH3.LIZLLL());
                linkedHashMap3.put("receiver_preview", "dm_activity_nudge_chatPage_receiver_favorite");
                linkedHashMap3.put("quote_preview", "dm_nudge_quoted_sticker_status");
                return linkedHashMap3;
            }
            C1373350lqH c1373350lqH4 = new C1373350lqH();
            c1373350lqH4.LIZJ("dm_activity_nudge_chatPage_like", Collections.singletonList(str));
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(c1373350lqH4.LIZLLL());
            linkedHashMap4.put("receiver_preview", "dm_activity_nudge_chatPage_receiver_like");
            linkedHashMap4.put("quote_preview", "dm_nudge_quoted_sticker_status");
            return linkedHashMap4;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("sender_preview", "avatars_in_dm_notif_sender_side"), new Pair("receiver_preview", "avatars_in_dm_notif_recipient_side"), new Pair("quote_preview", "im_big_emoji_msg_hint"));
    }

    @Override // X.InterfaceC1365230ldB
    public final PreviewHintComponent LJJIJIL(long j, long j2, AttachmentTypeComponent attachmentTypeComponent, String str, boolean z, Context context) {
        int i;
        if (!IMNudgeAndStreakService.LJFF.LJJIIJ(Long.valueOf(j), Long.valueOf(j2))) {
            return null;
        }
        if (attachmentTypeComponent == null) {
            i = -1;
        } else {
            i = C0IB6.LIZIZ[attachmentTypeComponent.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new PreviewHintComponent(new TextComponent(context.getString(2131832319, str), null, null), new TextComponent(context.getString(2131831727), null, null), new TextComponent(context.getString(2131831728), null, null), null, null, null, 56);
                }
                return new PreviewHintComponent(new TextComponent(context.getString(2131830855, str), null, null), new TextComponent(context.getString(2131830854), null, null), new TextComponent(context.getString(2131831728), null, null), null, null, null, 56);
            }
            return new PreviewHintComponent(new TextComponent(context.getString(2131830850, str), null, null), new TextComponent(context.getString(2131830852), null, null), new TextComponent(context.getString(2131831728), null, null), null, null, null, 56);
        }
        return new PreviewHintComponent(new TextComponent(context.getString(2131830851, str), null, null), new TextComponent(context.getString(2131830853), null, null), new TextComponent(context.getString(2131831728), null, null), null, null, null, 56);
    }

    @Override // X.InterfaceC1365230ldB
    public final BaseContent.ReferenceVideo LJJIJIIJIL(boolean z, Integer num, String str, String str2, String str3, FallbackStatusComponent fallbackStatusComponent, Long l) {
        List<String> listSingletonList;
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        Long lLJIILIIL;
        BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
        referenceVideo.setRefVideoId(str3);
        referenceVideo.setRefVideoAuthorUid(str2);
        UrlModel urlModel = new UrlModel();
        if (str != null && str.length() != 0) {
            listSingletonList = Collections.singletonList(str);
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        urlModel.setUrlList(listSingletonList);
        referenceVideo.setRefVideoCoverUrl(urlModel);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        referenceVideo.setRefVideoAwemeType(iIntValue);
        referenceVideo.setRefVideoIsStory(z);
        if (fallbackStatusComponent == null) {
            fallbackStatusComponent = FallbackStatusComponent.UNKNOWN;
        }
        referenceVideo.setFallbackStatusComponent(fallbackStatusComponent);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        referenceVideo.setExpireAt(jLongValue);
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        } else {
            jLongValue2 = -1;
        }
        referenceVideo.setOriginAuthorId(jLongValue2);
        return referenceVideo;
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LJJIJ(String str, Integer num, String str2, String str3, AttachmentTypeComponent attachmentTypeComponent, boolean z, FallbackStatusComponent fallbackStatusComponent, Long l) {
        Long lLJIILIIL;
        long jLongValue;
        FallbackStatusComponent fallbackStatusComponent2 = fallbackStatusComponent;
        if (attachmentTypeComponent != null && str3 != null && str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            long jLongValue2 = lLJIILIIL.longValue();
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
            if (lLJIILIIL2 != null) {
                long jLongValue3 = lLJIILIIL2.longValue();
                if (str != null) {
                    UrlStructComponent urlStructComponent = new UrlStructComponent(Collections.singletonList(str));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (fallbackStatusComponent2 == null) {
                            fallbackStatusComponent2 = FallbackStatusComponent.UNKNOWN;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        return new AttachmentComponent(attachmentTypeComponent, str3, jLongValue2, jLongValue3, urlStructComponent, iIntValue, z, fallbackStatusComponent2, jLongValue);
                    }
                }
            }
        }
        return null;
    }
}
