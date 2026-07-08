package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryFragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IGameDrawerStateAbilityV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Iow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C478080Iow extends C2217421BqW implements Function0<InterfaceC471600IeU> {
    public C478080Iow(GameDrawerCategoryFragment gameDrawerCategoryFragment) {
        super(0, gameDrawerCategoryFragment, GameDrawerCategoryFragment.class, "getBottomFeedStateAbility", "getBottomFeedStateAbility()Lcom/bytedance/android/livesdk/comp/api/game/watch/drawer/IGameDrawerBottomFeed;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, X.0IeU] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC471600IeU invoke() {
        Fragment fragment = (Fragment) this.receiver;
        fragment.getClass();
        return C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IGameDrawerStateAbilityV2.class, null);
    }
}
