package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592780rYC extends C09AY implements Function0<IMFToolBarAbility> {
    public final /* synthetic */ TabAnimationTransformerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592780rYC(TabAnimationTransformerV2 tabAnimationTransformerV2) {
        super(0);
        this.LL = tabAnimationTransformerV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IMFToolBarAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LLILZ;
        if (interfaceC665370Q7z != null) {
            return C1558520qew.LIZ(interfaceC665370Q7z, IMFToolBarAbility.class, null);
        }
        return null;
    }
}
