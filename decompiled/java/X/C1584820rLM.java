package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584820rLM extends AbstractC1587040rOw {
    @Override // X.AbstractC1587040rOw, com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC1586780rOW
    public final void LJIIL(String str, String str2) {
        super.LJIIL(str, str2);
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1400330mXn.LIZ.getClass();
        String strLJIIJ = C1400330mXn.LJIIJ(c19egLIZIZ, str, null);
        c1587170rP9.getClass();
        C1587170rP9.LJFF("FRIENDS_FEED", str2, strLJIIJ);
    }

    @Override // X.AbstractC1587040rOw, X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        int iTw0;
        IAVPublishService iAVPublishServicePublishService;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        super.LLLZLZ(str, str2, z, z2, bundle, str3);
        if (Intrinsics.LJFF(str, "FRIENDS_TAB")) {
            if (str2 != null) {
                C1584830rLN.LIZ = str2;
                C1589640rT8.LIZIZ.I2(str2);
            }
            StateOwner stateOwner = StateOwner.LL;
            C19EG c19egLIZIZ = stateOwner.LIZIZ();
            if (c19egLIZIZ != null && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                iTw0 = iBottomTabLayoutAbilityLJIIIZ.Tw0();
            } else {
                iTw0 = 0;
            }
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            c1589640rT8.a2(iTw0);
            if (str3 == null) {
                str3 = "";
            }
            c1589640rT8.W1(str3, "");
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                iAVPublishServicePublishService.hideProgress(stateOwner.LIZIZ());
            }
        }
    }
}
