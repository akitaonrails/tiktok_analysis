package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1082560eHG extends C2217421BqW implements Function1<Integer, Unit> {
    public C1082560eHG(C1082400eH0 c1082400eH0) {
        super(1, c1082400eH0, C1082400eH0.class, "onCoHostComponentsHeightChange", "onCoHostComponentsHeightChange$liveroomfunction_impl_release(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        C1082400eH0 c1082400eH0 = (C1082400eH0) this.receiver;
        c1082400eH0.LLJJJIL = iIntValue;
        float f = C1082470eH7.LIZ;
        if (C1082470eH7.LIZ(c1082400eH0.LL.getDataChannel())) {
            c1082400eH0.LIZJ(true);
        }
        return Unit.LIZ;
    }
}
