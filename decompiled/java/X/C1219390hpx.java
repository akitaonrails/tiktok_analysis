package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.manager.DownloadProgressTracker$updateProgress$1", f = "DownloadProgressTracker.kt", l = {}, m = "invokeSuspend")
public final class C1219390hpx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1219400hpy LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219390hpx(int i, int i2, InterfaceC1219340hps interfaceC1219340hps, C1219400hpy c1219400hpy, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c1219400hpy;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        int i = this.LL;
        C1219400hpy c1219400hpy = this.LLILLJJLI;
        return new C1219390hpx(i, this.LLILZIL, this.LLILLL, c1219400hpy, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadProgressTracker@70b9.updateProgress$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0 && ((Number) this.LLILLJJLI.LJFF.getValue()).intValue() > 0 && this.LLILLJJLI.LJ <= this.LLILLJJLI.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateProgress --> newDownloadFiles:");
            sbLIZ.append(this.LL);
            sbLIZ.append(" , alreadyDownloadFiles:");
            sbLIZ.append(this.LLILLJJLI.LJ);
            sbLIZ.append(" ,needDownloadFiles:");
            sbLIZ.append(this.LLILLJJLI.LIZ);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            int i = this.LL;
            C1219400hpy c1219400hpy = this.LLILLJJLI;
            int i2 = i + c1219400hpy.LIZIZ;
            int i3 = c1219400hpy.LJ + 1;
            C1219400hpy c1219400hpy2 = this.LLILLJJLI;
            if (i2 <= c1219400hpy2.LIZ && i3 <= i2) {
                c1219400hpy2.LJ = i2;
                C1219400hpy c1219400hpy3 = this.LLILLJJLI;
                C23250099c.LIZLLL(c1219400hpy3.LIZLLL, null, null, new C1219380hpw(this.LL, this.LLILZIL, this.LLILLL, c1219400hpy3, this.LLILZ, null), 3);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DownloadProgressTracker@70b9.updateProgress$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DownloadProgressTracker@70b9.updateProgress$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
