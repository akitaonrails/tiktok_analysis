package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryFragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C469790IbZ extends C2217421BqW implements Function0<IMixCategoryAbility> {
    public C469790IbZ(GameDrawerCategoryFragment gameDrawerCategoryFragment) {
        super(0, gameDrawerCategoryFragment, GameDrawerCategoryFragment.class, "getMixCategoryAbility", "getMixCategoryAbility()Lcom/bytedance/android/livesdk/game/chatroom/drawer/category/ability/IMixCategoryAbility;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IMixCategoryAbility invoke() {
        Fragment fragment = (Fragment) this.receiver;
        fragment.getClass();
        return C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMixCategoryAbility.class, null);
    }
}
