package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19642011t4 {
    public final HashMap<String, Integer> LIZ = new HashMap<>();
    public final HashMap<String, Integer> LIZIZ = new HashMap<>();

    public static void LIZIZ(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("content", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_editing_post", str2);
        C20684815ws.LJIILLIIL("news_anchor_preview_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("content", str);
        pairArr[1] = new Pair("error_title_reasons", C2343809Gi.LIZ(this.LIZ));
        pairArr[2] = new Pair("error_url_reasons", C2343809Gi.LIZ(this.LIZIZ));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_editing_post", str2);
        C20684815ws.LJIILLIIL("news_anchor_add_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
