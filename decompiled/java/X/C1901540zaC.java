package X;

import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0zaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901540zaC {
    public static String LIZIZ() {
        n nVar = new n();
        nVar.LJJIII(3, "unread_count_flag");
        boolean zLJII = C14TF.LIZIZ.LJIILL().LJII();
        String str = CardStruct.IStatusCode.DEFAULT;
        nVar.LJJIIJ("enable_tako_entrance", zLJII ? "1" : CardStruct.IStatusCode.DEFAULT);
        nVar.LJJIIJ("creator_inbox_follower_activity_merge", C19212010Ec.LIZJ.LJJJLL() ? "1" : CardStruct.IStatusCode.DEFAULT);
        h hVar = new h();
        hVar.LJJIFFI(LIZ("inbox_creator_notification_entrance_style", String.valueOf(((Number) C1866780yg8.LIZ.getValue()).intValue())));
        hVar.LJJIFFI(LIZ("inbox_bb_archive_enable", "1"));
        hVar.LJJIFFI(LIZ("need_all_entrance_count", String.valueOf(((Number) C0BM5.LIZ.getValue()).intValue())));
        if (C1665906fh.LIZJ.LJIIIIZZ()) {
            str = "1";
        }
        hVar.LJJIFFI(LIZ("inbox_count_unread_by_cell", str));
        nVar.LJJIFFI("experiment_params", hVar);
        return nVar.toString();
    }

    public static n LIZ(String str, String str2) {
        n nVar = new n();
        nVar.LJJIIJ("key", str);
        nVar.LJJIIJ("value", str2);
        return nVar;
    }
}
