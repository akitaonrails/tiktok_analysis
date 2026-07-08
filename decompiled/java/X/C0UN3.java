package X;

/* JADX INFO: renamed from: X.0UN3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UN3 {
    public static final String LIZ(Throwable th) {
        String message;
        if (th instanceof C501470JlZ) {
            return ((C501470JlZ) th).getErrorMsg();
        }
        if (th instanceof C1811850xFX) {
            String message2 = ((C1811850xFX) th).getMessage();
            if (message2 != null) {
                return message2;
            }
        } else {
            if (th != null && (message = th.getMessage()) != null) {
                return message;
            }
            return "";
        }
        return "";
    }
}
