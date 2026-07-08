package X;

import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618810sEB extends C09AY implements Function0<IMFToolBarAbility> {
    public final /* synthetic */ C1618830sED LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618810sEB(C1618830sED c1618830sED) {
        super(0);
        this.LL = c1618830sED;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IMFToolBarAbility invoke() {
        C19EG activity;
        AbsFragment absFragment = this.LL.LL;
        if (absFragment == null || (activity = absFragment.getActivity()) == null) {
            return null;
        }
        return C1558520qew.LIZ(C1558360qeg.LJI(activity, null), IMFToolBarAbility.class, null);
    }
}
