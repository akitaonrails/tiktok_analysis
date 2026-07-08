package X;

/* JADX INFO: renamed from: X.0OdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623900OdY {
    public static final String LIZ(int i) {
        if (i == EnumC623890OdX.TAB_ALL.getValue()) {
            return "all";
        }
        if (i == EnumC623890OdX.TAB_PENDING.getValue()) {
            return "pending";
        }
        if (i == EnumC623890OdX.TAB_IN_PROGRESS.getValue()) {
            return "progress";
        }
        if (i == EnumC623890OdX.TAB_COMPLETED.getValue()) {
            return "completed";
        }
        if (i == EnumC623890OdX.TAB_CLOSED.getValue()) {
            return "closed";
        }
        return "unknown tab";
    }
}
