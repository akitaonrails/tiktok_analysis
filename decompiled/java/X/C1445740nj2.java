package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResourceNew$1$results$1$1$1", f = "DownloadEditPostPhotoManager.kt", l = {169}, m = "invokeSuspend")
public final class C1445740nj2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SrcImageInfo>, Object> {
    public int LL;
    public final /* synthetic */ C1445720nj0 LLILLJJLI;
    public final /* synthetic */ PhotoModeImageUrlModel LLILLL;
    public final /* synthetic */ InterfaceC1445690nix LLILZ;
    public final /* synthetic */ AtomicInteger LLILZIL;
    public final /* synthetic */ AtomicInteger LLILZLL;
    public final /* synthetic */ AtomicInteger LLIZ;
    public final /* synthetic */ AtomicReference<String> LLIZLLLIL;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445740nj2(C1445720nj0 c1445720nj0, PhotoModeImageUrlModel photoModeImageUrlModel, InterfaceC1445690nix interfaceC1445690nix, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicReference<String> atomicReference, List<PhotoModeImageUrlModel> list, InterfaceC1364105Vn<? super C1445740nj2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1445720nj0;
        this.LLILLL = photoModeImageUrlModel;
        this.LLILZ = interfaceC1445690nix;
        this.LLILZIL = atomicInteger;
        this.LLILZLL = atomicInteger2;
        this.LLIZ = atomicInteger3;
        this.LLIZLLLIL = atomicReference;
        this.LLJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1445740nj2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SrcImageInfo srcImageInfo;
        C1C7U.LIZ("DownloadEditPostPhotoManager@d4bd.downloadPhotoModeResourceNew$1$results$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1445720nj0 c1445720nj0 = this.LLILLJJLI;
                PhotoModeImageUrlModel photoModeImageUrlModel = this.LLILLL;
                InterfaceC1445690nix interfaceC1445690nix = this.LLILZ;
                AtomicInteger atomicInteger = this.LLILZIL;
                AtomicInteger atomicInteger2 = this.LLILZLL;
                AtomicInteger atomicInteger3 = this.LLIZ;
                AtomicReference<String> atomicReference = this.LLIZLLLIL;
                int size = this.LLJ.size();
                this.LL = 1;
                obj = c1445720nj0.LIZ(photoModeImageUrlModel, interfaceC1445690nix, atomicInteger, atomicInteger2, atomicInteger3, atomicReference, size, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DownloadEditPostPhotoManager@d4bd.downloadPhotoModeResourceNew$1$results$1$1$1");
                    return objLJFF;
                }
            }
            srcImageInfo = (SrcImageInfo) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Download failed for image: ");
            sbLIZ.append(e.getMessage());
            C1450070nq1.LIZJ("ImageDownloader", C2188811AlT.LIZIZ(sbLIZ));
            srcImageInfo = null;
        }
        C1C7U.LIZIZ("DownloadEditPostPhotoManager@d4bd.downloadPhotoModeResourceNew$1$results$1$1$1");
        return srcImageInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SrcImageInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
