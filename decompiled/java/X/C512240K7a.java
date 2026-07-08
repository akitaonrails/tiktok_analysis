package X;

/* JADX INFO: renamed from: X.0K7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512240K7a {
    public static final int LIZ(Throwable th) {
        if (th instanceof C501470JlZ) {
            return ((C501520Jle) th).getErrorCode();
        }
        if (th instanceof C1494430ozZ) {
            return ((C1494430ozZ) th).getStatusCode();
        }
        if (th instanceof C1811850xFX) {
            return ((C1811850xFX) th).statusCode;
        }
        if (th instanceof C1494450ozb) {
            return ((C1494450ozb) th).getCronetInternalErrorCode();
        }
        if (th instanceof C1494690ozz) {
            return ((C1494690ozz) th).getCronetInternalErrorCode();
        }
        return -1;
    }

    public static final String LIZIZ(Throwable th) {
        C501470JlZ c501470JlZ;
        if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null) {
            return null;
        }
        return c501470JlZ.getErrorMsg();
    }
}
