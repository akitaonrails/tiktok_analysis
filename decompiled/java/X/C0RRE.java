package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RRE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRE extends C09AY implements Function0<InteractAreaCommonAbility> {
    public final /* synthetic */ VideoShareAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RRE(VideoShareAssem videoShareAssem) {
        super(0);
        this.LL = videoShareAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaCommonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractAreaCommonAbility.class, null);
    }
}
