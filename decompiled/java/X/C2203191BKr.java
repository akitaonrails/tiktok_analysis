package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.socialblob.SocialInteractionBlobProto;
import com.ss.android.ugc.aweme.social.proto.SocialInteractionBlobModel;

/* JADX INFO: renamed from: X.1BKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203191BKr {
    public static final SocialInteractionBlobModel LIZ(Aweme aweme) {
        String str;
        SocialInteractionBlobModel socialInteractionBlobModel = new SocialInteractionBlobModel(null);
        SocialInteractionBlobProto socialInteractionBlob = aweme.getSocialInteractionBlob();
        if (socialInteractionBlob != null && (str = socialInteractionBlob.auxiliaryModelContent) != null && str.length() != 0) {
            try {
                socialInteractionBlobModel.setSocialBlob(C1C1T.ADAPTER.decode(Base64.decode(str, 0)));
                return socialInteractionBlobModel;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return socialInteractionBlobModel;
            }
        }
        return socialInteractionBlobModel;
    }
}
