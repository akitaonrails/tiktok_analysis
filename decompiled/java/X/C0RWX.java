package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWX extends C09AY implements Function0<C697210RWl> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RWX(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C697210RWl invoke() {
        VideoTagContainer videoTagContainer = this.LL;
        C697210RWl c697210RWl = new C697210RWl(videoTagContainer, new C0RWW(videoTagContainer), new C0RWY(this.LL), this.LL.Fp(), EnumC697700RYi.VIDEO_TAG, (IFcpPolicyAbility) this.LL.LLLFZ.getValue());
        C0RYJ c0ryjLIZ = C697340RWy.LIZ(this.LL);
        if (c0ryjLIZ != null) {
            ((C697180RWi) c0ryjLIZ).LJI(c697210RWl);
        }
        return c697210RWl;
    }
}
