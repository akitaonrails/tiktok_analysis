package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryToDetailSafConfig;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707060RoO {
    public static final StoryToDetailSafConfig LIZ = new StoryToDetailSafConfig(null, false, 0, false, false, false, 63, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(426));

    public static StoryToDetailSafConfig LIZIZ() {
        return (StoryToDetailSafConfig) LIZIZ.getValue();
    }

    public static final boolean LIZ(Fragment fragment) {
        if (LIZIZ().enableAdaptSurfaceViewTransition && C1618440sDa.LIZIZ.LJJIIJ().LJFF(fragment)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(String str) {
        return LIZIZ().storyScene.contains(str);
    }
}
