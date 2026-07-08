package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1008030cL3 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1008030cL3(InterfaceC1014270cV7 interfaceC1014270cV7) {
        super(1, interfaceC1014270cV7, C1007900cKq.class, "onShakeDetected", "onShakeDetected(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C1007900cKq) this.receiver).LJIJJLI(bool.booleanValue());
        return Unit.LIZ;
    }
}
