package X;

/* JADX INFO: renamed from: X.03YA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public enum C03YA {
    Success(0),
    ParameterError(201),
    LaunchActivityError(202),
    ParseError(1),
    GoogleAPIError(203),
    UserCancel(206);

    public final int LL;

    public static C03YA valueOf(String str) {
        return (C03YA) C08FF.LIZ(C03YA.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    C03YA(int i) {
        this.LL = i;
    }
}
