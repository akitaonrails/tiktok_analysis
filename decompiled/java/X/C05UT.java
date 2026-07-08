package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05UT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05UT extends C09AY implements Function0<Pair<? extends Integer, ? extends Float>> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UT(float f, float f2, float f3, int i, int i2, int i3) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pair<? extends Integer, ? extends Float> invoke() {
        return new Pair<>(Integer.valueOf(C13LZ.LJ(this.LLILZIL + ((int) Math.rint(r4 / r1)), 0, this.LLILZLL - 1)), Float.valueOf(Math.abs((this.LLILZ - ((this.LL + (this.LLILLJJLI / 2)) - this.LLILLL)) % this.LLILLJJLI)));
    }
}
