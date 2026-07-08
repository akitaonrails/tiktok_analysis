package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.socialblob.SocialInteractionBlobProto;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.utils.SocialInteractionBlobModel;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609960rzu {
    public static final C1610010rzz LIZ(Aweme aweme) {
        String str;
        boolean z = true;
        SocialInteractionBlobModel socialInteractionBlobModel = new SocialInteractionBlobModel(null);
        SocialInteractionBlobProto socialInteractionBlob = aweme.getSocialInteractionBlob();
        if (socialInteractionBlob != null && (str = socialInteractionBlob.auxiliaryModelContent) != null && str.length() != 0) {
            try {
                socialInteractionBlobModel.setSocialBlob(C1C1T.ADAPTER.decode(Base64.decode(str, 0)));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("socialBlobModel: decoded successfully hasShareStoryMeta=");
                C1C1T c1c1t = socialInteractionBlobModel.socialBlob;
                if (c1c1t == null || c1c1t.share_story_metadata == null) {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(" awemeId=");
                sbLIZ.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C1T c1c1t2 = socialInteractionBlobModel.socialBlob;
        if (c1c1t2 == null) {
            return null;
        }
        return c1c1t2.share_story_metadata;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        try {
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs == null || interactStickerStructs.isEmpty()) {
                return false;
            }
            if ((interactStickerStructs instanceof Collection) && interactStickerStructs.isEmpty()) {
                return false;
            }
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 19) {
                    z = true;
                } else {
                    z = false;
                }
                if (interactStickerStruct.getVideoShareInfoStruct() == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        boolean z;
        if (LIZ(aweme) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZIZ = LIZIZ(aweme);
        if (z || zLIZIZ) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        C1609990rzx c1609990rzx;
        C1610010rzz c1610010rzzLIZ = LIZ(aweme);
        if (c1610010rzzLIZ != null && (c1609990rzx = c1610010rzzLIZ.et_info) != null) {
            return Intrinsics.LJFF(c1609990rzx.is_mention, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        C1609990rzx c1609990rzx;
        C1610010rzz c1610010rzzLIZ = LIZ(aweme);
        if (c1610010rzzLIZ != null && (c1609990rzx = c1610010rzzLIZ.et_info) != null) {
            return Intrinsics.LJFF(c1609990rzx.is_own_video, Boolean.TRUE);
        }
        return false;
    }

    public static final int LJFF(Aweme aweme) {
        C1609990rzx c1609990rzx;
        Integer num;
        C1610010rzz c1610010rzzLIZ = LIZ(aweme);
        if (c1610010rzzLIZ != null && (c1609990rzx = c1610010rzzLIZ.et_info) != null && (num = c1609990rzx.media_type) != null) {
            return num.intValue();
        }
        if (!LIZIZ(aweme)) {
            return -1;
        }
        return 3;
    }

    public static final long LJI(Aweme aweme) {
        C1609990rzx c1609990rzx;
        Long l;
        C1610010rzz c1610010rzzLIZ = LIZ(aweme);
        if (c1610010rzzLIZ != null && (c1609990rzx = c1610010rzzLIZ.et_info) != null && (l = c1609990rzx.original_content_author_id) != null) {
            return l.longValue();
        }
        return -1L;
    }
}
