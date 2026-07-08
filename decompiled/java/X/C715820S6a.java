package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0S6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715820S6a extends C09AY implements Function2<C03H5, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715820S6a(C718770SHj c718770SHj) {
        super(2);
        this.LL = c718770SHj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Integer> c291001Au) {
        C0SIV c0siv;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            int iIntValue = ((Number) c291001Au2.LIZ).intValue();
            C718770SHj c718770SHj = this.LL;
            if ((iIntValue & 1) != 0) {
                c718770SHj.LJIIL("click_mask");
            }
            if ((iIntValue & 2) != 0 && (c0siv = c718770SHj.LL.LLLLJ) != null) {
                c0siv.LJLI();
            }
        }
        return Unit.LIZ;
    }
}
