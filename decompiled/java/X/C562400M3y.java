package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0M3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562400M3y {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(int i, long j, long j2, int i2, String str) {
        C13DA c13da = new C13DA();
        c13da.put("push_label", str);
        c13da.put("business_tag", "Creation");
        c13da.put("item_type", "inner_draft_management");
        c13da.put("alert_draft_cnt", String.valueOf(i));
        c13da.put("alert_draft_size", String.valueOf(j));
        c13da.put("draft_cnt", String.valueOf(i2));
        c13da.put("draft_size", String.valueOf(j2));
        return c13da.build();
    }
}
