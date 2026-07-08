package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.068M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C068M {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        String str;
        Map<String, String> localExt;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null) {
            str = localExt.get("is_fake_inline_msg");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "1");
    }
}
