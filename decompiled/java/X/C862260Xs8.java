package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Xs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C862260Xs8 {
    public static final boolean LIZ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
        List<PrivacySettingsRestrictionOption> list = privacySettingsRestrictionItem.values;
        if (list == null) {
            return false;
        }
        Iterator<PrivacySettingsRestrictionOption> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().showType == 0) {
                return false;
            }
        }
        return true;
    }
}
