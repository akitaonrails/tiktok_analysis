package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C485001ui extends C2217421BqW implements Function1<Float, Unit> {
    public C485001ui(Object obj) {
        super(1, obj, InterfaceC395901gL.class, "onScaleChange", "onScaleChange(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        ((InterfaceC395901gL) this.receiver).LIZJ(f.floatValue());
        return Unit.LIZ;
    }
}
