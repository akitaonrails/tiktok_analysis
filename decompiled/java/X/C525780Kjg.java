package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525780Kjg {
    static {
        new C525780Kjg();
    }

    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        boolean zLJFF = d4.LJFF(shortVideoContext);
        if ((!Intrinsics.LJFF(shortVideoContext.shootWay, "direct_shoot") && !Intrinsics.LJFF(shortVideoContext.shootWay, "prop_page") && !Intrinsics.LJFF(shortVideoContext.shootWay, "single_song") && !Intrinsics.LJFF(shortVideoContext.shootWay, "collection_music")) || zLJFF) {
            return false;
        }
        return true;
    }
}
