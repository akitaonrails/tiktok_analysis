package X;

import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.share.OnThisDayDownloadPhotoLogic$downloadPhotoModeResource$1$result$2$result$1", f = "OnThisDayDownloadPhotoLogic.kt", l = {70}, m = "invokeSuspend")
public final class C566900MLg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C566910MLh LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ ForwardImageDownloader.ImageDownloadListener LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566900MLg(C566910MLh c566910MLh, List<String> list, String str, String str2, boolean z, ForwardImageDownloader.ImageDownloadListener imageDownloadListener, InterfaceC1364105Vn<? super C566900MLg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c566910MLh;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = imageDownloadListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566900MLg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayDownloadPhotoLogic@babd.downloadPhotoModeResource$1$result$2$result$1");
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
            C566910MLh c566910MLh = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            boolean z = this.LLILZLL;
            final ForwardImageDownloader.ImageDownloadListener imageDownloadListener = this.LLIZ;
            this.LL = 1;
            c566910MLh.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C201973141b.LIZIZ(list, str, str2, z, new ForwardMediaDownloader.DownloadListener() { // from class: X.0MLi
                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onFileHeaderInfoReady(boolean z2) {
                    imageDownloadListener.onFileHeaderInfoReady(z2);
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onSuccess(String str3) {
                    InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(str3);
                    interfaceC1364105Vn.resumeWith(str3);
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onError(int i2, String str3, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                    Unit unit;
                    ForwardImageDownloader.ImageDownloadListener.DefaultImpls.onError$default(imageDownloadListener, i2, str3, exc, null, 8, null);
                    InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("down_image_fail code:");
                    sbLIZ.append(i2);
                    sbLIZ.append(" msg:");
                    sbLIZ.append(str3);
                    sbLIZ.append(" exception:");
                    if (exc != null) {
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    sbLIZ.append(unit);
                    C098200Yq c098200Yq = new C098200Yq(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OnThisDayDownloadPhotoLogic@babd.downloadPhotoModeResource$1$result$2$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OnThisDayDownloadPhotoLogic@babd.downloadPhotoModeResource$1$result$2$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
