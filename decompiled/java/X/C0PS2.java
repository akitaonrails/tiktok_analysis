package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PS2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PS2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "video") && !Intrinsics.LJFF(str, EnumC669620QOi.PHOTO.getTabName()) && !Intrinsics.LJFF(str, "visual_search") && !Intrinsics.LJFF(str, "smart_search") && !Intrinsics.LJFF(str, "smart_search_title")) {
            return false;
        }
        return true;
    }
}
