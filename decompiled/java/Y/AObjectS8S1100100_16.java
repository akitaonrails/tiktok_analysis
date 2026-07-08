package Y;

import X.C1018070cbF;
import X.C1023640ckE;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS8S1100100_16 implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS8S1100100_16 aObjectS8S1100100_16, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS8S1100100_16.l1;
        long j = aObjectS8S1100100_16.j2;
        String str = aObjectS8S1100100_16.s0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(downloadInfo);
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withParam(C1018070cbF.LJI, -2);
        c1023640ckE.withParam(C1018070cbF.LJII, "Less than minsize");
        c1023640ckE.withParam(C1018070cbF.LJIIIIZZ, Long.valueOf(j));
        c1023640ckE.withParam(C1018070cbF.LJIIIZ, str);
        return null;
    }

    public static final Object invoke$1(AObjectS8S1100100_16 aObjectS8S1100100_16, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS8S1100100_16.l1;
        long j = aObjectS8S1100100_16.j2;
        String str = aObjectS8S1100100_16.s0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(downloadInfo);
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withParam(C1018070cbF.LJI, -2);
        c1023640ckE.withParam(C1018070cbF.LJII, "Less than minsize");
        c1023640ckE.withParam(C1018070cbF.LJIIIIZZ, Long.valueOf(j));
        c1023640ckE.withParam(C1018070cbF.LJIIIZ, str);
        return null;
    }

    public AObjectS8S1100100_16(DownloadInfo downloadInfo, long j, String str, int i) {
        this.$t = i;
        this.l1 = downloadInfo;
        this.j2 = j;
        this.s0 = str;
    }
}
