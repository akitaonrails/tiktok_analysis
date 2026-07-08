package X;

/* JADX INFO: renamed from: X.0K9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512820K9g {
    public static C0KAJ LIZ(EnumC512800K9e enumC512800K9e) {
        switch (C512810K9f.LIZ[enumC512800K9e.ordinal()]) {
            case 1:
                return C0KAJ.AUTO_TIMEOUT;
            case 2:
                return C0KAJ.MANUALLY_CLOSE;
            case 3:
                return C0KAJ.MANUALLY_ROUTE;
            case 4:
                return C0KAJ.AUTO_CONTROL;
            case 5:
                return C0KAJ.NON_RESUMABLE;
            case 6:
                return null;
            default:
                return C0KAJ.AUTO_TERMINATE;
        }
    }
}
