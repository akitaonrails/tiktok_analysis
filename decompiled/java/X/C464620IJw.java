package X;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464620IJw {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Boolean bool, boolean z, String str, String str2) {
        if (!C464610IJv.LIZ() || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || z) {
            return false;
        }
        if (Intrinsics.LJFF("live_cover", str2) && Intrinsics.LJFF("live_merge", str)) {
            return true;
        }
        if (Intrinsics.LJFF("live_cell", str2) && Intrinsics.LJFF("homepage_hot", str)) {
            return true;
        }
        if (Intrinsics.LJFF("video_head", str2) && Intrinsics.LJFF("homepage_hot", str)) {
            return true;
        }
        if (Intrinsics.LJFF("video_head", str2) && Intrinsics.LJFF("homepage_follow", str)) {
            return Intrinsics.LJFF(bool, Boolean.TRUE);
        }
        if (Intrinsics.LJFF("live_cover", str2) && Intrinsics.LJFF("message", str)) {
            return Intrinsics.LJFF(bool, Boolean.TRUE);
        }
        if (Intrinsics.LJFF("live_cover", str2) && Intrinsics.LJFF("homepage_follow", str)) {
            return Intrinsics.LJFF(bool, Boolean.TRUE);
        }
        if (Intrinsics.LJFF("homepage_follow", str2) && Intrinsics.LJFF("follow_recommend", str)) {
            return true;
        }
        if (!Intrinsics.LJFF("message", str2) || !Intrinsics.LJFF("follow_recommend", str)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(C19EG c19eg, String str, String str2, boolean z, boolean z2) {
        if (c19eg != null && C464610IJv.LIZ() && C500260Jjc.LJJII(c19eg.getRequestedOrientation()) && LIZ(Boolean.valueOf(z2), z, str, str2)) {
            return true;
        }
        return false;
    }
}
