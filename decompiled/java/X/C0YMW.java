package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0YMW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMW implements Serializable {
    public long check;
    public String checkMsg;
    public int code;
    public String ext;
    public String logId;
    public int status;
    public String statusMsg;
    public Throwable throwable;

    public static C0YMX newBuilder() {
        return new C0YMX();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMError{code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", check");
        sbLIZ.append(this.check);
        sbLIZ.append(", checkMsg=$");
        sbLIZ.append(this.checkMsg);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", throwable=");
        Throwable th = this.throwable;
        sbLIZ.append(th != null ? th.toString() : null);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YMW() {
    }

    public long getCheck() {
        return this.check;
    }

    public String getCheckMsg() {
        return this.checkMsg;
    }

    public int getCode() {
        return this.code;
    }

    public String getExt() {
        return this.ext;
    }

    public String getLogId() {
        return this.logId;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public /* synthetic */ C0YMW(int i) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0268 -> B:117:0x0269). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03f6 -> B:189:0x03fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x019d -> B:73:0x019f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0YMW from(X.InterfaceC864950XwT r6) {
        /*
            Method dump skipped, instruction units count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YMW.from(X.0XwT):X.0YMW");
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public static C0YMW from(InterfaceC864950XwT interfaceC864950XwT, String str) {
        C0YMW c0ymwFrom = from(interfaceC864950XwT);
        c0ymwFrom.throwable = new Throwable(str);
        return c0ymwFrom;
    }
}
