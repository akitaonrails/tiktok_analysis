package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OC7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OC7 extends C2217421BqW implements Function1<ReusedAssem<?>, Unit> {
    public C0OC7(C724270Sb3 c724270Sb3) {
        super(1, c724270Sb3, C724270Sb3.class, "iterateOnProxyUnBound", "iterateOnProxyUnBound(Lcom/bytedance/assem/arch/reused/ReusedAssem;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReusedAssem<?> reusedAssem) {
        InterfaceC712990Rxx interfaceC712990Rxx;
        ReusedAssem<?> reusedAssem2 = reusedAssem;
        this.receiver.getClass();
        reusedAssem2.getClass();
        if ((reusedAssem2 instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) reusedAssem2) != null) {
            interfaceC712990Rxx.wr();
        }
        return Unit.LIZ;
    }
}
