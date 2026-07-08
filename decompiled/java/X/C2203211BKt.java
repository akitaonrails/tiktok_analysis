package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.socialblob.SocialInteractionBlobProto;
import com.ss.android.ugc.aweme.shortvideo.sticker.social.SocialInteractionBlobModel;

/* JADX INFO: renamed from: X.1BKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203211BKt {
    public static final C2223001BzW LIZ(Aweme aweme) {
        String str;
        SocialInteractionBlobModel socialInteractionBlobModel = new SocialInteractionBlobModel(null);
        SocialInteractionBlobProto socialInteractionBlob = aweme.getSocialInteractionBlob();
        if (socialInteractionBlob != null && (str = socialInteractionBlob.auxiliaryModelContent) != null && str.length() != 0) {
            try {
                socialInteractionBlobModel.setSocialBlob(C1C1T.ADAPTER.decode(Base64.decode(str, 0)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C1T c1c1t = socialInteractionBlobModel.socialBlob;
        if (c1c1t == null) {
            return null;
        }
        return c1c1t.shared_comment_blob;
    }
}
