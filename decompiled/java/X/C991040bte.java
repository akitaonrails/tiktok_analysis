package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991040bte extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BaseBottomTabAvatarAbility LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C991040bte(BaseBottomTabAvatarAbility baseBottomTabAvatarAbility) {
        super(0);
        this.LL = baseBottomTabAvatarAbility;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit unit;
        Lifecycle lifecycle;
        BaseBottomTabAvatarAbility baseBottomTabAvatarAbility = this.LL;
        try {
            LifecycleOwner lifecycleOwnerLIZLLL = baseBottomTabAvatarAbility.LIZLLL();
            if (lifecycleOwnerLIZLLL == null || (lifecycle = lifecycleOwnerLIZLLL.getLifecycle()) == null) {
                unit = null;
            } else {
                lifecycle.addObserver(baseBottomTabAvatarAbility);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
