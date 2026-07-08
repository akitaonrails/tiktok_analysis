package X;

import com.ss.android.ugc.aweme.outreach.frequency.config.Abilities;
import com.ss.android.ugc.aweme.outreach.frequency.config.ClientLocalStorage;
import com.ss.android.ugc.aweme.outreach.frequency.config.CommonFrequencyAbilityConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.CustomConfig;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20677515vh {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20677315vf());

    public static CustomConfig LIZ(String str) {
        CommonFrequencyAbilityConfig commonFrequencyAbilityConfig;
        List<CustomConfig> list;
        CustomConfig customConfig = null;
        if (str == null || (commonFrequencyAbilityConfig = (CommonFrequencyAbilityConfig) LIZ.getValue()) == null || (list = commonFrequencyAbilityConfig.customConfigs) == null) {
            return null;
        }
        Iterator<CustomConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CustomConfig next = it2.next();
            if (Intrinsics.LJFF(next.outreachType, str)) {
                customConfig = next;
                break;
            }
        }
        return customConfig;
    }

    public static boolean LIZIZ(OutreachInfo outreachInfo) {
        CustomConfig customConfigLIZ;
        Abilities abilities;
        ClientLocalStorage clientLocalStorage;
        List<String> list;
        if (outreachInfo == null || (customConfigLIZ = LIZ(outreachInfo.outreachType)) == null || (abilities = customConfigLIZ.abilities) == null || (clientLocalStorage = abilities.clientLocalStorage) == null || !clientLocalStorage.enable || (list = clientLocalStorage.storageKeys) == null || !C13LP.LJJJJ(outreachInfo.outreachKey, list)) {
            return false;
        }
        return true;
    }
}
