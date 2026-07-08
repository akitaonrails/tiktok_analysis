package X;

import Y.ARunnableS1S2500000_23;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542110qET extends C09AY implements Function1<InterfaceC1540940qCa, Unit> {
    public final /* synthetic */ SparkFragment LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SparkContext LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ FrameLayout LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542110qET(SparkFragment sparkFragment, Context context, SparkContext sparkContext, String str, String str2, FrameLayout frameLayout) {
        super(1);
        this.LL = sparkFragment;
        this.LLILLJJLI = context;
        this.LLILLL = sparkContext;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1540940qCa interfaceC1540940qCa) {
        C086F c086f = C086F.LIZ;
        ARunnableS1S2500000_23 aRunnableS1S2500000_23 = new ARunnableS1S2500000_23(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1540940qCa, 1);
        c086f.getClass();
        C086F.LJII(aRunnableS1S2500000_23);
        return Unit.LIZ;
    }
}
