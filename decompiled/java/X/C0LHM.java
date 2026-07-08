package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.EoyResourceDownloader$createDownloadListener$handleRetry$1", f = "CelebrationRepo.kt", l = {932}, m = "invokeSuspend")
public final class C0LHM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0LHU LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ AbsDownloadListener LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LHM(String str, C0LHU c0lhu, List<String> list, AbsDownloadListener absDownloadListener, InterfaceC1364105Vn<? super C0LHM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c0lhu;
        this.LLILZ = list;
        this.LLILZIL = absDownloadListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LHM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EoyResourceDownloader@603b.createDownloadListener$handleRetry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Retry] Starting retry download for URL: ");
            sbLIZ.append(this.LLILLJJLI);
            C201955140j.LJIILL(c554890LpX, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ));
            C0LHL c0lhl = C0LHL.LIZ;
            String str = this.LLILLJJLI;
            C0LHU c0lhu = this.LLILLL;
            List<String> list = this.LLILZ;
            AbsDownloadListener absDownloadListener = this.LLILZIL;
            this.LL = 1;
            if (c0lhl.LIZJ(str, c0lhu, list, absDownloadListener, true, this) == objLJFF) {
                C1C7U.LIZIZ("EoyResourceDownloader@603b.createDownloadListener$handleRetry$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EoyResourceDownloader@603b.createDownloadListener$handleRetry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
