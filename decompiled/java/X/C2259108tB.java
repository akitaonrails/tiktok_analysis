package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine$dispatchSyncTaskByPack$2", f = "EDADataSyncEngine.kt", l = {}, m = "invokeSuspend")
public final class C2259108tB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<Map<String, Long>> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259108tB(C259800zU<Map<String, Long>> c259800zU, long j, long j2, InterfaceC1364105Vn<? super C2259108tB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2259108tB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.dispatchSyncTaskByPack$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2259208tC c2259208tC = C2259208tC.LIZ;
        Map<String, Long> map = this.LL.element;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        c2259208tC.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "cost");
        c0lab.LIZIZ(j2, "diff_cost");
        int i = 0;
        for (Object obj2 : C13LP.LL(C13LP.LJLLLL(new C512401z8(50), map.entrySet()), 5)) {
            int i2 = i + 1;
            if (i >= 0) {
                Map.Entry entry = (Map.Entry) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    c0lab.LJ("top5_task", (String) entry.getKey());
                                    c0lab.LIZIZ(((Number) entry.getValue()).longValue(), "top5_cost");
                                }
                            } else {
                                c0lab.LJ("top4_task", (String) entry.getKey());
                                c0lab.LIZIZ(((Number) entry.getValue()).longValue(), "top4_cost");
                            }
                        } else {
                            c0lab.LJ("top3_task", (String) entry.getKey());
                            c0lab.LIZIZ(((Number) entry.getValue()).longValue(), "top3_cost");
                        }
                    } else {
                        c0lab.LJ("top2_task", (String) entry.getKey());
                        c0lab.LIZIZ(((Number) entry.getValue()).longValue(), "top2_cost");
                    }
                } else {
                    c0lab.LJ("top1_task", (String) entry.getKey());
                    c0lab.LIZIZ(((Number) entry.getValue()).longValue(), "top1_cost");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C20684815ws.LJIILLIIL("tool_performance_editor_pro_data_sync", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EDADataSyncEngine@8a7.dispatchSyncTaskByPack$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
