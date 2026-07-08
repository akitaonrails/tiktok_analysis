package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C173700lb extends C09AY implements Function0<Float> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C173700lb(float f, float f2, float f3, int i, int i2, int i3) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = f;
        this.LLILZ = i3;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        float f = 0.0f;
        if (i >= i2 - 1 && i <= i2 + 1) {
            float f2 = this.LLILLL;
            float fLIZLLL = C13LZ.LIZLLL(1.0f - (Math.abs((((this.LLILZIL + (i * f2)) - ((i2 * f2) + this.LLILZ)) + (f2 / 2.0f)) - this.LLILZLL) / this.LLILLL), 0.0f, 1.0f);
            f = ((1.0f - fLIZLLL) * 0.0f) + (fLIZLLL * 1.0f);
        }
        return Float.valueOf(f);
    }
}
