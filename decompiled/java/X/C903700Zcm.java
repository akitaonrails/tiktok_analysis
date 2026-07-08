package X;

import com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IMChatPerfLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903700Zcm extends C09AY implements Function1<Boolean, Unit> {
    public C903700Zcm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        if (IMChatPerfLogger.LJIIJ && zBooleanValue) {
            if (IMChatPerfLogger.LJ > 0) {
                IIMChatFunnelAnalytics.LIZ.getClass();
                IIMChatFunnelAnalytics value = C903720Zco.LIZIZ.getValue();
                if (value != null) {
                    value.LIZIZ("end_move_to_background", C0I0B.LJFF.LIZIZ());
                }
            }
            IMChatPerfLogger.LJ = 0L;
        }
        IMChatPerfLogger.LJIIJ = !zBooleanValue;
        IMChatPerfLogger.LJIIJJI = false;
        return Unit.LIZ;
    }
}
