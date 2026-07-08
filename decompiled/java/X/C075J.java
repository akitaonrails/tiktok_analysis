package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.075J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C075J extends C09AY implements Function0<Integer> {
    public C075J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iIntValue = 1;
        try {
            iIntValue = ((Number) C1827607Du.LIZJ(((C1785306yx) C075F.LIZ.getValue()).LIZ(new C075G()), 1, new C075K())).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(iIntValue);
    }
}
