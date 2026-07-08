package X;

import android.view.View;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554190qXx extends C09AY implements Function2<InterfaceC1554220qY0, SparkPopup, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554190qXx(View view, float f) {
        super(2);
        this.LL = view;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1554220qY0 interfaceC1554220qY0, SparkPopup sparkPopup) {
        interfaceC1554220qY0.LJIJJLI(sparkPopup, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
