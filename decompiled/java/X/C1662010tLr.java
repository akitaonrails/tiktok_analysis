package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662010tLr {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final Exception LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    public final String toString() {
        if (this.LIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExceptionResult{errorCode=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", msg='");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", requestUrl='");
            sbLIZ.append(this.LJ);
            sbLIZ.append("', selectedHost='");
            sbLIZ.append(this.LJFF);
            sbLIZ.append("', remoteIp='");
            sbLIZ.append(this.LJI);
            sbLIZ.append("'}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ExceptionResult{errorCode=");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(", msg='");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("', requestUrl='");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append("', selectedHost='");
        sbLIZ2.append(this.LJFF);
        sbLIZ2.append("', remoteIp='");
        sbLIZ2.append(this.LJI);
        sbLIZ2.append("', exception=");
        sbLIZ2.append(this.LIZLLL.getMessage());
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1662010tLr(Exception exc) {
        int i;
        this.LIZ = -1;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LIZLLL = exc;
        if (exc instanceof C1633840scQ) {
            C1633840scQ c1633840scQ = (C1633840scQ) exc;
            this.LIZ = c1633840scQ.getStatus_code();
            this.LIZIZ = c1633840scQ.getMessage();
            return;
        }
        if (exc instanceof C1650010t2V) {
            C1650010t2V c1650010t2V = (C1650010t2V) exc;
            this.LIZ = c1650010t2V.getStatusCode();
            this.LIZIZ = c1650010t2V.getMessage();
            return;
        }
        if (exc instanceof C1633860scS) {
            this.LIZ = 10008;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof C1663050tNX) {
            this.LIZ = 10015;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof C1662020tLs) {
            this.LIZ = 10013;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof C13NG) {
            this.LIZ = 10010;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc instanceof C564610MCl) {
            this.LIZ = 10012;
            this.LIZIZ = exc.getMessage();
            return;
        }
        if (exc != null) {
            if (Intrinsics.LJFF("network unavailable", exc.getMessage())) {
                i = 10011;
            } else {
                i = 10005;
            }
            this.LIZ = i;
            String message = exc.getMessage();
            this.LIZIZ = message;
            if (message != null && message.length() != 0) {
                return;
            }
            this.LIZIZ = exc.toString();
            return;
        }
        this.LIZ = 1;
        this.LIZIZ = C1F9A.LIZ(1);
    }

    public C1662010tLr(int i) {
        this.LIZ = i;
        this.LIZIZ = C1F9A.LIZ(i);
        this.LIZLLL = null;
    }

    public C1662010tLr(int i, Exception exc) {
        this.LIZ = i;
        this.LIZIZ = C1F9A.LIZ(i);
        this.LIZLLL = exc;
    }

    public final void LIZ(String str, String str2, String str3) {
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
