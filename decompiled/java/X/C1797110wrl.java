package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.utils.PayManager$chargePayCommon$2", f = "PayManager.kt", l = {492}, m = "invokeSuspend")
public final class C1797110wrl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C362440EIw LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1776960wLG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797110wrl(C362440EIw c362440EIw, String str, C1776960wLG c1776960wLG, InterfaceC1364105Vn<? super C1797110wrl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c362440EIw;
        this.LLILLL = str;
        this.LLILZ = c1776960wLG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1797110wrl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PayManager@437b.chargePayCommon$2");
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
            C1797100wrk c1797100wrk = C1797100wrk.LIZIZ;
            C1568880qve c1568880qve = c1797100wrk.LIZ;
            if (c1568880qve == null) {
                synchronized (c1797100wrk) {
                    c1568880qve = c1797100wrk.LIZ;
                    if (c1568880qve == null) {
                        c1568880qve = new C1568880qve();
                        c1797100wrk.LIZ = c1568880qve;
                    }
                }
            }
            double d = this.LLILLJJLI.element;
            C1568850qvb c1568850qvb = new C1568850qvb(this.LLILZ.LIZIZ, this.LLILLL, d);
            this.LL = 1;
            if (c1568880qve.LJ(c1568850qvb, this) == objLJFF) {
                C1C7U.LIZIZ("PayManager@437b.chargePayCommon$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PayManager@437b.chargePayCommon$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
