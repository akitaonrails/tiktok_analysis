package X;

import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTY extends C09AY implements Function1<PunishmentData, Unit> {
    public final /* synthetic */ SubOnlyVideoListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTY(SubOnlyVideoListFragment subOnlyVideoListFragment) {
        super(1);
        this.LL = subOnlyVideoListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PunishmentData punishmentData) {
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.LIZ;
    }
}
