package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1359805Tw extends C09AY implements Function2<C20066813fO, Float, Unit> {
    public final /* synthetic */ InterfaceC1690500u5o LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ C05P0<Float> LLIZ;
    public final /* synthetic */ float LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359805Tw(InterfaceC1690500u5o interfaceC1690500u5o, C1690050u55 c1690050u55, int i, InterfaceC497601wk interfaceC497601wk, float f, float f2, C05P0<Float> c05p0, float f3) {
        super(2);
        this.LL = interfaceC1690500u5o;
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = i;
        this.LLILZ = interfaceC497601wk;
        this.LLILZIL = f;
        this.LLILZLL = f2;
        this.LLIZ = c05p0;
        this.LLIZLLLIL = f3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C20066813fO c20066813fO, Float f) {
        float fFloatValue = f.floatValue();
        c20066813fO.LIZ();
        float fLJJJJLL = this.LL.LJJJJLL(this.LLILZIL - this.LLILZLL);
        int iLJFF = this.LLILLJJLI.LJIIIZ().LJFF();
        float f2 = 0.0f;
        if (fLJJJJLL > 0.0f && iLJFF > 0) {
            C05P0<Float> c05p0 = this.LLIZ;
            c05p0.setValue(Float.valueOf(C13LZ.LIZLLL(c05p0.getValue().floatValue() + (fFloatValue / fLJJJJLL), 0.0f, 1.0f)));
            float fLJJJJLL2 = this.LL.LJJJJLL(this.LLIZLLLIL);
            float fLIZ = (((iLJFF / this.LLILLL) + 1) * fLJJJJLL2) - ((int) (this.LLILLJJLI.LJIIIZ().LIZ() & 4294967295L));
            if (fLIZ >= 0.0f) {
                f2 = fLIZ;
            }
            float fFloatValue2 = this.LLIZ.getValue().floatValue() * f2;
            int i = (int) (fFloatValue2 / fLJJJJLL2);
            int i2 = iLJFF - 1;
            int i3 = 0;
            int iLJ = C13LZ.LJ(this.LLILLL * i, 0, i2);
            int i4 = (int) (fFloatValue2 - (i * fLJJJJLL2));
            if (i4 >= 0) {
                i3 = i4;
            }
            C23250099c.LIZLLL(this.LLILZ, null, null, new C05PE(this.LLILLJJLI, iLJ, i3, null), 3);
        }
        return Unit.LIZ;
    }
}
