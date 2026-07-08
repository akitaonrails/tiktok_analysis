package X;

import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0111000_31;

/* JADX INFO: renamed from: X.14lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20359014lQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20359714lX LL;
    public final /* synthetic */ C20360614lg LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20359014lQ(C20359714lX c20359714lX, C20360614lg c20360614lg, int i, boolean z) {
        super(0);
        this.LL = c20359714lX;
        this.LLILLJJLI = c20360614lg;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jIntValue;
        ConditionData conditionDataLIZ;
        List<Condition> list;
        Condition condition;
        Integer num;
        C20359714lX c20359714lX = this.LL;
        C20359414lU c20359414lU = (C20359414lU) ListProtector.get(this.LLILLJJLI.LIZIZ, this.LLILLL);
        C20359414lU c20359414lU2 = (C20359414lU) ListProtector.get(this.LLILLJJLI.LIZIZ, this.LLILLL);
        if (c20359414lU2 == null || (conditionDataLIZ = C20356614l2.LIZ(c20359414lU2.LJ)) == null || conditionDataLIZ.conditions == null || (list = conditionDataLIZ.conditions) == null || list.isEmpty()) {
            jIntValue = 10000;
        } else {
            List<Condition> list2 = conditionDataLIZ.conditions;
            jIntValue = ((list2 == null || (condition = (Condition) ListProtector.get(list2, 0)) == null || (num = condition.duration) == null) ? 10L : num.intValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        c20359714lX.LJ(c20359414lU, null, Long.valueOf(jIntValue), new AwS23S0111000_31(this.LL, this.LLILLL, this.LLILZ, 2));
        return Unit.LIZ;
    }
}
