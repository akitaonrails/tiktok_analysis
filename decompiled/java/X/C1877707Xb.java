package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.07Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877707Xb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://ec/billboard_effect_v2?author_id=");
        sbLIZ.append(str);
        sbLIZ.append("&is_new_user=");
        sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
        sbLIZ.append("&previous_page=live_effect");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
