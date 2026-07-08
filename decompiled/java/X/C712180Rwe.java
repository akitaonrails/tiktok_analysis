package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712180Rwe {
    public static boolean LIZ(StoryImmersiveFeedItem storyImmersiveFeedItem, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof StoryImmersiveFeedItem)) {
            return false;
        }
        return Intrinsics.LJFF(C729510SjV.LJIIIZ(storyImmersiveFeedItem.getStoryCollection()), C729510SjV.LJIIIZ(((StoryImmersiveFeedItem) interfaceC1891350zJl).getStoryCollection()));
    }
}
