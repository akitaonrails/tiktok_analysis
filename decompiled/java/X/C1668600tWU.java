package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668600tWU extends C09AY implements Function0<C1668610tWV> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668600tWU(int i, int i2, float f, float f2, float f3, float f4, int i3, float f5, float f6) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = f3;
        this.LLILZLL = f4;
        this.LLIZ = i3;
        this.LLIZLLLIL = f5;
        this.LLJ = f6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1668610tWV invoke() {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        if (i < i2 + (-1) || i > i2 + 1) {
            return new C1668610tWV(this.LLILLL, (i < i2 ? -1.0f : 1.0f) * this.LLILZ * this.LLILZIL);
        }
        float f = i2;
        float f2 = this.LLILZLL;
        float f3 = ((this.LLIZLLLIL + (i * f2)) - ((f * f2) + this.LLIZ)) + (f2 / 2.0f);
        float fLIZLLL = C13LZ.LIZLLL(1.0f - (Math.abs(f3 - this.LLJ) / this.LLILZLL), 0.0f, 1.0f);
        float f4 = ((1.0f - fLIZLLL) * this.LLILLL) + (fLIZLLL * 1.0f);
        return new C1668610tWV(f4, (f3 >= this.LLJ ? 1.0f : -1.0f) * ((this.LLILZLL * (1.0f - f4)) / 2.0f) * this.LLILZIL);
    }
}
