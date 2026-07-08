package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768170UBj extends C09AY implements Function1<DownloadInfo, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Accompaniment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C768170UBj(long j, Accompaniment accompaniment, AbstractC768220UBo abstractC768220UBo) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = accompaniment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DownloadInfo downloadInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileDownload-onStart, albumId: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", accompanimentId: ");
        sbLIZ.append(this.LLILLJJLI.id);
        C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
        C2686012e.LIZIZ(C0UBZ.LLJJ, Long.valueOf(this.LL), this.LLILLJJLI);
        return Unit.LIZ;
    }
}
