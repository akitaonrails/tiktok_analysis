package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.113I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113I {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str) {
        return Intrinsics.LJFF("Favorite", str);
    }

    public static final boolean LIZIZ(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "motion", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "sticker", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(String str) {
        return Intrinsics.LJFF("time", str);
    }

    public static final boolean LJ(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "trans", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(String str) {
        return Intrinsics.LJFF("video_anim", str);
    }
}
