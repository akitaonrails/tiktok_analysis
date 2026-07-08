package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072200e0Y {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (Intrinsics.LJFF(str, "android.permission.READ_CONTACTS")) {
            return Keva.getRepo("FriendsSharePreferences").getBoolean("read_contact_denied", false);
        }
        return Keva.getRepo("permission_store").getBoolean(str, false);
    }
}
