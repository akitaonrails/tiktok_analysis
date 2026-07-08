package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004180cEq extends C09AY implements Function2<?, C291001Au<? extends C735200Ssg>, Unit> {
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LL;
    public final /* synthetic */ ReusedUIAssem<?> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004180cEq(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil, ReusedUIAssem<?> reusedUIAssem) {
        super(2);
        this.LL = repostLazyLoadUtil;
        this.LLILLJJLI = reusedUIAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, C291001Au<? extends C735200Ssg> c291001Au) {
        C735200Ssg c735200Ssg;
        C291001Au<? extends C735200Ssg> c291001Au2 = c291001Au;
        RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil = this.LL;
        if (!repostLazyLoadUtil.LIZLLL && c291001Au2 != null && (c735200Ssg = (C735200Ssg) c291001Au2.LIZ) != null && c735200Ssg.LIZLLL && Intrinsics.LJFF(c735200Ssg.LIZIZ, repostLazyLoadUtil.LIZIZ().getAid())) {
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil2 = this.LL;
            ReusedUIAssem<?> reusedUIAssem = this.LLILLJJLI;
            if (!repostLazyLoadUtil2.LIZLLL) {
                C723830SaL.LJ(reusedUIAssem, repostLazyLoadUtil2.LIZIZ, true, null);
                repostLazyLoadUtil2.LIZLLL = true;
            }
        }
        return Unit.LIZ;
    }
}
