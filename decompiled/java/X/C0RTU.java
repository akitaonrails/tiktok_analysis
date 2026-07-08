package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RTU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ List<ReusedAssem<?>> LLILLJJLI;
    public final /* synthetic */ AssemSupervisor LLILLL;
    public final /* synthetic */ C0RTC<?> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RTU(Object obj, List<? extends ReusedAssem<?>> list, AssemSupervisor assemSupervisor, C0RTC<?> c0rtc) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = list;
        this.LLILLL = assemSupervisor;
        this.LLILZ = c0rtc;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SxQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C724270Sb3 c724270Sb3;
        if (!C0RTV.LIZ(this.LL.getLifecycle())) {
            for (ReusedAssem<?> reusedAssem : this.LLILLJJLI) {
                AssemSupervisor assemSupervisor = this.LLILLL;
                this.LLILZ.getClass();
                if (assemSupervisor.LJII(reusedAssem, null) && (c724270Sb3 = this.LL.LLJI) != null) {
                    c724270Sb3.LIZLLL(reusedAssem, c724270Sb3.LLJI);
                }
            }
        }
        return Unit.LIZ;
    }
}
