package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004310cF3 extends C09AY implements Function2<?, C291001Au<? extends C0R9E>, Unit> {
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004310cF3(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil) {
        super(2);
        this.LL = repostLazyLoadUtil;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, C291001Au<? extends C0R9E> c291001Au) {
        if (c291001Au != null && C296820BkG.LIZ()) {
            InterceptorEventViewModel interceptorEventViewModel = (InterceptorEventViewModel) this.LL.LJFF.getValue();
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil = this.LL;
            interceptorEventViewModel.xQ2(0, repostLazyLoadUtil.LJI);
            interceptorEventViewModel.xQ2(1, repostLazyLoadUtil.LJI);
        }
        return Unit.LIZ;
    }
}
