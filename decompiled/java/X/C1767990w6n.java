package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0w6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767990w6n extends C09AY implements Function0<Map<String, ? extends String>> {
    public C1767990w6n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        String string;
        Pair[] pairArr = new Pair[7];
        C1767950w6j.LIZ.getClass();
        C1768340w7M c1768340w7M = C1768340w7M.LIZ;
        c1768340w7M.getClass();
        pairArr[0] = new Pair("is_offline", c1768340w7M.LJFF("tiktok_ecom_hybrid_mall") ? "1" : CardStruct.IStatusCode.DEFAULT);
        C1767960w6k.LIZ.getClass();
        pairArr[1] = new Pair("is_first_install_launch", C1767960w6k.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("is_first_show_mall", C1767960w6k.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("container_name", "spark");
        if (C1767960w6k.LJIIJJI.length() == 0) {
            C1767960w6k.LJIIJJI = "1.7.2";
        }
        pairArr[4] = new Pair("container_version", C1767960w6k.LJIIJJI);
        String str = C1767950w6j.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[5] = new Pair("lynx_version", str);
        Long lLIZIZ = c1768340w7M.LIZIZ("tiktok_ecom_hybrid_mall");
        if (lLIZIZ != null && (string = lLIZIZ.toString()) != null) {
            str2 = string;
        }
        pairArr[6] = new Pair("gecko_version_id", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
