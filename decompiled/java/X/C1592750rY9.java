package X;

import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592750rY9 extends C09AY implements Function0<InterfaceC1592830rYH> {
    public final /* synthetic */ TabAnimationTransformerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592750rY9(TabAnimationTransformerV2 tabAnimationTransformerV2) {
        super(0);
        this.LL = tabAnimationTransformerV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1592830rYH invoke() {
        BottomTabAbility bottomTabAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LLILZ;
        InterfaceC1592830rYH interfaceC1592830rYHBQ0 = (interfaceC665370Q7z == null || (bottomTabAbility = (BottomTabAbility) C1558520qew.LIZ(interfaceC665370Q7z, BottomTabAbility.class, null)) == null) ? null : bottomTabAbility.BQ0();
        if (interfaceC1592830rYHBQ0 instanceof InterfaceC1592830rYH) {
            return interfaceC1592830rYHBQ0;
        }
        return null;
    }
}
