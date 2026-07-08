package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformer;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592010rWx extends C09AY implements Function0<ITabTransformer> {
    public C1592010rWx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility, com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer] */
    @Override // kotlin.jvm.functions.Function0
    public final ITabTransformer invoke() {
        ?? LJIJJ = C1593730rZj.LIZIZ.LJIJJ();
        return (!(LJIJJ instanceof ITabTransformer) || LJIJJ == 0) ? C1581510rG1.LIZLLL() ? new TabAnimationTransformerV2() : new TabAnimationTransformer() : LJIJJ;
    }
}
