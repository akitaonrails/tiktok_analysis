package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S0011000_1;

/* JADX INFO: renamed from: X.03lR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C937103lR extends C09AY implements Function1<C936903lP, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ SeaSkuSpecViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C937103lR(int i, SeaSkuSpecViewModel seaSkuSpecViewModel, boolean z, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = seaSkuSpecViewModel;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C936903lP c936903lP) {
        C908703gr c908703gr;
        C936903lP c936903lP2 = c936903lP;
        int i = c936903lP2.LLILZIL.LIZ;
        int i2 = this.LL;
        if (i != i2) {
            this.LLILLJJLI.setState(new AwS3S0011000_1(i2, this.LLILZ, 2));
            if (this.LLILLL && (c908703gr = this.LLILLJJLI.LLJILJILJ) != null) {
                c908703gr.LIZJ(i, this.LL, c936903lP2.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
