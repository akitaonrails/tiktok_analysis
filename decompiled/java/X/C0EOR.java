package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EOR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EOR extends C2217421BqW implements Function1<Float, Unit> {
    public C0EOR(C0EOX c0eox) {
        super(1, c0eox, C0EOX.class, "applyToAll", "applyToAll(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        ((C0EOX) this.receiver).E5(f.floatValue());
        return Unit.LIZ;
    }
}
