package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS134S0201000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M6N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.AIRemixDraftBoxEntranceViewHolder$updateDefaultUI$1", f = "AIRemixDraftBoxEntranceViewHolder.kt", l = {299}, m = "invokeSuspend")
public final class C0M6N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0M6V LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M6N(C0M6V c0m6v, int i, InterfaceC1364105Vn<? super C0M6N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0m6v;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M6N(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixDraftBoxEntranceViewHolder@68df.updateDefaultUI$1");
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
            InterfaceC562800M5m interfaceC562800M5m = (InterfaceC562800M5m) this.LLILLJJLI.LLJJIJI.getValue();
            if (interfaceC562800M5m != null) {
                this.LL = 1;
                obj = interfaceC562800M5m.LJI(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.updateDefaultUI$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.updateDefaultUI$1");
            return unit;
        }
        C00IR c00ir = (C00IR) obj;
        if (c00ir != null) {
            C01TT.LIZLLL(new AwS134S0201000_8(this.LLILLJJLI, c00ir, this.LLILLL, 10));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.updateDefaultUI$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
