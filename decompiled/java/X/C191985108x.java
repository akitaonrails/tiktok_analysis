package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.108x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191985108x {
    public static final boolean LIZJ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
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

    public static final C191986108y LIZLLL(PrivacySettingsRestrictionItem privacySettingsRestrictionItem) {
        int i;
        if (privacySettingsRestrictionItem != null) {
            i = privacySettingsRestrictionItem.showType;
        } else {
            i = 0;
        }
        if (i != 1) {
            if (i != 2) {
                return new C191986108y(true, true);
            }
            return new C191986108y(true, false);
        }
        return new C191986108y(false, true);
    }

    public static final C191986108y LJ(PrivacySettingsRestrictionOption privacySettingsRestrictionOption) {
        int i;
        if (privacySettingsRestrictionOption != null) {
            i = privacySettingsRestrictionOption.showType;
        } else {
            i = 0;
        }
        if (i != 1) {
            if (i != 2) {
                return new C191986108y(true, true);
            }
            return new C191986108y(true, false);
        }
        return new C191986108y(false, true);
    }

    public static final void LIZ(PrivacySettingsRestrictionOption privacySettingsRestrictionOption, View view) {
        if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.showType == 1) {
            if (C1207604ny.LIZ() && !TextUtils.isEmpty(privacySettingsRestrictionOption.disabledToast)) {
                String str = privacySettingsRestrictionOption.disabledToast;
                if (str != null) {
                    C191960107y.LIZJ(view, str);
                    return;
                }
                return;
            }
            if (privacySettingsRestrictionOption.resType != 2) {
                return;
            }
            C191960107y.LIZ();
            C191960107y.LIZIZ(2131834393, view);
        }
    }

    public static final boolean LIZIZ(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, View view) {
        if (privacySettingsRestrictionItem.showType != 1) {
            return true;
        }
        if (C1207604ny.LIZ() && !TextUtils.isEmpty(privacySettingsRestrictionItem.disabledToast)) {
            String str = privacySettingsRestrictionItem.disabledToast;
            if (str != null) {
                C191960107y.LIZJ(view, str);
                return false;
            }
            return false;
        }
        if (privacySettingsRestrictionItem.resType != 2) {
            return false;
        }
        C191960107y.LIZ();
        C191960107y.LIZIZ(2131834393, view);
        return false;
    }
}
