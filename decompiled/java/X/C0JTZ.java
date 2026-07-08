package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTZ extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ SubOnlyVideoListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTZ(SubOnlyVideoListFragment subOnlyVideoListFragment) {
        super(1);
        this.LL = subOnlyVideoListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.LL.LLJILJIL = num.intValue();
        return Unit.LIZ;
    }
}
