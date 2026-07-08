package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS11S0000001_25;
import kotlin.jvm.internal.AwS1S0000002_25;

/* JADX INFO: renamed from: X.0tck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672480tck extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<AbstractC1686530tzP> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int[] LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ C1672450tch LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ float LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672480tck(int i, int i2, List list, int i3, int[] iArr, float f, C1672450tch c1672450tch, int i4, int i5, float f2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = list;
        this.LLILZ = i3;
        this.LLILZIL = iArr;
        this.LLILZLL = f;
        this.LLIZ = c1672450tch;
        this.LLIZLLLIL = i4;
        this.LLJ = i5;
        this.LLJI = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        float f = this.LL / 2.0f;
        for (int i = 0; i < this.LLILLJJLI; i++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(this.LLILLL, i);
            int i2 = this.LLILZ - abstractC1686530tzP.LL;
            int i3 = this.LLILZIL[i];
            float f2 = ((i3 + (abstractC1686530tzP.LLILLJJLI / 2.0f)) - f) * this.LLILZLL;
            if (this.LLIZ.LIZIZ && i >= 3) {
                int i4 = this.LLIZLLLIL;
                float f3 = -(i4 + ((i - 3) * (this.LLJ + i4)));
                float f4 = this.LLJI;
                AbstractC1683310tuD.LJI(abstractC1683310tuD2, abstractC1686530tzP, i2, i3, new AwS1S0000002_25((f3 * (1.0f - f4)) + f2, f4, 2), 4);
            } else {
                AbstractC1683310tuD.LJI(abstractC1683310tuD2, abstractC1686530tzP, i2, i3, new AwS11S0000001_25(f2, 3), 4);
            }
        }
        return Unit.LIZ;
    }
}
