package X;

import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554240qY2 extends C09AY implements Function2<InterfaceC1554220qY0, SparkPopup, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554240qY2(boolean z) {
        super(2);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1554220qY0 interfaceC1554220qY0, SparkPopup sparkPopup) {
        interfaceC1554220qY0.LJJIIJZLJL(sparkPopup, this.LL);
        return Unit.LIZ;
    }
}
