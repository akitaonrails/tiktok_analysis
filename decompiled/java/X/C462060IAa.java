package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX INFO: renamed from: X.0IAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C462060IAa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AttachmentTypeComponent.values().length];
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_STORY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_LIKE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_FAVOURITE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_REPOST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_REPOST.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_GAME_CHALLENGE_GAMEPLAY.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_FEED.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_FEED_LIKE_HISTORY.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[AttachmentTypeComponent.ATTACHMENT_TYPE_THOUGHT.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        LIZ = iArr;
    }
}
