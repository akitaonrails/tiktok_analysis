package Y;

import X.C1090970eUp;
import X.C1111970f2h;
import X.C1161920gLG;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS119S0000000_17 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS119S0000000_17(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS119S0000000_17 aObjectS119S0000000_17, Object obj) {
        C1090970eUp c1090970eUp = C1090970eUp.LIZ;
        int iIntValue = ((Integer) obj).intValue();
        c1090970eUp.getClass();
        C1090970eUp.LIZIZ = iIntValue;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS119S0000000_17 aObjectS119S0000000_17, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS119S0000000_17 aObjectS119S0000000_17, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS119S0000000_17 aObjectS119S0000000_17, Object obj) {
        Set<Long> set = C1111970f2h.LIZ;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 2) {
            if (iIntValue == 4) {
                Iterator<User> it2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).M30().iterator();
                while (it2.hasNext()) {
                    C1111970f2h.LIZ.add(Long.valueOf(it2.next().getId()));
                }
            }
        } else {
            C1111970f2h.LIZ.addAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS119S0000000_17 aObjectS119S0000000_17, Object obj) {
        return GiftManager.lambda$_inst$0((Boolean) obj);
    }
}
