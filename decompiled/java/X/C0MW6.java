package X;

/* JADX INFO: renamed from: X.0MW6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MW6 {
    public static Integer LIZ;

    public static int LIZ() {
        Integer num = LIZ;
        if (num != null) {
            return num.intValue();
        }
        int i = C0MWD.LIZ().getInt("ai_tag_show_count", 0);
        LIZ = Integer.valueOf(i);
        return i;
    }
}
