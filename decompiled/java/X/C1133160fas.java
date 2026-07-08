package X;

/* JADX INFO: renamed from: X.0fas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133160fas {
    public static final C1133120fao LIZ(Throwable th) {
        String name;
        C1133120fao c1133120fao = new C1133120fao();
        String str = "unknown error";
        if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            c1133120fao.LIZ = c501520Jle.getErrorCode();
            String message = c501520Jle.getMessage();
            if (message != null) {
                str = message;
            }
            c1133120fao.LIZIZ = str;
        } else {
            String message2 = null;
            if (th instanceof C1811850xFX) {
                C1811850xFX c1811850xFX = (C1811850xFX) th;
                c1133120fao.LIZ = c1811850xFX.getStatusCode();
                String message3 = c1811850xFX.getMessage();
                if (message3 != null) {
                    str = message3;
                }
                c1133120fao.LIZIZ = str;
            } else if (th instanceof C1494450ozb) {
                c1133120fao.LIZ = -106;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception: NetworkNotAvailableException ");
                sbLIZ.append(th.getMessage());
                c1133120fao.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (th instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) th;
                c1133120fao.LIZ = c1494690ozz.getCronetInternalErrorCode();
                String message4 = c1494690ozz.getMessage();
                if (message4 != null) {
                    str = message4;
                }
                c1133120fao.LIZIZ = str;
            } else if (th instanceof C1494430ozZ) {
                C1494430ozZ c1494430ozZ = (C1494430ozZ) th;
                c1133120fao.LIZ = c1494430ozZ.getStatusCode();
                String message5 = c1494430ozZ.getMessage();
                if (message5 != null) {
                    str = message5;
                }
                c1133120fao.LIZIZ = str;
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
                    message2 = th.getMessage();
                }
                sbLIZ2.append(message2);
                sbLIZ2.append(' ');
                c1133120fao.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("GiftApiError(");
        sbLIZ3.append(c1133120fao.LIZ);
        sbLIZ3.append(')');
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ3));
        return c1133120fao;
    }
}
