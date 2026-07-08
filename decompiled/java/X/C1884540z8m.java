package X;

import android.view.MotionEvent;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884540z8m extends C09AY implements Function1<MotionEvent, Unit> {
    public final /* synthetic */ GameDetailMixPageBaseFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884540z8m(GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment) {
        super(1);
        this.LL = gameDetailMixPageBaseFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        this.LL.WR(motionEvent);
        return Unit.LIZ;
    }
}
