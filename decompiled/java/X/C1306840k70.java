package X;

import com.bytedance.android.starship.strategy.repository.StrategiesData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306840k70 extends C09AY implements Function2<StrategiesData, StrategiesData, Unit> {
    public final /* synthetic */ Function1<C1307030k7J, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306840k70(Function1<? super C1307030k7J, Unit> function1) {
        super(2);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(StrategiesData strategiesData, StrategiesData strategiesData2) {
        boolean z;
        StrategiesData strategiesData3 = strategiesData2;
        C1306510k6T.LIZ.getClass();
        C1306510k6T.LIZLLL(strategiesData3);
        Function1<C1307030k7J, Unit> function1 = this.LL;
        if (function1 != null) {
            if (strategiesData3 != null) {
                z = true;
            } else {
                z = false;
            }
            function1.invoke(new C1307030k7J(z, null, 0));
        }
        return Unit.LIZ;
    }
}
