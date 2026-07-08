package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883500z76 {
    public static final String LIZ(Throwable th) {
        if (th instanceof C1494450ozb) {
            return "NetworkNotAvailabeException";
        }
        if (th instanceof C477520Io2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomApiServerException errorCode: ");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            sbLIZ.append(c501470JlZ.getErrorCode());
            sbLIZ.append(", errorMsg: ");
            sbLIZ.append(c501470JlZ.getErrorMsg());
            sbLIZ.append(", extra: ");
            sbLIZ.append(c501470JlZ.getExtra());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (th instanceof C501470JlZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ApiServerException errorCode: ");
            C501470JlZ c501470JlZ2 = (C501470JlZ) th;
            sbLIZ2.append(c501470JlZ2.getErrorCode());
            sbLIZ2.append(", errorMsg: ");
            sbLIZ2.append(c501470JlZ2.getErrorMsg());
            sbLIZ2.append(", extra: ");
            sbLIZ2.append(c501470JlZ2.getExtra());
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "";
    }

    public static final boolean LIZIZ(InterfaceC1883030z6L interfaceC1883030z6L) {
        return Intrinsics.LJFF(C1883130z6V.LIZ(interfaceC1883030z6L), "home");
    }
}
