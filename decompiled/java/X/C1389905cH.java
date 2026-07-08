package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offlinemode.OfflineModeTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.OfflineModeTask$run$1$1", f = "OfflineModeTask.kt", l = {39}, m = "invokeSuspend")
public final class C1389905cH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389905cH(OfflineModeTask offlineModeTask, InterfaceC1364105Vn<? super C1389905cH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1389905cH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeTask@a07d.run$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C625470Og5 c625470Og5 = C625470Og5.LL;
                this.LL = 1;
                if (c625470Og5.h(false, false, this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeTask@a07d.run$1$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LL.LJIIIZ("unLogin clearUserCache success");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = this.LLILLJJLI.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unLogin clearUserCache failed ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeTask@a07d.run$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
