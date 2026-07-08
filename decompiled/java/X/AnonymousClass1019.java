package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.1019, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1019 {
    public static boolean LIZ(AnonymousClass1018 anonymousClass1018, Object obj, String str, String str2) {
        boolean zShouldShow = anonymousClass1018.shouldShow(obj);
        if (zShouldShow) {
            C722430SVl.LIZ.invoke("tuc_condition_should_show", C2097608Jq.LJIIIIZZ(new Pair("scenario", str), new Pair("type", str2)));
        }
        return zShouldShow;
    }
}
