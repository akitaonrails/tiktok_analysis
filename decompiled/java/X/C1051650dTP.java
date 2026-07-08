package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051650dTP extends C09AY implements Function1<Context, InterfaceC1540940qCa> {
    public final /* synthetic */ SparkContext LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051650dTP(SparkContext sparkContext) {
        super(1);
        this.LL = sparkContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1540940qCa invoke(Context context) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = this.LL;
        c1537900q7g.getClass();
        sparkContext.usePreload = true;
        return new C1541950qED(context, sparkContext).LIZ(false);
    }
}
