package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;

/* JADX INFO: renamed from: X.0ZGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C896900ZGm {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[BaseContent.ReferenceSceneType.values().length];
        try {
            iArr[BaseContent.ReferenceSceneType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.NUDGE_LIKE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.NUDGE_FAVOURITE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.NUDGE_REPOST.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.REPLY_TO_REPOST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.QUOTED_PREVIEW.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.RECENT_ACTIVITY_POST.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.RECENT_ACTIVITY_REPOST.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.REPLY_TO_REPOST_NEW.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.SHARED_REPOST.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.STORY_REPLY.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[BaseContent.ReferenceSceneType.SHARE_COMMENT.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC896890ZGl.values().length];
        try {
            iArr2[EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE.ordinal()] = 1;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_FRIENDS_HOMEPAGE_MUF_ENTRANCE.ordinal()] = 2;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE.ordinal()] = 3;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_DETAIL_FEED_MUF_ENTRANCE.ordinal()] = 4;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE.ordinal()] = 5;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_FRIENDS_PROFILE_REPOST_TAB.ordinal()] = 6;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_SHARED_FEED.ordinal()] = 7;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_REPOST_PANEL.ordinal()] = 8;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr2[EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE.ordinal()] = 9;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        LIZIZ = iArr2;
    }
}
