package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900960ZWc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = {new Pair("conversation_id", str)};
        ArrayMap arrayMap = new ArrayMap();
        Pair pair = pairArr[0];
        arrayMap.put(pair.getFirst(), pair.getSecond());
        C20684815ws.LJIILLIIL("show_photoswap_ansa_panel", arrayMap);
    }

    public static void LIZ(String str, EnumC900970ZWd enumC900970ZWd) {
        C0I0B.LJFF.LIZIZ();
        int i = 0;
        Pair[] pairArr = {new Pair("conversation_id", str), new Pair("result", enumC900970ZWd.getValue())};
        ArrayMap arrayMap = new ArrayMap();
        do {
            Pair pair = pairArr[i];
            arrayMap.put(pair.getFirst(), pair.getSecond());
            i++;
        } while (i < 2);
        C20684815ws.LJIILLIIL("click_photoswap_ansa_panel", arrayMap);
    }
}
