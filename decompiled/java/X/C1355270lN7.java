package X;

import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0lN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355270lN7 {
    public static final boolean LIZIZ(AbstractC1883407Zg abstractC1883407Zg) {
        if ((abstractC1883407Zg instanceof C1883307Zf) && ((C1883307Zf) abstractC1883407Zg).LIZIZ.contains(EnumC1355300lNA.VOICE_CALL)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZ(BusinessCapabilityService businessCapabilityService, Set<? extends EnumC1355290lN9> set) {
        if (businessCapabilityService == null) {
            return false;
        }
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            EnumC1355300lNA enumC1355300lNALIZLLL = businessCapabilityService.LIZLLL((EnumC1355290lN9) it2.next());
            if (enumC1355300lNALIZLLL != null && enumC1355300lNALIZLLL == EnumC1355300lNA.VOICE_CALL) {
                return true;
            }
        }
        return false;
    }
}
