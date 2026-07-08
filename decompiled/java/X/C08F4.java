package X;

import java.security.MessageDigest;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08F4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F4 {
    public static final String LIZ(String str) {
        return C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(181));
    }
}
