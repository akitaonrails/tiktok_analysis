package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570890qyt extends C09AY implements Function0<InterfaceC1571000qz4> {
    public final /* synthetic */ MFBizIconsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570890qyt(MFBizIconsAssem mFBizIconsAssem) {
        super(0);
        this.LL = mFBizIconsAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0qz4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1571000qz4 invoke() {
        ?? r4;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI;
        List<InterfaceC1570900qyu> second;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI2;
        List<InterfaceC1570900qyu> first;
        HomeTabAbility homeTabAbilityJo = this.LL.Jo();
        if (homeTabAbilityJo == null || (pairPI2 = homeTabAbilityJo.pI()) == null || (first = pairPI2.getFirst()) == null) {
            r4 = 0;
        } else {
            loop0: while (true) {
                r4 = 0;
                for (InterfaceC1570900qyu interfaceC1570900qyu : first) {
                    if (Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.SHOP_CART.getTag())) {
                        if (interfaceC1570900qyu instanceof InterfaceC1571000qz4) {
                            r4 = interfaceC1570900qyu;
                        }
                    }
                }
            }
        }
        HomeTabAbility homeTabAbilityJo2 = this.LL.Jo();
        if (homeTabAbilityJo2 != null && (pairPI = homeTabAbilityJo2.pI()) != null && (second = pairPI.getSecond()) != null) {
            for (InterfaceC1570900qyu interfaceC1570900qyu2 : second) {
                if (Intrinsics.LJFF(interfaceC1570900qyu2.getTag(), EnumC1584350rKb.SHOP_CART.getTag())) {
                    r4 = interfaceC1570900qyu2 instanceof InterfaceC1571000qz4 ? interfaceC1570900qyu2 : 0;
                }
            }
        }
        return r4 == 0 ? IHomePageToolbar.LIZ.LIZLLL((InterfaceC1617760sCU) this.LL.LLJ.getValue()) : r4;
    }
}
