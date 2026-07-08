package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004660cFc extends C09AY implements Function2<?, C1004640cFa, Unit> {
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004660cFc(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil) {
        super(2);
        this.LL = repostLazyLoadUtil;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, C1004640cFa c1004640cFa) {
        String str;
        String aid;
        C1004640cFa c1004640cFa2 = c1004640cFa;
        String str2 = c1004640cFa2.LIZ;
        if (str2 != null && (str = c1004640cFa2.LIZIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event aid = ");
            sbLIZ.append(str2);
            sbLIZ.append(", current aid = ");
            Aweme awemeLIZIZ = this.LL.LIZIZ();
            String aid2 = null;
            if (awemeLIZIZ != null) {
                aid = awemeLIZIZ.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LL.LIZ()) {
                IInternalShareApi.LIZ.getClass();
                if (!C1370970lmR.LIZ().LIZIZ().LJJII(this.LL.LIZIZ())) {
                    Aweme awemeLIZIZ2 = this.LL.LIZIZ();
                    if (awemeLIZIZ2 != null) {
                        aid2 = awemeLIZIZ2.getAid();
                    }
                    if (Intrinsics.LJFF(str2, aid2)) {
                        this.LL.LJIIIIZZ(str2, str);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
