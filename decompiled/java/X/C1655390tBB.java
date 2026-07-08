package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655390tBB {
    public static final int LIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        Integer numValueOf;
        StoryShootModel storyShootModel;
        StoryShootModel storyShootModel2;
        if (shortVideoContext == null) {
            return C0MWV.LIZ(bundle);
        }
        if (C537970L7z.LJFF(shortVideoContext.creativeModel.editorProSchemeModel)) {
            return 1;
        }
        if (C295700BiS.LIZ() && Intrinsics.LJFF("ugc_template", shortVideoContext.shootWay)) {
            return 1;
        }
        String str = shortVideoContext.enterMethod;
        if (!TextUtils.equals(str, "story_fixed_icon") && !TextUtils.equals(str, "pull_down")) {
            return C0MWV.LIZ(bundle);
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        String exitMethod = null;
        if (creativeModel != null && (storyShootModel2 = creativeModel.storyModel) != null) {
            numValueOf = Integer.valueOf(storyShootModel2.getSharedElementTransitionMode());
        } else {
            numValueOf = null;
        }
        C0CF8.LIZ.getClass();
        if (C0CF8.LIZJ() || (numValueOf != null && numValueOf.intValue() == 1)) {
            return 1;
        }
        CreativeModel creativeModel2 = shortVideoContext.creativeModel;
        if (creativeModel2 != null && (storyShootModel = creativeModel2.storyModel) != null) {
            exitMethod = storyShootModel.getExitMethod();
        }
        if (TextUtils.equals(exitMethod, "swipe_up")) {
            return 21;
        }
        return 16;
    }
}
