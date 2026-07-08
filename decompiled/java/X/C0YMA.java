package X;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YMA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.opt.SDKMessagePuller$manualPullMsg$1", f = "SDKMessagePuller.kt", l = {}, m = "invokeSuspend")
public final class C0YMA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YM9 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YMA(C0YM9 c0ym9, int i, Map<String, ? extends Object> map, boolean z, InterfaceC1364105Vn<? super C0YMA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ym9;
        this.LLILLJJLI = i;
        this.LLILLL = map;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YMA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SDKMessagePuller@5840.manualPullMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZIZ()) {
            C882400YjW c882400YjW = C882400YjW.LIZ;
            C0YM2 c0ym2 = this.LL.LIZ;
            c882400YjW.getClass();
            C882400YjW.LIZIZ(c0ym2).LJIIJJI(this.LLILLJJLI, 4, "inbox_not_initialized", this.LLILLL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SDKMessagePuller@5840.manualPullMsg$1");
            return unit;
        }
        if (((Number) C293410Bel.LIZ.getValue()).intValue() <= 1 && !this.LLILZ && SystemClock.uptimeMillis() - this.LL.LIZLLL <= 10000) {
            C882400YjW c882400YjW2 = C882400YjW.LIZ;
            C0YM2 c0ym22 = this.LL.LIZ;
            c882400YjW2.getClass();
            C882400YjW.LIZIZ(c0ym22).LJIIJJI(this.LLILLJJLI, 4, "frequency_control", this.LLILLL);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SDKMessagePuller@5840.manualPullMsg$1");
            return unit2;
        }
        this.LL.LIZLLL = SystemClock.uptimeMillis();
        int i = this.LLILLJJLI;
        if (i == -2) {
            this.LL.LIZJ(4, this.LLILZ);
        } else {
            C0YM9 c0ym9 = this.LL;
            Map<String, Object> map = this.LLILLL;
            boolean z = this.LLILZ;
            c0ym9.getClass();
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("realPullMessage: reason ");
            sbLIZ.append(4);
            sbLIZ.append(", forcePull ");
            sbLIZ.append(z);
            C882690Yjz.LJIIIZ("SDKMessagePuller", C2188811AlT.LIZIZ(sbLIZ));
            c0ym9.LIZ().LIZ().LIZIZ(i, z, map, 4);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SDKMessagePuller@5840.manualPullMsg$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
