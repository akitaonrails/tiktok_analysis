package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.EoyResourceDownloader$createDownloadListener$1$onSuccessed$1", f = "CelebrationRepo.kt", l = {955}, m = "invokeSuspend")
public final class C0LHR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1364105Vn LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<C189200o6<? extends DownloadInfo>> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0LHU LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ AbsDownloadListener LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LHR(InterfaceC1364105Vn<? super C189200o6<? extends DownloadInfo>> interfaceC1364105Vn, String str, C0LHU c0lhu, List<String> list, AbsDownloadListener absDownloadListener, InterfaceC1364105Vn<? super C0LHR> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = str;
        this.LLILZIL = c0lhu;
        this.LLILZLL = list;
        this.LLIZ = absDownloadListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LHR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn<C189200o6<? extends DownloadInfo>> interfaceC1364105Vn;
        Object objLIZ;
        C1C7U.LIZ("EoyResourceDownloader@603b.createDownloadListener$1$onSuccessed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1364105Vn = this.LL;
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC1364105Vn = this.LLILLL;
            String str = this.LLILZ;
            C0LHU c0lhu = this.LLILZIL;
            List<String> list = this.LLILZLL;
            AbsDownloadListener absDownloadListener = this.LLIZ;
            this.LL = interfaceC1364105Vn;
            this.LLILLJJLI = 1;
            objLIZ = C0LHL.LIZ(str, c0lhu, list, absDownloadListener, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("EoyResourceDownloader@603b.createDownloadListener$1$onSuccessed$1");
                return objLJFF;
            }
        }
        C2243608qg.LIZ(C189200o6.m1boximpl(objLIZ), interfaceC1364105Vn);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EoyResourceDownloader@603b.createDownloadListener$1$onSuccessed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
