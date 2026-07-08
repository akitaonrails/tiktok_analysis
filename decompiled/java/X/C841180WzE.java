package X;

import com.bytedance.helios.network.NetworkComponent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841180WzE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (a0.LJJLIIIJJIZ(str, '$')) {
            String strSubstring = str.substring(1);
            if (Intrinsics.LJFF(strSubstring, "did")) {
                return NetworkComponent.INSTANCE.deviceIdOrNull();
            }
            if (Intrinsics.LJFF(strSubstring, "install_id")) {
                return NetworkComponent.INSTANCE.installIdOrNull();
            }
            return str;
        }
        return str;
    }
}
