package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303380k1Q extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303380k1Q(float f, C05P0<Boolean> c05p0) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        boolean z;
        f.floatValue();
        C05P0<Boolean> c05p0 = this.LLILLJJLI;
        if (this.LL == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        c05p0.setValue(Boolean.valueOf(z));
        return Unit.LIZ;
    }
}
