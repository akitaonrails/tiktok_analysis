package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08q7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2240108q7 {
    public static final ConcurrentHashMap<String, C0HYC> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(long j, boolean z, boolean z2) {
        Object obj;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("duration", String.valueOf(j));
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_preload", obj);
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_success", str);
        C20684815ws.LJIILLIIL("im_chat_bubble_fetch", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZIZ(long j, boolean z, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("duration", String.valueOf(j));
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_retry", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_success", obj2);
        if (!z3) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_fetch", str);
        C20684815ws.LJIILLIIL("im_edit_chat_bubble_page_perf", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
