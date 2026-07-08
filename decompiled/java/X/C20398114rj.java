package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoriteSelectFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20398114rj extends C09AY implements Function0<C1117360fBO> {
    public final /* synthetic */ PlaybookFavoriteSelectFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20398114rj(PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment) {
        super(0);
        this.LL = playbookFavoriteSelectFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1117360fBO invoke() {
        C1117360fBO c1117360fBO = new C1117360fBO();
        PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment = this.LL;
        c1117360fBO.LLLI(C20390914qZ.class, new C20398514rn(playbookFavoriteSelectFragment.LLJ, EnumC992490bvz.FAVORITES_TYPE, playbookFavoriteSelectFragment.LL, 8));
        return c1117360fBO;
    }
}
