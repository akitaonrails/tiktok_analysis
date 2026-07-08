package X;

/* JADX INFO: renamed from: X.0fat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133170fat {
    public static final /* synthetic */ int LIZ = 0;

    public static C1133180fau LIZ(Throwable th) {
        String name;
        C1133180fau c1133180fau = new C1133180fau();
        if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            c1133180fau.LIZ = c501520Jle.getErrorCode();
            c501520Jle.getMessage();
        } else {
            String message = null;
            if (th instanceof C1811850xFX) {
                C1811850xFX c1811850xFX = (C1811850xFX) th;
                c1133180fau.LIZ = c1811850xFX.getStatusCode();
                c1811850xFX.getMessage();
            } else if (th instanceof C1494450ozb) {
                c1133180fau.LIZ = -106;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception: NetworkNotAvailableException ");
                sbLIZ.append(th.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            } else if (th instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) th;
                c1133180fau.LIZ = c1494690ozz.getCronetInternalErrorCode();
                c1494690ozz.getMessage();
            } else if (th instanceof C1494430ozZ) {
                C1494430ozZ c1494430ozZ = (C1494430ozZ) th;
                c1133180fau.LIZ = c1494430ozZ.getStatusCode();
                c1494430ozZ.getMessage();
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception class name is ");
                if (th != null) {
                    name = th.getClass().getName();
                } else {
                    name = null;
                }
                sbLIZ2.append(name);
                sbLIZ2.append(", error msg is ");
                if (th != null) {
                    message = th.getMessage();
                }
                sbLIZ2.append(message);
                sbLIZ2.append(' ');
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LiveCoinConsumptionApiErrorData(");
        sbLIZ3.append(c1133180fau.LIZ);
        sbLIZ3.append(')');
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ3));
        return c1133180fau;
    }
}
