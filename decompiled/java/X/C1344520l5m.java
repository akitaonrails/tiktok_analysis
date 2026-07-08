package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0l5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344520l5m {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Comment comment, boolean z) {
        Aweme aliasAweme;
        boolean z2;
        if (comment != null) {
            aliasAweme = comment.getAliasAweme();
        } else {
            aliasAweme = null;
        }
        if (aliasAweme != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("enable_video_reply", 0) != 1 || z2 || !z || (comment != null && C1351950lHl.LJI(comment))) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Comment comment, Aweme aweme) {
        Aweme aliasAweme;
        boolean z;
        Boolean boolValueOf = null;
        if (comment != null) {
            aliasAweme = comment.getAliasAweme();
        } else {
            aliasAweme = null;
        }
        if (aliasAweme != null && !comment.getIsFromCollect()) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(aweme));
        }
        if (!C1343700l4S.LIZ() || z || boolValueOf == null || boolValueOf.booleanValue() || (comment != null && C1351950lHl.LJI(comment))) {
            return false;
        }
        return true;
    }
}
