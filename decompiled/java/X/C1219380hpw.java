package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS127S0101000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.manager.DownloadProgressTracker$updateProgress$1$1", f = "DownloadProgressTracker.kt", l = {}, m = "invokeSuspend")
public final class C1219380hpw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1219400hpy LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219380hpw(int i, int i2, InterfaceC1219340hps interfaceC1219340hps, C1219400hpy c1219400hpy, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1219400hpy;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1219400hpy c1219400hpy = this.LL;
        return new C1219380hpw(this.LLILLJJLI, this.LLILZIL, this.LLILLL, c1219400hpy, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadProgressTracker@70b9.updateProgress$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iIntValue = (this.LL.LJ - 1) * ((Number) this.LL.LJFF.getValue()).intValue();
        if (iIntValue == 0) {
            iIntValue = 1;
        }
        int iIntValue2 = this.LL.LJ * ((Number) this.LL.LJFF.getValue()).intValue();
        int i = this.LLILLJJLI;
        C1219400hpy c1219400hpy = this.LL;
        if (i == c1219400hpy.LIZ) {
            iIntValue2 = 99;
        }
        C1211030hcT c1211030hcT = c1219400hpy.LIZJ;
        if (c1211030hcT != null) {
            c1211030hcT.LIZ(iIntValue, iIntValue2, 15000L, new AwS127S0101000_19(this.LLILLL, this.LLILZ, this.LLILZIL, 23));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadProgressTracker@70b9.updateProgress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
