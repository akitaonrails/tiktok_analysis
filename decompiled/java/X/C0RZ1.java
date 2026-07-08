package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZ1 extends C09AY implements Function0<InteractAreaHeightMobAbility> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RZ1(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaHeightMobAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractAreaHeightMobAbility.class, null);
    }
}
