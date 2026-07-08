package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Wh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829920Wh4 extends C09AY implements Function2<Boolean, String, Unit> {
    public C829920Wh4() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        String str2 = str;
        if (bool.booleanValue()) {
            TTMStrategyCenterManagerImpl.LIZ.getClass();
            try {
                TTMStrategyCenterManagerImpl.LIZIZ = str2;
                C0VEF.LIZLLL = 0;
                Iterator<InterfaceC829930Wh5> it2 = TTMStrategyCenterManagerImpl.LJ.values().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(EnumC829940Wh6.TTMStateAccountChanging);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }
}
