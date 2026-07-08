package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter.RecommendListFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20396614rU extends C09AY implements Function0<C1117360fBO> {
    public final /* synthetic */ RecommendListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20396614rU(RecommendListFragment recommendListFragment) {
        super(0);
        this.LL = recommendListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1117360fBO invoke() {
        C1117360fBO c1117360fBO = new C1117360fBO();
        RecommendListFragment recommendListFragment = this.LL;
        c1117360fBO.LLLI(C20390914qZ.class, new C20398514rn(recommendListFragment.LLILLL, EnumC992490bvz.RECOMMENDATIONS_TYPE, recommendListFragment.LLILZ, 8));
        c1117360fBO.LLLI(C20407814tI.class, new C20402314sP(recommendListFragment.LLILLL, true));
        c1117360fBO.LLLI(C1890550zIT.class, new C1890540zIS(true));
        return c1117360fBO;
    }
}
