package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1631770sZ5 extends C2217421BqW implements Function2<Float, Float, Unit> {
    public C1631770sZ5(C1656880tDa c1656880tDa) {
        super(2, c1656880tDa, C1656880tDa.class, "updatePreviewPosition", "updatePreviewPosition(FF)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f, Float f2) {
        ((C1656880tDa) this.receiver).K6(f.floatValue(), f2.floatValue());
        return Unit.LIZ;
    }
}
