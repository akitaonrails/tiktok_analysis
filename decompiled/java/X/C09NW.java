package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09NW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tools.performance.util.DownloadTaskExtensionKt$safeSetSubThreadListener$1$1", f = "DownloadTaskExtension.kt", l = {}, m = "invokeSuspend")
public final class C09NW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DownloadTask LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ IDownloadListener LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09NW(DownloadTask downloadTask, String str, IDownloadListener iDownloadListener, InterfaceC1364105Vn<? super C09NW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = downloadTask;
        this.LLILLJJLI = str;
        this.LLILLL = iDownloadListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09NW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadTaskExtensionKt@365.safeSetSubThreadListener$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getDownloadInfo() != null && this.LL.getDownloadInfo().getId() != 0) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C1BWL.LIZ()).pause(this.LL.getDownloadInfo().getId());
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C1BWL.LIZ()).removeSubThreadListener(this.LL.getDownloadInfo().getId(), this.LLILLL);
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" safeSubThreadListener: removeSubThreadListener");
            C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DownloadTaskExtensionKt@365.safeSetSubThreadListener$1$1");
            return unit;
        }
        C20102213l6 c20102213l62 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(" safeSubThreadListener: downloadInfo is ");
        sbLIZ2.append(this.LL.getDownloadInfo());
        C201955140j.LJIIIIZZ(c20102213l62, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DownloadTaskExtensionKt@365.safeSetSubThreadListener$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
