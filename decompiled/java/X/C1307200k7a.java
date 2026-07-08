package X;

import com.bytedance.android.starship.engine.graph.config.NodeCommonConfig;
import com.bytedance.android.starship.engine.graph.config.NodeTraceConfig;
import com.bytedance.android.starship.engine.graph.config.SamplingConfig;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS564S0100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0k7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler$process$3", f = "SerialScheduler.kt", l = {342}, m = "invokeSuspend")
public final class C1307200k7a extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Task LLILZ;
    public final /* synthetic */ C1307280k7i LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307200k7a(Task task, C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307200k7a> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZ = task;
        this.LLILZIL = c1307280k7i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1307200k7a(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        ?? LIZ;
        long jCurrentTimeMillis;
        Task task;
        InterfaceC1307160k7W interfaceC1307160k7W;
        SamplingConfig samplingConfig;
        NodeTraceConfig nodeTraceConfig;
        ?? r6;
        InterfaceC1307160k7W interfaceC1307160k7W2;
        C1C7U.LIZ("SerialScheduler@9e09.process$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LLILLJJLI;
                    int i2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    r6 = i2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Task task2 = this.LLILZ;
                if (task2.LLIZLLLIL != null) {
                    NodeCommonConfig nodeCommonConfig = task2.LL.getConfig().commonConfig;
                    if (nodeCommonConfig != null && (nodeTraceConfig = nodeCommonConfig.traceConfig) != null) {
                        samplingConfig = nodeTraceConfig.nodeSpanDetailSampling;
                    } else {
                        samplingConfig = null;
                    }
                    LIZ = C1307070k7N.LIZ(samplingConfig, null);
                } else {
                    LIZ = 0;
                }
                if (LIZ != 0 && (interfaceC1307160k7W = (task = this.LLILZ).LLIZLLLIL) != null) {
                    interfaceC1307160k7W.LLIIIILZ("input", task.LLILZIL);
                }
                Task task3 = this.LLILZ;
                C1307280k7i c1307280k7i = this.LLILZIL;
                jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC1307210k7b interfaceC1307210k7b = task3.LL;
                this.LL = LIZ;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 1;
                r6 = LIZ;
                if (interfaceC1307210k7b.LIZJ(c1307280k7i, task3, this) == objLJFF) {
                    C1C7U.LIZIZ("SerialScheduler@9e09.process$3");
                    return objLJFF;
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            InterfaceC1307160k7W interfaceC1307160k7W3 = this.LLILZ.LLIZLLLIL;
            if (interfaceC1307160k7W3 != null) {
                interfaceC1307160k7W3.LJJLIIIJLLLLLLLZ(C2286608xc.LJFF(jCurrentTimeMillis2), "node_cost_time");
            }
            Task task4 = this.LLILZ;
            task4.LLILLL = EnumC1307350k7p.DONE;
            if (r6 != 0 && (interfaceC1307160k7W2 = task4.LLIZLLLIL) != null) {
                interfaceC1307160k7W2.LLIIIILZ("output", task4.LLILZLL);
            }
            C1306430k6L.LIZ(new AwS564S0100000_20(this.LLILZ, 39));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String strLIZJ = this.LLILZIL.LIZJ(this.LLILZ.LL.getId());
            String message = th.getMessage();
            Long lLJFF = C2286608xc.LJFF(this.LLILZ.LL.getId());
            C1308190k9B c1308190k9B = new C1308190k9B("run_node_error");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("run_node_error_");
            sbLIZ.append(strLIZJ);
            c1308190k9B.LJLL("trace_type", C2188811AlT.LIZIZ(sbLIZ));
            if (lLJFF != null) {
                jLongValue = lLJFF.longValue();
            } else {
                jLongValue = 0;
            }
            c1308190k9B.LIZ(Long.valueOf(jLongValue), "node_id");
            if (message == null) {
                message = "";
            }
            c1308190k9B.LIZ(message, "error_msg");
            c1308190k9B.release();
            Task task5 = this.LLILZ;
            task5.LLILZLL.LIZ = th;
            task5.LLILLL = EnumC1307350k7p.FAILED;
            InterfaceC1307160k7W interfaceC1307160k7W4 = task5.LLIZLLLIL;
            if (interfaceC1307160k7W4 != null) {
                interfaceC1307160k7W4.LLIIIILZ("input", task5.LLILZIL);
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "unknown";
                }
                interfaceC1307160k7W4.LJJIJIL("error_msg", message2);
            }
            C1306430k6L.LIZ(new AwS564S0100000_20(this.LLILZ, 40));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SerialScheduler@9e09.process$3");
        return unit;
    }
}
