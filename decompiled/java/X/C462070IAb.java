package X;

import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX INFO: renamed from: X.0IAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462070IAb {
    public static AttachmentTypeComponent LIZ(int i) {
        AttachmentTypeComponent attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_STORY;
        if (i != attachmentTypeComponent.getValue()) {
            AttachmentTypeComponent attachmentTypeComponent2 = AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_LIKE;
            if (i != attachmentTypeComponent2.getValue()) {
                AttachmentTypeComponent attachmentTypeComponent3 = AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_FAVOURITE;
                if (i != attachmentTypeComponent3.getValue()) {
                    AttachmentTypeComponent attachmentTypeComponent4 = AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_REPOST;
                    if (i != attachmentTypeComponent4.getValue()) {
                        AttachmentTypeComponent attachmentTypeComponent5 = AttachmentTypeComponent.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION;
                        if (i != attachmentTypeComponent5.getValue()) {
                            AttachmentTypeComponent attachmentTypeComponent6 = AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST;
                            if (i != attachmentTypeComponent6.getValue()) {
                                AttachmentTypeComponent attachmentTypeComponent7 = AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST;
                                if (i != attachmentTypeComponent7.getValue()) {
                                    AttachmentTypeComponent attachmentTypeComponent8 = AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST;
                                    if (i != attachmentTypeComponent8.getValue()) {
                                        AttachmentTypeComponent attachmentTypeComponent9 = AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY;
                                        if (i != attachmentTypeComponent9.getValue()) {
                                            AttachmentTypeComponent attachmentTypeComponent10 = AttachmentTypeComponent.ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY;
                                            if (i != attachmentTypeComponent10.getValue()) {
                                                AttachmentTypeComponent attachmentTypeComponent11 = AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_FEED;
                                                if (i != attachmentTypeComponent11.getValue()) {
                                                    AttachmentTypeComponent attachmentTypeComponent12 = AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY;
                                                    if (i != attachmentTypeComponent12.getValue()) {
                                                        AttachmentTypeComponent attachmentTypeComponent13 = AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_REPOST;
                                                        if (i != attachmentTypeComponent13.getValue()) {
                                                            AttachmentTypeComponent attachmentTypeComponent14 = AttachmentTypeComponent.ATTACHMENT_TYPE_THOUGHT;
                                                            if (i != attachmentTypeComponent14.getValue()) {
                                                                return AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT;
                                                            }
                                                            return attachmentTypeComponent14;
                                                        }
                                                        return attachmentTypeComponent13;
                                                    }
                                                    return attachmentTypeComponent12;
                                                }
                                                return attachmentTypeComponent11;
                                            }
                                            return attachmentTypeComponent10;
                                        }
                                        return attachmentTypeComponent9;
                                    }
                                    return attachmentTypeComponent8;
                                }
                                return attachmentTypeComponent7;
                            }
                            return attachmentTypeComponent6;
                        }
                        return attachmentTypeComponent5;
                    }
                    return attachmentTypeComponent4;
                }
                return attachmentTypeComponent3;
            }
            return attachmentTypeComponent2;
        }
        return attachmentTypeComponent;
    }
}
