package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZQW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQW {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayMap LIZ(String str, String str2, String str3, String str4, String str5) {
        Pair pair = new Pair("conversation_id", str);
        int i = 0;
        Pair[] pairArr = {pair, new Pair("chat_type", str2), new Pair("to_user_id", str3), new Pair("is_mention", str4), new Pair("thought_id", str5)};
        ArrayMap arrayMap = new ArrayMap();
        do {
            Pair pair2 = pairArr[i];
            arrayMap.put(pair2.getFirst(), pair2.getSecond());
            i++;
        } while (i < 5);
        return arrayMap;
    }
}
