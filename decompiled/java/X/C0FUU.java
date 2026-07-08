package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FUU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FUU extends C1696260uF6 implements Function1<Float, Unit> {
    public C0FUU(C0FUL c0ful) {
        super(1, c0ful, C0FUL.class, "onRotationEnd", "onRotationEnd(F)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        ((C0FUM) this.receiver).LJIIIZ(f.floatValue());
        return Unit.LIZ;
    }
}
