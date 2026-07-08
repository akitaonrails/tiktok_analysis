package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YMB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.opt.SDKMessagePuller$netPullMessage$1", f = "SDKMessagePuller.kt", l = {}, m = "invokeSuspend")
public final class C0YMB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YM9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YMB(C0YM9 c0ym9, InterfaceC1364105Vn<? super C0YMB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ym9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YMB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SDKMessagePuller@5840.netPullMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZIZ()) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("SDKMessagePuller", "skip net pull, some inbox not init");
            C882400YjW.LIZIZ(this.LL.LIZ).LJIIJJI(-2, 3, "inbox_not_initialized", null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SDKMessagePuller@5840.netPullMessage$1");
            return unit;
        }
        if (((Number) C293410Bel.LIZ.getValue()).intValue() <= 1 && SystemClock.uptimeMillis() - this.LL.LIZLLL <= Mp4ScreenVideoLoadTimeout.CONTROL) {
            C882400YjW c882400YjW = C882400YjW.LIZ;
            C0YM2 c0ym2 = this.LL.LIZ;
            c882400YjW.getClass();
            C882400YjW.LIZIZ(c0ym2).LJIIJJI(-2, 3, "frequency_control", null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SDKMessagePuller@5840.netPullMessage$1");
            return unit2;
        }
        this.LL.LIZLLL = SystemClock.uptimeMillis();
        this.LL.LIZJ(3, false);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SDKMessagePuller@5840.netPullMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
