package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1586900rOi extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1586900rOi(Object obj) {
        super(1, obj, BaseRedDotImpl.class, "onForegroundEvent", "onForegroundEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.receiver.getClass();
        boolean zLJI = MethodIDManager.LJI(71642);
        if (!zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onForeground ");
            sbLIZ.append(zBooleanValue);
            sbLIZ.append(" just return");
            C2188811AlT.LIZIZ(sbLIZ);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C1586680rOM c1586680rOM = C1586680rOM.LIZ;
            EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.HOT_START;
            boolean zLJI2 = MethodIDManager.LJI(137209);
            c1586680rOM.getClass();
            C1586680rOM.LIZJ(enumC1586970rOp, null);
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        return Unit.LIZ;
    }
}
