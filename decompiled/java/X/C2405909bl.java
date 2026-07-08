package X;

import android.app.job.JobParameters;
import com.bytedance.memdump.upload.HprofUploadJobService;
import java.io.File;

/* JADX INFO: renamed from: X.09bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2405909bl implements InterfaceC2413009cu<String> {
    public final /* synthetic */ C2406409bq LIZ;
    public final /* synthetic */ File LIZIZ;
    public final /* synthetic */ HprofUploadJobService LIZJ;
    public final /* synthetic */ JobParameters LIZLLL;

    public final void LIZ(Throwable th) {
        if (this.LIZ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uploadFile onFailure, error: ");
            sbLIZ.append(th.getMessage());
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
        }
        C2406109bn.LIZ().LIZ(6, 0L, false);
        HprofUploadJobService hprofUploadJobService = this.LIZJ;
        if (hprofUploadJobService != null) {
            hprofUploadJobService.LIZ(this.LIZLLL, false, false);
        }
    }

    public final void LIZIZ(Object obj, boolean z) {
        if (z) {
            if (this.LIZ.LIZ) {
                C2223208nO.LIZ("MemDump", "uploadFile onResponse success");
            }
            C2406109bn.LIZ().LIZ(5, 0L, false);
            C2223108nN.LIZ(this.LIZIZ);
            HprofUploadJobService hprofUploadJobService = this.LIZJ;
            if (hprofUploadJobService != null) {
                hprofUploadJobService.LIZ(this.LIZLLL, true, false);
                return;
            }
            return;
        }
        if (this.LIZ.LIZ) {
            C2223208nO.LIZ("MemDump", "uploadFile onResponse fail");
        }
        C2406109bn.LIZ().LIZ(6, 0L, false);
        HprofUploadJobService hprofUploadJobService2 = this.LIZJ;
        if (hprofUploadJobService2 == null) {
            return;
        }
        hprofUploadJobService2.LIZ(this.LIZLLL, false, false);
    }

    public C2405909bl(C2406409bq c2406409bq, File file, HprofUploadJobService hprofUploadJobService, JobParameters jobParameters) {
        this.LIZ = c2406409bq;
        this.LIZIZ = file;
        this.LIZJ = hprofUploadJobService;
        this.LIZLLL = jobParameters;
    }
}
