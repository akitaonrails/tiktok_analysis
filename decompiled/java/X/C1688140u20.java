package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688140u20 extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ int[] LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AbstractC1686530tzP[] LLILZIL;
    public final /* synthetic */ InterfaceC1688100u1w LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ EnumC1671200tag LLIZLLLIL;
    public final /* synthetic */ int LLJ = 0;
    public final /* synthetic */ int[] LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688140u20(int[] iArr, int i, int i2, int i3, AbstractC1686530tzP[] abstractC1686530tzPArr, InterfaceC1688100u1w interfaceC1688100u1w, int i4, EnumC1671200tag enumC1671200tag, int[] iArr2) {
        super(1);
        this.LL = iArr;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = abstractC1686530tzPArr;
        this.LLILZLL = interfaceC1688100u1w;
        this.LLIZ = i4;
        this.LLIZLLLIL = enumC1671200tag;
        this.LLJI = iArr2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        int i;
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        int[] iArr = this.LL;
        if (iArr != null) {
            i = iArr[this.LLILLJJLI];
        } else {
            i = 0;
        }
        for (int i2 = this.LLILLL; i2 < this.LLILZ; i2++) {
            AbstractC1686530tzP abstractC1686530tzP = this.LLILZIL[i2];
            int iLJIIIZ = this.LLILZLL.LJIIIZ(this.LLIZ, this.LLJ, abstractC1686530tzP, this.LLIZLLLIL) + i;
            if (this.LLILZLL.LJII()) {
                abstractC1683310tuD2.LIZLLL(abstractC1686530tzP, this.LLJI[i2 - this.LLILLL], iLJIIIZ, 0.0f);
            } else {
                abstractC1683310tuD2.LIZLLL(abstractC1686530tzP, iLJIIIZ, this.LLJI[i2 - this.LLILLL], 0.0f);
            }
        }
        return Unit.LIZ;
    }
}
