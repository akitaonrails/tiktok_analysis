package Y;

import X.C1018070cbF;
import X.C1023640ckE;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS13S1101000_16 implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS13S1101000_16 aObjectS13S1101000_16, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS13S1101000_16.l1;
        int i = aObjectS13S1101000_16.i2;
        String str = aObjectS13S1101000_16.s0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(downloadInfo);
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withParam(C1018070cbF.LJI, Integer.valueOf(i));
        c1023640ckE.withParam(C1018070cbF.LJII, str);
        return null;
    }

    public static final Object invoke$1(AObjectS13S1101000_16 aObjectS13S1101000_16, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS13S1101000_16.l1;
        int i = aObjectS13S1101000_16.i2;
        String str = aObjectS13S1101000_16.s0;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(downloadInfo);
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withParam(C1018070cbF.LJI, Integer.valueOf(i));
        c1023640ckE.withParam(C1018070cbF.LJII, str);
        return null;
    }

    public static final Object invoke$2(AObjectS13S1101000_16 aObjectS13S1101000_16, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) aObjectS13S1101000_16.l1;
        String str = aObjectS13S1101000_16.s0;
        int i = aObjectS13S1101000_16.i2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (downloadInfo == null) {
            downloadInfo = new DownloadInfo();
        }
        downloadInfo.setMd5(str);
        c1023640ckE.withContext(downloadInfo);
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withParam(C1018070cbF.LIZIZ, Integer.valueOf(i));
        return null;
    }

    public AObjectS13S1101000_16(int i, DownloadInfo downloadInfo, String str, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 1:
                this.l1 = downloadInfo;
                this.i2 = i;
                this.s0 = str;
                break;
            default:
                this.l1 = downloadInfo;
                this.s0 = str;
                this.i2 = i;
                break;
        }
    }
}
