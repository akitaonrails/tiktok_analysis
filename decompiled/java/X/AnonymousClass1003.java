package X;

import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.1003, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1003 {
    public static final AnonymousClass1003 LIZ = new AnonymousClass1003();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(619));

    public static void LIZ(String str, String str2) {
        C1163504gr.LIZIZ.onEventV3("pns_ban_analysis", C2097608Jq.LJIIIIZZ(new Pair("ban_type", str), new Pair("phase", str2)));
    }

    public static void LIZIZ(String str, String str2, String str3) {
        C1163504gr.LIZIZ.onEventV3("pns_ban_internal_error", C2097608Jq.LJIIIIZZ(new Pair("ban_type", str), new Pair("error_reason", str2), new Pair("error_msg", str3)));
    }
}
