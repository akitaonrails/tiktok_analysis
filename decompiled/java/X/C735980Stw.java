package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Stw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735980Stw extends C09AY implements Function0<IVideoShareAbility> {
    public final /* synthetic */ EdgeSpeedupAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735980Stw(EdgeSpeedupAssem edgeSpeedupAssem) {
        super(0);
        this.LL = edgeSpeedupAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoShareAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoShareAbility.class, null);
    }
}
