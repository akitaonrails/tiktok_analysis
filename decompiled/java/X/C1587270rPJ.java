package X;

import Y.AObserverS174S0000000_24;
import Y.AObserverS226S0100000_24;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587270rPJ implements InterfaceC1586360rNq {
    public static final C1587270rPJ LL = new C1587270rPJ();

    static {
        C2191201ApK.LIZ();
    }

    public static void LIZ() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerLIZJ = StateOwner.LL.LIZJ();
        if (lifecycleOwnerLIZJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZJ)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1073560e2k(null), 2);
    }

    public static void LJ() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerLIZJ = StateOwner.LL.LIZJ();
        if (lifecycleOwnerLIZJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZJ)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1073550e2j(null), 2);
    }

    public static final IFriendsTabLayoutAbility LJFF() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            return C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
        }
        return null;
    }

    public static final void LJII() {
        PopupInstanceConfig popupInstanceConfig;
        String strLJ;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount() <= 0) {
            return;
        }
        Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki(C1589640rT8.LIZIZ.F2() ? "FRIENDS_FEED" : "FRIENDS_TAB");
        if (fragmentKi == null || !(fragmentKi instanceof InterfaceC20660615sy)) {
            return;
        }
        if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
            INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
            if (iNoticeService != null) {
                iNoticeService.LJJLIIIJILLIZJL(c19egLIZIZ, new C1917290zzb(null, "homepage_friends", null, "enter_homepage_friends", null, null, null, null, "ug_338_friends", 4085));
                return;
            }
            return;
        }
        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("friends_tab");
        unifiedAuthPopupConfigLIZJ.setSceneId("friends_tab_scene");
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19egLIZIZ);
        if (c19egLIZIZ2 != null) {
            IUniAuthGuidePopupApi iUniAuthGuidePopupApi = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpi$default(IUniAuthGuidePopupApi.class, false, false, false, 14, null);
            if (iUniAuthGuidePopupApi == null || (strLJ = iUniAuthGuidePopupApi.LJ(c19egLIZIZ2)) == null) {
                strLJ = "";
            }
            unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
        }
        unifiedAuthPopupConfigLIZJ.setEnterFrom("homepage_friends");
        unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_friends");
        List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
        if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
            popupInstanceConfig.setPopupCombinationType(1);
        }
        ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(c19egLIZIZ, null, unifiedAuthPopupConfigLIZJ);
    }

    public static void LJIIIIZZ() {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        boolean zHv0 = (c19egLIZIZ == null || (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) == null) ? false : iBottomTabLayoutAbilityLJIIIZ.hv0();
        C1587220rPE.LIZ.getClass();
        if (C1587220rPE.LIZLLL() && zHv0) {
            LIZ();
        }
    }

    public final String LIZIZ() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null && iSocial2TabProtocolAbilityLJI.tF0()) {
            return "homepage_friends";
        }
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLJFF = LJFF();
        return !Intrinsics.LJFF(iFriendsTabLayoutAbilityLJFF != null ? iFriendsTabLayoutAbilityLJFF.nk0() : null, "FRIENDS_FEED") ? "" : "homepage_friends";
    }

    public static final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initialize ");
        StateOwner stateOwner = StateOwner.LL;
        C19EG c19egLIZIZ = stateOwner.LIZIZ();
        sbLIZ.append(c19egLIZIZ != null ? c19egLIZIZ.hashCode() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
        if (c19egLIZIZ2 != null) {
            LifecycleOwner lifecycleOwnerLIZJ = stateOwner.LIZJ();
            if (lifecycleOwnerLIZJ == null) {
                lifecycleOwnerLIZJ = c19egLIZIZ2;
            }
            C343710Ddh.LIZ(c19egLIZIZ2).wQ2(LL);
            StateOwner.LLJILJIL.observe(lifecycleOwnerLIZJ, new AObserverS226S0100000_24(c19egLIZIZ2, 14));
            StateOwner.LLJILLL.observe(lifecycleOwnerLIZJ, new AObserverS174S0000000_24(0));
            StateOwner.LLJILJILJ.observe(lifecycleOwnerLIZJ, new AObserverS174S0000000_24(1));
        }
    }

    public static void LIZJ(C19EG c19eg) {
        String str;
        if (C1589640rT8.LIZIZ.F2()) {
            str = "FRIENDS_FEED";
        } else {
            str = "FRIENDS_TAB";
        }
        if (Hox.LLJILJIL.LIZ(c19eg).Ki(str) != null) {
            LJ();
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LIZIZ.storeBoolean("has_shown_permission_dialog", true);
        }
    }

    public static void LJI(C19EG c19eg) {
        int iLIZIZ;
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        if (C614770O9j.LIZIZ.LJ().LJJIIJ(0, c19eg)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(181)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        iAVPublishServicePublishService.moveProgress(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), iLIZIZ + C497820Jfg.LIZJ(c19eg));
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (Intrinsics.LJFF(str, "FRIENDS_TAB")) {
            LJIIIIZZ();
        }
    }
}
