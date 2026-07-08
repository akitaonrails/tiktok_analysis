package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0XiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856230XiP {
    public static final PrivacySettingsRestrictionOption LIZ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, Integer num) {
        List<PrivacySettingsRestrictionOption> list = privacySettingsRestrictionItem.values;
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = null;
        if (list == null) {
            return null;
        }
        Iterator<PrivacySettingsRestrictionOption> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PrivacySettingsRestrictionOption next = it2.next();
            int i = next.value;
            if (num != null && i == num.intValue()) {
                privacySettingsRestrictionOption = next;
                break;
            }
        }
        return privacySettingsRestrictionOption;
    }
}
