package X;

/* JADX INFO: renamed from: X.05nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1461605nq {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Integer num) {
        int value = C0Z9N.OWNER.getValue();
        if (num != null && num.intValue() == value) {
            return 10;
        }
        int value2 = C0Z9N.ADMIN.getValue();
        if (num != null && num.intValue() == value2) {
            return 20;
        }
        int value3 = C0Z9N.ORDINARY.getValue();
        if (num != null && num.intValue() == value3) {
            return 30;
        }
        return -1;
    }
}
