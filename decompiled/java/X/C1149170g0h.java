package X;

/* JADX INFO: renamed from: X.0g0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149170g0h {
    public static C1149180g0i LIZ(Throwable th) {
        if (th instanceof C1149180g0i) {
            return (C1149180g0i) th;
        }
        if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            return new C1149180g0i(Integer.valueOf(c501520Jle.getErrorCode()), 0, c501520Jle.getMessage());
        }
        return new C1149180g0i(-1, -1, th.getMessage());
    }
}
