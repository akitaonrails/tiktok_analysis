package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866670yfx extends C09AY implements Function0<Float> {
    public final /* synthetic */ C1883540z7A LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1866670yfx(C1883540z7A c1883540z7A) {
        super(0);
        this.LL = c1883540z7A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(((Number) this.LL.LJI.getValue()).floatValue() / ((int) this.LL.LIZJ));
    }
}
