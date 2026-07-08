package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263281DiI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ ReusedUISlotAssem<RECEIVER> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263281DiI(Function0<Unit> function0, ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, Function0<Unit> function02) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = reusedUISlotAssem;
        this.LLILLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        C03H8 c03h8 = this.LLILLJJLI;
        C2263401DiU c2263401DiU = new C2263401DiU(this.LLILLL);
        c03h8.getClass();
        ReusedUISlotAssem.lp(c2263401DiU);
        return Unit.LIZ;
    }
}
