package X;

/* JADX INFO: renamed from: X.0YMU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMU implements InterfaceC870760YDy {
    public static final C0YMU LIZ = new C0YMU();

    @Override // X.InterfaceC870760YDy
    public final boolean LIZ(Integer num) {
        int value = C0YMR.REPORT_CLIENT_METRICS.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = C0YMR.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue();
            if (num != null && num.intValue() == value2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
