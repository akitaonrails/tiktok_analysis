package X;

import com.ss.android.ugc.aweme.story.experiment.feed.StoryInboxAvatarMorphConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309130C9v {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4106));

    public static final boolean LIZ(String str) {
        StoryInboxAvatarMorphConfig storyInboxAvatarMorphConfig = (StoryInboxAvatarMorphConfig) LIZ.getValue();
        if (storyInboxAvatarMorphConfig == null) {
            return false;
        }
        if (!storyInboxAvatarMorphConfig.supportLowEndDevice) {
            C0CF8.LIZ.getClass();
            if (C0CF8.LIZLLL()) {
                return false;
            }
        }
        return storyInboxAvatarMorphConfig.scenes.contains(str);
    }
}
