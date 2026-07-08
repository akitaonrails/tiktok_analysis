package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397180mSi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1397150mSf LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1397180mSi(AbstractC1397150mSf abstractC1397150mSf, long j, boolean z, boolean z2) {
        super(0);
        this.LL = abstractC1397150mSf;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1396790mS5 c1396790mS5;
        C1396790mS5 c1396790mS52;
        if (!this.LL.LJII.isEmpty()) {
            Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LL.LJII.iterator();
            while (it2.hasNext() && this.LL.LJII(this.LLILLJJLI, it2.next())) {
                it2.remove();
            }
        }
        if (this.LL.LJII.isEmpty() && (c1396790mS52 = this.LL.LIZJ) != null) {
            c1396790mS52.LIZIZ(new AwS600S0100000_21(this, 297));
        }
        AbstractC1397150mSf abstractC1397150mSf = this.LL;
        abstractC1397150mSf.LJFF = 0;
        for (T t : abstractC1397150mSf.LJI) {
            this.LL.LJFF += t.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        }
        if (this.LLILZ && (c1396790mS5 = this.LL.LIZJ) != null) {
            Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it3 = c1396790mS5.LIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LJIL(c1396790mS5.LIZIZ);
            }
        }
        return Unit.LIZ;
    }
}
