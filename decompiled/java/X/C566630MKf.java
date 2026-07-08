package X;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadSourceMediaToCache$1", f = "ForwardOnThisDayEnvironment.kt", l = {740}, m = "invokeSuspend")
public final class C566630MKf extends C09AX implements Function2<C094D<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ForwardMedia LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566630MKf(ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C566630MKf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = forwardMedia;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C566630MKf c566630MKf = new C566630MKf(this.LLILLL, interfaceC1364105Vn);
        c566630MKf.LLILLJJLI = obj;
        return c566630MKf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.downloadSourceMediaToCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            C0MKJ c0mkj = C0MKJ.LIZ;
            c0mkj.getClass();
            C0MKJ.LJIJ("downloadSourceMedia start");
            ForwardMediaDownloader.DownloadConfig downloadConfigLJI = C0MKJ.LJI(this.LLILLL);
            if (new C0VSJ(downloadConfigLJI.filePath).exists()) {
                C0MKJ.LJJI(c0mkj, c094d, downloadConfigLJI.filePath);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadSourceMediaToCache$1");
                return unit;
            }
            C0MKJ.LIZLLL.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger normal downloader with config:");
            sbLIZ.append(downloadConfigLJI);
            C0MKJ.LJIJ(C2188811AlT.LIZIZ(sbLIZ));
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LIZJ().download(this.LLILLL.video, downloadConfigLJI, null, ((Boolean) C0BDT.LIZ.getValue()).booleanValue(), new ForwardMediaDownloader.DownloadListener() { // from class: X.0MKj
                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onFileHeaderInfoReady(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onSuccess(String str) {
                    C0MKJ.LJJI(C0MKJ.LIZ, c094d, str);
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onError(int i2, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                    C094D<String> c094d2 = c094d;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i2);
                    sbLIZ2.append(':');
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C0XIR c0xir = new C0XIR(i2);
                    c0xir.setErrorMsg(str);
                    CancellationException cancellationException = new CancellationException(strLIZIZ);
                    cancellationException.initCause(c0xir);
                    C2296808zG.LIZJ(c094d2, cancellationException);
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(5);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadSourceMediaToCache$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadSourceMediaToCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super String> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
