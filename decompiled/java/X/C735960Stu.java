package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Stu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735960Stu extends C09AY implements Function0<IVideoCommentAbility> {
    public final /* synthetic */ EdgeSpeedupAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735960Stu(EdgeSpeedupAssem edgeSpeedupAssem) {
        super(0);
        this.LL = edgeSpeedupAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoCommentAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoCommentAbility.class, null);
    }
}
