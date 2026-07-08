package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0fUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129420fUq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, long j, long j2) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_longpress");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j2), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "gift_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i2 + 1), "actual_gift_position");
        if (C1130220fW8.LIZ.LIZ) {
            str = "first_screen";
        } else {
            str = "other_screen";
        }
        c474500IjALIZ.LJJII(str, "is_first_screen");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "can_group_send");
        c474500IjALIZ.LIZ();
    }
}
