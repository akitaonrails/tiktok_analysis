package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.GetShopMixVMAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallTabRefreshAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617420sBw extends AbstractC1617430sBx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        GetShopMixVMAbility getShopMixVMAbility;
        ShopMallMixViewModel shopMallMixViewModelTV;
        ShopMallMixFragment shopMallMixFragment;
        MallTabRefreshAbility mallTabRefreshAbilityWR;
        HomeTabAbility homeTabAbilityLIZ;
        Activity activityLIZLLL2;
        C19EG c19eg2;
        GetShopMixVMAbility getShopMixVMAbility2;
        ShopMallMixViewModel shopMallMixViewModelTV2;
        ShopMallMixFragment shopMallMixFragment2;
        MallTabRefreshAbility mallTabRefreshAbilityWR2;
        HomeTabAbility homeTabAbilityLIZ2;
        InterfaceC1617440sBy interfaceC1617440sBy = (InterfaceC1617440sBy) xBaseParamModel;
        String str = "Shop";
        Fragment fragmentKi = null;
        if (C7879035x.LIZLLL()) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL2 = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL2 = null;
            }
            if ((activityLIZLLL2 instanceof C19EG) && (c19eg2 = (C19EG) activityLIZLLL2) != null && (getShopMixVMAbility2 = (GetShopMixVMAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg2, null), GetShopMixVMAbility.class, null)) != null && (shopMallMixViewModelTV2 = getShopMixVMAbility2.tV()) != null) {
                String mallCartCard = interfaceC1617440sBy.getMallCartCard();
                if (mallCartCard != null) {
                    shopMallMixViewModelTV2.yQ2(mallCartCard);
                }
                String topBarContentStyle = interfaceC1617440sBy.getTopBarContentStyle();
                if (topBarContentStyle != null) {
                    shopMallMixViewModelTV2.setState(new AwS74S1000000_24(topBarContentStyle, 10));
                }
                if (C300440Bq6.LIZ() && Intrinsics.LJFF(interfaceC1617440sBy.getHomepageRefreshEnd(), Boolean.TRUE)) {
                    if (!C1767800w6U.LJ()) {
                        str = "SHOP_MALL";
                    }
                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2);
                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                        fragmentKi = homeTabAbilityLIZ2.Ki(str);
                    }
                    if ((fragmentKi instanceof ShopMallMixFragment) && (shopMallMixFragment2 = (ShopMallMixFragment) fragmentKi) != null) {
                        EnumC1599680rjK enumC1599680rjK = EnumC1599680rjK.LYNX;
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("ShopTab TabRefresh tryRefreshFinish");
                        if (C300440Bq6.LIZ() && (mallTabRefreshAbilityWR2 = shopMallMixFragment2.WR()) != null) {
                            mallTabRefreshAbilityWR2.mQ1(enumC1599680rjK);
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                activityLIZLLL = interfaceC634840OvC2.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null && (getShopMixVMAbility = (GetShopMixVMAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), GetShopMixVMAbility.class, null)) != null && (shopMallMixViewModelTV = getShopMixVMAbility.tV()) != null) {
                String mallCartCard2 = interfaceC1617440sBy.getMallCartCard();
                if (mallCartCard2 != null) {
                    shopMallMixViewModelTV.yQ2(mallCartCard2);
                }
                String topBarContentStyle2 = interfaceC1617440sBy.getTopBarContentStyle();
                if (topBarContentStyle2 != null) {
                    shopMallMixViewModelTV.setState(new AwS74S1000000_24(topBarContentStyle2, 10));
                }
                if (C300440Bq6.LIZ() && Intrinsics.LJFF(interfaceC1617440sBy.getHomepageRefreshEnd(), Boolean.TRUE)) {
                    if (!C1767800w6U.LJ()) {
                        str = "SHOP_MALL";
                    }
                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                    if (mainActivityScopeLIZJ2 != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null) {
                        fragmentKi = homeTabAbilityLIZ.Ki(str);
                    }
                    if ((fragmentKi instanceof ShopMallMixFragment) && (shopMallMixFragment = (ShopMallMixFragment) fragmentKi) != null) {
                        EnumC1599680rjK enumC1599680rjK2 = EnumC1599680rjK.LYNX;
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("ShopTab TabRefresh tryRefreshFinish");
                        if (C300440Bq6.LIZ() && (mallTabRefreshAbilityWR = shopMallMixFragment.WR()) != null) {
                            mallTabRefreshAbilityWR.mQ1(enumC1599680rjK2);
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
