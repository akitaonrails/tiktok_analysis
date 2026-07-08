package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tab.tabclean.TabMemoryCleanManager$onJavaMemoryLevelChange$1", f = "TabMemoryCleanManager.kt", l = {231}, m = "invokeSuspend")
public final class C593550NPt extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1591140rVY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593550NPt(C1591140rVY c1591140rVY, InterfaceC1364105Vn<? super C593550NPt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1591140rVY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593550NPt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabMemoryCleanManager@af6d.onJavaMemoryLevelChange$1");
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
            C1591140rVY c1591140rVY = this.LLILLJJLI;
            EnumC593570NPv enumC593570NPv = EnumC593570NPv.HIGH_JAVA_MEMORY;
            this.LL = 1;
            if (c1591140rVY.LIZLLL(enumC593570NPv, this) == objLJFF) {
                C1C7U.LIZIZ("TabMemoryCleanManager@af6d.onJavaMemoryLevelChange$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabMemoryCleanManager@af6d.onJavaMemoryLevelChange$1");
        return unit;
    }
}
