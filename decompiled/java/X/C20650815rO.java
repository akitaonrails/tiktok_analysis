package X;

import com.bytedance.applog.AppLog;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSnapshot;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSyncRequestParams;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecords;

/* JADX INFO: renamed from: X.15rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20650815rO {
    public final String LIZ;
    public int LIZIZ;
    public OutreachRecords LIZJ;
    public OutreachRecordSnapshot LIZLLL;

    public final OutreachRecordSyncRequestParams LIZ() {
        return new OutreachRecordSyncRequestParams(this.LIZ, Integer.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL);
    }

    public C20650815rO() {
        String did2 = AppLog.getDid();
        this.LIZ = did2 == null ? "" : did2;
    }
}
