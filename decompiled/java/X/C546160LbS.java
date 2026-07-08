package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.task.TaskInfoData;

/* JADX INFO: renamed from: X.0LbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {163, 175}, m = "checkTaskPermission")
public final class C546160LbS extends AbstractC23140094w {
    public InterfaceC546090LbL LL;
    public TaskInfoData LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AITaskServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546160LbS(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546160LbS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.checkTaskPermission$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, false, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.checkTaskPermission$1");
        return objLJ;
    }
}
