package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371580lnQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("step", "all"), new Pair("duration", Long.valueOf(j)), new Pair("item_type", str));
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("smart_sort_duration", mapLJIIJ);
        }
    }
}
