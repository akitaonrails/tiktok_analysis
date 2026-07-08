package X;

import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.main.MainRootFragmentBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593600rZW extends C09AY implements Function0<HomePageViewPagerAbility> {
    public final /* synthetic */ MainRootFragmentBase LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593600rZW(MainRootFragmentBase mainRootFragmentBase) {
        super(0);
        this.LL = mainRootFragmentBase;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.base.HomePageViewPagerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HomePageViewPagerAbility invoke() {
        return C297720Bli.LIZ() ? this.LL.kS() : C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), HomePageViewPagerAbility.class, null);
    }
}
