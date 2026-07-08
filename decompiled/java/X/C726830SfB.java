package X;

import com.ss.android.ugc.aweme.story.experiment.StoryGestureLR;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726830SfB {
    public static final StoryGestureLR LIZ = new StoryGestureLR(0.33f, 0.67f);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(388));

    public static StoryGestureLR LIZJ() {
        return (StoryGestureLR) LIZIZ.getValue();
    }

    public static float LIZ() {
        return ((LIZJ().left <= 0.0f || LIZJ().right <= 0.0f) ? LIZ : LIZJ()).left;
    }

    public static float LIZIZ() {
        return ((LIZJ().left <= 0.0f || LIZJ().right <= 0.0f) ? LIZ : LIZJ()).right;
    }
}
