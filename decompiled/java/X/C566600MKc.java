package X;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadPhotoModeSourceMediaToCache$1", f = "ForwardOnThisDayEnvironment.kt", l = {834}, m = "invokeSuspend")
public final class C566600MKc extends C09AX implements Function2<C094D<? super List<? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ForwardMedia LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566600MKc(ForwardMedia forwardMedia, InterfaceC1364105Vn<? super C566600MKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = forwardMedia;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C566600MKc c566600MKc = new C566600MKc(this.LLILLL, interfaceC1364105Vn);
        c566600MKc.LLILLJJLI = obj;
        return c566600MKc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.downloadPhotoModeSourceMediaToCache$1");
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
            C0MKJ.LIZ.getClass();
            C0MKJ.LJIJ("downloadPhotoModeSourceMedia start");
            List<ForwardMediaDownloader.DownloadConfig> listLJII = C0MKJ.LJII(this.LLILLL);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
            Iterator<ForwardMediaDownloader.DownloadConfig> it2 = listLJII.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().filePath);
            }
            C0MKJ c0mkj = C0MKJ.LIZ;
            c0mkj.getClass();
            if (C0MKJ.LIZIZ(arrayList)) {
                C0MKJ.LJJI(c0mkj, c094d, arrayList);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadPhotoModeSourceMediaToCache$1");
                return unit;
            }
            C0MKJ.LIZLLL.LIZJ();
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJFF().downloadPhotoModeResource(this.LLILLL, listLJII, false, new ForwardImageDownloader.ImageDownloadListener() { // from class: X.0MKd
                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                public final void onFileHeaderInfoReady(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                public final void onSuccess(List<String> list) {
                    C0MKJ.LJJI(C0MKJ.LIZ, c094d, list);
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                public final void onError(int i2, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                    C094D<List<String>> c094d2 = c094d;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i2);
                    sbLIZ.append(':');
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0XIR c0xir = new C0XIR(i2);
                    c0xir.setErrorMsg(str);
                    CancellationException cancellationException = new CancellationException(strLIZIZ);
                    cancellationException.initCause(c0xir);
                    C2296808zG.LIZJ(c094d2, cancellationException);
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(4);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadPhotoModeSourceMediaToCache$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadPhotoModeSourceMediaToCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super List<? extends String>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
