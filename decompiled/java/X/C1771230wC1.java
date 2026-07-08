package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771230wC1 {
    public static C1771590wCb LIZ(String str) {
        String str2;
        if (Intrinsics.LJFF(str, EnumC1771290wC7.TAB_TOUCH_DOWN.getValue())) {
            str2 = "tab_touch_down";
        } else if (Intrinsics.LJFF(str, EnumC1771290wC7.TAB_CLICK.getValue())) {
            str2 = "tab_click";
        } else {
            str2 = "unknown_preload";
        }
        return new C1771590wCb(CardStruct.IStatusCode.DEFAULT, 0, null, "preload_on_click", str2, null, null, C2097908Jt.LIZJ(new Pair("feed_tab_index", 0)), null, C2097608Jq.LJIIJ(new Pair("api_path", "api/v1/mall/homepage/bff/get")), false, 60186);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.os.Bundle r26, X.C19EG r27, final X.EnumC1771290wC7 r28) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771230wC1.LIZIZ(android.os.Bundle, X.19EG, X.0wC7):void");
    }

    public static void LIZJ(C1771590wCb c1771590wCb, int i, String str, long j) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C606440NqU(c1771590wCb, i, str, j, null), 2);
    }
}
