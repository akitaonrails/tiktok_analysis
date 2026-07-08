package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549680Lh8 {
    public static AIGC.AICreationSceneName.Custom LIZ(String str) {
        String lowerCase = "";
        if (str == null) {
            str = "";
        }
        if (!Intrinsics.LJFF(str, "NO_NEED")) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        }
        return new AIGC.AICreationSceneName.Custom(lowerCase);
    }
}
