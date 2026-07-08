package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0ozc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494460ozc extends IOException {
    public static final long serialVersionUID = -1606114814728652693L;
    public Object infoObj;
    public boolean reportMonitorError;
    public boolean reportMonitorOk;
    public String traceCode;
    public String url;

    public C1494460ozc() {
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public String getTraceCode() {
        return this.traceCode;
    }

    public C1494460ozc(String str) {
        super(str);
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public C1494460ozc(String str, Throwable th) {
        super(str, th);
        this.url = "empty url";
        this.traceCode = "empty traceCode";
    }

    public static C1494460ozc wrapIfNeeded(Exception exc, String str, String str2, Object obj) {
        if (exc instanceof C1494460ozc) {
            return (C1494460ozc) exc;
        }
        C1494460ozc c1494460ozc = new C1494460ozc(exc.getMessage(), exc);
        c1494460ozc.setInfo(false, true, str, str2, obj);
        return c1494460ozc;
    }

    public void setInfo(boolean z, boolean z2, String str, String str2, Object obj) {
        this.reportMonitorOk = z;
        this.reportMonitorError = z2;
        this.url = str;
        this.traceCode = str2;
        this.infoObj = obj;
    }
}
