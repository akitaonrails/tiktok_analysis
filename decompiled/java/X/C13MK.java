package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS145S1200000_30;

/* JADX INFO: renamed from: X.13MK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MK {
    public static final boolean LIZ(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LIZIZ(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ;
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 10 && !message.LIZ) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(Function0<? extends Object> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZJ(String str, String str2, Function0<Unit> function0) {
        ITakoContextAbility iTakoContextAbilityLIZIZ = C144I.LIZIZ();
        if (iTakoContextAbilityLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13A2 c13a2 = (C13A2) ((TakoContextAbilityImpl) iTakoContextAbilityLIZIZ).LIZ().LIZIZ();
            AwS145S1200000_30 awS145S1200000_30 = new AwS145S1200000_30((Function0) function0, (Function0<Unit>) iTakoContextAbilityLIZIZ, (ITakoContextAbility) strLIZIZ, (String) 1);
            if (!c13a2.LL.contains(strLIZIZ)) {
                awS145S1200000_30.invoke();
                return;
            }
            return;
        }
        function0.invoke();
    }
}
