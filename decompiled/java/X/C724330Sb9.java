package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C724330Sb9 extends C1696260uF6 implements Function1<ReusedAssem<?>, Unit> {
    public C724330Sb9(C724270Sb3 c724270Sb3) {
        super(1, c724270Sb3, C724270Sb3.class, "onProxyBound", "onProxyBound(Lcom/bytedance/assem/arch/reused/ReusedAssem;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReusedAssem<?> reusedAssem) {
        ((C724270Sb3) this.receiver).LJIIIIZZ(reusedAssem, true);
        return Unit.LIZ;
    }
}
