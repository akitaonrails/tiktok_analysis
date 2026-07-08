package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1Beo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210161Beo {
    public final Context LIZ;
    public final C2210201Bes LIZIZ;
    public final long LIZJ;
    public final InterfaceC23070092e LIZLLL;
    public final ExecutorService LJ;
    public final String LJFF;
    public final InterfaceC844070X9h LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MonitorV3Config{context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appLogConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventReportInterval=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", networkClient=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", executor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reportUrl='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2210161Beo(C2210451BfH c2210451BfH) {
        this.LIZJ = 60000L;
        this.LIZ = c2210451BfH.LIZ;
        this.LIZIZ = c2210451BfH.LIZIZ;
        this.LIZJ = c2210451BfH.LIZJ;
        this.LIZLLL = c2210451BfH.LIZLLL;
        this.LJFF = c2210451BfH.LJ;
        this.LJ = c2210451BfH.LJFF;
        this.LJI = c2210451BfH.LJI;
    }
}
