package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C724340SbA extends C2217421BqW implements Function1<ReusedAssem<?>, Unit> {
    public C724340SbA(Object obj) {
        super(1, obj, C724270Sb3.class, "triggerAssemBindProxy", "triggerAssemBindProxy(Lcom/bytedance/assem/arch/reused/ReusedAssem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReusedAssem<?> reusedAssem) {
        ((C724270Sb3) this.receiver).LJIIL(reusedAssem);
        return Unit.LIZ;
    }
}
