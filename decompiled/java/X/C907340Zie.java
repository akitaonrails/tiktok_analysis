package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Zie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907340Zie {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Keva keva, String str) {
        if (1 != keva.getInt("search_sdk_version", -1)) {
            keva.storeInt("search_sdk_version", 1);
            keva.erase(str);
        }
    }
}
