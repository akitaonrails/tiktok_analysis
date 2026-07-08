package X;

import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0WX5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService$stripAndDownload$2$1", f = "ReplaceMusicDownloadService.kt", l = {96}, m = "invokeSuspend")
public final class C0WX5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReplaceMusicDownloadService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WX5(ReplaceMusicDownloadService replaceMusicDownloadService, String str, InterfaceC1364105Vn<? super C0WX5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = replaceMusicDownloadService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WX5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicDownloadService@2b3f.stripAndDownload$2$1");
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
            ReplaceMusicDownloadService replaceMusicDownloadService = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            replaceMusicDownloadService.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
                C201955140j.LJIILL(C201962140q.LIZIZ, "ws", "try connect ws");
                c2203431BLp.LJ("remove_copyright_music");
            }
            c2203431BLp.LJI(33554819, 0, (ReplaceMusicDownloadService.MuteStripStatusUpdateListener) replaceMusicDownloadService.LIZIZ.getValue());
            ReplaceMusicDownloadService.MuteStripStatusUpdateListener muteStripStatusUpdateListener = (ReplaceMusicDownloadService.MuteStripStatusUpdateListener) replaceMusicDownloadService.LIZIZ.getValue();
            muteStripStatusUpdateListener.LL.put(str, new AwS553S0100000_9(c2252611DEt, 1680));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("ReplaceMusicDownloadService@2b3f.stripAndDownload$2$1");
                return objLJFF;
            }
        }
        C201955140j.LJIILL(C201962140q.LIZIZ, "MusicStripV2", "ws back");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicDownloadService@2b3f.stripAndDownload$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
