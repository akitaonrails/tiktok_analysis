package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06N7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06N7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(69));

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return ((Keva) LIZ.getValue()).getStringSet("key_notice_had_ack", C08CX.INSTANCE).contains(str);
    }
}
