package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKO extends C09AY implements Function0<GenrePriorityAbility> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RKO(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(0);
        this.LL = videoAuthorInfoRelationAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final GenrePriorityAbility invoke() {
        if (!this.LL.fq() || C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this.LL))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), GenrePriorityAbility.class, null);
    }
}
