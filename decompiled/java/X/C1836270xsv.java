package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836270xsv extends C09AY implements Function1<DownloadInfo, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ DialogC1390150mHN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836270xsv(float f, DialogC1390150mHN dialogC1390150mHN) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = dialogC1390150mHN;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DownloadInfo downloadInfo) {
        int downloadProcess;
        int downloadProcess2;
        DownloadInfo downloadInfo2 = downloadInfo;
        if (downloadInfo2 != null) {
            downloadProcess = downloadInfo2.getDownloadProcess();
        } else {
            downloadProcess = 0;
        }
        C20441214yg.LIZIZ("LiveReplayVideoClip", String.valueOf(downloadProcess));
        if (downloadInfo2 != null) {
            downloadProcess2 = downloadInfo2.getDownloadProcess();
        } else {
            downloadProcess2 = 0;
        }
        float f = this.LL;
        float f2 = 100;
        this.LLILLJJLI.LJJLL(f + (((f2 - f) / f2) * downloadProcess2), false);
        return Unit.LIZ;
    }
}
