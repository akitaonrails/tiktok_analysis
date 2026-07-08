package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U35, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U35 extends C09AY implements Function1<DownloadInfo, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C0U33 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0U35(C118300cf c118300cf, C0U33 c0u33, long j, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = c0u33;
        this.LLILLL = j;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DownloadInfo downloadInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess: pre-");
        sbLIZ.append(this.LL.element);
        C20441214yg.LIZIZ("KaraokeDownloader", C2188811AlT.LIZIZ(sbLIZ));
        C118300cf c118300cf = this.LL;
        int i = c118300cf.element;
        int i2 = 100 - i;
        if (i2 > 0) {
            c118300cf.element = i + i2;
            C0U37 c0u37 = this.LLILLJJLI.LJ.get(Long.valueOf(this.LLILLL));
            if (c0u37 != null) {
                c0u37.LIZJ += i2;
                System.currentTimeMillis();
                c0u37.LIZIZ.invoke(Long.valueOf(c0u37.LIZ), Integer.valueOf(Math.min(100, (c0u37.LIZJ * 100) / c0u37.LIZLLL)));
            }
        }
        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILZ;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        return Unit.LIZ;
    }
}
