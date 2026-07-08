package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NVF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxPanelKt$TuxPanelContentSheetImpl$1$1$3", f = "TuxPanel.kt", l = {}, m = "invokeSuspend")
public final class C0NVF extends C09AX implements InterfaceC1631620sYq<Float, C0NWD, InterfaceC1364105Vn<? super Float>, Object> {
    public /* synthetic */ float LL;
    public /* synthetic */ C0NWD LLILLJJLI;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVF(C594920NVa<C0NWD> c594920NVa, InterfaceC1364105Vn<? super C0NVF> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c594920NVa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Float fLIZLLL;
        float f;
        C1C7U.LIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        float f2 = this.LL;
        C0NWD c0nwd = this.LLILLJJLI;
        C0NWC c0nwc = C0NWC.LIZ;
        if (!Intrinsics.LJFF(c0nwd, c0nwc)) {
            float fLIZLLL2 = this.LLILLL.LIZIZ().LIZLLL(c0nwc);
            float fLIZLLL3 = this.LLILLL.LIZIZ().LIZLLL(C0NWB.LIZ);
            if (f2 < fLIZLLL3) {
                f = 1.0f;
            } else {
                f = 1 - ((f2 - fLIZLLL3) / (fLIZLLL2 - fLIZLLL3));
            }
            fLIZLLL = C2286608xc.LIZLLL(f);
        } else {
            fLIZLLL = null;
        }
        C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1$3");
        return fLIZLLL;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Float f, C0NWD c0nwd, InterfaceC1364105Vn<? super Float> interfaceC1364105Vn) {
        float fFloatValue = f.floatValue();
        C0NVF c0nvf = new C0NVF(this.LLILLL, interfaceC1364105Vn);
        c0nvf.LL = fFloatValue;
        c0nvf.LLILLJJLI = c0nwd;
        return c0nvf.invokeSuspend(Unit.LIZ);
    }
}
