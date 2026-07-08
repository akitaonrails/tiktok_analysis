package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCDebugToolLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.AIGCDebugToolLogger$deleteTaskEvents$1", f = "AIGCDebugToolLogger.kt", l = {}, m = "invokeSuspend")
public final class C360401ac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCDebugToolLogger LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C360401ac(AIGCDebugToolLogger aIGCDebugToolLogger, String str, InterfaceC1364105Vn<? super C360401ac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCDebugToolLogger;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C360401ac(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCDebugToolLogger@e62d.deleteTaskEvents$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            AIGCDebugToolLogger aIGCDebugToolLogger = this.LL;
            String str = this.LLILLJJLI;
            aIGCDebugToolLogger.getClass();
            C0VSJ c0vsjLJFF = AIGCDebugToolLogger.LJFF(str);
            if (c0vsjLJFF.exists()) {
                if (c0vsjLJFF.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Successfully deleted task events for: ");
                    sbLIZ.append(this.LLILLJJLI);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to delete task events for: ");
                    sbLIZ2.append(this.LLILLJJLI);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCDebugToolLogger@e62d.deleteTaskEvents$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
