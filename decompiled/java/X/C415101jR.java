package X;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.controll.EPModelUpdateExecutor$execute$2", f = "EPSyncTaskManager.kt", l = {340}, m = "invokeSuspend")
public final class C415101jR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC346201Wa<Unit>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C415101jR(List<InterfaceC346201Wa<Unit>> list, InterfaceC1364105Vn<? super C415101jR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C415101jR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPModelUpdateExecutor@6e21.execute$2");
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
            InterfaceC346201Wa[] interfaceC346201WaArr = (InterfaceC346201Wa[]) this.LLILLJJLI.toArray(new InterfaceC346201Wa[0]);
            C23127094j c23127094jLJJII = C09IC.LJJII((InterfaceC346201Wa[]) Arrays.copyOf(interfaceC346201WaArr, interfaceC346201WaArr.length));
            this.LL = 1;
            if (C09IC.LJI(c23127094jLJJII, this) == objLJFF) {
                C1C7U.LIZIZ("EPModelUpdateExecutor@6e21.execute$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPModelUpdateExecutor@6e21.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
