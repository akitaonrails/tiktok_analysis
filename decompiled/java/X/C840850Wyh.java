package X;

import com.bytedance.pumbaa.utility.utils.CostTimeline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AFwS297S0000000_13;

/* JADX INFO: renamed from: X.0Wyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840850Wyh implements InterfaceC841500Wzk {
    public final C840930Wyp LIZ;
    public final C840930Wyp LIZIZ;
    public final Function1<EnumC841300WzQ, C840930Wyp> LIZJ;
    public final Function0<CostTimeline> LIZLLL;
    public final Function2<CostTimeline, C841020Wyy, Unit> LJ;
    public final Function1<Function0<Unit>, Unit> LJFF;

    public C840850Wyh(int i) {
        AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(276);
        AFwS297S0000000_13 aFwS297S0000000_13 = AFwS297S0000000_13.get$arr$(5);
        AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(49);
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = aFwS200S0000000_13;
        this.LJ = aFwS297S0000000_13;
        this.LJFF = aFwS247S0000000_13;
    }

    @Override // X.InterfaceC841500Wzk
    public final C841060Wz2 LIZ(C841020Wyy c841020Wyy, CostTimeline costTimeline) {
        return LIZJ(EnumC841370WzX.BEFORE_CALL, EnumC841300WzQ.BEFORE_CALL, c841020Wyy, costTimeline);
    }

    @Override // X.InterfaceC841500Wzk
    public final C841060Wz2 LIZIZ(C841020Wyy c841020Wyy, CostTimeline costTimeline) {
        return LIZJ(EnumC841370WzX.AFTER_CALL, EnumC841300WzQ.AFTER_CALL, c841020Wyy, costTimeline);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C841060Wz2 LIZJ(X.EnumC841370WzX r10, X.EnumC841300WzQ r11, X.C841020Wyy r12, com.bytedance.pumbaa.utility.utils.CostTimeline r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C840850Wyh.LIZJ(X.0WzX, X.0WzQ, X.0Wyy, com.bytedance.pumbaa.utility.utils.CostTimeline):X.0Wz2");
    }
}
