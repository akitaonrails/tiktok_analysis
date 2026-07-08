package com.bytedance.android.live_settings;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LiveSettingManagerSolidifyUtils {
    public static final C01GW disableSolidifyList$delegate;
    public static final C01GW isSolidifyEnable$delegate;
    public static final LiveSettingManagerSolidifyUtils INSTANCE = new LiveSettingManagerSolidifyUtils();
    public static volatile boolean isSolidify = true;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        isSolidifyEnable$delegate = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(61));
        disableSolidifyList$delegate = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(60));
    }

    private final Set<String> getDisableSolidifyList() {
        return (Set) disableSolidifyList$delegate.getValue();
    }

    private final boolean isSolidifyEnable() {
        return ((Boolean) isSolidifyEnable$delegate.getValue()).booleanValue();
    }

    public final boolean isSolidify() {
        return isSolidify;
    }

    public final boolean isSolidifyEnable(String str) {
        if (isSolidifyEnable() && !getDisableSolidifyList().contains(str)) {
            return true;
        }
        return false;
    }

    public final void setSolidify(boolean z) {
        isSolidify = z;
    }
}
