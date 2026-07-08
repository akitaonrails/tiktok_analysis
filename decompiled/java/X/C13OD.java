package X;

import X.C13OE;
import kotlin.Pair;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13OD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13OD<T, R extends C13OE<T>> extends AbstractC20000013Ne {
    public final C19996113Lr callbackManager;
    public final C13RD effectConfig;
    public boolean isJsonOptimize;
    public final C13R7 jsonConverter;
    public String logId;
    public final C13NB netWorker;
    public final String taskId;

    public abstract C0XSU buildRequest();

    public String exchangeResponseString(String str) {
        return str;
    }

    public int getFailCode() {
        return 10002;
    }

    public int getRetryCount() {
        return 1;
    }

    public abstract R parseResponse(C13R7 c13r7, String str);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    @Override // X.AbstractC20000013Ne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13OD.execute():void");
    }

    @Override // X.AbstractC20000013Ne
    public void onCancel() {
        runOnMainThread(new AwS574S0100000_30((C13OD) this, 407));
    }

    public final String getLogId() {
        return this.logId;
    }

    public final boolean isJsonOptimize() {
        return this.isJsonOptimize;
    }

    public C13N8 requestNetService(C0XSU c0xsu) {
        C13NB c13nb = this.netWorker;
        if (c13nb != null) {
            return c13nb.fetchFromNetwork(c0xsu);
        }
        return null;
    }

    public final void setJsonOptimize(boolean z) {
        this.isJsonOptimize = z;
    }

    private final Pair<R, String> parseByString(C13N8 c13n8, C13R7 c13r7) throws C1633840scQ {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = C20009013Qq.LIZ(c13n8.LIZIZ);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (strLIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            exchangeResponseString(strLIZ);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            C13OE response = parseResponse(c13r7, strLIZ);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[FetchList][ID: ");
            sbLIZ.append(this.taskId);
            sbLIZ.append("][");
            sbLIZ.append(getTag());
            sbLIZ.append("][String - ");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append("][Json - ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis3);
            sbLIZ.append("][Size - ");
            sbLIZ.append(strLIZ.length());
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
            return new Pair<>(response, strLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[LogId:");
        sbLIZ2.append(this.logId);
        sbLIZ2.append("][net response returned empty response!][LogId:");
        sbLIZ2.append(this.logId);
        sbLIZ2.append("][errorMsg: ");
        sbLIZ2.append(c13n8.LIZLLL);
        sbLIZ2.append(']');
        throw new C1633840scQ(-2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    private final void logTime(long j, long j2, long j3) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FetchList][ID: ");
        sbLIZ.append(this.taskId);
        sbLIZ.append("][");
        sbLIZ.append(getTag());
        sbLIZ.append("][Net - ");
        sbLIZ.append(j2 - j);
        sbLIZ.append("][Json - ");
        sbLIZ.append(j3 - j2);
        sbLIZ.append("][Disk - ");
        sbLIZ.append(System.currentTimeMillis() - j3);
        sbLIZ.append("][Total - ");
        sbLIZ.append(System.currentTimeMillis() - j);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LJ("JKL", strLIZIZ);
    }

    public void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        if (this.taskId != null) {
            runOnMainThread(new AwS431S0200000_30((C13OD) this, c1662010tLr, (C1662010tLr) 60));
        }
    }

    public void onSuccess(long j, long j2, long j3, R r) {
        Object responseData = r.getResponseData();
        if (responseData != null && this.taskId != null) {
            runOnMainThread(new AwS431S0200000_30((C13OD) this, (C13OD<int, R>) responseData, 61));
        }
    }

    public C13OD(C13NB c13nb, C13R7 c13r7, C19996113Lr c19996113Lr, String str, C13RD c13rd) {
        super(str, c19996113Lr);
        this.netWorker = c13nb;
        this.jsonConverter = c13r7;
        this.callbackManager = c19996113Lr;
        this.taskId = str;
        this.effectConfig = c13rd;
        this.logId = "";
        boolean z = false;
        if (c13rd != null && c13rd.LJJJ == 2) {
            z = true;
        }
        this.isJsonOptimize = z;
    }

    public void onSuccess(long j, long j2, long j3, String str, R r) {
        onSuccess(j, j2, j3, r);
    }
}
