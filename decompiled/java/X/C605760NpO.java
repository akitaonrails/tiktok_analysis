package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskScheduler$processScheduling$2", f = "TaskScheduler.kt", l = {179}, m = "invokeSuspend")
public final class C605760NpO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20179013xU LLILLJJLI;
    public final /* synthetic */ C20180313xh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605760NpO(C20179013xU c20179013xU, C20180313xh c20180313xh, InterfaceC1364105Vn<? super C605760NpO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20179013xU;
        this.LLILLL = c20180313xh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605760NpO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@23c5.processScheduling$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C20179013xU c20179013xU = this.LLILLJJLI;
                C20180313xh c20180313xh = this.LLILLL;
                this.LL = 1;
                if (c20179013xU.LIZJ(c20180313xh, this) == objLJFF) {
                    C1C7U.LIZIZ("TaskScheduler@23c5.processScheduling$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LIZLLL.LJJJJJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskScheduler@23c5.processScheduling$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
