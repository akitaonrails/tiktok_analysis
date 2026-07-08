package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862470yZB {
    public static ArrayMap LIZ(TakoEnterParams takoEnterParams) {
        String str;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("is_resend", CardStruct.IStatusCode.DEFAULT);
        String str2 = takoEnterParams.enterMethod;
        if (Intrinsics.LJFF(str2, "tab")) {
            str = "ask_more";
        } else if (Intrinsics.LJFF(str2, "click_recommend_word")) {
            str = "recommend_word";
        } else {
            str = "quick_reaction";
        }
        arrayMap.put("interaction_type", str);
        return arrayMap;
    }
}
